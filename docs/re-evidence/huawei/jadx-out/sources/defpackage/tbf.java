package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.g2;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.HomeFragment;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class tbf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f48927c = false;
    private static String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HomeFragment f48928a;
    private Context e;

    public tbf(Context context, HomeFragment homeFragment) {
        LogUtil.a("StepsCardManager", "StepsCardManager");
        this.e = context;
        this.f48928a = homeFragment;
    }

    public static boolean b() {
        return f48927c;
    }

    public void e(boolean z) {
        f48927c = z;
    }

    public static void d() {
        if (d == null) {
            c(c());
        }
        LogUtil.a("StepsCardManager", "sDefaultType: ", d);
    }

    public void e(String str) {
        d = str;
    }

    public void d(String str) {
        LogUtil.a("StepsCardManager", "setDefaultDisplayType, type: ", str);
        g(str);
    }

    private static void c(String str) {
        LogUtil.a("StepsCardManager", "initCurDisPlayType, type: ", str);
        if (!TextUtils.isEmpty(str) && str.equals(d)) {
            LogUtil.a("StepsCardManager", "initCurDisPlayType but type not change ");
            return;
        }
        d = str;
        int iE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SP_KEY_CUR_DISPLAY", str, null);
        SharedPreferenceManager.a(String.valueOf(10000), "SP_IS_HEALTH_LIFE_BI", ffv.l());
        LogUtil.a("StepsCardManager", "initCurDisPlayType, res: ", Integer.valueOf(iE));
    }

    private void g(String str) {
        int iE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SP_KEY_CUR_DISPLAY", str, null);
        SharedPreferenceManager.a(String.valueOf(10000), "SP_IS_HEALTH_LIFE_BI", ffv.l());
        LogUtil.a("StepsCardManager", "saveCurDisPlayType type ", str, " result ", Integer.valueOf(iE));
        if (!TextUtils.isEmpty(str) && str.equals(d)) {
            LogUtil.a("StepsCardManager", "saveCurDisPlayType but type not change ");
        } else {
            d = str;
        }
    }

    public static String e() {
        return d;
    }

    public void a(String str) {
        if (qrs.aa(this.e)) {
            a(str, false);
        } else {
            a(str, true);
        }
    }

    public void a(String str, boolean z) {
        LogUtil.a("StepsCardManager", "notifyCardChanged: currentType: ", str, ", switchWithAnimation: ", Boolean.valueOf(z));
        this.f48928a.e(str, z);
    }

    public void b(String str) {
        LogUtil.a("StepsCardManager", "setDisPlayTypeToSp, displayType: ", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "threeCircleCard";
        if (str.equals("threeCircleCard")) {
            str2 = "threeLeafCard";
        } else if (!str.equals("threeLeafCard")) {
            return;
        }
        LogUtil.a("StepsCardManager", "setDisPlayTypeToSp: ", str2);
        LogUtil.a("StepsCardManager", "setDisPlayTypeToSp, res: ", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SP_KEY_STEP_CARD_AB", str2, null)));
    }

    private static String c() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SP_KEY_STEP_CARD_AB");
        LogUtil.a("StepsCardManager", "strategyName: ", strE);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("StepsCardManager", "json is null");
            return "threeCircleCard";
        }
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("StepsCardManager", "strategyName is null");
            return "threeCircleCard";
        }
        if (strE.equals("[B]")) {
            return "threeCircleCard";
        }
        if (strE.equals("threeCircleCard")) {
            f48927c = true;
            return "threeCircleCard";
        }
        if (!strE.equals("threeLeafCard")) {
            return "threeCircleCard";
        }
        f48927c = true;
        return "threeLeafCard";
    }

    public void d(String str, int i) {
        LogUtil.a("StepsCardManager", "biEventForSwitch currentType: ", str);
        HashMap map = new HashMap();
        map.put("click", 1);
        if ("threeCircleCard".equals(str)) {
            map.put("model", "to_cloverLife");
            map.put("reminderNum", Integer.valueOf(i));
        } else if ("threeLeafCard".equals(str)) {
            map.put("model", "to_threeRing");
        } else {
            LogUtil.a("StepsCardManager", "no need bi");
        }
        lmf.d().c(this.e.getApplicationContext(), AnalyticsValue.HEALTH_SWITCHING_MODE_2010116.value(), map, 0);
        sqw.e(g2.H3, "threeCircleCard".equals(str) ? "to_cloverLife" : "to_threeRing", (Boolean) null);
    }
}
