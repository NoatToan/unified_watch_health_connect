package com.amap.api.col.p0003sl;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mh extends me {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mh f3191b = new mh();

    public static mh b() {
        return f3191b;
    }

    private mh() {
        super(5120);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, List<? extends ml> list) {
        if (list == null) {
            return null;
        }
        try {
            int size = list.size();
            if (size > 0 && bArr != null) {
                a();
                int iA = mo.a((nz) this.f3189a, bArr);
                int[] iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    ml mlVar = list.get(i);
                    iArr[i] = mt.a(this.f3189a, (byte) mlVar.a(), mt.a(this.f3189a, mlVar.b()));
                }
                this.f3189a.c(mo.a(this.f3189a, iA, bArr2 != null ? mo.b(this.f3189a, bArr2) : 0, mo.a(this.f3189a, iArr)));
                return this.f3189a.c();
            }
        } catch (Throwable th) {
            ns.a(th);
        }
        return null;
    }

    public final byte[] c() {
        super.a();
        try {
            this.f3189a.c(nr.a(this.f3189a, nq.a(), this.f3189a.a(nq.f()), this.f3189a.a(nq.c()), (byte) nq.m(), this.f3189a.a(nq.i()), this.f3189a.a(nq.h()), this.f3189a.a(a(nq.g())), this.f3189a.a(a(nq.j())), np.a(nq.n()), this.f3189a.a(nq.l()), this.f3189a.a(nq.k()), this.f3189a.a(nq.d()), this.f3189a.a(nq.e())));
            return this.f3189a.c();
        } catch (Exception e) {
            ns.a(e);
            return null;
        }
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }
}
