package com.example.demo.controller;

import com.example.demo.bean.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "用户信息接口")
@RequestMapping("/userInfo")
public class UserInfoController {



    @PostMapping("/setName")
    @ApiOperation("设置用户名称")
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "name", value = "名称", defaultValue = "Sunny")}
    )
    public String setName(@RequestParam(name = "name", defaultValue = "Sunny") String name) {
        return "Success:" + name;
    }

   /* public List<UserInfo> userList(){

    }*/

}
