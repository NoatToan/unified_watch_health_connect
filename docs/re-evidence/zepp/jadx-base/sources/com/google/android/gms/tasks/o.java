package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
final class o<TResult> implements w<TResult> {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    @Nullable
    private OnCompleteListener<TResult> c;

    public o(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.a = executor;
        this.c = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.w
    public final void a(@NonNull Task<TResult> task) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new n(this, task));
        }
    }

    @Override // com.google.android.gms.tasks.w
    public final void zzc() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
