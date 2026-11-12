package com.huawei.uikit.phone.hwcheckbox.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.huawei.uikit.hwcheckbox.R;

/* JADX INFO: loaded from: classes20.dex */
public class HwCheckBox extends com.huawei.uikit.hwcheckbox.widget.HwCheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29836b;

    public HwCheckBox(Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f29836b) {
            setGravity(8388659);
        } else {
            setGravity(8388627);
        }
        super.onDraw(canvas);
    }

    public HwCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwCheckBoxStyle);
    }

    public HwCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.HwCheckBox, i, 0);
        this.f29836b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwCheckBox_hwAutoTopEnabled, false);
        this.f29835a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwCheckBox_hwAuxiliaryEnabled, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
