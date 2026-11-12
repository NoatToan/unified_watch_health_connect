package com.huawei.ui.commonui.togglebutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.phone.hwtoggle.widget.HwToggleButton;

/* JADX INFO: loaded from: classes16.dex */
public class HealthToggleButton extends HwToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f23928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f23929c;

    public HealthToggleButton(Context context) {
        super(context);
        this.f23927a = false;
        this.f23929c = getTextOn();
        this.f23928b = getTextOff();
        c(context, null);
    }

    public HealthToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23927a = false;
        this.f23929c = getTextOn();
        this.f23928b = getTextOff();
        c(context, attributeSet);
    }

    public HealthToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23927a = false;
        this.f23929c = getTextOn();
        this.f23928b = getTextOff();
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthToggleButton);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthToggleButton_showOnOffText, false);
        this.f23927a = z;
        c(z);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(boolean z) {
        this.f23927a = z;
        if (z) {
            setTextOn(this.f23929c);
            setTextOff(this.f23928b);
        } else {
            setTextOn(null);
            setTextOff(null);
        }
        requestLayout();
    }
}
