package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
final class g extends CancellationToken {
    private final c0<Void> a = new c0<>();

    public final void a() {
        this.a.e(null);
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.a.isComplete();
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final CancellationToken onCanceledRequested(@NonNull OnTokenCanceledListener onTokenCanceledListener) {
        this.a.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new a(this, onTokenCanceledListener));
        return this;
    }
}
