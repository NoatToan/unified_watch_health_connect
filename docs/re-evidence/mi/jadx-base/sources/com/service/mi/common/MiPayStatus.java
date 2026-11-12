package com.service.mi.common;

import com.chinaums.pppay.unify.UnifyPayListener;

/* JADX INFO: loaded from: classes6.dex */
public enum MiPayStatus {
    STATUS_OK(UnifyPayListener.ERR_OK, "Success"),
    STATUS_REQUEST_FAILURE("9000", "网络请求失败"),
    STATUS_DATA_PARSE_FAILURE("9001", "数据解析失败"),
    STATUS_APDU_ERROR("9002", "指令执行失败"),
    STATUS_UNINITIALIZED("9003", "SDK未初始化"),
    STATUS_BIZ_ERROR("9004", "业务异常"),
    STATUS_PARAMS_IS_NULL("9005", "参数校验失败"),
    STATUS_TASK_ID_IS_NULL("9006", "预发卡任务未执行，TASD ID为空"),
    STATUS_UNKNOWN_BUSINESS(UnifyPayListener.ERR_COMM, "未知业务"),
    APDU_TYPE_UNKNOWN("9998", "apduType未知");

    private String msg;
    private String status;

    MiPayStatus(String str, String str2) {
        this.status = str;
        this.msg = str2;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getStatus() {
        return this.status;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
