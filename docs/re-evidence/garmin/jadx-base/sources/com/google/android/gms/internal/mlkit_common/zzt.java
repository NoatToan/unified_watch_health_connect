package com.google.android.gms.internal.mlkit_common;

import am.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzt {
    public static int zza(int i14, int i15, String str) {
        String strZza;
        if (i14 >= 0 && i14 < i15) {
            return i14;
        }
        if (i14 < 0) {
            strZza = zzu.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i14));
        } else {
            if (i15 < 0) {
                h.s(j.h(i15, "negative size: "));
                return 0;
            }
            strZza = zzu.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i14, int i15, String str) {
        if (i14 >= 0 && i14 <= i15) {
            return i14;
        }
        e.v(zzf(i14, i15, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        x.l((String) obj2);
        return null;
    }

    public static void zzd(int i14, int i15, int i16) {
        String strZzf;
        if (i14 < 0 || i15 < i14 || i15 > i16) {
            if (i14 < 0 || i14 > i16) {
                strZzf = zzf(i14, i16, "start index");
            } else {
                strZzf = (i15 < 0 || i15 > i16) ? zzf(i15, i16, "end index") : zzu.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i15), Integer.valueOf(i14));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    public static void zze(boolean z14, Object obj) {
        if (z14) {
            return;
        }
        h.z("A SourcePolicy can only set internal() or external() once.");
    }

    private static String zzf(int i14, int i15, String str) {
        if (i14 < 0) {
            return zzu.zza("%s (%s) must not be negative", str, Integer.valueOf(i14));
        }
        if (i15 >= 0) {
            return zzu.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        h.s(j.h(i15, "negative size: "));
        return null;
    }
}
