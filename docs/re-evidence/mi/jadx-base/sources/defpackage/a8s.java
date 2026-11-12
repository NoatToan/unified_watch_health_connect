package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class a8s extends r7s {
    public static final PointF o = new PointF();
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f781k;
    public PointF l;
    public PointF m;
    public PointF n;

    public interface a {
        void a(a8s a8sVar);

        boolean b(a8s a8sVar);

        boolean c(a8s a8sVar);
    }

    public a8s(Context context, a aVar) {
        super(context);
        this.m = new PointF();
        this.n = new PointF();
        this.j = aVar;
    }

    @Override // defpackage.r7s
    public final void c(int i, MotionEvent motionEvent) {
        if (i != 1) {
            if (i == 2) {
                e(motionEvent);
                if (this.e / this.f <= 0.67f || motionEvent.getPointerCount() > 1 || !this.j.c(this)) {
                    return;
                }
                this.c.recycle();
                this.c = MotionEvent.obtain(motionEvent);
                return;
            }
            if (i != 3) {
                return;
            }
        }
        this.j.a(this);
        a();
    }

    @Override // defpackage.r7s
    public final void d(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i == 0) {
            a();
            this.c = MotionEvent.obtain(motionEvent);
            this.g = 0L;
            e(motionEvent);
            return;
        }
        if (i == 2) {
            this.f32299b = this.j.b(this);
            return;
        }
        if (i != 5) {
            return;
        }
        MotionEvent motionEvent2 = this.c;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.c = MotionEvent.obtain(motionEvent);
        e(motionEvent);
    }

    @Override // defpackage.r7s
    public final void e(MotionEvent motionEvent) {
        PointF pointF;
        super.e(motionEvent);
        MotionEvent motionEvent2 = this.c;
        this.f781k = r7s.g(motionEvent);
        this.l = r7s.g(motionEvent2);
        boolean z = this.c.getPointerCount() != motionEvent.getPointerCount();
        if (z) {
            pointF = o;
        } else {
            PointF pointF2 = this.f781k;
            float f = pointF2.x;
            PointF pointF3 = this.l;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.n = pointF;
        if (z) {
            this.c.recycle();
            this.c = MotionEvent.obtain(motionEvent);
        }
        PointF pointF4 = this.m;
        float f2 = pointF4.x;
        PointF pointF5 = this.n;
        pointF4.x = f2 + pointF5.x;
        pointF4.y += pointF5.y;
    }

    public final PointF j() {
        return this.n;
    }
}
