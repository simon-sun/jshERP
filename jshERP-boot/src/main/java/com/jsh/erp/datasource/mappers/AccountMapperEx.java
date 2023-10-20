package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.Account;
import com.jsh.erp.datasource.entities.DepotHead;
import com.jsh.erp.datasource.vo.AccountVo4InOutList;
import com.jsh.erp.datasource.vo.AccountVo4List;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountMapperEx {

    List<Account> getAccountByParam(
            @Param("name") String name,
            @Param("serialNo") String serialNo);

    List<AccountVo4List> selectByConditionAccount(
            @Param("name") String name,
            @Param("serialNo") String serialNo,
            @Param("remark") String remark,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    Long countsByAccount(
            @Param("name") String name,
            @Param("serialNo") String serialNo,
            @Param("remark") String remark);

    BigDecimal getAccountSum(
            @Param("accountId") Long accountId,
            @Param("beginTime") String beginTime,
            @Param("endTime") String endTime,
            @Param("forceFlag") Boolean forceFlag);

    BigDecimal getAccountSumByHead(
            @Param("accountId") Long accountId,
            @Param("beginTime") String beginTime,
            @Param("endTime") String endTime,
            @Param("forceFlag") Boolean forceFlag);

    BigDecimal getAccountSumByDetail(
            @Param("accountId") Long accountId,
            @Param("beginTime") String beginTime,
            @Param("endTime") String endTime,
            @Param("forceFlag") Boolean forceFlag);

    List<DepotHead> getManyAccountSum(
            @Param("accountId") Long accountId,
            @Param("beginTime") String beginTime,
            @Param("endTime") String endTime,
            @Param("forceFlag") Boolean forceFlag);

    List<AccountVo4InOutList> findAccountInOutList(
            @Param("accountId") Long accountId,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    int findAccountInOutListCount(
            @Param("accountId") Long accountId);

    int batchDeleteAccountByIds(@Param("updateTime") Date updateTime, @Param("updater") Long updater, @Param("ids") String ids[]);
}