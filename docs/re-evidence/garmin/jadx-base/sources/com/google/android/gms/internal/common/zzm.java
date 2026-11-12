package com.google.android.gms.internal.common;

import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class zzm extends zzl {
    private final char zza;

    public zzm(char c14) {
        this.zza = c14;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i14 = this.zza;
        for (int i15 = 0; i15 < 4; i15++) {
            cArr[5 - i15] = "0123456789ABCDEF".charAt(i14 & 15);
            i14 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return e0.h(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.common.zzp
    public final boolean zza(char c14) {
        return c14 == this.zza;
    }
}
