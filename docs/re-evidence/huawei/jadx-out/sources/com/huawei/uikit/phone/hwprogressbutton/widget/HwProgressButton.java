package com.huawei.uikit.phone.hwprogressbutton.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.huawei.uikit.hwprogressbutton.R;
import defpackage.xfu;

/* JADX INFO: loaded from: classes20.dex */
public class HwProgressButton extends com.huawei.uikit.hwprogressbutton.widget.HwProgressButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29840a;

    public HwProgressButton(Context context) {
        this(context, null);
    }

    @Override // com.huawei.uikit.hwprogressbutton.widget.HwProgressButton
    public void b(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        Drawable focusedDrawable = getFocusedDrawable();
        if (focusedDrawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) focusedDrawable;
            gradientDrawable.setCornerRadius(getFocusedPathWidth() + getFocusedPathPadding() + getCornerRadius());
            gradientDrawable.setStroke((int) getFocusedPathWidth(), getFocusedPathColor());
            gradientDrawable.setBounds((int) (-(getFocusedPathWidth() + getFocusedPathPadding())), (int) (-(getFocusedPathWidth() + getFocusedPathPadding())), (int) (getWidth() + getFocusedPathWidth() + getFocusedPathPadding()), (int) (getHeight() + getFocusedPathWidth() + getFocusedPathPadding()));
            canvas.translate(-getScrollX(), -getScrollY());
            gradientDrawable.draw(canvas);
            canvas.translate(getScrollX(), getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    @Override // com.huawei.uikit.hwprogressbutton.widget.HwProgressButton, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29 && Float.compare(xfu.d(this.f29840a), 1.75f) >= 0) {
            measureChildWithMargins(getPercentage(), i, 0, i2, 0);
            int minHeight = getProgressBar().getMinHeight();
            int measuredHeight = getPercentage().getMeasuredHeight();
            if (minHeight != measuredHeight) {
                getProgressBar().setMinHeight(measuredHeight);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (getFocusedDrawable() != null) {
            invalidate();
        }
    }

    public HwProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwProgressButtonStyle);
    }

    public HwProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29840a = context;
        if (Build.VERSION.SDK_INT < 29 || Float.compare(xfu.d(context), 1.75f) < 0) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.huawei.uikit.phone.hwprogressbutton.R.dimen.hwprogressbutton_padding_top_or_bottom);
        getPercentage().setPadding(getPercentage().getPaddingLeft(), dimensionPixelSize, getPercentage().getPaddingRight(), dimensionPixelSize);
    }
}
