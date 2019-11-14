package com.pbteach.mp.mapper;

import com.pbteach.mp.pojo.User;

public interface UserMapper extends MyBaseMapper<User> {

    User findById(Long id);



}
