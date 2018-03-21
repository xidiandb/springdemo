package com.xidiandb.project.service.impl;

import com.xidiandb.project.dao.CityDao;
import com.xidiandb.project.domain.City;
import com.xidiandb.project.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Repository
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
