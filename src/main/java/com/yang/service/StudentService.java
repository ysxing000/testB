package com.yang.service;

import com.yang.entity.Student;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface StudentService {

    public List<Student> getlist();

    public List<Student> gettime(Integer status);

    public List<Student> updateStatus(List<Student> list);




}
