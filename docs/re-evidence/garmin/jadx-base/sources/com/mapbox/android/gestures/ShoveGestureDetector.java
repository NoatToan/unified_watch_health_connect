package com.mapbox.android.gestures;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ShoveGestureDetector extends ProgressiveGesture<OnShoveGestureListener> {
    private static final Set<Integer> handledTypes;
    float deltaPixelSinceLast;
    float deltaPixelsSinceStart;
    private float maxShoveAngle;
    private float pixelDeltaThreshold;

    public interface OnShoveGestureListener {
        boolean onShove(ShoveGestureDetector shoveGestureDetector, float f14, float f15);

        boolean onShoveBegin(ShoveGestureDetector shoveGestureDetector);

        void onShoveEnd(ShoveGestureDetector shoveGestureDetector, float f14, float f15);
    }

    public static class SimpleOnShoveGestureListener implements OnShoveGestureListener {
        @Override // com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener
        public boolean onShove(ShoveGestureDetector shoveGestureDetector, float f14, float f15) {
            return false;
        }

        @Override // com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener
        public boolean onShoveBegin(ShoveGestureDetector shoveGestureDetector) {
            return true;
        }

        @Override // com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener
        public void onShoveEnd(ShoveGestureDetector shoveGestureDetector, float f14, float f15) {
        }
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(3);
    }

    public ShoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
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
                return ((OnShoveGestureListener) this.listener).onShove(this, f14, this.deltaPixelsSinceStart);
            }
        }
        if (!canExecute(3) || !((OnShoveGestureListener) this.listener).onShoveBegin(this)) {
            return false;
        }
        gestureStarted();
        return true;
    }

    public float calculateDeltaPixelsSinceLast() {
        return ((getCurrentEvent().getY(getCurrentEvent().findPointerIndex(this.pointerIdList.get(1).intValue())) + getCurrentEvent().getY(getCurrentEvent().findPointerIndex(this.pointerIdList.get(0).intValue()))) / 2.0f) - ((getPreviousEvent().getY(getPreviousEvent().findPointerIndex(this.pointerIdList.get(1).intValue())) + getPreviousEvent().getY(getPreviousEvent().findPointerIndex(this.pointerIdList.get(0).intValue()))) / 2.0f);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i14) {
        return Math.abs(this.deltaPixelsSinceStart) >= this.pixelDeltaThreshold && super.canExecute(i14);
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public void gestureStopped() {
        super.gestureStopped();
        ((OnShoveGestureListener) this.listener).onShoveEnd(this, this.velocityX, this.velocityY);
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
        double degrees = Math.toDegrees(Math.abs(Math.atan2(multiFingerDistancesObject.getCurrFingersDiffY(), multiFingerDistancesObject.getCurrFingersDiffX())));
        float f14 = this.maxShoveAngle;
        return degrees <= ((double) f14) || 180.0d - degrees <= ((double) f14);
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
