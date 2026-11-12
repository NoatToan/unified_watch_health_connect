package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class ch extends er {
    public static int a(eq eqVar, byte b, int i) {
        eqVar.b(2);
        eqVar.b(1, i);
        eqVar.a(0, b);
        return eqVar.b();
    }

    public static int a(eq eqVar, byte[] bArr) {
        eqVar.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            eqVar.a(bArr[length]);
        }
        return eqVar.a();
    }
}
