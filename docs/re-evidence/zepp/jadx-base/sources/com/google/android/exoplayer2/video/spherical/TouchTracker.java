package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;

/* JADX INFO: loaded from: classes3.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    public static final float g = 45.0f;
    private final Listener c;
    private final float d;
    private final GestureDetector e;
    private final PointF a = new PointF();
    private final PointF b = new PointF();
    private volatile float f = 3.1415927f;

    public interface Listener {
        void onScrollChange(PointF scrollOffsetDegrees);

        boolean onSingleTapUp(MotionEvent event);
    }

    public TouchTracker(Context context, Listener listener, float pxPerDegrees) {
        this.c = listener;
        this.d = pxPerDegrees;
        this.e = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        this.a.set(e.getX(), e.getY());
        return true;
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
    @BinderThread
    public void onOrientationChange(float[] deviceOrientationMatrix, float roll) {
        this.f = -roll;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        float x = (e2.getX() - this.a.x) / this.d;
        float y = e2.getY();
        PointF pointF = this.a;
        float f = (y - pointF.y) / this.d;
        pointF.set(e2.getX(), e2.getY());
        double d = this.f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.b;
        pointF2.x -= (fCos * x) - (fSin * f);
        float f2 = pointF2.y + (fSin * x) + (fCos * f);
        pointF2.y = f2;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f2));
        this.c.onScrollChange(this.b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        return this.c.onSingleTapUp(e);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        return this.e.onTouchEvent(event);
    }
}
