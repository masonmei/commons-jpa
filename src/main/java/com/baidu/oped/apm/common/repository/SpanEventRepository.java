package com.baidu.oped.apm.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.baidu.oped.apm.common.entity.TraceEvent;

/**
 * Created by mason on 8/23/15.
 */
public interface SpanEventRepository extends JpaRepository<TraceEvent, Long>, QueryDslPredicateExecutor<TraceEvent> {
}
