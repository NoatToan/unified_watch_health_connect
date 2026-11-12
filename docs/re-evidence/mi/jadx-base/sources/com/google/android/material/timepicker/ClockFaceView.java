package com.google.android.material.timepicker;

import android.R;
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
import defpackage.b4j;
import defpackage.iqi;
import defpackage.k3j;
import defpackage.k8f;
import defpackage.kwi;
import defpackage.m80;
import defpackage.of1;
import defpackage.pii;
import defpackage.pmi;
import defpackage.xki;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.d {
    public final ClockHandView d;
    public final Rect e;
    public final RectF f;
    public final SparseArray<TextView> g;
    public final androidx.core.view.a h;
    public final int[] i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8922k;
    public final int l;
    public final int m;
    public final int n;
    public String[] o;
    public float p;
    public final ColorStateList q;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.c(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.d.f()) - ClockFaceView.this.f8922k);
            return true;
        }
    }

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            int iIntValue = ((Integer) view.getTag(iqi.z)).intValue();
            if (iIntValue > 0) {
                m80Var.M0((View) ClockFaceView.this.g.get(iIntValue - 1));
            }
            m80Var.l0(m80.f.b(0, 1, iIntValue, 1, false, view.isSelected()));
            m80Var.j0(true);
            m80Var.b(m80.a.i);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            float x = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView.this.d.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, x, height, 0));
            ClockFaceView.this.d.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, x, height, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.I);
    }

    public static float m(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void c(int i) {
        if (i != b()) {
            super.c(i);
            this.d.j(b());
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void g(float f, boolean z) {
        if (Math.abs(this.p - f) > 0.001f) {
            this.p = f;
            k();
        }
    }

    public final void k() {
        RectF rectFC = this.d.c();
        for (int i = 0; i < this.g.size(); i++) {
            TextView textView = this.g.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.e);
                offsetDescendantRectToMyCoords(textView, this.e);
                textView.setSelected(rectFC.contains(this.e.centerX(), this.e.centerY()));
                textView.getPaint().setShader(l(rectFC, this.e, textView));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient l(RectF rectF, Rect rect, TextView textView) {
        this.f.set(rect);
        this.f.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.f)) {
            return new RadialGradient(rectF.centerX() - this.f.left, rectF.centerY() - this.f.top, rectF.width() * 0.5f, this.i, this.j, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void n(String[] strArr, int i) {
        this.o = strArr;
        o(i);
    }

    public final void o(int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.g.size();
        for (int i2 = 0; i2 < Math.max(this.o.length, size); i2++) {
            TextView textView = this.g.get(i2);
            if (i2 >= this.o.length) {
                removeView(textView);
                this.g.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(kwi.o, (ViewGroup) this, false);
                    this.g.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.o[i2]);
                textView.setTag(iqi.z, Integer.valueOf(i2));
                androidx.core.view.c.r0(textView, this.h);
                textView.setTextColor(this.q);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.o[i2]));
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m80.P0(accessibilityNodeInfo).k0(m80.e.b(1, this.o.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM = (int) (this.n / m(this.l / displayMetrics.heightPixels, this.m / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM, 1073741824);
        setMeasuredDimension(iM, iM);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Rect();
        this.f = new RectF();
        this.g = new SparseArray<>();
        this.j = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.P1, i, k3j.L);
        Resources resources = getResources();
        ColorStateList colorStateListB = k8f.b(context, typedArrayObtainStyledAttributes, b4j.R1);
        this.q = colorStateListB;
        LayoutInflater.from(context).inflate(kwi.p, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(iqi.l);
        this.d = clockHandView;
        this.f8922k = resources.getDimensionPixelSize(pmi.y);
        int colorForState = colorStateListB.getColorForState(new int[]{R.attr.state_selected}, colorStateListB.getDefaultColor());
        this.i = new int[]{colorForState, colorForState, colorStateListB.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = of1.a(context, xki.l).getDefaultColor();
        ColorStateList colorStateListB2 = k8f.b(context, typedArrayObtainStyledAttributes, b4j.Q1);
        setBackgroundColor(colorStateListB2 != null ? colorStateListB2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.h = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        n(strArr, 0);
        this.l = resources.getDimensionPixelSize(pmi.M);
        this.m = resources.getDimensionPixelSize(pmi.N);
        this.n = resources.getDimensionPixelSize(pmi.A);
    }
}
