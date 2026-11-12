package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class cu {
    public static boolean a = false;
    private static volatile dj b;

    public static dj a() {
        return b;
    }

    public static void a(dj djVar) {
        if (djVar != null) {
            b = djVar;
        }
    }
}
