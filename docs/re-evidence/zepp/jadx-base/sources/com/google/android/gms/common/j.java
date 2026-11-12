package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
abstract class j extends h {
    private static final WeakReference<byte[]> c = new WeakReference<>(null);
    private WeakReference<byte[]> b;

    public j(byte[] bArr) {
        super(bArr);
        this.b = c;
    }

    @Override // com.google.android.gms.common.h
    public final byte[] e() {
        byte[] bArrF;
        synchronized (this) {
            bArrF = this.b.get();
            if (bArrF == null) {
                bArrF = f();
                this.b = new WeakReference<>(bArrF);
            }
        }
        return bArrF;
    }

    public abstract byte[] f();
}
