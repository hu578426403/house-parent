package cn.kgc.team.house.controller;

import cn.kgc.team.house.domain.House;
import cn.kgc.team.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/page")
public class HouseController {
    @Autowired
    private HouseService houseService;

    /**
     * 获得所有出租房信息
     * @return
     */
    @RequestMapping("/getAllHouse")
    public List<House> getAllHouse(){
        return houseService.getAllHouse();
    }

    /**
     * 根据id删除对应房屋信息
     * @param id 主键id
     * @return 返回json数据 返回1==删除成功 返回0删除失败
     */
    @RequestMapping("/delHouseById")
    public String delHouseById(String id){
        int temp = houseService.delHouseById(id);
        return "{\"result\":"+temp+"}";
    }

}
