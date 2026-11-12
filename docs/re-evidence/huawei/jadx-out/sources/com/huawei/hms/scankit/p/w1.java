package com.huawei.hms.scankit.p;

import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6 f16377a = new p6(o3.l);

    private void a(byte[] bArr, int i) throws a {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f16377a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (a unused) {
            throw a.a();
        }
    }

    public x1 a(s sVar, Map map) throws a {
        u uVar = new u(sVar);
        try {
            return a(uVar, map);
        } catch (a e) {
            try {
                uVar.e();
                uVar.a(true);
                uVar.d();
                uVar.c();
                uVar.a();
                x1 x1VarA = a(uVar, map);
                x1VarA.a(new i6(true));
                return x1VarA;
            } catch (a unused) {
                throw e;
            }
        }
    }

    private x1 a(u uVar, Map map) throws a {
        b8 b8VarD = uVar.d();
        b3 b3VarB = uVar.c().b();
        d1[] d1VarArrA = d1.a(uVar.b(), b8VarD, b3VarB);
        int iB = 0;
        for (d1 d1Var : d1VarArrA) {
            iB += d1Var.b();
        }
        byte[] bArr = new byte[iB];
        int i = 0;
        for (d1 d1Var2 : d1VarArrA) {
            byte[] bArrA = d1Var2.a();
            int iB2 = d1Var2.b();
            a(bArrA, iB2);
            int i2 = 0;
            while (i2 < iB2) {
                bArr[i] = bArrA[i2];
                i2++;
                i++;
            }
        }
        return s1.a(bArr, b8VarD, b3VarB, map);
    }
}
