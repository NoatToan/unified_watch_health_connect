package com.google.firebase.perf.config;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
abstract class ConfigurationFlag<T> {
    public abstract T getDefault();

    @Nullable
    public String getDeviceCacheFlag() {
        return null;
    }

    @Nullable
    public String getMetadataFlag() {
        return null;
    }

    @Nullable
    public String getRemoteConfigFlag() {
        return null;
    }
}
