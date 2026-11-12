package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class s extends RecyclerView.o implements RecyclerView.r {
    public Rect A;
    public long B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f10640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f10641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10643k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f10645m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10647o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f10650r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f10652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f10653u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f10654v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.core.view.m f10656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f10657y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10633a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f10634b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.f0 f10635c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10644l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10646n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f10648p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f10651s = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f10655w = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f10658z = new b();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007b  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
        @Override // java.lang.Runnable
        public final void run() {
            int iH;
            int iH2;
            s sVar = s.this;
            if (sVar.f10635c != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j8 = sVar.B;
                long j14 = j8 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j8;
                RecyclerView.p layoutManager = sVar.f10650r.getLayoutManager();
                if (sVar.A == null) {
                    sVar.A = new Rect();
                }
                layoutManager.calculateItemDecorationsForChild(sVar.f10635c.itemView, sVar.A);
                if (layoutManager.canScrollHorizontally()) {
                    int i14 = (int) (sVar.f10642j + sVar.f10640h);
                    int paddingLeft = (i14 - sVar.A.left) - sVar.f10650r.getPaddingLeft();
                    float f14 = sVar.f10640h;
                    if ((f14 >= 0.0f || paddingLeft >= 0) && (f14 <= 0.0f || (paddingLeft = ((sVar.f10635c.itemView.getWidth() + i14) + sVar.A.right) - (sVar.f10650r.getWidth() - sVar.f10650r.getPaddingRight())) <= 0)) {
                        iH = 0;
                    } else {
                        iH = paddingLeft;
                    }
                } else {
                    iH = 0;
                }
                if (layoutManager.canScrollVertically()) {
                    int i15 = (int) (sVar.f10643k + sVar.f10641i);
                    iH2 = (i15 - sVar.A.top) - sVar.f10650r.getPaddingTop();
                    float f15 = sVar.f10641i;
                    if ((f15 >= 0.0f || iH2 >= 0) && (f15 <= 0.0f || (iH2 = ((sVar.f10635c.itemView.getHeight() + i15) + sVar.A.bottom) - (sVar.f10650r.getHeight() - sVar.f10650r.getPaddingBottom())) <= 0)) {
                        iH2 = 0;
                    }
                } else {
                    iH2 = 0;
                }
                if (iH != 0) {
                    d dVar = sVar.f10645m;
                    RecyclerView recyclerView = sVar.f10650r;
                    int width = sVar.f10635c.itemView.getWidth();
                    sVar.f10650r.getWidth();
                    iH = dVar.h(recyclerView, width, iH, j14);
                }
                int i16 = iH;
                if (iH2 != 0) {
                    d dVar2 = sVar.f10645m;
                    RecyclerView recyclerView2 = sVar.f10650r;
                    int height = sVar.f10635c.itemView.getHeight();
                    sVar.f10650r.getHeight();
                    iH2 = dVar2.h(recyclerView2, height, iH2, j14);
                }
                if (i16 == 0 && iH2 == 0) {
                    sVar.B = Long.MIN_VALUE;
                    return;
                }
                if (sVar.B == Long.MIN_VALUE) {
                    sVar.B = jCurrentTimeMillis;
                }
                sVar.f10650r.scrollBy(i16, iH2);
                RecyclerView.f0 f0Var = sVar.f10635c;
                if (f0Var != null) {
                    sVar.m(f0Var);
                }
                sVar.f10650r.removeCallbacks(sVar.f10651s);
                RecyclerView recyclerView3 = sVar.f10650r;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                recyclerView3.postOnAnimation(this);
            }
        }
    }

    public class b implements RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void b(boolean z14) {
            if (z14) {
                s.this.n(0, null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final boolean c(MotionEvent motionEvent) {
            int iFindPointerIndex;
            s sVar = s.this;
            sVar.f10656x.f6501a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                sVar.f10644l = motionEvent.getPointerId(0);
                sVar.f10636d = motionEvent.getX();
                sVar.f10637e = motionEvent.getY();
                VelocityTracker velocityTracker = sVar.f10652t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                sVar.f10652t = VelocityTracker.obtain();
                if (sVar.f10635c == null) {
                    ArrayList arrayList = sVar.f10648p;
                    if (!arrayList.isEmpty()) {
                        View viewJ = sVar.j(motionEvent);
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.f10673e.itemView == viewJ) {
                                fVar = fVar2;
                                break;
                            }
                        }
                    }
                    if (fVar != null) {
                        RecyclerView.f0 f0Var = fVar.f10673e;
                        sVar.f10636d -= fVar.f10677i;
                        sVar.f10637e -= fVar.f10678j;
                        sVar.i(f0Var, true);
                        if (sVar.f10633a.remove(f0Var.itemView)) {
                            sVar.f10645m.b(sVar.f10650r, f0Var);
                        }
                        sVar.n(fVar.f10674f, f0Var);
                        sVar.p(sVar.f10647o, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                sVar.f10644l = -1;
                sVar.n(0, null);
            } else {
                int i14 = sVar.f10644l;
                if (i14 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i14)) >= 0) {
                    sVar.g(actionMasked, iFindPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = sVar.f10652t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return sVar.f10635c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onTouchEvent(MotionEvent motionEvent) {
            s sVar = s.this;
            androidx.core.view.m mVar = sVar.f10656x;
            a aVar = sVar.f10651s;
            mVar.f6501a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = sVar.f10652t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (sVar.f10644l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(sVar.f10644l);
            if (iFindPointerIndex >= 0) {
                sVar.g(actionMasked, iFindPointerIndex, motionEvent);
            }
            RecyclerView.f0 f0Var = sVar.f10635c;
            if (f0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        sVar.p(sVar.f10647o, iFindPointerIndex, motionEvent);
                        sVar.m(f0Var);
                        sVar.f10650r.removeCallbacks(aVar);
                        aVar.run();
                        sVar.f10650r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == sVar.f10644l) {
                        sVar.f10644l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        sVar.p(sVar.f10647o, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = sVar.f10652t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            sVar.n(0, null);
            sVar.f10644l = -1;
        }
    }

    public class c extends f {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f10661n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f10662o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.f0 f0Var, int i14, int i15, float f14, float f15, float f16, float f17, int i16, RecyclerView.f0 f0Var2) {
            super(f0Var, i14, i15, f14, f15, f16, f17);
            this.f10661n = i16;
            this.f10662o = f0Var2;
        }

        @Override // androidx.recyclerview.widget.s.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f10679k) {
                return;
            }
            int i14 = this.f10661n;
            RecyclerView.f0 f0Var = this.f10662o;
            s sVar = s.this;
            if (i14 <= 0) {
                sVar.f10645m.b(sVar.f10650r, f0Var);
            } else {
                sVar.f10633a.add(f0Var.itemView);
                this.f10676h = true;
                if (i14 > 0) {
                    sVar.f10650r.post(new t(sVar, this, i14));
                }
            }
            View view2 = sVar.f10655w;
            View view3 = f0Var.itemView;
            if (view2 == view3 && view3 == view2) {
                sVar.f10655w = null;
            }
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10664b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f10665c = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10666a = -1;

        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f14) {
                return f14 * f14 * f14 * f14 * f14;
            }
        }

        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f14) {
                float f15 = f14 - 1.0f;
                return (f15 * f15 * f15 * f15 * f15) + 1.0f;
            }
        }

        public static int c(int i14, int i15) {
            int i16;
            int i17 = i14 & 3158064;
            if (i17 == 0) {
                return i14;
            }
            int i18 = i14 & (~i17);
            if (i15 == 0) {
                i16 = i17 >> 2;
            } else {
                int i19 = i17 >> 1;
                i18 |= (-3158065) & i19;
                i16 = (i19 & 3158064) >> 2;
            }
            return i18 | i16;
        }

        public static int d(int i14, int i15) {
            int i16;
            int i17 = i14 & 789516;
            if (i17 == 0) {
                return i14;
            }
            int i18 = i14 & (~i17);
            if (i15 == 0) {
                i16 = i17 << 2;
            } else {
                int i19 = i17 << 1;
                i18 |= (-789517) & i19;
                i16 = (i19 & 789516) << 2;
            }
            return i18 | i16;
        }

        public static int k(int i14, int i15) {
            int i16 = i15 | i14;
            return (i14 << 16) | (i15 << 8) | i16;
        }

        public boolean a(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            return true;
        }

        public void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            u uVar = u.f10688a;
            View view2 = f0Var.itemView;
            uVar.getClass();
            Object tag = view2.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.setElevation(fFloatValue);
            }
            view2.setTag(R.id.item_touch_helper_previous_elevation, null);
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
        }

        public int e() {
            return 0;
        }

        public float f(RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public abstract int g(RecyclerView recyclerView, RecyclerView.f0 f0Var);

        public int h(RecyclerView recyclerView, int i14, int i15, long j8) {
            if (this.f10666a == -1) {
                this.f10666a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (f10664b.getInterpolation(j8 <= 2000 ? j8 / 2000.0f : 1.0f) * ((int) (f10665c.getInterpolation(Math.min(1.0f, (Math.abs(i15) * 1.0f) / i14)) * ((int) Math.signum(i15)) * this.f10666a)));
            if (interpolation == 0) {
                return i15 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public boolean i() {
            return !(this instanceof com.garmin.android.apps.connectmobile.connectiq.t);
        }

        public boolean j() {
            return !(this instanceof com.garmin.android.apps.connectmobile.connectiq.t);
        }

        public void l(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, float f14, float f15, int i14, boolean z14) {
            u uVar = u.f10688a;
            View view2 = f0Var.itemView;
            uVar.getClass();
            if (z14 && view2.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                Float fValueOf = Float.valueOf(view2.getElevation());
                int childCount = recyclerView.getChildCount();
                float f16 = 0.0f;
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != view2) {
                        WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                        float elevation = childAt.getElevation();
                        if (elevation > f16) {
                            f16 = elevation;
                        }
                    }
                }
                view2.setElevation(f16 + 1.0f);
                view2.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view2.setTranslationX(f14);
            view2.setTranslationY(f15);
        }

        public abstract boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2);

        public void n(int i14, RecyclerView.f0 f0Var) {
            if (f0Var != null) {
                u.f10688a.getClass();
            }
        }

        public abstract void o(int i14, RecyclerView.f0 f0Var);
    }

    public class e extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10667a = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            RecyclerView.f0 childViewHolder;
            if (this.f10667a) {
                s sVar = s.this;
                View viewJ = sVar.j(motionEvent);
                d dVar = sVar.f10645m;
                if (viewJ == null || (childViewHolder = sVar.f10650r.getChildViewHolder(viewJ)) == null) {
                    return;
                }
                RecyclerView recyclerView = sVar.f10650r;
                int iG = dVar.g(recyclerView, childViewHolder);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                if ((d.c(iG, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i14 = sVar.f10644l;
                    if (pointerId == i14) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i14);
                        float x14 = motionEvent.getX(iFindPointerIndex);
                        float y14 = motionEvent.getY(iFindPointerIndex);
                        sVar.f10636d = x14;
                        sVar.f10637e = y14;
                        sVar.f10641i = 0.0f;
                        sVar.f10640h = 0.0f;
                        if (dVar.j()) {
                            sVar.n(2, childViewHolder);
                        }
                    }
                }
            }
        }
    }

    public static class f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f10669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f10670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final RecyclerView.f0 f10673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f10674f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ValueAnimator f10675g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f10676h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f10677i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f10678j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f10679k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f10680l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f10681m;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.f10681m = valueAnimator.getAnimatedFraction();
            }
        }

        public f(RecyclerView.f0 f0Var, int i14, int i15, float f14, float f15, float f16, float f17) {
            this.f10674f = i15;
            this.f10673e = f0Var;
            this.f10669a = f14;
            this.f10670b = f15;
            this.f10671c = f16;
            this.f10672d = f17;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f10675g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(f0Var.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.f10681m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f10681m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f10680l) {
                this.f10673e.setIsRecyclable(true);
            }
            this.f10680l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class g extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10684e;

        public g(int i14, int i15) {
            this.f10683d = i15;
            this.f10684e = i14;
        }

        @Override // androidx.recyclerview.widget.s.d
        public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return d.k(p(recyclerView, f0Var), this.f10683d);
        }

        public int p(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return this.f10684e;
        }
    }

    public interface h {
        void prepareForDrop(View view2, View view3, int i14, int i15);
    }

    public s(d dVar) {
        this.f10645m = dVar;
    }

    public static boolean l(View view2, float f14, float f15, float f16, float f17) {
        return f14 >= f16 && f14 <= f16 + ((float) view2.getWidth()) && f15 >= f17 && f15 <= f17 + ((float) view2.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(View view2) {
        if (view2 == this.f10655w) {
            this.f10655w = null;
        }
        RecyclerView.f0 childViewHolder = this.f10650r.getChildViewHolder(view2);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.f0 f0Var = this.f10635c;
        if (f0Var != null && childViewHolder == f0Var) {
            n(0, null);
            return;
        }
        i(childViewHolder, false);
        if (this.f10633a.remove(childViewHolder.itemView)) {
            this.f10645m.b(this.f10650r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void d(View view2) {
    }

    public final void e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10650r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.f10658z;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f10650r.removeOnItemTouchListener(bVar);
            this.f10650r.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f10648p;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList.get(0);
                fVar.f10675g.cancel();
                this.f10645m.b(this.f10650r, fVar.f10673e);
            }
            arrayList.clear();
            this.f10655w = null;
            VelocityTracker velocityTracker = this.f10652t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10652t = null;
            }
            e eVar = this.f10657y;
            if (eVar != null) {
                eVar.f10667a = false;
                this.f10657y = null;
            }
            if (this.f10656x != null) {
                this.f10656x = null;
            }
        }
        this.f10650r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f10638f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f10639g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f10649q = ViewConfiguration.get(this.f10650r.getContext()).getScaledTouchSlop();
            this.f10650r.addItemDecoration(this);
            this.f10650r.addOnItemTouchListener(bVar);
            this.f10650r.addOnChildAttachStateChangeListener(this);
            this.f10657y = new e();
            this.f10656x = new androidx.core.view.m(this.f10650r.getContext(), this.f10657y);
        }
    }

    public final int f(int i14) {
        if ((i14 & 12) == 0) {
            return 0;
        }
        int i15 = this.f10640h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f10652t;
        d dVar = this.f10645m;
        if (velocityTracker != null && this.f10644l > -1) {
            float f14 = this.f10639g;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f14);
            float xVelocity = this.f10652t.getXVelocity(this.f10644l);
            float yVelocity = this.f10652t.getYVelocity(this.f10644l);
            int i16 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i16 & i14) != 0 && i15 == i16 && fAbs >= this.f10638f && fAbs > Math.abs(yVelocity)) {
                return i16;
            }
        }
        float width = this.f10650r.getWidth();
        dVar.getClass();
        float f15 = width * 0.5f;
        if ((i14 & i15) == 0 || Math.abs(this.f10640h) <= f15) {
            return 0;
        }
        return i15;
    }

    public final void g(int i14, int i15, MotionEvent motionEvent) {
        View viewJ;
        if (this.f10635c == null && i14 == 2 && this.f10646n != 2) {
            d dVar = this.f10645m;
            if (dVar.i() && this.f10650r.getScrollState() != 1) {
                RecyclerView.p layoutManager = this.f10650r.getLayoutManager();
                int i16 = this.f10644l;
                RecyclerView.f0 childViewHolder = null;
                if (i16 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i16);
                    float x14 = motionEvent.getX(iFindPointerIndex) - this.f10636d;
                    float y14 = motionEvent.getY(iFindPointerIndex) - this.f10637e;
                    float fAbs = Math.abs(x14);
                    float fAbs2 = Math.abs(y14);
                    float f14 = this.f10649q;
                    if ((fAbs >= f14 || fAbs2 >= f14) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewJ = j(motionEvent)) != null))) {
                        childViewHolder = this.f10650r.getChildViewHolder(viewJ);
                    }
                }
                if (childViewHolder == null) {
                    return;
                }
                RecyclerView recyclerView = this.f10650r;
                int iG = dVar.g(recyclerView, childViewHolder);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                int iC = (d.c(iG, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (iC == 0) {
                    return;
                }
                float x15 = motionEvent.getX(i15);
                float y15 = motionEvent.getY(i15);
                float f15 = x15 - this.f10636d;
                float f16 = y15 - this.f10637e;
                float fAbs3 = Math.abs(f15);
                float fAbs4 = Math.abs(f16);
                float f17 = this.f10649q;
                if (fAbs3 >= f17 || fAbs4 >= f17) {
                    if (fAbs3 > fAbs4) {
                        if (f15 < 0.0f && (iC & 4) == 0) {
                            return;
                        }
                        if (f15 > 0.0f && (iC & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f16 < 0.0f && (iC & 1) == 0) {
                            return;
                        }
                        if (f16 > 0.0f && (iC & 2) == 0) {
                            return;
                        }
                    }
                    this.f10641i = 0.0f;
                    this.f10640h = 0.0f;
                    this.f10644l = motionEvent.getPointerId(0);
                    n(1, childViewHolder);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.setEmpty();
    }

    public final int h(int i14) {
        if ((i14 & 3) == 0) {
            return 0;
        }
        int i15 = this.f10641i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f10652t;
        d dVar = this.f10645m;
        if (velocityTracker != null && this.f10644l > -1) {
            float f14 = this.f10639g;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f14);
            float xVelocity = this.f10652t.getXVelocity(this.f10644l);
            float yVelocity = this.f10652t.getYVelocity(this.f10644l);
            int i16 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i16 & i14) != 0 && i16 == i15 && fAbs >= this.f10638f && fAbs > Math.abs(xVelocity)) {
                return i16;
            }
        }
        float height = this.f10650r.getHeight();
        dVar.getClass();
        float f15 = height * 0.5f;
        if ((i14 & i15) == 0 || Math.abs(this.f10641i) <= f15) {
            return 0;
        }
        return i15;
    }

    public final void i(RecyclerView.f0 f0Var, boolean z14) {
        ArrayList arrayList = this.f10648p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (fVar.f10673e == f0Var) {
                fVar.f10679k |= z14;
                if (!fVar.f10680l) {
                    fVar.f10675g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View j(MotionEvent motionEvent) {
        float x14 = motionEvent.getX();
        float y14 = motionEvent.getY();
        RecyclerView.f0 f0Var = this.f10635c;
        if (f0Var != null) {
            View view2 = f0Var.itemView;
            if (l(view2, x14, y14, this.f10642j + this.f10640h, this.f10643k + this.f10641i)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f10648p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            View view3 = fVar.f10673e.itemView;
            if (l(view3, x14, y14, fVar.f10677i, fVar.f10678j)) {
                return view3;
            }
        }
        return this.f10650r.findChildViewUnder(x14, y14);
    }

    public final void k(float[] fArr) {
        if ((this.f10647o & 12) != 0) {
            fArr[0] = (this.f10642j + this.f10640h) - this.f10635c.itemView.getLeft();
        } else {
            fArr[0] = this.f10635c.itemView.getTranslationX();
        }
        if ((this.f10647o & 3) != 0) {
            fArr[1] = (this.f10643k + this.f10641i) - this.f10635c.itemView.getTop();
        } else {
            fArr[1] = this.f10635c.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(RecyclerView.f0 f0Var) {
        ArrayList arrayList;
        int i14;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i15;
        if (this.f10650r.isLayoutRequested()) {
            return;
        }
        char c14 = 2;
        if (this.f10646n != 2) {
            return;
        }
        d dVar = this.f10645m;
        float f14 = dVar.f(f0Var);
        int i16 = (int) (this.f10642j + this.f10640h);
        int i17 = (int) (this.f10643k + this.f10641i);
        if (Math.abs(i17 - f0Var.itemView.getTop()) >= f0Var.itemView.getHeight() * f14 || Math.abs(i16 - f0Var.itemView.getLeft()) >= f0Var.itemView.getWidth() * f14) {
            ArrayList arrayList2 = this.f10653u;
            if (arrayList2 == null) {
                this.f10653u = new ArrayList();
                this.f10654v = new ArrayList();
            } else {
                arrayList2.clear();
                this.f10654v.clear();
            }
            int iE = dVar.e();
            int iRound = Math.round(this.f10642j + this.f10640h) - iE;
            int iRound2 = Math.round(this.f10643k + this.f10641i) - iE;
            int i18 = iE * 2;
            int width = f0Var.itemView.getWidth() + iRound + i18;
            int height = f0Var.itemView.getHeight() + iRound2 + i18;
            int i19 = (iRound + width) / 2;
            int i24 = (iRound2 + height) / 2;
            RecyclerView.p layoutManager = this.f10650r.getLayoutManager();
            int childCount = layoutManager.getChildCount();
            int i25 = 0;
            while (i25 < childCount) {
                char c15 = c14;
                View childAt = layoutManager.getChildAt(i25);
                if (childAt != f0Var.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                    RecyclerView.f0 childViewHolder = this.f10650r.getChildViewHolder(childAt);
                    i15 = i19;
                    if (dVar.a(this.f10650r, this.f10635c, childViewHolder)) {
                        int iAbs5 = Math.abs(i15 - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int iAbs6 = Math.abs(i24 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i26 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                        int size = this.f10653u.size();
                        int i27 = 0;
                        int i28 = 0;
                        while (i27 < size) {
                            int i29 = size;
                            if (i26 <= ((Integer) this.f10654v.get(i27)).intValue()) {
                                break;
                            }
                            i28++;
                            i27++;
                            size = i29;
                        }
                        this.f10653u.add(i28, childViewHolder);
                        this.f10654v.add(i28, Integer.valueOf(i26));
                    }
                    i25++;
                    c14 = c15;
                    iRound = iRound;
                    i19 = i15;
                    iRound2 = iRound2;
                } else {
                    i15 = i19;
                }
                i25++;
                c14 = c15;
                iRound = iRound;
                i19 = i15;
                iRound2 = iRound2;
            }
            ArrayList arrayList3 = this.f10653u;
            if (arrayList3.size() == 0) {
                return;
            }
            int width2 = f0Var.itemView.getWidth() + i16;
            int height2 = f0Var.itemView.getHeight() + i17;
            int left2 = i16 - f0Var.itemView.getLeft();
            int top2 = i17 - f0Var.itemView.getTop();
            int size2 = arrayList3.size();
            RecyclerView.f0 f0Var2 = null;
            int i30 = -1;
            int i34 = 0;
            while (i34 < size2) {
                RecyclerView.f0 f0Var3 = (RecyclerView.f0) arrayList3.get(i34);
                if (left2 <= 0 || (right = f0Var3.itemView.getRight() - width2) >= 0) {
                    arrayList = arrayList3;
                    i14 = width2;
                } else {
                    arrayList = arrayList3;
                    i14 = width2;
                    if (f0Var3.itemView.getRight() > f0Var.itemView.getRight() && (iAbs4 = Math.abs(right)) > i30) {
                        i30 = iAbs4;
                        f0Var2 = f0Var3;
                    }
                }
                if (left2 < 0 && (left = f0Var3.itemView.getLeft() - i16) > 0 && f0Var3.itemView.getLeft() < f0Var.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i30) {
                    i30 = iAbs3;
                    f0Var2 = f0Var3;
                }
                if (top2 < 0 && (top = f0Var3.itemView.getTop() - i17) > 0 && f0Var3.itemView.getTop() < f0Var.itemView.getTop() && (iAbs2 = Math.abs(top)) > i30) {
                    i30 = iAbs2;
                    f0Var2 = f0Var3;
                }
                if (top2 > 0 && (bottom = f0Var3.itemView.getBottom() - height2) < 0 && f0Var3.itemView.getBottom() > f0Var.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i30) {
                    i30 = iAbs;
                    f0Var2 = f0Var3;
                }
                i34++;
                arrayList3 = arrayList;
                width2 = i14;
            }
            if (f0Var2 == null) {
                this.f10653u.clear();
                this.f10654v.clear();
                return;
            }
            int absoluteAdapterPosition = f0Var2.getAbsoluteAdapterPosition();
            f0Var.getAbsoluteAdapterPosition();
            if (dVar.m(this.f10650r, f0Var, f0Var2)) {
                RecyclerView recyclerView = this.f10650r;
                RecyclerView.p layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 instanceof h) {
                    ((h) layoutManager2).prepareForDrop(f0Var.itemView, f0Var2.itemView, i16, i17);
                    return;
                }
                if (layoutManager2.canScrollHorizontally()) {
                    if (layoutManager2.getDecoratedLeft(f0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                    if (layoutManager2.getDecoratedRight(f0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                }
                if (layoutManager2.canScrollVertically()) {
                    if (layoutManager2.getDecoratedTop(f0Var2.itemView) <= recyclerView.getPaddingTop()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                    if (layoutManager2.getDecoratedBottom(f0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    public final void n(int i14, RecyclerView.f0 f0Var) {
        boolean z14;
        d dVar;
        boolean z15;
        RecyclerView.f0 f0Var2;
        int iH;
        int i15;
        float fSignum;
        long j8;
        if (f0Var == this.f10635c && i14 == this.f10646n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i16 = this.f10646n;
        i(f0Var, true);
        this.f10646n = i14;
        if (i14 == 2) {
            if (f0Var == null) {
                vb.h.s("Must pass a ViewHolder when dragging");
                return;
            }
            this.f10655w = f0Var.itemView;
        }
        int i17 = (1 << ((i14 * 8) + 8)) - 1;
        RecyclerView.f0 f0Var3 = this.f10635c;
        d dVar2 = this.f10645m;
        if (f0Var3 != null) {
            if (f0Var3.itemView.getParent() != null) {
                if (i16 == 2) {
                    i15 = 0;
                } else {
                    if (this.f10646n == 2) {
                        iH = 0;
                    } else {
                        int iG = dVar2.g(this.f10650r, f0Var3);
                        RecyclerView recyclerView = this.f10650r;
                        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                        int iC = (d.c(iG, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (iC == 0) {
                            iH = 0;
                        } else {
                            int i18 = (iG & 65280) >> 8;
                            if (Math.abs(this.f10640h) > Math.abs(this.f10641i)) {
                                iH = f(iC);
                                if (iH <= 0) {
                                    iH = h(iC);
                                    if (iH <= 0) {
                                        iH = 0;
                                    }
                                } else if ((i18 & iH) == 0) {
                                    iH = d.d(iH, this.f10650r.getLayoutDirection());
                                }
                            } else {
                                iH = h(iC);
                                if (iH <= 0) {
                                    iH = f(iC);
                                    if (iH <= 0) {
                                        iH = 0;
                                    } else if ((i18 & iH) == 0) {
                                        iH = d.d(iH, this.f10650r.getLayoutDirection());
                                    }
                                }
                            }
                        }
                    }
                    i15 = iH;
                }
                VelocityTracker velocityTracker = this.f10652t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f10652t = null;
                }
                int i19 = 4;
                float fSignum2 = 0.0f;
                if (i15 == 1 || i15 == 2) {
                    fSignum = Math.signum(this.f10641i) * this.f10650r.getHeight();
                } else if (i15 == 4 || i15 == 8 || i15 == 16 || i15 == 32) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f10640h) * this.f10650r.getWidth();
                } else {
                    fSignum = 0.0f;
                }
                if (i16 == 2) {
                    i19 = 8;
                } else if (i15 > 0) {
                    i19 = 2;
                }
                float[] fArr = this.f10634b;
                k(fArr);
                int i24 = i19;
                z14 = false;
                f0Var2 = null;
                c cVar = new c(f0Var3, i24, i16, fArr[0], fArr[1], fSignum2, fSignum, i15, f0Var3);
                RecyclerView recyclerView2 = this.f10650r;
                dVar2.getClass();
                RecyclerView.m itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    j8 = i24 == 8 ? 200L : 250L;
                } else {
                    j8 = i24 == 8 ? itemAnimator.f10318e : itemAnimator.f10317d;
                }
                ValueAnimator valueAnimator = cVar.f10675g;
                valueAnimator.setDuration(j8);
                this.f10648p.add(cVar);
                cVar.f10673e.setIsRecyclable(false);
                valueAnimator.start();
                dVar = dVar2;
                z15 = true;
            } else {
                z14 = false;
                f0Var2 = null;
                if (f0Var3.itemView == this.f10655w) {
                    this.f10655w = null;
                }
                dVar = dVar2;
                dVar.b(this.f10650r, f0Var3);
                z15 = false;
            }
            this.f10635c = f0Var2;
        } else {
            z14 = false;
            dVar = dVar2;
            z15 = false;
        }
        if (f0Var != null) {
            RecyclerView recyclerView3 = this.f10650r;
            int iG2 = dVar.g(recyclerView3, f0Var);
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            this.f10647o = (d.c(iG2, recyclerView3.getLayoutDirection()) & i17) >> (this.f10646n * 8);
            this.f10642j = f0Var.itemView.getLeft();
            this.f10643k = f0Var.itemView.getTop();
            this.f10635c = f0Var;
            if (i14 == 2) {
                f0Var.itemView.performHapticFeedback(z14 ? 1 : 0);
            }
        }
        ViewParent parent = this.f10650r.getParent();
        if (parent != null) {
            if (this.f10635c != null) {
                z14 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z14);
        }
        if (!z15) {
            this.f10650r.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        dVar.n(this.f10646n, this.f10635c);
        this.f10650r.invalidate();
    }

    public final void o(RecyclerView.f0 f0Var) {
        RecyclerView recyclerView = this.f10650r;
        int iG = this.f10645m.g(recyclerView, f0Var);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if ((d.c(iG, recyclerView.getLayoutDirection()) & 16711680) == 0 || f0Var.itemView.getParent() != this.f10650r) {
            return;
        }
        VelocityTracker velocityTracker = this.f10652t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f10652t = VelocityTracker.obtain();
        this.f10641i = 0.0f;
        this.f10640h = 0.0f;
        n(2, f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f14;
        float f15;
        if (this.f10635c != null) {
            float[] fArr = this.f10634b;
            k(fArr);
            float f16 = fArr[0];
            f14 = fArr[1];
            f15 = f16;
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        RecyclerView.f0 f0Var = this.f10635c;
        int i14 = this.f10646n;
        d dVar = this.f10645m;
        dVar.getClass();
        ArrayList arrayList = this.f10648p;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            f fVar = (f) arrayList.get(i15);
            RecyclerView.f0 f0Var2 = fVar.f10673e;
            float f17 = fVar.f10669a;
            float f18 = fVar.f10671c;
            if (f17 == f18) {
                fVar.f10677i = f0Var2.itemView.getTranslationX();
            } else {
                fVar.f10677i = j20.x.a(f18, f17, fVar.f10681m, f17);
            }
            float f19 = fVar.f10670b;
            float f22 = fVar.f10672d;
            if (f19 == f22) {
                fVar.f10678j = f0Var2.itemView.getTranslationY();
            } else {
                fVar.f10678j = j20.x.a(f22, f19, fVar.f10681m, f19);
            }
            int iSave = canvas.save();
            dVar.l(canvas, recyclerView, fVar.f10673e, fVar.f10677i, fVar.f10678j, fVar.f10674f, false);
            canvas.restoreToCount(iSave);
        }
        if (f0Var != null) {
            int iSave2 = canvas.save();
            dVar.l(canvas, recyclerView, f0Var, f15, f14, i14, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        boolean z14 = false;
        if (this.f10635c != null) {
            float[] fArr = this.f10634b;
            k(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
        }
        RecyclerView.f0 f0Var = this.f10635c;
        this.f10645m.getClass();
        ArrayList arrayList = this.f10648p;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            f fVar = (f) arrayList.get(i14);
            int iSave = canvas.save();
            RecyclerView.f0 f0Var2 = fVar.f10673e;
            u uVar = u.f10688a;
            View view2 = f0Var2.itemView;
            uVar.getClass();
            canvas.restoreToCount(iSave);
        }
        if (f0Var != null) {
            int iSave2 = canvas.save();
            u.f10688a.getClass();
            canvas.restoreToCount(iSave2);
        }
        for (int i15 = size - 1; i15 >= 0; i15--) {
            f fVar2 = (f) arrayList.get(i15);
            boolean z15 = fVar2.f10680l;
            if (z15 && !fVar2.f10676h) {
                arrayList.remove(i15);
            } else if (!z15) {
                z14 = true;
            }
        }
        if (z14) {
            recyclerView.invalidate();
        }
    }

    public final void p(int i14, int i15, MotionEvent motionEvent) {
        float x14 = motionEvent.getX(i15);
        float y14 = motionEvent.getY(i15);
        float f14 = x14 - this.f10636d;
        this.f10640h = f14;
        this.f10641i = y14 - this.f10637e;
        if ((i14 & 4) == 0) {
            this.f10640h = Math.max(0.0f, f14);
        }
        if ((i14 & 8) == 0) {
            this.f10640h = Math.min(0.0f, this.f10640h);
        }
        if ((i14 & 1) == 0) {
            this.f10641i = Math.max(0.0f, this.f10641i);
        }
        if ((i14 & 2) == 0) {
            this.f10641i = Math.min(0.0f, this.f10641i);
        }
    }
}
