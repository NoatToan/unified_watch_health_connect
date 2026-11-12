package com.huawei.hwcloudmodel.model.unite;

import com.huawei.networkclient.IRequest;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class WifiDeviceUpdateAuthorizeSubUserReq implements IRequest {
    private static final String URL_WIFIDEVICEUPDATEAUTHORIZESUBUSER = "/deviceAgent/updateAuthorizationSubUser";
    private String devId;
    private String nickname;
    private String subHuid;

    public void setDevId(String str) {
        this.devId = str;
    }

    public String getDevId() {
        return this.devId;
    }

    public void setSubHuid(String str) {
        this.subHuid = str;
    }

    public String getSubHuid() {
        return this.subHuid;
    }

    public void setNickName(String str) {
        this.nickname = str;
    }

    public String getNickName() {
        return this.nickname;
    }

    public String toString() {
        return "WifiDeviceUpdateAuthorizeSubUserReq{devId=" + CommonUtil.n(this.devId) + ", subHuid=" + CommonUtil.n(this.subHuid) + ", nickName=" + CommonUtil.n(this.nickname) + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return URL_WIFIDEVICEUPDATEAUTHORIZESUBUSER;
    }
}
