package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class qc1 {
    public static void a(View view) {
        mc1.i().m();
        view.postInvalidateOnAnimation();
    }

    public static void b(View view, Runnable runnable) {
        mc1.i().m();
        view.postOnAnimation(runnable);
    }
}
