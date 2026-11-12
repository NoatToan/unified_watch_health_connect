package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f10445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f10446b;

    public class a extends w {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.w
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.w
        public final int calculateTimeForScrolling(int i14) {
            return Math.min(100, super.calculateTimeForScrolling(i14));
        }

        @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.a0
        public final void onTargetFound(View view2, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            e0 e0Var = e0.this;
            int[] iArrCalculateDistanceToFinalSnap = e0Var.calculateDistanceToFinalSnap(e0Var.mRecyclerView.getLayoutManager(), view2);
            int i14 = iArrCalculateDistanceToFinalSnap[0];
            int i15 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i14), Math.abs(i15)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.b(i14, i15, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    public static int a(View view2, d0 d0Var) {
        return ((d0Var.c(view2) / 2) + d0Var.e(view2)) - ((d0Var.l() / 2) + d0Var.k());
    }

    public static View b(RecyclerView.p pVar, d0 d0Var) {
        int childCount = pVar.getChildCount();
        View view2 = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (d0Var.l() / 2) + d0Var.k();
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = pVar.getChildAt(i15);
            int iAbs = Math.abs(((d0Var.c(childAt) / 2) + d0Var.e(childAt)) - iL);
            if (iAbs < i14) {
                view2 = childAt;
                i14 = iAbs;
            }
        }
        return view2;
    }

    public final d0 c(RecyclerView.p pVar) {
        b0 b0Var = this.f10446b;
        if (b0Var == null || b0Var.f10437a != pVar) {
            this.f10446b = new b0(pVar);
        }
        return this.f10446b;
    }

    @Override // androidx.recyclerview.widget.i0
    public final int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view2) {
        int[] iArr = new int[2];
        if (pVar.canScrollHorizontally()) {
            iArr[0] = a(view2, c(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.canScrollVertically()) {
            iArr[1] = a(view2, d(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.i0
    public final RecyclerView.a0 createScroller(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new a(this.mRecyclerView.getContext());
        }
        return null;
    }

    public final d0 d(RecyclerView.p pVar) {
        c0 c0Var = this.f10445a;
        if (c0Var == null || c0Var.f10437a != pVar) {
            this.f10445a = new c0(pVar);
        }
        return this.f10445a;
    }

    @Override // androidx.recyclerview.widget.i0
    @SuppressLint({"UnknownNullness"})
    public View findSnapView(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return b(pVar, d(pVar));
        }
        if (pVar.canScrollHorizontally()) {
            return b(pVar, c(pVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.i0
    @SuppressLint({"UnknownNullness"})
    public final int findTargetSnapPosition(RecyclerView.p pVar, int i14, int i15) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = pVar.getItemCount();
        if (itemCount != 0) {
            View view2 = null;
            d0 d0VarD = pVar.canScrollVertically() ? d(pVar) : pVar.canScrollHorizontally() ? c(pVar) : null;
            if (d0VarD != null) {
                int childCount = pVar.getChildCount();
                boolean z14 = false;
                int i16 = Integer.MAX_VALUE;
                int i17 = Integer.MIN_VALUE;
                View view3 = null;
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = pVar.getChildAt(i18);
                    if (childAt != null) {
                        int iA = a(childAt, d0VarD);
                        if (iA <= 0 && iA > i17) {
                            view3 = childAt;
                            i17 = iA;
                        }
                        if (iA >= 0 && iA < i16) {
                            view2 = childAt;
                            i16 = iA;
                        }
                    }
                }
                boolean z15 = !pVar.canScrollHorizontally() ? i15 <= 0 : i14 <= 0;
                if (z15 && view2 != null) {
                    return pVar.getPosition(view2);
                }
                if (!z15 && view3 != null) {
                    return pVar.getPosition(view3);
                }
                if (z15) {
                    view2 = view3;
                }
                if (view2 != null) {
                    int position = pVar.getPosition(view2);
                    int itemCount2 = pVar.getItemCount();
                    if ((pVar instanceof RecyclerView.a0.b) && (pointFComputeScrollVectorForPosition = ((RecyclerView.a0.b) pVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z14 = true;
                    }
                    int i19 = position + (z14 == z15 ? -1 : 1);
                    if (i19 >= 0 && i19 < itemCount) {
                        return i19;
                    }
                }
            }
        }
        return -1;
    }
}
