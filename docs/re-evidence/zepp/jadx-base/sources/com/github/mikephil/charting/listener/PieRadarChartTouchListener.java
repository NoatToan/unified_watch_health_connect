package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class PieRadarChartTouchListener extends ChartTouchListener<PieRadarChartBase<?>> {
    private MPPointF a;
    private float b;
    private ArrayList<a> c;
    private long d;
    private float e;

    public class a {
        public long a;
        public float b;

        public a(long j, float f) {
            this.a = j;
            this.b = f;
        }
    }

    public PieRadarChartTouchListener(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.a = MPPointF.getInstance(0.0f, 0.0f);
        this.b = 0.0f;
        this.c = new ArrayList<>();
        this.d = 0L;
        this.e = 0.0f;
    }

    private float a() {
        if (this.c.isEmpty()) {
            return 0.0f;
        }
        a aVar = this.c.get(0);
        ArrayList<a> arrayList = this.c;
        a aVar2 = arrayList.get(arrayList.size() - 1);
        a aVar3 = aVar;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            aVar3 = this.c.get(size);
            if (aVar3.b != aVar2.b) {
                break;
            }
        }
        float f = (aVar2.a - aVar.a) / 1000.0f;
        if (f == 0.0f) {
            f = 0.1f;
        }
        float f2 = aVar2.b;
        float f3 = aVar3.b;
        boolean z = f2 >= f3;
        if (Math.abs(f2 - f3) > 270.0d) {
            z = !z;
        }
        float f4 = aVar2.b;
        float f5 = aVar.b;
        if (f4 - f5 > 180.0d) {
            aVar.b = (float) (((double) f5) + 360.0d);
        } else if (f5 - f4 > 180.0d) {
            aVar2.b = (float) (((double) f4) + 360.0d);
        }
        float fAbs = Math.abs((aVar2.b - aVar.b) / f);
        return !z ? -fAbs : fAbs;
    }

    private void b() {
        this.c.clear();
    }

    private void c(float f, float f2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.c.add(new a(jCurrentAnimationTimeMillis, ((PieRadarChartBase) this.mChart).getAngleForPoint(f, f2)));
        for (int size = this.c.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - this.c.get(0).a > 1000; size--) {
            this.c.remove(0);
        }
    }

    public void computeScroll() {
        if (this.e == 0.0f) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.e *= ((PieRadarChartBase) this.mChart).getDragDecelerationFrictionCoef();
        float f = (jCurrentAnimationTimeMillis - this.d) / 1000.0f;
        T t = this.mChart;
        ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).getRotationAngle() + (this.e * f));
        this.d = jCurrentAnimationTimeMillis;
        if (Math.abs(this.e) >= 0.001d) {
            Utils.postInvalidateOnAnimation(this.mChart);
        } else {
            stopDeceleration();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((PieRadarChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((PieRadarChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.mGestureDetector.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.mChart).isRotationEnabled()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                startAction(motionEvent);
                stopDeceleration();
                b();
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    c(x, y);
                }
                setGestureStartAngle(x, y);
                MPPointF mPPointF = this.a;
                mPPointF.x = x;
                mPPointF.y = y;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    c(x, y);
                    float fA = a();
                    this.e = fA;
                    if (fA != 0.0f) {
                        this.d = AnimationUtils.currentAnimationTimeMillis();
                        Utils.postInvalidateOnAnimation(this.mChart);
                    }
                }
                ((PieRadarChartBase) this.mChart).enableScroll();
                this.mTouchMode = 0;
                endAction(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    c(x, y);
                }
                if (this.mTouchMode == 0) {
                    MPPointF mPPointF2 = this.a;
                    if (ChartTouchListener.distance(x, mPPointF2.x, y, mPPointF2.y) > Utils.convertDpToPixel(8.0f)) {
                        this.mLastGesture = ChartTouchListener.ChartGesture.ROTATE;
                        this.mTouchMode = 6;
                        ((PieRadarChartBase) this.mChart).disableScroll();
                    } else if (this.mTouchMode == 6) {
                        updateGestureRotation(x, y);
                        ((PieRadarChartBase) this.mChart).invalidate();
                    }
                } else if (this.mTouchMode == 6) {
                    updateGestureRotation(x, y);
                    ((PieRadarChartBase) this.mChart).invalidate();
                }
                endAction(motionEvent);
            }
        }
        return true;
    }

    public void setGestureStartAngle(float f, float f2) {
        this.b = ((PieRadarChartBase) this.mChart).getAngleForPoint(f, f2) - ((PieRadarChartBase) this.mChart).getRawRotationAngle();
    }

    public void stopDeceleration() {
        this.e = 0.0f;
    }

    public void updateGestureRotation(float f, float f2) {
        T t = this.mChart;
        ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).getAngleForPoint(f, f2) - this.b);
    }
}
