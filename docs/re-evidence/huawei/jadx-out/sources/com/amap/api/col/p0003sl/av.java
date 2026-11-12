package com.amap.api.col.p0003sl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f2226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2227c;
    private MotionEvent d;
    private MotionEvent e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private long q;
    private final float r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z = 0;
    private int A = 0;

    public interface a {
        boolean a(av avVar);

        boolean b(av avVar);

        void c(av avVar);
    }

    public final MotionEvent a() {
        return this.e;
    }

    public av(Context context, a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2225a = context;
        this.f2226b = aVar;
        this.r = viewConfiguration.getScaledEdgeSlop();
    }

    public final void a(int i, int i2) {
        this.z = i;
        this.A = i2;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0295  */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02a4, code lost:
    
        if (r2 != false) goto L165;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        int iA;
        int iA2;
        int i;
        int iA3;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            j();
        }
        boolean z = false;
        if (this.v) {
            return false;
        }
        if (this.f2227c) {
            if (action == 1) {
                j();
                return true;
            }
            if (action == 2) {
                b(motionEvent);
                if (this.o / this.p > 0.67f && this.f2226b.a(this)) {
                    this.d.recycle();
                    this.d = MotionEvent.obtain(motionEvent);
                }
            } else {
                if (action == 3) {
                    this.f2226b.c(this);
                    j();
                    return true;
                }
                if (action == 5) {
                    this.f2226b.c(this);
                    int i2 = this.w;
                    int i3 = this.x;
                    j();
                    this.d = MotionEvent.obtain(motionEvent);
                    if (!this.y) {
                        i2 = i3;
                    }
                    this.w = i2;
                    this.x = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.y = false;
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.w);
                    if (iFindPointerIndex < 0 || this.w == this.x) {
                        int i4 = this.w;
                        int i5 = this.x;
                        this.w = motionEvent.getPointerId(a(motionEvent, i4 != i5 ? i5 : -1, iFindPointerIndex));
                    }
                    b(motionEvent);
                    this.f2227c = this.f2226b.b(this);
                    return true;
                }
                if (action == 6) {
                    int pointerCount = motionEvent.getPointerCount();
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (pointerCount > 2) {
                        int i6 = this.w;
                        if (pointerId == i6) {
                            int iA4 = a(motionEvent, this.x, actionIndex);
                            if (iA4 >= 0) {
                                this.f2226b.c(this);
                                this.w = motionEvent.getPointerId(iA4);
                                this.y = true;
                                this.d = MotionEvent.obtain(motionEvent);
                                b(motionEvent);
                                this.f2227c = this.f2226b.b(this);
                            } else {
                                z = true;
                            }
                        } else if (pointerId == this.x) {
                            int iA5 = a(motionEvent, i6, actionIndex);
                            if (iA5 >= 0) {
                                this.f2226b.c(this);
                                this.x = motionEvent.getPointerId(iA5);
                                this.y = false;
                                this.d = MotionEvent.obtain(motionEvent);
                                b(motionEvent);
                                this.f2227c = this.f2226b.b(this);
                            } else {
                                z = true;
                            }
                        }
                        this.d.recycle();
                        this.d = MotionEvent.obtain(motionEvent);
                        b(motionEvent);
                    }
                    b(motionEvent);
                    int i7 = this.w;
                    if (pointerId == i7) {
                        i7 = this.x;
                    }
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(i7);
                    this.f = motionEvent.getX(iFindPointerIndex2);
                    this.g = motionEvent.getY(iFindPointerIndex2);
                    this.f2226b.c(this);
                    j();
                    this.w = i7;
                    this.y = true;
                    return true;
                }
            }
        } else {
            if (action == 0) {
                this.w = motionEvent.getPointerId(0);
                this.y = true;
                return true;
            }
            if (action == 1) {
                j();
                return true;
            }
            if (action != 2) {
                if (action == 5) {
                    int i8 = this.z;
                    if (i8 == 0 || (i = this.A) == 0) {
                        DisplayMetrics displayMetrics = this.f2225a.getResources().getDisplayMetrics();
                        this.s = displayMetrics.widthPixels - this.r;
                        this.t = displayMetrics.heightPixels - this.r;
                    } else {
                        float f = this.r;
                        this.s = i8 - f;
                        this.t = i - f;
                    }
                    MotionEvent motionEvent2 = this.d;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.d = MotionEvent.obtain(motionEvent);
                    this.q = 0L;
                    int actionIndex2 = motionEvent.getActionIndex();
                    int iFindPointerIndex3 = motionEvent.findPointerIndex(this.w);
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    this.x = pointerId2;
                    if (iFindPointerIndex3 < 0 || iFindPointerIndex3 == actionIndex2) {
                        iFindPointerIndex3 = a(motionEvent, iFindPointerIndex3 != actionIndex2 ? pointerId2 : -1, iFindPointerIndex3);
                        this.w = motionEvent.getPointerId(iFindPointerIndex3);
                    }
                    this.y = false;
                    b(motionEvent);
                    float f2 = this.r;
                    float f3 = this.s;
                    float f4 = this.t;
                    float fA = a(motionEvent, iFindPointerIndex3);
                    float fB = b(motionEvent, iFindPointerIndex3);
                    float fA2 = a(motionEvent, actionIndex2);
                    float fB2 = b(motionEvent, actionIndex2);
                    boolean z2 = fA < f2 || fB < f2 || fA > f3 || fB > f4;
                    boolean z3 = fA2 < f2 || fB2 < f2 || fA2 > f3 || fB2 > f4;
                    if (z2 && z3) {
                        this.f = -1.0f;
                        this.g = -1.0f;
                        this.u = true;
                        return true;
                    }
                    if (z2) {
                        this.f = motionEvent.getX(actionIndex2);
                        this.g = motionEvent.getY(actionIndex2);
                        this.u = true;
                        return true;
                    }
                    if (z3) {
                        this.f = motionEvent.getX(iFindPointerIndex3);
                        this.g = motionEvent.getY(iFindPointerIndex3);
                        this.u = true;
                        return true;
                    }
                    this.u = false;
                    this.f2227c = this.f2226b.b(this);
                    return true;
                }
                if (action == 6 && this.u) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    int actionIndex3 = motionEvent.getActionIndex();
                    int pointerId3 = motionEvent.getPointerId(actionIndex3);
                    if (pointerCount2 > 2) {
                        int i9 = this.w;
                        if (pointerId3 == i9) {
                            int iA6 = a(motionEvent, this.x, actionIndex3);
                            if (iA6 >= 0) {
                                this.w = motionEvent.getPointerId(iA6);
                                return true;
                            }
                        } else if (pointerId3 == this.x && (iA3 = a(motionEvent, i9, actionIndex3)) >= 0) {
                            this.x = motionEvent.getPointerId(iA3);
                            return true;
                        }
                    } else {
                        int i10 = this.w;
                        if (pointerId3 == i10) {
                            i10 = this.x;
                        }
                        int iFindPointerIndex4 = motionEvent.findPointerIndex(i10);
                        if (iFindPointerIndex4 < 0) {
                            this.v = true;
                            if (this.f2227c) {
                                this.f2226b.c(this);
                            }
                            return false;
                        }
                        this.w = motionEvent.getPointerId(iFindPointerIndex4);
                        this.y = true;
                        this.x = -1;
                        this.f = motionEvent.getX(iFindPointerIndex4);
                        this.g = motionEvent.getY(iFindPointerIndex4);
                        return true;
                    }
                }
            } else if (this.u) {
                float f5 = this.r;
                float f6 = this.s;
                float f7 = this.t;
                int iFindPointerIndex5 = motionEvent.findPointerIndex(this.w);
                int iFindPointerIndex6 = motionEvent.findPointerIndex(this.x);
                float fA3 = a(motionEvent, iFindPointerIndex5);
                float fB3 = b(motionEvent, iFindPointerIndex5);
                float fA4 = a(motionEvent, iFindPointerIndex6);
                float fB4 = b(motionEvent, iFindPointerIndex6);
                boolean z4 = fA3 < f5 || fB3 < f5 || fA3 > f6 || fB3 > f7;
                boolean z5 = fA4 < f5 || fB4 < f5 || fA4 > f6 || fB4 > f7;
                if (z4 && (iA2 = a(motionEvent, this.x, iFindPointerIndex5)) >= 0) {
                    this.w = motionEvent.getPointerId(iA2);
                    a(motionEvent, iA2);
                    b(motionEvent, iA2);
                    z4 = false;
                    iFindPointerIndex5 = iA2;
                }
                if (z5 && (iA = a(motionEvent, this.w, iFindPointerIndex6)) >= 0) {
                    this.x = motionEvent.getPointerId(iA);
                    a(motionEvent, iA);
                    b(motionEvent, iA);
                    z5 = false;
                    iFindPointerIndex6 = iA;
                }
                if (z4 && z5) {
                    this.f = -1.0f;
                    this.g = -1.0f;
                    return true;
                }
                if (z4) {
                    this.f = motionEvent.getX(iFindPointerIndex6);
                    this.g = motionEvent.getY(iFindPointerIndex6);
                    return true;
                }
                if (z5) {
                    this.f = motionEvent.getX(iFindPointerIndex5);
                    this.g = motionEvent.getY(iFindPointerIndex5);
                    return true;
                }
                this.u = false;
                this.f2227c = this.f2226b.b(this);
                return true;
            }
        }
        return true;
    }

    private int a(MotionEvent motionEvent, int i, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i3 != i2 && i3 != iFindPointerIndex) {
                float f = this.r;
                float f2 = this.s;
                float f3 = this.t;
                float fA = a(motionEvent, i3);
                float fB = b(motionEvent, i3);
                if (fA >= f && fB >= f && fA <= f2 && fB <= f3) {
                    return i3;
                }
            }
        }
        return -1;
    }

    private static float a(MotionEvent motionEvent, int i) {
        if (i < 0) {
            return Float.MIN_VALUE;
        }
        if (i == 0) {
            return motionEvent.getRawX();
        }
        return motionEvent.getX(i) + (motionEvent.getRawX() - motionEvent.getX());
    }

    private static float b(MotionEvent motionEvent, int i) {
        if (i < 0) {
            return Float.MIN_VALUE;
        }
        if (i == 0) {
            return motionEvent.getRawY();
        }
        return motionEvent.getY(i) + (motionEvent.getRawY() - motionEvent.getY());
    }

    private void b(MotionEvent motionEvent) {
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
            if (this.f2227c) {
                this.f2226b.c(this);
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
        this.k = y4;
        this.f = x3 + (x4 * 0.5f);
        this.g = y3 + (y4 * 0.5f);
        this.q = motionEvent.getEventTime() - motionEvent3.getEventTime();
        this.o = motionEvent.getPressure(iFindPointerIndex3) + motionEvent.getPressure(iFindPointerIndex4);
        this.p = motionEvent3.getPressure(iFindPointerIndex) + motionEvent3.getPressure(iFindPointerIndex2);
    }

    private void j() {
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
        this.f2227c = false;
        this.w = -1;
        this.x = -1;
        this.v = false;
    }

    public final float b() {
        return this.f;
    }

    public final float c() {
        return this.g;
    }

    private float k() {
        if (this.l == -1.0f) {
            float f = this.j;
            float f2 = this.k;
            this.l = (float) Math.sqrt((f * f) + (f2 * f2));
        }
        return this.l;
    }

    public final float d() {
        return this.j;
    }

    public final float e() {
        return this.k;
    }

    private float l() {
        if (this.m == -1.0f) {
            float f = this.h;
            float f2 = this.i;
            this.m = (float) Math.sqrt((f * f) + (f2 * f2));
        }
        return this.m;
    }

    public final float f() {
        return this.h;
    }

    public final float g() {
        return this.i;
    }

    public final float h() {
        if (this.n == -1.0f) {
            this.n = k() / l();
        }
        return this.n;
    }

    public final long i() {
        return this.q;
    }
}
