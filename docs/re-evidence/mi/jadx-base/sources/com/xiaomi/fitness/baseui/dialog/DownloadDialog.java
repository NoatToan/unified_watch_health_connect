package com.xiaomi.fitness.baseui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import defpackage.gsi;

/* JADX INFO: loaded from: classes7.dex */
public class DownloadDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProgressBar f11661b;
    public TextView c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11660a = "ProgressDialog";
    public int d = 0;
    public int e = 100;

    public final void A() {
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.f11661b = (ProgressBar) view.findViewById(gsi.T);
        this.c = (TextView) view.findViewById(gsi.U);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(17);
        window.setAttributes(attributes);
        A();
        return dialogOnCreateDialog;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            setResultData(-1, new Bundle());
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(17);
        window.setAttributes(attributes);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public CircleProgressDialog.a buildUpon() {
        return new CircleProgressDialog.a(z());
    }

    public final DialogParams z() {
        return requireDialogParams();
    }
}
