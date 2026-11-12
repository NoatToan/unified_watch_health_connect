package com.huawei.hms.scankit.p;

import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6 f16367a = new p6(o3.l);

    private void a(byte[] bArr, int i) throws a {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f16367a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (a unused) {
            throw a.a();
        }
    }

    public x1 a(s sVar, Map map) throws a {
        t tVar = new t(sVar);
        try {
            try {
                return a(tVar, map);
            } catch (a unused) {
                throw a.a();
            }
        } catch (a unused2) {
            tVar.e();
            tVar.a(true);
            tVar.d();
            tVar.c();
            tVar.a();
            x1 x1VarA = a(tVar, map);
            x1VarA.a(new l6(true));
            return x1VarA;
        }
    }

    private x1 a(t tVar, Map map) throws a {
        a8 a8VarD = tVar.d();
        c3 c3VarA = tVar.c().a();
        c1[] c1VarArrA = c1.a(tVar.b(), a8VarD, c3VarA);
        int iB = 0;
        for (c1 c1Var : c1VarArrA) {
            iB += c1Var.b();
        }
        byte[] bArr = new byte[iB];
        int i = 0;
        for (c1 c1Var2 : c1VarArrA) {
            byte[] bArrA = c1Var2.a();
            int iB2 = c1Var2.b();
            a(bArrA, iB2);
            int i2 = 0;
            while (i2 < iB2) {
                bArr[i] = bArrA[i2];
                i2++;
                i++;
            }
        }
        return q1.a(bArr, a8VarD, c3VarA, map);
    }
}
