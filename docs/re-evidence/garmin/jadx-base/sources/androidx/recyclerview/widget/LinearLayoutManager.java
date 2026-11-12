package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements s.h, RecyclerView.a0.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    d0 mOrientationHelper;
    d mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d0 f10253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f10257e;

        public a() {
            c();
        }

        public final void a() {
            boolean z14 = this.f10256d;
            d0 d0Var = this.f10253a;
            this.f10255c = z14 ? d0Var.g() : d0Var.k();
        }

        public final void b(int i14, View view2) {
            int iM = this.f10253a.m();
            if (iM >= 0) {
                boolean z14 = this.f10256d;
                d0 d0Var = this.f10253a;
                if (z14) {
                    this.f10255c = this.f10253a.m() + d0Var.b(view2);
                } else {
                    this.f10255c = d0Var.e(view2);
                }
                this.f10254b = i14;
                return;
            }
            this.f10254b = i14;
            boolean z15 = this.f10256d;
            d0 d0Var2 = this.f10253a;
            if (!z15) {
                int iE = d0Var2.e(view2);
                int iK = iE - this.f10253a.k();
                this.f10255c = iE;
                if (iK > 0) {
                    int iG = (this.f10253a.g() - Math.min(0, (this.f10253a.g() - iM) - this.f10253a.b(view2))) - (this.f10253a.c(view2) + iE);
                    if (iG < 0) {
                        this.f10255c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (d0Var2.g() - iM) - this.f10253a.b(view2);
            this.f10255c = this.f10253a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.f10255c - this.f10253a.c(view2);
                int iK2 = this.f10253a.k();
                int iMin = iC - (Math.min(this.f10253a.e(view2) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.f10255c = Math.min(iG2, -iMin) + this.f10255c;
                }
            }
        }

        public final void c() {
            this.f10254b = -1;
            this.f10255c = Integer.MIN_VALUE;
            this.f10256d = false;
            this.f10257e = false;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("AnchorInfo{mPosition=");
            sb3.append(this.f10254b);
            sb3.append(", mCoordinate=");
            sb3.append(this.f10255c);
            sb3.append(", mLayoutFromEnd=");
            sb3.append(this.f10256d);
            sb3.append(", mValid=");
            return am.j.t(sb3, this.f10257e, CoreConstants.CURLY_RIGHT);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f10259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10261d;
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10265d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10268g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f10271j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f10273l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10262a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f10269h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10270i = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<RecyclerView.f0> f10272k = null;

        public final void a(View view2) {
            int viewLayoutPosition;
            int size = this.f10272k.size();
            View view3 = null;
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < size; i15++) {
                View view4 = this.f10272k.get(i15).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view4.getLayoutParams();
                if (view4 != view2 && !qVar.isItemRemoved() && (viewLayoutPosition = (qVar.getViewLayoutPosition() - this.f10265d) * this.f10266e) >= 0 && viewLayoutPosition < i14) {
                    view3 = view4;
                    if (viewLayoutPosition == 0) {
                        break;
                    } else {
                        i14 = viewLayoutPosition;
                    }
                }
            }
            if (view3 == null) {
                this.f10265d = -1;
            } else {
                this.f10265d = ((RecyclerView.q) view3.getLayoutParams()).getViewLayoutPosition();
            }
        }

        public final View b(RecyclerView.w wVar) {
            List<RecyclerView.f0> list = this.f10272k;
            if (list == null) {
                View viewE = wVar.e(this.f10265d);
                this.f10265d += this.f10266e;
                return viewE;
            }
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view2 = this.f10272k.get(i14).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
                if (!qVar.isItemRemoved() && this.f10265d == qVar.getViewLayoutPosition()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i14, int i15) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i14, i15);
        setOrientation(properties.f10325a);
        setReverseLayout(properties.f10327c);
        setStackFromEnd(properties.f10328d);
    }

    private int computeScrollExtent(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return g0.a(b0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return g0.b(b0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return g0.c(b0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z14) {
        int iG;
        int iG2 = this.mOrientationHelper.g() - i14;
        if (iG2 <= 0) {
            return 0;
        }
        int i15 = -scrollBy(-iG2, wVar, b0Var);
        int i16 = i14 + i15;
        if (!z14 || (iG = this.mOrientationHelper.g() - i16) <= 0) {
            return i15;
        }
        this.mOrientationHelper.p(iG);
        return iG + i15;
    }

    private int fixLayoutStartGap(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z14) {
        int iK;
        int iK2 = i14 - this.mOrientationHelper.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i15 = -scrollBy(iK2, wVar, b0Var);
        int i16 = i14 + i15;
        if (!z14 || (iK = i16 - this.mOrientationHelper.k()) <= 0) {
            return i15;
        }
        this.mOrientationHelper.p(-iK);
        return i15 - iK;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i14, int i15) {
        if (!b0Var.f10295k || getChildCount() == 0 || b0Var.f10291g || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.f0> list = wVar.f10339d;
        int size = list.size();
        int position = getPosition(getChildAt(0));
        int iC = 0;
        int iC2 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            RecyclerView.f0 f0Var = list.get(i16);
            if (!f0Var.isRemoved()) {
                boolean z14 = f0Var.getLayoutPosition() < position;
                boolean z15 = this.mShouldReverseLayout;
                d0 d0Var = this.mOrientationHelper;
                View view2 = f0Var.itemView;
                if (z14 != z15) {
                    iC += d0Var.c(view2);
                } else {
                    iC2 += d0Var.c(view2);
                }
            }
        }
        this.mLayoutState.f10272k = list;
        if (iC > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i14);
            c cVar = this.mLayoutState;
            cVar.f10269h = iC;
            cVar.f10264c = 0;
            cVar.a(null);
            fill(wVar, this.mLayoutState, b0Var, false);
        }
        if (iC2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i15);
            c cVar2 = this.mLayoutState;
            cVar2.f10269h = iC2;
            cVar2.f10264c = 0;
            cVar2.a(null);
            fill(wVar, this.mLayoutState, b0Var, false);
        }
        this.mLayoutState.f10272k = null;
    }

    private void logChildren() {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            getPosition(childAt);
            this.mOrientationHelper.e(childAt);
        }
    }

    private void recycleByLayoutState(RecyclerView.w wVar, c cVar) {
        if (!cVar.f10262a || cVar.f10273l) {
            return;
        }
        int i14 = cVar.f10268g;
        int i15 = cVar.f10270i;
        if (cVar.f10267f == -1) {
            recycleViewsFromEnd(wVar, i14, i15);
        } else {
            recycleViewsFromStart(wVar, i14, i15);
        }
    }

    private void recycleChildren(RecyclerView.w wVar, int i14, int i15) {
        if (i14 == i15) {
            return;
        }
        if (i15 <= i14) {
            while (i14 > i15) {
                removeAndRecycleViewAt(i14, wVar);
                i14--;
            }
        } else {
            for (int i16 = i15 - 1; i16 >= i14; i16--) {
                removeAndRecycleViewAt(i16, wVar);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.w wVar, int i14, int i15) {
        int childCount = getChildCount();
        if (i14 < 0) {
            return;
        }
        int iF = (this.mOrientationHelper.f() - i14) + i15;
        if (this.mShouldReverseLayout) {
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                if (this.mOrientationHelper.e(childAt) < iF || this.mOrientationHelper.o(childAt) < iF) {
                    recycleChildren(wVar, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = childCount - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View childAt2 = getChildAt(i18);
            if (this.mOrientationHelper.e(childAt2) < iF || this.mOrientationHelper.o(childAt2) < iF) {
                recycleChildren(wVar, i17, i18);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.w wVar, int i14, int i15) {
        if (i14 < 0) {
            return;
        }
        int i16 = i14 - i15;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                if (this.mOrientationHelper.b(childAt) > i16 || this.mOrientationHelper.n(childAt) > i16) {
                    recycleChildren(wVar, 0, i17);
                    return;
                }
            }
            return;
        }
        int i18 = childCount - 1;
        for (int i19 = i18; i19 >= 0; i19--) {
            View childAt2 = getChildAt(i19);
            if (this.mOrientationHelper.b(childAt2) > i16 || this.mOrientationHelper.n(childAt2) > i16) {
                recycleChildren(wVar, i18, i19);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View viewFindReferenceChild;
        boolean z14 = false;
        if (getChildCount() != 0) {
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                aVar.getClass();
                RecyclerView.q qVar = (RecyclerView.q) focusedChild.getLayoutParams();
                if (!qVar.isItemRemoved() && qVar.getViewLayoutPosition() >= 0 && qVar.getViewLayoutPosition() < b0Var.b()) {
                    aVar.b(getPosition(focusedChild), focusedChild);
                    return true;
                }
            }
            boolean z15 = this.mLastStackFromEnd;
            boolean z16 = this.mStackFromEnd;
            if (z15 == z16 && (viewFindReferenceChild = findReferenceChild(wVar, b0Var, aVar.f10256d, z16)) != null) {
                int position = getPosition(viewFindReferenceChild);
                boolean z17 = aVar.f10256d;
                d0 d0Var = aVar.f10253a;
                if (z17) {
                    aVar.f10255c = aVar.f10253a.m() + d0Var.b(viewFindReferenceChild);
                } else {
                    aVar.f10255c = d0Var.e(viewFindReferenceChild);
                }
                aVar.f10254b = position;
                if (!b0Var.f10291g && supportsPredictiveItemAnimations()) {
                    int iE = this.mOrientationHelper.e(viewFindReferenceChild);
                    int iB = this.mOrientationHelper.b(viewFindReferenceChild);
                    int iK = this.mOrientationHelper.k();
                    int iG = this.mOrientationHelper.g();
                    boolean z18 = iB <= iK && iE < iK;
                    if (iE >= iG && iB > iG) {
                        z14 = true;
                    }
                    if (z18 || z14) {
                        if (aVar.f10256d) {
                            iK = iG;
                        }
                        aVar.f10255c = iK;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.b0 b0Var, a aVar) {
        int i14;
        if (!b0Var.f10291g && (i14 = this.mPendingScrollPosition) != -1) {
            if (i14 >= 0 && i14 < b0Var.b()) {
                int i15 = this.mPendingScrollPosition;
                aVar.f10254b = i15;
                d dVar = this.mPendingSavedState;
                if (dVar != null && dVar.f10274a >= 0) {
                    boolean z14 = dVar.f10276c;
                    aVar.f10256d = z14;
                    d0 d0Var = this.mOrientationHelper;
                    if (z14) {
                        aVar.f10255c = d0Var.g() - this.mPendingSavedState.f10275b;
                        return true;
                    }
                    aVar.f10255c = d0Var.k() + this.mPendingSavedState.f10275b;
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z15 = this.mShouldReverseLayout;
                    aVar.f10256d = z15;
                    d0 d0Var2 = this.mOrientationHelper;
                    if (z15) {
                        aVar.f10255c = d0Var2.g() - this.mPendingScrollPositionOffset;
                        return true;
                    }
                    aVar.f10255c = d0Var2.k() + this.mPendingScrollPositionOffset;
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(i15);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f10256d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                    return true;
                }
                if (this.mOrientationHelper.c(viewFindViewByPosition) > this.mOrientationHelper.l()) {
                    aVar.a();
                    return true;
                }
                int iE = this.mOrientationHelper.e(viewFindViewByPosition) - this.mOrientationHelper.k();
                d0 d0Var3 = this.mOrientationHelper;
                if (iE < 0) {
                    aVar.f10255c = d0Var3.k();
                    aVar.f10256d = false;
                    return true;
                }
                if (d0Var3.g() - this.mOrientationHelper.b(viewFindViewByPosition) < 0) {
                    aVar.f10255c = this.mOrientationHelper.g();
                    aVar.f10256d = true;
                    return true;
                }
                boolean z16 = aVar.f10256d;
                d0 d0Var4 = this.mOrientationHelper;
                aVar.f10255c = z16 ? this.mOrientationHelper.m() + d0Var4.b(viewFindViewByPosition) : d0Var4.e(viewFindViewByPosition);
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (updateAnchorFromPendingData(b0Var, aVar) || updateAnchorFromChildren(wVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f10254b = this.mStackFromEnd ? b0Var.b() - 1 : 0;
    }

    private void updateLayoutState(int i14, int i15, boolean z14, RecyclerView.b0 b0Var) {
        int iK;
        this.mLayoutState.f10273l = resolveIsInfinite();
        this.mLayoutState.f10267f = i14;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(b0Var, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z15 = i14 == 1;
        c cVar = this.mLayoutState;
        int i16 = z15 ? iMax2 : iMax;
        cVar.f10269h = i16;
        if (!z15) {
            iMax = iMax2;
        }
        cVar.f10270i = iMax;
        if (z15) {
            cVar.f10269h = this.mOrientationHelper.h() + i16;
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            cVar2.f10266e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.f10265d = position + cVar3.f10266e;
            cVar3.f10263b = this.mOrientationHelper.b(childClosestToEnd);
            iK = this.mOrientationHelper.b(childClosestToEnd) - this.mOrientationHelper.g();
        } else {
            View childClosestToStart = getChildClosestToStart();
            c cVar4 = this.mLayoutState;
            cVar4.f10269h = this.mOrientationHelper.k() + cVar4.f10269h;
            c cVar5 = this.mLayoutState;
            cVar5.f10266e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            c cVar6 = this.mLayoutState;
            cVar5.f10265d = position2 + cVar6.f10266e;
            cVar6.f10263b = this.mOrientationHelper.e(childClosestToStart);
            iK = (-this.mOrientationHelper.e(childClosestToStart)) + this.mOrientationHelper.k();
        }
        c cVar7 = this.mLayoutState;
        cVar7.f10264c = i15;
        if (z14) {
            cVar7.f10264c = i15 - iK;
        }
        cVar7.f10268g = iK;
    }

    private void updateLayoutStateToFillEnd(int i14, int i15) {
        this.mLayoutState.f10264c = this.mOrientationHelper.g() - i15;
        c cVar = this.mLayoutState;
        cVar.f10266e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f10265d = i14;
        cVar.f10267f = 1;
        cVar.f10263b = i15;
        cVar.f10268g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i14, int i15) {
        this.mLayoutState.f10264c = i15 - this.mOrientationHelper.k();
        c cVar = this.mLayoutState;
        cVar.f10265d = i14;
        cVar.f10266e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f10267f = -1;
        cVar.f10263b = i15;
        cVar.f10268g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.b0 b0Var, int[] iArr) {
        int i14;
        int extraLayoutSpace = getExtraLayoutSpace(b0Var);
        if (this.mLayoutState.f10267f == -1) {
            i14 = 0;
        } else {
            i14 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i14, int i15, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        if (this.mOrientation != 0) {
            i14 = i15;
        }
        if (getChildCount() == 0 || i14 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i14 > 0 ? 1 : -1, Math.abs(i14), true, b0Var);
        collectPrefetchPositionsForLayoutState(b0Var, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i14, RecyclerView.p.c cVar) {
        boolean z14;
        int i15;
        d dVar = this.mPendingSavedState;
        if (dVar == null || (i15 = dVar.f10274a) < 0) {
            resolveShouldLayoutReverse();
            z14 = this.mShouldReverseLayout;
            i15 = this.mPendingScrollPosition;
            if (i15 == -1) {
                i15 = z14 ? i14 - 1 : 0;
            }
        } else {
            z14 = dVar.f10276c;
        }
        int i16 = z14 ? -1 : 1;
        for (int i17 = 0; i17 < this.mInitialPrefetchItemCount && i15 >= 0 && i15 < i14; i17++) {
            ((r.b) cVar).a(i15, 0);
            i15 += i16;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i14 = cVar.f10265d;
        if (i14 < 0 || i14 >= b0Var.b()) {
            return;
        }
        ((r.b) cVar2).a(i14, Math.max(0, cVar.f10268g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        return computeScrollExtent(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return computeScrollRange(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i14) {
        if (getChildCount() == 0) {
            return null;
        }
        int i15 = (i14 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i15, 0.0f) : new PointF(0.0f, i15);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        return computeScrollExtent(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return computeScrollRange(b0Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i14) {
        if (i14 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i14 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i14 == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i14 == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i14 != 66) {
            return (i14 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    public c createLayoutState() {
        return new c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z14) {
        int i14;
        int i15 = cVar.f10264c;
        int i16 = cVar.f10268g;
        if (i16 != Integer.MIN_VALUE) {
            if (i15 < 0) {
                cVar.f10268g = i16 + i15;
            }
            recycleByLayoutState(wVar, cVar);
        }
        int i17 = cVar.f10264c + cVar.f10269h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f10273l && i17 <= 0) || (i14 = cVar.f10265d) < 0 || i14 >= b0Var.b()) {
                break;
            }
            bVar.f10258a = 0;
            bVar.f10259b = false;
            bVar.f10260c = false;
            bVar.f10261d = false;
            layoutChunk(wVar, b0Var, cVar, bVar);
            if (!bVar.f10259b) {
                int i18 = cVar.f10263b;
                int i19 = bVar.f10258a;
                cVar.f10263b = (cVar.f10267f * i19) + i18;
                if (!bVar.f10260c || cVar.f10272k != null || !b0Var.f10291g) {
                    cVar.f10264c -= i19;
                    i17 -= i19;
                }
                int i24 = cVar.f10268g;
                if (i24 != Integer.MIN_VALUE) {
                    int i25 = i24 + i19;
                    cVar.f10268g = i25;
                    int i26 = cVar.f10264c;
                    if (i26 < 0) {
                        cVar.f10268g = i25 + i26;
                    }
                    recycleByLayoutState(wVar, cVar);
                }
                if (z14 && bVar.f10261d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i15 - cVar.f10264c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z14, boolean z15) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z14, z15) : findOneVisibleChild(getChildCount() - 1, -1, z14, z15);
    }

    public View findFirstVisibleChildClosestToStart(boolean z14, boolean z15) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z14, z15) : findOneVisibleChild(0, getChildCount(), z14, z15);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i14, int i15) {
        int i16;
        int i17;
        ensureLayoutState();
        if (i15 <= i14 && i15 >= i14) {
            return getChildAt(i14);
        }
        if (this.mOrientationHelper.e(getChildAt(i14)) < this.mOrientationHelper.k()) {
            i16 = 16644;
            i17 = 16388;
        } else {
            i16 = 4161;
            i17 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i14, i15, i16, i17) : this.mVerticalBoundCheck.a(i14, i15, i16, i17);
    }

    public View findOneVisibleChild(int i14, int i15, boolean z14, boolean z15) {
        ensureLayoutState();
        int i16 = z14 ? 24579 : 320;
        int i17 = z15 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i14, i15, i16, i17) : this.mVerticalBoundCheck.a(i14, i15, i16, i17);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View findReferenceChild(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z14, boolean z15) {
        int i14;
        int childCount;
        int i15;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z15) {
            childCount = getChildCount() - 1;
            i14 = -1;
            i15 = -1;
        } else {
            i14 = childCount2;
            childCount = 0;
            i15 = 1;
        }
        int iB = b0Var.b();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view2 = null;
        View view3 = null;
        View view4 = null;
        while (childCount != i14) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iE = this.mOrientationHelper.e(childAt);
            int iB2 = this.mOrientationHelper.b(childAt);
            if (position >= 0 && position < iB) {
                if (!((RecyclerView.q) childAt.getLayoutParams()).isItemRemoved()) {
                    boolean z16 = iB2 <= iK && iE < iK;
                    boolean z17 = iE >= iG && iB2 > iG;
                    if (!z16 && !z17) {
                        return childAt;
                    }
                    if (z14) {
                        if (z17) {
                            view3 = childAt;
                        } else if (view2 == null) {
                            view2 = childAt;
                        }
                    } else if (z16) {
                        view3 = childAt;
                    } else if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (view4 == null) {
                    view4 = childAt;
                }
            }
            childCount += i15;
        }
        if (view2 != null) {
            return view2;
        }
        return view3 != null ? view3 : view4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i14) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i14 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i14) {
                return childAt;
            }
        }
        return super.findViewByPosition(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.b0 b0Var) {
        if (b0Var.f10285a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int iD;
        int i14;
        int paddingLeft;
        int i15;
        int iD2;
        View viewB = cVar.b(wVar);
        if (viewB == null) {
            bVar.f10259b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewB.getLayoutParams();
        List<RecyclerView.f0> list = cVar.f10272k;
        boolean z14 = this.mShouldReverseLayout;
        int i16 = cVar.f10267f;
        if (list == null) {
            if (z14 == (i16 == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (z14 == (i16 == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        bVar.f10258a = this.mOrientationHelper.c(viewB);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iD2 = getWidth() - getPaddingRight();
                paddingLeft = iD2 - this.mOrientationHelper.d(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iD2 = this.mOrientationHelper.d(viewB) + paddingLeft;
            }
            int i17 = cVar.f10267f;
            int i18 = cVar.f10263b;
            int i19 = bVar.f10258a;
            if (i17 == -1) {
                i15 = i18 - i19;
                iD = i18;
            } else {
                iD = i19 + i18;
                i15 = i18;
            }
            i14 = iD2;
        } else {
            int paddingTop = getPaddingTop();
            iD = this.mOrientationHelper.d(viewB) + paddingTop;
            int i24 = cVar.f10267f;
            int i25 = cVar.f10263b;
            int i26 = bVar.f10258a;
            if (i24 == -1) {
                i14 = i25;
                paddingLeft = i25 - i26;
            } else {
                i14 = i25 + i26;
                paddingLeft = i25;
            }
            i15 = paddingTop;
        }
        layoutDecoratedWithMargins(viewB, paddingLeft, i15, i14, iD);
        if (qVar.isItemRemoved() || qVar.isItemChanged()) {
            bVar.f10260c = true;
        }
        bVar.f10261d = viewB.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i14) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(wVar);
            wVar.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view2, int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i14)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, b0Var);
        c cVar = this.mLayoutState;
        cVar.f10268g = Integer.MIN_VALUE;
        cVar.f10262a = false;
        fill(wVar, cVar, b0Var, true);
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewFindPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (viewFindPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i14;
        int i15;
        int i16;
        int i17;
        int iFixLayoutEndGap;
        int i18;
        View viewFindViewByPosition;
        int iE;
        int iG;
        int i19;
        int i24 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && b0Var.b() == 0) {
            removeAndRecycleAllViews(wVar);
            return;
        }
        d dVar = this.mPendingSavedState;
        if (dVar != null && (i19 = dVar.f10274a) >= 0) {
            this.mPendingScrollPosition = i19;
        }
        ensureLayoutState();
        this.mLayoutState.f10262a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f10257e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.c();
            a aVar2 = this.mAnchorInfo;
            aVar2.f10256d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(wVar, b0Var, aVar2);
            this.mAnchorInfo.f10257e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.e(focusedChild) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild) <= this.mOrientationHelper.k())) {
            this.mAnchorInfo.b(getPosition(focusedChild), focusedChild);
        }
        c cVar = this.mLayoutState;
        cVar.f10267f = cVar.f10271j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(b0Var, iArr);
        int iK = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int iH = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (b0Var.f10291g && (i18 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i18)) != null) {
            boolean z14 = this.mShouldReverseLayout;
            d0 d0Var = this.mOrientationHelper;
            if (z14) {
                iG = d0Var.g() - this.mOrientationHelper.b(viewFindViewByPosition);
                iE = this.mPendingScrollPositionOffset;
            } else {
                iE = d0Var.e(viewFindViewByPosition) - this.mOrientationHelper.k();
                iG = this.mPendingScrollPositionOffset;
            }
            int i25 = iG - iE;
            if (i25 > 0) {
                iK += i25;
            } else {
                iH -= i25;
            }
        }
        a aVar3 = this.mAnchorInfo;
        boolean z15 = aVar3.f10256d;
        boolean z16 = this.mShouldReverseLayout;
        if (!z15 ? !z16 : z16) {
            i24 = 1;
        }
        onAnchorReady(wVar, b0Var, aVar3, i24);
        detachAndScrapAttachedViews(wVar);
        this.mLayoutState.f10273l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f10270i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f10256d) {
            updateLayoutStateToFillStart(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f10269h = iK;
            fill(wVar, cVar2, b0Var, false);
            c cVar3 = this.mLayoutState;
            i15 = cVar3.f10263b;
            int i26 = cVar3.f10265d;
            int i27 = cVar3.f10264c;
            if (i27 > 0) {
                iH += i27;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f10269h = iH;
            cVar4.f10265d += cVar4.f10266e;
            fill(wVar, cVar4, b0Var, false);
            c cVar5 = this.mLayoutState;
            i14 = cVar5.f10263b;
            int i28 = cVar5.f10264c;
            if (i28 > 0) {
                updateLayoutStateToFillStart(i26, i15);
                c cVar6 = this.mLayoutState;
                cVar6.f10269h = i28;
                fill(wVar, cVar6, b0Var, false);
                i15 = this.mLayoutState.f10263b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f10269h = iH;
            fill(wVar, cVar7, b0Var, false);
            c cVar8 = this.mLayoutState;
            i14 = cVar8.f10263b;
            int i29 = cVar8.f10265d;
            int i30 = cVar8.f10264c;
            if (i30 > 0) {
                iK += i30;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f10269h = iK;
            cVar9.f10265d += cVar9.f10266e;
            fill(wVar, cVar9, b0Var, false);
            c cVar10 = this.mLayoutState;
            int i34 = cVar10.f10263b;
            int i35 = cVar10.f10264c;
            if (i35 > 0) {
                updateLayoutStateToFillEnd(i29, i14);
                c cVar11 = this.mLayoutState;
                cVar11.f10269h = i35;
                fill(wVar, cVar11, b0Var, false);
                i14 = this.mLayoutState.f10263b;
            }
            i15 = i34;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i14, wVar, b0Var, true);
                i16 = i15 + iFixLayoutEndGap2;
                i17 = i14 + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i16, wVar, b0Var, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i15, wVar, b0Var, true);
                i16 = i15 + iFixLayoutStartGap;
                i17 = i14 + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i17, wVar, b0Var, false);
            }
            i15 = i16 + iFixLayoutEndGap;
            i14 = i17 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(wVar, b0Var, i15, i14);
        if (b0Var.f10291g) {
            this.mAnchorInfo.c();
        } else {
            d0 d0Var2 = this.mOrientationHelper;
            d0Var2.f10438b = d0Var2.l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.mPendingSavedState = dVar;
            if (this.mPendingScrollPosition != -1) {
                dVar.f10274a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new d(this.mPendingSavedState);
        }
        d dVar = new d();
        if (getChildCount() <= 0) {
            dVar.f10274a = -1;
            return dVar;
        }
        ensureLayoutState();
        boolean z14 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        dVar.f10276c = z14;
        if (z14) {
            View childClosestToEnd = getChildClosestToEnd();
            dVar.f10275b = this.mOrientationHelper.g() - this.mOrientationHelper.b(childClosestToEnd);
            dVar.f10274a = getPosition(childClosestToEnd);
            return dVar;
        }
        View childClosestToStart = getChildClosestToStart();
        dVar.f10274a = getPosition(childClosestToStart);
        dVar.f10275b = this.mOrientationHelper.e(childClosestToStart) - this.mOrientationHelper.k();
        return dVar;
    }

    @Override // androidx.recyclerview.widget.s.h
    public void prepareForDrop(View view2, View view3, int i14, int i15) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view2);
        int position2 = getPosition(view3);
        byte b14 = position < position2 ? (byte) 1 : (byte) -1;
        boolean z14 = this.mShouldReverseLayout;
        d0 d0Var = this.mOrientationHelper;
        if (z14) {
            if (b14 == 1) {
                scrollToPositionWithOffset(position2, d0Var.g() - (this.mOrientationHelper.c(view2) + this.mOrientationHelper.e(view3)));
                return;
            } else {
                scrollToPositionWithOffset(position2, d0Var.g() - this.mOrientationHelper.b(view3));
                return;
            }
        }
        if (b14 == -1) {
            scrollToPositionWithOffset(position2, d0Var.e(view3));
        } else {
            scrollToPositionWithOffset(position2, d0Var.b(view3) - this.mOrientationHelper.c(view2));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i14 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f10262a = true;
        int i15 = i14 > 0 ? 1 : -1;
        int iAbs = Math.abs(i14);
        updateLayoutState(i15, iAbs, true, b0Var);
        c cVar = this.mLayoutState;
        int iFill = fill(wVar, cVar, b0Var, false) + cVar.f10268g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i14 = i15 * iFill;
        }
        this.mOrientationHelper.p(-i14);
        this.mLayoutState.f10271j = i14;
        return i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i14, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i14) {
        this.mPendingScrollPosition = i14;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.f10274a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i14, int i15) {
        this.mPendingScrollPosition = i14;
        this.mPendingScrollPositionOffset = i15;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.f10274a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i14, wVar, b0Var);
    }

    public void setInitialPrefetchItemCount(int i14) {
        this.mInitialPrefetchItemCount = i14;
    }

    public void setOrientation(int i14) {
        if (i14 != 0 && i14 != 1) {
            vb.h.s(am.j.h(i14, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i14 != this.mOrientation || this.mOrientationHelper == null) {
            d0 d0VarA = d0.a(this, i14);
            this.mOrientationHelper = d0VarA;
            this.mAnchorInfo.f10253a = d0VarA;
            this.mOrientation = i14;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z14) {
        this.mRecycleChildrenOnDetach = z14;
    }

    public void setReverseLayout(boolean z14) {
        assertNotInLayoutOrScroll(null);
        if (z14 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z14;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z14) {
        this.mSmoothScrollbarEnabled = z14;
    }

    public void setStackFromEnd(boolean z14) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z14) {
            return;
        }
        this.mStackFromEnd = z14;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i14) {
        w wVar = new w(recyclerView.getContext());
        wVar.setTargetPosition(i14);
        startSmoothScroll(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iE = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i14 = 1; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                int position2 = getPosition(childAt);
                int iE2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb3.append(iE2 < iE);
                    throw new RuntimeException(sb3.toString());
                }
                if (iE2 > iE) {
                    logChildren();
                    kg.f.n("detected invalid location");
                    return;
                }
            }
            return;
        }
        for (int i15 = 1; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
            int position3 = getPosition(childAt2);
            int iE3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb4 = new StringBuilder("detected invalid position. loc invalid? ");
                sb4.append(iE3 < iE);
                throw new RuntimeException(sb4.toString());
            }
            if (iE3 < iE) {
                logChildren();
                kg.f.n("detected invalid location");
                return;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10276c;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public d(Parcel parcel) {
            this.f10274a = parcel.readInt();
            this.f10275b = parcel.readInt();
            this.f10276c = parcel.readInt() == 1;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(this.f10274a);
            parcel.writeInt(this.f10275b);
            parcel.writeInt(this.f10276c ? 1 : 0);
        }

        public d() {
        }

        @SuppressLint({"UnknownNullness"})
        public d(d dVar) {
            this.f10274a = dVar.f10274a;
            this.f10275b = dVar.f10275b;
            this.f10276c = dVar.f10276c;
        }
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.f10254b, aVar.f10255c);
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.f10254b, aVar.f10255c);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i14, boolean z14) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i14);
        setReverseLayout(z14);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }
}
