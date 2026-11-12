package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.slider.BaseSlider;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.cwq;
import defpackage.h2j;
import defpackage.i2e;
import defpackage.jz5;
import defpackage.k3j;
import defpackage.k47;
import defpackage.k8f;
import defpackage.l8f;
import defpackage.m80;
import defpackage.mj8;
import defpackage.n8f;
import defpackage.of1;
import defpackage.pii;
import defpackage.pmi;
import defpackage.r2m;
import defpackage.r8f;
import defpackage.uip;
import defpackage.v92;
import defpackage.w92;
import defpackage.wc1;
import defpackage.xki;
import defpackage.z47;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends v92<S>, T extends w92<S>> extends View {
    public static final int d0 = k3j.J;
    public int A;
    public float B;
    public MotionEvent C;
    public boolean D;
    public float E;
    public float F;
    public ArrayList<Float> G;
    public int H;
    public int I;
    public float J;
    public float[] K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public ColorStateList Q;
    public ColorStateList R;
    public ColorStateList S;
    public ColorStateList T;
    public ColorStateList U;
    public final l8f V;
    public Drawable W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f8783a;
    public List<Drawable> a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f8784b;
    public float b0;
    public final Paint c;
    public int c0;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final e g;
    public final AccessibilityManager h;
    public BaseSlider<S, L, T>.d i;
    public final f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<uip> f8785k;
    public final List<L> l;
    public final List<T> m;
    public boolean n;
    public ValueAnimator o;
    public ValueAnimator p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8786r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f8787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8788b;
        public ArrayList<Float> c;
        public float d;
        public boolean e;

        public class a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f8787a);
            parcel.writeFloat(this.f8788b);
            parcel.writeList(this.c);
            parcel.writeFloat(this.d);
            parcel.writeBooleanArray(new boolean[]{this.e});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f8787a = parcel.readFloat();
            this.f8788b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.d = parcel.readFloat();
            this.e = parcel.createBooleanArray()[0];
        }
    }

    public class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AttributeSet f8789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8790b;

        public a(AttributeSet attributeSet, int i) {
            this.f8789a = attributeSet;
            this.f8790b = i;
        }

        @Override // com.google.android.material.slider.BaseSlider.f
        public uip a() {
            TypedArray typedArrayH = c9p.h(BaseSlider.this.getContext(), this.f8789a, b4j.H7, this.f8790b, BaseSlider.d0, new int[0]);
            uip uipVarV = BaseSlider.V(BaseSlider.this.getContext(), typedArrayH);
            typedArrayH.recycle();
            return uipVarV;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f8785k.iterator();
            while (it.hasNext()) {
                ((uip) it.next()).B0(fFloatValue);
            }
            androidx.core.view.c.h0(BaseSlider.this);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Iterator it = BaseSlider.this.f8785k.iterator();
            while (it.hasNext()) {
                ayq.g(BaseSlider.this).a((uip) it.next());
            }
        }
    }

    public static class e extends mj8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f8795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f8796b;

        public e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f8796b = new Rect();
            this.f8795a = baseSlider;
        }

        public final String a(int i) {
            if (i == this.f8795a.getValues().size() - 1) {
                return this.f8795a.getContext().getString(h2j.m);
            }
            return i == 0 ? this.f8795a.getContext().getString(h2j.n) : "";
        }

        @Override // defpackage.mj8
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.f8795a.getValues().size(); i++) {
                this.f8795a.h0(i, this.f8796b);
                if (this.f8796b.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // defpackage.mj8
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < this.f8795a.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // defpackage.mj8
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (!this.f8795a.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f8795a.f0(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f8795a.i0();
                        this.f8795a.postInvalidate();
                        invalidateVirtualView(i);
                        return true;
                    }
                }
                return false;
            }
            float fL = this.f8795a.l(20);
            if (i2 == 8192) {
                fL = -fL;
            }
            if (this.f8795a.J()) {
                fL = -fL;
            }
            if (!this.f8795a.f0(i, r8f.a(this.f8795a.getValues().get(i).floatValue() + fL, this.f8795a.getValueFrom(), this.f8795a.getValueTo()))) {
                return false;
            }
            this.f8795a.i0();
            this.f8795a.postInvalidate();
            invalidateVirtualView(i);
            return true;
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int i, m80 m80Var) {
            m80Var.b(m80.a.L);
            List<Float> values = this.f8795a.getValues();
            float fFloatValue = values.get(i).floatValue();
            float valueFrom = this.f8795a.getValueFrom();
            float valueTo = this.f8795a.getValueTo();
            if (this.f8795a.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    m80Var.a(8192);
                }
                if (fFloatValue < valueTo) {
                    m80Var.a(4096);
                }
            }
            m80Var.C0(m80.g.a(1, valueFrom, valueTo, fFloatValue));
            m80Var.i0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f8795a.getContentDescription() != null) {
                sb.append(this.f8795a.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(a(i));
                sb.append(this.f8795a.A(fFloatValue));
            }
            m80Var.m0(sb.toString());
            this.f8795a.h0(i, this.f8796b);
            m80Var.d0(this.f8796b);
        }
    }

    public interface f {
        uip a();
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    public static float B(ValueAnimator valueAnimator, float f2) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f2;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    public static uip V(Context context, TypedArray typedArray) {
        return uip.u0(context, null, 0, typedArray.getResourceId(b4j.P7, k3j.N));
    }

    public static int X(float[] fArr, float f2) {
        return Math.round(f2 * ((fArr.length / 2) - 1));
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.G.size() == 1) {
            fFloatValue2 = this.E;
        }
        float fR = R(fFloatValue2);
        float fR2 = R(fFloatValue);
        float[] fArr = new float[2];
        if (J()) {
            fArr[0] = fR2;
            fArr[1] = fR;
        } else {
            fArr[0] = fR;
            fArr[1] = fR2;
        }
        return fArr;
    }

    private float getValueOfTouchPosition() {
        double dE0 = e0(this.b0);
        if (J()) {
            dE0 = 1.0d - dE0;
        }
        float f2 = this.F;
        float f3 = this.E;
        return (float) ((dE0 * ((double) (f2 - f3))) + ((double) f3));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f2 = this.b0;
        if (J()) {
            f2 = 1.0f - f2;
        }
        float f3 = this.F;
        float f4 = this.E;
        return (f2 * (f3 - f4)) + f4;
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.G.size() == arrayList.size() && this.G.equals(arrayList)) {
            return;
        }
        this.G = arrayList;
        this.P = true;
        this.I = 0;
        i0();
        o();
        s();
        postInvalidate();
    }

    public final String A(float f2) {
        if (E()) {
            throw null;
        }
        return String.format(((float) ((int) f2)) == f2 ? "%.0f" : "%.2f", Float.valueOf(f2));
    }

    public final float C(int i, float f2) {
        float minSeparation = getMinSeparation();
        if (this.c0 == 0) {
            minSeparation = q(minSeparation);
        }
        if (J()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return r8f.a(f2, i3 < 0 ? this.E : this.G.get(i3).floatValue() + minSeparation, i2 >= this.G.size() ? this.F : this.G.get(i2).floatValue() - minSeparation);
    }

    public final int D(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public boolean E() {
        return false;
    }

    public final Drawable F(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        h(drawableNewDrawable);
        return drawableNewDrawable;
    }

    public final void G() {
        this.f8783a.setStrokeWidth(this.v);
        this.f8784b.setStrokeWidth(this.v);
        this.e.setStrokeWidth(this.v / 2.0f);
        this.f.setStrokeWidth(this.v / 2.0f);
    }

    public final boolean H() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean I(float f2) {
        double dDoubleValue = new BigDecimal(Float.toString(f2)).divide(new BigDecimal(Float.toString(this.J)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean J() {
        return androidx.core.view.c.A(this) == 1;
    }

    public final void K(Resources resources) {
        this.t = resources.getDimensionPixelSize(pmi.x0);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(pmi.v0);
        this.f8786r = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.s = resources.getDimensionPixelSize(pmi.u0);
        this.x = resources.getDimensionPixelOffset(pmi.w0);
        this.A = resources.getDimensionPixelSize(pmi.t0);
    }

    public final void L() {
        if (this.J <= 0.0f) {
            return;
        }
        k0();
        int iMin = Math.min((int) (((this.F - this.E) / this.J) + 1.0f), (this.M / (this.v * 2)) + 1);
        float[] fArr = this.K;
        if (fArr == null || fArr.length != iMin * 2) {
            this.K = new float[iMin * 2];
        }
        float f2 = this.M / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.K;
            fArr2[i] = this.w + ((i / 2) * f2);
            fArr2[i + 1] = m();
        }
    }

    public final void M(Canvas canvas, int i, int i2) {
        if (c0()) {
            int iR = (int) (this.w + (R(this.G.get(this.I).floatValue()) * i));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.z;
                canvas.clipRect(iR - i3, i2 - i3, iR + i3, i3 + i2, Region.Op.UNION);
            }
            canvas.drawCircle(iR, i2, this.z, this.d);
        }
    }

    public final void N(Canvas canvas) {
        if (!this.L || this.J <= 0.0f) {
            return;
        }
        float[] activeRange = getActiveRange();
        int iX = X(this.K, activeRange[0]);
        int iX2 = X(this.K, activeRange[1]);
        int i = iX * 2;
        canvas.drawPoints(this.K, 0, i, this.e);
        int i2 = iX2 * 2;
        canvas.drawPoints(this.K, i, i2 - i, this.f);
        float[] fArr = this.K;
        canvas.drawPoints(fArr, i2, fArr.length - i2, this.e);
    }

    public final void O() {
        this.w = this.f8786r + Math.max(this.y - this.s, 0);
        if (androidx.core.view.c.U(this)) {
            j0(getWidth());
        }
    }

    public final boolean P(int i) {
        int i2 = this.I;
        int iC = (int) r8f.c(((long) i2) + ((long) i), 0L, this.G.size() - 1);
        this.I = iC;
        if (iC == i2) {
            return false;
        }
        if (this.H != -1) {
            this.H = iC;
        }
        i0();
        postInvalidate();
        return true;
    }

    public final boolean Q(int i) {
        if (J()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return P(i);
    }

    public final float R(float f2) {
        float f3 = this.E;
        float f4 = (f2 - f3) / (this.F - f3);
        return J() ? 1.0f - f4 : f4;
    }

    public final Boolean S(int i, KeyEvent keyEvent) {
        if (i == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(P(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(P(-1)) : Boolean.FALSE;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    P(-1);
                    return Boolean.TRUE;
                }
                if (i != 70) {
                    switch (i) {
                        case 21:
                            Q(-1);
                            return Boolean.TRUE;
                        case 22:
                            Q(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            P(1);
            return Boolean.TRUE;
        }
        this.H = this.I;
        postInvalidate();
        return Boolean.TRUE;
    }

    public final void T() {
        Iterator<T> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void U() {
        Iterator<T> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public boolean W() {
        if (this.H != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fR0 = r0(valueOfTouchPositionAbsolute);
        this.H = 0;
        float fAbs = Math.abs(this.G.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.G.size(); i++) {
            float fAbs2 = Math.abs(this.G.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float fR1 = r0(this.G.get(i).floatValue());
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z = !J() ? fR1 - fR0 >= 0.0f : fR1 - fR0 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.H = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fR1 - fR0) < this.q) {
                        this.H = -1;
                        return false;
                    }
                    if (z) {
                        this.H = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.H != -1;
    }

    public final void Y(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayH = c9p.h(context, attributeSet, b4j.H7, i, d0, new int[0]);
        this.E = typedArrayH.getFloat(b4j.K7, 0.0f);
        this.F = typedArrayH.getFloat(b4j.L7, 1.0f);
        setValues(Float.valueOf(this.E));
        this.J = typedArrayH.getFloat(b4j.J7, 0.0f);
        boolean zHasValue = typedArrayH.hasValue(b4j.Z7);
        int i2 = zHasValue ? b4j.Z7 : b4j.b8;
        int i3 = zHasValue ? b4j.Z7 : b4j.a8;
        ColorStateList colorStateListB = k8f.b(context, typedArrayH, i2);
        if (colorStateListB == null) {
            colorStateListB = of1.a(context, xki.f39218k);
        }
        setTrackInactiveTintList(colorStateListB);
        ColorStateList colorStateListB2 = k8f.b(context, typedArrayH, i3);
        if (colorStateListB2 == null) {
            colorStateListB2 = of1.a(context, xki.h);
        }
        setTrackActiveTintList(colorStateListB2);
        this.V.b0(k8f.b(context, typedArrayH, b4j.Q7));
        if (typedArrayH.hasValue(b4j.T7)) {
            setThumbStrokeColor(k8f.b(context, typedArrayH, b4j.T7));
        }
        setThumbStrokeWidth(typedArrayH.getDimension(b4j.U7, 0.0f));
        ColorStateList colorStateListB3 = k8f.b(context, typedArrayH, b4j.M7);
        if (colorStateListB3 == null) {
            colorStateListB3 = of1.a(context, xki.i);
        }
        setHaloTintList(colorStateListB3);
        this.L = typedArrayH.getBoolean(b4j.Y7, true);
        boolean zHasValue2 = typedArrayH.hasValue(b4j.V7);
        int i4 = zHasValue2 ? b4j.V7 : b4j.X7;
        int i5 = zHasValue2 ? b4j.V7 : b4j.W7;
        ColorStateList colorStateListB4 = k8f.b(context, typedArrayH, i4);
        if (colorStateListB4 == null) {
            colorStateListB4 = of1.a(context, xki.j);
        }
        setTickInactiveTintList(colorStateListB4);
        ColorStateList colorStateListB5 = k8f.b(context, typedArrayH, i5);
        if (colorStateListB5 == null) {
            colorStateListB5 = of1.a(context, xki.g);
        }
        setTickActiveTintList(colorStateListB5);
        setThumbRadius(typedArrayH.getDimensionPixelSize(b4j.S7, 0));
        setHaloRadius(typedArrayH.getDimensionPixelSize(b4j.N7, 0));
        setThumbElevation(typedArrayH.getDimension(b4j.R7, 0.0f));
        setTrackHeight(typedArrayH.getDimensionPixelSize(b4j.c8, 0));
        setLabelBehavior(typedArrayH.getInt(b4j.O7, 0));
        if (!typedArrayH.getBoolean(b4j.I7, true)) {
            setEnabled(false);
        }
        typedArrayH.recycle();
    }

    public final void Z(int i) {
        BaseSlider<S, L, T>.d dVar = this.i;
        if (dVar == null) {
            this.i = new d(this, null);
        } else {
            removeCallbacks(dVar);
        }
        this.i.a(i);
        postDelayed(this.i, 200L);
    }

    public final void a0(uip uipVar, float f2) {
        uipVar.C0(A(f2));
        int iR = (this.w + ((int) (R(f2) * this.M))) - (uipVar.getIntrinsicWidth() / 2);
        int iM = m() - (this.A + this.y);
        uipVar.setBounds(iR, iM - uipVar.getIntrinsicHeight(), uipVar.getIntrinsicWidth() + iR, iM);
        Rect rect = new Rect(uipVar.getBounds());
        jz5.c(ayq.f(this), this, rect);
        uipVar.setBounds(rect);
        ayq.g(this).b(uipVar);
    }

    public void addOnChangeListener(L l) {
        this.l.add(l);
    }

    public void addOnSliderTouchListener(T t) {
        this.m.add(t);
    }

    public final boolean b0() {
        return this.u == 3;
    }

    public final boolean c0() {
        return this.N || !(getBackground() instanceof RippleDrawable);
    }

    public final boolean d0(float f2) {
        return f0(this.H, f2);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.g.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f8783a.setColor(D(this.U));
        this.f8784b.setColor(D(this.T));
        this.e.setColor(D(this.S));
        this.f.setColor(D(this.R));
        for (uip uipVar : this.f8785k) {
            if (uipVar.isStateful()) {
                uipVar.setState(getDrawableState());
            }
        }
        if (this.V.isStateful()) {
            this.V.setState(getDrawableState());
        }
        this.d.setColor(D(this.Q));
        this.d.setAlpha(63);
    }

    public final double e0(float f2) {
        float f3 = this.J;
        if (f3 <= 0.0f) {
            return f2;
        }
        int i = (int) ((this.F - this.E) / f3);
        return ((double) Math.round(f2 * i)) / ((double) i);
    }

    public final boolean f0(int i, float f2) {
        this.I = i;
        if (Math.abs(f2 - this.G.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.G.set(i, Float.valueOf(C(i, f2)));
        r(i);
        return true;
    }

    public final boolean g0() {
        return d0(getValueOfTouchPosition());
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.g.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.H;
    }

    public int getFocusedThumbIndex() {
        return this.I;
    }

    @Dimension
    public int getHaloRadius() {
        return this.z;
    }

    public ColorStateList getHaloTintList() {
        return this.Q;
    }

    public int getLabelBehavior() {
        return this.u;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.J;
    }

    public float getThumbElevation() {
        return this.V.w();
    }

    @Dimension
    public int getThumbRadius() {
        return this.y;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.V.F();
    }

    public float getThumbStrokeWidth() {
        return this.V.H();
    }

    public ColorStateList getThumbTintList() {
        return this.V.x();
    }

    public ColorStateList getTickActiveTintList() {
        return this.R;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.S;
    }

    public ColorStateList getTickTintList() {
        if (this.S.equals(this.R)) {
            return this.R;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.T;
    }

    @Dimension
    public int getTrackHeight() {
        return this.v;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.U;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.w;
    }

    public ColorStateList getTrackTintList() {
        if (this.U.equals(this.T)) {
            return this.T;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Dimension
    public int getTrackWidth() {
        return this.M;
    }

    public float getValueFrom() {
        return this.E;
    }

    public float getValueTo() {
        return this.F;
    }

    public List<Float> getValues() {
        return new ArrayList(this.G);
    }

    public final void h(Drawable drawable) {
        int i = this.y * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
        } else {
            float fMax = i / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public void h0(int i, Rect rect) {
        int iR = this.w + ((int) (R(getValues().get(i).floatValue()) * this.M));
        int iM = m();
        int i2 = this.y;
        rect.set(iR - i2, iM - i2, iR + i2, iM + i2);
    }

    public final void i(uip uipVar) {
        uipVar.A0(ayq.f(this));
    }

    public final void i0() {
        if (c0() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iR = (int) ((R(this.G.get(this.I).floatValue()) * this.M) + this.w);
            int iM = m();
            int i = this.z;
            k47.l(background, iR - i, iM - i, iR + i, iM + i);
        }
    }

    public final Float j(int i) {
        float fL = this.O ? l(20) : k();
        if (i == 21) {
            if (!J()) {
                fL = -fL;
            }
            return Float.valueOf(fL);
        }
        if (i == 22) {
            if (J()) {
                fL = -fL;
            }
            return Float.valueOf(fL);
        }
        if (i == 69) {
            return Float.valueOf(-fL);
        }
        if (i == 70 || i == 81) {
            return Float.valueOf(fL);
        }
        return null;
    }

    public final void j0(int i) {
        this.M = Math.max(i - (this.w * 2), 0);
        L();
    }

    public final float k() {
        float f2 = this.J;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        return f2;
    }

    public final void k0() {
        if (this.P) {
            n0();
            o0();
            m0();
            p0();
            l0();
            s0();
            this.P = false;
        }
    }

    public final float l(int i) {
        float fK = k();
        float f2 = (this.F - this.E) / fK;
        float f3 = i;
        return f2 <= f3 ? fK : Math.round(f2 / f3) * fK;
    }

    public final void l0() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
        }
        float f2 = this.J;
        if (f2 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.c0 != 1) {
            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.J)));
        }
        if (minSeparation < f2 || !I(minSeparation)) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.J), Float.valueOf(this.J)));
        }
    }

    public final int m() {
        return this.x + ((this.u == 1 || b0()) ? this.f8785k.get(0).getIntrinsicHeight() : 0);
    }

    public final void m0() {
        if (this.J > 0.0f && !q0(this.F)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.J), Float.valueOf(this.E), Float.valueOf(this.F)));
        }
    }

    public final ValueAnimator n(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(B(z ? this.p : this.o, z ? 0.0f : 1.0f), z ? 1.0f : 0.0f);
        valueAnimatorOfFloat.setDuration(z ? 83L : 117L);
        valueAnimatorOfFloat.setInterpolator(z ? wc1.e : wc1.c);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    public final void n0() {
        if (this.E >= this.F) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.E), Float.valueOf(this.F)));
        }
    }

    public final void o() {
        if (this.f8785k.size() > this.G.size()) {
            List<uip> listSubList = this.f8785k.subList(this.G.size(), this.f8785k.size());
            for (uip uipVar : listSubList) {
                if (androidx.core.view.c.T(this)) {
                    p(uipVar);
                }
            }
            listSubList.clear();
        }
        while (this.f8785k.size() < this.G.size()) {
            uip uipVarA = this.j.a();
            this.f8785k.add(uipVarA);
            if (androidx.core.view.c.T(this)) {
                i(uipVarA);
            }
        }
        int i = this.f8785k.size() == 1 ? 0 : 1;
        Iterator<uip> it = this.f8785k.iterator();
        while (it.hasNext()) {
            it.next().m0(i);
        }
    }

    public final void o0() {
        if (this.F <= this.E) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.F), Float.valueOf(this.E)));
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<uip> it = this.f8785k.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.i;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.n = false;
        Iterator<uip> it = this.f8785k.iterator();
        while (it.hasNext()) {
            p(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.P) {
            k0();
            L();
        }
        super.onDraw(canvas);
        int iM = m();
        u(canvas, this.M, iM);
        if (((Float) Collections.max(getValues())).floatValue() > this.E) {
            t(canvas, this.M, iM);
        }
        N(canvas);
        if ((this.D || isFocused() || b0()) && isEnabled()) {
            M(canvas, this.M, iM);
            if (this.H != -1 || b0()) {
                x();
            } else {
                y();
            }
        } else {
            y();
        }
        w(canvas, this.M, iM);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            z(i);
            this.g.requestKeyboardFocusForVirtualView(this.I);
        } else {
            this.H = -1;
            this.g.clearKeyboardFocusForVirtualView(this.I);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.G.size() == 1) {
            this.H = 0;
        }
        if (this.H == -1) {
            Boolean boolS = S(i, keyEvent);
            return boolS != null ? boolS.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.O |= keyEvent.isLongPress();
        Float fJ = j(i);
        if (fJ != null) {
            if (d0(this.G.get(this.H).floatValue() + fJ.floatValue())) {
                i0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return P(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return P(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.H = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.O = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.t + ((this.u == 1 || b0()) ? this.f8785k.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.E = sliderState.f8787a;
        this.F = sliderState.f8788b;
        setValuesInternal(sliderState.c);
        this.J = sliderState.d;
        if (sliderState.e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f8787a = this.E;
        sliderState.f8788b = this.F;
        sliderState.c = new ArrayList<>(this.G);
        sliderState.d = this.J;
        sliderState.e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        j0(i);
        i0();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f2 = (x - this.w) / this.M;
        this.b0 = f2;
        float fMax = Math.max(0.0f, f2);
        this.b0 = fMax;
        this.b0 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = x;
            if (!H()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (W()) {
                    requestFocus();
                    this.D = true;
                    g0();
                    i0();
                    invalidate();
                    T();
                }
            }
        } else if (actionMasked == 1) {
            this.D = false;
            MotionEvent motionEvent2 = this.C;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.C.getX() - motionEvent.getX()) <= this.q && Math.abs(this.C.getY() - motionEvent.getY()) <= this.q && W()) {
                T();
            }
            if (this.H != -1) {
                g0();
                this.H = -1;
                U();
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.D) {
                if (H() && Math.abs(x - this.B) < this.q) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                T();
            }
            if (W()) {
                this.D = true;
                g0();
                i0();
                invalidate();
            }
        }
        setPressed(this.D);
        this.C = MotionEvent.obtain(motionEvent);
        return true;
    }

    public final void p(uip uipVar) {
        cwq cwqVarG = ayq.g(this);
        if (cwqVarG != null) {
            cwqVarG.a(uipVar);
            uipVar.w0(ayq.f(this));
        }
    }

    public final void p0() {
        for (Float f2 : this.G) {
            if (f2.floatValue() < this.E || f2.floatValue() > this.F) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f2, Float.valueOf(this.E), Float.valueOf(this.F)));
            }
            if (this.J > 0.0f && !q0(f2.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f2, Float.valueOf(this.E), Float.valueOf(this.J), Float.valueOf(this.J)));
            }
        }
    }

    public final float q(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f3 = (f2 - this.w) / this.M;
        float f4 = this.E;
        return (f3 * (f4 - this.F)) + f4;
    }

    public final boolean q0(float f2) {
        return I(f2 - this.E);
    }

    public final void r(int i) {
        Iterator<L> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.G.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        Z(i);
    }

    public final float r0(float f2) {
        return (R(f2) * this.M) + this.w;
    }

    public void removeOnChangeListener(L l) {
        this.l.remove(l);
    }

    public void removeOnSliderTouchListener(T t) {
        this.m.remove(t);
    }

    public final void s() {
        for (L l : this.l) {
            Iterator<Float> it = this.G.iterator();
            while (it.hasNext()) {
                l.a(this, it.next().floatValue(), false);
            }
        }
    }

    public final void s0() {
        float f2 = this.J;
        if (f2 == 0.0f) {
            return;
        }
        if (((int) f2) != f2) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f2));
        }
        float f3 = this.E;
        if (((int) f3) != f3) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f3));
        }
        float f4 = this.F;
        if (((int) f4) != f4) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f4));
        }
    }

    public void setActiveThumbIndex(int i) {
        this.H = i;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.G.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.I = i;
        this.g.requestKeyboardFocusForVirtualView(i);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = 0) @Dimension int i) {
        if (i == this.z) {
            return;
        }
        this.z = i;
        Drawable background = getBackground();
        if (c0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            z47.b((RippleDrawable) background, this.z);
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.Q)) {
            return;
        }
        this.Q = colorStateList;
        Drawable background = getBackground();
        if (!c0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.d.setColor(D(colorStateList));
        this.d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.u != i) {
            this.u = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(i2e i2eVar) {
    }

    public void setSeparationUnit(int i) {
        this.c0 = i;
        this.P = true;
        postInvalidate();
    }

    public void setStepSize(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f2), Float.valueOf(this.E), Float.valueOf(this.F)));
        }
        if (this.J != f2) {
            this.J = f2;
            this.P = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f2) {
        this.V.a0(f2);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(@IntRange(from = 0) @Dimension int i) {
        if (i == this.y) {
            return;
        }
        this.y = i;
        O();
        this.V.setShapeAppearanceModel(r2m.a().q(0, this.y).m());
        l8f l8fVar = this.V;
        int i2 = this.y;
        l8fVar.setBounds(0, 0, i2 * 2, i2 * 2);
        Drawable drawable = this.W;
        if (drawable != null) {
            h(drawable);
        }
        Iterator<Drawable> it = this.a0.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
        postInvalidate();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.V.l0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(of1.a(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f2) {
        this.V.m0(f2);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.V.x())) {
            return;
        }
        this.V.b0(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.R)) {
            return;
        }
        this.R = colorStateList;
        this.f.setColor(D(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.S)) {
            return;
        }
        this.S = colorStateList;
        this.e.setColor(D(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.L != z) {
            this.L = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.T)) {
            return;
        }
        this.T = colorStateList;
        this.f8784b.setColor(D(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Dimension int i) {
        if (this.v != i) {
            this.v = i;
            G();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.U)) {
            return;
        }
        this.U = colorStateList;
        this.f8783a.setColor(D(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.E = f2;
        this.P = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.F = f2;
        this.P = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public final void t(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.w;
        float f2 = i;
        float f3 = i2;
        canvas.drawLine(i3 + (activeRange[0] * f2), f3, i3 + (activeRange[1] * f2), f3, this.f8784b);
    }

    public final void u(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.w;
        float f2 = i;
        float f3 = i3 + (activeRange[1] * f2);
        if (f3 < i3 + i) {
            float f4 = i2;
            canvas.drawLine(f3, f4, i3 + i, f4, this.f8783a);
        }
        int i4 = this.w;
        float f5 = i4 + (activeRange[0] * f2);
        if (f5 > i4) {
            float f6 = i2;
            canvas.drawLine(i4, f6, f5, f6, this.f8783a);
        }
    }

    public final void v(Canvas canvas, int i, int i2, float f2, Drawable drawable) {
        canvas.save();
        canvas.translate((this.w + ((int) (R(f2) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void w(Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.G.size(); i3++) {
            float fFloatValue = this.G.get(i3).floatValue();
            Drawable drawable = this.W;
            if (drawable != null) {
                v(canvas, i, i2, fFloatValue, drawable);
            } else if (i3 < this.a0.size()) {
                v(canvas, i, i2, fFloatValue, this.a0.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.w + (R(fFloatValue) * i), i2, this.y, this.c);
                }
                v(canvas, i, i2, fFloatValue, this.V);
            }
        }
    }

    public final void x() {
        if (this.u == 2) {
            return;
        }
        if (!this.n) {
            this.n = true;
            ValueAnimator valueAnimatorN = n(true);
            this.o = valueAnimatorN;
            this.p = null;
            valueAnimatorN.start();
        }
        Iterator<uip> it = this.f8785k.iterator();
        for (int i = 0; i < this.G.size() && it.hasNext(); i++) {
            if (i != this.I) {
                a0(it.next(), this.G.get(i).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f8785k.size()), Integer.valueOf(this.G.size())));
        }
        a0(it.next(), this.G.get(this.I).floatValue());
    }

    public final void y() {
        if (this.n) {
            this.n = false;
            ValueAnimator valueAnimatorN = n(false);
            this.p = valueAnimatorN;
            this.o = null;
            valueAnimatorN.addListener(new c());
            this.p.start();
        }
    }

    public final void z(int i) {
        if (i == 1) {
            P(Integer.MAX_VALUE);
            return;
        }
        if (i == 2) {
            P(Integer.MIN_VALUE);
        } else if (i == 17) {
            Q(Integer.MAX_VALUE);
        } else {
            if (i != 66) {
                return;
            }
            Q(Integer.MIN_VALUE);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8793a;

        public d() {
            this.f8793a = -1;
        }

        public void a(int i) {
            this.f8793a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.g.sendEventForVirtualView(this.f8793a, 4);
        }

        public /* synthetic */ d(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.T);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        this.W = F(drawable);
        this.a0.clear();
        postInvalidate();
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        super(n8f.c(context, attributeSet, i, d0), attributeSet, i);
        this.f8785k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = false;
        this.D = false;
        this.G = new ArrayList<>();
        this.H = -1;
        this.I = -1;
        this.J = 0.0f;
        this.L = true;
        this.O = false;
        l8f l8fVar = new l8f();
        this.V = l8fVar;
        this.a0 = Collections.emptyList();
        this.c0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f8783a = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f8784b = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.c = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.d = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.e = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        K(context2.getResources());
        this.j = new a(attributeSet, i);
        Y(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        l8fVar.i0(2);
        this.q = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.g = eVar;
        androidx.core.view.c.r0(this, eVar);
        this.h = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.W = null;
        this.a0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.a0.add(F(drawable));
        }
        postInvalidate();
    }
}
