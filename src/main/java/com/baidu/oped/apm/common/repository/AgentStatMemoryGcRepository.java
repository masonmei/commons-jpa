package com.baidu.oped.apm.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baidu.oped.apm.common.entity.AgentStatMemoryGc;

/**
 * Created by mason on 8/23/15.
 */
public interface AgentStatMemoryGcRepository extends JpaRepository<AgentStatMemoryGc, Long> {
}
