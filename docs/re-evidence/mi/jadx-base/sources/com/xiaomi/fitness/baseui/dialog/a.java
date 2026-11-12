package com.xiaomi.fitness.baseui.dialog;

import android.view.View;
import android.widget.ListAdapter;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.baseui.widget.YearMonthDayDialog;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<BUILDER extends a, PARAM extends DialogParams, DIALOG extends CommonDialog> {
    private final PARAM mDialogParams;

    public a(PARAM param) {
        Objects.requireNonNull(param, "param can't be null");
        this.mDialogParams = param;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DIALOG create() {
        YearMonthDayDialog yearMonthDayDialog = (DIALOG) internalCreate();
        yearMonthDayDialog.setParam(requireDialogParams());
        return yearMonthDayDialog;
    }

    public abstract BUILDER getThis();

    public abstract DIALOG internalCreate();

    public PARAM requireDialogParams() {
        PARAM param = this.mDialogParams;
        Objects.requireNonNull(param, "set dialog params first");
        return param;
    }

    public BUILDER setAdapter(ListAdapter listAdapter) {
        requireDialogParams().mAdapter = listAdapter;
        return (BUILDER) getThis();
    }

    public BUILDER setButtonVertical(boolean z) {
        requireDialogParams().mButtonVertical = z;
        return (BUILDER) getThis();
    }

    public BUILDER setCancelable(boolean z) {
        requireDialogParams().mCancelable = z;
        return (BUILDER) getThis();
    }

    public BUILDER setCanceledOnBackPressed(boolean z) {
        requireDialogParams().mCancelOnBackPressed = z;
        return (BUILDER) getThis();
    }

    public BUILDER setCanceledOnTouchOutside(boolean z) {
        requireDialogParams().mCanceledOnTouchOutside = z;
        return (BUILDER) getThis();
    }

    public BUILDER setCustomLayoutId(int i) {
        requireDialogParams().mCustomLayoutId = i;
        return (BUILDER) getThis();
    }

    public BUILDER setCustomTitleId(int i) {
        requireDialogParams().mCustomTitleId = i;
        return (BUILDER) getThis();
    }

    public BUILDER setCustomView(View view) {
        requireDialogParams().mCustomView = view;
        return (BUILDER) getThis();
    }

    public BUILDER setDialogDescription(int i) {
        requireDialogParams().mDialogDescriptionId = i;
        return (BUILDER) getThis();
    }

    public BUILDER setDialogDescriptionString(DialogParams.DialogDescriptionString dialogDescriptionString) {
        requireDialogParams().mDescriptionString = dialogDescriptionString;
        return (BUILDER) getThis();
    }

    public BUILDER setDialogTheme(int i) {
        requireDialogParams().mDialogTheme = i;
        return (BUILDER) getThis();
    }

    public BUILDER setDialogTitle(int i) {
        requireDialogParams().mDialogTitleId = i;
        return (BUILDER) getThis();
    }

    public BUILDER setHtmlContent(int i) {
        requireDialogParams().mHtmlContentId = i;
        return (BUILDER) getThis();
    }

    public BUILDER setItems(String[] strArr) {
        requireDialogParams().mItems = strArr;
        return (BUILDER) getThis();
    }

    public BUILDER setItemsCheckedIndex(int i) {
        requireDialogParams().mItemsCheckedIndex = i;
        return (BUILDER) getThis();
    }

    public BUILDER setItemsChoices(boolean[] zArr) {
        requireDialogParams().mItemsChoices = zArr;
        return (BUILDER) getThis();
    }

    public BUILDER setNegativeText(int i) {
        requireDialogParams().mNegativeButtonTextId = i;
        return (BUILDER) getThis();
    }

    public BUILDER setNeutralText(int i) {
        requireDialogParams().mNeutralButtonTextId = i;
        return (BUILDER) getThis();
    }

    public BUILDER setPositiveText(int i) {
        requireDialogParams().mPositiveButtonTextId = i;
        return (BUILDER) getThis();
    }

    public BUILDER setDialogTitle(DialogParams.DialogDescriptionString dialogDescriptionString) {
        requireDialogParams().mDialogTitleString = dialogDescriptionString;
        return (BUILDER) getThis();
    }

    public BUILDER setNegativeText(String str) {
        requireDialogParams().mNegativeButtonText = str;
        return (BUILDER) getThis();
    }

    public BUILDER setNeutralText(String str) {
        requireDialogParams().mNeutralButtonText = str;
        return (BUILDER) getThis();
    }

    public BUILDER setPositiveText(String str) {
        requireDialogParams().mPositiveButtonText = str;
        return (BUILDER) getThis();
    }
}
