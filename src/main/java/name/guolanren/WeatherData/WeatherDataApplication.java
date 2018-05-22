package name.guolanren.WeatherData;

import name.guolanren.WeatherData.data.DataAPI;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;


@SpringBootApplication
@MapperScan("name.guolanren.WeatherData.dao")
public class WeatherDataApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		DataAPI dataAPI = (DataAPI) SpringApplication.run(WeatherDataApplication.class, args).getBean("dataAPI");

		dataAPI.dataIn();
//		dataAPI.dataOut();

        System.exit(0);
    }

}
