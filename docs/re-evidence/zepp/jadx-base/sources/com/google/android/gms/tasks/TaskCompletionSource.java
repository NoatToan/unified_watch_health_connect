package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class TaskCompletionSource<TResult> {
    private final c0<TResult> a = new c0<>();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new y(this));
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.a;
    }

    public void setException(@NonNull Exception exc) {
        this.a.a(exc);
    }

    public void setResult(@Nullable TResult tresult) {
        this.a.b(tresult);
    }

    public boolean trySetException(@NonNull Exception exc) {
        return this.a.d(exc);
    }

    public boolean trySetResult(@Nullable TResult tresult) {
        return this.a.e(tresult);
    }
}
