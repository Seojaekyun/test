package kr.co.jk.controller;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jk.dto.RoomDto;
import kr.co.jk.mapper.DefaultMapper;

@RestController // @ResponseBody + @Controller  => 값만 리턴해주는 매핑메소드
public class DefaultController {
    // 비동기방식으로 작업하기
	@Autowired
	private  SqlSession sqlSession;
	
	@RequestMapping("/virtual/getRooms")
	public ArrayList<RoomDto> getRooms() {
		DefaultMapper ddao=sqlSession.getMapper(DefaultMapper.class);
		ArrayList<RoomDto> rlist=ddao.getRooms();
		
		return rlist;
	}
}