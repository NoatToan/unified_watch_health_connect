package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.GRSManager;
import health.compact.a.Sha256;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class mfx {
    public static void a(final DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        if (deviceInfo == null) {
            LogUtil.j("BeiDouCrowdTestUtil", "isOpenBeiDouCrowdTest, deviceInfo is null");
            iBaseResponseCallback.a(-1, false);
        } else {
            ThreadPoolManager.c().a("BeiDouCrowdTestUtil", new Runnable() { // from class: mfx.5
                @Override // java.lang.Runnable
                public void run() {
                    String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("crowdTestUrl", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
                    if (TextUtils.isEmpty(noCheckUrl)) {
                        LogUtil.a("BeiDouCrowdTestUtil", "url is empty");
                        iBaseResponseCallback.a(-1, false);
                    }
                    boolean zB = mfx.b(mfx.c(noCheckUrl + "/dsc-beidouProxy-service/v1/apply", deviceInfo, 0), iBaseResponseCallback);
                    LogUtil.a("BeiDouCrowdTestUtil", "isOpen: ", Boolean.valueOf(zB));
                    iBaseResponseCallback.a(0, Boolean.valueOf(zB));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(mgr mgrVar, IBaseResponseCallback iBaseResponseCallback) {
        if (mgrVar == null) {
            LogUtil.j("BeiDouCrowdTestUtil", "isOpenResult, result is null");
            iBaseResponseCallback.a(-1, false);
            return false;
        }
        if (TextUtils.isEmpty(mgrVar.d()) || !mgrVar.d().equals("20000")) {
            LogUtil.j("BeiDouCrowdTestUtil", "crowd test is null or code is error");
            iBaseResponseCallback.a(-1, false);
            return false;
        }
        mgr.e eVarE = mgrVar.e();
        if (eVarE == null) {
            LogUtil.j("BeiDouCrowdTestUtil", "crowd test data is null or need ");
            iBaseResponseCallback.a(-1, false);
            return false;
        }
        ReleaseLogUtil.d("R_BeiDouCrowdTestUtil", "getQueryResult is: ", Integer.valueOf(eVarE.e()));
        if (eVarE.e() == 1) {
            iBaseResponseCallback.a(0, false);
            return false;
        }
        iBaseResponseCallback.a(0, true);
        return true;
    }

    public static void d(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("BeiDouCrowdTestUtil", "openCrowdTest,deviceInfo is null");
        } else {
            ThreadPoolManager.c().a("BeiDouCrowdTestUtil", new Runnable() { // from class: mfx.1
                @Override // java.lang.Runnable
                public void run() {
                    String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("crowdTestUrl", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
                    if (TextUtils.isEmpty(noCheckUrl)) {
                        LogUtil.j("BeiDouCrowdTestUtil", "url is empty");
                        return;
                    }
                    mfx.c(noCheckUrl + "/dsc-beidouProxy-service/v1/apply", deviceInfo, 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static mgr c(String str, DeviceInfo deviceInfo, int i) {
        HashMap map = new HashMap();
        map.put("Accept", "application/json");
        map.put("Content-Type", "application/json");
        map.put("accessToken", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015));
        mgr mgrVar = (mgr) oet.d().e(str, map, d(deviceInfo, i), mgr.class);
        LogUtil.j("BeiDouCrowdTestUtil", "requestBody result :", HiJsonUtil.d(mgrVar));
        return mgrVar;
    }

    private static String d(DeviceInfo deviceInfo, int i) {
        HashMap map = new HashMap();
        map.put("accountId", Sha256.d(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), "SHA-256").toLowerCase(Locale.ENGLISH));
        map.put("deviceType", 12);
        map.put("deviceId", deviceInfo.getDeviceUdid().toLowerCase(Locale.ENGLISH));
        map.put(ParsedFieldTag.KAKA_TASK_SCENARIO, Integer.valueOf(i));
        return HiJsonUtil.d(map);
    }
}
