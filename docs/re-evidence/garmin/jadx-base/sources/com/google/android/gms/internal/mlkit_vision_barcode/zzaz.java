package com.google.android.gms.internal.mlkit_vision_barcode;

import am.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaz {
    public static int zza(int i14, int i15, String str) {
        String strZzb;
        if (i14 >= 0 && i14 < i15) {
            return i14;
        }
        if (i14 < 0) {
            strZzb = zzba.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i14));
        } else {
            if (i15 < 0) {
                h.s(j.h(i15, "negative size: "));
                return 0;
            }
            strZzb = zzba.zzb("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i14, int i15, String str) {
        if (i14 >= 0 && i14 <= i15) {
            return i14;
        }
        e.v(zzg(i14, i15, FirebaseAnalytics.Param.INDEX));
        return 0;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        x.l("Executor was null.");
        return null;
    }

    public static void zzd(boolean z14) {
        if (z14) {
            return;
        }
        h.w();
    }

    public static void zze(int i14, int i15, int i16) {
        String strZzg;
        if (i14 < 0 || i15 < i14 || i15 > i16) {
            if (i14 < 0 || i14 > i16) {
                strZzg = zzg(i14, i16, "start index");
            } else {
                strZzg = (i15 < 0 || i15 > i16) ? zzg(i15, i16, "end index") : zzba.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i15), Integer.valueOf(i14));
            }
            throw new IndexOutOfBoundsException(strZzg);
        }
    }

    public static void zzf(boolean z14, Object obj) {
        if (z14) {
            return;
        }
        h.z((String) obj);
    }

    private static String zzg(int i14, int i15, String str) {
        if (i14 < 0) {
            return zzba.zzb("%s (%s) must not be negative", str, Integer.valueOf(i14));
        }
        if (i15 >= 0) {
            return zzba.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i14), Integer.valueOf(i15));
        }
        h.s(j.h(i15, "negative size: "));
        return null;
    }
}
