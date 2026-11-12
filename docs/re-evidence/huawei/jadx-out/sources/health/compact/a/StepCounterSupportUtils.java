package health.compact.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes2.dex */
public class StepCounterSupportUtils {
    private StepCounterSupportUtils() {
    }

    public static boolean b(Context context) {
        return e(context) && c(context);
    }

    public static boolean e(Context context) {
        boolean z = true;
        if (g(context)) {
            z = ContextCompat.checkSelfPermission(context, "android.permission.ACTIVITY_RECOGNITION") == 0;
            ReleaseLogUtil.c("Step_StepCntSupUt", "allowStepCounter isGranted ", Boolean.valueOf(z));
        }
        return z;
    }

    public static boolean c(Context context) {
        if (!d(context)) {
            return true;
        }
        boolean zC = AuthorizationUtils.c(context);
        ReleaseLogUtil.c("Step_StepCntSupUt", "allowStepCounter isAuth ", Boolean.valueOf(zC));
        return zC;
    }

    public static boolean g(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        if (CommonUtil.bh()) {
            return LanguageUtil.l(context) && (i(context) || a(context));
        }
        return true;
    }

    public static boolean i(Context context) {
        if (EnvironmentInfo.f() || EnvironmentInfo.o()) {
            return d(context, CommonUtil.bu() ? "step_support_cloud_config" : "step_support_cloud_config_beta");
        }
        return false;
    }

    public static boolean a(Context context) {
        return EnvironmentInfo.g() && DaemonServiceSpUtils.e(context);
    }

    public static boolean d(Context context, String str) {
        String strC = KeyValDbManager.d(context).c("grs_third_party_" + str);
        if (TextUtils.isEmpty(strC)) {
            return false;
        }
        return CommonUtil.c(strC.split(","));
    }

    public static boolean d(Context context) {
        if (!CommonUtil.bh()) {
            return true;
        }
        if (LanguageUtil.l(context)) {
            return EnvironmentInfo.l() || EmuiBuild.b();
        }
        return false;
    }
}
