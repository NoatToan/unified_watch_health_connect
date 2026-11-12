package com.huawei.hwcloudmodel.model.unite;

import com.huawei.networkclient.IRequest;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class WifiDeviceAddAuthorizeForSubUserReq implements IRequest {
    private static final String URL_WIFIDEVICEADDAUTHORIZESUBUSER = "/deviceAgent/authorizeSubUser";
    private String devId;
    private String mainHuid;
    private String nickName;
    private String verifyCode;

    public void setDevId(String str) {
        this.devId = str;
    }

    public String getDevId() {
        return this.devId;
    }

    public void setMainHuid(String str) {
        this.mainHuid = str;
    }

    public String getMainHuid() {
        return this.mainHuid;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setVerifyCode(String str) {
        this.verifyCode = str;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public String toString() {
        return "WifiDeviceAddAuthorizeForSubUserReq{devId=" + CommonUtil.n(this.devId) + ", mainHuid=" + CommonUtil.n(this.mainHuid) + ", nickName=" + CommonUtil.n(this.nickName) + ", verifyCode=" + CommonUtil.n(this.verifyCode) + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return URL_WIFIDEVICEADDAUTHORIZESUBUSER;
    }
}
