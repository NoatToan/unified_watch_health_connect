package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class e8s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16398b;
    public boolean c;
    public MotionEvent d;
    public MotionEvent e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f16399k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f16400r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public int z = 0;
    public int A = 0;

    public interface a {
        void a(e8s e8sVar);

        boolean b(e8s e8sVar);

        boolean c(e8s e8sVar);
    }

    public e8s(Context context, a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16397a = context;
        this.f16398b = aVar;
        this.f16400r = viewConfiguration.getScaledEdgeSlop();
    }

    public static float a(MotionEvent motionEvent, int i) {
        if (i < 0) {
            return Float.MIN_VALUE;
        }
        if (i == 0) {
            return motionEvent.getRawX();
        }
        return motionEvent.getX(i) + (motionEvent.getRawX() - motionEvent.getX());
    }

    public static float g(MotionEvent motionEvent, int i) {
        if (i < 0) {
            return Float.MIN_VALUE;
        }
        if (i == 0) {
            return motionEvent.getRawY();
        }
        return motionEvent.getY(i) + (motionEvent.getRawY() - motionEvent.getY());
    }

    public final int b(MotionEvent motionEvent, int i, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i3 != i2 && i3 != iFindPointerIndex) {
                float f = this.f16400r;
                float f2 = this.s;
                float f3 = this.t;
                float fA = a(motionEvent, i3);
                float fG = g(motionEvent, i3);
                if (fA >= f && fG >= f && fA <= f2 && fG <= f3) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public final MotionEvent c() {
        return this.e;
    }

    public final void d(int i, int i2) {
        this.z = i;
        this.A = i2;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0278  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b9  */
    public final boolean e(MotionEvent motionEvent) {
        int i;
        int iB;
        int iB2;
        int i2;
        int iB3;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            p();
        }
        boolean z = false;
        if (this.v) {
            return false;
        }
        if (this.c) {
            if (action == 1) {
                p();
            } else if (action == 2) {
                h(motionEvent);
                if (this.o / this.p > 0.67f && this.f16398b.c(this)) {
                    this.d.recycle();
                    this.d = MotionEvent.obtain(motionEvent);
                }
            } else if (action == 3) {
                this.f16398b.a(this);
                p();
            } else if (action == 5) {
                this.f16398b.a(this);
                int i3 = this.w;
                int i4 = this.x;
                p();
                this.d = MotionEvent.obtain(motionEvent);
                if (!this.y) {
                    i3 = i4;
                }
                this.w = i3;
                this.x = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.y = false;
                int iFindPointerIndex = motionEvent.findPointerIndex(this.w);
                if (iFindPointerIndex < 0 || this.w == this.x) {
                    int i5 = this.w;
                    int i6 = this.x;
                    this.w = motionEvent.getPointerId(b(motionEvent, i5 != i6 ? i6 : -1, iFindPointerIndex));
                }
                h(motionEvent);
                this.c = this.f16398b.b(this);
            } else if (action == 6) {
                int pointerCount = motionEvent.getPointerCount();
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                if (pointerCount <= 2) {
                    h(motionEvent);
                    i = this.w;
                    if (pointerId == i) {
                        i = this.x;
                    }
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(i);
                    this.f = motionEvent.getX(iFindPointerIndex2);
                    this.g = motionEvent.getY(iFindPointerIndex2);
                    this.f16398b.a(this);
                    p();
                    this.w = i;
                    this.y = true;
                } else {
                    int i7 = this.w;
                    if (pointerId == i7) {
                        int iB4 = b(motionEvent, this.x, actionIndex);
                        if (iB4 >= 0) {
                            this.f16398b.a(this);
                            this.w = motionEvent.getPointerId(iB4);
                            this.y = true;
                            this.d = MotionEvent.obtain(motionEvent);
                            h(motionEvent);
                            this.c = this.f16398b.b(this);
                        } else {
                            z = true;
                        }
                    } else if (pointerId == this.x) {
                        int iB5 = b(motionEvent, i7, actionIndex);
                        if (iB5 >= 0) {
                            this.f16398b.a(this);
                            this.x = motionEvent.getPointerId(iB5);
                            this.y = false;
                            this.d = MotionEvent.obtain(motionEvent);
                            h(motionEvent);
                            this.c = this.f16398b.b(this);
                        } else {
                            z = true;
                        }
                    }
                    this.d.recycle();
                    this.d = MotionEvent.obtain(motionEvent);
                    h(motionEvent);
                    if (z) {
                        h(motionEvent);
                        i = this.w;
                        if (pointerId == i) {
                            i = this.x;
                        }
                        int iFindPointerIndex3 = motionEvent.findPointerIndex(i);
                        this.f = motionEvent.getX(iFindPointerIndex3);
                        this.g = motionEvent.getY(iFindPointerIndex3);
                        this.f16398b.a(this);
                        p();
                        this.w = i;
                        this.y = true;
                    }
                }
            }
        } else if (action == 0) {
            this.w = motionEvent.getPointerId(0);
            this.y = true;
        } else if (action == 1) {
            p();
        } else if (action != 2) {
            if (action == 5) {
                int i8 = this.z;
                if (i8 == 0 || (i2 = this.A) == 0) {
                    DisplayMetrics displayMetrics = this.f16397a.getResources().getDisplayMetrics();
                    float f = displayMetrics.widthPixels;
                    float f2 = this.f16400r;
                    this.s = f - f2;
                    this.t = displayMetrics.heightPixels - f2;
                } else {
                    float f3 = this.f16400r;
                    this.s = i8 - f3;
                    this.t = i2 - f3;
                }
                MotionEvent motionEvent2 = this.d;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.d = MotionEvent.obtain(motionEvent);
                this.q = 0L;
                int actionIndex2 = motionEvent.getActionIndex();
                int iFindPointerIndex4 = motionEvent.findPointerIndex(this.w);
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                this.x = pointerId2;
                if (iFindPointerIndex4 < 0 || iFindPointerIndex4 == actionIndex2) {
                    iFindPointerIndex4 = b(motionEvent, iFindPointerIndex4 != actionIndex2 ? pointerId2 : -1, iFindPointerIndex4);
                    this.w = motionEvent.getPointerId(iFindPointerIndex4);
                }
                this.y = false;
                h(motionEvent);
                float f4 = this.f16400r;
                float f5 = this.s;
                float f6 = this.t;
                float fA = a(motionEvent, iFindPointerIndex4);
                float fG = g(motionEvent, iFindPointerIndex4);
                float fA2 = a(motionEvent, actionIndex2);
                float fG2 = g(motionEvent, actionIndex2);
                boolean z2 = fA < f4 || fG < f4 || fA > f5 || fG > f6;
                boolean z3 = fA2 < f4 || fG2 < f4 || fA2 > f5 || fG2 > f6;
                if (z2 && z3) {
                    this.f = -1.0f;
                    this.g = -1.0f;
                    this.u = true;
                } else if (z2) {
                    this.f = motionEvent.getX(actionIndex2);
                    this.g = motionEvent.getY(actionIndex2);
                    this.u = true;
                } else if (z3) {
                    this.f = motionEvent.getX(iFindPointerIndex4);
                    this.g = motionEvent.getY(iFindPointerIndex4);
                    this.u = true;
                } else {
                    this.u = false;
                    this.c = this.f16398b.b(this);
                }
            } else if (action == 6 && this.u) {
                int pointerCount2 = motionEvent.getPointerCount();
                int actionIndex3 = motionEvent.getActionIndex();
                int pointerId3 = motionEvent.getPointerId(actionIndex3);
                if (pointerCount2 > 2) {
                    int i9 = this.w;
                    if (pointerId3 == i9) {
                        int iB6 = b(motionEvent, this.x, actionIndex3);
                        if (iB6 >= 0) {
                            this.w = motionEvent.getPointerId(iB6);
                        }
                    } else if (pointerId3 == this.x && (iB3 = b(motionEvent, i9, actionIndex3)) >= 0) {
                        this.x = motionEvent.getPointerId(iB3);
                    }
                } else {
                    int i10 = this.w;
                    if (pointerId3 == i10) {
                        i10 = this.x;
                    }
                    int iFindPointerIndex5 = motionEvent.findPointerIndex(i10);
                    if (iFindPointerIndex5 < 0) {
                        this.v = true;
                        if (this.c) {
                            this.f16398b.a(this);
                        }
                        return false;
                    }
                    this.w = motionEvent.getPointerId(iFindPointerIndex5);
                    this.y = true;
                    this.x = -1;
                    this.f = motionEvent.getX(iFindPointerIndex5);
                    this.g = motionEvent.getY(iFindPointerIndex5);
                }
            }
        } else if (this.u) {
            float f7 = this.f16400r;
            float f8 = this.s;
            float f9 = this.t;
            int iFindPointerIndex6 = motionEvent.findPointerIndex(this.w);
            int iFindPointerIndex7 = motionEvent.findPointerIndex(this.x);
            float fA3 = a(motionEvent, iFindPointerIndex6);
            float fG3 = g(motionEvent, iFindPointerIndex6);
            float fA4 = a(motionEvent, iFindPointerIndex7);
            float fG4 = g(motionEvent, iFindPointerIndex7);
            boolean z4 = fA3 < f7 || fG3 < f7 || fA3 > f8 || fG3 > f9;
            boolean z5 = fA4 < f7 || fG4 < f7 || fA4 > f8 || fG4 > f9;
            if (z4 && (iB2 = b(motionEvent, this.x, iFindPointerIndex6)) >= 0) {
                this.w = motionEvent.getPointerId(iB2);
                a(motionEvent, iB2);
                g(motionEvent, iB2);
                z4 = false;
                iFindPointerIndex6 = iB2;
            }
            if (z5 && (iB = b(motionEvent, this.w, iFindPointerIndex7)) >= 0) {
                this.x = motionEvent.getPointerId(iB);
                a(motionEvent, iB);
                g(motionEvent, iB);
                z5 = false;
                iFindPointerIndex7 = iB;
            }
            if (z4 && z5) {
                this.f = -1.0f;
                this.g = -1.0f;
            } else if (z4) {
                this.f = motionEvent.getX(iFindPointerIndex7);
                this.g = motionEvent.getY(iFindPointerIndex7);
            } else if (z5) {
                this.f = motionEvent.getX(iFindPointerIndex6);
                this.g = motionEvent.getY(iFindPointerIndex6);
            } else {
                this.u = false;
                this.c = this.f16398b.b(this);
            }
        }
        return true;
    }

    public final float f() {
        return this.f;
    }

    public final void h(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.e;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.e = MotionEvent.obtain(motionEvent);
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
        MotionEvent motionEvent3 = this.d;
        int iFindPointerIndex = motionEvent3.findPointerIndex(this.w);
        int iFindPointerIndex2 = motionEvent3.findPointerIndex(this.x);
        int iFindPointerIndex3 = motionEvent.findPointerIndex(this.w);
        int iFindPointerIndex4 = motionEvent.findPointerIndex(this.x);
        if (iFindPointerIndex < 0 || iFindPointerIndex2 < 0 || iFindPointerIndex3 < 0 || iFindPointerIndex4 < 0) {
            this.v = true;
            if (this.c) {
                this.f16398b.a(this);
                return;
            }
            return;
        }
        float x = motionEvent3.getX(iFindPointerIndex);
        float y = motionEvent3.getY(iFindPointerIndex);
        float x2 = motionEvent3.getX(iFindPointerIndex2);
        float y2 = motionEvent3.getY(iFindPointerIndex2);
        float x3 = motionEvent.getX(iFindPointerIndex3);
        float y3 = motionEvent.getY(iFindPointerIndex3);
        float x4 = motionEvent.getX(iFindPointerIndex4) - x3;
        float y4 = motionEvent.getY(iFindPointerIndex4) - y3;
        this.h = x2 - x;
        this.i = y2 - y;
        this.j = x4;
        this.f16399k = y4;
        this.f = x3 + (x4 * 0.5f);
        this.g = y3 + (y4 * 0.5f);
        this.q = motionEvent.getEventTime() - motionEvent3.getEventTime();
        this.o = motionEvent.getPressure(iFindPointerIndex3) + motionEvent.getPressure(iFindPointerIndex4);
        this.p = motionEvent3.getPressure(iFindPointerIndex) + motionEvent3.getPressure(iFindPointerIndex2);
    }

    public final float i() {
        return this.g;
    }

    public final float j() {
        return this.j;
    }

    public final float k() {
        return this.f16399k;
    }

    public final float l() {
        return this.h;
    }

    public final float m() {
        return this.i;
    }

    public final float n() {
        if (this.n == -1.0f) {
            this.n = q() / r();
        }
        return this.n;
    }

    public final long o() {
        return this.q;
    }

    public final void p() {
        MotionEvent motionEvent = this.d;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.d = null;
        }
        MotionEvent motionEvent2 = this.e;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.e = null;
        }
        this.u = false;
        this.c = false;
        this.w = -1;
        this.x = -1;
        this.v = false;
    }

    public final float q() {
        if (this.l == -1.0f) {
            float f = this.j;
            float f2 = this.f16399k;
            this.l = (float) Math.sqrt((f * f) + (f2 * f2));
        }
        return this.l;
    }

    public final float r() {
        if (this.m == -1.0f) {
            float f = this.h;
            float f2 = this.i;
            this.m = (float) Math.sqrt((f * f) + (f2 * f2));
        }
        return this.m;
    }
}
