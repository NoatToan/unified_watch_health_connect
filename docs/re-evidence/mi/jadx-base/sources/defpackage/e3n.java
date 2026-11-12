package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.view.View;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class e3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f16229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f16230b = Boolean.parseBoolean(SystemProperties.get("persist.sys.support_view_smoothcorner", "false"));
    public static Boolean c;

    public static void a(Context context) {
        if (f16230b) {
            b(context);
        }
    }

    public static boolean b(Context context) {
        if (c == null) {
            try {
                Boolean bool = (Boolean) ebk.o(ApplicationInfo.class, context.getApplicationInfo(), "getGlobalSmoothCornerEnabled", new Class[0], new Object[0]);
                c = bool;
                if (bool == null) {
                    c = Boolean.FALSE;
                }
            } catch (Exception e) {
                c = Boolean.FALSE;
                StringBuilder sb = new StringBuilder();
                sb.append("isEnableAppSmoothCorner fail ");
                sb.append(e);
            }
        }
        return c.booleanValue();
    }

    public static void c(Drawable drawable, boolean z) {
        if (f16230b) {
            Boolean bool = c;
            if (bool == null || !bool.booleanValue()) {
                d(drawable, z);
            }
        }
    }

    public static void d(Drawable drawable, boolean z) {
        try {
            ebk.m(Drawable.class, drawable, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("setDrawableSmoothCornerEnable fail ");
            sb.append(e);
        }
    }

    public static void e(View view, boolean z) {
        if (f16230b && !b(view.getContext())) {
            f(view, z);
        }
    }

    public static void f(View view, boolean z) {
        try {
            ebk.m(View.class, view, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("setViewSmoothCornerEnable fail ");
            sb.append(e);
        }
    }
}
