package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
final class q<TResult> implements w<TResult> {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    @Nullable
    private OnFailureListener c;

    public q(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.a = executor;
        this.c = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(@NonNull Task<TResult> task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new p(this, task));
        }
    }

    @Override // com.google.android.gms.tasks.w
    public final void zzc() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
