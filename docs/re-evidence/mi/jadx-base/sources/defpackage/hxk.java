package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes6.dex */
public class hxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20575b;
    public double c;
    public double d;
    public float e;
    public float f;
    public boolean g;
    public int[] h = new int[2];
    public a i;

    public interface a {
        boolean a(hxk hxkVar);

        void b(hxk hxkVar);

        boolean c(hxk hxkVar);
    }

    public hxk(a aVar) {
        this.i = aVar;
    }

    public final void a() {
        if (this.g) {
            this.g = false;
            a aVar = this.i;
            if (aVar != null) {
                aVar.b(this);
            }
        }
    }

    public float b() {
        return this.e;
    }

    public float c() {
        return this.f;
    }

    public double d() {
        return this.d;
    }

    public long e() {
        return this.f20574a - this.f20575b;
    }

    public boolean f(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            this.h[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.h[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionMasked == 6 && this.g) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int[] iArr = this.h;
                    if (pointerId == iArr[0] || pointerId == iArr[1]) {
                        a();
                    }
                }
            } else if (!this.g) {
                this.h[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.g = true;
                this.f20575b = motionEvent.getEventTime();
                this.c = Double.NaN;
                g(motionEvent);
                a aVar = this.i;
                if (aVar != null) {
                    aVar.c(this);
                }
            }
        } else if (this.g) {
            g(motionEvent);
            a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.a(this);
            }
        }
        return true;
    }

    public final void g(MotionEvent motionEvent) {
        this.f20575b = this.f20574a;
        this.f20574a = motionEvent.getEventTime();
        int iFindPointerIndex = motionEvent.findPointerIndex(this.h[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.h[1]);
        float x = motionEvent.getX(iFindPointerIndex);
        float y = motionEvent.getY(iFindPointerIndex);
        float x2 = motionEvent.getX(iFindPointerIndex2);
        float y2 = motionEvent.getY(iFindPointerIndex2);
        this.e = (x + x2) * 0.5f;
        this.f = (y + y2) * 0.5f;
        double d = -Math.atan2(y2 - y, x2 - x);
        if (Double.isNaN(this.c)) {
            this.d = 0.0d;
        } else {
            this.d = this.c - d;
        }
        this.c = d;
        double d2 = this.d;
        if (d2 > 3.141592653589793d) {
            this.d = d2 - 3.141592653589793d;
        } else if (d2 < -3.141592653589793d) {
            this.d = d2 + 3.141592653589793d;
        }
        double d3 = this.d;
        if (d3 > 1.5707963267948966d) {
            this.d = d3 - 3.141592653589793d;
        } else if (d3 < -1.5707963267948966d) {
            this.d = d3 + 3.141592653589793d;
        }
    }
}
