package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class pl8 {
    public static void a(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putBoolean("is_xmsf_sup_decrypt", ((long) y0t.l(context)) >= 50002000).apply();
    }
}
