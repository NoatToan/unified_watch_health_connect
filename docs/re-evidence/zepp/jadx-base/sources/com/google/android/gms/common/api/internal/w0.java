package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
final class w0 implements v0 {
    private final /* synthetic */ zaco a;

    public w0(zaco zacoVar) {
        this.a = zacoVar;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void a(BasePendingResult<?> basePendingResult) {
        this.a.a.remove(basePendingResult);
    }
}
