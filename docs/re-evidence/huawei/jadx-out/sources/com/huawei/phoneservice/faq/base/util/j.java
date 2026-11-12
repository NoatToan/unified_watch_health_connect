package com.huawei.phoneservice.faq.base.util;

import android.os.Handler;
import android.view.View;

/* JADX INFO: loaded from: classes41.dex */
public class j {

    class c implements Runnable {
        final /* synthetic */ View d;

        @Override // java.lang.Runnable
        public void run() {
            View view = this.d;
            if (view != null) {
                view.setEnabled(true);
            }
        }

        c(View view) {
            this.d = view;
        }
    }

    public static void b(View view) {
        if (view != null) {
            view.setEnabled(false);
        }
        new Handler().postDelayed(new c(view), 1000L);
    }
}
