package com.huami.watch.dataflow.chart.compat;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
class b {

    public class a implements Runnable {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.invalidate();
        }
    }

    public static void a(View view) {
        view.postDelayed(new a(view), ValueAnimator.getFrameDelay());
    }

    public static void b(View view, Runnable runnable) {
        view.postDelayed(runnable, ValueAnimator.getFrameDelay());
    }

    public static void c(View view, float f) {
        view.setAlpha(f);
    }
}
