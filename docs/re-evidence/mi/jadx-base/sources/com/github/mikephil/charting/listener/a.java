package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.Entry;
import defpackage.a12;
import defpackage.erc;
import defpackage.fmq;
import defpackage.hpc;
import defpackage.hwq;
import defpackage.r7c;
import defpackage.wye;

/* JADX INFO: loaded from: classes4.dex */
public class a extends ChartTouchListener<BarLineChartBase<? extends a12<? extends hpc<? extends Entry>>>> {
    public Matrix f;
    public Matrix g;
    public wye h;
    public wye i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f7804k;
    public float l;
    public erc m;
    public VelocityTracker n;
    public long o;
    public wye p;
    public wye q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7805r;
    public float s;

    public a(BarLineChartBase<? extends a12<? extends hpc<? extends Entry>>> barLineChartBase, Matrix matrix, float f) {
        super(barLineChartBase);
        this.f = new Matrix();
        this.g = new Matrix();
        this.h = wye.c(0.0f, 0.0f);
        this.i = wye.c(0.0f, 0.0f);
        this.j = 1.0f;
        this.f7804k = 1.0f;
        this.l = 1.0f;
        this.o = 0L;
        this.p = wye.c(0.0f, 0.0f);
        this.q = wye.c(0.0f, 0.0f);
        this.f = matrix;
        this.f7805r = fmq.e(f);
        this.s = fmq.e(3.5f);
    }

