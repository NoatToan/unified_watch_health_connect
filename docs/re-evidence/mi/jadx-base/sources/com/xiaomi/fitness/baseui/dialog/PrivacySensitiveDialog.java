package com.xiaomi.fitness.baseui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import defpackage.gsi;

/* JADX INFO: loaded from: classes7.dex */
public class PrivacySensitiveDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f11666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11667b = -1;
    public boolean c;
    public CharSequence d;

    public static class a extends com.xiaomi.fitness.baseui.dialog.a<a, DialogParams, PrivacySensitiveDialog> {
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
        public PrivacySensitiveDialog internalCreate() {
            return new PrivacySensitiveDialog();
        }

        public a(DialogParams dialogParams) {
            super(dialogParams);
        }
    }

    private void A() {
        TextView textView = this.f11666a;
        if (textView != null) {
            textView.setText(this.d);
            this.f11666a.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private int getCurrentIndex() {
        return 0;
    }

    public void B(CharSequence charSequence) {
        this.d = charSequence;
    }

    public int getValue() {
        if (this.f11666a == null) {
            return this.f11667b;
        }
        getCurrentIndex();
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.f11666a = (TextView) view.findViewById(gsi.R);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        A();
        this.c = true;
        return dialogOnCreateDialog;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.c = false;
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
