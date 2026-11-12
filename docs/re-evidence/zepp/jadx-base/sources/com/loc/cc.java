package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class cc extends er {
    public static int a(eq eqVar, int i, int i2, int i3) {
        eqVar.b(3);
        eqVar.b(2, i3);
        eqVar.b(1, i2);
        eqVar.b(0, i);
        return eqVar.b();
    }

    public static int a(eq eqVar, byte[] bArr) {
        eqVar.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            eqVar.a(bArr[length]);
        }
        return eqVar.a();
    }

    public static int a(eq eqVar, int[] iArr) {
        eqVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            eqVar.a(iArr[length]);
        }
        return eqVar.a();
    }

    public static int b(eq eqVar, byte[] bArr) {
        eqVar.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            eqVar.a(bArr[length]);
        }
        return eqVar.a();
    }
}
