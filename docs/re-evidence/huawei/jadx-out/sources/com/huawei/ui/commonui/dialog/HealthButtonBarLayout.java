package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.widget.TextViewCompat;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class HealthButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f23436c;
    private int d;
    private final float e;
    private final float f;

    public HealthButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthButtonBarLayout);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthButtonBarLayout_btnAutoSizeMinTextSize, Math.round(TypedValue.applyDimension(2, 9.0f, displayMetrics)));
        this.f23436c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthButtonBarLayout_btnAutoSizeMaxTextSize, Math.round(TypedValue.applyDimension(2, 16.0f, displayMetrics)));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthButtonBarLayout_btnAutoSizeStepGranularity, Math.round(TypedValue.applyDimension(2, 1.0f, displayMetrics)));
        this.f23434a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthButtonBarLayout_btnReverse, true);
        this.f23435b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthButtonBarLayout_keepSameTextSize, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private float getMinTextSize() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getVisibility() != 8 && (childAt instanceof Button)) {
                float textSize = ((Button) childAt).getTextSize();
                if (textSize < f || Float.compare(f, 0.0f) == 0) {
                    f = textSize;
                }
            }
        }
        return f;
    }

    private void a(float f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getVisibility() != 8 && (childAt instanceof Button)) {
                Button button = (Button) childAt;
                TextViewCompat.setAutoSizeTextTypeWithDefaults(button, 0);
                button.setTextSize(0, f);
            }
        }
    }

    public void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getVisibility() != 8 && (childAt instanceof Button)) {
                Button button = (Button) childAt;
                if (z) {
                    TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(button, Math.round(this.e), Math.round(this.f23436c), Math.round(this.f), 0);
                } else {
                    TextViewCompat.setAutoSizeTextTypeWithDefaults(button, 0);
                    button.setTextSize(0, this.f23436c);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int size = View.MeasureSpec.getSize(i);
        boolean z = false;
        if (size > this.d && d()) {
            setStacked(false);
        }
        this.d = size;
        if (d() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (!d() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
        } else {
            if (z) {
            }
            if (d() || !this.f23435b) {
            }
            a(getMinTextSize());
            return;
        }
        super.onMeasure(i, i2);
        if (d()) {
        }
    }

    private void setStacked(boolean z) {
        if (z == d()) {
            return;
        }
        setOrientation(z ? 1 : 0);
        setShowDividers(z ? 0 : 2);
        if (this.f23434a) {
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
        b(z);
    }

    private boolean d() {
        return getOrientation() == 1;
    }
}
