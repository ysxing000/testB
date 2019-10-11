package com.yang.serviceImpl;

import com.yang.entity.Student;
import com.yang.mapper.StudentMapper;
import com.yang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService(serviceName="studentService",//对外发布的服务名
        targetNamespace="http://service.yang.com",//指定你想要的名称空间，通常使用使用包名反转
        endpointInterface="com.yang.service.StudentService")//服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getlist() {
        List<Student> getlist = studentMapper.getlist();
        return getlist;
    }
    @Override
    public List<Student> gettime(Integer status) {
        List<Student> gettime = studentMapper.gettime(status);
        return gettime;
    }

    @Override
    public List<Student> updateStatus(List<Student> list) {

        for (Student s:list
             ) {
            Date date=new Date();
            long time = date.getTime();
            if(time%2==0){
                studentMapper.updateStatus(s.getSno());
            }
        }


        return null;
    }
}
