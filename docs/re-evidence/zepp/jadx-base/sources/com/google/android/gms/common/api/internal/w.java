package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
final class w implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ GoogleApiManager.zaa b;

    public w(GoogleApiManager.zaa zaaVar, int i) {
        this.b = zaaVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c(this.a);
    }
}
