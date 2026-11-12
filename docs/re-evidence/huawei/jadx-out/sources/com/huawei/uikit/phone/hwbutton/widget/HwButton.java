package com.huawei.uikit.phone.hwbutton.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.uikit.hwbutton.R;
import defpackage.xfu;

/* JADX INFO: loaded from: classes20.dex */
public class HwButton extends com.huawei.uikit.hwbutton.widget.HwButton {
    public HwButton(Context context) {
        this(context, null);
    }

    private void d(Canvas canvas) {
        Drawable focusedDrawable;
        if (isFocusable() && hasWindowFocus() && (focusedDrawable = getFocusedDrawable()) != null && isFocused()) {
            canvas.translate(getScrollX(), getScrollY());
            focusedDrawable.setBounds((-getFocusedPathPadding()) - getFocusedPathWidth(), (-getFocusedPathPadding()) - getFocusedPathWidth(), getWidth() + getFocusedPathPadding() + getFocusedPathWidth(), getHeight() + getFocusedPathPadding() + getFocusedPathWidth());
            focusedDrawable.draw(canvas);
            canvas.translate(-getScrollX(), -getScrollY());
        }
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

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (getFocusedDrawable() != null) {
            invalidate();
        }
    }

    public HwButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwButtonStyle);
    }

    public HwButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.HwButton, i, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwButton_hwAuxiliaryEnable, true) && Float.compare(xfu.d(context), 1.75f) >= 0) {
            setMaxLines(2);
            int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.HwButton_hwButtonStyleType, 0);
            if (i2 == 0) {
                setAutoTextInfo(13, 1, 2);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwbutton_big_padding_top_or_bottom);
                setPadding(getPaddingLeft(), dimensionPixelSize, getPaddingRight(), dimensionPixelSize);
            }
            if (i2 == 1) {
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.hwbutton_small_padding_top_or_bottom);
                setPadding(getPaddingLeft(), dimensionPixelSize2, getPaddingRight(), dimensionPixelSize2);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
