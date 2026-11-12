package com.mapbox.android.gestures;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class SidewaysShoveGestureDetector extends ProgressiveGesture<OnSidewaysShoveGestureListener> {
    private static final Set<Integer> handledTypes;
    float deltaPixelSinceLast;
    float deltaPixelsSinceStart;
    private float maxShoveAngle;
    private float pixelDeltaThreshold;

    public interface OnSidewaysShoveGestureListener {
        boolean onSidewaysShove(SidewaysShoveGestureDetector sidewaysShoveGestureDetector, float f14, float f15);

        boolean onSidewaysShoveBegin(SidewaysShoveGestureDetector sidewaysShoveGestureDetector);

        void onSidewaysShoveEnd(SidewaysShoveGestureDetector sidewaysShoveGestureDetector, float f14, float f15);
    }

    public static class SimpleOnSidewaysShoveGestureListener implements OnSidewaysShoveGestureListener {
        @Override // com.mapbox.android.gestures.SidewaysShoveGestureDetector.OnSidewaysShoveGestureListener
        public boolean onSidewaysShove(SidewaysShoveGestureDetector sidewaysShoveGestureDetector, float f14, float f15) {
            return false;
        }

        @Override // com.mapbox.android.gestures.SidewaysShoveGestureDetector.OnSidewaysShoveGestureListener
        public boolean onSidewaysShoveBegin(SidewaysShoveGestureDetector sidewaysShoveGestureDetector) {
            return true;
        }

        @Override // com.mapbox.android.gestures.SidewaysShoveGestureDetector.OnSidewaysShoveGestureListener
        public void onSidewaysShoveEnd(SidewaysShoveGestureDetector sidewaysShoveGestureDetector, float f14, float f15) {
        }
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(14);
    }

    public SidewaysShoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean analyzeMovement() {
        super.analyzeMovement();
        float fCalculateDeltaPixelsSinceLast = calculateDeltaPixelsSinceLast();
        this.deltaPixelSinceLast = fCalculateDeltaPixelsSinceLast;
        this.deltaPixelsSinceStart += fCalculateDeltaPixelsSinceLast;
        if (isInProgress()) {
            float f14 = this.deltaPixelSinceLast;
            if (f14 != 0.0f) {
                return ((OnSidewaysShoveGestureListener) this.listener).onSidewaysShove(this, f14, this.deltaPixelsSinceStart);
            }
        }
        if (!canExecute(14) || !((OnSidewaysShoveGestureListener) this.listener).onSidewaysShoveBegin(this)) {
            return false;
        }
        gestureStarted();
        return true;
    }

    public float calculateDeltaPixelsSinceLast() {
        return ((getCurrentEvent().getX(getCurrentEvent().findPointerIndex(this.pointerIdList.get(1).intValue())) + getCurrentEvent().getX(getCurrentEvent().findPointerIndex(this.pointerIdList.get(0).intValue()))) / 2.0f) - ((getPreviousEvent().getX(getPreviousEvent().findPointerIndex(this.pointerIdList.get(1).intValue())) + getPreviousEvent().getX(getPreviousEvent().findPointerIndex(this.pointerIdList.get(0).intValue()))) / 2.0f);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i14) {
        return Math.abs(this.deltaPixelsSinceStart) >= this.pixelDeltaThreshold && super.canExecute(i14);
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public void gestureStopped() {
        super.gestureStopped();
        ((OnSidewaysShoveGestureListener) this.listener).onSidewaysShoveEnd(this, this.velocityX, this.velocityY);
    }

    public float getDeltaPixelSinceLast() {
        return this.deltaPixelSinceLast;
    }

    public float getDeltaPixelsSinceStart() {
        return this.deltaPixelsSinceStart;
    }

    public float getMaxShoveAngle() {
        return this.maxShoveAngle;
    }

    public float getPixelDeltaThreshold() {
        return this.pixelDeltaThreshold;
    }

    public boolean isAngleAcceptable() {
        MultiFingerDistancesObject multiFingerDistancesObject = this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(0), this.pointerIdList.get(1)));
        return Math.abs(Math.toDegrees(Math.abs(Math.atan2((double) multiFingerDistancesObject.getCurrFingersDiffY(), (double) multiFingerDistancesObject.getCurrFingersDiffX()))) - 90.0d) <= ((double) this.maxShoveAngle);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean isSloppyGesture() {
        return super.isSloppyGesture() || !isAngleAcceptable();
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public Set<Integer> provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
        this.deltaPixelsSinceStart = 0.0f;
    }

    public void setMaxShoveAngle(float f14) {
        this.maxShoveAngle = f14;
    }

    public void setPixelDeltaThreshold(float f14) {
        this.pixelDeltaThreshold = f14;
    }

    public void setPixelDeltaThresholdResource(int i14) {
        setPixelDeltaThreshold(this.context.getResources().getDimension(i14));
    }
}
