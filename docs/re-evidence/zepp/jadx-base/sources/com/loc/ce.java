package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class ce extends er {
    public static int a(eq eqVar, int i, byte b, int i2, int i3) {
        eqVar.b(4);
        eqVar.b(3, i3);
        eqVar.b(2, i2);
        eqVar.b(0, i);
        eqVar.a(1, b);
        return eqVar.b();
    }

    public static int a(eq eqVar, int[] iArr) {
        eqVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            eqVar.a(iArr[length]);
        }
        return eqVar.a();
    }

    public static int b(eq eqVar, int[] iArr) {
        eqVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            eqVar.a(iArr[length]);
        }
        return eqVar.a();
    }
}
