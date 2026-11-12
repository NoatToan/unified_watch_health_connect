package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract class s {
    private final zaaw a;

    public s(zaaw zaawVar) {
        this.a = zaawVar;
    }

    public abstract void a();

    public final void b(zaaz zaazVar) {
        zaazVar.a.lock();
        try {
            if (zaazVar.k != this.a) {
                return;
            }
            a();
        } finally {
            zaazVar.a.unlock();
        }
    }
}
