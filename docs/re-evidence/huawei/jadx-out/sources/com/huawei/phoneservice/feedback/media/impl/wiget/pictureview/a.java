package com.huawei.phoneservice.feedback.media.impl.wiget.pictureview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes41.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VelocityTracker f21651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21652b;
    private final ScaleGestureDetector d;
    private float f;
    private float g;
    private boolean h;
    private final float i;
    private final c j;
    private int e = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21653c = 0;

    public boolean c(MotionEvent motionEvent) {
        try {
            this.d.onTouchEvent(motionEvent);
            return d(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public boolean c() {
        return this.d.isInProgress();
    }

    public boolean a() {
        return this.h;
    }

    private void f(MotionEvent motionEvent) {
        this.e = -1;
        if (this.h && this.f21651a != null) {
            this.f = b(motionEvent);
            this.g = a(motionEvent);
            this.f21651a.addMovement(motionEvent);
            this.f21651a.computeCurrentVelocity(1000);
            float xVelocity = this.f21651a.getXVelocity();
            float yVelocity = this.f21651a.getYVelocity();
            if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.i) {
                this.j.a(this.f, this.g, -xVelocity, -yVelocity);
            }
        }
        VelocityTracker velocityTracker = this.f21651a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21651a = null;
        }
    }

    private void i(MotionEvent motionEvent) {
        int iB = n.b(motionEvent.getAction());
        if (motionEvent.getPointerId(iB) == this.e) {
            int i = iB == 0 ? 1 : 0;
            this.e = motionEvent.getPointerId(i);
            this.f = motionEvent.getX(i);
            this.g = motionEvent.getY(i);
        }
    }

    private void h(MotionEvent motionEvent) {
        float fB = b(motionEvent);
        float fA = a(motionEvent);
        float f = fB - this.f;
        float f2 = fA - this.g;
        if (!this.h) {
            this.h = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f21652b);
        }
        if (this.h) {
            this.j.a(f, f2);
            this.f = fB;
            this.g = fA;
            VelocityTracker velocityTracker = this.f21651a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
    }

    private void e(MotionEvent motionEvent) {
        this.e = motionEvent.getPointerId(0);
        VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
        this.f21651a = velocityTrackerObtain;
        if (velocityTrackerObtain != null) {
            velocityTrackerObtain.addMovement(motionEvent);
        }
        this.f = b(motionEvent);
        this.g = a(motionEvent);
        this.h = false;
    }

    private boolean d(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            e(motionEvent);
        } else if (action == 1) {
            f(motionEvent);
        } else if (action == 2) {
            h(motionEvent);
        } else if (action == 3) {
            e();
        } else if (action != 6) {
            com.huawei.phoneservice.faq.base.util.g.c("GestureDetector", "processTouchEvent default!!!");
        } else {
            i(motionEvent);
        }
        int i = this.e;
        if (i == -1) {
            i = 0;
        }
        this.f21653c = motionEvent.findPointerIndex(i);
        return true;
    }

    private void e() {
        this.e = -1;
        VelocityTracker velocityTracker = this.f21651a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21651a = null;
        }
    }

    class e implements ScaleGestureDetector.OnScaleGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f21654b = 0.0f;
        private float d;

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            this.d = scaleGestureDetector.getFocusX();
            this.f21654b = scaleGestureDetector.getFocusY();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            a.this.j.a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getFocusX() - this.d, scaleGestureDetector.getFocusY() - this.f21654b);
            this.d = scaleGestureDetector.getFocusX();
            this.f21654b = scaleGestureDetector.getFocusY();
            return true;
        }

        e() {
        }
    }

    private float a(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f21653c);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    private float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f21653c);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    a(Context context, c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21652b = viewConfiguration.getScaledTouchSlop();
        this.j = cVar;
        this.d = new ScaleGestureDetector(context, new e());
    }
}
