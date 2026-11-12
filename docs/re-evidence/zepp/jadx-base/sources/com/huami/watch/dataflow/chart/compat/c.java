package com.huami.watch.dataflow.chart.compat;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
@SuppressLint({"NewApi"})
class c {
    public static void a(View view) {
        view.postInvalidateOnAnimation();
    }

    @SuppressLint({"NewApi"})
    public static void b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
