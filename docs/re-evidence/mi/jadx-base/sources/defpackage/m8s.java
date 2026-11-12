package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class m8s extends l7s {
    public static final PointF C = new PointF();
    public PointF A;
    public PointF B;
    public final a w;
    public boolean x;
    public PointF y;
    public PointF z;

    public interface a {
        void a(m8s m8sVar);
    }

    public static class b implements a {
    }

    public m8s(Context context, a aVar) {
        super(context);
        this.A = new PointF();
        this.B = new PointF();
        this.w = aVar;
    }

    @Override // defpackage.r7s
    public final void a() {
        super.a();
        this.x = false;
        PointF pointF = this.A;
        pointF.x = 0.0f;
        PointF pointF2 = this.B;
        pointF2.x = 0.0f;
        pointF.y = 0.0f;
        pointF2.y = 0.0f;
    }

    @Override // defpackage.r7s
    public final void c(int i, MotionEvent motionEvent) {
        if (i == 3) {
            a();
        } else {
            if (i != 6) {
                return;
            }
            e(motionEvent);
            if (!this.x) {
                this.w.a(this);
            }
            a();
        }
    }

    @Override // defpackage.r7s
    public final void d(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i != 5) {
            return;
        }
        a();
        this.c = MotionEvent.obtain(motionEvent);
        this.g = 0L;
        e(motionEvent);
        boolean zL = l(motionEvent, i2, i3);
        this.x = zL;
        if (zL) {
            return;
        }
        this.f32299b = true;
    }

    @Override // defpackage.l7s, defpackage.r7s
    public final void e(MotionEvent motionEvent) {
        PointF pointF;
        super.e(motionEvent);
        MotionEvent motionEvent2 = this.c;
        this.y = r7s.g(motionEvent);
        this.z = r7s.g(motionEvent2);
        if (this.c.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = C;
        } else {
            PointF pointF2 = this.y;
            float f = pointF2.x;
            PointF pointF3 = this.z;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.B = pointF;
        PointF pointF4 = this.A;
        pointF4.x += pointF.x;
        pointF4.y += pointF.y;
    }

    public final float n() {
        return this.A.x;
    }

    public final float o() {
        return this.A.y;
    }
}
