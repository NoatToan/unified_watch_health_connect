package com.huawei.uikit.hwcardview.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.huawei.uikit.hwcardview.R;
import defpackage.xfs;

/* JADX INFO: loaded from: classes44.dex */
public class HwCardView extends CardView {
    public HwCardView(Context context) {
        this(context, null);
    }

    private static Context e(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwCardView);
    }

    public HwCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwCardViewStyle);
    }

    public HwCardView(Context context, AttributeSet attributeSet, int i) {
        super(e(context, i), attributeSet, i);
    }
}
