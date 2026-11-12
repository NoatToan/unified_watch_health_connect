package com.huawei.uikit.hwtextview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.huawei.uikit.hwtextview.R;
import defpackage.xfs;
import defpackage.xft;

/* JADX INFO: loaded from: classes.dex */
public class HwTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f29772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f29773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StaticLayout f29774c;
    private boolean d;
    private float e;
    private TextPaint g;

    public HwTextView(Context context) {
        this(context, null);
    }

    private void b(int i, int i2, int i3) {
        int maxLines;
        if (i3 != 0 && (maxLines = getMaxLines()) > 1) {
            int totalPaddingLeft = getTotalPaddingLeft();
            int totalPaddingRight = getTotalPaddingRight();
            int extendedPaddingBottom = (i - getExtendedPaddingBottom()) - getExtendedPaddingTop();
            if (extendedPaddingBottom <= 0) {
                return;
            }
            StaticLayout staticLayout = new StaticLayout(getText(), this.g, (i2 - totalPaddingLeft) - totalPaddingRight, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), false);
            this.f29774c = staticLayout;
            int lineCount = staticLayout.getLineCount();
            if (this.f29774c.getHeight() <= extendedPaddingBottom || lineCount <= 1 || lineCount > maxLines + 1) {
                return;
            }
            setMaxLines(lineCount - 1);
        }
    }

    private static Context d(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwTextView);
    }

    public static HwTextView e(Context context) {
        Object objC = xft.c(context, xft.b(context, HwTextView.class, xft.d(context, 15, 1)), HwTextView.class);
        if (objC instanceof HwTextView) {
            return (HwTextView) objC;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        c(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2));
        super.onMeasure(i, i2);
    }

    public void setAutoTextInfo(int i, int i2, int i3) {
        Context context = getContext();
        Resources system = context == null ? Resources.getSystem() : context.getResources();
        this.f29772a = TypedValue.applyDimension(i3, i, system.getDisplayMetrics());
        this.e = TypedValue.applyDimension(i3, i2, system.getDisplayMetrics());
    }

    public void setAutoTextSize(float f) {
        setAutoTextSize(2, f);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.f29772a <= 0.0f || this.e <= 0.0f) {
            return;
        }
        requestLayout();
    }

    public HwTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwTextViewStyle);
    }

    private void c(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwTextView, i, R.style.Widget_Emui_HwTextView);
        this.f29772a = typedArrayObtainStyledAttributes.getDimension(R.styleable.HwTextView_hwAutoSizeMinTextSize, 0.0f);
        this.e = typedArrayObtainStyledAttributes.getDimension(R.styleable.HwTextView_hwAutoSizeStepGranularity, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.HwTextView_hwAutoSizeTextType, 0) == 1;
        typedArrayObtainStyledAttributes.recycle();
        if (Float.compare(this.f29772a, 0.0f) == 0 && Float.compare(this.e, 0.0f) == 0) {
            this.f29772a = getAutoSizeMinTextSize();
            this.e = getAutoSizeStepGranularity();
            setAutoSizeTextTypeWithDefaults(0);
        }
        TextPaint textPaint = new TextPaint();
        this.g = textPaint;
        textPaint.set(getPaint());
        this.f29773b = getTextSize();
    }

    public void setAutoTextSize(int i, float f) {
        Context context = getContext();
        this.f29773b = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        super.setTextSize(i, f);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
    }

    public HwTextView(Context context, AttributeSet attributeSet, int i) {
        super(d(context, i), attributeSet, i);
        c(super.getContext(), attributeSet, i);
    }

    private void c(int i, int i2, int i3) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (maxWidth != -1 && maxWidth < i) {
            i = maxWidth;
        }
        if (maxHeight != -1 && maxHeight < i2) {
            i2 = maxHeight;
        }
        int totalPaddingLeft = (i - getTotalPaddingLeft()) - getTotalPaddingRight();
        if (totalPaddingLeft < 0) {
            return;
        }
        if (this.g == null) {
            this.g = new TextPaint();
        }
        this.g.set(getPaint());
        e(i, i2, totalPaddingLeft, i3);
    }

    private void e(int i, int i2, int i3, int i4) {
        if (!(this.d && getMaxLines() == Integer.MAX_VALUE) && Float.compare(this.f29772a, 0.0f) > 0 && Float.compare(this.e, 0.0f) > 0) {
            float f = this.f29773b;
            CharSequence text = getText();
            TransformationMethod transformationMethod = getTransformationMethod();
            if (transformationMethod != null) {
                text = transformationMethod.getTransformation(text, this);
            }
            this.g.setTextSize(f);
            float fMeasureText = this.g.measureText(text.toString());
            while (c(fMeasureText, i3, f)) {
                f -= this.e;
                this.g.setTextSize(f);
                fMeasureText = this.g.measureText(text.toString());
            }
            float f2 = this.f29772a;
            if (f < f2) {
                f = f2;
            }
            setTextSize(0, f);
            b(i2, i, i4);
        }
    }

    private boolean c(float f, int i, float f2) {
        if (!this.d || getMaxLines() == 1) {
            return Float.compare(f, (float) i) > 0 && Float.compare(f2, this.f29772a) > 0;
        }
        return e(i) > getMaxLines() && f2 > this.f29772a;
    }

    private int e(int i) {
        CharSequence text = getText();
        if (text == null) {
            return 0;
        }
        return StaticLayout.Builder.obtain(text, 0, text.length(), this.g, i).build().getLineCount();
    }
}
