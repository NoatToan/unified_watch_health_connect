package com.huawei.ui.commonui.datepicker;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.uikit.phone.hwdatepicker.widget.HwDatePicker;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes16.dex */
public class HealthDatePicker extends HwDatePicker {

    /* JADX INFO: loaded from: classes43.dex */
    public interface OnDateChangedListener {
        void onDateChanged(HealthDatePicker healthDatePicker, int i, int i2, int i3, GregorianCalendar gregorianCalendar);
    }

    public HealthDatePicker(Context context) {
        super(context);
    }

    public HealthDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HealthDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.uikit.hwdatepicker.widget.HwDatePicker
    public int getMonth() {
        return super.getMonth() + 1;
    }

    @Override // com.huawei.uikit.hwdatepicker.widget.HwDatePicker
    public void d(int i, int i2, int i3) {
        super.d(i, i2 - 1, i3);
    }
}
