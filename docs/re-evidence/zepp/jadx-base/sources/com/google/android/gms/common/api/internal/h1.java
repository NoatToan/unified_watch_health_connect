package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class h1 {
    private final ApiKey<?> a;
    private final TaskCompletionSource<Boolean> b = new TaskCompletionSource<>();

    public h1(ApiKey<?> apiKey) {
        this.a = apiKey;
    }

    public final ApiKey<?> a() {
        return this.a;
    }

    public final TaskCompletionSource<Boolean> b() {
        return this.b;
    }
}
