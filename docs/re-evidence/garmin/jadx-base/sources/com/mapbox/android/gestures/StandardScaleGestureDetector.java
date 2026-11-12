package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class StandardScaleGestureDetector extends ProgressiveGesture<StandardOnScaleGestureListener> {
    private static final float QUICK_SCALE_MULTIPLIER = 0.5f;
    private static final Set<Integer> handledTypes;
    private float currentSpan;
    private float currentSpanX;
    private float currentSpanY;
    private final GestureDetector innerGestureDetector;
    private boolean isScalingOut;
    private float previousSpan;
    private float previousSpanX;
    private float previousSpanY;
    private boolean quickScale;
    private PointF quickScaleFocalPoint;
    private float scaleFactor;
    private float spanDeltaSinceStart;
    private float spanSinceStartThreshold;
    private float startSpan;
    private float startSpanX;
    private float startSpanY;

    public static class SimpleStandardOnScaleGestureListener implements StandardOnScaleGestureListener {
        @Override // com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener
        public boolean onScale(StandardScaleGestureDetector standardScaleGestureDetector) {
            return false;
        }

        @Override // com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener
        public boolean onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector) {
            return true;
        }

        @Override // com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener
        public void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector, float f14, float f15) {
        }
    }

    public interface StandardOnScaleGestureListener {
        boolean onScale(StandardScaleGestureDetector standardScaleGestureDetector);

        boolean onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector);

        void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector, float f14, float f15);
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(1);
        hashSet.add(15);
    }

    public StandardScaleGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.innerGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.mapbox.android.gestures.StandardScaleGestureDetector.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    StandardScaleGestureDetector.this.quickScale = true;
                    StandardScaleGestureDetector.this.quickScaleFocalPoint = new PointF(motionEvent.getX(), motionEvent.getY());
                }
                return true;
            }
        });
    }

    private float calculateScaleFactor() {
        if (!this.quickScale) {
            float f14 = this.previousSpan;
            if (f14 > 0.0f) {
                return this.currentSpan / f14;
            }
            return 1.0f;
        }
        boolean z14 = (getCurrentEvent().getY() < this.quickScaleFocalPoint.y && this.currentSpan < this.previousSpan) || (getCurrentEvent().getY() > this.quickScaleFocalPoint.y && this.currentSpan > this.previousSpan);
        float fAbs = Math.abs(1.0f - (this.currentSpan / this.previousSpan)) * QUICK_SCALE_MULTIPLIER;
        if (this.previousSpan <= 0.0f) {
            return 1.0f;
        }
        return z14 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture, com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.quickScale) {
            if (actionMasked == 5 || actionMasked == 3) {
                if (isInProgress()) {
                    interrupt();
                } else {
                    this.quickScale = false;
                }
            } else if (!isInProgress() && actionMasked == 1) {
                this.quickScale = false;
            }
        }
        return this.innerGestureDetector.onTouchEvent(motionEvent) | super.analyzeEvent(motionEvent);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean analyzeMovement() {
        float f14;
        super.analyzeMovement();
        boolean zOnScaleBegin = false;
        if (isInProgress() && this.quickScale && getPointersCount() > 1) {
            gestureStopped();
            return false;
        }
        PointF focalPoint = this.quickScale ? this.quickScaleFocalPoint : getFocalPoint();
        this.currentSpanX = 0.0f;
        this.currentSpanY = 0.0f;
        int i14 = 0;
        while (true) {
            int pointersCount = getPointersCount();
            f14 = this.currentSpanX;
            if (i14 >= pointersCount) {
                break;
            }
            this.currentSpanX = Math.abs(getCurrentEvent().getX(i14) - focalPoint.x) + f14;
            this.currentSpanY = Math.abs(getCurrentEvent().getY(i14) - focalPoint.y) + this.currentSpanY;
            i14++;
        }
        float f15 = f14 * 2.0f;
        this.currentSpanX = f15;
        float f16 = this.currentSpanY * 2.0f;
        this.currentSpanY = f16;
        if (this.quickScale) {
            this.currentSpan = f16;
        } else {
            this.currentSpan = (float) Math.hypot(f15, f16);
        }
        if (this.startSpan == 0.0f) {
            this.startSpan = this.currentSpan;
            this.startSpanX = this.currentSpanX;
            this.startSpanY = this.currentSpanY;
        }
        this.spanDeltaSinceStart = Math.abs(this.startSpan - this.currentSpan);
        float fCalculateScaleFactor = calculateScaleFactor();
        this.scaleFactor = fCalculateScaleFactor;
        this.isScalingOut = fCalculateScaleFactor < 1.0f;
        if (!isInProgress() || this.currentSpan <= 0.0f) {
            if (canExecute(this.quickScale ? 15 : 1) && this.spanDeltaSinceStart >= this.spanSinceStartThreshold && (zOnScaleBegin = ((StandardOnScaleGestureListener) this.listener).onScaleBegin(this))) {
                gestureStarted();
            }
        } else {
            zOnScaleBegin = ((StandardOnScaleGestureListener) this.listener).onScale(this);
        }
        this.previousSpan = this.currentSpan;
        this.previousSpanX = this.currentSpanX;
        this.previousSpanY = this.currentSpanY;
        return zOnScaleBegin;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public void gestureStopped() {
        super.gestureStopped();
        ((StandardOnScaleGestureListener) this.listener).onScaleEnd(this, this.velocityX, this.velocityY);
        this.quickScale = false;
    }

    public float getCurrentSpan() {
        return this.currentSpan;
    }

    public float getCurrentSpanX() {
        return this.currentSpanX;
    }

    public float getCurrentSpanY() {
        return this.currentSpanY;
    }

    public float getPreviousSpan() {
        return this.previousSpan;
    }

    public float getPreviousSpanX() {
        return this.previousSpanX;
    }

    public float getPreviousSpanY() {
        return this.previousSpanY;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public int getRequiredPointersCount() {
        return (!isInProgress() || this.quickScale) ? 1 : 2;
    }

    public float getScaleFactor() {
        return this.scaleFactor;
    }

    public float getSpanSinceStartThreshold() {
        return this.spanSinceStartThreshold;
    }

    public float getStartSpan() {
        return this.startSpan;
    }

    public float getStartSpanX() {
        return this.startSpanX;
    }

    public float getStartSpanY() {
        return this.startSpanY;
    }

    public boolean isScalingOut() {
        return this.isScalingOut;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean isSloppyGesture() {
        if (super.isSloppyGesture()) {
            return true;
        }
        return !this.quickScale && getPointersCount() < 2;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public Set<Integer> provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
        this.startSpan = 0.0f;
        this.spanDeltaSinceStart = 0.0f;
        this.currentSpan = 0.0f;
        this.previousSpan = 0.0f;
        this.scaleFactor = 1.0f;
    }

    public void setSpanSinceStartThreshold(float f14) {
        this.spanSinceStartThreshold = f14;
    }

    public void setSpanSinceStartThresholdResource(int i14) {
        setSpanSinceStartThreshold(this.context.getResources().getDimension(i14));
    }
}
