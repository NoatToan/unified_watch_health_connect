package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class ak extends ai {
    private static final PointF a = new PointF();
    private final a b;
    private PointF c;
    private PointF d;
    private PointF n;
    private PointF o;

    public interface a {
        boolean a(ak akVar);

        boolean b(ak akVar);

        void c(ak akVar);
    }

    public ak(Context context, a aVar) {
        super(context);
        this.n = new PointF();
        this.o = new PointF();
        this.b = aVar;
    }

    @Override // com.amap.api.mapcore.util.ai
    public final void a(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i == 0) {
            a();
            this.g = MotionEvent.obtain(motionEvent);
            this.k = 0L;
            a(motionEvent);
            return;
        }
        if (i == 2) {
            this.f = this.b.b(this);
            return;
        }
        if (i != 5) {
            return;
        }
        MotionEvent motionEvent2 = this.g;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.g = MotionEvent.obtain(motionEvent);
        a(motionEvent);
    }

    public final PointF d() {
        return this.o;
    }

    @Override // com.amap.api.mapcore.util.ai
    public final void a(int i, MotionEvent motionEvent) {
        if (i != 1) {
            if (i == 2) {
                a(motionEvent);
                if (this.i / this.j <= 0.67f || motionEvent.getPointerCount() > 1 || !this.b.a(this)) {
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
        this.b.c(this);
        a();
    }

    @Override // com.amap.api.mapcore.util.ai
    public final void a(MotionEvent motionEvent) {
        PointF pointF;
        super.a(motionEvent);
        MotionEvent motionEvent2 = this.g;
        this.c = ai.b(motionEvent);
        this.d = ai.b(motionEvent2);
        boolean z = this.g.getPointerCount() != motionEvent.getPointerCount();
        if (z) {
            pointF = a;
        } else {
            PointF pointF2 = this.c;
            float f = pointF2.x;
            PointF pointF3 = this.d;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.o = pointF;
        if (z) {
            this.g.recycle();
            this.g = MotionEvent.obtain(motionEvent);
        }
        PointF pointF4 = this.n;
        float f2 = pointF4.x;
        PointF pointF5 = this.o;
        pointF4.x = f2 + pointF5.x;
        pointF4.y += pointF5.y;
    }
}
