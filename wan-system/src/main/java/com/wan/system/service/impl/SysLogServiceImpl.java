package com.wan.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wan.system.domain.SysLog;
import com.wan.system.mapper.SysLogMapper;
import com.wan.system.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {
	
	@Autowired
	private SysLogMapper logMapper;
	
	@Override
	public List<SysLog> listLogs(SysLog log) {
		return logMapper.listLogs(log);
	}

	@Override
	public void insertLog(SysLog log) {
		logMapper.insertLog(log);
	}

	@Override
	public void insertErrorLog(Long logId, String errorMessage) {
		logMapper.insertErrorLog(logId, errorMessage);
	}

	@Override
	public SysLog getLog(Long id) {
		return logMapper.getLog(id);
	}

	@Override
	public void deleteExpiredLogs() {
		logMapper.deleteExpiredLogs();
	}
	
}
