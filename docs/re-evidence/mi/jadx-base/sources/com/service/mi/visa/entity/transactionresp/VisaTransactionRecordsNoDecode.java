package com.service.mi.visa.entity.transactionresp;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class VisaTransactionRecordsNoDecode {
    private List<String> encTransactionInfoList;
    private String msg;
    private String resultCode;
    private String transactionScope;

    public VisaTransactionRecordsNoDecode(String str, String str2) {
        this.resultCode = str;
        this.msg = str2;
    }

    public List<String> getEncTransactionInfoList() {
        return this.encTransactionInfoList;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getTransactionScope() {
        return this.transactionScope;
    }

    public void setEncTransactionInfoList(List<String> list) {
        this.encTransactionInfoList = list;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setTransactionScope(String str) {
        this.transactionScope = str;
    }
}
