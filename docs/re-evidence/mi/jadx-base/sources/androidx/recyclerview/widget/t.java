package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class t extends x {
    public s d;
    public s e;

    public class a extends n {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.n
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.n, androidx.recyclerview.widget.RecyclerView.y
        public void onTargetFound(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            t tVar = t.this;
            int[] iArrC = tVar.c(tVar.f2965a.getLayoutManager(), view);
            int i = iArrC[0];
            int i2 = iArrC[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private int m(View view, s sVar) {
        return (sVar.g(view) + (sVar.e(view) / 2)) - (sVar.m() + (sVar.n() / 2));
    }

    private View n(RecyclerView.o oVar, s sVar) {
        int childCount = oVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iM = sVar.m() + (sVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = oVar.getChildAt(i2);
            int iAbs = Math.abs((sVar.g(childAt) + (sVar.e(childAt) / 2)) - iM);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    private s o(RecyclerView.o oVar) {
        s sVar = this.e;
        if (sVar == null || sVar.f2958a != oVar) {
            this.e = s.a(oVar);
        }
        return this.e;
    }

    private s q(RecyclerView.o oVar) {
        s sVar = this.d;
        if (sVar == null || sVar.f2958a != oVar) {
            this.d = s.c(oVar);
        }
        return this.d;
    }

    @Override // androidx.recyclerview.widget.x
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = m(view, o(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = m(view, q(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.x
    public RecyclerView.y e(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new a(this.f2965a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public View h(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return n(oVar, q(oVar));
        }
        if (oVar.canScrollHorizontally()) {
            return n(oVar, o(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public int i(RecyclerView.o oVar, int i, int i2) {
        s sVarP;
        int itemCount = oVar.getItemCount();
        if (itemCount == 0 || (sVarP = p(oVar)) == null) {
            return -1;
        }
        int childCount = oVar.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = oVar.getChildAt(i5);
            if (childAt != null) {
                int iM = m(childAt, sVarP);
                if (iM <= 0 && iM > i4) {
                    view2 = childAt;
                    i4 = iM;
                }
                if (iM >= 0 && iM < i3) {
                    view = childAt;
                    i3 = iM;
                }
            }
        }
        boolean zR = r(oVar, i, i2);
        if (zR && view != null) {
            return oVar.getPosition(view);
        }
        if (!zR && view2 != null) {
            return oVar.getPosition(view2);
        }
        if (zR) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = oVar.getPosition(view) + (s(oVar) == zR ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public final s p(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return q(oVar);
        }
        if (oVar.canScrollHorizontally()) {
            return o(oVar);
        }
        return null;
    }

    public final boolean r(RecyclerView.o oVar, int i, int i2) {
        if (oVar.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s(RecyclerView.o oVar) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = oVar.getItemCount();
        if (!(oVar instanceof RecyclerView.y.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.y.b) oVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }
}
