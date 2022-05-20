package com.example.dao;

import java.util.List;

import com.narangnorang.service.DeptService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.DeptDTO;

@Repository
public class DeptDAO {

	
	@Autowired
	SqlSession session;
	@Autowired
	DeptService dao;
	
	public List<DeptDTO> selectAll() {
		return session.selectList("com.config.DeptMapper.selectAll");
	}
}
