package com.huami.android.design.dialog;

import android.content.DialogInterface;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DialogParams implements Serializable {
    public boolean cancelable;
    public String checkBoxMessage;
    public CompoundButton.OnCheckedChangeListener checkedListener;
    public AlertDialogFragment.ChoiceItems choiceItems;
    public View contentView;
    public DialogInterface.OnDismissListener dismissListener;
    public int[] drawables;
    public String editedText;
    public boolean hasCheckBox;
    public String hint;
    public boolean isChecked;
    public boolean isLinkage;
    public boolean isSingleChoice;
    public boolean isSingleChoiceList;
    public boolean isSingleChoiceListCenterNonCancelable;
    public boolean isSingleChoiceNew;
    public boolean isSingleChoiceNonCancelable;
    public String link;
    public CharSequence linkDefaultText;
    public View.OnClickListener linkListener;
    public CharSequence linkText;
    public DialogInterface.OnClickListener listener;
    public boolean loading;
    public int maxLines;
    public String message;
    public CharSequence messageCharSequence;
    public DialogInterface.OnMultiChoiceClickListener multiListener;
    public String negativeButtonText;

    @Deprecated
    public ButtonTextStyle negativeButtonTextStyle;
    public DialogInterface.OnClickListener negativeListener;
    public String neutralButtonText;
    public DialogInterface.OnClickListener neutralListener;
    public String paragraph;
    public CharSequence paragraphCharSequence;
    public String positiveButtonText;

    @Deprecated
    public ButtonTextStyle positiveButtonTextStyle;
    public DialogInterface.OnClickListener positiveListener;
    public String subtitle;
    public Boolean successful;
    public boolean themed;
    public String title;
    public List<?> urls;
    public TextWatcher watcher;
    public int messageGravity = 17;
    public boolean isShowEditText = false;
    public boolean cancel = true;
    public boolean maxHeightConstraint = false;
    public boolean headerDividingLineVisible = true;

    public static class ButtonTextStyle {
        public boolean isTextBold;

        @ColorRes
        public int textColor;

        @DimenRes
        public int textSize;
    }
}
