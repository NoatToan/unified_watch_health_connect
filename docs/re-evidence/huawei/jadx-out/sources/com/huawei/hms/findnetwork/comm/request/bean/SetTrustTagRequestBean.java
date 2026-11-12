package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class SetTrustTagRequestBean extends SnRequestBean {
    private boolean isTrust;

    public void setTrust(boolean z) {
        this.isTrust = z;
    }

    public boolean isTrust() {
        return this.isTrust;
    }

    public SetTrustTagRequestBean(String str, boolean z) {
        this.connectTagSn = str;
        this.isTrust = z;
    }
}
