package com.huawei.hwcloudmodel.model.unite;

import com.huawei.networkclient.IRequest;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class WifiDeviceExitAuthorizeSubUserReq implements IRequest {
    private static final String URL_WIFIDEVICEEXITAUTHORIZESUBUSER = "/deviceAgent/subUserExitAuthorize";
    private String devId;

    public void setDevId(String str) {
        this.devId = str;
    }

    public String getDevId() {
        return this.devId;
    }

    public String toString() {
        return "WifiDeviceDeleteAuthorizeSubUserReq{devId=" + CommonUtil.n(this.devId) + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return URL_WIFIDEVICEEXITAUTHORIZESUBUSER;
    }
}
