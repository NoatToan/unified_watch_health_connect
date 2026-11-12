package com.airoha.android.lib.util;

/* JADX INFO: loaded from: classes2.dex */
public class ContentChecker {
    public static boolean isAllDummyHexFF(byte[] bArr) {
        for (byte b : bArr) {
            if (b != -1) {
                return false;
            }
        }
        return true;
    }
}
