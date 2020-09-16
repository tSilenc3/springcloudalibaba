package com.springcloudalibaba.provider.controller;

import com.springcloudalibaba.provider.mapper.CityMapper;
import com.springcloudalibaba.provider.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/city", "/City"})
public class CityController {

    private CityMapper cityMapper;

    @Autowired
    public CityController(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @RequestMapping("/{id}")
    public City findById(@PathVariable String id) {
        return cityMapper.selectById(Long.valueOf(id));
    }
}
