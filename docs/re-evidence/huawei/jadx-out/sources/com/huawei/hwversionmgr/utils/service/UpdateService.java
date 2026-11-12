package com.huawei.hwversionmgr.utils.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.huawei.haf.common.utils.PowerUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.hwversionmgr.selfupdate.appupdate.UpdateBase;
import com.huawei.hwversionmgr.utils.handler.AppDownloadHandler;
import com.huawei.ui.commonui.R;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import defpackage.nui;
import defpackage.num;
import defpackage.nuw;
import defpackage.nvb;
import defpackage.nvd;
import defpackage.nve;
import defpackage.nvf;
import defpackage.nvi;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class UpdateService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17763c;
    private Context e;
    private UpdateBase g;
    private HwVersionManager h;
    private int d = 2;
    private int f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17761a = 0;
    private CheckUpdateCallBack i = new CheckUpdateCallBack() { // from class: com.huawei.hwversionmgr.utils.service.UpdateService.5
        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(Intent intent) {
            UpdateService.this.c();
            if (intent == null) {
                ReleaseLogUtil.e("OTA_UpdateService", "mUpdateCallback onUpdateInfo: intent is null.");
                UpdateService.this.stopSelf();
                return;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                UpdateService.this.b(extras);
            } else {
                ReleaseLogUtil.e("OTA_UpdateService", "mUpdateCallback onUpdateInfo: bundle is null.");
                UpdateService.this.stopSelf();
            }
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(Intent intent) {
            UpdateService.this.c();
            UpdateService.this.stopSelf();
            ReleaseLogUtil.d("OTA_UpdateService", "mUpdateCallback onMarketInstallInfo");
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i) {
            UpdateService.this.c();
            UpdateService.this.stopSelf();
            ReleaseLogUtil.a("OTA_UpdateService", "mUpdateCallback onMarketStoreError: responseCode is ", Integer.valueOf(i));
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i) {
            UpdateService.this.c();
            UpdateService.this.stopSelf();
            ReleaseLogUtil.a("OTA_UpdateService", "mUpdateCallback onUpdateStoreError: responseCode is ", Integer.valueOf(i));
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i == 9) {
            return;
        }
        nvf.a().e();
        if (i == 3) {
            nvf.a().d(this.e.getString(R.string.IDS_update_download_failed), this.e.getString(R.string.IDS_update_network_error));
        } else if (i == 1) {
            nvf.a().d(this.e.getString(R.string.IDS_update_download_failed), this.e.getString(R.string.IDS_update_download_check_failed));
        } else {
            nvf.a().d(this.e.getString(R.string.IDS_update_download_failed), (String) null);
            this.g.c();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.e = getApplicationContext();
        LogUtil.a("OTA_UpdateService", "onCreate");
        this.g = new UpdateBase(this.e);
        this.h = HwVersionManager.b(this.e);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("OTA_UpdateService", "onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("OTA_UpdateService", "onStartCommand: intent = ", intent, " startId ", Integer.valueOf(i2));
        if (c(intent, i2)) {
            return 2;
        }
        b(i2, "handleIntent");
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        LogUtil.a("OTA_UpdateService", "onTaskRemoved");
        nvf nvfVarA = nvf.a();
        if (nvfVarA.d()) {
            nvfVarA.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        stopSelf(i);
        LogUtil.a("OTA_UpdateService", "clearTaskService: tag = ", str, " startId ", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bundle bundle) {
        int i = bundle.getInt("status", 0);
        LogUtil.a("OTA_UpdateService", "handleUpdateInfo:status is ", Integer.valueOf(i));
        if (i == 7) {
            if (bundle.get(UpdateKey.INFO) instanceof ApkUpgradeInfo) {
                ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) bundle.get(UpdateKey.INFO);
                this.f17763c = apkUpgradeInfo.getVersion_();
                this.f17762b = apkUpgradeInfo.getSize_();
                String newFeatures_ = apkUpgradeInfo.getNewFeatures_();
                num numVarA = a(apkUpgradeInfo, newFeatures_);
                nuw.g(BaseApplication.getAppPackage());
                nvd.i(this.f17763c, this.e);
                nvd.g(numVarA.v(), this.e);
                if (this.d != 0) {
                    nvi.c(12, this.f17762b, this.f17763c, "", 0);
                    nvi.c(32, 0, newFeatures_, "", 0);
                } else {
                    d(newFeatures_);
                    nvi.c(13, 5, "", "", 0);
                }
                if (CommonUtil.bg() && !nvd.j()) {
                    nvb.c(this.e, apkUpgradeInfo, false);
                }
            } else {
                ReleaseLogUtil.e("OTA_UpdateService", "handleUpdateInfo: apkUpgradeInfo is null");
                stopSelf();
                return;
            }
        } else if (this.d == 0) {
            nvi.e(6);
            nvi.c(11, 0, "", "", 0);
        } else if (i == 3) {
            nvi.c(11, 0, "", "", 0);
        } else if (i == 2) {
            nvi.c(11, 1, "", "", 0);
        } else {
            nvi.c(11, 3, "", "", 0);
        }
        stopSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public num a(ApkUpgradeInfo apkUpgradeInfo, String str) {
        num numVarB = nuw.b();
        numVarB.q(this.f17763c);
        numVarB.b(this.f17762b);
        numVarB.e(str);
        numVarB.t(String.valueOf(apkUpgradeInfo.getVersionCode_()));
        numVarB.k(BaseApplication.getAppPackage() + "." + this.f17763c + ".apk");
        numVarB.a(apkUpgradeInfo.getDownurl_());
        numVarB.j(apkUpgradeInfo.getSha256_());
        return numVarB;
    }

    private void d(String str) {
        nvi.d(new nvi.d(5).c(this.f17763c).e(this.f17762b).b(str).d("").c(0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    private boolean c(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        ReleaseLogUtil.d("OTA_UpdateService", "handleIntent: action = ", action);
        if (action == null) {
            return false;
        }
        action.hashCode();
        switch (action) {
            case "action_cancel_download_app":
                LogUtil.a("OTA_UpdateService", "handleIntent, cancel download app!");
                this.g.c();
                return false;
            case "action_app_no_dialog_download_new_version":
            case "action_app_manual_update_new_version":
            case "action_app_auto_check_new_version":
            case "action_app_download_new_version":
            case "action_app_install_new_version":
                return b(action, i);
            case "action_app_update_success":
            case "action_app_update_failed":
                return false;
            default:
                LogUtil.a("OTA_UpdateService", "handleIntent, default branch");
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    private boolean b(String str, int i) {
        byte b2;
        if (CommonUtil.cj()) {
            ReleaseLogUtil.e("OTA_UpdateService", "handleAppAction invalid version");
            return false;
        }
        str.hashCode();
        switch (str) {
            case "action_app_no_dialog_download_new_version":
                b2 = 0;
                break;
            case "action_app_manual_update_new_version":
                b2 = 1;
                break;
            case "action_app_auto_check_new_version":
                b2 = 2;
                break;
            case "action_app_download_new_version":
                b2 = 3;
                break;
            case "action_app_install_new_version":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            d(i);
        } else if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 == 4) {
                        nvi.a(this.e, this.h, this.g);
                        return false;
                    }
                    ReleaseLogUtil.e("OTA_UpdateService", "handleAppAction unknown action");
                    return false;
                }
                c(i);
            } else if (!e()) {
                return false;
            }
        } else if (!a()) {
            return false;
        }
        return true;
    }

    private void d(final int i) {
        nve.e(this.e, false, new CheckUpdateCallBack() { // from class: com.huawei.hwversionmgr.utils.service.UpdateService.1
            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketInstallInfo(Intent intent) {
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketStoreError(int i2) {
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateStoreError(int i2) {
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateInfo(Intent intent) {
                if (intent == null || intent.getExtras() == null) {
                    ReleaseLogUtil.e("OTA_UpdateService", "checkDownloadFile handleAppAction action.");
                    return;
                }
                Bundle extras = intent.getExtras();
                if (extras.getInt("status", 0) != 7) {
                    ReleaseLogUtil.e("OTA_UpdateService", "checkDownloadFile: apkUpgradeInfo is not need refresh.");
                    return;
                }
                if (extras.get(UpdateKey.INFO) instanceof ApkUpgradeInfo) {
                    ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) extras.get(UpdateKey.INFO);
                    if (apkUpgradeInfo == null) {
                        ReleaseLogUtil.e("OTA_UpdateService", "checkDownloadFile: apkUpgradeInfo is null.");
                        return;
                    }
                    UpdateService.this.f17763c = apkUpgradeInfo.getVersion_();
                    UpdateService.this.f17762b = apkUpgradeInfo.getSize_();
                    UpdateService.this.a(apkUpgradeInfo, apkUpgradeInfo.getNewFeatures_());
                    UpdateService.this.c(i);
                }
            }
        });
    }

    private boolean e() {
        this.d = 0;
        if (nvb.c() && nvb.a()) {
            ReleaseLogUtil.d("OTA_UpdateService", "handleAppAutoUpdateAction auto check switch is on");
            if (CommonUtil.bh() && !nvd.j()) {
                nvb.a(this.e, this.i, false, nvb.d(), false);
            } else {
                nve.e(this.e, true, this.i);
            }
            return true;
        }
        ReleaseLogUtil.d("OTA_UpdateService", "handleAppAutoUpdateAction auto check switch is off");
        return false;
    }

    private boolean a() {
        this.d = 2;
        if (nvb.a()) {
            ReleaseLogUtil.d("OTA_UpdateService", "handleAppManualUpdateAction update switch is on");
            if (CommonUtil.bh() && !nvd.j()) {
                nvb.a(this.e, BaseApplication.getAppPackage(), this.i);
                return true;
            }
            nve.e(this.e, false, this.i);
            return true;
        }
        ReleaseLogUtil.d("OTA_UpdateService", "handleAppManualUpdateAction update switch is off");
        return false;
    }

    private void i(int i) {
        LogUtil.a("OTA_UpdateService", "enter startBatteryCheck");
        if (d()) {
            String string = this.e.getString(R.string.IDS_settings_firmware_upgrade_phone_low_battery);
            if (qrs.ah(BaseApplication.getContext())) {
                string = this.e.getString(R.string.IDS_pad_phone_low_battery, UnitUtil.e(10.0d, 2, 0));
            }
            nvi.c(22, 4, "", "", 0);
            nvf.a().e();
            nvf.a().d(this.e.getString(R.string.IDS_update_download_failed), string);
            this.g.c();
            b(i, "startBatteryCheck");
            return;
        }
        b(i);
    }

    private void b(int i) {
        if (this.f == 2) {
            this.g.downloadFile(new b(i), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.f = 2;
        boolean zA = nvi.a(2, this.h);
        LogUtil.a("OTA_UpdateService", "downloadFile: isNewVersionExist = ", Boolean.valueOf(zA));
        if (zA && nvi.e(this.h)) {
            nvi.c(23, 0, "", "", 0);
            stopSelf(i);
        } else {
            a(i);
        }
    }

    private boolean d() {
        int iA = PowerUtil.a(this.e);
        if (iA >= 10 || iA == -1 || PowerUtil.c(this.e)) {
            return false;
        }
        ReleaseLogUtil.e("OTA_UpdateService", "MIN_PHONE_BATTERY_LEVEL not autoDownload");
        return true;
    }

    private void a(int i) {
        nvi.c(20, -1, "", "", 0);
        nvf.a().e();
        nvf.a().e(this.e.getString(R.string.IDS_app_update_updating), 0);
        i(i);
    }

    class b extends AppDownloadHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17766b;

        b(int i) {
            this.f17766b = i;
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doDownloadFailed(int i) {
            ReleaseLogUtil.a("OTA_UpdateService", "ManualAppDownloadHandler: doDownloadFailed");
            nvi.c(22, i, "", "", 0);
            UpdateService.this.e(i);
            UpdateService.this.b(this.f17766b, "ManualAppDownloadHandler doDownloadFailed");
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doDownloadSuccess(nui nuiVar) {
            if (nuiVar == null) {
                UpdateService.this.b(this.f17766b, "ManualAppDownloadHandler doDownloadSuccess appDownloadInfo == null");
                return;
            }
            String strA = nuiVar.a();
            if (nvi.e(UpdateService.this.e, strA)) {
                UpdateService.this.h.s(strA);
                nvf.a().b();
                nvi.a(UpdateService.this.e, UpdateService.this.h, UpdateService.this.g);
                nvi.c(23, 0, "", "", 0);
                UpdateService.this.b(this.f17766b, "ManualAppDownloadHandler doDownloadSuccess");
                return;
            }
            nvi.c(22, 47, "", "", 0);
            UpdateService.this.b(this.f17766b, "ManualAppDownloadHandler doDownloadSuccess isSameApkSignatures");
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doInDownloadProgress(nui nuiVar) {
            int iC;
            if (nuiVar == null) {
                return;
            }
            LogUtil.a("OTA_UpdateService", "ManualAppDownloadHandler doInDownloadProgress total=", Long.valueOf(nuiVar.d()), ",CurrentProgress=", Long.valueOf(nuiVar.c()));
            if (nuiVar.d() == 0 || (iC = (int) ((nuiVar.c() * 100) / nuiVar.d())) == UpdateService.this.f17761a) {
                return;
            }
            UpdateService.this.f17761a = iC;
            nvf.a().e(UpdateService.this.e.getString(R.string.IDS_app_update_updating), iC);
            nvi.c(21, iC, "", "", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.d == 0) {
            SharedPreferenceManager.e(this.e, String.valueOf(10023), "key_last_check_timestamp", String.valueOf(System.currentTimeMillis()), null);
        }
    }
}
