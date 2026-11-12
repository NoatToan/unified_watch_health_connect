package com.xiaomi.hm.health.bt.profile.auth;

import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;

/* JADX INFO: loaded from: classes11.dex */
public class AuthInfo {
    private UserInfo a;
    private String b;
    private int c;
    private boolean d;
    private boolean e;
    private byte f;

    public AuthInfo(boolean needAuth) {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = false;
        this.e = true;
        this.f = HMBleConfig.APP_ID;
        this.e = needAuth;
    }

    public byte getAppId() {
        return this.f;
    }

    public int getAuthVersion() {
        return this.c;
    }

    public String getKey() {
        return this.b;
    }

    public UserInfo getUserInfo() {
        return this.a;
    }

    public boolean isPair() {
        return this.d;
    }

    public boolean needAuth() {
        return this.e;
    }

    public void setAuthVersion(int authVersion) {
        this.c = authVersion;
    }

    public void setKey(String key) {
        this.b = key;
    }

    public void setPair(boolean pair) {
        this.d = pair;
    }

    public void setUserInfo(UserInfo info) {
        this.a = info;
    }

    public String toString() {
        return "AuthInfo{mUserInfo=" + this.a + ", mKey='" + this.b + "', mIsPair=" + this.d + ", mNeedAuth=" + this.e + '}';
    }

    public AuthInfo(UserInfo info) {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = false;
        this.e = true;
        this.f = HMBleConfig.APP_ID;
        this.a = info;
    }

    public AuthInfo(String key, boolean isPair) {
        this(key, isPair, HMBleConfig.APP_ID);
    }

    public AuthInfo(String key, boolean isPair, byte appId) {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = false;
        this.e = true;
        this.f = HMBleConfig.APP_ID;
        this.b = key;
        this.d = isPair;
        this.f = appId;
    }
}
