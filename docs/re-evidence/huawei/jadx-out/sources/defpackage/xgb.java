package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes20.dex */
public class xgb {
    public static boolean a(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isInMultiWindowMode();
    }
}
