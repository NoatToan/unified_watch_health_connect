package com.xmlywind.sdk.base.common;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.xmlywind.sdk.base.models.BaseAdUnit;

/* JADX INFO: loaded from: classes22.dex */
public class b extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    private final BaseAdUnit b;
    private float c;
    private float d;
    private boolean e;
    private boolean f;
    private int g;
    private float h;
    private a i = a.UNSET;
    private View j;

    /* JADX INFO: renamed from: com.xmlywind.sdk.base.common.b$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.UNSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.GOING_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.GOING_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum a {
        UNSET,
        GOING_RIGHT,
        GOING_LEFT,
        FINISHED,
        FAILED
    }

    public b(View view, BaseAdUnit baseAdUnit) {
        this.c = 100.0f;
        if (view != null && view.getWidth() > 0) {
            this.c = Math.min(100.0f, view.getWidth() / 3.0f);
        }
        this.a = false;
        this.j = view;
        this.b = baseAdUnit;
    }

    private void a(float f) {
        if (f > this.h) {
            this.i = a.GOING_RIGHT;
        }
    }

    private boolean a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent != null && motionEvent2 != null) {
            if (Math.abs(motionEvent2.getY() - motionEvent.getY()) > 100.0f) {
                return true;
            }
        }
        return false;
    }

    private void b(float f) {
        if (d(f) && g(f)) {
            this.i = a.GOING_LEFT;
            this.h = f;
        }
    }

    private void c() {
        int i = this.g + 1;
        this.g = i;
        if (i >= 4) {
            this.i = a.FINISHED;
        }
    }

    private void c(float f) {
        if (e(f) && f(f)) {
            this.i = a.GOING_RIGHT;
            this.h = f;
        }
    }

    private boolean d(float f) {
        if (!this.f) {
            if (f < this.h + this.c) {
                return false;
            }
            this.e = false;
            this.f = true;
        }
        return true;
    }

    private boolean e(float f) {
        if (!this.e) {
            if (f > this.h - this.c) {
                return false;
            }
            this.f = false;
            this.e = true;
            c();
        }
        return true;
    }

    private boolean f(float f) {
        return f > this.d;
    }

    private boolean g(float f) {
        return f < this.d;
    }

    public void a() {
        a aVar = a.FINISHED;
        b();
    }

    public void b() {
        this.g = 0;
        this.i = a.UNSET;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.i != a.FINISHED) {
            if (a(motionEvent, motionEvent2)) {
                this.i = a.FAILED;
            } else {
                int i = AnonymousClass1.a[this.i.ordinal()];
                if (i == 1) {
                    this.h = motionEvent.getX();
                    a(motionEvent2.getX());
                } else if (i == 2) {
                    b(motionEvent2.getX());
                } else if (i == 3) {
                    c(motionEvent2.getX());
                }
                this.d = motionEvent2.getX();
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a = true;
        return super.onSingleTapUp(motionEvent);
    }
}
