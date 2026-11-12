package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.w;

/* JADX INFO: loaded from: classes14.dex */
public class CarouselSnapHelper extends i0 {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private RecyclerView recyclerView;

    public CarouselSnapHelper(boolean z14) {
        this.disableFling = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(RecyclerView.p pVar, View view2, boolean z14) {
        if (!(pVar instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view2, (CarouselLayoutManager) pVar, z14);
        if (pVar.canScrollHorizontally()) {
            return new int[]{iDistanceToFirstFocalKeyline, 0};
        }
        return pVar.canScrollVertically() ? new int[]{0, iDistanceToFirstFocalKeyline} : new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View view2, CarouselLayoutManager carouselLayoutManager, boolean z14) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view2), z14);
    }

    private View findViewNearestFirstKeyline(RecyclerView.p pVar) {
        int childCount = pVar.getChildCount();
        View view2 = null;
        if (childCount != 0 && (pVar instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) pVar;
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = pVar.getChildAt(i15);
                int iAbs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(pVar.getPosition(childAt), false));
                if (iAbs < i14) {
                    view2 = childAt;
                    i14 = iAbs;
                }
            }
        }
        return view2;
    }

    private boolean isForwardFling(RecyclerView.p pVar, int i14, int i15) {
        if (pVar.canScrollHorizontally()) {
            return i14 > 0;
        }
        return i15 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.p pVar) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = pVar.getItemCount();
        if (!(pVar instanceof RecyclerView.a0.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.a0.b) pVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.i0
    public void attachToRecyclerView(RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.i0
    public int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view2) {
        return calculateDistanceToSnap(pVar, view2, false);
    }

    @Override // androidx.recyclerview.widget.i0
    public RecyclerView.a0 createScroller(final RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new w(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.w
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f14;
                    float f15;
                    if (pVar.canScrollVertically()) {
                        f14 = displayMetrics.densityDpi;
                        f15 = CarouselSnapHelper.VERTICAL_SNAP_SPEED;
                    } else {
                        f14 = displayMetrics.densityDpi;
                        f15 = CarouselSnapHelper.HORIZONTAL_SNAP_SPEED;
                    }
                    return f15 / f14;
                }

                @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.a0
                public void onTargetFound(View view2, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrCalculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view2, true);
                        int i14 = iArrCalculateDistanceToSnap[0];
                        int i15 = iArrCalculateDistanceToSnap[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i14), Math.abs(i15)));
                        if (iCalculateTimeForDeceleration > 0) {
                            aVar.b(i14, i15, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.i0
    public View findSnapView(RecyclerView.p pVar) {
        return findViewNearestFirstKeyline(pVar);
    }

    @Override // androidx.recyclerview.widget.i0
    public int findTargetSnapPosition(RecyclerView.p pVar, int i14, int i15) {
        int itemCount;
        if (!this.disableFling || (itemCount = pVar.getItemCount()) == 0) {
            return -1;
        }
        int childCount = pVar.getChildCount();
        View view2 = null;
        int i16 = Integer.MAX_VALUE;
        int i17 = Integer.MIN_VALUE;
        View view3 = null;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = pVar.getChildAt(i18);
            if (childAt != null) {
                int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) pVar, false);
                if (iDistanceToFirstFocalKeyline <= 0 && iDistanceToFirstFocalKeyline > i17) {
                    view3 = childAt;
                    i17 = iDistanceToFirstFocalKeyline;
                }
                if (iDistanceToFirstFocalKeyline >= 0 && iDistanceToFirstFocalKeyline < i16) {
                    view2 = childAt;
                    i16 = iDistanceToFirstFocalKeyline;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(pVar, i14, i15);
        if (zIsForwardFling && view2 != null) {
            return pVar.getPosition(view2);
        }
        if (!zIsForwardFling && view3 != null) {
            return pVar.getPosition(view3);
        }
        if (zIsForwardFling) {
            view2 = view3;
        }
        if (view2 == null) {
            return -1;
        }
        int position = pVar.getPosition(view2) + (isReverseLayout(pVar) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public CarouselSnapHelper() {
        this(true);
    }
}
