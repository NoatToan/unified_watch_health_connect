package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public class j extends RecyclerView.n implements RecyclerView.r {
    public static final int[] D = {R.attr.state_pressed};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.s C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2923b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    public int f2924k;

    @VisibleForTesting
    public int l;

    @VisibleForTesting
    public float m;

    @VisibleForTesting
    public int n;

    @VisibleForTesting
    public int o;

    @VisibleForTesting
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2925r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.j(500);
        }
    }

    public class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            j.this.u(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2928a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2928a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2928a) {
                this.f2928a = false;
                return;
            }
            if (((Float) j.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                j jVar = j.this;
                jVar.A = 0;
                jVar.r(0);
            } else {
                j jVar2 = j.this;
                jVar2.A = 2;
                jVar2.o();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            j.this.c.setAlpha(iFloatValue);
            j.this.d.setAlpha(iFloatValue);
            j.this.o();
        }
    }

    public j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2922a = i2;
        this.f2923b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        c(recyclerView);
    }

    public void c(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            s();
        }
    }

    public final void d() {
        this.s.removeCallbacks(this.B);
    }

    public final void e() {
        this.s.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        d();
    }

    public final void f(Canvas canvas) {
        int i = this.f2925r;
        int i2 = this.i;
        int i3 = i - i2;
        int i4 = this.o;
        int i5 = this.n;
        int i6 = i4 - (i5 / 2);
        this.g.setBounds(0, 0, i5, i2);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, i3);
        this.h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    public final void g(Canvas canvas) {
        int i = this.q;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.l;
        int i5 = this.f2924k;
        int i6 = i4 - (i5 / 2);
        this.c.setBounds(0, 0, i2, i5);
        this.d.setBounds(0, 0, this.f, this.f2925r);
        if (!l()) {
            canvas.translate(i3, 0.0f);
            this.d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.c.draw(canvas);
            canvas.translate(-i3, -i6);
            return;
        }
        this.d.draw(canvas);
        canvas.translate(this.e, i6);
        canvas.scale(-1.0f, 1.0f);
        this.c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.e, -i6);
    }

    public final int[] h() {
        int[] iArr = this.y;
        int i = this.f2923b;
        iArr[0] = i;
        iArr[1] = this.q - i;
        return iArr;
    }

    public final int[] i() {
        int[] iArr = this.x;
        int i = this.f2923b;
        iArr[0] = i;
        iArr[1] = this.f2925r - i;
        return iArr;
    }

    @VisibleForTesting
    public void j(int i) {
        int i2 = this.A;
        if (i2 == 1) {
            this.z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration(i);
        this.z.start();
    }

    public final void k(float f) {
        int[] iArrH = h();
        float fMax = Math.max(iArrH[0], Math.min(iArrH[1], f));
        if (Math.abs(this.o - fMax) < 2.0f) {
            return;
        }
        int iQ = q(this.p, fMax, iArrH, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (iQ != 0) {
            this.s.scrollBy(iQ, 0);
        }
        this.p = fMax;
    }

    public final boolean l() {
        return androidx.core.view.c.A(this.s) == 1;
    }

    @VisibleForTesting
    public boolean m(float f, float f2) {
        if (f2 >= this.f2925r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public boolean n(float f, float f2) {
        if (!l() ? f >= this.q - this.e : f <= this.e) {
            int i = this.l;
            int i2 = this.f2924k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    public void o() {
        this.s.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.q != this.s.getWidth() || this.f2925r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.f2925r = this.s.getHeight();
            r(0);
        } else if (this.A != 0) {
            if (this.t) {
                g(canvas);
            }
            if (this.u) {
                f(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean zN = n(motionEvent.getX(), motionEvent.getY());
            boolean zM = m(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zN && !zM) {
                return false;
            }
            if (zM) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (zN) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            r(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zN = n(motionEvent.getX(), motionEvent.getY());
            boolean zM = m(motionEvent.getX(), motionEvent.getY());
            if (zN || zM) {
                if (zM) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (zN) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                r(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            r(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            t();
            if (this.w == 1) {
                k(motionEvent.getX());
            }
            if (this.w == 2) {
                v(motionEvent.getY());
            }
        }
    }

    public final void p(int i) {
        d();
        this.s.postDelayed(this.B, i);
    }

    public final int q(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public void r(int i) {
        if (i == 2 && this.v != 2) {
            this.c.setState(D);
            d();
        }
        if (i == 0) {
            o();
        } else {
            t();
        }
        if (this.v == 2 && i != 2) {
            this.c.setState(E);
            p(1200);
        } else if (i == 1) {
            p(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.v = i;
    }

    public final void s() {
        this.s.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(this.C);
    }

    public void t() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    public void u(int i, int i2) {
        int iComputeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i3 = this.f2925r;
        this.t = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.f2922a;
        int iComputeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i4 = this.q;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.f2922a;
        this.u = z;
        boolean z2 = this.t;
        if (!z2 && !z) {
            if (this.v != 0) {
                r(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.l = (int) ((f * (i2 + (f / 2.0f))) / iComputeVerticalScrollRange);
            this.f2924k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.u) {
            float f2 = i4;
            this.o = (int) ((f2 * (i + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            this.n = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.v;
        if (i5 == 0 || i5 == 1) {
            r(1);
        }
    }

    public final void v(float f) {
        int[] iArrI = i();
        float fMax = Math.max(iArrI[0], Math.min(iArrI[1], f));
        if (Math.abs(this.l - fMax) < 2.0f) {
            return;
        }
        int iQ = q(this.m, fMax, iArrI, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.f2925r);
        if (iQ != 0) {
            this.s.scrollBy(0, iQ);
        }
        this.m = fMax;
    }
}
