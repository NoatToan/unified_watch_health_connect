package com.google.android.gms.location;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class n extends p {
    private final o b;

    public n(TaskCompletionSource<Void> taskCompletionSource, o oVar) {
        super(taskCompletionSource);
        this.b = oVar;
    }

    @Override // com.google.android.gms.location.p, com.google.android.gms.internal.location.zzai
    public final void zzc() {
        this.b.zza();
    }
}
