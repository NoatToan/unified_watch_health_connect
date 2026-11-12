package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class pz9 {
    public static boolean a(Context context) {
        return c() && context.getResources().getDisplayMetrics().widthPixels >= 1860;
    }

    public static boolean b(Context context) {
        return c() && context != null && (new Configuration(context.getResources().getConfiguration()).screenLayout & 15) == 2;
    }

    public static boolean c() {
        String str = Build.DEVICE;
        return TextUtils.equals(str, "cetus") || TextUtils.equals(str, "zizhan");
    }
}
