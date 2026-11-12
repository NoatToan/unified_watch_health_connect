package com.huami.lib.view.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.huami.lib.view.R;

/* JADX INFO: loaded from: classes10.dex */
public class TextViewDrawable extends AppCompatTextView {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;

    public TextViewDrawable(Context context) {
        this(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextViewDrawable);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextViewDrawable_drawableLeftWidth, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextViewDrawable_drawableTopWidth, 0);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextViewDrawable_drawableRightWidth, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextViewDrawable_drawableBottomWidth, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextViewDrawable_drawableLeftHeight, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextViewDrawable_drawableTopHeight, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextViewDrawable_drawableRightHeight, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextViewDrawable_drawableBottomHeight, 0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextViewDrawable_isAliganCenter, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0031  */
    private void b(Drawable drawable, int i, int i2, int i3) {
        int lineHeight;
        int i4;
        if (i2 == 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (i3 == 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        int i5 = 0;
        if (i == 0) {
            if (this.i) {
                lineHeight = 0;
            } else {
                lineHeight = (((-getLineCount()) * getLineHeight()) / 2) + (getLineHeight() / 2);
            }
            i4 = i3 + lineHeight;
        } else if (i == 1) {
            int i6 = this.i ? 0 : ((-this.j) / 2) + (i2 / 2);
            i2 += i6;
            i4 = i3 + 0;
            i5 = i6;
            lineHeight = 0;
        } else if (i != 2) {
            lineHeight = 0;
            i2 = 0;
            i4 = 0;
        } else {
            if (this.i) {
                lineHeight = 0;
            } else {
                lineHeight = (((-getLineCount()) * getLineHeight()) / 2) + (getLineHeight() / 2);
            }
            i4 = i3 + lineHeight;
        }
        drawable.setBounds(i5, lineHeight, i2, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j = i;
        Drawable[] compoundDrawables = getCompoundDrawables();
        Drawable drawable = compoundDrawables[0];
        Drawable drawable2 = compoundDrawables[1];
        Drawable drawable3 = compoundDrawables[2];
        Drawable drawable4 = compoundDrawables[3];
        if (drawable != null) {
            b(drawable, 0, this.a, this.e);
        }
        if (drawable2 != null) {
            b(drawable2, 1, this.b, this.f);
        }
        if (drawable3 != null) {
            b(drawable3, 2, this.c, this.g);
        }
        if (drawable4 != null) {
            b(drawable4, 3, this.d, this.h);
        }
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    public TextViewDrawable(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextViewDrawable(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
        a(context, attributeSet);
    }
}
