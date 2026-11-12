package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.download.ThreadWrapper;
import com.huawei.hms.update.download.UpdateDownload;
import com.huawei.hms.update.download.api.IOtaUpdate;
import com.huawei.hms.update.download.api.IUpdateCallback;
import com.huawei.hms.update.download.api.UpdateInfo;
import com.huawei.hms.update.download.api.UpdateStatus;
import com.huawei.hms.update.manager.HmsApkReallySizeManager;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.NetWorkUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public class UpdateWizard extends AbsUpdateWizard implements IUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOtaUpdate f16861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UpdateInfo f16862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16863c = 0;
    private boolean d;
    private a e;
    private String f;

    static class a implements HmsApkReallySizeManager.CheckHmsApkSizeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final UpdateWizard f16870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AbstractDialog f16871b;

        public a(UpdateWizard updateWizard, AbstractDialog abstractDialog) {
            this.f16870a = updateWizard;
            this.f16871b = abstractDialog;
        }

        @Override // com.huawei.hms.update.manager.HmsApkReallySizeManager.CheckHmsApkSizeCallback
        public void onResult(String str) {
            this.f16870a.f = str;
            UpdateWizard updateWizard = this.f16870a;
            updateWizard.b(updateWizard, this.f16871b);
        }
    }

    private boolean a(int i) {
        return i == 9;
    }

    private boolean b(Activity activity) {
        if (this.bean.getResolutionInstallHMS()) {
            HMSLog.i("UpdateWizard", "getResolutionInstallHMS, status: true");
            return true;
        }
        if (HMSPackageManager.getInstance(activity).isApkUpdateNecessary(this.bean.getClientVersionCode())) {
            return true;
        }
        dismissDialog();
        SystemManager.getInstance().notifyUpdateResult(0);
        return false;
    }

    private void c() {
        if (startNextWizard(false)) {
            biReportEvent(8, this.updateType);
        } else {
            finishBridgeActivity(8, this.updateType);
        }
    }

    private void d() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            a(PromptDialogs.DownloadFailurePrompt.class);
        } else if (b(activity)) {
            a();
            ThreadWrapper threadWrapper = new ThreadWrapper(new UpdateDownload(activity));
            this.f16861a = threadWrapper;
            threadWrapper.downloadPackage(this, this.f16862b);
        }
    }

    void e() {
        finishBridgeActivity(13, this.updateType);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2006;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.bean == null) {
            finishBridgeActivity(8, 6);
            return;
        }
        this.updateType = 6;
        if (!b(activity)) {
            finishBridgeActivity(8, this.updateType);
        } else if (this.bean.isNeedConfirm() && !TextUtils.isEmpty(this.mClientAppName)) {
            a(InstallConfirm.class);
        } else {
            a(CheckProgress.class);
            a((IUpdateCallback) this);
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        a();
        super.onBridgeActivityDestroy();
        HmsApkReallySizeManager.getInstance().release();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.needTransfer && (iBridgeActivityDelegate = this.mBridgeActivityDelegate) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        if (this.updateType != 6 || i != getRequestCode()) {
            return false;
        }
        if (isUpdated(this.mPackageName, this.mClientVersionCode)) {
            finishBridgeActivity(0, this.updateType);
            return true;
        }
        c();
        return true;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onCancel(AbstractDialog abstractDialog) {
        HMSLog.i("UpdateWizard", "Enter onCancel.");
        if (abstractDialog instanceof InstallConfirm) {
            e();
            return;
        }
        if (abstractDialog instanceof CheckProgress) {
            a();
            e();
            return;
        }
        if (abstractDialog instanceof DownloadProgress) {
            a();
            a(ConfirmDialogs.StopConfirm.class);
            return;
        }
        if (abstractDialog instanceof ConfirmDialogs.StopConfirm) {
            a(DownloadProgress.class);
            d();
        } else if (abstractDialog instanceof ConfirmDialogs.RetryConfirm) {
            e();
        } else if (abstractDialog instanceof ConfirmDialogs.NetTypeConfirm) {
            e();
        } else {
            c();
        }
    }

    @Override // com.huawei.hms.update.download.api.IUpdateCallback
    public void onCheckUpdate(int i, UpdateInfo updateInfo) {
        HMSLog.i("UpdateWizard", "Enter onCheckUpdate, status: " + UpdateStatus.statusToString(i));
        if (i == 1000) {
            this.f16862b = updateInfo;
            b();
            return;
        }
        switch (i) {
            case 1201:
            case 1202:
            case 1203:
                a(PromptDialogs.CheckFailurePrompt.class);
                break;
            default:
                a(PromptDialogs.CheckFailurePrompt.class);
                break;
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onDoWork(AbstractDialog abstractDialog) {
        HMSLog.i("UpdateWizard", "Enter onDoWork.");
        if (abstractDialog instanceof InstallConfirm) {
            abstractDialog.dismiss();
            a(CheckProgress.class);
            a((IUpdateCallback) this);
            return;
        }
        if (abstractDialog instanceof ConfirmDialogs.StopConfirm) {
            abstractDialog.dismiss();
            e();
            return;
        }
        if (abstractDialog instanceof ConfirmDialogs.RetryConfirm) {
            a(DownloadProgress.class);
            d();
            return;
        }
        if (abstractDialog instanceof ConfirmDialogs.NetTypeConfirm) {
            a(DownloadProgress.class);
            d();
        } else if (abstractDialog instanceof PromptDialogs.CheckFailurePrompt) {
            c();
        } else if (abstractDialog instanceof PromptDialogs.DownloadFailurePrompt) {
            c();
        } else if (abstractDialog instanceof PromptDialogs.DownloadNoSpacePrompt) {
            c();
        }
    }

    @Override // com.huawei.hms.update.download.api.IUpdateCallback
    public void onDownloadPackage(int i, int i2, int i3, File file) {
        int i4;
        HMSLog.i("UpdateWizard", "Enter onDownloadPackage, status: " + UpdateStatus.statusToString(i) + ", reveived: " + i2 + ", total: " + i3);
        if (i == 2000) {
            dismissDialog();
            if (file == null) {
                c();
                return;
            } else if (FileUtil.verifyHash(this.f16862b.mHash, file)) {
                a(file);
                return;
            } else {
                HMSLog.i("UpdateWizard", "Hash value mismatch for download file");
                return;
            }
        }
        if (i != 2100) {
            switch (i) {
                case 2201:
                    a(PromptDialogs.DownloadFailurePrompt.class);
                    break;
                case 2202:
                    a(ConfirmDialogs.RetryConfirm.class);
                    break;
                case 2203:
                case 2204:
                    a(PromptDialogs.DownloadNoSpacePrompt.class);
                    break;
            }
            return;
        }
        AbstractDialog abstractDialog = this.mLatestDialog;
        if (abstractDialog == null || !(abstractDialog instanceof DownloadProgress)) {
            return;
        }
        if (i2 < 0 || i3 <= 0) {
            i4 = 0;
        } else {
            i4 = (int) ((((long) i2) * 100) / ((long) i3));
        }
        this.f16863c = i4;
        ((DownloadProgress) abstractDialog).a(i4);
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.needTransfer && (iBridgeActivityDelegate = this.mBridgeActivityDelegate) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
            return;
        }
        if (4 == i) {
            HMSLog.i("UpdateWizard", "In onKeyUp, Call finish.");
            Activity activity = getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.setResult(0, null);
            activity.finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r0.hasProvider(r1, r2) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Uri a(Context context, File file) {
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        String packageName = context.getPackageName();
        String str = packageName + UpdateProvider.AUTHORITIES_SUFFIX;
        try {
            if (context.getApplicationInfo().targetSdkVersion <= 23) {
            }
            return UpdateProvider.getUriForFile(context, str, file);
        } catch (RuntimeException e) {
            HMSLog.i("UpdateWizard", "In contentUriFromFile, getApplicationInfo error: " + e.getMessage());
        }
        return Uri.fromFile(file);
    }

    private void b() {
        int iA = a(getActivity());
        HMSLog.i("UpdateWizard", "current network is " + iA);
        if (iA != 1 && !a(iA)) {
            a(ConfirmDialogs.NetTypeConfirm.class);
            HMSLog.i("UpdateWizard", "current network is not wifi");
        } else {
            a(DownloadProgress.class);
            d();
            HMSLog.i("UpdateWizard", "current network is wifi");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(UpdateWizard updateWizard, AbstractDialog abstractDialog) {
        HMSLog.i("UpdateWizard", "<onResultShowDialog> start");
        boolean z = false;
        this.d = false;
        Activity activity = getActivity();
        boolean z2 = activity == null || activity.isFinishing() || activity.isDestroyed();
        AbstractDialog abstractDialog2 = this.mLatestDialog;
        if (abstractDialog2 != null && abstractDialog2.isShowing()) {
            z = true;
        }
        if (!z2 && !z) {
            if (!TextUtils.isEmpty(this.mClientAppName) && (abstractDialog instanceof InstallConfirm)) {
                String string = ResourceLoaderUtil.getString("hms_update_title");
                this.mClientAppName = string;
                InstallConfirm installConfirm = (InstallConfirm) abstractDialog;
                installConfirm.intAppName(string);
                installConfirm.setHmsApkSize(this.f);
            }
            abstractDialog.show(updateWizard);
            this.mLatestDialog = abstractDialog;
            return;
        }
        HMSLog.e("UpdateWizard", "<onResultShowDialog> Activity Destroyed or Dialog isShoing");
    }

    private static void a(final IUpdateCallback iUpdateCallback, final int i, final UpdateInfo updateInfo) {
        if (iUpdateCallback != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.hms.update.ui.UpdateWizard.1
                @Override // java.lang.Runnable
                public void run() {
                    iUpdateCallback.onCheckUpdate(i, updateInfo);
                }
            });
        }
    }

    private int a(Activity activity) {
        if (activity != null) {
            return NetWorkUtil.getNetworkType(activity);
        }
        return 0;
    }

    private void a(File file) {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        Uri uriA = a(activity, file);
        if (uriA == null) {
            HMSLog.e("UpdateWizard", "In startInstaller, Failed to creates a Uri from a file.");
            c();
        } else if (b(activity)) {
            try {
                activity.startActivityForResult(a(uriA, activity), getRequestCode());
            } catch (ActivityNotFoundException | SecurityException e) {
                HMSLog.e("UpdateWizard", "In startInstaller, Failed to start package installer." + e.getMessage());
                c();
            }
        }
    }

    private Intent a(Uri uri, Activity activity) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.setFlags(1);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", activity.getPackageName());
        return intent;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    void a(Class<? extends AbstractDialog> cls) {
        if (b(getActivity())) {
            dismissDialog();
            try {
                AbstractDialog abstractDialogNewInstance = cls.newInstance();
                if (abstractDialogNewInstance instanceof InstallConfirm) {
                    Activity activity = getActivity();
                    if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                        if (this.d) {
                            HMSLog.i("UpdateWizard", "<showDialog> isChecking true. return");
                            return;
                        }
                        String apkSize = HmsApkReallySizeManager.getInstance().getApkSize();
                        if (TextUtils.isEmpty(apkSize)) {
                            HMSLog.i("UpdateWizard", "<showDialog> checkAndShowDialog.");
                            a(this, abstractDialogNewInstance);
                            return;
                        }
                        this.f = apkSize;
                    }
                    HMSLog.e("UpdateWizard", "<checkHmsSizeAndShowDialog> not show Dialog, activity is null or finishing.");
                    return;
                }
                if (!TextUtils.isEmpty(this.mClientAppName) && (abstractDialogNewInstance instanceof InstallConfirm)) {
                    String string = ResourceLoaderUtil.getString("hms_update_title");
                    this.mClientAppName = string;
                    ((InstallConfirm) abstractDialogNewInstance).intAppName(string);
                    ((InstallConfirm) abstractDialogNewInstance).setHmsApkSize(this.f);
                }
                int i = this.f16863c;
                if (i > 0 && (abstractDialogNewInstance instanceof DownloadProgress)) {
                    ((DownloadProgress) abstractDialogNewInstance).intProgress(i);
                }
                if (abstractDialogNewInstance instanceof DownloadProgress) {
                    DownloadProgress downloadProgress = (DownloadProgress) abstractDialogNewInstance;
                    downloadProgress.setShowCancelBtn(true);
                    downloadProgress.setOnCancelListener(new DownloadProgress.OnCancelListener() { // from class: com.huawei.hms.update.ui.UpdateWizard.2
                        @Override // com.huawei.hms.update.ui.DownloadProgress.OnCancelListener
                        public void onCancel() {
                            UpdateWizard.this.a();
                            UpdateWizard.this.dismissDialog();
                            UpdateWizard.this.e();
                        }
                    });
                }
                abstractDialogNewInstance.show(this);
                this.mLatestDialog = abstractDialogNewInstance;
            } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
                HMSLog.e("UpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
            }
        }
    }

    private void a(UpdateWizard updateWizard, AbstractDialog abstractDialog) {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            String clientPackageName = this.bean.getClientPackageName();
            HMSLog.i("UpdateWizard", "<checkAndShowDialog> pkgName: " + clientPackageName);
            this.d = true;
            if (this.e == null) {
                this.e = new a(updateWizard, abstractDialog);
            }
            HmsApkReallySizeManager.getInstance().asyncGetSize(activity, clientPackageName, this.e);
            return;
        }
        HMSLog.e("UpdateWizard", "<checkHmsSizeAndShowDialog> not show Dialog, activity is null or finishing.");
    }

    private void a(final IUpdateCallback iUpdateCallback) {
        if (iUpdateCallback == null) {
            return;
        }
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (b(activity)) {
                UpdateSdkAPI.checkTargetAppUpdate(activity, this.bean.getClientPackageName(), new CheckUpdateCallBack() { // from class: com.huawei.hms.update.ui.UpdateWizard.3
                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onMarketInstallInfo(Intent intent) {
                    }

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onMarketStoreError(int i) {
                        HMSLog.e("UpdateWizard", "onMarketStoreError responseCode: " + i);
                    }

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onUpdateInfo(Intent intent) {
                        if (intent != null) {
                            UpdateWizard.this.a(intent, iUpdateCallback);
                        }
                    }

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onUpdateStoreError(int i) {
                        HMSLog.e("UpdateWizard", "onUpdateStoreError responseCode: " + i);
                    }
                });
                return;
            }
            return;
        }
        a(iUpdateCallback, 1201, (UpdateInfo) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent, IUpdateCallback iUpdateCallback) {
        try {
            int intExtra = intent.getIntExtra("status", -99);
            HMSLog.i("UpdateWizard", "CheckUpdateCallBack status is " + intExtra);
            String stringExtra = intent.getStringExtra(UpdateKey.FAIL_REASON);
            if (!TextUtils.isEmpty(stringExtra)) {
                HMSLog.e("UpdateWizard", "checkTargetAppUpdate reason is " + stringExtra);
            }
            if (intExtra != 7) {
                if (intExtra == 3) {
                    a(iUpdateCallback, 1202, (UpdateInfo) null);
                    return;
                } else {
                    a(iUpdateCallback, 1201, (UpdateInfo) null);
                    return;
                }
            }
            Serializable serializableExtra = intent.getSerializableExtra(UpdateKey.INFO);
            if (serializableExtra instanceof ApkUpgradeInfo) {
                ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializableExtra;
                String package_ = apkUpgradeInfo.getPackage_();
                int versionCode_ = apkUpgradeInfo.getVersionCode_();
                String downurl_ = apkUpgradeInfo.getDownurl_();
                int size_ = apkUpgradeInfo.getSize_();
                String sha256_ = apkUpgradeInfo.getSha256_();
                if (!TextUtils.isEmpty(package_) && package_.equals(this.bean.getClientPackageName())) {
                    if (versionCode_ < this.bean.getClientVersionCode()) {
                        HMSLog.e("UpdateWizard", "CheckUpdateCallBack versionCode is " + versionCode_ + "bean.getClientVersionCode() is " + this.bean.getClientVersionCode());
                        a(iUpdateCallback, 1203, (UpdateInfo) null);
                        return;
                    }
                    if (!TextUtils.isEmpty(downurl_) && !TextUtils.isEmpty(sha256_)) {
                        a(iUpdateCallback, 1000, new UpdateInfo(package_, versionCode_, downurl_, size_, sha256_));
                        return;
                    } else {
                        a(iUpdateCallback, 1201, (UpdateInfo) null);
                        return;
                    }
                }
                a(iUpdateCallback, 1201, (UpdateInfo) null);
            }
        } catch (Exception e) {
            HMSLog.e("UpdateWizard", "intent has some error" + e.getMessage());
            a(iUpdateCallback, 1201, (UpdateInfo) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        IOtaUpdate iOtaUpdate = this.f16861a;
        if (iOtaUpdate != null) {
            iOtaUpdate.cancel();
            this.f16861a = null;
        }
    }
}
