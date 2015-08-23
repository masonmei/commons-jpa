package com.baidu.oped.apm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.oped.apm.common.entity.AgentInfo;
import com.baidu.oped.apm.common.repository.AgentInfoRepository;

/**
 * Created by mason on 8/23/15.
 */
@RestController
public class AgentInfoController {
    @Autowired
    private AgentInfoRepository agentInfoRepository;

    @RequestMapping("/")
    public void test(){
        AgentInfo agentInfo = new AgentInfo();
        agentInfoRepository.save(agentInfo);
    }

}
