package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes14.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response(T t7) {
        this.zza = t7;
    }

    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t7) {
        this.zza = t7;
    }

    public Response() {
    }
}
