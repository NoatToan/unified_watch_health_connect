package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cmi;

/* JADX INFO: loaded from: classes3.dex */
public class CheckedTextView extends AppCompatCheckedTextView {
    public static final int[] i = {R.attr.state_checked};
    public Drawable e;
    public boolean f;
    public boolean g;
    public int h;

    public CheckedTextView(Context context) {
        this(context, null);
    }

    public static int d(int i2, int i3, int i4, int i5) {
        return ((((i2 - i4) - i5) - i3) / 2) + i4;
    }

    private int getCheckWidth() {
        Drawable checkMarkDrawable = getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return 0;
        }
        return checkMarkDrawable.getCurrent().getIntrinsicWidth();
    }

    public final void c(Canvas canvas, boolean z) {
        int width;
        int scrollX;
        Drawable checkMarkDrawable = getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            int intrinsicWidth = checkMarkDrawable.getCurrent().getIntrinsicWidth();
            if (z) {
                width = getPaddingLeft();
                scrollX = getScrollX();
            } else {
                width = (getWidth() - getPaddingRight()) - intrinsicWidth;
                scrollX = getScrollX();
            }
            int i2 = width + scrollX;
            int paddingTop = getPaddingTop();
            int paddingTop2 = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int intrinsicHeight = checkMarkDrawable.getIntrinsicHeight();
            if (checkMarkDrawable.getCurrent() instanceof NinePatchDrawable) {
                intrinsicHeight = (getHeight() - paddingTop) - getPaddingBottom();
            } else {
                int gravity = getGravity() & 112;
                if (gravity == 16) {
                    paddingTop = d(getHeight(), intrinsicHeight, paddingTop2, paddingBottom);
                } else if (gravity == 80) {
                    paddingTop = getHeight() - intrinsicHeight;
                }
            }
            checkMarkDrawable.setBounds(i2, paddingTop, intrinsicWidth + i2, intrinsicHeight + paddingTop);
            checkMarkDrawable.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckedTextView, android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.e != null) {
            this.e.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.widget.CheckedTextView
    public Drawable getCheckMarkDrawable() {
        return this.e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = (int) getContext().getResources().getDimension(cmi.f5486a);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, i);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z = getLayoutDirection() == 1;
        if (this.f) {
            c(canvas, z);
        }
        if (getCheckMarkDrawable() != null) {
            this.g = getCheckMarkDrawable().getClass().isAssignableFrom(StateListDrawable.class);
        } else {
            this.g = false;
        }
        if (z && this.f && this.g) {
            canvas.save();
            canvas.translate(getCheckWidth(), 0.0f);
        }
        super.onDraw(canvas);
        if (z && this.f && this.g) {
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int checkWidth = getCheckWidth();
        if (checkWidth > 0) {
            if (TextUtils.isEmpty(getText())) {
                this.f = true;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(checkWidth, View.MeasureSpec.getMode(i2)), i3);
                setMeasuredDimension(checkWidth, getMeasuredHeight());
                return;
            } else if (size - getPaddingEnd() < checkWidth * 2) {
                this.f = false;
                checkWidth = 0;
            } else {
                this.f = true;
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - checkWidth, View.MeasureSpec.getMode(i2));
        if (mode == 1073741824) {
            super.onMeasure(iMakeMeasureSpec, i3);
            if (checkWidth == 0) {
                return;
            }
            setMeasuredDimension(getMeasuredWidth() + checkWidth, getMeasuredHeight());
            return;
        }
        int minWidth = getMinWidth();
        if (this.f) {
            setMinWidth(0);
            setMinimumWidth(0);
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (checkWidth == 0) {
            return;
        }
        setMeasuredDimension(Math.max(getMeasuredWidth() + checkWidth, minWidth), getMeasuredHeight());
        setMinWidth(minWidth);
        setMinimumWidth(minWidth);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckedTextView, android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.e);
        }
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setVisible(getVisibility() == 0, false);
            drawable.setState(i);
            setMinHeight(drawable.getIntrinsicHeight());
            drawable.setState(getDrawableState());
        }
        this.e = drawable;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e;
    }

    public CheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public CheckedTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f = true;
        this.g = false;
        this.h = (int) getContext().getResources().getDimension(cmi.f5486a);
    }
}
