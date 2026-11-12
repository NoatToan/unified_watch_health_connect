package com.xiaomi.ai.android.capability;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AuthCapability implements Capability {

    public static class AuthorizationTokens {
        public String accessToken;
        public long expireIn;
        public String refreshToken;
    }

    public String getOaid() {
        throw new IllegalStateException("getOaid not Override");
    }

    public AuthorizationTokens onGetAuthorizationTokens() {
        throw new IllegalStateException("onGetAuthorizationTokens not Override");
    }

    public String onGetOAuthCode() {
        throw new IllegalStateException("onGetOAuthCode not Override");
    }

    public String onGetToken(int i, boolean z) {
        throw new IllegalStateException("onGetToken not Override");
    }
}
