package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class iur {
    public static void a(String str) {
        sk1.b(!TextUtils.isEmpty(str), "appName can not be empty!");
    }

    public static void b(String str, String str2) {
        a(str);
        sk1.b(!TextUtils.isEmpty(str2), "module can not be empty!");
    }
}
