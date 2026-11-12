package com.mibi.sdk.common.account;

/* JADX INFO: loaded from: classes5.dex */
public final class AccountToken {
    private final IServiceTokenResult mServiceTokenResult;

    public AccountToken(IServiceTokenResult iServiceTokenResult) {
        this.mServiceTokenResult = iServiceTokenResult;
    }

    public String getSecurity() {
        return this.mServiceTokenResult.getSecurity();
    }

    public String getServiceToken() {
        return this.mServiceTokenResult.getServiceToken();
    }

    public IServiceTokenResult getServiceTokenResult() {
        return this.mServiceTokenResult;
    }

    public String getUserId() {
        return this.mServiceTokenResult.getUserId();
    }
}
