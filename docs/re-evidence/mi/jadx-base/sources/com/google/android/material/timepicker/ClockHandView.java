package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import defpackage.b4j;
import defpackage.k3j;
import defpackage.pii;
import defpackage.pmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f8925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8926b;
    public float c;
    public float d;
    public boolean e;
    public int f;
    public final List<d> g;
    public final int h;
    public final float i;
    public final Paint j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f8927k;
    public final int l;
    public float m;
    public boolean n;
    public c o;
    public double p;
    public int q;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void b(@FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f, boolean z);
    }

    public interface d {
        void g(@FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.I);
    }

    public void addOnRotateListener(d dVar) {
        this.g.add(dVar);
    }

    public final void b(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fCos = (this.q * ((float) Math.cos(this.p))) + f;
        float f2 = height;
        float fSin = (this.q * ((float) Math.sin(this.p))) + f2;
        this.j.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.h, this.j);
        double dSin = Math.sin(this.p);
        double dCos = Math.cos(this.p);
        double d2 = this.q - this.h;
        this.j.setStrokeWidth(this.l);
        canvas.drawLine(f, f2, width + ((int) (dCos * d2)), height + ((int) (d2 * dSin)), this.j);
        canvas.drawCircle(f, f2, this.i, this.j);
    }

    public RectF c() {
        return this.f8927k;
    }

    public final int d(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    @FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE)
    public float e() {
        return this.m;
    }

    public int f() {
        return this.h;
    }

    public final Pair<Float, Float> g(float f) {
        float fE = e();
        if (Math.abs(fE - f) > 180.0f) {
            if (fE > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (fE < 180.0f && f > 180.0f) {
                fE += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fE), Float.valueOf(f));
    }

    public final boolean h(float f, float f2, boolean z, boolean z2, boolean z3) {
        float fD = d(f, f2);
        boolean z4 = false;
        boolean z5 = e() != fD;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f8926b) {
            z4 = true;
        }
        l(fD, z4);
        return true;
    }

    public void i(boolean z) {
        this.f8926b = z;
    }

    public void j(@Dimension int i) {
        this.q = i;
        invalidate();
    }

    public void k(@FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f) {
        l(f, false);
    }

    public void l(@FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f, boolean z) {
        ValueAnimator valueAnimator = this.f8925a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m(f, false);
            return;
        }
        Pair<Float, Float> pairG = g(f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairG.first).floatValue(), ((Float) pairG.second).floatValue());
        this.f8925a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f8925a.addUpdateListener(new a());
        this.f8925a.addListener(new b());
        this.f8925a.start();
    }

    public final void m(@FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f, boolean z) {
        float f2 = f % 360.0f;
        this.m = f2;
        this.p = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.q * ((float) Math.cos(this.p)));
        float fSin = height + (this.q * ((float) Math.sin(this.p)));
        RectF rectF = this.f8927k;
        int i = this.h;
        rectF.set(width - i, fSin - i, width + i, fSin + i);
        Iterator<d> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().g(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k(e());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.c = x;
            this.d = y;
            this.e = true;
            this.n = false;
            z = false;
            z2 = false;
            z3 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.c);
            int i2 = (int) (y - this.d);
            this.e = (i * i) + (i2 * i2) > this.f;
            boolean z4 = this.n;
            z = actionMasked == 1;
            z3 = false;
            z2 = z4;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean zH = h(x, y, z2, z3, z) | this.n;
        this.n = zH;
        if (zH && z && (cVar = this.o) != null) {
            cVar.b(d(x, y), this.e);
        }
        return true;
    }

    public void setOnActionUpListener(c cVar) {
        this.o = cVar;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new ArrayList();
        Paint paint = new Paint();
        this.j = paint;
        this.f8927k = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.S1, i, k3j.L);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.U1, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.V1, 0);
        Resources resources = getResources();
        this.l = resources.getDimensionPixelSize(pmi.z);
        this.i = resources.getDimensionPixelSize(pmi.x);
        int color = typedArrayObtainStyledAttributes.getColor(b4j.T1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
        androidx.core.view.c.C0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
