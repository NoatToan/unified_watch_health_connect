package com.huawei.uikit.phone.hwtoggle.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.huawei.uikit.phone.hwtoggle.R;
import defpackage.xfu;

/* JADX INFO: loaded from: classes20.dex */
public class HwToggleButton extends com.huawei.uikit.hwtoggle.widget.HwToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29858a;
    private int d;

    public HwToggleButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        Drawable focusedDrawable = getFocusedDrawable();
        if (isFocused() && focusedDrawable != null && hasWindowFocus()) {
            canvas.translate(getScrollX(), getScrollY());
            int i = (-this.d) - this.f29858a;
            focusedDrawable.setBounds(i, i, getWidth() + this.d + this.f29858a, getHeight() + this.d + this.f29858a);
            focusedDrawable.draw(canvas);
            canvas.translate(-getScrollX(), -getScrollY());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (getFocusedDrawable() != null) {
            invalidate();
        }
    }

    public HwToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwToggleStyle);
    }

    public HwToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = (int) getResources().getDimension(R.dimen.hwtoggle_focus_status_padding);
        this.f29858a = (int) getResources().getDimension(R.dimen.hwtoggle_focus_status_stroke_width);
        if (Float.compare(xfu.d(context), 1.75f) >= 0) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwtoggle_button_padding_top_or_bottom);
            setPadding(getPaddingLeft(), dimensionPixelSize, getPaddingRight(), dimensionPixelSize);
        }
    }
}
