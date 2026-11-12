package com.huami.android.design.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintProperties;
import androidx.fragment.app.FragmentManager;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AlertDialogFragment extends BaseDialogFragment implements DialogInterface {
    private static final String g = "AlertDialogFragment";
    private DialogParams e;
    private DialogView f;

    public static class Builder {
        private final DialogParams a = new DialogParams();
        private final Context b;

        public Builder(Context context) {
            this.b = context;
        }

        public Builder addTextWatcher(TextWatcher textWatcher) {
            this.a.watcher = textWatcher;
            return this;
        }

        public Builder autoDismiss(boolean z) {
            this.a.cancel = z;
            return this;
        }

        public AlertDialogFragment create() {
            return AlertDialogFragment.d(this.a);
        }

        public Builder editTextShow(boolean z) {
            this.a.isShowEditText = z;
            return this;
        }

        public Builder loading(boolean z) {
            DialogParams dialogParams = this.a;
            dialogParams.loading = true;
            dialogParams.cancel = z;
            return this;
        }

        public Builder maxHeightConstraint() {
            this.a.maxHeightConstraint = true;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.a.cancelable = z;
            return this;
        }

        public Builder setCheckBox(String str, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            DialogParams dialogParams = this.a;
            dialogParams.hasCheckBox = true;
            dialogParams.isChecked = z;
            dialogParams.checkBoxMessage = str;
            dialogParams.checkedListener = onCheckedChangeListener;
            return this;
        }

        public Builder setContentView(View view) {
            if (view != null) {
                this.a.contentView = view;
            }
            return this;
        }

        public Builder setEditText(String str) {
            this.a.editedText = str;
            return this;
        }

        public Builder setHeaderDividingLineVisible(boolean z) {
            this.a.headerDividingLineVisible = z;
            return this;
        }

        public Builder setHint(String str) {
            this.a.hint = str;
            return this;
        }

        public Builder setIcons(@DrawableRes int[] iArr) {
            this.a.drawables = iArr;
            return this;
        }

        public Builder setImages(List list) {
            this.a.urls = list;
            return this;
        }

        public Builder setLink(String str, View.OnClickListener onClickListener) {
            DialogParams dialogParams = this.a;
            dialogParams.link = str;
            dialogParams.linkListener = onClickListener;
            return this;
        }

        public Builder setLinkage(@StringRes int i, @StringRes int i2) {
            DialogParams dialogParams = this.a;
            dialogParams.isLinkage = true;
            dialogParams.linkText = this.b.getString(i);
            this.a.linkDefaultText = this.b.getString(i2);
            return this;
        }

        public Builder setMessage(String str) {
            this.a.message = str;
            return this;
        }

        public Builder setMessageGravity(int i) {
            this.a.messageGravity = i;
            return this;
        }

        public Builder setMessageMaxLines(int i) {
            this.a.maxLines = i;
            return this;
        }

        public Builder setMultiChoiceItems(ChoiceItems choiceItems, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            if (choiceItems != null) {
                DialogParams dialogParams = this.a;
                dialogParams.choiceItems = choiceItems;
                dialogParams.multiListener = onMultiChoiceClickListener;
            }
            return this;
        }

        public Builder setNegativeButton(String str, DialogInterface.OnClickListener onClickListener) {
            DialogParams dialogParams = this.a;
            dialogParams.negativeButtonText = str;
            dialogParams.negativeListener = onClickListener;
            return this;
        }

        @Deprecated
        public Builder setNegativeButtonTextStyle(@ColorRes int i, @DimenRes int i2, boolean z) {
            DialogParams.ButtonTextStyle buttonTextStyle = new DialogParams.ButtonTextStyle();
            buttonTextStyle.isTextBold = z;
            buttonTextStyle.textColor = i;
            buttonTextStyle.textSize = i2;
            this.a.negativeButtonTextStyle = buttonTextStyle;
            return this;
        }

        public Builder setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.a.neutralButtonText = this.b.getString(i);
            this.a.neutralListener = onClickListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.a.dismissListener = onDismissListener;
            return this;
        }

        public Builder setParagraph(String str) {
            this.a.paragraph = str;
            return this;
        }

        public Builder setPositiveButton(String str, DialogInterface.OnClickListener onClickListener) {
            DialogParams dialogParams = this.a;
            dialogParams.positiveButtonText = str;
            dialogParams.positiveListener = onClickListener;
            return this;
        }

        @Deprecated
        public Builder setPositiveButtonTextStyle(@ColorRes int i, @DimenRes int i2, boolean z) {
            DialogParams.ButtonTextStyle buttonTextStyle = new DialogParams.ButtonTextStyle();
            buttonTextStyle.isTextBold = z;
            buttonTextStyle.textColor = i;
            buttonTextStyle.textSize = i2;
            this.a.positiveButtonTextStyle = buttonTextStyle;
            return this;
        }

        public Builder setPositiveTextColor(@ColorRes int i) {
            DialogParams.ButtonTextStyle buttonTextStyle = new DialogParams.ButtonTextStyle();
            buttonTextStyle.textColor = i;
            this.a.positiveButtonTextStyle = buttonTextStyle;
            return this;
        }

        public Builder setSingleChoiceItems(ChoiceItems choiceItems, DialogInterface.OnClickListener onClickListener) {
            if (choiceItems != null) {
                DialogParams dialogParams = this.a;
                dialogParams.isSingleChoice = true;
                dialogParams.choiceItems = choiceItems;
                dialogParams.listener = onClickListener;
            }
            return this;
        }

        public Builder setSingleChoiceItemsCenterNonCancelable(ChoiceItems choiceItems, DialogInterface.OnClickListener onClickListener) {
            if (choiceItems != null) {
                DialogParams dialogParams = this.a;
                dialogParams.isSingleChoice = false;
                dialogParams.isSingleChoiceNew = false;
                dialogParams.isSingleChoiceList = false;
                dialogParams.isSingleChoiceListCenterNonCancelable = true;
                dialogParams.choiceItems = choiceItems;
                dialogParams.listener = onClickListener;
            }
            return this;
        }

        public Builder setSingleChoiceItemsList(ChoiceItems choiceItems, DialogInterface.OnClickListener onClickListener) {
            if (choiceItems != null) {
                DialogParams dialogParams = this.a;
                dialogParams.isSingleChoice = false;
                dialogParams.isSingleChoiceNew = false;
                dialogParams.isSingleChoiceList = true;
                dialogParams.choiceItems = choiceItems;
                dialogParams.listener = onClickListener;
            }
            return this;
        }

        public Builder setSingleChoiceItemsNew(ChoiceItems choiceItems, DialogInterface.OnClickListener onClickListener) {
            if (choiceItems != null) {
                DialogParams dialogParams = this.a;
                dialogParams.isSingleChoice = false;
                dialogParams.isSingleChoiceNew = true;
                dialogParams.choiceItems = choiceItems;
                dialogParams.listener = onClickListener;
            }
            return this;
        }

        public Builder setSingleChoiceItemsNonCancelable(ChoiceItems choiceItems, DialogInterface.OnClickListener onClickListener) {
            if (choiceItems != null) {
                DialogParams dialogParams = this.a;
                dialogParams.isSingleChoice = false;
                dialogParams.isSingleChoiceNew = false;
                dialogParams.isSingleChoiceList = false;
                dialogParams.isSingleChoiceNonCancelable = true;
                dialogParams.choiceItems = choiceItems;
                dialogParams.listener = onClickListener;
            }
            return this;
        }

        public Builder setSubtitle(String str) {
            this.a.subtitle = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.a.title = str;
            return this;
        }

        public AlertDialogFragment show(FragmentManager fragmentManager, String str) {
            AlertDialogFragment alertDialogFragmentCreate = create();
            alertDialogFragmentCreate.show(fragmentManager, str);
            return alertDialogFragmentCreate;
        }

        public Builder success() {
            this.a.successful = Boolean.TRUE;
            return this;
        }

        public Builder themed() {
            this.a.themed = true;
            return this;
        }

        public Builder waring() {
            this.a.successful = Boolean.FALSE;
            return this;
        }

        public Builder setEditText(@StringRes int i) {
            this.a.editedText = this.b.getString(i);
            return this;
        }

        public Builder setHint(@StringRes int i) {
            this.a.hint = this.b.getString(i);
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.a.messageCharSequence = charSequence;
            return this;
        }

        public Builder setParagraph(CharSequence charSequence) {
            this.a.paragraphCharSequence = charSequence;
            return this;
        }

        public Builder setSubtitle(@StringRes int i) {
            this.a.subtitle = this.b.getString(i);
            return this;
        }

        public Builder setTitle(@StringRes int i) {
            this.a.title = this.b.getString(i);
            return this;
        }

        public Builder setLink(@StringRes int i, View.OnClickListener onClickListener) {
            this.a.link = this.b.getString(i);
            this.a.linkListener = onClickListener;
            return this;
        }

        public Builder setMessage(@StringRes int i) {
            this.a.message = this.b.getString(i);
            return this;
        }

        public Builder setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.a.negativeButtonText = this.b.getString(i);
            this.a.negativeListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(String str, DialogInterface.OnClickListener onClickListener) {
            DialogParams dialogParams = this.a;
            dialogParams.neutralButtonText = str;
            dialogParams.neutralListener = onClickListener;
            return this;
        }

        public Builder setParagraph(@StringRes int i) {
            this.a.paragraph = this.b.getString(i);
            return this;
        }

        public Builder setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.a.positiveButtonText = this.b.getString(i);
            this.a.positiveListener = onClickListener;
            return this;
        }

        public AlertDialogFragment show(FragmentManager fragmentManager) {
            String str = this.a.title;
            if (TextUtils.isEmpty(str)) {
                str = AlertDialogFragment.g;
            }
            return show(fragmentManager, str);
        }

        public Builder setLinkage(CharSequence charSequence, CharSequence charSequence2) {
            DialogParams dialogParams = this.a;
            dialogParams.isLinkage = true;
            dialogParams.linkText = charSequence;
            dialogParams.linkDefaultText = charSequence2;
            return this;
        }
    }

    public static class ChoiceItems {
        public int[] a;
        public int[] b;
        public String[] d;
        public int[] e;
        public String[] g;
        public SparseArray<String> h;
        public int[] i;
        public boolean[] k;
        public boolean[] l;
        public boolean[] m;
        public int n;
        public int c = -1;
        public int f = -1;
        public int j = -1;

        @DrawableRes
        public int o = -1;

        @Deprecated
        public ChoiceItems setArrowIcon(@DrawableRes int i) {
            this.o = i;
            return this;
        }

        @Deprecated
        public ChoiceItems setCheckedStyle(int i) {
            this.n = i;
            return this;
        }

        public ChoiceItems setColors(int[] iArr) {
            this.i = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        public ChoiceItems setIcons(int[] iArr) {
            this.a = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        public ChoiceItems setItemChoice(int i) {
            this.j = i;
            return this;
        }

        public ChoiceItems setItems(@ArrayRes int i) {
            this.c = i;
            return this;
        }

        public ChoiceItems setItemsChecked(boolean[] zArr) {
            this.k = Arrays.copyOf(zArr, zArr.length);
            return this;
        }

        public ChoiceItems setItemsEnable(boolean[] zArr) {
            this.m = Arrays.copyOf(zArr, zArr.length);
            return this;
        }

        public ChoiceItems setItemsStrikeThroughLength(int[] iArr) {
            this.e = iArr;
            return this;
        }

        public ChoiceItems setItemsSummaries(String[] strArr) {
            this.g = (String[]) Arrays.copyOf(strArr, strArr.length);
            return this;
        }

        public ChoiceItems setItemsSummary(@ArrayRes int i) {
            this.f = i;
            return this;
        }

        public void setItemsTips(int i, String str) {
            if (this.h == null) {
                this.h = new SparseArray<>();
            }
            this.h.put(i, str);
        }

        public ChoiceItems setItemsVisible(boolean[] zArr) {
            this.l = Arrays.copyOf(zArr, zArr.length);
            return this;
        }

        public ChoiceItems setIcons(int[] iArr, int[] iArr2) {
            this.a = Arrays.copyOf(iArr, iArr.length);
            this.b = Arrays.copyOf(iArr2, iArr2.length);
            return this;
        }

        public ChoiceItems setItems(String[] strArr) {
            this.d = (String[]) Arrays.copyOf(strArr, strArr.length);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AlertDialogFragment d(DialogParams dialogParams) {
        AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
        alertDialogFragment.setParams(dialogParams);
        return alertDialogFragment;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        DialogView dialogView = new DialogView(getContext());
        this.f = dialogView;
        dialogView.setConfig(this.e, this);
        ConstraintLayout constraintLayout = new ConstraintLayout(requireContext());
        constraintLayout.addView(dialogView, new ConstraintLayout.LayoutParams(-1, -2));
        ConstraintProperties constraintPropertiesConnect = new ConstraintProperties(dialogView).connect(6, 0, 6, 0).connect(7, 0, 7, 0);
        if (this.e.maxHeightConstraint) {
            constraintPropertiesConnect.constrainMaxHeight(dpToPxInt(516));
        }
        constraintPropertiesConnect.apply();
        return constraintLayout;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        DialogParams dialogParams = this.e;
        if (dialogParams != null) {
            setCancelable(dialogParams.cancelable);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        DialogParams dialogParams = this.e;
        if (dialogParams == null) {
            return;
        }
        if (dialogParams.negativeListener != null) {
            dialogParams.negativeListener = null;
        }
        if (dialogParams.positiveListener != null) {
            dialogParams.positiveListener = null;
        }
        if (dialogParams.neutralListener != null) {
            dialogParams.neutralListener = null;
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener;
        super.onDismiss(dialogInterface);
        DialogParams dialogParams = this.e;
        if (dialogParams == null || (onDismissListener = dialogParams.dismissListener) == null) {
            return;
        }
        onDismissListener.onDismiss(this);
    }

    public void setParams(DialogParams dialogParams) {
        this.e = dialogParams;
    }

    public void updatePositiveEnable(boolean z) {
        DialogView dialogView = this.f;
        if (dialogView != null) {
            dialogView.updatePositiveEnable(z);
        }
    }

    public void updateTitle(CharSequence charSequence) {
        DialogView dialogView = this.f;
        if (dialogView != null) {
            dialogView.setTitle(charSequence);
        }
    }
}
