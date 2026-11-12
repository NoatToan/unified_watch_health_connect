package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, com.google.android.exoplayer2.video.spherical.a.InterfaceC0208a {
    public final a c;
    public final float d;
    public final GestureDetector e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f8470a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f8471b = new PointF();
    public volatile float f = 3.1415927f;

    public interface a {
        void b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public b(Context context, a aVar, float f) {
        this.c = aVar;
        this.d = f;
        this.e = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.a.InterfaceC0208a
    public void a(float[] fArr, float f) {
        this.f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f8470a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f8470a.x) / this.d;
        float y = motionEvent2.getY();
        PointF pointF = this.f8470a;
        float f3 = (y - pointF.y) / this.d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f8471b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = pointF2.y + (fSin * x) + (fCos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.c.b(this.f8471b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }
}
