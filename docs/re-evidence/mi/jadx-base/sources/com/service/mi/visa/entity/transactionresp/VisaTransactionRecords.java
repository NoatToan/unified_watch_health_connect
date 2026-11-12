package com.service.mi.visa.entity.transactionresp;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class VisaTransactionRecords {
    private List<EncTransactionInfo> encTransactionInfoList;
    private String msg;
    private String resultCode;
    private String transactionScope;

    public VisaTransactionRecords(String str, String str2, List<EncTransactionInfo> list) {
        this.resultCode = str;
        this.msg = str2;
        this.encTransactionInfoList = list;
    }

    public List<EncTransactionInfo> getEncTransactionInfoList() {
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

    public void setEncTransactionInfoList(List<EncTransactionInfo> list) {
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
