package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* JADX INFO: loaded from: classes34.dex */
public class ReconfirmInstallDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AlertDialogBuilder f16835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f16836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractDialog f16837c;

    public ReconfirmInstallDialog(Activity activity, AbstractDialog abstractDialog) {
        this((AlertDialogBuilder) null, activity, abstractDialog);
    }

    private Dialog b(int i, int i2, int i3) {
        WatchInstallDialog watchInstallDialog = new WatchInstallDialog(this.f16836b);
        watchInstallDialog.setMessage(System.lineSeparator() + this.f16836b.getString(i3));
        watchInstallDialog.setInstallResourceId(i);
        watchInstallDialog.setCancelResourceId(i2);
        watchInstallDialog.setOnInstallClick(new View.OnClickListener() { // from class: com.huawei.hms.update.ui.ReconfirmInstallDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HMSLog.i("ReconfirmInstallDialog", "start fireDoWork...");
                ReconfirmInstallDialog.this.f16837c.fireDoWork();
            }
        });
        watchInstallDialog.setOnCancelClick(new View.OnClickListener() { // from class: com.huawei.hms.update.ui.ReconfirmInstallDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HMSLog.i("ReconfirmInstallDialog", "start cancel...");
                ReconfirmInstallDialog.this.f16837c.cancel();
            }
        });
        return watchInstallDialog;
    }

    public Dialog createNewDialog() {
        try {
            int stringId = ResourceLoaderUtil.getStringId("hms_install_after_cancel");
            int stringId2 = ResourceLoaderUtil.getStringId("hms_cancel_after_cancel");
            int stringId3 = ResourceLoaderUtil.getStringId("hms_cancel_install_message");
            Activity activity = this.f16836b;
            if (activity != null && this.f16837c != null) {
                if (!activity.isFinishing()) {
                    return HwDialogUtil.a(this.f16836b) != 6 ? a(stringId, stringId2, stringId3) : b(stringId, stringId2, stringId3);
                }
                HMSLog.e("ReconfirmInstallDialog", "this mActivity is finished.");
                return null;
            }
            HMSLog.e("ReconfirmInstallDialog", "error:  mActivity or mDialog is null: " + this.f16836b + this.f16837c);
            return null;
        } catch (Exception e) {
            HMSLog.e("ReconfirmInstallDialog", "createNewDialog exception: " + e.getMessage());
            return null;
        }
    }

    public ReconfirmInstallDialog(AlertDialogBuilder alertDialogBuilder, Activity activity, AbstractDialog abstractDialog) {
        this.f16835a = alertDialogBuilder;
        this.f16836b = activity;
        this.f16837c = abstractDialog;
    }

    private Dialog a(int i, int i2, int i3) {
        AlertDialogBuilder alertDialogBuilder = this.f16835a;
        if (alertDialogBuilder == null) {
            HMSLog.e("ReconfirmInstallDialog", "error: mBuilder is null");
            return null;
        }
        alertDialogBuilder.a(this.f16836b.getString(i3));
        this.f16835a.b(i, new DialogInterface.OnClickListener() { // from class: com.huawei.hms.update.ui.ReconfirmInstallDialog.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                HMSLog.i("ReconfirmInstallDialog", "start fireDoWork...");
                ReconfirmInstallDialog.this.f16837c.fireDoWork();
            }
        });
        this.f16835a.a(i2, new DialogInterface.OnClickListener() { // from class: com.huawei.hms.update.ui.ReconfirmInstallDialog.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                HMSLog.i("ReconfirmInstallDialog", "start cancel...");
                ReconfirmInstallDialog.this.f16837c.cancel();
            }
        });
        return this.f16835a.a();
    }

    public ReconfirmInstallDialog(HwAlertDialog.Builder builder, Activity activity, AbstractDialog abstractDialog) {
        this.f16835a = new AlertDialogBuilder(builder);
        this.f16836b = activity;
        this.f16837c = abstractDialog;
    }
}
