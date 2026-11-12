package health.compact.a;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hwbasemgr.CloudUrlManager;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import defpackage.loo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class GRSManager implements CloudUrlManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f36551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f36553c;
    private static String d;
    private static final String e;
    private static List<String> g;

    static {
        String str;
        if (CommonUtil.cl()) {
            str = BleConstants.WEIGHT_KEY;
        } else {
            str = CommonUtil.ba() ? "green" : "";
        }
        e = str;
        f36552b = com.huawei.common.util.Utils.SERVICE_HEALTH_CLOUD + str;
        g = new ArrayList(10);
        ArrayList arrayList = new ArrayList(10);
        f36553c = arrayList;
        d = "";
        g.add("domainConsumerHuawei");
        g.add("domainPrivacyLegalCloudHuawei");
        if (CommonUtil.ap()) {
            arrayList.add("domainLegalCloudHuawei");
        }
    }

    private GRSManager() {
    }

    public static GRSManager c(Context context) {
        if (context != null) {
            f36551a = context.getApplicationContext();
        } else {
            f36551a = BaseApplication.b();
        }
        return c.e;
    }

    private boolean e(String str) {
        return (g.contains(str) || AuthorizationUtils.c(f36551a) || f36553c.contains(str)) ? false : true;
    }

    @Override // com.huawei.hwbasemgr.CloudUrlManager
    public String getUrl(String str) {
        if (e(str)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_GRS_GRSManager", "getUrl no authorize");
            return "";
        }
        boolean zH = Utils.h();
        boolean isLogined = LoginInit.getInstance(f36551a).getIsLogined();
        if (!zH && !isLogined) {
            com.huawei.hwlogsmodel.LogUtil.j("R_GRS_GRSManager", "getUrl failed with isAllowLogin=", Boolean.valueOf(zH), ", isLogined=", Boolean.valueOf(isLogined));
            return "";
        }
        String commonCountryCode = getCommonCountryCode();
        String strC = c(a(f36552b, commonCountryCode), commonCountryCode, loo.e(str) + e, str);
        if (TextUtils.isEmpty(strC)) {
            com.huawei.hwlogsmodel.LogUtil.e("R_GRS_GRSManager", "getUrl error, key is ", str);
        }
        return strC;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(final String str, final GrsQueryCallback grsQueryCallback) {
        if (e(str)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_GRS_GRSManager", "getUrl no authorize");
            d(1001, grsQueryCallback);
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: loi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40558c.d(str, grsQueryCallback);
                }
            });
            return;
        }
        boolean zH = Utils.h();
        boolean isLogined = LoginInit.getInstance(f36551a).getIsLogined();
        final String commonCountryCode = getCommonCountryCode();
        if (TextUtils.isEmpty(commonCountryCode) && (!zH || !isLogined)) {
            com.huawei.hwlogsmodel.LogUtil.j("R_GRS_GRSManager", "getUrl failed with isAllowLogin=", Boolean.valueOf(zH), ", isLogined=", Boolean.valueOf(isLogined), " countryCode=", commonCountryCode);
            if (grsQueryCallback != null) {
                grsQueryCallback.onCallBackSuccess("");
                return;
            }
        }
        final GrsClient grsClientA = a(f36552b, commonCountryCode);
        final String str2 = loo.c(str, commonCountryCode) + e;
        grsClientA.ayncGetGrsUrl(str2, str, new IQueryUrlCallBack() { // from class: health.compact.a.GRSManager.3
            @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
            public void onCallBackSuccess(String str3) {
                com.huawei.hwlogsmodel.LogUtil.a("GRSManager", "HealthGrsManager getUrl [", commonCountryCode, "][", str2, "][", str, "][", str3, "]");
                if (!TextUtils.isEmpty(str3)) {
                    GRSManager.this.e(str3, grsQueryCallback);
                } else {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_GRS_GRSManager", "HealthGrsManager getUrl error, key is ", str);
                    GRSManager.this.a(grsClientA, str, commonCountryCode, grsQueryCallback);
                }
            }

            @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
            public void onCallBackFail(int i) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_GRS_GRSManager", "HealthGrsManager getUrl error, [", commonCountryCode, "][", str2, "][", str, "] errorCode:", Integer.valueOf(i));
                if (loo.e(str, commonCountryCode)) {
                    GRSManager.this.a(grsClientA, str, commonCountryCode, grsQueryCallback);
                } else {
                    GRSManager.this.d(i, grsQueryCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(GrsClient grsClient, final String str, final String str2, final GrsQueryCallback grsQueryCallback) {
        if (!loo.e(str, str2)) {
            d(1001, grsQueryCallback);
            return;
        }
        final String str3 = loo.e(str) + e;
        grsClient.ayncGetGrsUrl(str3, str, new IQueryUrlCallBack() { // from class: health.compact.a.GRSManager.1
            @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
            public void onCallBackSuccess(String str4) {
                com.huawei.hwlogsmodel.LogUtil.a("GRSManager", "HealthGrsManager onCallBackEmptyUrl [", str2, "][", str3, "][", str, "][", str4, "]");
                if (!TextUtils.isEmpty(str4)) {
                    GRSManager.this.e(str4, grsQueryCallback);
                } else {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_GRS_GRSManager", "HealthGrsManager onCallBackEmptyUrl getUrl error, key is ", str);
                    GRSManager.this.d(1001, grsQueryCallback);
                }
            }

            @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
            public void onCallBackFail(int i) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_GRS_GRSManager", "HealthGrsManager onCallBackEmptyUrl error, [", str2, "][", str3, "][", str, "] errorCode:", Integer.valueOf(i));
                GRSManager.this.d(i, grsQueryCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, GrsQueryCallback grsQueryCallback) {
        if (grsQueryCallback != null) {
            grsQueryCallback.onCallBackFail(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, GrsQueryCallback grsQueryCallback) {
        if (grsQueryCallback != null) {
            grsQueryCallback.onCallBackSuccess(str);
        }
    }

    @Override // com.huawei.hwbasemgr.CloudUrlManager
    public String getCountryCode() {
        String accountInfo = Utils.h() ? LoginInit.getInstance(f36551a).getAccountInfo(1010) : null;
        if (!TextUtils.isEmpty(accountInfo)) {
            return accountInfo;
        }
        String strG = CommonUtil.g(f36551a);
        return TextUtils.isEmpty(strG) ? Locale.getDefault().getCountry() : strG;
    }

    @Override // com.huawei.hwbasemgr.CloudUrlManager
    public String getMccCountryCode() {
        String strJ = CommonUtil.j(f36551a);
        return TextUtils.isEmpty(strJ) ? Locale.getDefault().getCountry() : strJ;
    }

    @Override // com.huawei.hwbasemgr.CloudUrlManager
    public String getNoCheckUrl(String str, String str2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com.huawei.hwlogsmodel.LogUtil.j("GRSManager", "getNoCheckUrl  ANR!!!");
        }
        return getNoCheckUrl(str, loo.e(str) + e, str2);
    }

    @Override // com.huawei.hwbasemgr.CloudUrlManager
    public String getNoCheckUrl(String str, String str2, String str3) {
        if (e(str)) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("R_GRS_GRSManager", "getNoCheckUrl no authorize");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = getCountryCode();
        }
        return c(a(f36552b, str3), str3, str2, str);
    }

    private String c(GrsClient grsClient, String str, String str2, String str3) {
        String str4;
        String strSynGetGrsUrl = grsClient.synGetGrsUrl(str2, str3);
        if (loo.e(str3, str)) {
            String str5 = loo.c(str3, str) + e;
            String strSynGetGrsUrl2 = grsClient.synGetGrsUrl(str5, str3);
            com.huawei.hwlogsmodel.LogUtil.a("GRSManager", "HealthGrsManager getKRGrsUrl [", str, "][", str5, "][", str3, "][", strSynGetGrsUrl2, "]");
            if (TextUtils.isEmpty(strSynGetGrsUrl2)) {
                str5 = str2;
            }
            str4 = str5;
            if (!TextUtils.isEmpty(strSynGetGrsUrl2)) {
                strSynGetGrsUrl = strSynGetGrsUrl2;
            }
        } else {
            str4 = str2;
        }
        com.huawei.hwlogsmodel.LogUtil.a("GRSManager", "HealthGrsManager getGrsUrl [", str, "][", str4, "][", str3, "][", strSynGetGrsUrl, "]");
        return strSynGetGrsUrl;
    }

    private GrsClient a(String str, String str2) {
        a(str2);
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setAppName(str);
        grsBaseInfo.setCountrySource(str2);
        grsBaseInfo.setSerCountry(str2);
        grsBaseInfo.setRegCountry(str2);
        grsBaseInfo.setVersionName(Build.VERSION.RELEASE);
        return new GrsClient(f36551a, grsBaseInfo);
    }

    private static void a(String str) {
        synchronized (GRSManager.class) {
            if (TextUtils.isEmpty(d) || !d.equals(str)) {
                d = str;
                BaseApplication.b().getSharedPreferences("grs_init_info", 0).edit().putString("grs_countrycode_key", str).apply();
            }
        }
    }

    public String d() {
        String accountInfo = LoginInit.getInstance(f36551a).getAccountInfo(1010);
        if (!Utils.k() && !TextUtils.isEmpty(accountInfo)) {
            com.huawei.hwlogsmodel.LogUtil.j("GRSManager", "getCommonCountryCode from step1");
            return accountInfo;
        }
        if (TextUtils.isEmpty(accountInfo)) {
            return e();
        }
        return "0".equals(LoginInit.getInstance(f36551a).getAccountInfo(1011)) ? e() : accountInfo;
    }

    @Override // com.huawei.hwbasemgr.CloudUrlManager
    public String getCommonCountryCode() {
        String accountInfo = LoginInit.getInstance(f36551a).getAccountInfo(1010);
        if (!TextUtils.isEmpty(accountInfo)) {
            com.huawei.hwlogsmodel.LogUtil.a("GRSManager", "getCommonCountryCode from step1");
            return accountInfo;
        }
        return e();
    }

    private String e() {
        String strJ = CommonUtil.j(f36551a);
        if (!TextUtils.isEmpty(strJ)) {
            com.huawei.hwlogsmodel.LogUtil.a("GRSManager", "getCommonCountryCode from step2");
            return strJ;
        }
        String strG = CommonUtil.g(f36551a);
        if (!TextUtils.isEmpty(strG)) {
            com.huawei.hwlogsmodel.LogUtil.a("GRSManager", "getCommonCountryCode from step4");
            return strG;
        }
        String country = Locale.getDefault().getCountry();
        if (!TextUtils.isEmpty(country)) {
            com.huawei.hwlogsmodel.LogUtil.a("GRSManager", "getCommonCountryCode from step5");
            return country;
        }
        String strE = SharedPreferenceManager.e(f36551a, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
        com.huawei.hwlogsmodel.LogUtil.a("GRSManager", "getCommonCountryCode from step6");
        return strE;
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class c {
        private static final GRSManager e = new GRSManager();
    }
}
