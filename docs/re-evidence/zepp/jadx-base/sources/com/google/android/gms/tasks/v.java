package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class v<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, w {
    private final Executor a;
    private final SuccessContinuation<TResult, TContinuationResult> b;
    private final c0<TContinuationResult> c;

    public v(@NonNull Executor executor, @NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation, @NonNull c0<TContinuationResult> c0Var) {
        this.a = executor;
        this.b = successContinuation;
        this.c = c0Var;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(@NonNull Task<TResult> task) {
        this.a.execute(new u(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.c.c();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        this.c.a(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.b(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.w
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
