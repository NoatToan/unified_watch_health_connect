package com.huawei.hwcloudmodel.model.unite;

import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class AuthorizeSubUserInfo {
    private String nickname;
    private String subHuid;
    private String userAccount;

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

    public void setUserAccount(String str) {
        this.userAccount = str;
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public String toString() {
        return "AuthorizeSubUserInfo{subHuid='" + this.subHuid + "', nickName='" + CommonUtil.n(this.nickname) + "', userAccount='" + this.userAccount + "'}";
    }
}
