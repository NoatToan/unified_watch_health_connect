package com.xiaomi.accountsdk.account.data;

/* JADX INFO: loaded from: classes6.dex */
public abstract class OneStepLoginAccount {
    public abstract String getAccountAvatarUrl();

    public abstract int getDefaultAvatarResId();

    public abstract String getDigitalAddress();

    public abstract String getUserName();

    public abstract void performLogin();
}
