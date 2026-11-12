package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.gson.Gson;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class det {
    public static final void e(SportLaunchParams sportLaunchParams) {
        if (sportLaunchParams == null) {
            ReleaseLogUtil.e("SportRestartUtils", "setRestartParas is null");
        } else {
            ReleaseLogUtil.d("SportRestartUtils", "setRestartParas:", sportLaunchParams.toString());
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "sport_restart_paras", new Gson().toJson(sportLaunchParams), null);
        }
    }

    public static final void b() {
        ReleaseLogUtil.d("SportRestartUtils", "clearRestartData:");
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "sport_restart_paras", "", null);
    }

    public static final SportLaunchParams e() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "sport_restart_paras");
        if (strE == null || strE.isEmpty()) {
            ReleaseLogUtil.e("SportRestartUtils", "getRestartParas is null");
            return null;
        }
        SportLaunchParams sportLaunchParams = (SportLaunchParams) ies.b(strE, SportLaunchParams.class);
        ReleaseLogUtil.d("SportRestartUtils", "getRestartParas:", sportLaunchParams.toString());
        return sportLaunchParams;
    }

    public static final void d(SportLaunchParams sportLaunchParams) {
        if (sportLaunchParams == null) {
            ReleaseLogUtil.d("SportRestartUtils", "restartSport with null paras.");
            return;
        }
        sportLaunchParams.setRestart(true);
        ReleaseLogUtil.d("SportRestartUtils", "restartSport with param:", sportLaunchParams.toString());
        if (sportLaunchParams.getLaunchActivity() == null || sportLaunchParams.getLaunchActivity().isEmpty()) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext().getPackageName(), sportLaunchParams.getLaunchActivity());
        intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParams);
        intent.setFlags(268435456);
        try {
            BaseApplication.getContext().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("SportRestartUtils", "restartSport() exception: ", LogAnonymous.b(e));
        }
    }
}
