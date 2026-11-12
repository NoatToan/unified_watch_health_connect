package com.huami.android.design.dialog.choice;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class ChoiceItemInfo {
    public boolean checked;
    public CharSequence summary;
    public CharSequence tipValue;
    public CharSequence tips;
    public CharSequence title;
    public CharSequence value;
    public int strikeThroughLength = 0;

    @DrawableRes
    public int icon = -1;

    @ColorRes
    public int iconTintColor = -1;

    @ColorRes
    public int color = -1;
    public boolean hasCheckBox = false;
    public boolean checkboxEnable = true;
    public boolean showMaskView = false;
    public boolean isSmallStyle = false;
    public boolean visible = true;

    @ColorRes
    public int dividerColor = -1;
    public int checkboxStyle = 0;

    @DrawableRes
    public int arrowIcon = -1;

    @NonNull
    public String toString() {
        return "ChoiceItemInfo{title=" + ((Object) this.title) + ", summary=" + ((Object) this.summary) + ", tips=" + ((Object) this.tips) + ", value=" + ((Object) this.value) + ", tipValue=" + ((Object) this.tipValue) + ", strikeThroughLength=" + this.strikeThroughLength + ", icon=" + this.icon + ", iconTintColor=" + this.iconTintColor + ", color=" + this.color + ", hasCheckBox=" + this.hasCheckBox + ", checked=" + this.checked + ", checkboxEnable=" + this.checkboxEnable + ", showMaskView=" + this.showMaskView + ", isSmallStyle=" + this.isSmallStyle + ", visible=" + this.visible + ", dividerColor=" + this.dividerColor + ", checkboxStyle=" + this.checkboxStyle + ", arrowIcon=" + this.arrowIcon + '}';
    }
}
