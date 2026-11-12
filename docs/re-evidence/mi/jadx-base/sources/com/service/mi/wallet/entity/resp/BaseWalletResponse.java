package com.service.mi.wallet.entity.resp;

import com.google.gson.annotations.SerializedName;
import com.service.mi.common.MiPayStatus;
import com.service.mi.entity.SpError;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BaseWalletResponse {
    private Object ext;

    @SerializedName("desc")
    protected String msg;
    private String requestId = "";

    @SerializedName("status")
    protected String resultCode;
    private List<SpError> spErrors;

    public BaseWalletResponse(String str, String str2) {
        this.resultCode = str;
        this.msg = str2;
    }

    public Object getExt() {
        return this.ext;
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

    public boolean isStatusOk() {
        return this.resultCode.equalsIgnoreCase(MiPayStatus.STATUS_OK.getStatus());
    }

    public void setExt(Object obj) {
        this.ext = obj;
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

    public BaseWalletResponse(String str, String str2, List<SpError> list) {
        this.resultCode = str;
        this.msg = str2;
        this.spErrors = list;
    }

    public BaseWalletResponse() {
    }
}
