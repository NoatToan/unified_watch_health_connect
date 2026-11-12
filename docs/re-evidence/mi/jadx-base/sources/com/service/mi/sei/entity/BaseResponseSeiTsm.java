package com.service.mi.sei.entity;

import com.google.gson.annotations.SerializedName;
import com.service.mi.common.MiPayStatus;
import com.service.mi.entity.SpError;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BaseResponseSeiTsm {
    private String apduType;

    @SerializedName("desc")
    private String msg;
    private String requestId = "";

    @SerializedName("status")
    private String resultCode;
    private List<SpError> spErrors;

    public BaseResponseSeiTsm() {
    }

    public String getApduType() {
        return this.apduType;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public List<SpError> getSpErrors() {
        return this.spErrors;
    }

    public boolean isStatusOK() {
        return this.resultCode.equalsIgnoreCase(MiPayStatus.STATUS_OK.getStatus());
    }

    public void setApduType(String str) {
        this.apduType = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setSpErrors(List<SpError> list) {
        this.spErrors = list;
    }

    public BaseResponseSeiTsm(String str, String str2) {
        this.resultCode = str;
        this.msg = str2;
    }
}
