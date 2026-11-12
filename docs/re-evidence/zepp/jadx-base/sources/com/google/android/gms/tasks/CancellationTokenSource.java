package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class CancellationTokenSource {
    private final g a = new g();

    public void cancel() {
        this.a.a();
    }

    @NonNull
    public CancellationToken getToken() {
        return this.a;
    }
}
