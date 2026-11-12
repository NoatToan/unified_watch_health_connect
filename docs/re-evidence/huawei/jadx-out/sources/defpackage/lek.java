package defpackage;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.scope.ScopeInfoResponse;
import com.huawei.wearengine.scope.ScopeManager;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class lek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Set<String> f39972a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f39973c;
    private static final Map<String, String> d;
    private static final Map<String, String> e;

    private static boolean b(int i) {
        return i == 2002 || i == 10008;
    }

    private static boolean c(int i) {
        return i == 2 || i == 40002;
    }

    static {
        HashSet hashSet = new HashSet();
        f39973c = hashSet;
        f39972a = d();
        HashMap map = new HashMap();
        map.put("com.huawei.hwid", "10132067");
        map.put("com.huawei.hms", "102322765");
        map.put("com.huawei.health", "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05");
        map.put(BaseApplication.APP_PACKAGE_GOOGLE_HEALTH, "B2881B2EE3D4EFA03342AE07DAFC0466B63EDE959EC2E2F58C05A54266F45748");
        e = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put(FaCardAgdsApi.STEP_FA_CARD_PACKAGE_NAME, "b2881b2ee3d4efa03342ae07dafc0466b63ede959ec2e2f58c05a54266f45748");
        d = Collections.unmodifiableMap(map2);
        hashSet.add("3775339A90423293F6F60055FE4484130CF90E5D4A83E9B8713EDB97F5A094B0");
        hashSet.add("B2881B2EE3D4EFA03342AE07DAFC0466B63EDE959EC2E2F58C05A54266F45748");
    }

    public static boolean d(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        String strC = KeyValDbManager.d(context).c("cloud_user_privacy402");
        if (TextUtils.isEmpty(strC)) {
            strC = String.valueOf(!Utils.o());
        }
        ReleaseLogUtil.d("Debug_HealthKitPermissionUtil", "isAppWhite linkState = ", strC);
        return "true".equals(strC);
    }

    public static boolean c() {
        Context context = BaseApplication.getContext();
        String strD = lkf.d(context);
        Map<String, String> map = d;
        if (map.containsKey(strD)) {
            return map.get(strD).toUpperCase(Locale.ROOT).equals(HsfSignValidator.a(context, strD));
        }
        return false;
    }

    public static boolean d(String str, Context context) {
        ReleaseLogUtil.d("Debug_HealthKitPermissionUtil", "isHealthKitApp packageName = ", str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, String> map = e;
        if (!map.containsKey(str)) {
            return false;
        }
        if (map.get(str).toUpperCase(Locale.ROOT).equals(HsfSignValidator.a(context, str))) {
            return true;
        }
        return b(map.get(str), str, context);
    }

    public static boolean a() {
        Context context = BaseApplication.getContext();
        String strD = lkf.d(context);
        if ("com.huawei.ohos.health.device".equals(strD)) {
            return f39973c.contains(HsfSignValidator.a(context, strD));
        }
        return false;
    }

    public static boolean a(String str, int i) {
        boolean zE = kzw.e();
        boolean z = !zE || c(str, i);
        ReleaseLogUtil.d("Debug_HealthKitPermissionUtil", "isScreenLocked: ", Boolean.valueOf(zE), ", isScreenLockedAllowed: ", Boolean.valueOf(z));
        return z;
    }

    private static boolean c(String str, int i) {
        if (a() || f39972a.contains(str)) {
            return true;
        }
        if ("saveSample".equals(str) && i == 50001) {
            return true;
        }
        return b() && b(str, i);
    }

    private static boolean b() {
        Context context = BaseApplication.getContext();
        String strD = lkf.d(context);
        if (!"com.huawei.audioaccessorymanager".equals(strD)) {
            ReleaseLogUtil.a("Debug_HealthKitPermissionUtil", "isAudioManager: false");
            return false;
        }
        return "FED014913C948337C171FFEC7A2CB3873AC05E71A62FA8C3D8BF8F6854E5A31F".equals(HsfSignValidator.a(context, strD));
    }

    private static boolean b(String str, int i) {
        if ("registerSportData".equals(str) || "getDeviceList".equals(str)) {
            return true;
        }
        if ("saveSample".equals(str) && (2002 == i || 50001 == i)) {
            return true;
        }
        if ("saveSamples".equals(str)) {
            return 2002 == i || 50001 == i;
        }
        return false;
    }

    private static boolean b(String str, String str2, Context context) {
        LogUtil.a("Debug_HealthKitPermissionUtil", "appId = ", str, " packageName = ", str2);
        ScopeManager scopeManager = new ScopeManager(context);
        scopeManager.setAppId(Binder.getCallingPid(), Binder.getCallingUid(), str);
        String str3 = GRSManager.c(context).getNoCheckUrl("domainScopeOauth", "") + "?nsp_svc=nsp.scope.app.get&nsp_fmt=json&type=2&appid=" + str;
        LogUtil.a("Debug_HealthKitPermissionUtil", "validateUrl = ", str3);
        scopeManager.setScopeServerUrl(str, str3);
        ScopeInfoResponse scope = scopeManager.getScope(str, "hihealth");
        String strA = HsfSignValidator.a(context, str2);
        if (scope != null) {
            return strA != null && (strA.equals(scope.getCertFingerprint()) || strA.equals(scope.getCertFingerprintExtra()));
        }
        ReleaseLogUtil.a("Debug_HealthKitPermissionUtil", "scopeInfoResponse is null");
        return false;
    }

    public static int e(int i) {
        if (c(i)) {
            return 40002;
        }
        if (b(i)) {
            return 10008;
        }
        return i;
    }

    private static Set<String> d() {
        HashSet hashSet = new HashSet();
        hashSet.add("stopReadingHeartRate");
        hashSet.add("stopReadingAtrial");
        hashSet.add("stopReadingRRI");
        hashSet.add("stopSport");
        hashSet.add("pushMsgToWearable");
        hashSet.add("unRegisterSportData");
        hashSet.add("sendDeviceCommand");
        hashSet.add("getSwitch");
        return hashSet;
    }
}
