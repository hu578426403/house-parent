package cn.kgc.team.house.service;

import cn.kgc.team.house.domain.House;

import java.util.List;

public interface HouseService {

    /**
     * 得到所有房屋信息
     * @return list集合
     */
    List<House> getAllHouse();

    /**
     * 根据id删除对应的房屋信息
     * @param id 主键id
     * @return 返回受影响的行数
     */
    int delHouseById(String id);
}
