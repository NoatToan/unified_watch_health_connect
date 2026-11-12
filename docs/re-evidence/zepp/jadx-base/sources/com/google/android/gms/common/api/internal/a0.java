package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
final class a0 implements Runnable {
    private final /* synthetic */ y a;

    public a0(y yVar) {
        this.a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.b.disconnect(this.a.a.b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
