package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class au extends as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final PointF f2222a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f2223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PointF f2224c;
    private PointF d;
    private PointF n;
    private PointF o;

    public interface a {
        boolean a(au auVar);

        boolean b(au auVar);

        void c(au auVar);
    }

    public au(Context context, a aVar) {
        super(context);
        this.n = new PointF();
        this.o = new PointF();
        this.f2223b = aVar;
    }

    @Override // com.amap.api.col.p0003sl.as
    protected final void a(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i == 0) {
            a();
            this.g = MotionEvent.obtain(motionEvent);
            this.k = 0L;
            a(motionEvent);
            return;
        }
        if (i == 2) {
            this.f = this.f2223b.b(this);
        } else {
            if (i != 5) {
                return;
            }
            if (this.g != null) {
                this.g.recycle();
            }
            this.g = MotionEvent.obtain(motionEvent);
            a(motionEvent);
        }
    }

    @Override // com.amap.api.col.p0003sl.as
    protected final void a(int i, MotionEvent motionEvent) {
        if (i != 1) {
            if (i == 2) {
                a(motionEvent);
                if (this.i / this.j <= 0.67f || motionEvent.getPointerCount() > 1 || !this.f2223b.a(this)) {
                    return;
                }
                this.g.recycle();
                this.g = MotionEvent.obtain(motionEvent);
                return;
            }
            if (i != 3) {
                return;
            }
        }
        this.f2223b.c(this);
        a();
    }

    @Override // com.amap.api.col.p0003sl.as
    protected final void a(MotionEvent motionEvent) {
        super.a(motionEvent);
        MotionEvent motionEvent2 = this.g;
        this.f2224c = b(motionEvent);
        this.d = b(motionEvent2);
        boolean z = this.g.getPointerCount() != motionEvent.getPointerCount();
        this.o = z ? f2222a : new PointF(this.f2224c.x - this.d.x, this.f2224c.y - this.d.y);
        if (z) {
            this.g.recycle();
            this.g = MotionEvent.obtain(motionEvent);
        }
        this.n.x += this.o.x;
        this.n.y += this.o.y;
    }

    public final PointF d() {
        return this.o;
    }
}
