package defpackage;

import android.content.Context;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes16.dex */
public class qqj {
    public static void a(Context context, int i) {
        SharedPreferenceManager.e(context, String.valueOf(10000), "HomeCardRefreshIndex", String.valueOf(i), new StorageParams());
    }
}
