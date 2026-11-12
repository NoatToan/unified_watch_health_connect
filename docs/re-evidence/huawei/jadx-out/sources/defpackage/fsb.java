package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class fsb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f34467a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f34468c = false;

    public static boolean d() {
        return f34468c;
    }

    public static void b(boolean z) {
        f34468c = z;
    }

    public static void e() {
        if (f34467a == null) {
            a(c());
        }
        LogUtil.a("ModelCardManager", "sDefaultType: ", f34467a);
    }

    public static void e(String str) {
        f34467a = str;
    }

    public static void b(String str) {
        LogUtil.a("ModelCardManager", "setDefaultDisplayType, type: ", str);
        d(str);
    }

    private static void a(String str) {
        LogUtil.a("ModelCardManager", "initCurDisPlayType, type: ", str);
        if (!TextUtils.isEmpty(str) && str.equals(f34467a)) {
            LogUtil.a("ModelCardManager", "initCurDisPlayType but type not change ");
        } else {
            f34467a = str;
            LogUtil.a("ModelCardManager", "initCurDisPlayType, res: ", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SP_KEY_CUR_DISPLAY", str, null)));
        }
    }

    private static void d(String str) {
        LogUtil.a("ModelCardManager", "saveCurDisPlayType type ", str, " result ", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SP_KEY_CUR_DISPLAY", str, null)));
        if (!TextUtils.isEmpty(str) && str.equals(f34467a)) {
            LogUtil.a("ModelCardManager", "saveCurDisPlayType but type not change ");
        } else {
            f34467a = str;
        }
    }

    public static String b() {
        return f34467a;
    }

    public static void c(String str) {
        LogUtil.a("ModelCardManager", "setDisPlayTypeToSp, displayType: ", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "threeCircleCard";
        if (str.equals("threeCircleCard")) {
            str2 = "threeLeafCard";
        } else if (!str.equals("threeLeafCard")) {
            return;
        }
        LogUtil.a("ModelCardManager", "setDisPlayTypeToSp: ", str2);
        LogUtil.a("ModelCardManager", "setDisPlayTypeToSp, res: ", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SP_KEY_STEP_CARD_AB", str2, null)));
    }

    private static String c() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SP_KEY_STEP_CARD_AB");
        LogUtil.a("ModelCardManager", "strategyName: ", strE);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("ModelCardManager", "json is null");
            return "threeCircleCard";
        }
        if (strE.equals("[B]")) {
            return "threeCircleCard";
        }
        if (strE.equals("threeCircleCard")) {
            f34468c = true;
            return "threeCircleCard";
        }
        if (!strE.equals("threeLeafCard")) {
            return "threeCircleCard";
        }
        f34468c = true;
        return "threeLeafCard";
    }

    public static void e(String str, int i) {
        LogUtil.a("ModelCardManager", "biEventForSwitch currentType: ", str);
        HashMap map = new HashMap();
        map.put("click", 1);
        if ("threeCircleCard".equals(str)) {
            map.put("model", "to_cloverLife");
            map.put("reminderNum", Integer.valueOf(i));
        } else if ("threeLeafCard".equals(str)) {
            map.put("model", "to_threeRing");
        } else {
            LogUtil.a("ModelCardManager", "no need bi");
        }
        lmf.d().c(com.huawei.haf.application.BaseApplication.b().getApplicationContext(), AnalyticsValue.HEALTH_SWITCHING_MODE_2010116.value(), map, 0);
    }
}
