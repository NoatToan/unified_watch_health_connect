package com.huami.watch.dataflow.chart.compat;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public class Compat {
    public static void postOnAnimation(View view, Runnable runnable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            c.b(view, runnable);
        } else if (i >= 11) {
            b.b(view, runnable);
        } else {
            a.b(view, runnable);
        }
    }

    public static void postOnAnimationInvalidate(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            c.a(view);
        } else if (i >= 11) {
            b.a(view);
        } else {
            a.a(view);
        }
    }

    public static void setAlpha(View view, float f) {
        if (Build.VERSION.SDK_INT >= 11) {
            b.c(view, f);
        } else {
            a.c(view, f);
        }
    }
}
