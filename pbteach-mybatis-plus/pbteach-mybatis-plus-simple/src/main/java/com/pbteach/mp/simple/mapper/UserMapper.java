package com.pbteach.mp.simple.mapper;

import com.pbteach.mp.simple.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> findAll();

    User findById(Long id);

}
