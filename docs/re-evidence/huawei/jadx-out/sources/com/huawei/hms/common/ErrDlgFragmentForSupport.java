package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes33.dex */
public class ErrDlgFragmentForSupport extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Dialog f13000a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f13001b = null;

    public static ErrDlgFragmentForSupport newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13001b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f13000a == null) {
            setShowsDialog(false);
        }
        return this.f13000a;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        com.huawei.hms.common.internal.Preconditions.checkNotNull(fragmentManager, "FragmentManager cannot be null!");
        super.show(fragmentManager, str);
    }

    public static ErrDlgFragmentForSupport newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        com.huawei.hms.common.internal.Preconditions.checkNotNull(dialog, "Dialog cannot be null!");
        ErrDlgFragmentForSupport errDlgFragmentForSupport = new ErrDlgFragmentForSupport();
        errDlgFragmentForSupport.f13000a = dialog;
        dialog.setOnCancelListener(null);
        errDlgFragmentForSupport.f13000a.setOnDismissListener(null);
        errDlgFragmentForSupport.f13001b = onCancelListener;
        return errDlgFragmentForSupport;
    }
}
