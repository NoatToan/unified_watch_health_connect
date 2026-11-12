package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f5101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f5102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f5103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f5106i = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = f0.this.f5101d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0 f0Var = f0.this;
            f0Var.a();
            View view2 = f0Var.f5101d;
            if (view2.isEnabled() && !view2.isLongClickable() && f0Var.c()) {
                view2.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                f0Var.f5104g = true;
            }
        }
    }

    public f0(View view2) {
        this.f5101d = view2;
        view2.setLongClickable(true);
        view2.addOnAttachStateChangeListener(this);
        this.f5098a = ViewConfiguration.get(view2.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f5099b = tapTimeout;
        this.f5100c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f5103f;
        View view2 = this.f5101d;
        if (bVar != null) {
            view2.removeCallbacks(bVar);
        }
        a aVar = this.f5102e;
        if (aVar != null) {
            view2.removeCallbacks(aVar);
        }
    }

    public abstract androidx.appcompat.view.menu.q b();

    public boolean c() {
        androidx.appcompat.view.menu.q qVarB = b();
        if (qVarB == null || qVarB.a()) {
            return true;
        }
        qVarB.show();
        return true;
    }

    public boolean d() {
        androidx.appcompat.view.menu.q qVarB = b();
        if (qVarB == null || !qVarB.a()) {
            return true;
        }
        qVarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view2, MotionEvent motionEvent) {
        boolean z14;
        d0 d0VarE;
        boolean z15 = this.f5104g;
        View view3 = this.f5101d;
        if (z15) {
            androidx.appcompat.view.menu.q qVarB = b();
            if (qVarB != null && qVarB.a() && (d0VarE = qVarB.e()) != null && d0VarE.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f5106i;
                view3.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                d0VarE.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = d0VarE.b(motionEventObtainNoHistory, this.f5105h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z16 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z16) {
                    z14 = true;
                } else if (d()) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else if (d()) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            if (view3.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f5105h = motionEvent.getPointerId(0);
                    if (this.f5102e == null) {
                        this.f5102e = new a();
                    }
                    view3.postDelayed(this.f5102e, this.f5099b);
                    if (this.f5103f == null) {
                        this.f5103f = new b();
                    }
                    view3.postDelayed(this.f5103f, this.f5100c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f5105h);
                    if (iFindPointerIndex >= 0) {
                        float x14 = motionEvent.getX(iFindPointerIndex);
                        float y14 = motionEvent.getY(iFindPointerIndex);
                        float f14 = this.f5098a;
                        float f15 = -f14;
                        if (x14 < f15 || y14 < f15 || x14 >= (view3.getRight() - view3.getLeft()) + f14 || y14 >= (view3.getBottom() - view3.getTop()) + f14) {
                            a();
                            view3.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z14 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z14 = false;
            } else {
                z14 = false;
            }
            if (z14) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view3.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f5104g = z14;
        return z14 || z15;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        this.f5104g = false;
        this.f5105h = -1;
        a aVar = this.f5102e;
        if (aVar != null) {
            this.f5101d.removeCallbacks(aVar);
        }
    }
}
