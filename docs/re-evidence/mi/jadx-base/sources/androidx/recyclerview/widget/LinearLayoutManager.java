package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import com.miui.tsmclient.service.DKFRequestService;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements l.i, RecyclerView.y.b {
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
    s mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2788b;
        public boolean c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public boolean a() {
            return this.f2787a >= 0;
        }

        public void c() {
            this.f2787a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2787a);
            parcel.writeInt(this.f2788b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f2787a = parcel.readInt();
            this.f2788b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f2787a = savedState.f2787a;
            this.f2788b = savedState.f2788b;
            this.c = savedState.c;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f2789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2790b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            this.c = this.d ? this.f2789a.i() : this.f2789a.m();
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.f2789a.d(view) + this.f2789a.o();
            } else {
                this.c = this.f2789a.g(view);
            }
            this.f2790b = i;
        }

        public void c(View view, int i) {
            int iO = this.f2789a.o();
            if (iO >= 0) {
                b(view, i);
                return;
            }
            this.f2790b = i;
            if (this.d) {
                int i2 = (this.f2789a.i() - iO) - this.f2789a.d(view);
                this.c = this.f2789a.i() - i2;
                if (i2 > 0) {
                    int iE = this.c - this.f2789a.e(view);
                    int iM = this.f2789a.m();
                    int iMin = iE - (iM + Math.min(this.f2789a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.c += Math.min(i2, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f2789a.g(view);
            int iM2 = iG - this.f2789a.m();
            this.c = iG;
            if (iM2 > 0) {
                int i3 = (this.f2789a.i() - Math.min(0, (this.f2789a.i() - iO) - this.f2789a.d(view))) - (iG + this.f2789a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(iM2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.e() && layoutParams.c() >= 0 && layoutParams.c() < zVar.c();
        }

        public void e() {
            this.f2790b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2790b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2792b;
        public boolean c;
        public boolean d;

        public void a() {
            this.f2791a = 0;
            this.f2792b = false;
            this.c = false;
            this.d = false;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2794b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2795k;
        public boolean m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2793a = true;
        public int h = 0;
        public int i = 0;
        public boolean j = false;
        public List<RecyclerView.d0> l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.LayoutParams) viewF.getLayoutParams()).c();
            }
        }

        public boolean c(RecyclerView.z zVar) {
            int i = this.d;
            return i >= 0 && i < zVar.c();
        }

        public View d(RecyclerView.u uVar) {
            if (this.l != null) {
                return e();
            }
            View viewO = uVar.o(this.d);
            this.d += this.e;
            return viewO;
        }

        public final View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.e() && this.d == layoutParams.c()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int iC;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.e() && (iC = (layoutParams.c() - this.d) * this.e) >= 0 && iC < i) {
                    view2 = view3;
                    if (iC == 0) {
                        break;
                    }
                    i = iC;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return v.a(zVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return v.b(zVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return v.c(zVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
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

    private int fixLayoutEndGap(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int i2;
        int i3 = this.mOrientationHelper.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -scrollBy(-i3, uVar, zVar);
        int i5 = i + i4;
        if (!z || (i2 = this.mOrientationHelper.i() - i5) <= 0) {
            return i4;
        }
        this.mOrientationHelper.r(i2);
        return i2 + i4;
    }

    private int fixLayoutStartGap(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int iM;
        int iM2 = i - this.mOrientationHelper.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iM2, uVar, zVar);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.mOrientationHelper.m()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.r(-iM);
        return i2 - iM;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.u uVar, RecyclerView.z zVar, int i, int i2) {
        if (!zVar.h() || getChildCount() == 0 || zVar.f() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.d0> listK = uVar.k();
        int size = listK.size();
        int position = getPosition(getChildAt(0));
        int iE = 0;
        int iE2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.d0 d0Var = listK.get(i3);
            if (!d0Var.isRemoved()) {
                if ((d0Var.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iE += this.mOrientationHelper.e(d0Var.itemView);
                } else {
                    iE2 += this.mOrientationHelper.e(d0Var.itemView);
                }
            }
        }
        this.mLayoutState.l = listK;
        if (iE > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            c cVar = this.mLayoutState;
            cVar.h = iE;
            cVar.c = 0;
            cVar.a();
            fill(uVar, this.mLayoutState, zVar, false);
        }
        if (iE2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
            c cVar2 = this.mLayoutState;
            cVar2.h = iE2;
            cVar2.c = 0;
            cVar2.a();
            fill(uVar, this.mLayoutState, zVar, false);
        }
        this.mLayoutState.l = null;
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            StringBuilder sb = new StringBuilder();
            sb.append("item ");
            sb.append(getPosition(childAt));
            sb.append(", coord:");
            sb.append(this.mOrientationHelper.g(childAt));
        }
    }

    private void recycleByLayoutState(RecyclerView.u uVar, c cVar) {
        if (!cVar.f2793a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            recycleViewsFromEnd(uVar, i, i2);
        } else {
            recycleViewsFromStart(uVar, i, i2);
        }
    }

    private void recycleChildren(RecyclerView.u uVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, uVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, uVar);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.u uVar, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iH = (this.mOrientationHelper.h() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.g(childAt) < iH || this.mOrientationHelper.q(childAt) < iH) {
                    recycleChildren(uVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.g(childAt2) < iH || this.mOrientationHelper.q(childAt2) < iH) {
                recycleChildren(uVar, i4, i5);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.u uVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.d(childAt) > i3 || this.mOrientationHelper.p(childAt) > i3) {
                    recycleChildren(uVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.d(childAt2) > i3 || this.mOrientationHelper.p(childAt2) > i3) {
                recycleChildren(uVar, i5, i6);
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

    private boolean updateAnchorFromChildren(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        View viewFindReferenceChild;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.d(focusedChild, zVar)) {
            aVar.c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z2 = this.mLastStackFromEnd;
        boolean z3 = this.mStackFromEnd;
        if (z2 != z3 || (viewFindReferenceChild = findReferenceChild(uVar, zVar, aVar.d, z3)) == null) {
            return false;
        }
        aVar.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
        if (!zVar.f() && supportsPredictiveItemAnimations()) {
            int iG = this.mOrientationHelper.g(viewFindReferenceChild);
            int iD = this.mOrientationHelper.d(viewFindReferenceChild);
            int iM = this.mOrientationHelper.m();
            int i = this.mOrientationHelper.i();
            boolean z4 = iD <= iM && iG < iM;
            if (iG >= i && iD > i) {
                z = true;
            }
            if (z4 || z) {
                if (aVar.d) {
                    iM = i;
                }
                aVar.c = iM;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.z zVar, a aVar) {
        int i;
        if (!zVar.f() && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < zVar.c()) {
                aVar.f2790b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.a()) {
                    boolean z = this.mPendingSavedState.c;
                    aVar.d = z;
                    if (z) {
                        aVar.c = this.mOrientationHelper.i() - this.mPendingSavedState.f2788b;
                    } else {
                        aVar.c = this.mOrientationHelper.m() + this.mPendingSavedState.f2788b;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z2 = this.mShouldReverseLayout;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.c = this.mOrientationHelper.m() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                } else {
                    if (this.mOrientationHelper.e(viewFindViewByPosition) > this.mOrientationHelper.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.m() < 0) {
                        aVar.c = this.mOrientationHelper.m();
                        aVar.d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition) < 0) {
                        aVar.c = this.mOrientationHelper.i();
                        aVar.d = true;
                        return true;
                    }
                    aVar.c = aVar.d ? this.mOrientationHelper.d(viewFindViewByPosition) + this.mOrientationHelper.o() : this.mOrientationHelper.g(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (updateAnchorFromPendingData(zVar, aVar) || updateAnchorFromChildren(uVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f2790b = this.mStackFromEnd ? zVar.c() - 1 : 0;
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.z zVar) {
        int iM;
        this.mLayoutState.m = resolveIsInfinite();
        this.mLayoutState.f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(zVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        c cVar = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        cVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.i = iMax;
        if (z2) {
            cVar.h = i3 + this.mOrientationHelper.j();
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            cVar2.e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.d = position + cVar3.e;
            cVar3.f2794b = this.mOrientationHelper.d(childClosestToEnd);
            iM = this.mOrientationHelper.d(childClosestToEnd) - this.mOrientationHelper.i();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.h += this.mOrientationHelper.m();
            c cVar4 = this.mLayoutState;
            cVar4.e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            c cVar5 = this.mLayoutState;
            cVar4.d = position2 + cVar5.e;
            cVar5.f2794b = this.mOrientationHelper.g(childClosestToStart);
            iM = (-this.mOrientationHelper.g(childClosestToStart)) + this.mOrientationHelper.m();
        }
        c cVar6 = this.mLayoutState;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - iM;
        }
        cVar6.g = iM;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.f2790b, aVar.c);
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.f2790b, aVar.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.z zVar, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(zVar);
        if (this.mLayoutState.f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
        collectPrefetchPositionsForLayoutState(zVar, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.a()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z = savedState2.c;
            i2 = savedState2.f2787a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= zVar.c()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
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

    public int fill(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            recycleByLayoutState(uVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            layoutChunk(uVar, zVar, cVar, bVar);
            if (!bVar.f2792b) {
                cVar.f2794b += bVar.f2791a * cVar.f;
                if (!bVar.c || cVar.l != null || !zVar.f()) {
                    int i4 = cVar.c;
                    int i5 = bVar.f2791a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f2791a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    recycleByLayoutState(uVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
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

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.g(getChildAt(i)) < this.mOrientationHelper.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = DKFRequestService.s0;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i2, i3, i4) : this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i2, i3, i4) : this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View findReferenceChild(RecyclerView.u uVar, RecyclerView.z zVar, boolean z, boolean z2) {
        int i;
        int childCount;
        int i2;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
            i2 = 1;
        }
        int iC = zVar.c();
        int iM = this.mOrientationHelper.m();
        int i3 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iG = this.mOrientationHelper.g(childAt);
            int iD = this.mOrientationHelper.d(childAt);
            if (position >= 0 && position < iC) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).e()) {
                    boolean z3 = iD <= iM && iG < iM;
                    boolean z4 = iG >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (z4) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z3) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.z zVar) {
        if (zVar.e()) {
            return this.mOrientationHelper.n();
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

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int paddingLeft;
        int iF;
        View viewD = cVar.d(uVar);
        if (viewD == null) {
            bVar.f2792b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewD.getLayoutParams();
        if (cVar.l == null) {
            if (this.mShouldReverseLayout == (cVar.f == -1)) {
                addView(viewD);
            } else {
                addView(viewD, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f == -1)) {
                addDisappearingView(viewD);
            } else {
                addDisappearingView(viewD, 0);
            }
        }
        measureChildWithMargins(viewD, 0, 0);
        bVar.f2791a = this.mOrientationHelper.e(viewD);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iF = getWidth() - getPaddingRight();
                paddingLeft = iF - this.mOrientationHelper.f(viewD);
            } else {
                paddingLeft = getPaddingLeft();
                iF = this.mOrientationHelper.f(viewD) + paddingLeft;
            }
            if (cVar.f == -1) {
                int i4 = cVar.f2794b;
                i3 = i4;
                i2 = iF;
                i = i4 - bVar.f2791a;
            } else {
                int i5 = cVar.f2794b;
                i = i5;
                i2 = iF;
                i3 = bVar.f2791a + i5;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iF2 = this.mOrientationHelper.f(viewD) + paddingTop;
            if (cVar.f == -1) {
                int i6 = cVar.f2794b;
                i2 = i6;
                i = paddingTop;
                i3 = iF2;
                paddingLeft = i6 - bVar.f2791a;
            } else {
                int i7 = cVar.f2794b;
                i = paddingTop;
                i2 = bVar.f2791a + i7;
                i3 = iF2;
                paddingLeft = i7;
            }
        }
        layoutDecoratedWithMargins(viewD, paddingLeft, i, i2, i3);
        if (layoutParams.e() || layoutParams.d()) {
            bVar.c = true;
        }
        bVar.d = viewD.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(uVar);
            uVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.n() * MAX_SCROLL_FACTOR), false, zVar);
        c cVar = this.mLayoutState;
        cVar.g = Integer.MIN_VALUE;
        cVar.f2793a = false;
        fill(uVar, cVar, zVar, true);
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

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int iFixLayoutEndGap;
        int i5;
        View viewFindViewByPosition;
        int iG;
        int i6;
        int i7 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && zVar.c() == 0) {
            removeAndRecycleAllViews(uVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f2787a;
        }
        ensureLayoutState();
        this.mLayoutState.f2793a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.e();
            a aVar2 = this.mAnchorInfo;
            aVar2.d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(uVar, zVar, aVar2);
            this.mAnchorInfo.e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.m())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f = cVar.f2795k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(zVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.m();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.j();
        if (zVar.f() && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                i6 = this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition);
                iG = this.mPendingScrollPositionOffset;
            } else {
                iG = this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.m();
                i6 = this.mPendingScrollPositionOffset;
            }
            int i8 = i6 - iG;
            if (i8 > 0) {
                iMax += i8;
            } else {
                iMax2 -= i8;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i7 = 1;
        }
        onAnchorReady(uVar, zVar, aVar3, i7);
        detachAndScrapAttachedViews(uVar);
        this.mLayoutState.m = resolveIsInfinite();
        this.mLayoutState.j = zVar.f();
        this.mLayoutState.i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.d) {
            updateLayoutStateToFillStart(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.h = iMax;
            fill(uVar, cVar2, zVar, false);
            c cVar3 = this.mLayoutState;
            i2 = cVar3.f2794b;
            int i9 = cVar3.d;
            int i10 = cVar3.c;
            if (i10 > 0) {
                iMax2 += i10;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.h = iMax2;
            cVar4.d += cVar4.e;
            fill(uVar, cVar4, zVar, false);
            c cVar5 = this.mLayoutState;
            i = cVar5.f2794b;
            int i11 = cVar5.c;
            if (i11 > 0) {
                updateLayoutStateToFillStart(i9, i2);
                c cVar6 = this.mLayoutState;
                cVar6.h = i11;
                fill(uVar, cVar6, zVar, false);
                i2 = this.mLayoutState.f2794b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.h = iMax2;
            fill(uVar, cVar7, zVar, false);
            c cVar8 = this.mLayoutState;
            i = cVar8.f2794b;
            int i12 = cVar8.d;
            int i13 = cVar8.c;
            if (i13 > 0) {
                iMax += i13;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.h = iMax;
            cVar9.d += cVar9.e;
            fill(uVar, cVar9, zVar, false);
            c cVar10 = this.mLayoutState;
            i2 = cVar10.f2794b;
            int i14 = cVar10.c;
            if (i14 > 0) {
                updateLayoutStateToFillEnd(i12, i);
                c cVar11 = this.mLayoutState;
                cVar11.h = i14;
                fill(uVar, cVar11, zVar, false);
                i = this.mLayoutState.f2794b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i, uVar, zVar, true);
                i3 = i2 + iFixLayoutEndGap2;
                i4 = i + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i3, uVar, zVar, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i2, uVar, zVar, true);
                i3 = i2 + iFixLayoutStartGap;
                i4 = i + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i4, uVar, zVar, false);
            }
            i2 = i3 + iFixLayoutEndGap;
            i = i4 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(uVar, zVar, i2, i);
        if (zVar.f()) {
            this.mAnchorInfo.e();
        } else {
            this.mOrientationHelper.s();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.c();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.c = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.f2788b = this.mOrientationHelper.i() - this.mOrientationHelper.d(childClosestToEnd);
                savedState.f2787a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.f2787a = getPosition(childClosestToStart);
                savedState.f2788b = this.mOrientationHelper.g(childClosestToStart) - this.mOrientationHelper.m();
            }
        } else {
            savedState.c();
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.l.i
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b2 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b2 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - (this.mOrientationHelper.g(view2) + this.mOrientationHelper.e(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - this.mOrientationHelper.d(view2));
                return;
            }
        }
        if (b2 == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.k() == 0 && this.mOrientationHelper.h() == 0;
    }

    public int scrollBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2793a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        updateLayoutState(i2, iAbs, true, zVar);
        c cVar = this.mLayoutState;
        int iFill = cVar.g + fill(uVar, cVar, zVar, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.r(-i);
        this.mLayoutState.f2795k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.c();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.c();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, uVar, zVar);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            s sVarB = s.b(this, i);
            this.mOrientationHelper = sVarB;
            this.mAnchorInfo.f2789a = sVarB;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        n nVar = new n(recyclerView.getContext());
        nVar.setTargetPosition(i);
        startSmoothScroll(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        StringBuilder sb = new StringBuilder();
        sb.append("validating child count ");
        sb.append(getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iG = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iG2 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    sb2.append(iG2 < iG);
                    throw new RuntimeException(sb2.toString());
                }
                if (iG2 > iG) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iG3 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("detected invalid position. loc invalid? ");
                sb3.append(iG3 < iG);
                throw new RuntimeException(sb3.toString());
            }
            if (iG3 < iG) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
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
        setOrientation(i);
        setReverseLayout(z);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.c = this.mOrientationHelper.i() - i2;
        c cVar = this.mLayoutState;
        cVar.e = this.mShouldReverseLayout ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.f2794b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.c = i2 - this.mOrientationHelper.m();
        c cVar = this.mLayoutState;
        cVar.d = i;
        cVar.e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f = -1;
        cVar.f2794b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
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
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2814a);
        setReverseLayout(properties.c);
        setStackFromEnd(properties.d);
    }
}
