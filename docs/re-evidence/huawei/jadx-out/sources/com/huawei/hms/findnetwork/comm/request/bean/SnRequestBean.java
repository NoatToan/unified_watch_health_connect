package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes10.dex */
public class SnRequestBean extends BaseRequestBean {
    private String additional;
    protected String connectTagSn;

    public void setConnectTagSn(String str) {
        this.connectTagSn = str;
    }

    public void setAdditional(String str) {
        this.additional = str;
    }

    public String getConnectTagSn() {
        return this.connectTagSn;
    }

    public String getAdditional() {
        return this.additional;
    }
}
