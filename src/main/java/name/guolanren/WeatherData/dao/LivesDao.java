package name.guolanren.WeatherData.dao;

import name.guolanren.WeatherData.pojo.Lives;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivesDao {

    @Insert("insert into lives(province, city, adcode, weather, temperature, winddirection, windpower, humidity, reporttime) " +
        "values(#{province}, #{city}, #{adcode}, #{weather}, #{temperature}, #{winddirection}, #{windpower}, #{humidity}, #{reporttime})")
    public void insert(Lives lives);

    @Select("select * from lives")
    public List<Lives> getAll();

    @Insert("<script> insert into lives(province, city, adcode, weather, temperature, winddirection, windpower, humidity, reporttime) " +
            "values " +
            "<foreach collection=\"list\" item=\"item\" index=\"index\"  separator=\",\"> " +
            "(#{item.province}, #{item.city}, #{item.adcode}, #{item.weather}, #{item.temperature}, #{item.winddirection}, #{item.windpower}, #{item.humidity}, #{item.reporttime}) " +
            "</foreach> </script>")
    public void insertAll(List<Lives> liveses);
}
