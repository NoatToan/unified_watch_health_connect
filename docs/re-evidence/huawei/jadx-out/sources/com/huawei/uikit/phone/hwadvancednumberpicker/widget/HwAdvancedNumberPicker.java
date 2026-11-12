package com.huawei.uikit.phone.hwadvancednumberpicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.uikit.phone.hwunifiedinteract.widget.HwGenericEventDetector;

/* JADX INFO: loaded from: classes20.dex */
public class HwAdvancedNumberPicker extends com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker {
    public HwAdvancedNumberPicker(Context context) {
        this(context, null);
    }

    public HwAdvancedNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HwGenericEventDetector d() {
        return new HwGenericEventDetector(getContext());
    }

    public HwAdvancedNumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
