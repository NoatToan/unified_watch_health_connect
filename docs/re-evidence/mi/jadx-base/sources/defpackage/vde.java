package defpackage;

import android.app.Activity;
import android.view.Window;
import miuix.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public class vde {
    public static void a(Activity activity) {
        Window window;
        if (activity instanceof AppCompatActivity) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            if (appCompatActivity.isFloatingWindowTheme() && appCompatActivity.isInFloatingWindowMode()) {
                activity.getWindow().addFlags(134217728);
                return;
            }
        }
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        b(activity, window);
    }

    public static void b(Activity activity, Window window) {
        String string = activity.getResources().getConfiguration().toString();
        boolean zContains = string.contains("mWindowingMode=freeform");
        boolean zContains2 = string.contains("miui-magic-windows");
        if (tc8.o(activity) || (!zContains2 && zContains)) {
            window.addFlags(134217728);
        } else {
            window.clearFlags(134217728);
        }
        window.addFlags(67108864);
    }
}
