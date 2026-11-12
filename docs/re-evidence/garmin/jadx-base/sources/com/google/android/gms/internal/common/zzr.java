package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzr {
    public static void zza(boolean z14) {
        if (z14) {
            return;
        }
        x.h();
    }

    public static int zzb(int i14, int i15, String str) {
        String strZza;
        if (i14 >= 0 && i14 < i15) {
            return i14;
        }
        if (i14 < 0) {
            strZza = zzx.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i14));
        } else {
            if (i15 < 0) {
                h.s(x.e(new StringBuilder(String.valueOf(i15).length() + 15), i15, "negative size: "));
                return 0;
            }
            strZza = zzx.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzc(int i14, int i15, String str) {
        if (i14 >= 0 && i14 <= i15) {
            return i14;
        }
        e.v(zze(i14, i15, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    public static void zzd(int i14, int i15, int i16) {
        String strZze;
        if (i14 < 0 || i15 < i14 || i15 > i16) {
            if (i14 < 0 || i14 > i16) {
                strZze = zze(i14, i16, "start index");
            } else {
                strZze = (i15 < 0 || i15 > i16) ? zze(i15, i16, "end index") : zzx.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i15), Integer.valueOf(i14));
            }
            throw new IndexOutOfBoundsException(strZze);
        }
    }

    private static String zze(int i14, int i15, String str) {
        if (i14 < 0) {
            return zzx.zza("%s (%s) must not be negative", str, Integer.valueOf(i14));
        }
        if (i15 >= 0) {
            return zzx.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        h.s(x.e(new StringBuilder(String.valueOf(i15).length() + 15), i15, "negative size: "));
        return null;
    }
}
