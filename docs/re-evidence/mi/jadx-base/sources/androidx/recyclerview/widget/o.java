package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class o extends x {
    public s d;
    public s e;

    @Override // androidx.recyclerview.widget.x
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = n(view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = n(view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.x
    public View h(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return p(oVar, r(oVar));
        }
        if (oVar.canScrollHorizontally()) {
            return p(oVar, q(oVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.x
    public int i(RecyclerView.o oVar, int i, int i2) {
        int itemCount;
        View viewH;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iO;
        int iO2;
        if (!(oVar instanceof RecyclerView.y.b) || (itemCount = oVar.getItemCount()) == 0 || (viewH = h(oVar)) == null || (position = oVar.getPosition(viewH)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.y.b) oVar).computeScrollVectorForPosition((i3 = itemCount - 1))) == null) {
            return -1;
        }
        if (oVar.canScrollHorizontally()) {
            iO = o(oVar, q(oVar), i, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iO = -iO;
            }
        } else {
            iO = 0;
        }
        if (oVar.canScrollVertically()) {
            iO2 = o(oVar, r(oVar), 0, i2);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iO2 = -iO2;
            }
        } else {
            iO2 = 0;
        }
        if (oVar.canScrollVertically()) {
            iO = iO2;
        }
        if (iO == 0) {
            return -1;
        }
        int i4 = position + iO;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= itemCount ? i3 : i5;
    }

    public final float m(RecyclerView.o oVar, s sVar) {
        int childCount = oVar.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = oVar.getChildAt(i3);
            int position = oVar.getPosition(childAt);
            if (position != -1) {
                if (position < i2) {
                    view = childAt;
                    i2 = position;
                }
                if (position > i) {
                    view2 = childAt;
                    i = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(sVar.d(view), sVar.d(view2)) - Math.min(sVar.g(view), sVar.g(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i - i2) + 1);
    }

    public final int n(View view, s sVar) {
        return (sVar.g(view) + (sVar.e(view) / 2)) - (sVar.m() + (sVar.n() / 2));
    }

    public final int o(RecyclerView.o oVar, s sVar, int i, int i2) {
        int[] iArrD = d(i, i2);
        float fM = m(oVar, sVar);
        if (fM <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrD[0]) > Math.abs(iArrD[1]) ? iArrD[0] : iArrD[1]) / fM);
    }

    public final View p(RecyclerView.o oVar, s sVar) {
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

    public final s q(RecyclerView.o oVar) {
        s sVar = this.e;
        if (sVar == null || sVar.f2958a != oVar) {
            this.e = s.a(oVar);
        }
        return this.e;
    }

    public final s r(RecyclerView.o oVar) {
        s sVar = this.d;
        if (sVar == null || sVar.f2958a != oVar) {
            this.d = s.c(oVar);
        }
        return this.d;
    }
}
