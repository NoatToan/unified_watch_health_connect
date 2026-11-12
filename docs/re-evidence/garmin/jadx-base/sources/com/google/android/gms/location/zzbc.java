package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbc {
    public static int zza(int i14) {
        boolean z14 = true;
        if (i14 != 0 && i14 != 1) {
            if (i14 == 2) {
                i14 = 2;
            } else {
                z14 = false;
            }
        }
        Preconditions.checkArgument(z14, "granularity %d must be a Granularity.GRANULARITY_* constants", Integer.valueOf(i14));
        return i14;
    }

    public static String zzb(int i14) {
        if (i14 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i14 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i14 == 2) {
            return "GRANULARITY_FINE";
        }
        h.w();
        return null;
    }
}
