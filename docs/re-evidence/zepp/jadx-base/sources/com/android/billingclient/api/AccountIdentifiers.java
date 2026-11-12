package com.android.billingclient.api;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AccountIdentifiers {

    @Nullable
    private final String a;

    @Nullable
    private final String b;

    public AccountIdentifiers(@Nullable String str, @Nullable String str2) {
        this.a = str;
        this.b = str2;
    }

    @Nullable
    public String getObfuscatedAccountId() {
        return this.a;
    }

    @Nullable
    public String getObfuscatedProfileId() {
        return this.b;
    }
}
