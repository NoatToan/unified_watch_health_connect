package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class al {
    private final Context a;
    private final a b;
    private boolean c;
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
        boolean a(al alVar);

        boolean b(al alVar);

        void c(al alVar);
    }

    public al(Context context, a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.a = context;
        this.b = aVar;
        this.r = viewConfiguration.getScaledEdgeSlop();
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
        this.c = false;
        this.w = -1;
        this.x = -1;
        this.v = false;
    }

    public final MotionEvent a() {
        return this.e;
    }

    public final float c() {
        return this.g;
    }

    public final float d() {
        return this.j;
    }

    public final float e() {
        return this.k;
    }

    public final float f() {
        return this.h;
    }

    public final float g() {
        return this.i;
    }

    public final float h() {
        if (this.n == -1.0f) {
            if (this.l == -1.0f) {
                float f = this.j;
                float f2 = this.k;
                this.l = (float) Math.sqrt((f * f) + (f2 * f2));
            }
            float f3 = this.l;
            if (this.m == -1.0f) {
                float f4 = this.h;
                float f5 = this.i;
                this.m = (float) Math.sqrt((f4 * f4) + (f5 * f5));
            }
            this.n = f3 / this.m;
        }
        return this.n;
    }

    public final long i() {
        return this.q;
    }

    public final void a(int i, int i2) {
        this.z = i;
        this.A = i2;
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
        if (iFindPointerIndex >= 0 && iFindPointerIndex2 >= 0 && iFindPointerIndex3 >= 0 && iFindPointerIndex4 >= 0) {
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
            return;
        }
        this.v = true;
        if (this.c) {
            this.b.c(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02a4  */
    public final boolean a(MotionEvent motionEvent) {
        int iA;
        int iA2;
        int iFindPointerIndex;
        int iFindPointerIndex2;
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
        if (this.c) {
            if (action == 1) {
                j();
            } else if (action == 2) {
                b(motionEvent);
                if (this.o / this.p > 0.67f && this.b.a(this)) {
                    this.d.recycle();
                    this.d = MotionEvent.obtain(motionEvent);
                }
            } else if (action == 3) {
                this.b.c(this);
                j();
            } else if (action == 5) {
                this.b.c(this);
                int i2 = this.w;
                int i3 = this.x;
                j();
                this.d = MotionEvent.obtain(motionEvent);
                if (!this.y) {
                    i2 = i3;
                }
                this.w = i2;
                if (Build.VERSION.SDK_INT >= 8) {
                    this.x = motionEvent.getPointerId(motionEvent.getActionIndex());
                } else {
                    this.x = motionEvent.getPointerId(1);
                }
                this.y = false;
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.w);
                if (iFindPointerIndex3 < 0 || this.w == this.x) {
                    int i4 = this.w;
                    int i5 = this.x;
                    this.w = motionEvent.getPointerId(a(motionEvent, i4 != i5 ? i5 : -1, iFindPointerIndex3));
                }
                b(motionEvent);
                this.c = this.b.b(this);
            } else if (action == 6) {
                int pointerCount = motionEvent.getPointerCount();
                int actionIndex = Build.VERSION.SDK_INT >= 8 ? motionEvent.getActionIndex() : 0;
                int pointerId = motionEvent.getPointerId(actionIndex);
                if (pointerCount > 2) {
                    int i6 = this.w;
                    if (pointerId == i6) {
                        int iA4 = a(motionEvent, this.x, actionIndex);
                        if (iA4 >= 0) {
                            this.b.c(this);
                            this.w = motionEvent.getPointerId(iA4);
                            this.y = true;
                            this.d = MotionEvent.obtain(motionEvent);
                            b(motionEvent);
                            this.c = this.b.b(this);
                        } else {
                            z = true;
                        }
                    } else if (pointerId == this.x) {
                        int iA5 = a(motionEvent, i6, actionIndex);
                        if (iA5 >= 0) {
                            this.b.c(this);
                            this.x = motionEvent.getPointerId(iA5);
                            this.y = false;
                            this.d = MotionEvent.obtain(motionEvent);
                            b(motionEvent);
                            this.c = this.b.b(this);
                        } else {
                            z = true;
                        }
                    }
                    this.d.recycle();
                    this.d = MotionEvent.obtain(motionEvent);
                    b(motionEvent);
                } else {
                    z = true;
                }
                if (z) {
                    b(motionEvent);
                    int i7 = this.w;
                    if (pointerId == i7) {
                        i7 = this.x;
                    }
                    int iFindPointerIndex4 = motionEvent.findPointerIndex(i7);
                    this.f = motionEvent.getX(iFindPointerIndex4);
                    this.g = motionEvent.getY(iFindPointerIndex4);
                    this.b.c(this);
                    j();
                    this.w = i7;
                    this.y = true;
                }
            }
        } else if (action == 0) {
            this.w = motionEvent.getPointerId(0);
            this.y = true;
        } else if (action == 1) {
            j();
        } else if (action != 2) {
            if (action != 5) {
                if (action == 6 && this.u) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    int actionIndex2 = Build.VERSION.SDK_INT >= 8 ? motionEvent.getActionIndex() : 0;
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    if (pointerCount2 > 2) {
                        int i8 = this.w;
                        if (pointerId2 == i8) {
                            int iA6 = a(motionEvent, this.x, actionIndex2);
                            if (iA6 >= 0) {
                                this.w = motionEvent.getPointerId(iA6);
                            }
                        } else if (pointerId2 == this.x && (iA3 = a(motionEvent, i8, actionIndex2)) >= 0) {
                            this.x = motionEvent.getPointerId(iA3);
                        }
                    } else {
                        int i9 = this.w;
                        if (pointerId2 == i9) {
                            i9 = this.x;
                        }
                        int iFindPointerIndex5 = motionEvent.findPointerIndex(i9);
                        if (iFindPointerIndex5 < 0) {
                            this.v = true;
                            if (this.c) {
                                this.b.c(this);
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
            } else {
                int i10 = this.z;
                if (i10 != 0 && (i = this.A) != 0) {
                    float f = this.r;
                    this.s = i10 - f;
                    this.t = i - f;
                } else {
                    DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
                    float f2 = displayMetrics.widthPixels;
                    float f3 = this.r;
                    this.s = f2 - f3;
                    this.t = displayMetrics.heightPixels - f3;
                }
                MotionEvent motionEvent2 = this.d;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.d = MotionEvent.obtain(motionEvent);
                this.q = 0L;
                if (Build.VERSION.SDK_INT >= 8) {
                    iFindPointerIndex = motionEvent.getActionIndex();
                    iFindPointerIndex2 = motionEvent.findPointerIndex(this.w);
                    int pointerId3 = motionEvent.getPointerId(iFindPointerIndex);
                    this.x = pointerId3;
                    if (iFindPointerIndex2 < 0 || iFindPointerIndex2 == iFindPointerIndex) {
                        iFindPointerIndex2 = a(motionEvent, iFindPointerIndex2 != iFindPointerIndex ? pointerId3 : -1, iFindPointerIndex2);
                        this.w = motionEvent.getPointerId(iFindPointerIndex2);
                    }
                } else if (motionEvent.getPointerCount() > 0) {
                    iFindPointerIndex = motionEvent.findPointerIndex(1);
                    iFindPointerIndex2 = motionEvent.findPointerIndex(this.w);
                    this.x = motionEvent.getPointerId(iFindPointerIndex);
                } else {
                    iFindPointerIndex = 0;
                    iFindPointerIndex2 = 0;
                }
                this.y = false;
                b(motionEvent);
                float f4 = this.r;
                float f5 = this.s;
                float f6 = this.t;
                float fA = a(motionEvent, iFindPointerIndex2);
                float fB = b(motionEvent, iFindPointerIndex2);
                float fA2 = a(motionEvent, iFindPointerIndex);
                float fB2 = b(motionEvent, iFindPointerIndex);
                boolean z2 = fA < f4 || fB < f4 || fA > f5 || fB > f6;
                boolean z3 = fA2 < f4 || fB2 < f4 || fA2 > f5 || fB2 > f6;
                if (z2 && z3) {
                    this.f = -1.0f;
                    this.g = -1.0f;
                    this.u = true;
                } else if (z2) {
                    this.f = motionEvent.getX(iFindPointerIndex);
                    this.g = motionEvent.getY(iFindPointerIndex);
                    this.u = true;
                } else if (z3) {
                    this.f = motionEvent.getX(iFindPointerIndex2);
                    this.g = motionEvent.getY(iFindPointerIndex2);
                    this.u = true;
                } else {
                    this.u = false;
                    this.c = this.b.b(this);
                }
            }
        } else if (this.u) {
            float f7 = this.r;
            float f8 = this.s;
            float f9 = this.t;
            int iFindPointerIndex6 = motionEvent.findPointerIndex(this.w);
            int iFindPointerIndex7 = motionEvent.findPointerIndex(this.x);
            float fA3 = a(motionEvent, iFindPointerIndex6);
            float fB3 = b(motionEvent, iFindPointerIndex6);
            float fA4 = a(motionEvent, iFindPointerIndex7);
            float fB4 = b(motionEvent, iFindPointerIndex7);
            boolean z4 = fA3 < f7 || fB3 < f7 || fA3 > f8 || fB3 > f9;
            boolean z5 = fA4 < f7 || fB4 < f7 || fA4 > f8 || fB4 > f9;
            if (z4 && (iA2 = a(motionEvent, this.x, iFindPointerIndex6)) >= 0) {
                this.w = motionEvent.getPointerId(iA2);
                a(motionEvent, iA2);
                b(motionEvent, iA2);
                iFindPointerIndex6 = iA2;
                z4 = false;
            }
            if (z5 && (iA = a(motionEvent, this.w, iFindPointerIndex7)) >= 0) {
                this.x = motionEvent.getPointerId(iA);
                a(motionEvent, iA);
                b(motionEvent, iA);
                iFindPointerIndex7 = iA;
                z5 = false;
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
                this.c = this.b.b(this);
            }
        }
        return true;
    }

    public final float b() {
        return this.f;
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
}
