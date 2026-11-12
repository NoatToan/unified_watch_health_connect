package com.google.android.gms.internal.maps;

import com.google.maps.android.BuildConfig;
import i3.e5;
import java.util.logging.Level;
import java.util.logging.Logger;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbd {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strG;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            length = objArr.length;
            if (i15 >= length) {
                break;
            }
            Object obj = objArr[i15];
            if (obj == null) {
                strG = BuildConfig.TRAVIS;
            } else {
                try {
                    strG = obj.toString();
                } catch (Exception e4) {
                    String strG2 = e5.g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strG2), (Throwable) e4);
                    strG = e0.g("<", strG2, " threw ", e4.getClass().getName(), ">");
                }
            }
            objArr[i15] = strG;
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
}
