package defpackage;

import com.alipay.sdk.m.j.b;
import com.alipay.sdk.m.j.e;

/* JADX INFO: loaded from: classes4.dex */
public class mi extends me {
    public static final /* synthetic */ boolean d = true;

    public mi(byte[] bArr) {
        super(bArr);
    }

    public static mi a(String str, long j, b bVar, short s, e eVar) throws Exception {
        byte[] bArrB = mc.b((byte) 1);
        boolean z = d;
        if (!z && bArrB.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrC = mc.c(str.charAt(0), str.charAt(1));
        if (!z && bArrC.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrB2 = mc.b(j);
        if (!z && bArrB2.length != 8) {
            throw new AssertionError();
        }
        byte[] bArrC2 = mc.c();
        if (!z && bArrC2.length != 2) {
            throw new AssertionError();
        }
        bVar.a();
        byte[] bArrB3 = mc.b(bVar.f2105a);
        if (!z && bArrB3.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrB4 = mc.b(bVar.f2106b);
        if (!z && bArrB4.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr = (byte[]) bVar.f2107c.clone();
        if (!z && bArr.length != (bVar.f2106b & 255)) {
            throw new AssertionError();
        }
        byte[] bArrA = mc.a(s);
        if (!z && bArrA.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrC3 = mc.c();
        if (!z && bArrC3.length != 2) {
            throw new AssertionError();
        }
        eVar.a();
        byte[] bArrB5 = mc.b(eVar.f2108a);
        if (!z && bArrB5.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr2 = (byte[]) eVar.f2109b.clone();
        if (!z && bArr2.length != (eVar.f2108a & 255)) {
            throw new AssertionError();
        }
        byte[] bArrD = mc.d();
        if (z || bArrD.length == 4) {
            return new mi(mc.c(bArrB, bArrC, bArrB2, bArrC2, bArrB3, bArrB4, bArr, bArrA, bArrC3, bArrB5, bArr2, bArrD));
        }
        throw new AssertionError();
    }

    public static mi c() {
        try {
            return a("EX", 0L, new mk(""), (short) 0, new mj());
        } catch (Exception unused) {
            return null;
        }
    }
}
