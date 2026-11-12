package defpackage;

import android.content.Context;
import android.text.TextUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes10.dex */
public class izg {
    public static void d(Context context) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "track_over_sea_status", "track_over_sea_status", new StorageParams());
    }

    public static void e(Context context) {
        if (TextUtils.isEmpty(SharedPreferenceManager.e(context, Integer.toString(20002), "track_over_sea_status"))) {
            return;
        }
        qqu.c(context, 0);
        SharedPreferenceManager.e(context, Integer.toString(20002), "track_over_sea_status", "", new StorageParams());
    }
}
