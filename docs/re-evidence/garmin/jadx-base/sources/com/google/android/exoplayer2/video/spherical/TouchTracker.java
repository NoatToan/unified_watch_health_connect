package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    static final float MAX_PITCH_DEGREES = 45.0f;
    private final GestureDetector gestureDetector;
    private final Listener listener;
    private final float pxPerDegrees;
    private final PointF previousTouchPointPx = new PointF();
    private final PointF accumulatedTouchOffsetDegrees = new PointF();
    private volatile float roll = 3.1415927f;

    public interface Listener {
        void onScrollChange(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public TouchTracker(Context context, Listener listener, float f14) {
        this.listener = listener;
        this.pxPerDegrees = f14;
        this.gestureDetector = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.previousTouchPointPx.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
    public void onOrientationChange(float[] fArr, float f14) {
        this.roll = -f14;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
        float x14 = (motionEvent2.getX() - this.previousTouchPointPx.x) / this.pxPerDegrees;
        float y14 = motionEvent2.getY();
        PointF pointF = this.previousTouchPointPx;
        float f16 = (y14 - pointF.y) / this.pxPerDegrees;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d14 = this.roll;
        float fCos = (float) Math.cos(d14);
        float fSin = (float) Math.sin(d14);
        PointF pointF2 = this.accumulatedTouchOffsetDegrees;
        pointF2.x -= (fCos * x14) - (fSin * f16);
        float f17 = (fCos * f16) + (fSin * x14) + pointF2.y;
        pointF2.y = f17;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f17));
        this.listener.onScrollChange(this.accumulatedTouchOffsetDegrees);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.listener.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view2, MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }
}
