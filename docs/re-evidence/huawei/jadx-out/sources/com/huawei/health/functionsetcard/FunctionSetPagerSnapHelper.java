package com.huawei.health.functionsetcard;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes7.dex */
public class FunctionSetPagerSnapHelper extends LinearSnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6696b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6697c = 0;
    private OrientationHelper d;
    private OrientationHelper e;

    public FunctionSetPagerSnapHelper(int i) {
        this.f6695a = i;
    }

    public void b(int i) {
        this.f6696b = i;
    }

    public void e(int i) {
        this.f6697c = i;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager == null) {
            LogUtil.j("FunctionSetPagerSnapHelper", "layoutManager is null");
            return iArr;
        }
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = c(layoutManager, view, a(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = c(layoutManager, view, e(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        View viewFindSnapView;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iA;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return -1;
        }
        LogUtil.a("FunctionSetPagerSnapHelper", "findTargetSnapPosition() : velocityX: ", Integer.valueOf(i));
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (viewFindSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(viewFindSnapView)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition((i3 = itemCount - 1))) == null) {
            return -1;
        }
        int iE = e(i, position);
        int iB = b(layoutManager, i, pointFComputeScrollVectorForPosition, viewFindSnapView);
        if (layoutManager.canScrollVertically()) {
            iA = a(layoutManager, e(layoutManager), 0, i2);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iA = -iA;
            }
        } else {
            iA = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iB = iA;
        }
        if (iB == 0) {
            return -1;
        }
        int i4 = iE + iB;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= itemCount ? i3 : i5;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager == null) {
            return null;
        }
        if (layoutManager.canScrollVertically()) {
            return d(layoutManager, e(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return d(layoutManager, a(layoutManager));
        }
        LogUtil.j("FunctionSetPagerSnapHelper", "no filter");
        return null;
    }

    private int c(RecyclerView.LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        int end;
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        int decoratedMeasurement = orientationHelper.getDecoratedMeasurement(view) / 2;
        if (layoutManager.getClipToPadding()) {
            end = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        } else {
            end = orientationHelper.getEnd() / 2;
        }
        return (decoratedStart + decoratedMeasurement) - end;
    }

    private int a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, int i2) {
        double dCeil;
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i, i2);
        float fB = b(layoutManager, orientationHelper);
        if (fB <= 0.0f) {
            return 0;
        }
        int i3 = Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1];
        if (i3 > 0) {
            dCeil = Math.floor(i3 / fB);
        } else {
            dCeil = Math.ceil(i3 / fB);
        }
        return (int) dCeil;
    }

    private View d(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int end;
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager.getClipToPadding()) {
            end = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        } else {
            end = orientationHelper.getEnd() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - end);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    private float b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
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
            int position = layoutManager.getPosition(childAt);
            if (position != -1) {
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

    private OrientationHelper e(RecyclerView.LayoutManager layoutManager) {
        if (this.e == null) {
            this.e = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.e;
    }

    private OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        if (this.d == null) {
            this.d = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.d;
    }

    private int e(int i, int i2) {
        if (i < 0) {
            int i3 = this.f6697c;
            i2 = (i3 + 1 == this.f6695a && this.f6696b == i3 + (-3)) ? i3 - 1 : i3 - 2;
            this.f6696b = 0;
            this.f6697c = 0;
        }
        if (i <= 0) {
            return i2;
        }
        int i4 = this.f6696b;
        int i5 = (i4 == 0 && this.f6697c == i4 + 3) ? i4 + 1 : i4 + 2;
        this.f6696b = 0;
        this.f6697c = 0;
        return i5;
    }

    private int b(RecyclerView.LayoutManager layoutManager, int i, PointF pointF, View view) {
        boolean zBa = LanguageUtil.ba(BaseApplication.getContext());
        int decoratedMeasurement = a(layoutManager).getDecoratedMeasurement(view);
        int width = decoratedMeasurement > 0 ? layoutManager.getWidth() / decoratedMeasurement : 0;
        if (!layoutManager.canScrollHorizontally()) {
            return 0;
        }
        int iA = a(layoutManager, a(layoutManager), i, 0);
        if (pointF.x < 0.0f) {
            iA = -iA;
        }
        if (i < 0) {
            iA = zBa ? width : -width;
        }
        if (i > 0) {
            return zBa ? -width : width;
        }
        return iA;
    }
}
