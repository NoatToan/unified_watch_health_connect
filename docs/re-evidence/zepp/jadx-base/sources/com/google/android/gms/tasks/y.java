package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes3.dex */
final class y implements OnTokenCanceledListener {
    public final /* synthetic */ TaskCompletionSource a;

    public y(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        this.a.a.c();
    }
}
