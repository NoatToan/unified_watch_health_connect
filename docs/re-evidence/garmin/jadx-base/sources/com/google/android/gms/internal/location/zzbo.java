package com.google.android.gms.internal.location;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbo {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static void zza(long j8, StringBuilder sb3) {
        if (j8 == 0) {
            sb3.append("0s");
            return;
        }
        sb3.ensureCapacity(sb3.length() + 27);
        boolean z14 = false;
        if (j8 < 0) {
            sb3.append("-");
            if (j8 != Long.MIN_VALUE) {
                j8 = -j8;
            } else {
                j8 = Long.MAX_VALUE;
                z14 = true;
            }
        }
        if (j8 >= 86400000) {
            sb3.append(j8 / 86400000);
            sb3.append("d");
            j8 %= 86400000;
        }
        if (true == z14) {
            j8 = 25975808;
        }
        if (j8 >= 3600000) {
            sb3.append(j8 / 3600000);
            sb3.append("h");
            j8 %= 3600000;
        }
        if (j8 >= 60000) {
            sb3.append(j8 / 60000);
            sb3.append("m");
            j8 %= 60000;
        }
        if (j8 >= 1000) {
            sb3.append(j8 / 1000);
            sb3.append("s");
            j8 %= 1000;
        }
        if (j8 > 0) {
            sb3.append(j8);
            sb3.append("ms");
        }
    }
}
