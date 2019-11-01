package cn.kgc.team.house.service.impl;

import cn.kgc.team.house.domain.House;
import cn.kgc.team.house.domain.HouseExample;
import cn.kgc.team.house.mapper.HouseMapper;
import cn.kgc.team.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;
    @Override
    public List<House> getAllHouse() {
        return houseMapper.selectByExample(new HouseExample());
    }

    @Override
    public int delHouseById(String id) {
        return houseMapper.deleteByPrimaryKey(id);
    }
}
