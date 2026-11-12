package com.twitter.sdk.android.core;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AuthToken {

    @SerializedName("created_at")
    public final long createdAt;

    public AuthToken() {
        this(System.currentTimeMillis());
    }

    public abstract boolean isExpired();

    public AuthToken(long j) {
        this.createdAt = j;
    }
}
