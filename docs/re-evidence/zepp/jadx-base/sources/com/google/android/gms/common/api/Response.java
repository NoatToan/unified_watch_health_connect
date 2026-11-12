package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes3.dex */
public class Response<T extends Result> {
    private T a;

    public Response() {
    }

    public Response(@NonNull T t) {
        this.a = t;
    }

    @NonNull
    public T getResult() {
        return this.a;
    }

    public void setResult(@NonNull T t) {
        this.a = t;
    }
}
