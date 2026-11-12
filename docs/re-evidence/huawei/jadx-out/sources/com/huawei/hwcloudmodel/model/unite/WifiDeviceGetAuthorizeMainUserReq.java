package com.huawei.hwcloudmodel.model.unite;

import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes37.dex */
public class WifiDeviceGetAuthorizeMainUserReq {
    private String devId;

    public void setDevId(String str) {
        this.devId = str;
    }

    public String getDevId() {
        return this.devId;
    }

    public String toString() {
        return "WifiDeviceGetAuthorizeMainUserReq{devId=" + CommonUtil.n(this.devId) + '}';
    }
}
