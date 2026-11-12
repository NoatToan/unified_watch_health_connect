package com.google.android.gms.internal.mlkit_vision_common;

import com.google.maps.android.BuildConfig;
import hb.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes14.dex */
public final class zzg {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            length = objArr.length;
            if (i15 >= length) {
                break;
            }
            Object obj = objArr[i15];
            if (obj == null) {
                string = BuildConfig.TRAVIS;
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e4) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e4);
                    StringBuilder sbL = a.l("<", str2, " threw ");
                    sbL.append(e4.getClass().getName());
                    sbL.append(">");
                    string = sbL.toString();
                }
            }
            objArr[i15] = string;
            i15++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i16 = 0;
        while (true) {
            length2 = objArr.length;
            if (i14 >= length2 || (iIndexOf = str.indexOf("%s", i16)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i16, iIndexOf);
            sb3.append(objArr[i14]);
            i14++;
            i16 = iIndexOf + 2;
        }
        sb3.append((CharSequence) str, i16, str.length());
        if (i14 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i14]);
            for (int i17 = i14 + 1; i17 < objArr.length; i17++) {
                sb3.append(", ");
                sb3.append(objArr[i17]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static boolean zzb(String str) {
        return zze.zza(str);
    }
}
