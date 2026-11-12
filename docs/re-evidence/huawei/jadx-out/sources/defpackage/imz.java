package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class imz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f37847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f37848b;
    private static Map<String, Integer> d = new HashMap();

    public static boolean e() {
        if (!LanguageUtil.l(BaseApplication.getContext())) {
            LogUtil.a("UserInfoActivityUtil", "not chineseSimplify");
            return false;
        }
        if (Utils.o()) {
            LogUtil.a("UserInfoActivityUtil", "oversea version, dont collect label");
            return false;
        }
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            return true;
        }
        LogUtil.a("UserInfoActivityUtil", "browse mode, dont collect label");
        return false;
    }

    public static boolean b() {
        if (CommonUtil.ca() || !Utils.h()) {
            return false;
        }
        return !CommonUtil.ab(BaseApplication.getContext());
    }

    public static boolean c() {
        if (TextUtils.isEmpty(f37847a)) {
            f37847a = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN);
        }
        return !Utils.h() || "1".equals(f37847a);
    }

    public static boolean a() {
        return Utils.h() && CommonUtil.z(BaseApplication.getContext());
    }

    public static boolean d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f37848b < 500) {
            return true;
        }
        f37848b = jElapsedRealtime;
        return false;
    }

    public static void e(Context context, double d2, double d3) {
        if (context == null) {
            LogUtil.j("UserInfoActivityUtil", "joinInputActivity() context is null");
            return;
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(context, AnalyticsValue.HEALTH_HEALTH_WEIGHT_DETAIL_RECORD_2030010.value(), map, 0);
        iun.c(context);
    }

    public static int a(float f) {
        return new BigDecimal(f).setScale(0, 4).intValue();
    }

    public static void b(String str) {
        if (d.containsKey(str)) {
            int iIntValue = d.get(str).intValue();
            d.put(str, Integer.valueOf(iIntValue + 1));
            if (iIntValue >= 50) {
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("setReporting queryUserInfo", str + "\ngetStackTrace: " + Arrays.asList(Thread.currentThread().getStackTrace()).toString());
                d.put(str, 0);
                return;
            }
            return;
        }
        d.put(str, 0);
    }
}
