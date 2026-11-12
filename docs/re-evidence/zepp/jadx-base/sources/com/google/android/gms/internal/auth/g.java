package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class g implements ProxyApi.ProxyResult {
    private Status a;
    private ProxyResponse b;

    public g(ProxyResponse proxyResponse) {
        this.b = proxyResponse;
        this.a = Status.RESULT_SUCCESS;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
    public final ProxyResponse getResponse() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.a;
    }

    public g(Status status) {
        this.a = status;
    }
}
