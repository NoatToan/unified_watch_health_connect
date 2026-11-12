package com.huawei.health.basesport.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.huawei.health.basefitnessadvice.R;

/* JADX INFO: loaded from: classes7.dex */
public class SportControlButton extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6214a;

    public SportControlButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6214a = getResources().getDimensionPixelOffset(R.dimen.hw_sport_control_button_width);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.f6214a;
        setMeasuredDimension(i3, i3);
    }
}
