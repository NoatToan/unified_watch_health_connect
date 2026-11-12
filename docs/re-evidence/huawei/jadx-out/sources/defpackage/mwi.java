package defpackage;

import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class mwi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f42564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile mwm f42565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReentrantReadWriteLock f42566c;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final mwi f42567a = new mwi();
    }

    private mwi() {
        this.f42564a = Pattern.compile("^(\\d+(\\.\\d+)*)");
        this.f42566c = new ReentrantReadWriteLock();
    }

    public static mwi a() {
        return b.f42567a;
    }

    public void b() {
        HashMap map = new HashMap(1);
        map.put("deviceType", "notificationMonitor");
        fdy.d(new fda("com.huawei.health_common_config", map), "smart_sleep_ver2_config", f());
    }

    private static DownloadCallback<File> f() {
        return new DownloadCallback<File>() { // from class: mwi.1
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                LogUtil.a("HiAiSleepConfigManager", "updateMyHuaweiConfig onFinish, data is: ", file.getName());
                if (!file.exists() || !file.isFile()) {
                    LogUtil.j("HiAiSleepConfigManager", "updateMyHuaweiConfig: file not exist or is not a file");
                } else {
                    mwe.a().a((Boolean) true);
                    mwi.a().i();
                }
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str) {
                LogUtil.a("HiAiSleepConfigManager", "updateMyHuaweiConfig onProgress, handleBytes: ", Long.valueOf(j), ", contentLength: ", Long.valueOf(j2), ", isDone: ", Boolean.valueOf(z), ", fileId: ", str);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                LogUtil.a("HiAiSleepConfigManager", "updateMyHuaweiConfig on Fail: ", LogAnonymous.b(th), ", errCode: ", Integer.valueOf(i));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        mwm mwmVar;
        boolean zC = HandlerExecutor.c();
        LogUtil.a("HiAiSleepConfigManager", "enter parseAiSleepJsonFile isMainThread ", Boolean.valueOf(zC));
        if (zC) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mwh
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.i();
                }
            });
            return;
        }
        String strD = fdy.d("com.huawei.health_common_config", "smart_sleep_ver2_config", "json");
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("HiAiSleepConfigManager", "parseAiSleepJsonFile is null");
            return;
        }
        LogUtil.a("HiAiSleepConfigManager", "parseAiSleepJsonFile :", strD);
        String strA = pia.a(new File(strD));
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("HiAiSleepConfigManager", "parseAiSleepJsonFile urlJsonString is empty");
            return;
        }
        try {
            mwmVar = (mwm) HiJsonUtil.d(strA, mwm.class);
        } catch (Exception e) {
            LogUtil.e("HiAiSleepConfigManager", "parseConfig error: ", e.getMessage());
            mwmVar = null;
        }
        if (mwmVar == null) {
            LogUtil.a("HiAiSleepConfigManager", "refreshConfigFromSp newConfig is null");
        } else {
            this.f42565b = mwmVar;
            LogUtil.a("HiAiSleepConfigManager", "parseAiSleepJsonFile success:", this.f42565b.toString());
        }
    }

    private mwm.e d() {
        if (this.f42565b == null || mwe.a().n()) {
            mwe.a().a((Boolean) false);
            i();
        }
        if (this.f42565b != null) {
            return this.f42565b.a();
        }
        return null;
    }

    public boolean c() {
        if (Utils.o()) {
            ReleaseLogUtil.e("R_HiAiSleepConfigManager", "isOversea");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "HiAiSleepConfigManager");
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_HiAiSleepConfigManager", "currentDevice is null");
            return false;
        }
        boolean zC = cqd.c(deviceInfo, 336);
        ReleaseLogUtil.d("R_HiAiSleepConfigManager", "isSupportCheckMobileLight: ", Boolean.valueOf(zC));
        if (!zC) {
            return false;
        }
        String certModel = deviceInfo.getCertModel();
        String softVersion = deviceInfo.getSoftVersion();
        LogUtil.a("HiAiSleepConfigManager", "certModel:", certModel, ", deviceSoftVersion:", softVersion);
        if (TextUtils.isEmpty(certModel) || TextUtils.isEmpty(softVersion)) {
            ReleaseLogUtil.e("R_HiAiSleepConfigManager", "certModel or deviceSoftVersion is empty");
            return false;
        }
        boolean zE = e();
        LogUtil.a("HiAiSleepConfigManager", "isNoonTime:", Boolean.valueOf(zE));
        if (zE) {
            return a(certModel, softVersion);
        }
        return b(certModel, softVersion);
    }

    public static boolean e() {
        LocalTime localTimeNow = LocalTime.now();
        return (localTimeNow.isBefore(LocalTime.of(12, 0)) || localTimeNow.isAfter(LocalTime.of(15, 0))) ? false : true;
    }

    public boolean b(String str, String str2) {
        LogUtil.a("HiAiSleepConfigManager", "enter isNightSupport");
        mwm.e eVarD = d();
        if (eVarD == null || !eVarD.i()) {
            return false;
        }
        String strE = e(str, str2);
        LogUtil.a("HiAiSleepConfigManager", "version: " + strE);
        if (c(strE, eVarD.d())) {
            return true;
        }
        if (c(strE, eVarD.a())) {
            String strH = h();
            LogUtil.a("HiAiSleepConfigManager", "uidTailNumber: " + strH);
            return c(strH);
        }
        List<String> listE = eVarD.e();
        if (!njy.e(listE)) {
            String strC = c(str, str2);
            String str3 = str.split(Constants.LINK)[0];
            LogUtil.a("HiAiSleepConfigManager", "currentSupportVersion: ", strC, " ,currentCertModel: " + str3);
            for (String str4 : listE) {
                if (TextUtils.equals(str3, str4.split(" ")[0])) {
                    LogUtil.a("HiAiSleepConfigManager", "currentSupportVersion: ", strC, "minVersion: ", str4);
                    return strC.compareTo(str4) >= 0;
                }
            }
        }
        return eVarD.j();
    }

    public boolean a(String str, String str2) {
        LogUtil.a("HiAiSleepConfigManager", "enter isNoonSupport");
        mwm.e eVarD = d();
        if (eVarD == null || !eVarD.i() || !b(str, str2)) {
            return false;
        }
        String strE = e(str, str2);
        LogUtil.a("HiAiSleepConfigManager", "isNoonSupport version: " + strE);
        if (c(strE, eVarD.c())) {
            return true;
        }
        List<String> listB = eVarD.b();
        if (!njy.e(listB)) {
            String strC = c(str, str2);
            String str3 = str.split(Constants.LINK)[0];
            LogUtil.a("HiAiSleepConfigManager", "isNoonSupport currentSupportVersion: ", strC, " ,currentCertModel: " + str3);
            for (String str4 : listB) {
                if (TextUtils.equals(str3, str4.split(" ")[0])) {
                    LogUtil.a("HiAiSleepConfigManager", "isNoonSupport currentSupportVersion: ", strC, "minVersion: ", str4);
                    return strC.compareTo(str4) >= 0;
                }
            }
        }
        return eVarD.g();
    }

    private String e(String str, String str2) {
        LogUtil.a("HiAiSleepConfigManager", "buildVersionString model:", str, " ,version:", str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        return String.format("%s %s", str.split(Constants.LINK)[0], str2);
    }

    private String c(String str, String str2) {
        LogUtil.a("HiAiSleepConfigManager", "buildVersionString model:", str, " ,version:", str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        Matcher matcher = this.f42564a.matcher(str2);
        return matcher.find() ? String.format("%s %s", str.split(Constants.LINK)[0], matcher.group(1)) : "";
    }

    private boolean c(String str, List<String> list) {
        if (njy.e(list)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next())) {
                return true;
            }
        }
        return false;
    }

    private String h() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            return "";
        }
        return accountInfo.substring(accountInfo.length() - 1);
    }

    public boolean c(String str) {
        mwm.e eVarD;
        if (TextUtils.isEmpty(str) || (eVarD = d()) == null || njy.e(eVarD.f())) {
            return false;
        }
        return eVarD.f().contains(str);
    }
}
