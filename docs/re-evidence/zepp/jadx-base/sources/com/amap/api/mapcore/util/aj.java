package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class aj extends ah {
    private static final PointF n = new PointF();
    private final a o;
    private boolean p;
    private PointF q;
    private PointF r;
    private PointF s;
    private PointF t;

    public interface a {
        boolean a(aj ajVar);

        boolean b(aj ajVar);

        void c(aj ajVar);
    }

    public aj(Context context, a aVar) {
        super(context);
        this.s = new PointF();
        this.t = new PointF();
        this.o = aVar;
    }

    @Override // com.amap.api.mapcore.util.ai
    public final void a(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i == 2) {
            if (this.p) {
                boolean zA = a(motionEvent, i2, i3);
                this.p = zA;
                if (zA) {
                    return;
                }
                this.f = this.o.b(this);
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        a();
        this.g = MotionEvent.obtain(motionEvent);
        this.k = 0L;
        a(motionEvent);
        boolean zA2 = a(motionEvent, i2, i3);
        this.p = zA2;
        if (zA2) {
            return;
        }
        this.f = this.o.b(this);
    }

    public final PointF d() {
        return this.t;
    }

    @Override // com.amap.api.mapcore.util.ai
    public final void a(int i, MotionEvent motionEvent) {
        if (i == 2) {
            a(motionEvent);
            if (this.i / this.j <= 0.67f || !this.o.a(this)) {
                return;
            }
            this.g.recycle();
            this.g = MotionEvent.obtain(motionEvent);
            return;
        }
        if (i == 3) {
            if (!this.p) {
                this.o.c(this);
            }
            a();
        } else {
            if (i != 6) {
                return;
            }
            a(motionEvent);
            if (!this.p) {
                this.o.c(this);
            }
            a();
        }
    }

    @Override // com.amap.api.mapcore.util.ai
    public final void a() {
        super.a();
        this.p = false;
    }

    @Override // com.amap.api.mapcore.util.ah, com.amap.api.mapcore.util.ai
    public final void a(MotionEvent motionEvent) {
        PointF pointF;
        super.a(motionEvent);
        MotionEvent motionEvent2 = this.g;
        this.q = ai.b(motionEvent);
        this.r = ai.b(motionEvent2);
        if (this.g.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = n;
        } else {
            PointF pointF2 = this.q;
            float f = pointF2.x;
            PointF pointF3 = this.r;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.t = pointF;
        PointF pointF4 = this.s;
        pointF4.x += pointF.x;
        pointF4.y += pointF.y;
    }
}
