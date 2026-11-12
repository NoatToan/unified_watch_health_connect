package com.huawei.hms.scankit.p;

import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z7 f16346b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6 f16345a = new p6(o3.m);

    private void a(byte[] bArr, int i) throws a {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f16345a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (a unused) {
            throw a.a();
        }
    }

    public x1 a(s sVar, Map map) throws a {
        v vVar = new v(sVar);
        z7 z7VarA = vVar.a();
        this.f16346b = z7VarA;
        e1[] e1VarArrA = e1.a(vVar.b(), z7VarA);
        int iB = 0;
        for (e1 e1Var : e1VarArrA) {
            iB += e1Var.b();
        }
        byte[] bArr = new byte[iB];
        int length = e1VarArrA.length;
        for (int i = 0; i < length; i++) {
            e1 e1Var2 = e1VarArrA[i];
            byte[] bArrA = e1Var2.a();
            int iB2 = e1Var2.b();
            a(bArrA, iB2);
            for (int i2 = 0; i2 < iB2; i2++) {
                bArr[(i2 * length) + i] = bArrA[i2];
            }
        }
        return p1.a(bArr, map);
    }

    public z7 a() {
        return this.f16346b;
    }
}
