package name.guolanren.WeatherData.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Lives {
    private String province;
    private String city;
    private String adcode;
    private String weather;
    private Integer temperature;
    private String winddirection;
    private Integer windpower;
    private Integer humidity;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date reporttime;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(String winddirection) {
        this.winddirection = winddirection;
    }

    public Integer getWindpower() {
        return windpower;
    }

    public void setWindpower(Integer windpower) {
        this.windpower = windpower;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    @Override
    public String toString() {
        return "Lives{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", adcode='" + adcode + '\'' +
                ", weather='" + weather + '\'' +
                ", temperature=" + temperature +
                ", winddirection='" + winddirection + '\'' +
                ", windpower=" + windpower +
                ", humidity=" + humidity +
                ", reporttime=" + reporttime +
                '}';
    }
}
