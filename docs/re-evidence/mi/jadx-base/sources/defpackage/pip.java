package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class pip {
    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str3 == null) {
            return false;
        }
        return tl9.l().e(str, "\n\n" + str2 + ":\n" + str3 + "\n\n");
    }
}
