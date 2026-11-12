package defpackage;

import android.annotation.TargetApi;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class v94 {
    public static void a(View view, Runnable runnable) {
        b(view, runnable);
    }

    @TargetApi(16)
    public static void b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
