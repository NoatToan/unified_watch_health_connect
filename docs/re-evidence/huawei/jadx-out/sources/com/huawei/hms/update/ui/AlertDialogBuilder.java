package com.huawei.hms.update.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes34.dex */
final class AlertDialogBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AlertDialog.Builder f16755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HwAlertDialog.Builder f16756b;

    interface InvokeInterface {
        void defaultInvoke();

        void defaultInvokeInTV();
    }

    AlertDialogBuilder(AlertDialog.Builder builder) {
        this(builder, null);
    }

    AlertDialogBuilder(HwAlertDialog.Builder builder) {
        this(null, builder);
    }

    void a(final int i) {
        a(new InvokeInterface() { // from class: com.huawei.hms.update.ui.AlertDialogBuilder.1
            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvoke() {
                AlertDialogBuilder.this.f16756b.setIcon(i);
            }

            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvokeInTV() {
                AlertDialogBuilder.this.f16755a.setIcon(i);
            }
        });
    }

    void b(final int i) {
        a(new InvokeInterface() { // from class: com.huawei.hms.update.ui.AlertDialogBuilder.2
            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvoke() {
                AlertDialogBuilder.this.f16756b.setTitle(i);
            }

            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvokeInTV() {
                AlertDialogBuilder.this.f16755a.setTitle(i);
            }
        });
    }

    private AlertDialogBuilder(AlertDialog.Builder builder, HwAlertDialog.Builder builder2) {
        this.f16755a = builder;
        this.f16756b = builder2;
    }

    void a(final CharSequence charSequence) {
        a(new InvokeInterface() { // from class: com.huawei.hms.update.ui.AlertDialogBuilder.3
            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvoke() {
                AlertDialogBuilder.this.f16756b.setMessage(charSequence);
            }

            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvokeInTV() {
                AlertDialogBuilder.this.f16755a.setMessage(charSequence);
            }
        });
    }

    void b(final int i, final DialogInterface.OnClickListener onClickListener) {
        a(new InvokeInterface() { // from class: com.huawei.hms.update.ui.AlertDialogBuilder.4
            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvoke() {
                AlertDialogBuilder.this.f16756b.setPositiveButton(i, onClickListener);
            }

            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvokeInTV() {
                AlertDialogBuilder.this.f16755a.setPositiveButton(i, onClickListener);
            }
        });
    }

    void a(final int i, final DialogInterface.OnClickListener onClickListener) {
        a(new InvokeInterface() { // from class: com.huawei.hms.update.ui.AlertDialogBuilder.5
            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvoke() {
                AlertDialogBuilder.this.f16756b.setNegativeButton(i, onClickListener);
            }

            @Override // com.huawei.hms.update.ui.AlertDialogBuilder.InvokeInterface
            public void defaultInvokeInTV() {
                AlertDialogBuilder.this.f16755a.setNegativeButton(i, onClickListener);
            }
        });
    }

    Dialog a() {
        if (SystemUtils.isTVDevice()) {
            AlertDialog.Builder builder = this.f16755a;
            if (builder == null) {
                HMSLog.e("dialogBuilder", "error: mDialogBuilder is null");
                return null;
            }
            return builder.create();
        }
        HwAlertDialog.Builder builder2 = this.f16756b;
        if (builder2 == null) {
            HMSLog.e("dialogBuilder", "error: mHwDialogBuilder is null");
            return null;
        }
        return builder2.create();
    }

    private void a(InvokeInterface invokeInterface) {
        if (invokeInterface == null) {
            HMSLog.e("dialogBuilder", "error: invokeInterface is null");
            return;
        }
        if (SystemUtils.isTVDevice()) {
            if (this.f16755a == null) {
                HMSLog.e("dialogBuilder", "error: mDialogBuilder is null.");
                return;
            } else {
                invokeInterface.defaultInvokeInTV();
                return;
            }
        }
        if (this.f16756b == null) {
            HMSLog.e("dialogBuilder", "error: mHwDialogBuilder is null.");
        } else {
            invokeInterface.defaultInvoke();
        }
    }
}
