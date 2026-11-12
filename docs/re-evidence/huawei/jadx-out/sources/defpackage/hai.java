package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.health.sport.utils.SportSupportUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class hai {
    public static void d(Context context, Intent intent) {
        if (SportSupportUtil.i()) {
            pps.e().launchActivity(context, intent);
        } else {
            ppp.b().launchActivity(context, intent);
        }
    }

    public static void a(int i, Context context, Intent intent) {
        if (SportSupportUtil.j()) {
            ppq.c().launchActivity(context, intent);
        } else {
            ReleaseLogUtil.e("Track_SportLaunchUtil", "startAiSportExam failed, not support sportType", Integer.valueOf(i));
        }
    }

    public static void c(Context context, Intent intent) {
        if (pqh.b().getModelType() != -1) {
            pel.e().launchActivity(context, intent);
        } else {
            ReleaseLogUtil.e("Track_SportLaunchUtil", "startAiActionSport failed, not support sportType");
        }
    }

    public static boolean c(int i, Context context, Intent intent) {
        if (SportSupportUtil.e(i)) {
            a(i, context, intent);
            return true;
        }
        if (i == 700001) {
            c(context, intent);
            return true;
        }
        ReleaseLogUtil.e("Track_SportLaunchUtil", "startAiActionSport failed, not support sportType");
        return false;
    }
}
