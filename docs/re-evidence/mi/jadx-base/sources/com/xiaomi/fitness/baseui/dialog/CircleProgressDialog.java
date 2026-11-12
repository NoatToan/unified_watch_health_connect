package com.xiaomi.fitness.baseui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import defpackage.gsi;
import defpackage.n1j;

/* JADX INFO: loaded from: classes7.dex */
public class CircleProgressDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f11644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProgressBar f11645b;
    public TextView c;
    public boolean f;
    public String g;
    public int d = 0;
    public int e = -1;
    public int h = 100;

    public static class a extends com.xiaomi.fitness.baseui.dialog.a<a, DialogParams, CircleProgressDialog> {
        public a(String str) {
            this(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CircleProgressDialog internalCreate() {
            return new CircleProgressDialog();
        }

        public a(DialogParams dialogParams) {
            super(dialogParams);
            setCanceledOnTouchOutside(false);
        }
    }

    private int getCurrentIndex() {
        return 0;
    }

    public final void A() {
        TextView textView = this.f11644a;
        if (textView != null) {
            textView.setText(this.g);
        }
    }

    public void finish() {
        Dialog dialog = getDialog();
        if (dialog != null && dialog.getWindow() != null) {
            dialog.getWindow().setWindowAnimations(0);
        }
        dismissAllowingStateLoss();
    }

    public int getValue() {
        if (this.f11644a != null) {
            return 0;
        }
        return this.e;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.f11644a = (TextView) view.findViewById(gsi.y0);
        this.f11645b = (ProgressBar) view.findViewById(gsi.T);
        this.c = (TextView) view.findViewById(gsi.U);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        A();
        this.f = true;
        return dialogOnCreateDialog;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f = false;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            Bundle bundle = new Bundle();
            bundle.putInt(PickerDialog.KEY_SELECTED_VALUE, getValue());
            setResultData(-1, bundle);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("sel_idx", getCurrentIndex());
    }

    public void setPickerHintText(String str) {
        this.g = str;
    }

    public void setProgress(int i) {
        if (isShowing()) {
            int i2 = this.h;
            int iMin = Math.min(i2, (int) ((i * 100.0f) / i2));
            this.c.setText(getString(n1j.common_progress, Integer.valueOf(iMin)));
            this.f11645b.setProgress(iMin);
            this.d = i;
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a buildUpon() {
        return new a(z());
    }

    public final DialogParams z() {
        DialogParams dialogParamsRequireDialogParams = requireDialogParams();
        return dialogParamsRequireDialogParams instanceof DialogParams ? dialogParamsRequireDialogParams : new DialogParams("");
    }
}
