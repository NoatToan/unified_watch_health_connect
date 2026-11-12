package com.huami.lib.rainbow;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class IconTextView extends AppCompatTextView {
    private int a;
    private Rect b;
    private int c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconPosition {
        public static final int END = 2;
        public static final int NORMAL = -1;
        public static final int START = 1;
        public static final int START_AND_END = 3;
    }

    public IconTextView(@NonNull Context context) {
        this(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        setRelativeDrawablesIfNeeded(getCompoundDrawablesRelative());
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.text, android.R.attr.drawableLeft});
            String string = typedArrayObtainStyledAttributes.getString(0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (TextUtils.isEmpty(string) && resourceId == 0) {
                setGravity(17);
                setText("测试");
                setCompoundDrawablePadding(10);
            }
        }
    }

    private void setRelativeDrawablesIfNeeded(Drawable[] drawableArr) {
        Drawable drawable = drawableArr[0];
        Drawable drawable2 = drawableArr[2];
        if ((drawable == null && drawable2 == null) ? false : true) {
            if (drawable != null && drawable2 != null) {
                this.a = drawable.getIntrinsicWidth() + drawable2.getIntrinsicWidth();
                this.c = 3;
            } else if (drawable != null) {
                this.a = drawable.getIntrinsicWidth();
                this.c = 1;
            } else {
                this.a = drawable2.getIntrinsicWidth();
                this.c = 2;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableArr[1], drawable2, drawableArr[3]);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c != -1) {
            int compoundDrawablePadding = getCompoundDrawablePadding();
            TextPaint paint = getPaint();
            String string = getText().toString();
            paint.getTextBounds(string, 0, string.length(), this.b);
            int width = (getWidth() >> 1) - (((this.a + ((this.c == 3 ? 2 : 1) * compoundDrawablePadding)) + this.b.width()) >> 1);
            setCompoundDrawablePadding((-width) + compoundDrawablePadding);
            int i5 = this.c;
            if (i5 == 1) {
                setPadding(width, getPaddingTop(), 0, getPaddingBottom());
                return;
            }
            if (i5 == 2) {
                setPadding(0, getPaddingTop(), width, getPaddingBottom());
            } else if (i5 != 3) {
                setPadding(0, getPaddingTop(), 0, getPaddingBottom());
            } else {
                setPadding(width, getPaddingTop(), width, getPaddingBottom());
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        if (drawable != null && drawable3 != null) {
            this.a = drawable.getIntrinsicWidth() + drawable3.getIntrinsicWidth();
            this.c = 3;
        } else if (drawable != null) {
            this.a = drawable.getIntrinsicWidth();
            this.c = 1;
        } else if (drawable3 != null) {
            this.a = drawable3.getIntrinsicWidth();
            this.c = 2;
        } else {
            this.c = -1;
        }
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        if (drawable != null && drawable3 != null) {
            this.a = drawable.getIntrinsicWidth() + drawable3.getIntrinsicWidth();
            this.c = 3;
        } else if (drawable != null) {
            this.a = drawable.getIntrinsicWidth();
            this.c = 1;
        } else if (drawable3 != null) {
            this.a = drawable3.getIntrinsicWidth();
            this.c = 2;
        } else {
            this.c = -1;
        }
        requestLayout();
    }

    public IconTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public IconTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (this.b == null) {
            this.b = new Rect();
        }
        a(context, attributeSet);
    }
}
