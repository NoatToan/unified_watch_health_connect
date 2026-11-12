package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import i3.e5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f10243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View[] f10244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f10245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseIntArray f10246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f10247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f10248h;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int b(int i14, int i15) {
            return i14 % i15;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i14) {
            return 1;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f10251a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseIntArray f10252b = new SparseIntArray();

        public final int a(int i14, int i15) {
            int iC = c(i14);
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                int iC2 = c(i18);
                i16 += iC2;
                if (i16 == i15) {
                    i17++;
                    i16 = 0;
                } else if (i16 > i15) {
                    i17++;
                    i16 = iC2;
                }
            }
            return i16 + iC > i15 ? i17 + 1 : i17;
        }

        public int b(int i14, int i15) {
            int iC = c(i14);
            if (iC == i15) {
                return 0;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                int iC2 = c(i17);
                i16 += iC2;
                if (i16 == i15) {
                    i16 = 0;
                } else if (i16 > i15) {
                    i16 = iC2;
                }
            }
            if (iC + i16 <= i15) {
                return i16;
            }
            return 0;
        }

        public abstract int c(int i14);

        public final void d() {
            this.f10251a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.f10241a = false;
        this.f10242b = -1;
        this.f10245e = new SparseIntArray();
        this.f10246f = new SparseIntArray();
        this.f10247g = new a();
        this.f10248h = new Rect();
        h(RecyclerView.p.getProperties(context, attributeSet, i14, i15).f10326b);
    }

    public final void a(int i14) {
        int i15;
        int[] iArr = this.f10243c;
        int i16 = this.f10242b;
        if (iArr == null || iArr.length != i16 + 1 || iArr[iArr.length - 1] != i14) {
            iArr = new int[i16 + 1];
        }
        int i17 = 0;
        iArr[0] = 0;
        int i18 = i14 / i16;
        int i19 = i14 % i16;
        int i24 = 0;
        for (int i25 = 1; i25 <= i16; i25++) {
            i17 += i19;
            if (i17 <= 0 || i16 - i17 >= i19) {
                i15 = i18;
            } else {
                i15 = i18 + 1;
                i17 -= i16;
            }
            i24 += i15;
            iArr[i25] = i24;
        }
        this.f10243c = iArr;
    }

    public final void b() {
        View[] viewArr = this.f10244d;
        if (viewArr == null || viewArr.length != this.f10242b) {
            this.f10244d = new View[this.f10242b];
        }
    }

    public final int c(int i14, int i15) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f10243c;
            return iArr[i15 + i14] - iArr[i14];
        }
        int[] iArr2 = this.f10243c;
        int i16 = this.f10242b;
        return iArr2[i16 - i14] - iArr2[(i16 - i14) - i15];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i14;
        int iC = this.f10242b;
        for (int i15 = 0; i15 < this.f10242b && (i14 = cVar.f10265d) >= 0 && i14 < b0Var.b() && iC > 0; i15++) {
            int i16 = cVar.f10265d;
            ((r.b) cVar2).a(i16, Math.max(0, cVar.f10268g));
            iC -= this.f10247g.c(i16);
            cVar.f10265d += cVar.f10266e;
        }
    }

    public final int d(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (!b0Var.f10291g) {
            return this.f10247g.a(i14, this.f10242b);
        }
        int iC = wVar.c(i14);
        if (iC == -1) {
            return 0;
        }
        return this.f10247g.a(iC, this.f10242b);
    }

    public final int e(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (!b0Var.f10291g) {
            return this.f10247g.b(i14, this.f10242b);
        }
        int i15 = this.f10246f.get(i14, -1);
        if (i15 != -1) {
            return i15;
        }
        int iC = wVar.c(i14);
        if (iC == -1) {
            return 0;
        }
        return this.f10247g.b(iC, this.f10242b);
    }

    public final int f(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (!b0Var.f10291g) {
            return this.f10247g.c(i14);
        }
        int i15 = this.f10245e.get(i14, -1);
        if (i15 != -1) {
            return i15;
        }
        int iC = wVar.c(i14);
        if (iC == -1) {
            return 1;
        }
        return this.f10247g.c(iC);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z14, boolean z15) {
        int i14;
        int childCount;
        int childCount2 = getChildCount();
        int i15 = 1;
        if (z15) {
            childCount = getChildCount() - 1;
            i14 = -1;
            i15 = -1;
        } else {
            i14 = childCount2;
            childCount = 0;
        }
        int iB = b0Var.b();
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view2 = null;
        View view3 = null;
        while (childCount != i14) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && e(position, wVar, b0Var) == 0) {
                if (((RecyclerView.q) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view3 == null) {
                        view3 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < iG && this.mOrientationHelper.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view2 == null) {
                        view2 = childAt;
                    }
                }
            }
            childCount += i15;
        }
        return view2 != null ? view2 : view3;
    }

    public final void g(View view2, int i14, boolean z14) {
        int childMeasureSpec;
        int childMeasureSpec2;
        b bVar = (b) view2.getLayoutParams();
        Rect rect = bVar.mDecorInsets;
        int i15 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i16 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iC = c(bVar.f10249a, bVar.f10250b);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.p.getChildMeasureSpec(iC, i14, i16, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            childMeasureSpec = RecyclerView.p.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i15, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.p.getChildMeasureSpec(iC, i14, i15, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec4 = RecyclerView.p.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i16, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        if (z14 ? shouldReMeasureChild(view2, childMeasureSpec2, childMeasureSpec, qVar) : shouldMeasureChild(view2, childMeasureSpec2, childMeasureSpec, qVar)) {
            view2.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getColumnCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 1) {
            return this.f10242b;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return d(b0Var.b() - 1, wVar, b0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getRowCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 0) {
            return this.f10242b;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return d(b0Var.b() - 1, wVar, b0Var) + 1;
    }

    public final void h(int i14) {
        if (i14 == this.f10242b) {
            return;
        }
        this.f10241a = true;
        if (i14 < 1) {
            vb.h.s(am.j.h(i14, "Span count should be at least 1. Provided "));
            return;
        }
        this.f10242b = i14;
        this.f10247g.d();
        requestLayout();
    }

    public final void i() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        a(height - paddingTop);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0239  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i14;
        int i15;
        int i16;
        int paddingLeft;
        int i17;
        int paddingTop;
        int iD;
        int paddingLeft2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z14;
        int i18;
        View viewB;
        GridLayoutManager gridLayoutManager = this;
        int iJ = gridLayoutManager.mOrientationHelper.j();
        boolean z15 = iJ != 1073741824;
        int i19 = gridLayoutManager.getChildCount() > 0 ? gridLayoutManager.f10243c[gridLayoutManager.f10242b] : 0;
        if (z15) {
            gridLayoutManager.i();
        }
        boolean z16 = cVar.f10266e == 1;
        int iE = gridLayoutManager.f10242b;
        if (!z16) {
            iE = gridLayoutManager.e(cVar.f10265d, wVar, b0Var) + gridLayoutManager.f(cVar.f10265d, wVar, b0Var);
        }
        int i24 = 0;
        while (i24 < gridLayoutManager.f10242b && (i18 = cVar.f10265d) >= 0 && i18 < b0Var.b() && iE > 0) {
            int i25 = cVar.f10265d;
            int iF = gridLayoutManager.f(i25, wVar, b0Var);
            if (iF > gridLayoutManager.f10242b) {
                vb.h.s(am.j.q(e5.j(i25, iF, "Item at position ", " requires ", " spans but GridLayoutManager has only "), gridLayoutManager.f10242b, " spans."));
                return;
            }
            iE -= iF;
            if (iE < 0 || (viewB = cVar.b(wVar)) == null) {
                break;
            }
            gridLayoutManager.f10244d[i24] = viewB;
            i24++;
        }
        if (i24 == 0) {
            bVar.f10259b = true;
            return;
        }
        if (z16) {
            i16 = 1;
            i15 = i24;
            i14 = 0;
        } else {
            i14 = i24 - 1;
            i15 = -1;
            i16 = -1;
        }
        int i26 = 0;
        while (i14 != i15) {
            View view2 = gridLayoutManager.f10244d[i14];
            b bVar2 = (b) view2.getLayoutParams();
            int iF2 = gridLayoutManager.f(gridLayoutManager.getPosition(view2), wVar, b0Var);
            bVar2.f10250b = iF2;
            bVar2.f10249a = i26;
            i26 += iF2;
            i14 += i16;
        }
        float f14 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i24; i28++) {
            View view3 = gridLayoutManager.f10244d[i28];
            if (cVar.f10272k != null) {
                z14 = false;
                if (z16) {
                    gridLayoutManager.addDisappearingView(view3);
                } else {
                    gridLayoutManager.addDisappearingView(view3, 0);
                }
            } else if (z16) {
                gridLayoutManager.addView(view3);
                z14 = false;
            } else {
                z14 = false;
                gridLayoutManager.addView(view3, 0);
            }
            gridLayoutManager.calculateItemDecorationsForChild(view3, gridLayoutManager.f10248h);
            gridLayoutManager.g(view3, iJ, z14);
            int iC = gridLayoutManager.mOrientationHelper.c(view3);
            if (iC > i27) {
                i27 = iC;
            }
            float fD = (gridLayoutManager.mOrientationHelper.d(view3) * 1.0f) / ((b) view3.getLayoutParams()).f10250b;
            if (fD > f14) {
                f14 = fD;
            }
        }
        if (z15) {
            gridLayoutManager.a(Math.max(Math.round(f14 * gridLayoutManager.f10242b), i19));
            i27 = 0;
            for (int i29 = 0; i29 < i24; i29++) {
                View view4 = gridLayoutManager.f10244d[i29];
                gridLayoutManager.g(view4, 1073741824, true);
                int iC2 = gridLayoutManager.mOrientationHelper.c(view4);
                if (iC2 > i27) {
                    i27 = iC2;
                }
            }
        }
        for (int i30 = 0; i30 < i24; i30++) {
            View view5 = gridLayoutManager.f10244d[i30];
            if (gridLayoutManager.mOrientationHelper.c(view5) != i27) {
                b bVar3 = (b) view5.getLayoutParams();
                Rect rect = bVar3.mDecorInsets;
                int i34 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i35 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iC3 = gridLayoutManager.c(bVar3.f10249a, bVar3.f10250b);
                if (gridLayoutManager.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.p.getChildMeasureSpec(iC3, 1073741824, i35, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i34, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i35, 1073741824);
                    childMeasureSpec = RecyclerView.p.getChildMeasureSpec(iC3, 1073741824, i34, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (gridLayoutManager.shouldReMeasureChild(view5, childMeasureSpec2, childMeasureSpec, (RecyclerView.q) view5.getLayoutParams())) {
                    view5.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        int i36 = 0;
        bVar.f10258a = i27;
        int i37 = gridLayoutManager.mOrientation;
        int i38 = cVar.f10267f;
        int iD2 = cVar.f10263b;
        if (i37 != 1) {
            if (i38 == -1) {
                i17 = iD2 - i27;
                paddingLeft = iD2;
            } else {
                paddingLeft = iD2 + i27;
                i17 = iD2;
            }
            paddingTop = 0;
            iD2 = 0;
        } else if (i38 == -1) {
            paddingTop = iD2 - i27;
            i17 = 0;
            paddingLeft = 0;
        } else {
            paddingTop = iD2;
            paddingLeft = 0;
            iD2 += i27;
            i17 = 0;
        }
        while (true) {
            View[] viewArr = gridLayoutManager.f10244d;
            if (i36 >= i24) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int iD3 = i17;
            View view6 = viewArr[i36];
            b bVar4 = (b) view6.getLayoutParams();
            if (gridLayoutManager.mOrientation == 1) {
                if (gridLayoutManager.isLayoutRTL()) {
                    paddingLeft = gridLayoutManager.getPaddingLeft() + gridLayoutManager.f10243c[gridLayoutManager.f10242b - bVar4.f10249a];
                    iD3 = paddingLeft - gridLayoutManager.mOrientationHelper.d(view6);
                } else {
                    paddingLeft2 = gridLayoutManager.getPaddingLeft() + gridLayoutManager.f10243c[bVar4.f10249a];
                    iD = gridLayoutManager.mOrientationHelper.d(view6) + paddingLeft2;
                }
                int i39 = iD2;
                gridLayoutManager.layoutDecoratedWithMargins(view6, paddingLeft2, paddingTop, iD, i39);
                i17 = paddingLeft2;
                paddingLeft = iD;
                iD2 = i39;
                if (bVar4.isItemRemoved() || bVar4.isItemChanged()) {
                    bVar.f10260c = true;
                }
                bVar.f10261d = view6.hasFocusable() | bVar.f10261d;
                i36++;
                gridLayoutManager = this;
            } else {
                paddingTop = gridLayoutManager.getPaddingTop() + gridLayoutManager.f10243c[bVar4.f10249a];
                iD2 = gridLayoutManager.mOrientationHelper.d(view6) + paddingTop;
            }
            iD = paddingLeft;
            paddingLeft2 = iD3;
            int i310 = iD2;
            gridLayoutManager.layoutDecoratedWithMargins(view6, paddingLeft2, paddingTop, iD, i310);
            i17 = paddingLeft2;
            paddingLeft = iD;
            iD2 = i310;
            if (bVar4.isItemRemoved()) {
                bVar.f10260c = true;
            } else {
                bVar.f10260c = true;
            }
            bVar.f10261d = view6.hasFocusable() | bVar.f10261d;
            i36++;
            gridLayoutManager = this;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i14) {
        super.onAnchorReady(wVar, b0Var, aVar, i14);
        i();
        if (b0Var.b() > 0 && !b0Var.f10291g) {
            boolean z14 = i14 == 1;
            int iE = e(aVar.f10254b, wVar, b0Var);
            if (z14) {
                while (iE > 0) {
                    int i15 = aVar.f10254b;
                    if (i15 <= 0) {
                        break;
                    }
                    int i16 = i15 - 1;
                    aVar.f10254b = i16;
                    iE = e(i16, wVar, b0Var);
                }
            } else {
                int iB = b0Var.b() - 1;
                int i17 = aVar.f10254b;
                while (i17 < iB) {
                    int i18 = i17 + 1;
                    int iE2 = e(i18, wVar, b0Var);
                    if (iE2 <= iE) {
                        break;
                    }
                    i17 = i18;
                    iE = iE2;
                }
                aVar.f10254b = i17;
            }
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view2, int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int childCount;
        int i15;
        int childCount2;
        View view3;
        View view4;
        View view5;
        int i16;
        int i17;
        int i18;
        boolean zHasFocusable;
        int i19;
        RecyclerView.w wVar2 = wVar;
        RecyclerView.b0 b0Var2 = b0Var;
        View viewFindContainingItemView = findContainingItemView(view2);
        View view6 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        b bVar = (b) viewFindContainingItemView.getLayoutParams();
        int i24 = bVar.f10249a;
        int i25 = bVar.f10250b + i24;
        if (super.onFocusSearchFailed(view2, i14, wVar, b0Var) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i14) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i15 = -1;
        } else {
            childCount = getChildCount();
            i15 = 1;
            childCount2 = 0;
        }
        boolean z14 = this.mOrientation == 1 && isLayoutRTL();
        int iD = d(childCount2, wVar2, b0Var2);
        int i26 = -1;
        int i27 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i28 = childCount2;
        View view7 = null;
        while (i28 != childCount) {
            int iD2 = d(i28, wVar2, b0Var2);
            View childAt = getChildAt(i28);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iD2 == iD) {
                b bVar2 = (b) childAt.getLayoutParams();
                int i29 = bVar2.f10249a;
                view3 = viewFindContainingItemView;
                int i30 = bVar2.f10250b + i29;
                if (childAt.hasFocusable() && i29 == i24 && i30 == i25) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view6 == null) && (childAt.hasFocusable() || view7 != null)) {
                    view4 = view6;
                    int iMin3 = Math.min(i30, i25) - Math.max(i29, i24);
                    if (!childAt.hasFocusable()) {
                        if (view4 == null) {
                            view5 = view7;
                            i16 = iMin;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                i17 = iMin2;
                                if (iMin3 > i17) {
                                    i18 = i27;
                                } else if (iMin3 == i17) {
                                    i18 = i27;
                                    if (z14 == (i29 > i18)) {
                                    }
                                    iMin = i16;
                                    view6 = view4;
                                    i28 += i15;
                                    wVar2 = wVar;
                                    b0Var2 = b0Var;
                                    viewFindContainingItemView = view3;
                                } else {
                                    i18 = i27;
                                }
                                zHasFocusable = childAt.hasFocusable();
                                i19 = bVar2.f10249a;
                                if (zHasFocusable) {
                                    iMin = Math.min(i30, i25) - Math.max(i29, i24);
                                    i27 = i18;
                                    iMin2 = i17;
                                    i26 = i19;
                                    view7 = view5;
                                    view6 = childAt;
                                } else {
                                    iMin2 = Math.min(i30, i25) - Math.max(i29, i24);
                                    view7 = childAt;
                                    i27 = i19;
                                    iMin = i16;
                                    view6 = view4;
                                }
                                i28 += i15;
                                wVar2 = wVar;
                                b0Var2 = b0Var;
                                viewFindContainingItemView = view3;
                            }
                            i27 = i18;
                            iMin2 = i17;
                            view7 = view5;
                            iMin = i16;
                            view6 = view4;
                            i28 += i15;
                            wVar2 = wVar;
                            b0Var2 = b0Var;
                            viewFindContainingItemView = view3;
                        }
                        i18 = i27;
                        i17 = iMin2;
                        i27 = i18;
                        iMin2 = i17;
                        view7 = view5;
                        iMin = i16;
                        view6 = view4;
                        i28 += i15;
                        wVar2 = wVar;
                        b0Var2 = b0Var;
                        viewFindContainingItemView = view3;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view4 = view6;
                }
                view5 = view7;
                i16 = iMin;
                i18 = i27;
                i17 = iMin2;
                zHasFocusable = childAt.hasFocusable();
                i19 = bVar2.f10249a;
                if (zHasFocusable) {
                    iMin = Math.min(i30, i25) - Math.max(i29, i24);
                    i27 = i18;
                    iMin2 = i17;
                    i26 = i19;
                    view7 = view5;
                    view6 = childAt;
                } else {
                    iMin2 = Math.min(i30, i25) - Math.max(i29, i24);
                    view7 = childAt;
                    i27 = i19;
                    iMin = i16;
                    view6 = view4;
                }
                i28 += i15;
                wVar2 = wVar;
                b0Var2 = b0Var;
                viewFindContainingItemView = view3;
            } else {
                if (view6 != null) {
                    break;
                }
                view3 = viewFindContainingItemView;
                view4 = view6;
            }
            view5 = view7;
            i16 = iMin;
            i18 = i27;
            i17 = iMin2;
            i27 = i18;
            iMin2 = i17;
            view7 = view5;
            iMin = i16;
            view6 = view4;
            i28 += i15;
            wVar2 = wVar;
            b0Var2 = b0Var;
            viewFindContainingItemView = view3;
        }
        View view8 = view6;
        return view8 != null ? view8 : view7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.b0 b0Var, l7.f fVar) {
        super.onInitializeAccessibilityNodeInfo(wVar, b0Var, fVar);
        fVar.n(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view2, l7.f fVar) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view2, fVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iD = d(bVar.getViewLayoutPosition(), wVar, b0Var);
        int i14 = this.mOrientation;
        int i15 = bVar.f10249a;
        int i16 = bVar.f10250b;
        if (i14 == 0) {
            fVar.q(l7.f.h.a(i15, i16, iD, 1, false, false));
        } else {
            fVar.q(l7.f.h.a(iD, 1, i15, i16, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsAdded(RecyclerView recyclerView, int i14, int i15) {
        this.f10247g.d();
        this.f10247g.f10252b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f10247g.d();
        this.f10247g.f10252b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsMoved(RecyclerView recyclerView, int i14, int i15, int i16) {
        this.f10247g.d();
        this.f10247g.f10252b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsRemoved(RecyclerView recyclerView, int i14, int i15) {
        this.f10247g.d();
        this.f10247g.f10252b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsUpdated(RecyclerView recyclerView, int i14, int i15, Object obj) {
        this.f10247g.d();
        this.f10247g.f10252b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        boolean z14 = b0Var.f10291g;
        SparseIntArray sparseIntArray = this.f10246f;
        SparseIntArray sparseIntArray2 = this.f10245e;
        if (z14) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                b bVar = (b) getChildAt(i14).getLayoutParams();
                int viewLayoutPosition = bVar.getViewLayoutPosition();
                sparseIntArray2.put(viewLayoutPosition, bVar.f10250b);
                sparseIntArray.put(viewLayoutPosition, bVar.f10249a);
            }
        }
        super.onLayoutChildren(wVar, b0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.f10241a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int scrollHorizontallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        i();
        b();
        return super.scrollHorizontallyBy(i14, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int scrollVerticallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        i();
        b();
        return super.scrollVerticallyBy(i14, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void setMeasuredDimension(Rect rect, int i14, int i15) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f10243c == null) {
            super.setMeasuredDimension(rect, i14, i15);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.p.chooseSize(i15, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f10243c;
            iChooseSize = RecyclerView.p.chooseSize(i14, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.p.chooseSize(i14, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f10243c;
            iChooseSize2 = RecyclerView.p.chooseSize(i15, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z14) {
        if (z14) {
            org.apache.commons.lang3.e.w("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f10241a;
    }

    public static class b extends RecyclerView.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10250b;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10249a = -1;
            this.f10250b = 0;
        }

        public b(int i14, int i15) {
            super(i14, i15);
            this.f10249a = -1;
            this.f10250b = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10249a = -1;
            this.f10250b = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10249a = -1;
            this.f10250b = 0;
        }

        public b(RecyclerView.q qVar) {
            super(qVar);
            this.f10249a = -1;
            this.f10250b = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public GridLayoutManager(Context context, int i14) {
        super(context);
        this.f10241a = false;
        this.f10242b = -1;
        this.f10245e = new SparseIntArray();
        this.f10246f = new SparseIntArray();
        this.f10247g = new a();
        this.f10248h = new Rect();
        h(i14);
    }

    public GridLayoutManager(Context context, int i14, int i15, boolean z14) {
        super(context, i15, z14);
        this.f10241a = false;
        this.f10242b = -1;
        this.f10245e = new SparseIntArray();
        this.f10246f = new SparseIntArray();
        this.f10247g = new a();
        this.f10248h = new Rect();
        h(i14);
    }
}
