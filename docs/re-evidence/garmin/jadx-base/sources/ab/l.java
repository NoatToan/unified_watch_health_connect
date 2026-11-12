package ab;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GestureDetector f2505e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f2501a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f2502b = new PointF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile float f2506f = 3.1415927f;

    public interface a {
    }

    public l(Context context, a aVar, float f14) {
        this.f2503c = aVar;
        this.f2504d = f14;
        this.f2505e = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f2501a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // ab.d.a
    public final void onOrientationChange(float[] fArr, float f14) {
        this.f2506f = -f14;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
        float x14 = (motionEvent2.getX() - this.f2501a.x) / this.f2504d;
        float y14 = motionEvent2.getY();
        PointF pointF = this.f2501a;
        float f16 = (y14 - pointF.y) / this.f2504d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d14 = this.f2506f;
        float fCos = (float) Math.cos(d14);
        float fSin = (float) Math.sin(d14);
        PointF pointF2 = this.f2502b;
        pointF2.x -= (fCos * x14) - (fSin * f16);
        float f17 = (fCos * f16) + (fSin * x14) + pointF2.y;
        pointF2.y = f17;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f17));
        a aVar = this.f2503c;
        PointF pointF3 = this.f2502b;
        k.a aVar2 = (k.a) aVar;
        synchronized (aVar2) {
            float f18 = pointF3.y;
            aVar2.f2496g = f18;
            Matrix.setRotateM(aVar2.f2494e, 0, -f18, (float) Math.cos(aVar2.f2497h), (float) Math.sin(aVar2.f2497h), 0.0f);
            Matrix.setRotateM(aVar2.f2495f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return k.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view2, MotionEvent motionEvent) {
        return this.f2505e.onTouchEvent(motionEvent);
    }
}
