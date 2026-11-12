package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class ieb {
    public static String b() {
        int hours = new Date().getHours();
        if (hours >= 0 && hours < 5) {
            return BaseApplication.b().getResources().getString(R.string.IDS_plan_run_welcome);
        }
        if (hours >= 5 && hours < 9) {
            return BaseApplication.b().getResources().getString(R.string.IDS_sug_good_morning_01);
        }
        if (hours >= 9 && hours < 11) {
            return BaseApplication.b().getResources().getString(R.string.IDS_sug_good_morning_02);
        }
        if (hours >= 11 && hours < 13) {
            return BaseApplication.b().getResources().getString(R.string.IDS_sug_good_afternoon_01);
        }
        if (hours >= 13 && hours < 17) {
            return BaseApplication.b().getResources().getString(R.string.IDS_sug_good_afternoon_02);
        }
        if (hours >= 17 && hours < 19) {
            return BaseApplication.b().getResources().getString(R.string.IDS_sug_good_evening_01);
        }
        if (hours >= 19 && hours < 21) {
            return BaseApplication.b().getResources().getString(R.string.IDS_sug_good_evening_02);
        }
        if (hours >= 21) {
            return BaseApplication.b().getResources().getString(R.string.IDS_plan_run_welcome);
        }
        return BaseApplication.b().getResources().getString(R.string.IDS_sug_good_morning_01);
    }

    public static String e() {
        int hours = new Date().getHours();
        if ((hours >= 0 && hours < 5) || hours >= 21) {
            return BaseApplication.b().getResources().getString(R.string.IDS_plan_run_rest_tips);
        }
        return BaseApplication.b().getResources().getString(R.string.IDS_sug_invite_run_plan);
    }
}
