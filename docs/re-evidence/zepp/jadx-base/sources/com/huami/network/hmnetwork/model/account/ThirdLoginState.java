package com.huami.network.hmnetwork.model.account;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdLoginState {
    public static final int BIND_INVALID = -1;
    public static final int BIND_VALID = 1;
    public static final int UNBIND = 0;
    public String accessToken;
    public String appId;
    public int bindState;
    public long expiresIn;
    public String expiresTime;
    public String nickName;
    public String refreshToken;
    public String uid;

    public ThirdLoginState(String str, String str2) {
        this.uid = "";
        this.accessToken = "";
        this.expiresTime = "";
        this.refreshToken = "";
        this.nickName = "";
        this.appId = "";
        this.bindState = 0;
        this.uid = str;
        this.accessToken = str2;
    }

    public boolean isSessionValid() {
        if ("".equals(this.uid) || "".equals(this.accessToken)) {
            return false;
        }
        try {
            return this.expiresIn > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String toString() {
        return "ThirdLoginState [uid=" + this.uid + ", accessToken=" + this.accessToken + ", expiresTime=" + this.expiresTime + ", refreshToken=" + this.refreshToken + ", expiresIn=" + this.expiresIn + ", nickName=" + this.nickName + ", bindState=" + this.bindState + "]";
    }

    public ThirdLoginState() {
        this.uid = "";
        this.accessToken = "";
        this.expiresTime = "";
        this.refreshToken = "";
        this.nickName = "";
        this.appId = "";
        this.bindState = 0;
    }
}
