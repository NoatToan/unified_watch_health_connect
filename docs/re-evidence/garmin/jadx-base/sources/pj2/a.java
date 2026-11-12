package pj2;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private a() {
    }

    public static String a(String str, String str2, Object obj) {
        StringBuilder sbL = hb.a.l("BLE#", str, "@");
        sbL.append(Long.toHexString(obj.hashCode()));
        if (!TextUtils.isEmpty(str2)) {
            am.j.y(sbL, " [", str2, "]");
        }
        return sbL.toString();
    }
}
