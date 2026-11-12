package com.mapbox.android.gestures;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class RotateGestureDetector extends ProgressiveGesture<OnRotateGestureListener> {
    private static final Set<Integer> handledTypes;
    private float angleThreshold;
    float deltaSinceLast;
    float deltaSinceStart;

    public interface OnRotateGestureListener {
        boolean onRotate(RotateGestureDetector rotateGestureDetector, float f14, float f15);

        boolean onRotateBegin(RotateGestureDetector rotateGestureDetector);

        void onRotateEnd(RotateGestureDetector rotateGestureDetector, float f14, float f15, float f16);
    }

    public static class SimpleOnRotateGestureListener implements OnRotateGestureListener {
        @Override // com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener
        public boolean onRotate(RotateGestureDetector rotateGestureDetector, float f14, float f15) {
            return true;
        }

        @Override // com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener
        public boolean onRotateBegin(RotateGestureDetector rotateGestureDetector) {
            return true;
        }

        @Override // com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener
        public void onRotateEnd(RotateGestureDetector rotateGestureDetector, float f14, float f15, float f16) {
        }
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(2);
    }

    public RotateGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean analyzeMovement() {
        super.analyzeMovement();
        float rotationDegreesSinceLast = getRotationDegreesSinceLast();
        this.deltaSinceLast = rotationDegreesSinceLast;
        this.deltaSinceStart += rotationDegreesSinceLast;
        if (isInProgress()) {
            float f14 = this.deltaSinceLast;
            if (f14 != 0.0f) {
                return ((OnRotateGestureListener) this.listener).onRotate(this, f14, this.deltaSinceStart);
            }
        }
        if (!canExecute(2) || !((OnRotateGestureListener) this.listener).onRotateBegin(this)) {
            return false;
        }
        gestureStarted();
        return true;
    }

    public float calculateAngularVelocityVector(float f14, float f15) {
        float fAbs = Math.abs((float) (((double) ((getFocalPoint().y * f14) + (getFocalPoint().x * f15))) / (Math.pow(getFocalPoint().y, 2.0d) + Math.pow(getFocalPoint().x, 2.0d))));
        return this.deltaSinceLast < 0.0f ? -fAbs : fAbs;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i14) {
        return Math.abs(this.deltaSinceStart) >= this.angleThreshold && super.canExecute(i14);
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public void gestureStopped() {
        super.gestureStopped();
        if (this.deltaSinceLast == 0.0f) {
            this.velocityX = 0.0f;
            this.velocityY = 0.0f;
        }
        ((OnRotateGestureListener) this.listener).onRotateEnd(this, this.velocityX, this.velocityY, calculateAngularVelocityVector(this.velocityX, this.velocityY));
    }

    public float getAngleThreshold() {
        return this.angleThreshold;
    }

    public float getDeltaSinceLast() {
        return this.deltaSinceLast;
    }

    public float getDeltaSinceStart() {
        return this.deltaSinceStart;
    }

    public float getRotationDegreesSinceLast() {
        MultiFingerDistancesObject multiFingerDistancesObject = this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(0), this.pointerIdList.get(1)));
        return (float) Math.toDegrees(Math.atan2(multiFingerDistancesObject.getPrevFingersDiffY(), multiFingerDistancesObject.getPrevFingersDiffX()) - Math.atan2(multiFingerDistancesObject.getCurrFingersDiffY(), multiFingerDistancesObject.getCurrFingersDiffX()));
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public Set<Integer> provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
        this.deltaSinceStart = 0.0f;
    }

    public void setAngleThreshold(float f14) {
        this.angleThreshold = f14;
    }
}
