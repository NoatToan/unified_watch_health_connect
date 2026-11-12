package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class rer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    public void d(String str, int i) {
        byte b2;
        LogUtil.a("HealthDataBiAnalyticsUtils", "dottingBiHealthDataAnalytics tag: ", str, " value: ", Integer.valueOf(i));
        str.hashCode();
        switch (str) {
            case "biContinueHeartRateModeSwitch":
                b2 = 0;
                break;
            case "biAutoHeartRateSwitch":
                b2 = 1;
                break;
            case "biBloodOxygenRemindValue":
                b2 = 2;
                break;
            case "biBloodOxygenSwitch":
                b2 = 3;
                break;
            case "biContinueHeartRateSwitch":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            a(i);
            return;
        }
        if (b2 == 1) {
            c(i);
            return;
        }
        if (b2 == 2) {
            b(i);
            return;
        }
        if (b2 == 3) {
            e(i);
        } else if (b2 == 4) {
            d(i);
        } else {
            LogUtil.j("HealthDataBiAnalyticsUtils", "dottingBiHealthDataAnalytics else");
        }
    }

    private void e(int i) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("status", i + "");
        String strValue = AnalyticsValue.SETTING_2030068.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LogUtil.a("HealthDataBiAnalyticsUtils", "biBloodOxygenSwitch finish, value: ", strValue, " bloodOxygenMap: ", map.toString());
    }

    private void b(int i) {
        HashMap map = new HashMap(16);
        map.put("status", i > 0 ? "1" : "0");
        map.put("bloodOxygenNumber", Integer.valueOf(i));
        String strValue = AnalyticsValue.SETTING_2030069.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LogUtil.a("HealthDataBiAnalyticsUtils", "biBloodOxygenRemindValue finish, value: ", strValue, " biSwitchStatusMap: ", map.toString());
    }

    private void d(int i) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("status", i + "");
        String strValue = AnalyticsValue.SETTING_1090022.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LogUtil.a("HealthDataBiAnalyticsUtils", "biContinueHeartRateSwitch finish, value: ", strValue, " continueMap: ", map.toString());
    }

    private void a(int i) {
        HashMap map = new HashMap(16);
        map.put("status", i + "");
        String strValue = AnalyticsValue.SETTING_1090036.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LogUtil.a("HealthDataBiAnalyticsUtils", "biContinueHeartRateModeSwitch finish, value: ", strValue, " typeMap: ", map.toString());
    }

    private void c(int i) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("status", i + "");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010038.value(), map, 0);
        LogUtil.a("HealthDataBiAnalyticsUtils", "biAutoHeartRateSwitch finish, value: ", AnalyticsValue.HOME_1010038.value(), " typeMap: ", map.toString());
    }
}
