package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class an extends ah {
    private static final PointF p = new PointF();
    private final a n;
    private boolean o;
    private PointF q;
    private PointF r;
    private PointF s;
    private PointF t;

    public interface a {
        void a(an anVar);
    }

    public static class b implements a {
        @Override // com.amap.api.mapcore.util.an.a
        public void a(an anVar) {
        }
    }

    public an(Context context, a aVar) {
        super(context);
        this.s = new PointF();
        this.t = new PointF();
        this.n = aVar;
    }

    @Override // com.amap.api.mapcore.util.ai
    public final void a(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i != 5) {
            return;
        }
        a();
        this.g = MotionEvent.obtain(motionEvent);
        this.k = 0L;
        a(motionEvent);
        boolean zA = a(motionEvent, i2, i3);
        this.o = zA;
        if (zA) {
            return;
        }
        this.f = true;
    }

    public final float d() {
        return this.s.x;
    }

    public final float e() {
        return this.s.y;
    }

    @Override // com.amap.api.mapcore.util.ai
    public final void a(int i, MotionEvent motionEvent) {
        if (i == 3) {
            a();
        } else {
            if (i != 6) {
                return;
            }
            a(motionEvent);
            if (!this.o) {
                this.n.a(this);
            }
            a();
        }
    }

    @Override // com.amap.api.mapcore.util.ai
    public final void a() {
        super.a();
        this.o = false;
        PointF pointF = this.s;
        pointF.x = 0.0f;
        PointF pointF2 = this.t;
        pointF2.x = 0.0f;
        pointF.y = 0.0f;
        pointF2.y = 0.0f;
    }

    @Override // com.amap.api.mapcore.util.ah, com.amap.api.mapcore.util.ai
    public final void a(MotionEvent motionEvent) {
        PointF pointF;
        super.a(motionEvent);
        MotionEvent motionEvent2 = this.g;
        this.q = ai.b(motionEvent);
        this.r = ai.b(motionEvent2);
        if (this.g.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = p;
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
