package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends RecyclerView.s {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.u mScrollListener = new a();

    public class a extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10506a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrollStateChanged(RecyclerView recyclerView, int i14) {
            super.onScrollStateChanged(recyclerView, i14);
            if (i14 == 0 && this.f10506a) {
                this.f10506a = false;
                i0.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
            if (i14 == 0 && i15 == 0) {
                return;
            }
            this.f10506a = true;
        }
    }

    public class b extends w {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.w
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return i0.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.a0
        public final void onTargetFound(View view2, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            i0 i0Var = i0.this;
            RecyclerView recyclerView = i0Var.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = i0Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view2);
            int i14 = iArrCalculateDistanceToFinalSnap[0];
            int i15 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i14), Math.abs(i15)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.b(i14, i15, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            vb.h.z("An instance of OnFlingListener already set.");
        } else {
            this.mRecyclerView.addOnScrollListener(this.mScrollListener);
            this.mRecyclerView.setOnFlingListener(this);
        }
    }

    private boolean snapFromFling(RecyclerView.p pVar, int i14, int i15) {
        RecyclerView.a0 a0VarCreateScroller;
        int iFindTargetSnapPosition;
        if (!(pVar instanceof RecyclerView.a0.b) || (a0VarCreateScroller = createScroller(pVar)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(pVar, i14, i15)) == -1) {
            return false;
        }
        a0VarCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        pVar.startSmoothScroll(a0VarCreateScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view2);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i14, int i15) {
        this.mGravityScroller.fling(0, 0, i14, i15, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public RecyclerView.a0 createScroller(RecyclerView.p pVar) {
        return createSnapScroller(pVar);
    }

    @Deprecated
    public w createSnapScroller(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new b(this.mRecyclerView.getContext());
        }
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract View findSnapView(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int findTargetSnapPosition(RecyclerView.p pVar, int i14, int i15);

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean onFling(int i14, int i15) {
        RecyclerView.p layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i15) > minFlingVelocity || Math.abs(i14) > minFlingVelocity) && snapFromFling(layoutManager, i14, i15);
    }

    public void snapToTargetExistingView() {
        RecyclerView.p layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i14 = iArrCalculateDistanceToFinalSnap[0];
        if (i14 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i14, iArrCalculateDistanceToFinalSnap[1]);
    }
}
