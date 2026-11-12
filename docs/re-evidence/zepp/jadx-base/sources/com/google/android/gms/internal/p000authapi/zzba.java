package com.google.android.gms.internal.p000authapi;

import android.util.Base64;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzba {
    private static final Random a = new Random();

    public static String zzw() {
        byte[] bArr = new byte[16];
        a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
