package com.ingenic.iwds.utils;

/* JADX INFO: loaded from: classes18.dex */
public class IwdsAssert {
    private void die() {
    }

    public static void dieIf(Object obj, boolean z, String str) {
        if (z) {
            throw new RuntimeException("IWDS_" + obj + ": " + str);
        }
    }

    public static void dieIf(String str, boolean z, String str2) {
        if (z) {
            throw new RuntimeException("IWDS_" + str + ": " + str2);
        }
    }
}
