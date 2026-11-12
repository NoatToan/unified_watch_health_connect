package oa2;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class d {
    public static String a(Object obj, String str) {
        return b("GDI#", str, null, -1L, obj);
    }

    public static String b(String str, String str2, String str3, long j8, Object obj) {
        StringBuilder sbL = hb.a.l(str, str2, "@");
        sbL.append(Long.toHexString(obj.hashCode()));
        if (!TextUtils.isEmpty(str3) || j8 > -1) {
            String str4 = (TextUtils.isEmpty(str3) || j8 <= -1) ? "" : "/";
            sbL.append(" [");
            if (!TextUtils.isEmpty(str3)) {
                sbL.append(str3);
            }
            sbL.append(str4);
            if (j8 > -1) {
                sbL.append(j8);
            }
            sbL.append("]");
        }
        return sbL.toString();
    }
}
