package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class i<TResult, TContinuationResult> implements w<TResult> {
    private final Executor a;
    private final Continuation<TResult, TContinuationResult> b;
    private final c0<TContinuationResult> c;

    public i(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation, @NonNull c0<TContinuationResult> c0Var) {
        this.a = executor;
        this.b = continuation;
        this.c = c0Var;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(@NonNull Task<TResult> task) {
        this.a.execute(new h(this, task));
    }

    @Override // com.google.android.gms.tasks.w
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
