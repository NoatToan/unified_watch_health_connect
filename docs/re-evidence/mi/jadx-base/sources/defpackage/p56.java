package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
public class p56 {
    public static int a(Context context) {
        if (b63.e) {
            return 3;
        }
        if (b63.f) {
            return 4;
        }
        if (b63.h) {
            return 5;
        }
        if (b63.f3843b) {
            return 2;
        }
        return b63.c ? 11 : 1;
    }

    public static boolean b(Context context, Display display) {
        if (display == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    display = context.getDisplay();
                } catch (Exception unused) {
                }
            }
            if (display == null) {
                try {
                    display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
                } catch (Exception unused2) {
                }
            }
        }
        if (display != null) {
            return TextUtils.equals("com.miui.carlink", display.getName());
        }
        return false;
    }

    public static boolean c(Context context) {
        int iE = zlr.e(context.getResources().getConfiguration());
        if (a(context) == 4) {
            return iE == 1;
        }
        Point pointB = zlr.b(context);
        return ((int) (((float) Math.max(pointB.x, pointB.y)) / context.getResources().getDisplayMetrics().density)) <= 640;
    }

    public static boolean d(Context context) {
        return ((float) tc8.e(context)) > context.getResources().getDisplayMetrics().density * 600.0f;
    }

    public static boolean e(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "synergy_mode", 0) == 1;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("isXiaomiSynergy warning!! context cannot get synergy_mode: ");
            sb.append(e);
            return false;
        }
    }
}
