package com.github.mikephil.chartingv2.listener;

import am.j;
import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.chartingv2.charts.PieChart;
import com.github.mikephil.chartingv2.charts.PieRadarChartBase;
import com.github.mikephil.chartingv2.charts.RadarChart;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.utils.SelectionDetail;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class PieRadarChartTouchListener extends ChartTouchListener<PieRadarChartBase<?>> {
    private ArrayList<AngularVelocitySample> _velocitySamples;
    private float mDecelerationAngularVelocity;
    private long mDecelerationLastTime;
    private float mStartAngle;
    private PointF mTouchStartPoint;

    public class AngularVelocitySample {
        public float angle;
        public long time;

        public AngularVelocitySample(long j8, float f14) {
            this.time = j8;
            this.angle = f14;
        }
    }

    public PieRadarChartTouchListener(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.mTouchStartPoint = new PointF();
        this.mStartAngle = 0.0f;
        this._velocitySamples = new ArrayList<>();
        this.mDecelerationLastTime = 0L;
        this.mDecelerationAngularVelocity = 0.0f;
    }

    private float calculateVelocity() {
        if (this._velocitySamples.isEmpty()) {
            return 0.0f;
        }
        AngularVelocitySample angularVelocitySample = this._velocitySamples.get(0);
        AngularVelocitySample angularVelocitySample2 = (AngularVelocitySample) j.f(1, this._velocitySamples);
        AngularVelocitySample angularVelocitySample3 = angularVelocitySample;
        for (int size = this._velocitySamples.size() - 1; size >= 0; size--) {
            angularVelocitySample3 = this._velocitySamples.get(size);
            if (angularVelocitySample3.angle != angularVelocitySample2.angle) {
                break;
            }
        }
        float f14 = (angularVelocitySample2.time - angularVelocitySample.time) / 1000.0f;
        if (f14 == 0.0f) {
            f14 = 0.1f;
        }
        float f15 = angularVelocitySample2.angle;
        float f16 = angularVelocitySample3.angle;
        boolean z14 = f15 >= f16;
        if (Math.abs(f15 - f16) > 270.0d) {
            z14 = !z14;
        }
        float f17 = angularVelocitySample2.angle;
        float f18 = angularVelocitySample.angle;
        if (f17 - f18 > 180.0d) {
            angularVelocitySample.angle = (float) (((double) f18) + 360.0d);
        } else if (f18 - f17 > 180.0d) {
            angularVelocitySample2.angle = (float) (((double) f17) + 360.0d);
        }
        float fAbs = Math.abs((angularVelocitySample2.angle - angularVelocitySample.angle) / f14);
        return !z14 ? -fAbs : fAbs;
    }

    private void resetVelocity() {
        this._velocitySamples.clear();
    }

    private void sampleVelocity(float f14, float f15) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this._velocitySamples.add(new AngularVelocitySample(jCurrentAnimationTimeMillis, ((PieRadarChartBase) this.mChart).getAngleForPoint(f14, f15)));
        for (int size = this._velocitySamples.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - this._velocitySamples.get(0).time > 1000; size--) {
            this._velocitySamples.remove(0);
        }
    }

    public void computeScroll() {
        if (this.mDecelerationAngularVelocity == 0.0f) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.mDecelerationAngularVelocity = ((PieRadarChartBase) this.mChart).getDragDecelerationFrictionCoef() * this.mDecelerationAngularVelocity;
        float f14 = (jCurrentAnimationTimeMillis - this.mDecelerationLastTime) / 1000.0f;
        T t7 = this.mChart;
        ((PieRadarChartBase) t7).setRotationAngle((this.mDecelerationAngularVelocity * f14) + ((PieRadarChartBase) t7).getRotationAngle());
        this.mDecelerationLastTime = jCurrentAnimationTimeMillis;
        if (Math.abs(this.mDecelerationAngularVelocity) >= 0.001d) {
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
        float fDistanceToCenter = ((PieRadarChartBase) this.mChart).distanceToCenter(motionEvent.getX(), motionEvent.getY());
        if (fDistanceToCenter > ((PieRadarChartBase) this.mChart).getRadius()) {
            Highlight highlight = this.mLastHighlighted;
            T t7 = this.mChart;
            if (highlight == null) {
                ((PieRadarChartBase) t7).highlightValues(null);
            } else {
                ((PieRadarChartBase) t7).highlightTouch(null);
            }
            this.mLastHighlighted = null;
            return true;
        }
        float angleForPoint = ((PieRadarChartBase) this.mChart).getAngleForPoint(motionEvent.getX(), motionEvent.getY());
        T t14 = this.mChart;
        if (t14 instanceof PieChart) {
            angleForPoint /= ((PieRadarChartBase) t14).getAnimator().getPhaseY();
        }
        int indexForAngle = ((PieRadarChartBase) this.mChart).getIndexForAngle(angleForPoint);
        T t15 = this.mChart;
        if (indexForAngle < 0) {
            ((PieRadarChartBase) t15).highlightValues(null);
            this.mLastHighlighted = null;
            return true;
        }
        List<SelectionDetail> selectionDetailsAtIndex = ((PieRadarChartBase) t15).getSelectionDetailsAtIndex(indexForAngle);
        T t16 = this.mChart;
        int closestDataSetIndex = t16 instanceof RadarChart ? Utils.getClosestDataSetIndex(selectionDetailsAtIndex, fDistanceToCenter / ((RadarChart) t16).getFactor(), null) : 0;
        if (closestDataSetIndex >= 0) {
            performHighlight(new Highlight(indexForAngle, closestDataSetIndex), motionEvent);
            return true;
        }
        ((PieRadarChartBase) this.mChart).highlightValues(null);
        this.mLastHighlighted = null;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view2, MotionEvent motionEvent) {
        if (!this.mGestureDetector.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.mChart).isRotationEnabled()) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                startAction(motionEvent);
                stopDeceleration();
                resetVelocity();
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x14, y14);
                }
                setGestureStartAngle(x14, y14);
                PointF pointF = this.mTouchStartPoint;
                pointF.x = x14;
                pointF.y = y14;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    sampleVelocity(x14, y14);
                    float fCalculateVelocity = calculateVelocity();
                    this.mDecelerationAngularVelocity = fCalculateVelocity;
                    if (fCalculateVelocity != 0.0f) {
                        this.mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
                        Utils.postInvalidateOnAnimation(this.mChart);
                    }
                }
                ((PieRadarChartBase) this.mChart).enableScroll();
                this.mTouchMode = 0;
                endAction(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x14, y14);
                }
                if (this.mTouchMode == 0) {
                    PointF pointF2 = this.mTouchStartPoint;
                    if (ChartTouchListener.distance(x14, pointF2.x, y14, pointF2.y) > Utils.convertDpToPixel(8.0f)) {
                        this.mLastGesture = ChartTouchListener.ChartGesture.ROTATE;
                        this.mTouchMode = 6;
                        ((PieRadarChartBase) this.mChart).disableScroll();
                    } else if (this.mTouchMode == 6) {
                        updateGestureRotation(x14, y14);
                        ((PieRadarChartBase) this.mChart).invalidate();
                    }
                } else if (this.mTouchMode == 6) {
                    updateGestureRotation(x14, y14);
                    ((PieRadarChartBase) this.mChart).invalidate();
                }
                endAction(motionEvent);
            }
        }
        return true;
    }

    public void setGestureStartAngle(float f14, float f15) {
        this.mStartAngle = ((PieRadarChartBase) this.mChart).getAngleForPoint(f14, f15) - ((PieRadarChartBase) this.mChart).getRawRotationAngle();
    }

    public void stopDeceleration() {
        this.mDecelerationAngularVelocity = 0.0f;
    }

    public void updateGestureRotation(float f14, float f15) {
        T t7 = this.mChart;
        ((PieRadarChartBase) t7).setRotationAngle(((PieRadarChartBase) t7).getAngleForPoint(f14, f15) - this.mStartAngle);
    }
}
