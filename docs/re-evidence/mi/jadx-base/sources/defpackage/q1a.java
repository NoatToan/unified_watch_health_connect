package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class q1a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30983b;
    public final int c;
    public final View d;
    public Runnable e;
    public Runnable f;
    public boolean g;
    public int h;
    public final int[] i = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = q1a.this.d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q1a.this.e();
        }
    }

    public q1a(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f30982a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f30983b = tapTimeout;
        this.c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    public final void a() {
        Runnable runnable = this.f;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            this.d.removeCallbacks(runnable2);
        }
    }

    public abstract hbm b();

    public abstract boolean c();

    public boolean d() {
        hbm hbmVarB = b();
        if (hbmVarB == null || !hbmVarB.isShowing()) {
            return true;
        }
        hbmVarB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.g = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        b67 b67Var;
        View view = this.d;
        hbm hbmVarB = b();
        if (hbmVarB == null || !hbmVarB.isShowing() || (b67Var = (b67) hbmVarB.m()) == null || !b67Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(b67Var, motionEventObtainNoHistory);
        boolean zE = b67Var.e(motionEventObtainNoHistory, this.h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final boolean g(MotionEvent motionEvent) {
        View view = this.d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = motionEvent.getPointerId(0);
            if (this.e == null) {
                this.e = new a();
            }
            view.postDelayed(this.e, this.f30983b);
            if (this.f == null) {
                this.f = new b();
            }
            view.postDelayed(this.f, this.c);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.h);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f30982a)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.g;
        if (z2) {
            z = f(motionEvent) || !d();
        } else {
            z = g(motionEvent) && c();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.h = -1;
        Runnable runnable = this.e;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
        }
    }
}
