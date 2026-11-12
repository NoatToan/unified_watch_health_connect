package com.loc;

import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class bv extends bs {
    private static bv b = new bv();

    private bv() {
        super(5120);
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    public static bv b() {
        return b;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, List<? extends bz> list) {
        if (list == null) {
            return null;
        }
        try {
            int size = list.size();
            if (size <= 0 || bArr == null) {
                return null;
            }
            a();
            int iA = cc.a((eq) this.a, bArr);
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                bz bzVar = list.get(i);
                iArr[i] = ch.a(this.a, (byte) bzVar.a(), ch.a(this.a, bzVar.b()));
            }
            this.a.c(cc.a(this.a, iA, bArr2 != null ? cc.b(this.a, bArr2) : 0, cc.a(this.a, iArr)));
            return this.a.c();
        } catch (Throwable th) {
            df.a(th);
            return null;
        }
    }

    public final byte[] c() {
        super.a();
        try {
            this.a.c(de.a(this.a, dd.a(), this.a.a(dd.f()), this.a.a(dd.c()), (byte) dd.m(), this.a.a(dd.i()), this.a.a(dd.h()), this.a.a(a(dd.g())), this.a.a(a(dd.j())), dc.a(dd.n()), this.a.a(dd.l()), this.a.a(dd.k()), this.a.a(dd.d()), this.a.a(dd.e())));
            return this.a.c();
        } catch (Exception e) {
            df.a(e);
            return null;
        }
    }
}
