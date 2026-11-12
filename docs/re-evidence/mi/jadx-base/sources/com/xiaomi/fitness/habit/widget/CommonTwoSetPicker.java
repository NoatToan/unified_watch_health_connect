package com.xiaomi.fitness.habit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import defpackage.dri;
import defpackage.iui;
import defpackage.m4j;

/* JADX INFO: loaded from: classes8.dex */
public class CommonTwoSetPicker extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NumberPickerView f12192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NumberPickerView f12193b;
    public boolean c;

    public interface a {
    }

    public CommonTwoSetPicker(Context context) {
        this(context, null);
    }

    public final void a() {
        sendAccessibilityEvent(4);
    }

    public int getCurrentLeftValue() {
        return this.f12192a.getValue();
    }

    public int getCurrentRightValue() {
        return this.f12193b.getValue();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.c;
    }

    public void setCurrentLeftValue(int i) {
        if (i == getCurrentLeftValue()) {
            return;
        }
        this.f12192a.setValue(i);
        a();
    }

    public void setCurrentRightValue(float f) {
        int i = ((int) f) * 10;
        if (i == getCurrentLeftValue()) {
            return;
        }
        this.f12193b.setValue(i);
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.c == z) {
            return;
        }
        super.setEnabled(z);
        this.f12192a.setEnabled(z);
        this.f12193b.setEnabled(z);
        this.c = z;
    }

    public void setOnValueChangedListener(a aVar) {
    }

    public CommonTwoSetPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonTwoSetPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(iui.w, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m4j.I4);
        typedArrayObtainStyledAttributes.getBoolean(m4j.J4, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(m4j.L4, 20);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(m4j.M4, 16);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(m4j.K4, 10);
        typedArrayObtainStyledAttributes.recycle();
        this.f12192a = (NumberPickerView) findViewById(dri.A);
        this.f12193b = (NumberPickerView) findViewById(dri.K);
        if (isEnabled()) {
            return;
        }
        setEnabled(false);
    }
}
