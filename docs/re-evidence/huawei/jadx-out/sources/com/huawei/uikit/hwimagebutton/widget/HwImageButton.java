package com.huawei.uikit.hwimagebutton.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.huawei.uikit.hwimagebutton.R;
import defpackage.xfs;

/* JADX INFO: loaded from: classes44.dex */
public class HwImageButton extends ImageButton {
    private int e;

    public HwImageButton(Context context) {
        this(context, null);
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwImageButton);
    }

    public int getFocusPathColor() {
        return this.e;
    }

    public void setClickAnimationEnabled(boolean z) {
    }

    public void setFocusPathColor(int i) {
        this.e = i;
    }

    public void setWaitingEnable(boolean z) {
    }

    public HwImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwImageButtonStyle);
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwImageButton, i, 0);
        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.HwImageButton_hwFocusedPathColor, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public HwImageButton(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        b(super.getContext(), attributeSet, i);
    }
}
