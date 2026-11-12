package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int a;

    public FirebaseRemoteConfigServerException(int i, @NonNull String str) {
        super(str);
        this.a = i;
    }

    public int getHttpStatusCode() {
        return this.a;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, @Nullable Throwable th) {
        super(str, th);
        this.a = i;
    }
}
