package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class y94 {
    public static void a(Activity activity, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            activity.setTranslucent(z);
        }
    }

    public static void b(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setForceDarkAllowed(z);
        }
    }
}
