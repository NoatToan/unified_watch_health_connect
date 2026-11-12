package com.yalantis.ucrop.util;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public class RotationGestureDetector {
    private static final int INVALID_POINTER_INDEX = -1;
    private float fX;
    private float fY;
    private float mAngle;
    private boolean mIsFirstTouch;
    private OnRotationGestureListener mListener;
    private int mPointerIndex1 = -1;
    private int mPointerIndex2 = -1;
    private float sX;
    private float sY;

    public interface OnRotationGestureListener {
        boolean onRotation(RotationGestureDetector rotationGestureDetector);
    }

    public static class SimpleOnRotationGestureListener implements OnRotationGestureListener {
        @Override // com.yalantis.ucrop.util.RotationGestureDetector.OnRotationGestureListener
        public boolean onRotation(RotationGestureDetector rotationGestureDetector) {
            return false;
        }
    }

    public RotationGestureDetector(OnRotationGestureListener onRotationGestureListener) {
        this.mListener = onRotationGestureListener;
    }

    private float calculateAngleBetweenLines(float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24) {
        return calculateAngleDelta((float) Math.toDegrees((float) Math.atan2(f15 - f17, f14 - f16)), (float) Math.toDegrees((float) Math.atan2(f19 - f24, f18 - f22)));
    }

    private float calculateAngleDelta(float f14, float f15) {
        float f16 = (f15 % 360.0f) - (f14 % 360.0f);
        this.mAngle = f16;
        if (f16 < -180.0f) {
            this.mAngle = f16 + 360.0f;
        } else if (f16 > 180.0f) {
            this.mAngle = f16 - 360.0f;
        }
        return this.mAngle;
    }

    public float getAngle() {
        return this.mAngle;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        RotationGestureDetector rotationGestureDetector;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.sX = motionEvent.getX();
            this.sY = motionEvent.getY();
            this.mPointerIndex1 = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.mAngle = 0.0f;
            this.mIsFirstTouch = true;
        } else if (actionMasked == 1) {
            this.mPointerIndex1 = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.fX = motionEvent.getX();
                this.fY = motionEvent.getY();
                this.mPointerIndex2 = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.mAngle = 0.0f;
                this.mIsFirstTouch = true;
            } else if (actionMasked == 6) {
                this.mPointerIndex2 = -1;
            }
        } else if (this.mPointerIndex1 != -1 && this.mPointerIndex2 != -1 && motionEvent.getPointerCount() > this.mPointerIndex2) {
            float x14 = motionEvent.getX(this.mPointerIndex1);
            float y14 = motionEvent.getY(this.mPointerIndex1);
            float x15 = motionEvent.getX(this.mPointerIndex2);
            float y15 = motionEvent.getY(this.mPointerIndex2);
            if (this.mIsFirstTouch) {
                this.mAngle = 0.0f;
                this.mIsFirstTouch = false;
                rotationGestureDetector = this;
            } else {
                calculateAngleBetweenLines(this.fX, this.fY, this.sX, this.sY, x15, y15, x14, y14);
                rotationGestureDetector = this;
            }
            OnRotationGestureListener onRotationGestureListener = rotationGestureDetector.mListener;
            if (onRotationGestureListener != null) {
                onRotationGestureListener.onRotation(this);
            }
            rotationGestureDetector.fX = x15;
            rotationGestureDetector.fY = y15;
            rotationGestureDetector.sX = x14;
            rotationGestureDetector.sY = y14;
        }
        return true;
    }
}
