package defpackage;

import android.content.Context;
import android.text.TextUtils;
import health.compact.a.CommonUtils;

/* JADX INFO: loaded from: classes23.dex */
public class daa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static daa f31567b;
    private static final Object e = new Object();

    private daa() {
    }

    public static daa a() {
        daa daaVar;
        synchronized (daa.class) {
            if (f31567b == null) {
                f31567b = new daa();
            }
            daaVar = f31567b;
        }
        return daaVar;
    }

    public void a(Context context, String str) {
        synchronized (e) {
            String sharedPreference = cuq.a(context).getSharedPreference(str + "num");
            int iA = !qrs.d(sharedPreference) ? 0 : qrs.a(sharedPreference);
            cuq.a(context).setSharedPreference(str + "num", String.valueOf(iA + 1), null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            cuq.a(context).setSharedPreference(str + "time", String.valueOf(jCurrentTimeMillis), null);
        }
    }

    public iog d(Context context, String str) {
        String sharedPreference = cuq.a(context).getSharedPreference(str + "num");
        int iA = !qrs.d(sharedPreference) ? 0 : qrs.a(sharedPreference);
        String sharedPreference2 = cuq.a(context).getSharedPreference(str + "time");
        return new iog(iA, TextUtils.isEmpty(sharedPreference2) ? 0L : CommonUtils.i(sharedPreference2));
    }

    public void a(Context context) {
        cuq.a(context).setSharedPreference("privacy_base_info_num", String.valueOf(0), null);
        cuq.a(context).setSharedPreference("privacy_base_info_time", String.valueOf(0), null);
        cuq.a(context).setSharedPreference("privacy_sport_data_num", String.valueOf(0), null);
        cuq.a(context).setSharedPreference("privacy_sport_data_time", String.valueOf(0), null);
        cuq.a(context).setSharedPreference("privacy_health_data_num", String.valueOf(0), null);
        cuq.a(context).setSharedPreference("privacy_health_data_time", String.valueOf(0), null);
    }
}
