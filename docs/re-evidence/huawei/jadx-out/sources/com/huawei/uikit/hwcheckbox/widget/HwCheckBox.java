package com.huawei.uikit.hwcheckbox.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.huawei.uikit.hwcheckbox.R;
import defpackage.xfs;

/* JADX INFO: loaded from: classes20.dex */
public class HwCheckBox extends CheckBox {
    public HwCheckBox(Context context) {
        this(context, null);
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwCheckBox);
    }

    public HwCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwCheckBoxStyle);
    }

    public HwCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        setDefaultFocusHighlightEnabled(false);
    }
}
