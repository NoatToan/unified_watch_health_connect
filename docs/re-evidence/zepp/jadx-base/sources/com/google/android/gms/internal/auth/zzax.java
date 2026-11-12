package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzax implements ProxyApi.SpatulaHeaderResult {
    private Status a;
    private String b;

    public zzax(@Nonnull String str) {
        this.b = (String) Preconditions.checkNotNull(str);
        this.a = Status.RESULT_SUCCESS;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult
    @Nullable
    public final String getSpatulaHeader() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.Result
    @Nullable
    public final Status getStatus() {
        return this.a;
    }

    public zzax(@Nonnull Status status) {
        this.a = (Status) Preconditions.checkNotNull(status);
    }
}
