package defpackage;

import android.content.Context;
import android.text.TextUtils;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes19.dex */
public class vcr {
    public static void c(Context context) {
        String string = Integer.toString(10006);
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferenceManager.e(context, string, "health_blood_sugar_diet_remind_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
    }

    public static boolean e(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(10006), "health_blood_sugar_diet_remind_time");
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        try {
            return HiDateUtil.p(Long.parseLong(strE)) != HiDateUtil.p(System.currentTimeMillis());
        } catch (NumberFormatException unused) {
            return true;
        }
    }
}
