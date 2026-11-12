package kotlin;

import g6.m;

/* JADX INFO: loaded from: classes.dex */
public interface h4 {
    boolean a();

    default long b() {
        long j8 = Integer.MIN_VALUE;
        long j14 = (j8 & 4294967295L) | (j8 << 32);
        m.a aVar = m.f76012b;
        return j14;
    }
}
