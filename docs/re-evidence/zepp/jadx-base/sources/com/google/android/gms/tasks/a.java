package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes3.dex */
final class a implements OnSuccessListener<Void> {
    public final /* synthetic */ OnTokenCanceledListener a;

    public a(g gVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.a = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        this.a.onCanceled();
    }
}
