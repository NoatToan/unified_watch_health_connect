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
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GestureDetectorCompat;
import defpackage.nmi;
import defpackage.wod;
import defpackage.xod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l extends RecyclerView.n implements RecyclerView.p {
    public Rect B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2939k;
    public e m;
    private long mDragScrollStartTimeInMs;
    public int n;
    public int p;
    public RecyclerView q;
    public VelocityTracker s;
    public List<RecyclerView.d0> t;
    public List<Integer> u;
    public RecyclerView.j v;
    public GestureDetectorCompat y;
    public f z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<View> f2937a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f2938b = new float[2];
    public RecyclerView.d0 c = null;
    public int l = -1;
    private int mActionState = 0;

    @VisibleForTesting
    public List<g> o = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Runnable f2940r = new a();
    public View w = null;
    public int x = -1;
    public final RecyclerView.r A = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            if (lVar.c == null || !lVar.u()) {
                return;
            }
            l lVar2 = l.this;
            RecyclerView.d0 d0Var = lVar2.c;
            if (d0Var != null) {
                lVar2.p(d0Var);
            }
            l lVar3 = l.this;
            lVar3.q.removeCallbacks(lVar3.f2940r);
            androidx.core.view.c.i0(l.this.q, this);
        }
    }

    public class b implements RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            g gVarJ;
            l.this.y.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                l.this.l = motionEvent.getPointerId(0);
                l.this.d = motionEvent.getX();
                l.this.e = motionEvent.getY();
                l.this.q();
                l lVar = l.this;
                if (lVar.c == null && (gVarJ = lVar.j(motionEvent)) != null) {
                    l lVar2 = l.this;
                    lVar2.d -= gVarJ.j;
                    lVar2.e -= gVarJ.f2949k;
                    lVar2.i(gVarJ.e, true);
                    if (l.this.f2937a.remove(gVarJ.e.itemView)) {
                        l lVar3 = l.this;
                        lVar3.m.clearView(lVar3.q, gVarJ.e);
                    }
                    l.this.v(gVarJ.e, gVarJ.f);
                    l lVar4 = l.this;
                    lVar4.B(motionEvent, lVar4.n, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                l lVar5 = l.this;
                lVar5.l = -1;
                lVar5.v(null, 0);
            } else {
                int i = l.this.l;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    l.this.f(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = l.this.s;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return l.this.c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                l.this.v(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            l.this.y.a(motionEvent);
            VelocityTracker velocityTracker = l.this.s;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (l.this.l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(l.this.l);
            if (iFindPointerIndex >= 0) {
                l.this.f(actionMasked, motionEvent, iFindPointerIndex);
            }
            l lVar = l.this;
            RecyclerView.d0 d0Var = lVar.c;
            if (d0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        lVar.B(motionEvent, lVar.n, iFindPointerIndex);
                        l.this.p(d0Var);
                        l lVar2 = l.this;
                        lVar2.q.removeCallbacks(lVar2.f2940r);
                        l.this.f2940r.run();
                        l.this.q.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    l lVar3 = l.this;
                    if (pointerId == lVar3.l) {
                        lVar3.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        l lVar4 = l.this;
                        lVar4.B(motionEvent, lVar4.n, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = lVar.s;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            l.this.v(null, 0);
            l.this.l = -1;
        }
    }

    public class c extends g {
        public final /* synthetic */ int o;
        public final /* synthetic */ RecyclerView.d0 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.d0 d0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.d0 d0Var2) {
            super(d0Var, i, i2, f, f2, f3, f4);
            this.o = i3;
            this.p = d0Var2;
        }

        @Override // androidx.recyclerview.widget.l.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.l) {
                return;
            }
            if (this.o <= 0) {
                l lVar = l.this;
                lVar.m.clearView(lVar.q, this.p);
            } else {
                l.this.f2937a.add(this.p.itemView);
                this.i = true;
                int i = this.o;
                if (i > 0) {
                    l.this.r(this, i);
                }
            }
            l lVar2 = l.this;
            View view = lVar2.w;
            View view2 = this.p.itemView;
            if (view == view2) {
                lVar2.t(view2);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f2943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2944b;

        public d(g gVar, int i) {
            this.f2943a = gVar;
            this.f2944b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = l.this.q;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f2943a;
            if (gVar.l || gVar.e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.l itemAnimator = l.this.q.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q(null)) && !l.this.n()) {
                l.this.m.onSwiped(this.f2943a.e, this.f2944b);
            } else {
                l.this.q.post(this);
            }
        }
    }

    public static abstract class e {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i5 | i3;
        }

        public static wod getDefaultUIUtil() {
            return xod.f39312a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(nmi.d);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag(0, i2 | i);
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.d0 chooseDropTarget(RecyclerView.d0 d0Var, List<RecyclerView.d0> list, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = i + d0Var.itemView.getWidth();
            int height = i2 + d0Var.itemView.getHeight();
            int left2 = i - d0Var.itemView.getLeft();
            int top2 = i2 - d0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.d0 d0Var2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.d0 d0Var3 = list.get(i4);
                if (left2 > 0 && (right = d0Var3.itemView.getRight() - width) < 0 && d0Var3.itemView.getRight() > d0Var.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = d0Var3.itemView.getLeft() - i) > 0 && d0Var3.itemView.getLeft() < d0Var.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = d0Var3.itemView.getTop() - i2) > 0 && d0Var3.itemView.getTop() < d0Var.itemView.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = d0Var3.itemView.getBottom() - height) < 0 && d0Var3.itemView.getBottom() > d0Var.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs;
                }
            }
            return d0Var2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            xod.f39312a.c(d0Var.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & RELATIVE_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i5 | i3;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, d0Var), androidx.core.view.c.A(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 250L;
            }
            return i == 8 ? itemAnimator.n() : itemAnimator.o();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.d0 d0Var);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (getAbsoluteMovementFlags(recyclerView, d0Var) & 16711680) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (getAbsoluteMovementFlags(recyclerView, d0Var) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int iSignum = (int) (((int) (((int) Math.signum(i2)) * getMaxDragScroll(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * sDragScrollInterpolator.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
            if (iSignum == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return iSignum;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            xod.f39312a.b(canvas, recyclerView, d0Var.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            xod.f39312a.d(canvas, recyclerView, d0Var.itemView, f, f2, i, z);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<g> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = list.get(i2);
                gVar.e();
                int iSave = canvas.save();
                onChildDraw(canvas, recyclerView, gVar.e, gVar.j, gVar.f2949k, gVar.f, false);
                canvas.restoreToCount(iSave);
            }
            if (d0Var != null) {
                int iSave2 = canvas.save();
                onChildDraw(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<g> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = list.get(i2);
                int iSave = canvas.save();
                onChildDrawOver(canvas, recyclerView, gVar.e, gVar.j, gVar.f2949k, gVar.f, false);
                canvas.restoreToCount(iSave);
            }
            if (d0Var != null) {
                int iSave2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                g gVar2 = list.get(i3);
                boolean z2 = gVar2.m;
                if (z2 && !gVar2.i) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(RecyclerView recyclerView, RecyclerView.d0 d0Var, int i, RecyclerView.d0 d0Var2, int i2, int i3, int i4) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof i) {
                ((i) layoutManager).prepareForDrop(d0Var.itemView, d0Var2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(d0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(d0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(d0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(d0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.d0 d0Var, int i) {
            if (d0Var != null) {
                xod.f39312a.a(d0Var.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.d0 d0Var, int i);
    }

    public class f extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2945a = true;

        public f() {
        }

        public void a() {
            this.f2945a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewK;
            RecyclerView.d0 childViewHolder;
            if (!this.f2945a || (viewK = l.this.k(motionEvent)) == null || (childViewHolder = l.this.q.getChildViewHolder(viewK)) == null) {
                return;
            }
            l lVar = l.this;
            if (lVar.m.hasDragFlag(lVar.q, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = l.this.l;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    l lVar2 = l.this;
                    lVar2.d = x;
                    lVar2.e = y;
                    lVar2.i = 0.0f;
                    lVar2.h = 0.0f;
                    if (lVar2.m.isLongPressDragEnabled()) {
                        l.this.v(childViewHolder, 2);
                    }
                }
            }
        }
    }

    @VisibleForTesting
    public static class g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f2947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f2948b;
        public final float c;
        public final float d;
        public final RecyclerView.d0 e;
        public final int f;

        @VisibleForTesting
        public final ValueAnimator g;
        public final int h;
        public boolean i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f2949k;
        public boolean l = false;
        public boolean m = false;
        public float n;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public g(RecyclerView.d0 d0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f = i2;
            this.h = i;
            this.e = d0Var;
            this.f2947a = f;
            this.f2948b = f2;
            this.c = f3;
            this.d = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(d0Var.itemView);
            valueAnimatorOfFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.g.cancel();
        }

        public void b(long j) {
            this.g.setDuration(j);
        }

        public void c(float f) {
            this.n = f;
        }

        public void d() {
            this.e.setIsRecyclable(false);
            this.g.start();
        }

        public void e() {
            float f = this.f2947a;
            float f2 = this.c;
            if (f == f2) {
                this.j = this.e.itemView.getTranslationX();
            } else {
                this.j = f + (this.n * (f2 - f));
            }
            float f3 = this.f2948b;
            float f4 = this.d;
            if (f3 == f4) {
                this.f2949k = this.e.itemView.getTranslationY();
            } else {
                this.f2949k = f3 + (this.n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.m) {
                this.e.setIsRecyclable(true);
            }
            this.m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class h extends e {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public h(int i, int i2) {
            this.mDefaultSwipeDirs = i2;
            this.mDefaultDragDirs = i;
        }

        public int getDragDirs(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return this.mDefaultDragDirs;
        }

        @Override // androidx.recyclerview.widget.l.e
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return e.makeMovementFlags(getDragDirs(recyclerView, d0Var), getSwipeDirs(recyclerView, d0Var));
        }

        public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i) {
            this.mDefaultDragDirs = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.mDefaultSwipeDirs = i;
        }
    }

    public interface i {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    public l(e eVar) {
        this.m = eVar;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.n & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.itemView.getLeft();
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.n & 3) != 0) {
            fArr[1] = (this.f2939k + this.i) - this.c.itemView.getTop();
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    private void h() {
        this.q.removeItemDecoration(this);
        this.q.removeOnItemTouchListener(this.A);
        this.q.removeOnChildAttachStateChangeListener(this);
        for (int size = this.o.size() - 1; size >= 0; size--) {
            g gVar = this.o.get(0);
            gVar.a();
            this.m.clearView(this.q, gVar.e);
        }
        this.o.clear();
        this.w = null;
        this.x = -1;
        s();
        z();
    }

    public static boolean o(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    private void w() {
        this.p = ViewConfiguration.get(this.q.getContext()).getScaledTouchSlop();
        this.q.addItemDecoration(this);
        this.q.addOnItemTouchListener(this.A);
        this.q.addOnChildAttachStateChangeListener(this);
        y();
    }

    public final int A(RecyclerView.d0 d0Var) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.m.getMovementFlags(this.q, d0Var);
        int iConvertToAbsoluteDirection = (this.m.convertToAbsoluteDirection(movementFlags, androidx.core.view.c.A(this.q)) & 65280) >> 8;
        if (iConvertToAbsoluteDirection == 0) {
            return 0;
        }
        int i2 = (movementFlags & 65280) >> 8;
        if (Math.abs(this.h) > Math.abs(this.i)) {
            int iE = e(d0Var, iConvertToAbsoluteDirection);
            if (iE > 0) {
                return (i2 & iE) == 0 ? e.convertToRelativeDirection(iE, androidx.core.view.c.A(this.q)) : iE;
            }
            int iG = g(d0Var, iConvertToAbsoluteDirection);
            if (iG > 0) {
                return iG;
            }
        } else {
            int iG2 = g(d0Var, iConvertToAbsoluteDirection);
            if (iG2 > 0) {
                return iG2;
            }
            int iE2 = e(d0Var, iConvertToAbsoluteDirection);
            if (iE2 > 0) {
                return (i2 & iE2) == 0 ? e.convertToRelativeDirection(iE2, androidx.core.view.c.A(this.q)) : iE2;
            }
        }
        return 0;
    }

    public void B(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.d;
        this.h = f2;
        this.i = y - this.e;
        if ((i2 & 4) == 0) {
            this.h = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i2 & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i2 & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(View view) {
        t(view);
        RecyclerView.d0 childViewHolder = this.q.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.d0 d0Var = this.c;
        if (d0Var != null && childViewHolder == d0Var) {
            v(null, 0);
            return;
        }
        i(childViewHolder, false);
        if (this.f2937a.remove(childViewHolder.itemView)) {
            this.m.clearView(this.q, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(View view) {
    }

    public final void c() {
    }

    public void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.q;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.q = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(nmi.f);
            this.g = resources.getDimension(nmi.e);
            w();
        }
    }

    public final int e(RecyclerView.d0 d0Var, int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.s;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.m.getSwipeVelocityThreshold(this.g));
            float xVelocity = this.s.getXVelocity(this.l);
            float yVelocity = this.s.getYVelocity(this.l);
            int i4 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i4 & i2) != 0 && i3 == i4 && fAbs >= this.m.getSwipeEscapeVelocity(this.f) && fAbs > Math.abs(yVelocity)) {
                return i4;
            }
        }
        float width = this.q.getWidth() * this.m.getSwipeThreshold(d0Var);
        if ((i2 & i3) == 0 || Math.abs(this.h) <= width) {
            return 0;
        }
        return i3;
    }

    public void f(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.d0 d0VarM;
        int absoluteMovementFlags;
        if (this.c != null || i2 != 2 || this.mActionState == 2 || !this.m.isItemViewSwipeEnabled() || this.q.getScrollState() == 1 || (d0VarM = m(motionEvent)) == null || (absoluteMovementFlags = (this.m.getAbsoluteMovementFlags(this.q, d0VarM) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.d;
        float f3 = y - this.e;
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        int i4 = this.p;
        if (fAbs >= i4 || fAbs2 >= i4) {
            if (fAbs > fAbs2) {
                if (f2 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.i = 0.0f;
            this.h = 0.0f;
            this.l = motionEvent.getPointerId(0);
            v(d0VarM, 1);
        }
    }

    public final int g(RecyclerView.d0 d0Var, int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.s;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.m.getSwipeVelocityThreshold(this.g));
            float xVelocity = this.s.getXVelocity(this.l);
            float yVelocity = this.s.getYVelocity(this.l);
            int i4 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i4 & i2) != 0 && i4 == i3 && fAbs >= this.m.getSwipeEscapeVelocity(this.f) && fAbs > Math.abs(xVelocity)) {
                return i4;
            }
        }
        float height = this.q.getHeight() * this.m.getSwipeThreshold(d0Var);
        if ((i2 & i3) == 0 || Math.abs(this.i) <= height) {
            return 0;
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.setEmpty();
    }

    public void i(RecyclerView.d0 d0Var, boolean z) {
        for (int size = this.o.size() - 1; size >= 0; size--) {
            g gVar = this.o.get(size);
            if (gVar.e == d0Var) {
                gVar.l |= z;
                if (!gVar.m) {
                    gVar.a();
                }
                this.o.remove(size);
                return;
            }
        }
    }

    public g j(MotionEvent motionEvent) {
        if (this.o.isEmpty()) {
            return null;
        }
        View viewK = k(motionEvent);
        for (int size = this.o.size() - 1; size >= 0; size--) {
            g gVar = this.o.get(size);
            if (gVar.e.itemView == viewK) {
                return gVar;
            }
        }
        return null;
    }

    public View k(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.d0 d0Var = this.c;
        if (d0Var != null) {
            View view = d0Var.itemView;
            if (o(view, x, y, this.j + this.h, this.f2939k + this.i)) {
                return view;
            }
        }
        for (int size = this.o.size() - 1; size >= 0; size--) {
            g gVar = this.o.get(size);
            View view2 = gVar.e.itemView;
            if (o(view2, x, y, gVar.j, gVar.f2949k)) {
                return view2;
            }
        }
        return this.q.findChildViewUnder(x, y);
    }

    public final List<RecyclerView.d0> l(RecyclerView.d0 d0Var) {
        RecyclerView.d0 d0Var2 = d0Var;
        List<RecyclerView.d0> list = this.t;
        if (list == null) {
            this.t = new ArrayList();
            this.u = new ArrayList();
        } else {
            list.clear();
            this.u.clear();
        }
        int boundingBoxMargin = this.m.getBoundingBoxMargin();
        int iRound = Math.round(this.j + this.h) - boundingBoxMargin;
        int iRound2 = Math.round(this.f2939k + this.i) - boundingBoxMargin;
        int i2 = boundingBoxMargin * 2;
        int width = d0Var2.itemView.getWidth() + iRound + i2;
        int height = d0Var2.itemView.getHeight() + iRound2 + i2;
        int i3 = (iRound + width) / 2;
        int i4 = (iRound2 + height) / 2;
        RecyclerView.o layoutManager = this.q.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = layoutManager.getChildAt(i5);
            if (childAt != d0Var2.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                RecyclerView.d0 childViewHolder = this.q.getChildViewHolder(childAt);
                if (this.m.canDropOver(this.q, this.c, childViewHolder)) {
                    int iAbs = Math.abs(i3 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int iAbs2 = Math.abs(i4 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i6 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.t.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size && i6 > this.u.get(i8).intValue(); i8++) {
                        i7++;
                    }
                    this.t.add(i7, childViewHolder);
                    this.u.add(i7, Integer.valueOf(i6));
                }
            }
            i5++;
            d0Var2 = d0Var;
        }
        return this.t;
    }

    public final RecyclerView.d0 m(MotionEvent motionEvent) {
        View viewK;
        RecyclerView.o layoutManager = this.q.getLayoutManager();
        int i2 = this.l;
        if (i2 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        float x = motionEvent.getX(iFindPointerIndex) - this.d;
        float y = motionEvent.getY(iFindPointerIndex) - this.e;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        int i3 = this.p;
        if (fAbs < i3 && fAbs2 < i3) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewK = k(motionEvent)) != null) {
            return this.q.getChildViewHolder(viewK);
        }
        return null;
    }

    public boolean n() {
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.o.get(i2).m) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f2;
        float f3;
        this.x = -1;
        if (this.c != null) {
            getSelectedDxDy(this.f2938b);
            float[] fArr = this.f2938b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.onDraw(canvas, recyclerView, this.c, this.o, this.mActionState, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f2;
        float f3;
        if (this.c != null) {
            getSelectedDxDy(this.f2938b);
            float[] fArr = this.f2938b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.onDrawOver(canvas, recyclerView, this.c, this.o, this.mActionState, f2, f3);
    }

    public void p(RecyclerView.d0 d0Var) {
        if (!this.q.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.m.getMoveThreshold(d0Var);
            int i2 = (int) (this.j + this.h);
            int i3 = (int) (this.f2939k + this.i);
            if (Math.abs(i3 - d0Var.itemView.getTop()) >= d0Var.itemView.getHeight() * moveThreshold || Math.abs(i2 - d0Var.itemView.getLeft()) >= d0Var.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.d0> listL = l(d0Var);
                if (listL.size() == 0) {
                    return;
                }
                RecyclerView.d0 d0VarChooseDropTarget = this.m.chooseDropTarget(d0Var, listL, i2, i3);
                if (d0VarChooseDropTarget == null) {
                    this.t.clear();
                    this.u.clear();
                    return;
                }
                int absoluteAdapterPosition = d0VarChooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = d0Var.getAbsoluteAdapterPosition();
                if (this.m.onMove(this.q, d0Var, d0VarChooseDropTarget)) {
                    this.m.onMoved(this.q, d0Var, absoluteAdapterPosition2, d0VarChooseDropTarget, absoluteAdapterPosition, i2, i3);
                }
            }
        }
    }

    public void q() {
        VelocityTracker velocityTracker = this.s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.s = VelocityTracker.obtain();
    }

    public void r(g gVar, int i2) {
        this.q.post(new d(gVar, i2));
    }

    public final void s() {
        VelocityTracker velocityTracker = this.s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.s = null;
        }
    }

    public void t(View view) {
        if (view == this.w) {
            this.w = null;
            if (this.v != null) {
                this.q.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    public boolean u() {
        int iInterpolateOutOfBoundsScroll;
        int iInterpolateOutOfBoundsScroll2;
        int i2;
        int width;
        if (this.c == null) {
            this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.mDragScrollStartTimeInMs;
        long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
        RecyclerView.o layoutManager = this.q.getLayoutManager();
        if (this.B == null) {
            this.B = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.c.itemView, this.B);
        if (layoutManager.canScrollHorizontally()) {
            int i3 = (int) (this.j + this.h);
            int paddingLeft = (i3 - this.B.left) - this.q.getPaddingLeft();
            float f2 = this.h;
            if (f2 < 0.0f && paddingLeft < 0) {
                iInterpolateOutOfBoundsScroll = paddingLeft;
            } else if (f2 <= 0.0f || (width = ((i3 + this.c.itemView.getWidth()) + this.B.right) - (this.q.getWidth() - this.q.getPaddingRight())) <= 0) {
                iInterpolateOutOfBoundsScroll = 0;
            } else {
                iInterpolateOutOfBoundsScroll = width;
            }
        } else {
            iInterpolateOutOfBoundsScroll = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int i4 = (int) (this.f2939k + this.i);
            int paddingTop = (i4 - this.B.top) - this.q.getPaddingTop();
            float f3 = this.i;
            if (f3 < 0.0f && paddingTop < 0) {
                iInterpolateOutOfBoundsScroll2 = paddingTop;
            } else if (f3 <= 0.0f || (iInterpolateOutOfBoundsScroll2 = ((i4 + this.c.itemView.getHeight()) + this.B.bottom) - (this.q.getHeight() - this.q.getPaddingBottom())) <= 0) {
                iInterpolateOutOfBoundsScroll2 = 0;
            }
        } else {
            iInterpolateOutOfBoundsScroll2 = 0;
        }
        if (iInterpolateOutOfBoundsScroll != 0) {
            iInterpolateOutOfBoundsScroll = this.m.interpolateOutOfBoundsScroll(this.q, this.c.itemView.getWidth(), iInterpolateOutOfBoundsScroll, this.q.getWidth(), j2);
        }
        int i5 = iInterpolateOutOfBoundsScroll;
        if (iInterpolateOutOfBoundsScroll2 != 0) {
            i2 = i5;
            iInterpolateOutOfBoundsScroll2 = this.m.interpolateOutOfBoundsScroll(this.q, this.c.itemView.getHeight(), iInterpolateOutOfBoundsScroll2, this.q.getHeight(), j2);
        } else {
            i2 = i5;
        }
        if (i2 == 0 && iInterpolateOutOfBoundsScroll2 == 0) {
            this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            return false;
        }
        if (this.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
            this.mDragScrollStartTimeInMs = jCurrentTimeMillis;
        }
        this.q.scrollBy(i2, iInterpolateOutOfBoundsScroll2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    public void v(RecyclerView.d0 d0Var, int i2) {
        boolean z;
        boolean z2;
        float fSignum;
        float fSignum2;
        int i3;
        if (d0Var == this.c && i2 == this.mActionState) {
            return;
        }
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        int i4 = this.mActionState;
        i(d0Var, true);
        this.mActionState = i2;
        if (i2 == 2) {
            if (d0Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.w = d0Var.itemView;
            c();
        }
        int i5 = (1 << ((i2 * 8) + 8)) - 1;
        RecyclerView.d0 d0Var2 = this.c;
        if (d0Var2 != null) {
            if (d0Var2.itemView.getParent() != null) {
                int iA = i4 == 2 ? 0 : A(d0Var2);
                s();
                if (iA == 1 || iA == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.i) * this.q.getHeight();
                } else if (iA == 4 || iA == 8 || iA == 16 || iA == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.h) * this.q.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i4 == 2) {
                    i3 = 8;
                } else {
                    i3 = iA > 0 ? 2 : 4;
                }
                getSelectedDxDy(this.f2938b);
                float[] fArr = this.f2938b;
                float f2 = fArr[0];
                float f3 = fArr[1];
                c cVar = new c(d0Var2, i3, i4, f2, f3, fSignum, fSignum2, iA, d0Var2);
                cVar.b(this.m.getAnimationDuration(this.q, i3, fSignum - f2, fSignum2 - f3));
                this.o.add(cVar);
                cVar.d();
                z = true;
            } else {
                t(d0Var2.itemView);
                this.m.clearView(this.q, d0Var2);
                z = false;
            }
            this.c = null;
        } else {
            z = false;
        }
        if (d0Var != null) {
            this.n = (this.m.getAbsoluteMovementFlags(this.q, d0Var) & i5) >> (this.mActionState * 8);
            this.j = d0Var.itemView.getLeft();
            this.f2939k = d0Var.itemView.getTop();
            this.c = d0Var;
            if (i2 == 2) {
                z2 = false;
                d0Var.itemView.performHapticFeedback(0);
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        ViewParent parent = this.q.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.c != null ? true : z2);
        }
        if (!z) {
            this.q.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.m.onSelectedChanged(this.c, this.mActionState);
        this.q.invalidate();
    }

    public void x(RecyclerView.d0 d0Var) {
        if (this.m.hasDragFlag(this.q, d0Var) && d0Var.itemView.getParent() == this.q) {
            q();
            this.i = 0.0f;
            this.h = 0.0f;
            v(d0Var, 2);
        }
    }

    public final void y() {
        this.z = new f();
        this.y = new GestureDetectorCompat(this.q.getContext(), this.z);
    }

    public final void z() {
        f fVar = this.z;
        if (fVar != null) {
            fVar.a();
            this.z = null;
        }
        if (this.y != null) {
            this.y = null;
        }
    }
}