    public static float h(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    public static float i(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    public static void k(wye wyeVar, MotionEvent motionEvent) {
        float x = motionEvent.getX(0) + motionEvent.getX(1);
        float y = motionEvent.getY(0) + motionEvent.getY(1);
        wyeVar.c = x / 2.0f;
        wyeVar.d = y / 2.0f;
    }

    public static float p(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public void f() {
        wye wyeVar = this.q;
        if (wyeVar.c == 0.0f && wyeVar.d == 0.0f) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.q.c *= ((BarLineChartBase) this.e).getDragDecelerationFrictionCoef();
        this.q.d *= ((BarLineChartBase) this.e).getDragDecelerationFrictionCoef();
        float f = (jCurrentAnimationTimeMillis - this.o) / 1000.0f;
        wye wyeVar2 = this.q;
        float f2 = wyeVar2.c * f;
        float f3 = wyeVar2.d * f;
        wye wyeVar3 = this.p;
        float f4 = wyeVar3.c + f2;
        wyeVar3.c = f4;
        float f5 = wyeVar3.d + f3;
        wyeVar3.d = f5;
        MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f4, f5, 0);
        l(motionEventObtain, ((BarLineChartBase) this.e).isDragXEnabled() ? this.p.c - this.h.c : 0.0f, ((BarLineChartBase) this.e).isDragYEnabled() ? this.p.d - this.h.d : 0.0f);
        motionEventObtain.recycle();
        this.f = ((BarLineChartBase) this.e).getViewPortHandler().L(this.f, this.e, false);
        this.o = jCurrentAnimationTimeMillis;
        if (Math.abs(this.q.c) >= 0.01d || Math.abs(this.q.d) >= 0.01d) {
            fmq.x(this.e);
            return;
        }
        ((BarLineChartBase) this.e).calculateOffsets();
        ((BarLineChartBase) this.e).postInvalidate();
        q();
    }

    public wye g(float f, float f2) {
        hwq viewPortHandler = ((BarLineChartBase) this.e).getViewPortHandler();
        return wye.c(f - viewPortHandler.I(), j() ? -(f2 - viewPortHandler.K()) : -((((BarLineChartBase) this.e).getMeasuredHeight() - f2) - viewPortHandler.H()));
    }

    public final boolean j() {
        erc ercVar;
        return (this.m == null && ((BarLineChartBase) this.e).isAnyAxisInverted()) || ((ercVar = this.m) != null && ((BarLineChartBase) this.e).isInverted(ercVar.m0()));
    }

    public final void l(MotionEvent motionEvent, float f, float f2) {
        this.f7802a = ChartTouchListener.ChartGesture.DRAG;
        this.f.set(this.g);
        ((BarLineChartBase) this.e).getOnChartGestureListener();
        if (j()) {
            if (this.e instanceof HorizontalBarChart) {
                f = -f;
            } else {
                f2 = -f2;
            }
        }
        this.f.postTranslate(f, f2);
    }

    public final void m(MotionEvent motionEvent) {
        r7c highlightByTouchPoint = ((BarLineChartBase) this.e).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
        if (highlightByTouchPoint == null || highlightByTouchPoint.a(this.c)) {
            return;
        }
        this.c = highlightByTouchPoint;
        ((BarLineChartBase) this.e).highlightValue(highlightByTouchPoint, true);
    }

    public final void n(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            ((BarLineChartBase) this.e).getOnChartGestureListener();
            float fP = p(motionEvent);
            if (fP > this.s) {
                wye wyeVar = this.i;
                wye wyeVarG = g(wyeVar.c, wyeVar.d);
                hwq viewPortHandler = ((BarLineChartBase) this.e).getViewPortHandler();
                int i = this.f7803b;
                if (i == 4) {
                    this.f7802a = ChartTouchListener.ChartGesture.PINCH_ZOOM;
                    float f = fP / this.l;
                    boolean z = f < 1.0f;
                    boolean zC = z ? viewPortHandler.c() : viewPortHandler.a();
                    boolean zD = z ? viewPortHandler.d() : viewPortHandler.b();
                    float f2 = ((BarLineChartBase) this.e).isScaleXEnabled() ? f : 1.0f;
                    float f3 = ((BarLineChartBase) this.e).isScaleYEnabled() ? f : 1.0f;
                    if (zD || zC) {
                        this.f.set(this.g);
                        this.f.postScale(f2, f3, wyeVarG.c, wyeVarG.d);
                    }
                } else if (i == 2 && ((BarLineChartBase) this.e).isScaleXEnabled()) {
                    this.f7802a = ChartTouchListener.ChartGesture.X_ZOOM;
                    float fH = h(motionEvent) / this.j;
                    if (fH < 1.0f ? viewPortHandler.c() : viewPortHandler.a()) {
                        this.f.set(this.g);
                        this.f.postScale(fH, 1.0f, wyeVarG.c, wyeVarG.d);
                    }
                } else if (this.f7803b == 3 && ((BarLineChartBase) this.e).isScaleYEnabled()) {
                    this.f7802a = ChartTouchListener.ChartGesture.Y_ZOOM;
                    float fI = i(motionEvent) / this.f7804k;
                    if (fI < 1.0f ? viewPortHandler.d() : viewPortHandler.b()) {
                        this.f.set(this.g);
                        this.f.postScale(1.0f, fI, wyeVarG.c, wyeVarG.d);
                    }
                }
                wye.f(wyeVarG);
            }
        }
    }

    public final void o(MotionEvent motionEvent) {
        this.g.set(this.f);
        this.h.c = motionEvent.getX();
        this.h.d = motionEvent.getY();
        this.m = ((BarLineChartBase) this.e).getDataSetByTouchPoint(motionEvent.getX(), motionEvent.getY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.f7802a = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        ((BarLineChartBase) this.e).getOnChartGestureListener();
        if (((BarLineChartBase) this.e).isDoubleTapToZoomEnabled() && ((a12) ((BarLineChartBase) this.e).getData()).m() > 0) {
            wye wyeVarG = g(motionEvent.getX(), motionEvent.getY());
            ((BarLineChartBase) this.e).zoom(((BarLineChartBase) this.e).isScaleXEnabled() ? 1.4f : 1.0f, ((BarLineChartBase) this.e).isScaleYEnabled() ? 1.4f : 1.0f, wyeVarG.c, wyeVarG.d);
            if (((BarLineChartBase) this.e).isLogEnabled()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Double-Tap, Zooming In, x: ");
                sb.append(wyeVarG.c);
                sb.append(", y: ");
                sb.append(wyeVarG.d);
            }
            wye.f(wyeVarG);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f7802a = ChartTouchListener.ChartGesture.FLING;
        ((BarLineChartBase) this.e).getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f7802a = ChartTouchListener.ChartGesture.LONG_PRESS;
        ((BarLineChartBase) this.e).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f7802a = ChartTouchListener.ChartGesture.SINGLE_TAP;
        ((BarLineChartBase) this.e).getOnChartGestureListener();
        if (!((BarLineChartBase) this.e).isHighlightPerTapEnabled()) {
            return false;
        }
        c(((BarLineChartBase) this.e).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
        this.n.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.n) != null) {
            velocityTracker.recycle();
            this.n = null;
        }
        if (this.f7803b == 0) {
            this.d.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.e).isDragEnabled() && !((BarLineChartBase) this.e).isScaleXEnabled() && !((BarLineChartBase) this.e).isScaleYEnabled()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            e(motionEvent);
            q();
            o(motionEvent);
        } else if (action == 1) {
            VelocityTracker velocityTracker2 = this.n;
            int pointerId = motionEvent.getPointerId(0);
            velocityTracker2.computeCurrentVelocity(1000, fmq.o());
            float yVelocity = velocityTracker2.getYVelocity(pointerId);
            float xVelocity = velocityTracker2.getXVelocity(pointerId);
            if ((Math.abs(xVelocity) > fmq.p() || Math.abs(yVelocity) > fmq.p()) && this.f7803b == 1 && ((BarLineChartBase) this.e).isDragDecelerationEnabled()) {
                q();
                this.o = AnimationUtils.currentAnimationTimeMillis();
                this.p.c = motionEvent.getX();
                this.p.d = motionEvent.getY();
                wye wyeVar = this.q;
                wyeVar.c = xVelocity;
                wyeVar.d = yVelocity;
                fmq.x(this.e);
            }
            int i = this.f7803b;
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                ((BarLineChartBase) this.e).calculateOffsets();
                ((BarLineChartBase) this.e).postInvalidate();
            }
            this.f7803b = 0;
            ((BarLineChartBase) this.e).enableScroll();
            VelocityTracker velocityTracker3 = this.n;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.n = null;
            }
            b(motionEvent);
        } else if (action == 2) {
            int i2 = this.f7803b;
            if (i2 == 1) {
                ((BarLineChartBase) this.e).disableScroll();
                l(motionEvent, ((BarLineChartBase) this.e).isDragXEnabled() ? motionEvent.getX() - this.h.c : 0.0f, ((BarLineChartBase) this.e).isDragYEnabled() ? motionEvent.getY() - this.h.d : 0.0f);
            } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                ((BarLineChartBase) this.e).disableScroll();
                if (((BarLineChartBase) this.e).isScaleXEnabled() || ((BarLineChartBase) this.e).isScaleYEnabled()) {
                    n(motionEvent);
                }
            } else if (i2 == 0 && Math.abs(ChartTouchListener.a(motionEvent.getX(), this.h.c, motionEvent.getY(), this.h.d)) > this.f7805r && ((BarLineChartBase) this.e).isDragEnabled()) {
                if (!((BarLineChartBase) this.e).isFullyZoomedOut() || !((BarLineChartBase) this.e).hasNoDragOffset()) {
                    float fAbs = Math.abs(motionEvent.getX() - this.h.c);
                    float fAbs2 = Math.abs(motionEvent.getY() - this.h.d);
                    if ((((BarLineChartBase) this.e).isDragXEnabled() || fAbs2 >= fAbs) && (((BarLineChartBase) this.e).isDragYEnabled() || fAbs2 <= fAbs)) {
                        this.f7802a = ChartTouchListener.ChartGesture.DRAG;
                        this.f7803b = 1;
                    }
                } else if (((BarLineChartBase) this.e).isHighlightPerDragEnabled()) {
                    this.f7802a = ChartTouchListener.ChartGesture.DRAG;
                    if (((BarLineChartBase) this.e).isHighlightPerDragEnabled()) {
                        m(motionEvent);
                    }
                }
            }
        } else if (action == 3) {
            this.f7803b = 0;
            b(motionEvent);
        } else if (action != 5) {
            if (action == 6) {
                fmq.z(motionEvent, this.n);
                this.f7803b = 5;
            }
        } else if (motionEvent.getPointerCount() >= 2) {
            ((BarLineChartBase) this.e).disableScroll();
            o(motionEvent);
            this.j = h(motionEvent);
            this.f7804k = i(motionEvent);
            float fP = p(motionEvent);
            this.l = fP;
            if (fP > 10.0f) {
                if (((BarLineChartBase) this.e).isPinchZoomEnabled()) {
                    this.f7803b = 4;
                } else if (((BarLineChartBase) this.e).isScaleXEnabled() != ((BarLineChartBase) this.e).isScaleYEnabled()) {
                    this.f7803b = ((BarLineChartBase) this.e).isScaleXEnabled() ? 2 : 3;
                } else {
                    this.f7803b = this.j > this.f7804k ? 2 : 3;
                }
            }
            k(this.i, motionEvent);
        }
        this.f = ((BarLineChartBase) this.e).getViewPortHandler().L(this.f, this.e, true);
        return true;
    }

    public void q() {
        wye wyeVar = this.q;
        wyeVar.c = 0.0f;
        wyeVar.d = 0.0f;
    }
}
