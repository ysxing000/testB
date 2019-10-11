package com.yang.mapper;

import com.yang.entity.Student;

import java.util.List;

public interface StudentMapper {

    public List<Student> getlist();

    public List<Student> gettime(Integer status);

    public int updateStatus(String sno);



}
