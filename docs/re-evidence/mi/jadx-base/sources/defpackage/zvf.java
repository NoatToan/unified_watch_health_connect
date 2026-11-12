package defpackage;

import android.view.View;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class zvf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f41714a = Boolean.parseBoolean(SystemProperties.get("persist.sys.mi_shadow_supported", "false"));

    public static void a(View view) {
        b(view, 0, 0.0f, 0.0f, 0.0f);
    }

    public static void b(View view, int i, float f, float f2, float f3) {
        c(view, i, f, f2, f3, 1.0f);
    }

    public static void c(View view, int i, float f, float f2, float f3, float f4) {
        if (f41714a) {
            try {
                Class cls = Float.TYPE;
                ebk.m(View.class, view, "setMiShadow", new Class[]{Integer.TYPE, cls, cls, cls, cls}, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
            } catch (Exception unused) {
            }
        }
    }

    public static void d(View view, int i, float f, float f2, float f3, float f4, boolean z) {
        if (f41714a) {
            try {
                Class cls = Float.TYPE;
                ebk.m(View.class, view, "setMiShadow", new Class[]{Integer.TYPE, cls, cls, cls, cls, Boolean.TYPE}, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }
}
