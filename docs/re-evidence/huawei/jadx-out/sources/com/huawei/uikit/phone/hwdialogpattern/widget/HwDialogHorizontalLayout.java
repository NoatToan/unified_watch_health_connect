package com.huawei.uikit.phone.hwdialogpattern.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.huawei.uikit.phone.hwdialogpattern.R;
import defpackage.xft;
import defpackage.xfu;

/* JADX INFO: loaded from: classes45.dex */
public class HwDialogHorizontalLayout extends LinearLayout {
    public HwDialogHorizontalLayout(Context context) {
        this(context, null);
    }

    private void c(Context context, int i, int i2) {
        if (context != null) {
            if (Float.compare(xfu.d(context), 1.75f) < 0 || xft.c(getContext()) != 1) {
                LayoutInflater.from(context).inflate(i2, this);
            } else {
                LayoutInflater.from(context).inflate(i, this);
            }
        }
    }

    public HwDialogHorizontalLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HwDialogHorizontalLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, R.layout.hwdialogpattern_horizontal_progress_auxiliary, R.layout.hwdialogpattern_horizontal_progress_normal);
    }
}
