package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.huawei.healthcloud.plugintrack.R;

/* JADX INFO: loaded from: classes33.dex */
public class SportControlButton extends ImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11313c;

    public SportControlButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11313c = getResources().getDimensionPixelOffset(R.dimen.hw_sport_control_button_width);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.f11313c;
        setMeasuredDimension(i3, i3);
    }
}
