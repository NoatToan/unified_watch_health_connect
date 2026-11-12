package com.huawei.hwversionmgr.manager;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.utils.service.UpdateService;
import defpackage.eey;
import defpackage.num;
import defpackage.nuv;
import defpackage.nvb;
import defpackage.nvd;
import health.compact.a.CommonUtil;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class HwVersionManager extends HwBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile HwVersionManager f17749b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f17750a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f17751c;
    private boolean e;

    public HwVersionManager(Context context) {
        super(context);
        this.e = false;
        this.f17750a = false;
        this.f17751c = context;
    }

    public static HwVersionManager b(Context context) {
        if (f17749b == null) {
            synchronized (d) {
                if (f17749b == null) {
                    f17749b = new HwVersionManager(BaseApplication.getContext());
                }
            }
        }
        return f17749b;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 1003;
    }

    public boolean c(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 183);
    }

    public boolean f() {
        return this.e;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public boolean h() {
        return this.f17750a;
    }

    public void e(boolean z) {
        this.f17750a = z;
    }

    public void d(boolean z) {
        LogUtil.a("OTA_HwVersionManager", "checkAppNewVersionService", Boolean.valueOf(z));
        if (CommonUtil.ap()) {
            j(z);
            return;
        }
        Intent intent = new Intent(this.f17751c, (Class<?>) UpdateService.class);
        if (z) {
            if (nvb.b()) {
                intent.setAction("action_app_auto_check_new_version");
            } else {
                LogUtil.j("OTA_HwVersionManager", "checkAppNewVersionService canAutoCheckNewVersion is false.");
                return;
            }
        } else {
            intent.setAction("action_app_manual_update_new_version");
        }
        try {
            this.f17751c.startService(intent);
        } catch (IllegalStateException e) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "OTA_HwVersionManager", ExceptionUtils.c(e));
        }
    }

    private void j(boolean z) {
        if (z && !nvb.b()) {
            LogUtil.j("OTA_HwVersionManager", "checkNewBetaVersion canAutoCheckNewVersion is false.");
            return;
        }
        if (CommonUtil.e(this.f17751c) != CommonUtil.j(nvd.d(this.f17751c))) {
            nvd.i("", this.f17751c);
        }
        nvb.a(z);
    }

    public void c() {
        LogUtil.d("OTA_HwVersionManager", "downloadPackage");
        c(true);
    }

    public void e() {
        LogUtil.d("OTA_HwVersionManager", "downloadPackage");
        Intent intent = new Intent(this.f17751c, (Class<?>) UpdateService.class);
        intent.setAction("action_app_no_dialog_download_new_version");
        try {
            this.f17751c.startService(intent);
        } catch (IllegalStateException e) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "OTA_HwVersionManager", ExceptionUtils.c(e));
        }
    }

    public void c(boolean z) {
        LogUtil.d("OTA_HwVersionManager", "downloadPackage");
        Intent intent = new Intent(this.f17751c, (Class<?>) UpdateService.class);
        if (z) {
            intent.setAction("action_app_download_new_version");
        } else {
            intent.setAction("action_band_download_new_version");
        }
        try {
            this.f17751c.startService(intent);
        } catch (IllegalStateException e) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "OTA_HwVersionManager", ExceptionUtils.c(e));
        }
    }

    public void b() {
        LogUtil.d("OTA_HwVersionManager", "cancelDownload");
        Intent intent = new Intent(this.f17751c, (Class<?>) UpdateService.class);
        intent.setAction("action_cancel_download_app");
        try {
            this.f17751c.startService(intent);
        } catch (IllegalStateException e) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "OTA_HwVersionManager", ExceptionUtils.c(e));
        }
    }

    public String t(String str) {
        return nvd.n(str);
    }

    public boolean i() {
        String strD = nvd.d(this.f17751c);
        LogUtil.a("OTA_HwVersionManager", "haveNewAppVersion: newVersionCode = ", strD);
        if (!TextUtils.isEmpty(strD)) {
            int iE = CommonUtil.e(this.f17751c);
            int iJ = CommonUtil.j(strD);
            if (CommonUtil.ap()) {
                if (iE <= iJ && !TextUtils.isEmpty(nvd.b(this.f17751c))) {
                    return true;
                }
            } else {
                String strB = nvd.b(this.f17751c);
                LogUtil.a("OTA_HwVersionManager", "haveNewAppVersion: newVersionName = ", strB);
                if (!TextUtils.isEmpty(strB) && (!strB.contains("Beta") ? !CommonUtil.ap() : !CommonUtil.af(this.f17751c))) {
                    LogUtil.a("OTA_HwVersionManager", "haveNewAppVersion: newCode = ", Integer.valueOf(iJ), ", code = ", Integer.valueOf(iE));
                    if (iE < iJ) {
                        return true;
                    }
                    nvd.g(String.valueOf(iE), this.f17751c);
                    return false;
                }
            }
        }
        return false;
    }

    public boolean o(String str) {
        String strI = nvd.i(this.f17751c, str);
        LogUtil.d("OTA_HwVersionManager", "haveNewBandVersion: newVersion = ", strI);
        if (TextUtils.isEmpty(strI)) {
            return false;
        }
        String strF = nvd.f(this.f17751c, str);
        LogUtil.d("OTA_HwVersionManager", "haveNewBandVersion: version = ", strF);
        return !strI.equals(strF);
    }

    public boolean d(String str, String str2) throws Throwable {
        String strG = g(str);
        if (TextUtils.isEmpty(strG) || !new File(strG).exists()) {
            LogUtil.j("OTA_HwVersionManager", "isUpgradeFileValid isNewVersionExit is false.");
            return false;
        }
        num numVarI = i(str2);
        String strR = numVarI.r();
        String strH = numVarI.h();
        if (!TextUtils.isEmpty(strR)) {
            if (strR.equalsIgnoreCase(CommonUtil.k(strG))) {
                LogUtil.a("OTA_HwVersionManager", "isUpgradeFileValid verify sha256 success.");
                return true;
            }
            LogUtil.j("OTA_HwVersionManager", "isUpgradeFileValid verify sha256 failed.");
            return false;
        }
        String strE = nuv.e(strG);
        if (!TextUtils.isEmpty(strH) && strH.equalsIgnoreCase(strE)) {
            LogUtil.a("OTA_HwVersionManager", "isUpgradeFileValid verify md5 success.");
            return true;
        }
        LogUtil.j("OTA_HwVersionManager", "isUpgradeFileValid verify md5 failed.");
        return false;
    }

    public void b(String str) {
        nvd.a(this.f17751c, str);
    }

    public String j(String str) {
        LogUtil.d("OTA_HwVersionManager", "enter getCheckNewBandVersion");
        return nvd.i(this.f17751c, str);
    }

    public String c(String str) {
        LogUtil.d("OTA_HwVersionManager", "enter getBandOsNewVersion");
        return nvd.n(this.f17751c, str);
    }

    public String h(String str) {
        LogUtil.d("OTA_HwVersionManager", "enter getCheckNewBandVersionId");
        return nvd.h(this.f17751c, str);
    }

    public String g(String str) {
        return nvd.m(this.f17751c, str);
    }

    public void i(String str, String str2) {
        nvd.j(str, str2, this.f17751c);
    }

    public String e(String str) {
        return nvd.f(this.f17751c, str);
    }

    public void e(String str, String str2) {
        nvd.g(str, str2, this.f17751c);
    }

    public String a() {
        return nvd.k(this.f17751c);
    }

    public void p(String str) {
        nvd.k(str, this.f17751c);
    }

    public String f(String str) {
        return nvd.c(str, this.f17751c);
    }

    public String d() {
        return nvd.e(this.f17751c);
    }

    public void s(String str) {
        nvd.h(str, this.f17751c);
    }

    public void k(String str) {
        LogUtil.d("OTA_HwVersionManager", "resetBandUpdate");
        nvd.t(this.f17751c, str);
    }

    public void l(String str) {
        LogUtil.a("OTA_HwVersionManager", "resetBandUpdateForEnd");
        b(str);
        nvd.b(this.f17751c, false);
        nvd.b("", str, this.f17751c);
        nvd.a("", str, this.f17751c);
        nvd.h("", str, this.f17751c);
        nvd.c("", str, this.f17751c);
        nvd.f(str, "", this.f17751c);
    }

    public void b(boolean z, boolean z2) {
        LogUtil.a("OTA_HwVersionManager", "reportStatus isApp: ", Boolean.valueOf(z), " isSuccess: ", Boolean.valueOf(z2));
        Intent intent = new Intent(this.f17751c, (Class<?>) UpdateService.class);
        if (z) {
            if (z2) {
                intent.setAction("action_app_update_success");
            } else {
                intent.setAction("action_app_update_failed");
            }
        }
        try {
            this.f17751c.startService(intent);
        } catch (IllegalStateException e) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "OTA_HwVersionManager", ExceptionUtils.c(e));
        }
    }

    public void a(boolean z) {
        nvd.c(z);
    }

    public void a(String str, String str2) {
        nvd.g(str);
        nvd.h(str2);
    }

    public boolean m(String str) {
        if (nvd.h(this.f17751c)) {
            return TextUtils.equals(str, nvd.d()) || TextUtils.equals(str, nvd.c());
        }
        return false;
    }

    public boolean n(String str) {
        return (!nvd.h(this.f17751c) || TextUtils.equals(str, nvd.d()) || TextUtils.equals(str, nvd.c())) ? false : true;
    }

    public void c(num numVar, String str) {
        nvd.e(this.f17751c, numVar, str);
    }

    public num i(String str) {
        return nvd.l(this.f17751c, str);
    }

    public String d(String str) {
        return nvd.e(this.f17751c, str);
    }

    public void b(String str, String str2) {
        nvd.f(this.f17751c, str, str2);
    }

    public String a(String str) {
        return nvd.c(this.f17751c, str);
    }

    public void c(String str, String str2) {
        nvd.j(this.f17751c, str, str2);
    }
}
