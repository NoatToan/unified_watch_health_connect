package com.huawei.ui.commonui.numberpicker;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.phone.hwadvancednumberpicker.widget.HwAdvancedNumberPicker;

/* JADX INFO: loaded from: classes16.dex */
public class HealthNumberPicker extends HwAdvancedNumberPicker {

    public interface OnPickedListener {
        void onValuePicked(int i, int i2);
    }

    public HealthNumberPicker(Context context) {
        super(context);
        c(context);
    }

    public HealthNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    private void c(Context context) {
        setOnColorChangeListener(new com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnColorChangeListener() { // from class: com.huawei.ui.commonui.numberpicker.HealthNumberPicker.3
            @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnColorChangeListener
            public void onColorChange(com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker hwAdvancedNumberPicker) {
                LogUtil.d("HealthNumberPicker", "onColorChange");
            }
        });
        setSelectorPaintColor(context.getResources().getColor(R.color.common_colorAccent));
        setSlaverPaintColor(context.getResources().getColor(R.color.textColorPrimary));
    }

    public void setOnValuePickedListener(final OnPickedListener onPickedListener) {
        super.setOnValueChangedListener(new com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.commonui.numberpicker.HealthNumberPicker.2
            @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnValueChangeListener
            public void onValueChange(com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, int i2) {
                OnPickedListener onPickedListener2 = onPickedListener;
                if (onPickedListener2 != null) {
                    onPickedListener2.onValuePicked(i, i2);
                }
            }
        });
    }

    @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker
    public void setDisplayedValues(String[] strArr) {
        if (getValue() < getMinValue()) {
            setValue(getMinValue());
        }
        super.setDisplayedValues(strArr);
    }

    public void e(float f, float f2) {
        this.m = f;
        this.r = f2;
    }

    public void setSelectorElementAndTextGapHeight(int i, int i2) {
        this.o = i;
        this.k = i2;
    }
}
