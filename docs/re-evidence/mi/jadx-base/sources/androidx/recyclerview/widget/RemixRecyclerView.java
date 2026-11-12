package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import defpackage.ajg;
import defpackage.alb;
import defpackage.fii;
import defpackage.mfh;
import defpackage.o8g;
import defpackage.qc1;
import defpackage.zkb;
import miuix.animation.utils.VelocityMonitor;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes.dex */
abstract class RemixRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VelocityMonitor[] f2828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2829b;
    public boolean c;
    public boolean d;
    public long e;
    public final int f;

    public class a extends RecyclerView.c0 {
        public int h;
        public int i;
        public mfh j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Interpolator f2830k;
        public boolean l;
        public boolean m;
        public boolean n;
        public int o;
        public int p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2831r;
        public boolean s;
        public zkb t;

        public a() {
            super();
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f2830k = interpolator;
            this.l = false;
            this.m = false;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            this.f2831r = 0;
            this.s = false;
            this.j = new mfh(RemixRecyclerView.this.getContext(), interpolator);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v19 */
        /* JADX WARN: Type inference failed for: r13v20 */
        /* JADX WARN: Type inference failed for: r13v9 */
        @Override // androidx.recyclerview.widget.RecyclerView.c0
        public void b(int i, int i2) {
            RemixRecyclerView.this.setScrollState(2);
            this.i = 0;
            this.h = 0;
            Interpolator interpolator = this.f2830k;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f2830k = interpolator2;
                this.j = new mfh(RemixRecyclerView.this.getContext(), interpolator2);
            }
            int i3 = i != 0 ? -((int) RemixRecyclerView.this.f(0)) : i;
            int i4 = i2 != 0 ? -((int) RemixRecyclerView.this.f(1)) : i2;
            if (i3 != 0) {
                i = i3;
            }
            if (i4 != 0) {
                i2 = i4;
            }
            int iMax = Math.max(-RemixRecyclerView.this.f, Math.min(i, RemixRecyclerView.this.f));
            int iMax2 = Math.max(-RemixRecyclerView.this.f, Math.min(i2, RemixRecyclerView.this.f));
            boolean zCanScrollHorizontally = RemixRecyclerView.this.mLayout.canScrollHorizontally();
            ?? r13 = zCanScrollHorizontally;
            if (RemixRecyclerView.this.mLayout.canScrollVertically()) {
                r13 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            if (r13 == 2) {
                this.n = !RemixRecyclerView.this.canScrollVertically(iMax2 > 0 ? 1 : -1);
            } else if (r13 == 1) {
                this.n = !RemixRecyclerView.this.canScrollHorizontally(iMax > 0 ? 1 : -1);
            }
            this.j.c(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RemixRecyclerView.this.removeCallbacks(this);
            qc1.b(RemixRecyclerView.this, this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c0
        public void d() {
            if (this.l) {
                this.m = true;
            } else {
                c();
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005a  */
        @Override // androidx.recyclerview.widget.RecyclerView.c0
        public void e(int i, int i2, int i3, Interpolator interpolator) {
            boolean z;
            if (RemixRecyclerView.this.g()) {
                return;
            }
            if (i3 == Integer.MIN_VALUE) {
                h(i, i2, 0, 0);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.j.m() == 2 && !this.s) {
                this.p = (int) this.j.h();
                this.o = (int) this.j.g();
            }
            RecyclerView.y yVar = RemixRecyclerView.this.mLayout.mSmoothScroller;
            if (yVar instanceof n) {
                float f = ((n) yVar).mInterimTargetDx * 1.2f;
                float f2 = ((n) yVar).mInterimTargetDy * 1.2f;
                if (f == i && f2 == i2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.s = z;
            if (this.f2830k != interpolator) {
                this.f2830k = interpolator;
                this.j = new mfh(RemixRecyclerView.this.getContext(), interpolator);
            }
            this.i = 0;
            this.h = 0;
            RemixRecyclerView.this.setScrollState(2);
            this.j.x(0, 0, i, i2, this.o, this.p);
            d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c0
        public void f() {
            RemixRecyclerView.this.removeCallbacks(this);
            this.j.a();
        }

        public void g() {
        }

        public final int h(int i, int i2, int i3, int i4) {
            int iRound;
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int iSqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RemixRecyclerView remixRecyclerView = RemixRecyclerView.this;
            int width = z ? remixRecyclerView.getWidth() : remixRecyclerView.getHeight();
            int i5 = width / 2;
            float f = width;
            float f2 = i5;
            float fI = f2 + (i(Math.min(1.0f, (iSqrt2 * 1.0f) / f)) * f2);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fI / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        public final float i(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        public final zkb j() {
            if (this.t == null) {
                this.t = new zkb(RemixRecyclerView.this.getContext());
            }
            return this.t;
        }

        public void k() {
            this.i = 0;
            this.h = 0;
            this.j.s();
        }

        /* JADX WARN: Code duplicated, block: B:120:0x0222  */
        /* JADX WARN: Code duplicated, block: B:122:0x022a  */
        /* JADX WARN: Code duplicated, block: B:123:0x0234  */
        /* JADX WARN: Code duplicated, block: B:126:0x023f  */
        @Override // androidx.recyclerview.widget.RecyclerView.c0, java.lang.Runnable
        public void run() {
            int i;
            int i2;
            boolean z;
            boolean zCanScrollHorizontally;
            RemixRecyclerView remixRecyclerView = RemixRecyclerView.this;
            if (remixRecyclerView.mLayout == null) {
                f();
                return;
            }
            this.m = false;
            this.l = true;
            remixRecyclerView.consumePendingUpdateOperations();
            mfh mfhVar = this.j;
            if (mfhVar.b()) {
                int i3 = mfhVar.i();
                int iJ = mfhVar.j();
                if (this.j.m() == 1) {
                    this.o = (int) mfhVar.g();
                    this.p = (int) mfhVar.h();
                }
                if (!RemixRecyclerView.this.g()) {
                    this.q = (int) mfhVar.g();
                    this.f2831r = (int) mfhVar.h();
                }
                int i4 = i3 - this.h;
                int i5 = iJ - this.i;
                this.h = i3;
                this.i = iJ;
                int[] iArr = RemixRecyclerView.this.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (this.j.m() == 1) {
                    View viewFindViewById = RemixRecyclerView.this.getRootView().findViewById(R.id.content);
                    for (ViewParent parent = RemixRecyclerView.this.getParent(); parent != null && ((!(parent instanceof ajg) || !((ajg) parent).a(this.j.g(), this.j.h())) && (!(parent instanceof ViewGroup) || parent != viewFindViewById)); parent = parent.getParent()) {
                    }
                }
                RemixRecyclerView remixRecyclerView2 = RemixRecyclerView.this;
                if (remixRecyclerView2.dispatchNestedPreScroll(i4, i5, remixRecyclerView2.mReusableIntPair, null, 1)) {
                    int[] iArr2 = RemixRecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RemixRecyclerView.this.getOverScrollMode() != 2) {
                    RemixRecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RemixRecyclerView remixRecyclerView3 = RemixRecyclerView.this;
                if (remixRecyclerView3.mAdapter != null) {
                    int[] iArr3 = remixRecyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    remixRecyclerView3.scrollStep(i4, i5, iArr3);
                    RemixRecyclerView remixRecyclerView4 = RemixRecyclerView.this;
                    int[] iArr4 = remixRecyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i4 -= i2;
                    i5 -= i;
                    RecyclerView.y yVar = remixRecyclerView4.mLayout.mSmoothScroller;
                    if (yVar != null && !yVar.isPendingInitialRun() && yVar.isRunning()) {
                        int iC = RemixRecyclerView.this.mState.c();
                        if (iC == 0) {
                            yVar.stop();
                        } else if (yVar.getTargetPosition() >= iC) {
                            yVar.setTargetPosition(iC - 1);
                            yVar.onAnimation(i2, i);
                        } else {
                            yVar.onAnimation(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RemixRecyclerView.this.mItemDecorations.isEmpty()) {
                    RemixRecyclerView.this.invalidate();
                }
                RemixRecyclerView remixRecyclerView5 = RemixRecyclerView.this;
                int[] iArr5 = remixRecyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                remixRecyclerView5.dispatchNestedScroll(i2, i, i4, i5, null, 1, iArr5);
                RemixRecyclerView remixRecyclerView6 = RemixRecyclerView.this;
                int[] iArr6 = remixRecyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    remixRecyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!RemixRecyclerView.this.awakenScrollBars()) {
                    RemixRecyclerView.this.invalidate();
                }
                boolean z2 = mfhVar.p() || (((mfhVar.i() == mfhVar.k()) || i6 != 0) && ((mfhVar.j() == mfhVar.l()) || i7 != 0));
                RecyclerView.y yVar2 = RemixRecyclerView.this.mLayout.mSmoothScroller;
                if ((yVar2 == null || !yVar2.isPendingInitialRun()) && z2) {
                    if (RemixRecyclerView.this.getOverScrollMode() != 2) {
                        int iF = (int) mfhVar.f();
                        int i8 = i6 < 0 ? -iF : i6 > 0 ? iF : 0;
                        if (i7 < 0) {
                            iF = -iF;
                        } else if (i7 <= 0) {
                            iF = 0;
                        }
                        RemixRecyclerView.this.absorbGlows(i8, iF);
                    }
                    if (RemixRecyclerView.this.mLayout.canScrollVertically()) {
                        zCanScrollHorizontally = RemixRecyclerView.this.canScrollVertically(this.j.l() > this.j.o() ? 1 : -1);
                    } else {
                        if (RemixRecyclerView.this.mLayout.canScrollHorizontally()) {
                            zCanScrollHorizontally = RemixRecyclerView.this.canScrollHorizontally(this.j.k() > this.j.n() ? 1 : -1);
                        } else {
                            z = false;
                        }
                        if (!RemixRecyclerView.this.c && this.j.m() == 1 && !this.n && z) {
                            if (HapticCompat.c("2.0")) {
                                HapticCompat.performHapticFeedbackAsync(RemixRecyclerView.this, alb.q);
                            } else if (RemixRecyclerView.this.isHapticFeedbackEnabled()) {
                                j().e(201);
                            }
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                            RemixRecyclerView.this.mPrefetchRegistry.b();
                        }
                        g();
                    }
                    z = !zCanScrollHorizontally;
                    if (!RemixRecyclerView.this.c) {
                        if (HapticCompat.c("2.0")) {
                            HapticCompat.performHapticFeedbackAsync(RemixRecyclerView.this, alb.q);
                        } else if (RemixRecyclerView.this.isHapticFeedbackEnabled()) {
                            j().e(201);
                        }
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RemixRecyclerView.this.mPrefetchRegistry.b();
                    }
                    g();
                } else {
                    d();
                    RemixRecyclerView remixRecyclerView7 = RemixRecyclerView.this;
                    k kVar = remixRecyclerView7.mGapWorker;
                    if (kVar != null) {
                        kVar.f(remixRecyclerView7, i2, i);
                    }
                }
            }
            RecyclerView.y yVar3 = RemixRecyclerView.this.mLayout.mSmoothScroller;
            if (yVar3 != null && yVar3.isPendingInitialRun()) {
                yVar3.onAnimation(0, 0);
            }
            this.l = false;
            if (this.m) {
                c();
                return;
            }
            RemixRecyclerView.this.setScrollState(0);
            RemixRecyclerView.this.stopNestedScroll(1);
            this.p = 0;
            this.o = 0;
            this.f2831r = 0;
            this.q = 0;
        }
    }

    public RemixRecyclerView(Context context) {
        this(context, null);
    }

    public final void e(int i) {
        VelocityMonitor[] velocityMonitorArr = this.f2828a;
        if (velocityMonitorArr[i] == null) {
            velocityMonitorArr[i] = new VelocityMonitor();
        }
    }

    public float f(int i) {
        int i2 = this.f2829b;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = i2 % 5;
        e(i3);
        return this.f2828a[i3].getVelocity(i);
    }

    public boolean g() {
        return false;
    }

    public boolean getSpringEnabled() {
        boolean z = System.currentTimeMillis() - this.e > 10;
        if (this.c) {
            return !this.d || z;
        }
        return false;
    }

    public final void h(MotionEvent motionEvent, int i) {
        int pointerId = motionEvent.getPointerId(i) % 5;
        e(pointerId);
        this.f2828a[pointerId].clear();
    }

    public final void i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f2829b = motionEvent.getPointerId(0);
            h(motionEvent, actionIndex);
            j(motionEvent, actionIndex);
        } else if (actionMasked == 2) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                j(motionEvent, i);
            }
        } else {
            if (actionMasked != 5) {
                return;
            }
            this.f2829b = motionEvent.getPointerId(actionIndex);
            h(motionEvent, actionIndex);
            j(motionEvent, actionIndex);
        }
    }

    public final void j(MotionEvent motionEvent, int i) {
        int pointerId = motionEvent.getPointerId(i) % 5;
        e(pointerId);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2828a[pointerId].update(motionEvent.getRawX(i), motionEvent.getRawY(i));
        } else {
            this.f2828a[pointerId].update(motionEvent.getRawX(), motionEvent.getRawY());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean zA = o8g.a(motionEvent, 8194);
        this.d = zA;
        if (zA) {
            this.e = System.currentTimeMillis();
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zA = o8g.a(motionEvent, 8194);
        this.d = zA;
        if (zA) {
            this.e = System.currentTimeMillis();
        }
        i(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        if (i == 2) {
            this.c = false;
        }
    }

    public void setSpringEnabled(boolean z) {
        this.c = z;
    }

    public RemixRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fii.f17818a);
    }

    public RemixRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2828a = new VelocityMonitor[5];
        this.f2829b = -1;
        this.c = true;
        this.d = false;
        this.e = 0L;
        this.f = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
