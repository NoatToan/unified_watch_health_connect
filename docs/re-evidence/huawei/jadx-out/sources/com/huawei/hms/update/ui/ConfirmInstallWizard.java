package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.format.Formatter;
import com.huawei.hms.adapter.ui.InstallerAdapter;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.AgHmsUpdateState;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hwcloudjs.g.a;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public class ConfirmInstallWizard extends AbsUpdateWizard {
    public static final String INVALID_SIZE = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16782a;

    static {
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append(a.f17122c);
        sb.append(str);
        sb.append("hms.apk");
        f16782a = sb.toString();
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    void a(Class<? extends AbstractDialog> cls) {
        try {
            AbstractDialog abstractDialogNewInstance = cls.newInstance();
            if (abstractDialogNewInstance instanceof InstallConfirm) {
                Activity activity = getActivity();
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    ((InstallConfirm) abstractDialogNewInstance).setHmsApkSize(a((Context) activity));
                }
                HMSLog.e("ConfirmInstallWizard", "<showDialog> not show Dialog, activity is null or finishing.");
                return;
            }
            abstractDialogNewInstance.show(this);
            this.mLatestDialog = abstractDialogNewInstance;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            HMSLog.e("ConfirmInstallWizard", "In ConfirmInstallWizard showDialog, failed to show the dialog." + e.getMessage());
        }
    }

    public void getInstallHmsIntent(Activity activity, File file) {
        HMSLog.i("ConfirmInstallWizard", "install hms.apk path");
        if (activity == null) {
            HMSLog.e("ConfirmInstallWizard", "activity is null");
            finishBridgeActivity(13, 8);
            return;
        }
        String str = InstallerAdapter.sHmsApkHash;
        if (str == null || !FileUtil.verifyHash(str, file)) {
            HMSLog.e("ConfirmInstallWizard", "In startInstaller, hms.apk hash verification failed.");
            finishBridgeActivity(13, 8);
            return;
        }
        Uri uriA = a(activity, file);
        if (uriA == null) {
            HMSLog.e("ConfirmInstallWizard", "In startInstaller, failed to creates a uri from a file");
            finishBridgeActivity(13, 8);
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(uriA, "application/vnd.android.package-archive");
        intent.setFlags(1);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", activity.getPackageName());
        try {
            activity.startActivityForResult(intent, getRequestCode());
        } catch (ActivityNotFoundException | SecurityException e) {
            HMSLog.e("ConfirmInstallWizard", "In getInstallHmsIntent start activity error: " + e.getMessage());
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 0;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (activity == null || activity.isFinishing()) {
            return;
        }
        a(InstallConfirm.class);
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        a();
        if (!isUpdated(this.mPackageName, this.mClientVersionCode)) {
            finishBridgeActivity(8, 8);
            HMSLog.i("ConfirmInstallWizard", "biReportEvent install failure");
            return true;
        }
        AgHmsUpdateState.getInstance().resetUpdateState();
        finishBridgeActivity(0, 8);
        HMSLog.i("ConfirmInstallWizard", "biReportEvent install success, package: " + this.mPackageName);
        return true;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onCancel(AbstractDialog abstractDialog) {
        HMSLog.i("ConfirmInstallWizard", "cancel to install hms.apk");
        a();
        finishBridgeActivity(13, 8);
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onDoWork(AbstractDialog abstractDialog) {
        HMSLog.i("ConfirmInstallWizard", "begin to install hms.apk");
        a(getActivity());
    }

    private void a(Activity activity) {
        try {
            String str = activity.getApplicationContext().getExternalCacheDir().getCanonicalPath() + f16782a;
            File file = new File(str);
            if (!file.exists()) {
                HMSLog.e("ConfirmInstallWizard", str + " is not exist");
                return;
            }
            getInstallHmsIntent(activity, file);
        } catch (IOException e) {
            HMSLog.e("ConfirmInstallWizard", "getExternalCacheDir fail:  " + e.getMessage());
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
            HMSLog.e("ConfirmInstallWizard", "In contentUriFromFile getApplicationInfo error: " + e.getMessage());
        }
        return Uri.fromFile(file);
    }

    private void a() {
        try {
            File file = new File(getActivity().getApplicationContext().getExternalCacheDir().getCanonicalPath() + f16782a);
            if (!file.exists()) {
                HMSLog.i("ConfirmInstallWizard", "delete apk, but hms.apk is not exist");
            } else if (file.delete()) {
                HMSLog.i("ConfirmInstallWizard", "success delete hms.apk file");
            }
        } catch (IOException e) {
            HMSLog.e("ConfirmInstallWizard", "getExternalCacheDir or delete file error:  " + e.getMessage());
        }
    }

    private String a(Context context) {
        try {
            String str = context.getApplicationContext().getExternalCacheDir().getCanonicalPath() + f16782a;
            File file = new File(str);
            if (!file.exists()) {
                HMSLog.e("ConfirmInstallWizard", "<getHmsApkSize> " + str + " is not exist");
                return "";
            }
            long length = file.length();
            return length > 0 ? Formatter.formatFileSize(context, length) : "";
        } catch (IOException e) {
            HMSLog.e("ConfirmInstallWizard", "<getHmsApkSize> getExternalCacheDir fail:  " + e.getMessage());
            return "";
        }
    }
}
