package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.r1j;

/* JADX INFO: loaded from: classes9.dex */
public class CustomerSwitchButton extends SwitchButton {
    public CustomerSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xiaomi.fitness.widget.button.SwitchButton, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.xiaomi.fitness.widget.button.BaseSwitchButton, com.xiaomi.fitness.widget.button.ISwitchButton
    public boolean setChecked(boolean z) {
        setContentDescription(z ? ResourceExtKt.getString(r1j.common_switch_open_content) : ResourceExtKt.getString(r1j.common_switch_off_content));
        return super.setChecked(z);
    }
}
