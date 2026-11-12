package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import java.util.Arrays;
import l7.f;

/* JADX INFO: loaded from: classes14.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private final RectF scratch;
    private final Rect scratchLineBounds;
    private final ColorStateList textColor;
    private final SparseArray<TextView> textViewPool;
    private final Rect textViewRect;
    private final androidx.core.view.a valueAccessibilityDelegate;
    private String[] values;

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.textViewRect = new Rect();
        this.scratch = new RectF();
        this.scratchLineBounds = new Rect();
        this.textViewPool = new SparseArray<>();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockFaceView, i14, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockNumberTextColor);
        this.textColor = colorStateList;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.clockHandView = clockHandView;
        this.clockHandPadding = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = a7.b.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.clockHandView.getSelectorRadius()) - ClockFaceView.this.clockHandPadding);
                return true;
            }
        });
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.valueAccessibilityDelegate = new androidx.core.view.a() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
                super.onInitializeAccessibilityNodeInfo(view2, fVar);
                int iIntValue = ((Integer) view2.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    fVar.f110563a.setTraversalAfter((View) ClockFaceView.this.textViewPool.get(iIntValue - 1));
                }
                fVar.q(f.h.a(0, 1, iIntValue, 1, false, view2.isSelected()));
                fVar.o(true);
                fVar.b(f.a.f110568g);
            }

            @Override // androidx.core.view.a
            public boolean performAccessibilityAction(View view2, int i15, Bundle bundle) {
                if (i15 != 16) {
                    return super.performAccessibilityAction(view2, i15, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view2.getHitRect(ClockFaceView.this.textViewRect);
                float fCenterX = ClockFaceView.this.textViewRect.centerX();
                float fCenterY = ClockFaceView.this.textViewRect.centerY();
                ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.minimumHeight = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.minimumWidth = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.clockSize = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    private void findIntersectingTextView() {
        RectF currentSelectorBox = this.clockHandView.getCurrentSelectorBox();
        TextView selectedTextView = getSelectedTextView(currentSelectorBox);
        for (int i14 = 0; i14 < this.textViewPool.size(); i14++) {
            TextView textView = this.textViewPool.get(i14);
            if (textView != null) {
                textView.setSelected(textView == selectedTextView);
                textView.getPaint().setShader(getGradientForTextView(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
        textView.getHitRect(this.textViewRect);
        this.scratch.set(this.textViewRect);
        textView.getLineBounds(0, this.scratchLineBounds);
        RectF rectF2 = this.scratch;
        Rect rect = this.scratchLineBounds;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.scratch)) {
            return new RadialGradient(rectF.centerX() - this.scratch.left, rectF.centerY() - this.scratch.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView getSelectedTextView(RectF rectF) {
        float f14 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i14 = 0; i14 < this.textViewPool.size(); i14++) {
            TextView textView2 = this.textViewPool.get(i14);
            if (textView2 != null) {
                textView2.getHitRect(this.textViewRect);
                this.scratch.set(this.textViewRect);
                this.scratch.union(rectF);
                float fHeight = this.scratch.height() * this.scratch.width();
                if (fHeight < f14) {
                    textView = textView2;
                    f14 = fHeight;
                }
            }
        }
        return textView;
    }

    private static float max3(float f14, float f15, float f16) {
        return Math.max(Math.max(f14, f15), f16);
    }

    private void updateTextViews(int i14) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.textViewPool.size();
        boolean z14 = false;
        for (int i15 = 0; i15 < Math.max(this.values.length, size); i15++) {
            TextView textView = this.textViewPool.get(i15);
            if (i15 >= this.values.length) {
                removeView(textView);
                this.textViewPool.remove(i15);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.textViewPool.put(i15, textView);
                    addView(textView);
                }
                textView.setText(this.values[i15]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i15));
                int i16 = (i15 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i16));
                if (i16 > 1) {
                    z14 = true;
                }
                s0.r(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i14 != 0) {
                    textView.setContentDescription(getResources().getString(i14, this.values[i15]));
                }
            }
        }
        this.clockHandView.setMultiLevel(z14);
    }

    public int getCurrentLevel() {
        return this.clockHandView.getCurrentLevel();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f.v(accessibilityNodeInfo).p(f.g.a(1, this.values.length, 1, false));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        findIntersectingTextView();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i14, int i15) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax3 = (int) (this.clockSize / max3(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824);
        setMeasuredDimension(iMax3, iMax3);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f14, boolean z14) {
        if (Math.abs(this.currentHandRotation - f14) > EPSILON) {
            this.currentHandRotation = f14;
            findIntersectingTextView();
        }
    }

    public void setCurrentLevel(int i14) {
        this.clockHandView.setCurrentLevel(i14);
    }

    public void setHandRotation(float f14) {
        this.clockHandView.setHandRotation(f14);
        findIntersectingTextView();
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i14) {
        if (i14 != getRadius()) {
            super.setRadius(i14);
            this.clockHandView.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, int i14) {
        this.values = strArr;
        updateTextViews(i14);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void updateLayoutParams() {
        super.updateLayoutParams();
        for (int i14 = 0; i14 < this.textViewPool.size(); i14++) {
            this.textViewPool.get(i14).setVisibility(0);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }
}
