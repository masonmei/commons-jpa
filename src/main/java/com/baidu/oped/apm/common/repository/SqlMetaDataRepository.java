package com.baidu.oped.apm.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.baidu.oped.apm.common.entity.SqlMetaData;

/**
 * Created by mason on 8/23/15.
 */
public interface SqlMetaDataRepository extends JpaRepository<SqlMetaData, Long>,
                                                       QueryDslPredicateExecutor<SqlMetaData> {
}
