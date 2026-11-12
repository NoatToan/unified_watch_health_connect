package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mhw {
    public static void c(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "core_sleep_switch_key_" + nio.e(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)), str, null);
        ReleaseLogUtil.d("R_CoreSleepSwitchUtils", "setCoreSleepSwitchToSp switchValue:", str);
    }

    public static String e() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "core_sleep_switch_key_" + nio.e(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)));
        ReleaseLogUtil.d("R_CoreSleepSwitchUtils", "getCoreSleepSwitchFromSp switchValue:", strE);
        return strE;
    }
}
