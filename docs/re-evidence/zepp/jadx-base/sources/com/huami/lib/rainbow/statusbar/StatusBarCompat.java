package com.huami.lib.rainbow.statusbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes10.dex */
public final class StatusBarCompat {
    private static OsStatusBar a() {
        if (a.h()) {
            return new OsStatusBar.OsStatusBarMiui();
        }
        if (a.g()) {
            return new OsStatusBar.OsStatusBarFlyme();
        }
        return a.i() ? new OsStatusBar.OsStatusBarOppo() : new OsStatusBar.OsStatusBarDefault();
    }

    @TargetApi(19)
    private static void b(Window window) {
        window.addFlags(67108864);
    }

    @TargetApi(21)
    private static void c(Window window) {
        View decorView = window.getDecorView();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public static int getStatusBarHeight(@NonNull Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void setColor(@NonNull Activity activity, @ColorInt int i) {
        setColor(activity.getWindow(), i);
    }

    public static void setMode(@NonNull Fragment fragment, boolean z) {
        a().setMode(fragment, z);
    }

    public static boolean supportTransparentStatusBar() {
        return a.h() || a.g() || (a.i() && Build.VERSION.SDK_INT >= 21) || Build.VERSION.SDK_INT >= 23;
    }

    public static void transparent(@NonNull Activity activity) {
        transparent(activity.getWindow());
    }

    public static void setColor(@NonNull Window window, @ColorInt int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    public static void setMode(@NonNull Activity activity, boolean z) {
        a().setMode(activity, z);
    }

    public static void transparent(@NonNull Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            transparent(activity.getWindow());
        }
    }

    public static void setMode(@NonNull Window window, boolean z) {
        a().setMode(window, z);
    }

    public static void transparent(@NonNull Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            c(window);
        } else if (i >= 19) {
            b(window);
        }
    }
}
