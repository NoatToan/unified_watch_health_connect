package com.huawei.ui.commonui.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.hwtimepicker.widget.HwTimePicker;

/* JADX INFO: loaded from: classes16.dex */
public class HealthTimePicker extends HwTimePicker {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthTimePicker(Context context) {
        this(context, null);
        e(context);
    }

    public HealthTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        e(context);
    }

    public HealthTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(Context context) {
        setSpinnersSelectorPaintColor(context.getResources().getColor(R.color.common_colorAccent));
        setIsMinuteIntervalFiveMinute(false);
    }

    public void setTime(int i, int i2) {
        a(0, 0, 0, i, i2);
    }
}
