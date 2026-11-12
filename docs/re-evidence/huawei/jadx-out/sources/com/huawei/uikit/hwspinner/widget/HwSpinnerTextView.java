package com.huawei.uikit.hwspinner.widget;

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
import android.view.accessibility.AccessibilityManager;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.huawei.uikit.hwspinner.R;

/* JADX INFO: loaded from: classes44.dex */
public class HwSpinnerTextView extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f29728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextPaint f29729b;
    private float d;
    private float e;

    public HwSpinnerTextView(Context context) {
        this(context, null);
    }

    private void d(int i, int i2, int i3) {
        int maxLines;
        if (i3 != 0 && (maxLines = getMaxLines()) > 1) {
            int totalPaddingLeft = getTotalPaddingLeft();
            int totalPaddingRight = getTotalPaddingRight();
            int extendedPaddingBottom = (i - getExtendedPaddingBottom()) - getExtendedPaddingTop();
            if (extendedPaddingBottom <= 0) {
                return;
            }
            StaticLayout staticLayout = new StaticLayout(getText(), getPaint(), (i2 - totalPaddingLeft) - totalPaddingRight, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), false);
            int lineCount = staticLayout.getLineCount();
            if (staticLayout.getHeight() <= extendedPaddingBottom || lineCount <= 1 || lineCount > maxLines + 1) {
                return;
            }
            setMaxLines(lineCount - 1);
        }
    }

    private void d(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwSpinnerTextView, i, 0);
        this.e = typedArrayObtainStyledAttributes.getDimension(R.styleable.HwSpinnerTextView_hwAutoSizeMinTextSize, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getDimension(R.styleable.HwSpinnerTextView_hwAutoSizeStepGranularity, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        if (this.e == 0.0f && this.d == 0.0f) {
            this.e = getAutoSizeMinTextSize();
            this.d = getAutoSizeStepGranularity();
            setAutoSizeTextTypeWithDefaults(0);
        }
        TextPaint textPaint = new TextPaint();
        this.f29729b = textPaint;
        textPaint.set(getPaint());
        this.f29728a = getTextSize();
    }

    @Override // android.view.View
    public boolean isClickable() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        return !(accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) && super.isClickable();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        b(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2));
        super.onMeasure(i, i2);
    }

    public void setAutoTextInfo(int i, int i2, int i3) {
        Context context = getContext();
        Resources system = context == null ? Resources.getSystem() : context.getResources();
        this.e = TypedValue.applyDimension(i3, i, system.getDisplayMetrics());
        this.d = TypedValue.applyDimension(i3, i2, system.getDisplayMetrics());
    }

    public void setAutoTextSize(float f) {
        setAutoTextSize(2, f);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        boolean zIsPressed = isPressed();
        super.setSelected(z);
        if (z || zIsPressed == isPressed()) {
            return;
        }
        setPressed(zIsPressed);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (Float.compare(this.e, 0.0f) <= 0 || Float.compare(this.d, 0.0f) <= 0) {
            return;
        }
        requestLayout();
    }

    public HwSpinnerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet, 0);
    }

    public void setAutoTextSize(int i, float f) {
        Context context = getContext();
        this.f29728a = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        super.setTextSize(i, f);
    }

    public HwSpinnerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet, i);
    }

    private void b(int i, int i2, int i3) {
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
        if (this.f29729b == null) {
            this.f29729b = new TextPaint();
        }
        this.f29729b.set(getPaint());
        if (this.e <= 0.0f || this.d <= 0.0f) {
            return;
        }
        float f = this.f29728a;
        CharSequence text = getText();
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            text = transformationMethod.getTransformation(text, this);
        }
        this.f29729b.setTextSize(f);
        float fMeasureText = this.f29729b.measureText(text.toString());
        while (Float.compare(fMeasureText, totalPaddingLeft) > 0 && Float.compare(f, this.e) > 0) {
            f -= this.d;
            this.f29729b.setTextSize(f);
            fMeasureText = this.f29729b.measureText(text.toString());
        }
        float f2 = this.e;
        if (f < f2) {
            f = f2;
        }
        setTextSize(0, f);
        d(i2, i, i3);
    }
}
