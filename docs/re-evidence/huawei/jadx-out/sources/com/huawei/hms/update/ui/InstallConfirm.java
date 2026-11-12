package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.AndroidException;
import android.view.View;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* JADX INFO: loaded from: classes34.dex */
public class InstallConfirm extends AbstractDialog {
    private static boolean g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16827c = ResourceLoaderUtil.getString("hms_update_title");
    private String d;
    private InstallConfirm e;
    private Dialog f;

    public void intAppName(String str) {
        this.f16827c = str;
    }

    @Override // com.huawei.hms.update.ui.AbstractDialog
    protected Dialog onCreateDialog() {
        this.e = this;
        Activity activity = getActivity();
        this.f16827c = a(activity, activity.getPackageName());
        if (TextUtils.isEmpty(this.d)) {
            this.d = Formatter.formatFileSize(activity, SystemUtils.getMegabyte(40.0d));
        }
        int iA = HwDialogUtil.a(activity);
        HMSLog.i("InstallConfirm", "currentUiModeType is: " + iA);
        return iA != 6 ? a(activity) : b(activity);
    }

    public void setHmsApkSize(String str) {
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z) {
        g = z;
    }

    private Dialog b(final Activity activity) {
        if (ConfigChangeHolder.getInstance().isChanged() && g) {
            Dialog dialog = this.f;
            if (dialog != null) {
                return dialog;
            }
            Dialog dialogCreateNewDialog = new ReconfirmInstallDialog(activity, this.e).createNewDialog();
            this.f = dialogCreateNewDialog;
            if (dialogCreateNewDialog != null) {
                return dialogCreateNewDialog;
            }
        }
        b(false);
        int stringId = ResourceLoaderUtil.getStringId("hms_update_title");
        int stringId2 = ResourceLoaderUtil.getStringId("hms_install_confirm_message");
        int stringId3 = ResourceLoaderUtil.getStringId("hms_install");
        int stringId4 = ResourceLoaderUtil.getStringId("hms_cancel");
        WatchInstallDialog watchInstallDialog = new WatchInstallDialog(activity);
        watchInstallDialog.setTitle(stringId);
        watchInstallDialog.setMessage(activity.getString(stringId2, new Object[]{this.f16827c, this.d}));
        watchInstallDialog.setInstallResourceId(stringId3);
        watchInstallDialog.setCancelResourceId(stringId4);
        watchInstallDialog.setOnInstallClick(new View.OnClickListener() { // from class: com.huawei.hms.update.ui.InstallConfirm.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InstallConfirm.this.fireDoWork();
            }
        });
        watchInstallDialog.setOnCancelClick(new View.OnClickListener() { // from class: com.huawei.hms.update.ui.InstallConfirm.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InstallConfirm installConfirm = InstallConfirm.this;
                installConfirm.f = new ReconfirmInstallDialog(activity, installConfirm.e).createNewDialog();
                if (InstallConfirm.this.f == null) {
                    InstallConfirm.this.cancel();
                    return;
                }
                InstallConfirm installConfirm2 = InstallConfirm.this;
                installConfirm2.replaceAlertDialog(installConfirm2.f);
                InstallConfirm.b(true);
            }
        });
        return watchInstallDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AlertDialogBuilder a(Activity activity, int i) {
        if (SystemUtils.isTVDevice()) {
            return new AlertDialogBuilder(new AlertDialog.Builder(activity, i));
        }
        return new AlertDialogBuilder(new HwAlertDialog.Builder(activity, i));
    }

    private Dialog a(final Activity activity) {
        AlertDialogBuilder alertDialogBuilderA = a(activity, getDialogThemeId());
        if (ConfigChangeHolder.getInstance().isChanged() && g) {
            Dialog dialog = this.f;
            if (dialog != null) {
                return dialog;
            }
            Dialog dialogCreateNewDialog = new ReconfirmInstallDialog(alertDialogBuilderA, activity, this.e).createNewDialog();
            this.f = dialogCreateNewDialog;
            if (dialogCreateNewDialog != null) {
                return dialogCreateNewDialog;
            }
        }
        b(false);
        if (!SystemUtils.isTVDevice()) {
            alertDialogBuilderA.a(ResourceLoaderUtil.getDrawableId("hms_core_icon"));
        }
        int stringId = ResourceLoaderUtil.getStringId("hms_update_title_new");
        int stringId2 = ResourceLoaderUtil.getStringId("hms_install_confirm_message");
        int stringId3 = ResourceLoaderUtil.getStringId("hms_install");
        alertDialogBuilderA.b(stringId);
        alertDialogBuilderA.a(activity.getString(stringId2, new Object[]{this.f16827c, this.d}));
        alertDialogBuilderA.b(stringId3, new DialogInterface.OnClickListener() { // from class: com.huawei.hms.update.ui.InstallConfirm.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                InstallConfirm.this.fireDoWork();
            }
        });
        alertDialogBuilderA.a(ResourceLoaderUtil.getStringId("hms_cancel"), new DialogInterface.OnClickListener() { // from class: com.huawei.hms.update.ui.InstallConfirm.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                InstallConfirm installConfirm = InstallConfirm.this;
                AlertDialogBuilder alertDialogBuilderA2 = installConfirm.a(activity, installConfirm.getDialogThemeId());
                InstallConfirm installConfirm2 = InstallConfirm.this;
                installConfirm2.f = new ReconfirmInstallDialog(alertDialogBuilderA2, activity, installConfirm2.e).createNewDialog();
                if (InstallConfirm.this.f == null) {
                    InstallConfirm.this.cancel();
                    return;
                }
                InstallConfirm installConfirm3 = InstallConfirm.this;
                installConfirm3.replaceAlertDialog(installConfirm3.f);
                InstallConfirm.b(true);
            }
        });
        return alertDialogBuilderA.a();
    }

    private static String a(Context context, String str) {
        if (context == null) {
            HMSLog.e("InstallConfirm", "In getAppName, context is null.");
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("InstallConfirm", "In getAppName, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = context.getPackageName();
            }
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128));
            return applicationLabel == null ? "" : applicationLabel.toString();
        } catch (AndroidException e) {
            HMSLog.e("InstallConfirm", "In getAppName, Failed to get app name." + e.getMessage());
            return "";
        } catch (RuntimeException e2) {
            HMSLog.e("InstallConfirm", "In getAppName, Failed to get app name." + e2.getMessage());
            return "";
        }
    }
}
