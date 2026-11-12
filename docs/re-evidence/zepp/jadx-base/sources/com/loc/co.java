package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class co extends er {
    public static int a(eq eqVar, int i) {
        eqVar.b(1);
        eqVar.b(0, i);
        return eqVar.b();
    }

    public static int a(eq eqVar, int[] iArr) {
        eqVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            eqVar.a(iArr[length]);
        }
        return eqVar.a();
    }
}
