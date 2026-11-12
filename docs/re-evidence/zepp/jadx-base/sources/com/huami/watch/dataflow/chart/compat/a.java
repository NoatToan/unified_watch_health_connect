package com.huami.watch.dataflow.chart.compat;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
class a {

    /* JADX INFO: renamed from: com.huami.watch.dataflow.chart.compat.a$a, reason: collision with other inner class name */
    public class RunnableC0665a implements Runnable {
        public final /* synthetic */ View a;

        public RunnableC0665a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.invalidate();
        }
    }

    public static void a(View view) {
        view.postDelayed(new RunnableC0665a(view), 10L);
    }

    public static void b(View view, Runnable runnable) {
        view.postDelayed(runnable, 10L);
    }

    public static void c(View view, float f) {
    }
}
