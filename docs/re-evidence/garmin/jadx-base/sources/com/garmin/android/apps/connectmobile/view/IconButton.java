package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class IconButton extends AppCompatButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f47468b;

    public IconButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f47468b = new Rect();
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j1.f149713o);
        try {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE);
            this.f47467a = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            setGravity(typedArrayObtainStyledAttributes.getInteger(0, 17));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        int i18 = 0;
        Drawable drawable = getCompoundDrawablesRelative()[0];
        Drawable drawable2 = getCompoundDrawablesRelative()[2];
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        if (drawable != null || drawable2 != null) {
            TextPaint paint = getPaint();
            String string = getText().toString();
            int length = string.length();
            Rect rect = this.f47468b;
            paint.getTextBounds(string, 0, length, rect);
            int iWidth = rect.width();
            if (drawable != null) {
                iWidth += drawable.getIntrinsicWidth() + this.f47467a;
            }
            if (drawable2 != null) {
                iWidth += drawable2.getIntrinsicWidth() + this.f47467a;
            }
            int width = (int) ((((double) getWidth()) / 2.0d) - (((double) iWidth) / 2.0d));
            int i19 = this.f47467a - width;
            int i24 = drawable != null ? width : 0;
            paddingEnd = drawable2 != null ? width : 0;
            i18 = i19;
            paddingStart = i24;
        }
        setCompoundDrawablePadding(i18);
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, getCompoundDrawablesRelative()[1], drawable2, getCompoundDrawablesRelative()[3]);
        setPaddingRelative(paddingStart, getPaddingTop(), paddingEnd, getPaddingBottom());
    }

    public void setDrawablePadding(int i14) {
        this.f47467a = i14;
        requestLayout();
    }

    public IconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconButton(Context context) {
        this(context, null, 0);
    }
}
