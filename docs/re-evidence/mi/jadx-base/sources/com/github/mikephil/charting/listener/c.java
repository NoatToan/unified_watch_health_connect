package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import defpackage.fmq;
import defpackage.wye;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class c extends ChartTouchListener<PieRadarChartBase<?>> {
    public wye f;
    public float g;
    public ArrayList<a> h;
    public long i;
    public float j;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f7807b;

        public a(long j, float f) {
            this.f7806a = j;
            this.f7807b = f;
        }
    }

    public c(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.f = wye.c(0.0f, 0.0f);
        this.g = 0.0f;
        this.h = new ArrayList<>();
        this.i = 0L;
        this.j = 0.0f;
    }

    public final float f() {
        if (this.h.isEmpty()) {
            return 0.0f;
        }
        a aVar = this.h.get(0);
        ArrayList<a> arrayList = this.h;
        a aVar2 = arrayList.get(arrayList.size() - 1);
        a aVar3 = aVar;
        for (int size = this.h.size() - 1; size >= 0; size--) {
            aVar3 = this.h.get(size);
            if (aVar3.f7807b != aVar2.f7807b) {
                break;
            }
        }
        float f = (aVar2.f7806a - aVar.f7806a) / 1000.0f;
        if (f == 0.0f) {
            f = 0.1f;
        }
        float f2 = aVar2.f7807b;
        float f3 = aVar3.f7807b;
        boolean z = f2 >= f3;
        if (Math.abs(f2 - f3) > 270.0d) {
            z = !z;
        }
        float f4 = aVar2.f7807b;
        float f5 = aVar.f7807b;
        if (f4 - f5 > 180.0d) {
            aVar.f7807b = (float) (((double) f5) + 360.0d);
        } else if (f5 - f4 > 180.0d) {
            aVar2.f7807b = (float) (((double) f4) + 360.0d);
        }
        float fAbs = Math.abs((aVar2.f7807b - aVar.f7807b) / f);
        return !z ? -fAbs : fAbs;
    }

    public void g() {
        if (this.j == 0.0f) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.j *= ((PieRadarChartBase) this.e).getDragDecelerationFrictionCoef();
        float f = (jCurrentAnimationTimeMillis - this.i) / 1000.0f;
        T t = this.e;
        ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).getRotationAngle() + (this.j * f));
        this.i = jCurrentAnimationTimeMillis;
        if (Math.abs(this.j) >= 0.001d) {
            fmq.x(this.e);
        } else {
            k();
        }
    }

    public final void h() {
        this.h.clear();
    }

    public final void i(float f, float f2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.h.add(new a(jCurrentAnimationTimeMillis, ((PieRadarChartBase) this.e).b(f, f2)));
        for (int size = this.h.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - this.h.get(0).f7806a > 1000; size--) {
            this.h.remove(0);
        }
    }

    public void j(float f, float f2) {
        this.g = ((PieRadarChartBase) this.e).b(f, f2) - ((PieRadarChartBase) this.e).getRawRotationAngle();
    }

    public void k() {
        this.j = 0.0f;
    }

    public void l(float f, float f2) {
        T t = this.e;
        ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).b(f, f2) - this.g);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f7802a = ChartTouchListener.ChartGesture.LONG_PRESS;
        ((PieRadarChartBase) this.e).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f7802a = ChartTouchListener.ChartGesture.SINGLE_TAP;
        ((PieRadarChartBase) this.e).getOnChartGestureListener();
        if (!((PieRadarChartBase) this.e).isHighlightPerTapEnabled()) {
            return false;
        }
        c(((PieRadarChartBase) this.e).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.d.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.e).f()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                e(motionEvent);
                k();
                h();
                if (((PieRadarChartBase) this.e).isDragDecelerationEnabled()) {
                    i(x, y);
                }
                j(x, y);
                wye wyeVar = this.f;
                wyeVar.c = x;
                wyeVar.d = y;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.e).isDragDecelerationEnabled()) {
                    k();
                    i(x, y);
                    float f = f();
                    this.j = f;
                    if (f != 0.0f) {
                        this.i = AnimationUtils.currentAnimationTimeMillis();
                        fmq.x(this.e);
                    }
                }
                ((PieRadarChartBase) this.e).enableScroll();
                this.f7803b = 0;
                b(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.e).isDragDecelerationEnabled()) {
                    i(x, y);
                }
                if (this.f7803b == 0) {
                    wye wyeVar2 = this.f;
                    if (ChartTouchListener.a(x, wyeVar2.c, y, wyeVar2.d) > fmq.e(8.0f)) {
                        this.f7802a = ChartTouchListener.ChartGesture.ROTATE;
                        this.f7803b = 6;
                        ((PieRadarChartBase) this.e).disableScroll();
                    } else if (this.f7803b == 6) {
                        l(x, y);
                        ((PieRadarChartBase) this.e).invalidate();
                    }
                } else if (this.f7803b == 6) {
                    l(x, y);
                    ((PieRadarChartBase) this.e).invalidate();
                }
                b(motionEvent);
            }
        }
        return true;
    }
}
