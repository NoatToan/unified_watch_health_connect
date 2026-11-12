package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes44.dex */
public class xem {
    public static boolean c(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isInMultiWindowMode();
    }
}
