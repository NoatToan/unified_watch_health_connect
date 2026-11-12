package com.huawei.hwversionmgr.selfupdate.appupdate;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler;
import com.huawei.hwversionmgr.utils.handler.AppDownloadHandler;
import com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler;
import defpackage.eei;
import defpackage.nus;
import defpackage.nuw;
import defpackage.nux;
import defpackage.nvd;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class UpdateBase implements Update {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DeviceInfo f17752a = null;
    private static int d = -1;
    private static boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f17753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected nux f17754c = new nux();

    public UpdateBase(Context context) {
        this.f17753b = context;
    }

    public static void a(DeviceInfo deviceInfo) {
        f17752a = deviceInfo;
    }

    public static void b(int i) {
        d = i;
    }

    public static void b(boolean z) {
        e = z;
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void checkAppNewVersion(String str, AppCheckNewVersionHandler appCheckNewVersionHandler) {
        LogUtil.d("UpdateBase", "checkAppNewVersion() handler = ", appCheckNewVersionHandler);
        nuw.d(nuw.b(false));
        PackageInfo packageInfoD = d();
        if (packageInfoD == null) {
            if (appCheckNewVersionHandler != null) {
                appCheckNewVersionHandler.handleCheckFailed(3);
                return;
            }
            return;
        }
        nus nusVar = new nus();
        nusVar.e("");
        nusVar.a(true);
        nusVar.e(false);
        nusVar.b("");
        nusVar.a("");
        this.f17754c.b(packageInfoD, nusVar, this.f17753b, appCheckNewVersionHandler);
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void checkBandNewVersion(int i, String str, String str2, AppCheckNewVersionHandler appCheckNewVersionHandler) {
        LogUtil.d("UpdateBase", "checkBandNewVersion() type = ", Integer.valueOf(i), ", version = ", str, ", handler = ", appCheckNewVersionHandler);
        checkBandNewVersion(i, str, str2, false, appCheckNewVersionHandler);
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void checkBandNewVersion(int i, String str, String str2, boolean z, AppCheckNewVersionHandler appCheckNewVersionHandler) {
        LogUtil.d("UpdateBase", "checkBandNewVersion() type = ", Integer.valueOf(i), ", version = ", str, ", handler = ", appCheckNewVersionHandler, ", isEnterprise = ", Boolean.valueOf(z));
        boolean zD = eei.d(f17752a);
        if (CommonUtil.ap() && TextUtils.equals(nvd.i(BaseApplication.getContext()), "test_mode") && !zD) {
            LogUtil.a("UpdateBase", "checkBandNewVersion() Url.CHECK_TEST_VERSION_URL=", "");
            nuw.d("/ring2/v2/" + nuw.c(z));
        } else {
            nuw.d(nuw.c(zD, z));
        }
        PackageInfo packageInfoC = c(str2, i, str);
        if (packageInfoC == null) {
            if (appCheckNewVersionHandler != null) {
                appCheckNewVersionHandler.handleCheckFailed(3);
                return;
            }
            return;
        }
        nus nusVar = new nus();
        nusVar.e(str2);
        nusVar.a(false);
        nusVar.e(z);
        DeviceInfo deviceInfo = f17752a;
        if (deviceInfo != null) {
            nusVar.d(TextUtils.isEmpty(deviceInfo.getCertModel()) ? f17752a.getDeviceModel() : f17752a.getCertModel());
            nusVar.b(f17752a.getDeviceModel());
            nusVar.a(nvd.d(BaseApplication.getContext(), f17752a.getDeviceIdentify()));
            nusVar.c(f17752a.getDeviceIdentify());
            nusVar.d(d);
        }
        this.f17754c.b(packageInfoC, nusVar, this.f17753b, appCheckNewVersionHandler);
    }

    public PackageInfo c(String str, int i, String str2) {
        LogUtil.d("UpdateBase", "getBandPackageInfo() type=", Integer.valueOf(i), ", version = ", str2);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        PackageInfo packageInfo = new PackageInfo();
        if (i == 1) {
            packageInfo.packageName = "com.huawei.btwo.firmware";
        } else if (i == 5) {
            packageInfo.packageName = "com.huawei.bzero.firmware";
        } else if (i == 15) {
            packageInfo.packageName = "com.huawei.Eris.firmware";
        } else if (i == 7) {
            packageInfo.packageName = "com.huawei.gemini.firmware";
        } else if (i == 8) {
            packageInfo.packageName = "com.huawei.metis.firmware";
        } else if (i == 12) {
            packageInfo.packageName = "com.huawei.aonepro.firmware";
        } else if (i == 13) {
            packageInfo.packageName = "com.huawei.nyx.firmware";
        } else {
            String strC = c(str, i);
            if (TextUtils.isEmpty(strC)) {
                return null;
            }
            packageInfo.packageName = strC;
        }
        if (!TextUtils.isEmpty(HwVersionManager.b(this.f17753b).f(str))) {
            packageInfo.packageName = HwVersionManager.b(this.f17753b).f(str);
        }
        packageInfo.versionCode = 0;
        packageInfo.versionName = str2;
        return packageInfo;
    }

    private String c(String str, int i) {
        if (i == 14) {
            return "com.huawei.grus.firmware";
        }
        if (i == 16) {
            return "com.huawei.Janus.firmware";
        }
        if (i == 23) {
            return "com.huawei.AW70B29.firmware";
        }
        if (i == 24) {
            return "com.huawei.AW70B19.firmware";
        }
        if (i == 36) {
            return "com.huawei.AW70B39.firmware";
        }
        if (i != 37) {
            switch (i) {
                case 18:
                    return "com.huawei.Crius.firmware";
                case 19:
                    return "com.huawei.Terra.firmware";
                case 20:
                    return "com.huawei.Talos.firmware";
                case 21:
                    return "com.huawei.Fortuna.firmware";
                default:
                    return HwVersionManager.b(this.f17753b).f(str);
            }
        }
        return "com.huawei.AW70B39HN.firmware";
    }

    private PackageInfo d() {
        try {
            return this.f17753b.getPackageManager().getPackageInfo(this.f17753b.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("UpdateBase", "getAppPackageInfo PackageManager.NameNotFoundException");
            return null;
        }
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void fetchChangeLog(AppPullChangeLogHandler appPullChangeLogHandler, boolean z) {
        this.f17754c.e(this.f17753b, appPullChangeLogHandler, z, false, false);
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void saveChangeLog(AppPullChangeLogHandler appPullChangeLogHandler, String str, String str2, boolean z) {
        this.f17754c.c(this.f17753b, appPullChangeLogHandler, z, str, str2);
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void saveAw70ChangeLog(AppPullChangeLogHandler appPullChangeLogHandler, String str, String str2, boolean z) {
        this.f17754c.d(this.f17753b, appPullChangeLogHandler, z, str, str2);
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void fetchAw70ChangeLog(AppPullChangeLogHandler appPullChangeLogHandler, boolean z) {
        this.f17754c.e(this.f17753b, appPullChangeLogHandler, z, true, false);
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void fetchScaleChangeLog(AppPullChangeLogHandler appPullChangeLogHandler, boolean z) {
        this.f17754c.e(this.f17753b, appPullChangeLogHandler, z, false, true);
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void downloadFile(AppDownloadHandler appDownloadHandler, boolean z) {
        this.f17754c.a(this.f17753b, appDownloadHandler, z, false, false);
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void downloadAw70File(AppDownloadHandler appDownloadHandler, boolean z) {
        this.f17754c.a(this.f17753b, appDownloadHandler, z, true, false);
    }

    @Override // com.huawei.hwversionmgr.selfupdate.appupdate.Update
    public void downloadScaleFile(AppDownloadHandler appDownloadHandler, boolean z) {
        this.f17754c.a(this.f17753b, appDownloadHandler, z, false, true);
    }

    public void e(String str, String str2) {
        String packageName = this.f17753b.getPackageName();
        LogUtil.d("UpdateBase", "install: path = ", str, ", version = ", str2, ", packageName = ", packageName);
        this.f17754c.b(this.f17753b, str, packageName);
    }

    public void c() {
        this.f17754c.e();
    }

    public void d(String str, String str2, AppCheckNewVersionHandler appCheckNewVersionHandler, String str3) {
        ReleaseLogUtil.d("R_Weight_UpdateBase", "checkScaleBandNewVersion productId:", CommonUtil.n(str), ", version = ", str2);
        if (d(str)) {
            if (CommonUtil.ap() && TextUtils.equals(nvd.i(BaseApplication.getContext()), "test_mode") && !e) {
                LogUtil.a("UpdateBase", "checkScaleBandNewVersion() Url.CHECK_TEST_VERSION_URL=", "");
                nuw.a("/ring2/v2/CheckEx.action?ruleAttr=true");
            } else {
                nuw.a(nuw.b(e));
            }
        } else {
            nuw.a("https://query.hicloud.com/accessory/v2/checkEx.action");
        }
        PackageInfo packageInfoC = c(str, str2);
        if (packageInfoC != null) {
            this.f17754c.c(packageInfoC, this.f17753b, appCheckNewVersionHandler, str, str3);
        } else if (appCheckNewVersionHandler != null) {
            appCheckNewVersionHandler.handleCheckFailed(3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    private boolean d(String str) {
        byte b2;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4":
                b2 = 0;
                break;
            case "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4":
                b2 = 1;
                break;
            case "e835d102-af95-48a6-ae13-2983bc06f5c0":
                b2 = 2;
                break;
            case "c943c933-442e-4c34-bcd0-66597f24aaed":
                b2 = 3;
                break;
            case "b29df4e3-b1f7-4e40-960d-4cfb63ccca05":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        return b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4;
    }

    private PackageInfo c(String str, String str2) {
        LogUtil.a("UpdateBase", "getScaleBandPackageInfo productId:", CommonUtil.n(str), ", version = ", str2);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        PackageInfo packageInfo = new PackageInfo();
        if ("34fa0346-d46c-439d-9cb0-2f696618846b".equals(str)) {
            packageInfo.packageName = "com.huawei.ch18";
        } else if ("33123f39-7fc1-420b-9882-a4b0d6c61100".equals(str)) {
            packageInfo.packageName = "com.huawei.ch100";
        } else if ("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f".equals(str)) {
            packageInfo.packageName = "com.huawei.ah100";
        } else if ("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4".equals(str)) {
            packageInfo.packageName = "com.huawei.Lupin.firmware";
        } else if ("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4".equals(str)) {
            packageInfo.packageName = "com.huawei.Hagrid.firmware";
        } else if ("b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(str)) {
            packageInfo.packageName = "com.huawei.Hagrid-B29.firmware";
        } else if ("e835d102-af95-48a6-ae13-2983bc06f5c0".equals(str)) {
            packageInfo.packageName = "com.huawei.Herm-B19.firmware";
        } else if ("c943c933-442e-4c34-bcd0-66597f24aaed".equals(str)) {
            packageInfo.packageName = "com.huawei.Dobby-B19.firmware";
        } else {
            LogUtil.j("UpdateBase", "getScaleBandPackageInfo other productId.");
        }
        packageInfo.versionCode = 0;
        packageInfo.versionName = str2;
        return packageInfo;
    }
}
