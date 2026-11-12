package com.google.android.gms.internal.common;

import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.a;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
public final class zzx {
    public static String zza(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb3 = new StringBuilder(str.length() + (objArr.length * 16));
        int i14 = 0;
        int i15 = 0;
        while (true) {
            length = objArr.length;
            if (i14 >= length || (iIndexOf = str.indexOf("%s", i15)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i15, iIndexOf);
            sb3.append(zzb(objArr[i14]));
            i15 = iIndexOf + 2;
            i14++;
        }
        sb3.append((CharSequence) str, i15, str.length());
        if (i14 < length) {
            String str2 = " [";
            while (i14 < objArr.length) {
                sb3.append(str2);
                sb3.append(zzb(objArr[i14]));
                i14++;
                str2 = ", ";
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    private static String zzb(Object obj) {
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        try {
            return obj.toString();
        } catch (Exception e4) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strH = e0.h(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strH), (Throwable) e4);
            String name2 = e4.getClass().getName();
            StringBuilder sb3 = new StringBuilder(strH.length() + 8 + name2.length() + 1);
            a.t(sb3, "<", strH, " threw ", name2);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
