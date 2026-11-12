package com.google.android.gms.internal.location;

import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.a;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbs {
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
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String string2 = sb3.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", string2.length() != 0 ? "Exception during lenientFormat for ".concat(string2) : new String("Exception during lenientFormat for "), (Throwable) e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(string2.length() + 9 + name2.length());
                    a.t(sb4, "<", string2, " threw ", name2);
                    sb4.append(">");
                    string = sb4.toString();
                }
            }
            objArr[i15] = string;
            i15++;
        }
        StringBuilder sb5 = new StringBuilder((length * 16) + str.length());
        int i16 = 0;
        while (true) {
            length2 = objArr.length;
            if (i14 >= length2 || (iIndexOf = str.indexOf("%s", i16)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i16, iIndexOf);
            sb5.append(objArr[i14]);
            i14++;
            i16 = iIndexOf + 2;
        }
        sb5.append((CharSequence) str, i16, str.length());
        if (i14 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i14]);
            for (int i17 = i14 + 1; i17 < objArr.length; i17++) {
                sb5.append(", ");
                sb5.append(objArr[i17]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
