package defpackage;

import android.text.TextUtils;
import android.text.format.Formatter;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes19.dex */
public class ucf {
    public static boolean c() {
        if (h() || !f()) {
            return false;
        }
        if (SharedPreferenceManager.b(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "isAddSleepCacheThreshold", false)) {
            b();
            a(false);
            LogUtil.a("ClearAudioDialogHelper", "sleepAudioCacheThreshold add 500MB");
        }
        if (!j()) {
            return false;
        }
        a(true);
        return true;
    }

    private static boolean h() {
        gwd gwdVar = new gwd(1000, 7, 0, null);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "SLEEP_RECORD_ALARM_INFO");
        if (!TextUtils.isEmpty(strE)) {
            gwdVar = (gwd) HiJsonUtil.d(strE, gwd.class);
        }
        LogUtil.a("ClearAudioDialogHelper", "AutoClear: ", Boolean.valueOf(gwdVar.m()));
        return gwdVar.m();
    }

    public static void a(long j) {
        long j2 = j + 2592000000L;
        SharedPreferenceManager.c(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "nextPopTime", j2);
        LogUtil.a("ClearAudioDialogHelper", "setNextPopTime: ", Long.valueOf(j2));
    }

    private static boolean f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD = SharedPreferenceManager.d(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "nextPopTime", 0L);
        LogUtil.a("ClearAudioDialogHelper", "currentTime: ", Long.valueOf(jCurrentTimeMillis), "nextPopTime: ", Long.valueOf(jD));
        return jCurrentTimeMillis >= jD;
    }

    private static boolean j() {
        long jE = wub.e(BaseApplication.getContext(), "sleepMonitor");
        long jD = d();
        LogUtil.a("ClearAudioDialogHelper", "sleepCacheSize: ", Long.valueOf(jE), "sleepCacheThreshold: ", Long.valueOf(jD));
        return jE >= jD;
    }

    public static String e() {
        return Formatter.formatShortFileSize(BaseApplication.getContext().getApplicationContext(), wub.e(BaseApplication.getContext(), "sleepMonitor"));
    }

    private static void b() {
        SharedPreferenceManager.c(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "sleepCacheThreshold", d() + 524288000);
    }

    private static long d() {
        return SharedPreferenceManager.d(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "sleepCacheThreshold", 524288000L);
    }

    public static void a() {
        long jD = d();
        long jE = wub.e(BaseApplication.getContext(), "sleepMonitor");
        if (jE < jD) {
            a(false);
            while (jE < jD) {
                jD -= 524288000;
            }
            jD += 524288000;
            SharedPreferenceManager.c(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "sleepCacheThreshold", jD);
        }
        LogUtil.a("ClearAudioDialogHelper", "sleepAudioCacheThreshold changed, now it's: ", Long.valueOf(jD));
    }

    private static void a(boolean z) {
        SharedPreferenceManager.a(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "isAddSleepCacheThreshold", z);
    }
}
