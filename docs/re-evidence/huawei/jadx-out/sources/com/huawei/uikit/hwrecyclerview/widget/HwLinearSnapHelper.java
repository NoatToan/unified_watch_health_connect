package com.huawei.uikit.hwrecyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.OverScroller;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes44.dex */
public class HwLinearSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f29643a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RecyclerView f29645c;
    private OrientationHelper d;
    protected int[] e;
    private SnapListener f;
    private View g;
    private OrientationHelper j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f29644b = 10;
    private boolean h = false;
    private final RecyclerView.OnScrollListener i = new e();

    public interface SnapListener {
        boolean isTargetNoSnap(int i);
    }

    class b extends LinearSmoothScroller {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            int i = displayMetrics.densityDpi;
            if (i > 0) {
                return 300.0f / i;
            }
            return 0.625f;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            HwLinearSnapHelper hwLinearSnapHelper = HwLinearSnapHelper.this;
            RecyclerView recyclerView = hwLinearSnapHelper.f29645c;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = hwLinearSnapHelper.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                action.update(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    class e extends RecyclerView.OnScrollListener {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                HwLinearSnapHelper.this.e = null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            HwLinearSnapHelper hwLinearSnapHelper = HwLinearSnapHelper.this;
            hwLinearSnapHelper.f29643a = i + i2 > 0 ? 1 : -1;
            hwLinearSnapHelper.d();
        }
    }

    private boolean b() {
        int[] iArr = this.e;
        return (iArr == null || iArr.length != 2 || (iArr[0] == 0 && iArr[1] == 0)) ? false : true;
    }

    protected int a(RecyclerView.LayoutManager layoutManager, int i, int i2, PointF pointF) {
        int iA;
        int iA2 = 0;
        if (layoutManager.canScrollHorizontally()) {
            iA = a(layoutManager, c(layoutManager), i, 0);
            if (pointF.x < 0.0f) {
                iA = -iA;
            }
        } else {
            iA = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iA2 = a(layoutManager, b(layoutManager), 0, i2);
            if (pointF.y < 0.0f) {
                iA2 = -iA2;
            }
        }
        return layoutManager.canScrollVertically() ? iA2 : iA;
    }

    protected int a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, int i2) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i, i2);
        float fE = e(layoutManager, orientationHelper);
        int i3 = 0;
        if (Float.compare(fE, 0.0f) <= 0) {
            return 0;
        }
        int i4 = Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1];
        int iRound = Math.round(i4 / fE);
        if (i4 < 0) {
            i3 = -1;
        } else if (i4 > 0) {
            i3 = 1;
        }
        this.f29643a = i3;
        int i5 = this.f29644b;
        return MathUtils.clamp(iRound, -i5, i5);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f29645c;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.i);
        }
        this.f29645c = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.i);
        }
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(layoutManager, view, c(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(layoutManager, view, b(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new b(this.f29645c.getContext());
        }
        return null;
    }

    protected int d(int i, int i2) {
        RecyclerView.Adapter adapter = this.f29645c.getAdapter();
        SnapListener snapListener = this.f;
        if (snapListener == null ? !(adapter == null || (adapter.getItemViewType(i2) & 268435456) == 0) : snapListener.isTargetNoSnap(i2)) {
            int i3 = this.f29643a;
            if (i3 == -1) {
                if (i2 > 0) {
                    return i2 - 1;
                }
                return i > 1 ? 0 : -1;
            }
            if (i3 == 1) {
                int i4 = i - 1;
                return i2 < i4 ? i2 + 1 : i4;
            }
        }
        return i2;
    }

    protected float e(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int position;
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            if (childAt != null && (position = layoutManager.getPosition(childAt)) != -1) {
                if (position < i) {
                    view = childAt;
                    i = position;
                }
                if (position > i2) {
                    view2 = childAt;
                    i2 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(orientationHelper.getDecoratedEnd(view), orientationHelper.getDecoratedEnd(view2)) - Math.min(orientationHelper.getDecoratedStart(view), orientationHelper.getDecoratedStart(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i2 - i) + 1);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager == null) {
            return null;
        }
        if (layoutManager.canScrollHorizontally()) {
            return d(layoutManager, c(layoutManager));
        }
        if (layoutManager.canScrollVertically() && this.f29645c.canScrollVertically(1) && this.f29645c.canScrollVertically(-1)) {
            return d(layoutManager, b(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (itemCount = layoutManager.getItemCount()) == 0 || (viewFindSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(viewFindSnapView)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition((i3 = itemCount - 1))) == null) {
            return -1;
        }
        int iA = a(layoutManager, i, i2, pointFComputeScrollVectorForPosition);
        if (iA == 0) {
            this.e = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
            return -1;
        }
        int i4 = position + iA;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 < itemCount) {
            i3 = i4;
        }
        return d(itemCount, i3);
    }

    @Override // androidx.recyclerview.widget.SnapHelper, androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i, int i2) {
        OverScroller overScroller;
        boolean zOnFling = super.onFling(i, i2);
        if (!zOnFling) {
            RecyclerView recyclerView = this.f29645c;
            if ((recyclerView instanceof HwRecyclerView) && (overScroller = ((HwRecyclerView) recyclerView).getOverScroller()) != null) {
                overScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                return false;
            }
        }
        if (!zOnFling && b()) {
            RecyclerView recyclerView2 = this.f29645c;
            int[] iArr = this.e;
            recyclerView2.smoothScrollBy(iArr[0], iArr[1]);
        }
        return true;
    }

    private OrientationHelper b(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.d;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.d = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!this.h) {
            this.g = null;
            return;
        }
        RecyclerView recyclerView = this.f29645c;
        if (recyclerView == null) {
            return;
        }
        View viewFindSnapView = findSnapView(recyclerView.getLayoutManager());
        View view = this.g;
        if (view != null && viewFindSnapView != view) {
            RecyclerView recyclerView2 = this.f29645c;
            if (recyclerView2 instanceof HwRecyclerView) {
                ((HwRecyclerView) recyclerView2).s();
            }
        }
        this.g = viewFindSnapView;
    }

    private int a(RecyclerView.LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getEnd() / 2);
    }

    private View d(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        RecyclerView.Adapter adapter;
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return null;
        }
        int end = orientationHelper.getEnd();
        View view = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int iAbs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) >> 1)) - (end >> 1));
            if (iAbs < i) {
                i2 = i3;
                i = iAbs;
                view = childAt;
            }
        }
        int childAdapterPosition = this.f29645c.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || (adapter = this.f29645c.getAdapter()) == null) {
            return null;
        }
        SnapListener snapListener = this.f;
        if (snapListener == null ? (adapter.getItemViewType(childAdapterPosition) & 268435456) == 0 : !snapListener.isTargetNoSnap(childAdapterPosition)) {
            return view;
        }
        int i4 = this.f29643a;
        if (i4 == -1) {
            if (i2 > 0) {
                return layoutManager.getChildAt(i2 - 1);
            }
            return null;
        }
        if (i4 != 1 || i2 >= childCount - 1) {
            return null;
        }
        return layoutManager.getChildAt(i2 + 1);
    }

    private OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.j;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.j = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.j;
    }
}
