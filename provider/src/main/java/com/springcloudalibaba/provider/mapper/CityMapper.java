package com.springcloudalibaba.provider.mapper;

import com.springcloudalibaba.provider.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CityMapper {
    City selectById(Long id);
}
