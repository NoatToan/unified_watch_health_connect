package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
final class p7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f16267c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n7 f16268a = new n7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o7 f16269b = new o7();

    p7() {
    }

    s6 a(int i, r rVar, int i2) throws a {
        int[] iArrA = q7.a(rVar, i2, false, f16267c);
        try {
            return this.f16269b.a(i, rVar, iArrA);
        } catch (a unused) {
            return this.f16268a.a(i, rVar, iArrA);
        }
    }
}
