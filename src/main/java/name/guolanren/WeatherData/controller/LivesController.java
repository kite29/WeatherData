package name.guolanren.WeatherData.controller;

import name.guolanren.WeatherData.dao.LivesDao;
import name.guolanren.WeatherData.pojo.Lives;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather/data")
public class LivesController {

    @Autowired
    private LivesDao livesDao;

//    @PostMapping(value = "/lives", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public void save(@RequestBody Lives lives) {
//        livesDao.insert(lives);
//    }

    @GetMapping("/lives")
    public List<Lives> getAll() {
        return livesDao.getAll();
    }

    public void setLivesDao(LivesDao livesDao) {
        this.livesDao = livesDao;
    }
}
