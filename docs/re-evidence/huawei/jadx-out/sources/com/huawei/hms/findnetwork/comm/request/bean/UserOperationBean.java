package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class UserOperationBean extends BaseRequestBean {
    private String data;
    private int operationCode;

    public void setOperationCode(int i) {
        this.operationCode = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public int getOperationCode() {
        return this.operationCode;
    }

    public String getData() {
        return this.data;
    }

    public UserOperationBean(int i, String str) {
        this.operationCode = i;
        this.data = str;
    }
}
