package com.huawei.uikit.hwtoggle.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ToggleButton;
import com.huawei.uikit.hwtoggle.R;
import defpackage.xcv;
import defpackage.xfs;

/* JADX INFO: loaded from: classes20.dex */
public class HwToggleButton extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f29790a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29791c;
    private float d;
    private float e;

    public HwToggleButton(Context context) {
        this(context, null);
    }

    private void d(boolean z) {
        xcv.a(this, z ? this.d : this.e).start();
    }

    public int getFocusPathColor() {
        return this.f29791c;
    }

    public Drawable getFocusedDrawable() {
        return this.f29790a;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    @Override // android.view.View
    public void onHoverChanged(boolean z) {
        super.onHoverChanged(z);
        if (this.d == 1.0f) {
            return;
        }
        d(z);
    }

    public void setFocusPathColor(int i) {
        this.f29791c = i;
    }

    public void setFocusedDrawable(Drawable drawable) {
        this.f29790a = drawable;
    }

    public HwToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwToggleStyle);
    }

    public HwToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(b(context, i), attributeSet, i);
        setDefaultFocusHighlightEnabled(false);
        d(getContext(), attributeSet, i);
    }

    private void d(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwToggleButton, i, R.style.Widget_Emui_HwToggle);
        this.f29790a = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwToggleButton_hwFocusedDrawable);
        this.f29791c = typedArrayObtainStyledAttributes.getColor(R.styleable.HwToggleButton_hwFocusedPathColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.hwtoggle_out_hover_zoom_scale, typedValue, true);
        this.d = typedValue.getFloat();
        getResources().getValue(R.dimen.hwtoggle_out_hover_status_scale, typedValue, true);
        this.e = typedValue.getFloat();
    }

    private static Context b(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwToggle);
    }
}
