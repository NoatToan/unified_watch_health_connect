package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class poc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static poc f30586a;

    public static poc d() {
        if (f30586a == null) {
            f30586a = new poc();
        }
        return f30586a;
    }

    public void a(Context context, boolean z) {
        j(context, "RCTI18nUtil_allowRTL", z);
    }

    public boolean b(Context context) {
        return f(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public void c(Context context, boolean z) {
        j(context, "RCTI18nUtil_forceRTL", z);
    }

    public final boolean e() {
        return q8p.a(Locale.getDefault()) == 1;
    }

    public final boolean f(Context context, String str, boolean z) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    public boolean g(Context context) {
        if (i(context)) {
            return true;
        }
        return h(context) && e();
    }

    public final boolean h(Context context) {
        return f(context, "RCTI18nUtil_allowRTL", true);
    }

    public final boolean i(Context context) {
        return f(context, "RCTI18nUtil_forceRTL", false);
    }

    public final void j(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public void k(Context context, boolean z) {
        j(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }
}
