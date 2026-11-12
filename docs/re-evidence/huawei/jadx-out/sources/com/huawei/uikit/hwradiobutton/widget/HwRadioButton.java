package com.huawei.uikit.hwradiobutton.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.huawei.uikit.hwradiobutton.R;
import defpackage.xfs;

/* JADX INFO: loaded from: classes20.dex */
public class HwRadioButton extends RadioButton {
    public HwRadioButton(Context context) {
        this(context, null);
    }

    private static Context d(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwRadioButton);
    }

    public HwRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwRadioButtonStyle);
    }

    public HwRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(d(context, i), attributeSet, i);
        setDefaultFocusHighlightEnabled(false);
    }
}
