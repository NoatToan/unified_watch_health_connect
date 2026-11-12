package com.google.android.flexbox;

import am.j;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.w;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
public class FlexboxLayoutManager extends RecyclerView.p implements FlexContainer, RecyclerView.a0.b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final String TAG = "FlexboxLayoutManager";
    private static final Rect TEMP_RECT = new Rect();
    private int mAlignItems;
    private AnchorInfo mAnchorInfo;
    private final Context mContext;
    private int mDirtyPosition;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private final FlexboxHelper mFlexboxHelper;
    private boolean mFromBottomToTop;
    private boolean mIsRtl;
    private int mJustifyContent;
    private int mLastHeight;
    private int mLastWidth;
    private LayoutState mLayoutState;
    private int mMaxLine;
    private d0 mOrientationHelper;
    private View mParent;
    private SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private RecyclerView.w mRecycler;
    private RecyclerView.b0 mState;
    private d0 mSubOrientationHelper;
    private SparseArray<View> mViewCache;

    public class AnchorInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean mAssignedFromSavedState;
        private int mCoordinate;
        private int mFlexLinePosition;
        private boolean mLayoutFromEnd;
        private int mPerpendicularCoordinate;
        private int mPosition;
        private boolean mValid;

        private AnchorInfo() {
            this.mPerpendicularCoordinate = 0;
        }

        public static /* synthetic */ int access$2412(AnchorInfo anchorInfo, int i14) {
            int i15 = anchorInfo.mPerpendicularCoordinate + i14;
            anchorInfo.mPerpendicularCoordinate = i15;
            return i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignCoordinateFromPadding() {
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                boolean z14 = this.mLayoutFromEnd;
                FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                this.mCoordinate = z14 ? flexboxLayoutManager.mOrientationHelper.g() : flexboxLayoutManager.mOrientationHelper.k();
            } else {
                boolean z15 = this.mLayoutFromEnd;
                FlexboxLayoutManager flexboxLayoutManager2 = FlexboxLayoutManager.this;
                this.mCoordinate = z15 ? flexboxLayoutManager2.mOrientationHelper.g() : flexboxLayoutManager2.getWidth() - FlexboxLayoutManager.this.mOrientationHelper.k();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignFromView(View view2) {
            int i14 = FlexboxLayoutManager.this.mFlexWrap;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            d0 d0Var = i14 == 0 ? flexboxLayoutManager.mSubOrientationHelper : flexboxLayoutManager.mOrientationHelper;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                if (this.mLayoutFromEnd) {
                    this.mCoordinate = d0Var.m() + d0Var.b(view2);
                } else {
                    this.mCoordinate = d0Var.e(view2);
                }
            } else if (this.mLayoutFromEnd) {
                this.mCoordinate = d0Var.m() + d0Var.e(view2);
            } else {
                this.mCoordinate = d0Var.b(view2);
            }
            this.mPosition = FlexboxLayoutManager.this.getPosition(view2);
            this.mAssignedFromSavedState = false;
            int[] iArr = FlexboxLayoutManager.this.mFlexboxHelper.mIndexToFlexLine;
            int i15 = this.mPosition;
            if (i15 == -1) {
                i15 = 0;
            }
            int i16 = iArr[i15];
            this.mFlexLinePosition = i16 != -1 ? i16 : 0;
            if (FlexboxLayoutManager.this.mFlexLines.size() > this.mFlexLinePosition) {
                this.mPosition = ((FlexLine) FlexboxLayoutManager.this.mFlexLines.get(this.mFlexLinePosition)).mFirstIndex;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.mPosition = -1;
            this.mFlexLinePosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mValid = false;
            this.mAssignedFromSavedState = false;
            boolean zIsMainAxisDirectionHorizontal = FlexboxLayoutManager.this.isMainAxisDirectionHorizontal();
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (zIsMainAxisDirectionHorizontal) {
                int i14 = flexboxLayoutManager.mFlexWrap;
                FlexboxLayoutManager flexboxLayoutManager2 = FlexboxLayoutManager.this;
                if (i14 == 0) {
                    this.mLayoutFromEnd = flexboxLayoutManager2.mFlexDirection == 1;
                    return;
                } else {
                    this.mLayoutFromEnd = flexboxLayoutManager2.mFlexWrap == 2;
                    return;
                }
            }
            int i15 = flexboxLayoutManager.mFlexWrap;
            FlexboxLayoutManager flexboxLayoutManager3 = FlexboxLayoutManager.this;
            if (i15 == 0) {
                this.mLayoutFromEnd = flexboxLayoutManager3.mFlexDirection == 3;
            } else {
                this.mLayoutFromEnd = flexboxLayoutManager3.mFlexWrap == 2;
            }
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("AnchorInfo{mPosition=");
            sb3.append(this.mPosition);
            sb3.append(", mFlexLinePosition=");
            sb3.append(this.mFlexLinePosition);
            sb3.append(", mCoordinate=");
            sb3.append(this.mCoordinate);
            sb3.append(", mPerpendicularCoordinate=");
            sb3.append(this.mPerpendicularCoordinate);
            sb3.append(", mLayoutFromEnd=");
            sb3.append(this.mLayoutFromEnd);
            sb3.append(", mValid=");
            sb3.append(this.mValid);
            sb3.append(", mAssignedFromSavedState=");
            return j.t(sb3, this.mAssignedFromSavedState, CoreConstants.CURLY_RIGHT);
        }
    }

    public static class LayoutState {
        private static final int ITEM_DIRECTION_TAIL = 1;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;
        private static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        private int mAvailable;
        private int mFlexLinePosition;
        private boolean mInfinite;
        private int mItemDirection;
        private int mLastScrollDelta;
        private int mLayoutDirection;
        private int mOffset;
        private int mPosition;
        private int mScrollingOffset;
        private boolean mShouldRecycle;

        private LayoutState() {
            this.mItemDirection = 1;
            this.mLayoutDirection = 1;
        }

        public static /* synthetic */ int access$1012(LayoutState layoutState, int i14) {
            int i15 = layoutState.mOffset + i14;
            layoutState.mOffset = i15;
            return i15;
        }

        public static /* synthetic */ int access$1020(LayoutState layoutState, int i14) {
            int i15 = layoutState.mOffset - i14;
            layoutState.mOffset = i15;
            return i15;
        }

        public static /* synthetic */ int access$1220(LayoutState layoutState, int i14) {
            int i15 = layoutState.mAvailable - i14;
            layoutState.mAvailable = i15;
            return i15;
        }

        public static /* synthetic */ int access$1508(LayoutState layoutState) {
            int i14 = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i14 + 1;
            return i14;
        }

        public static /* synthetic */ int access$1510(LayoutState layoutState) {
            int i14 = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i14 - 1;
            return i14;
        }

        public static /* synthetic */ int access$1512(LayoutState layoutState, int i14) {
            int i15 = layoutState.mFlexLinePosition + i14;
            layoutState.mFlexLinePosition = i15;
            return i15;
        }

        public static /* synthetic */ int access$2012(LayoutState layoutState, int i14) {
            int i15 = layoutState.mScrollingOffset + i14;
            layoutState.mScrollingOffset = i15;
            return i15;
        }

        public static /* synthetic */ int access$2212(LayoutState layoutState, int i14) {
            int i15 = layoutState.mPosition + i14;
            layoutState.mPosition = i15;
            return i15;
        }

        public static /* synthetic */ int access$2220(LayoutState layoutState, int i14) {
            int i15 = layoutState.mPosition - i14;
            layoutState.mPosition = i15;
            return i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasMore(RecyclerView.b0 b0Var, List<FlexLine> list) {
            int i14;
            int i15 = this.mPosition;
            return i15 >= 0 && i15 < b0Var.b() && (i14 = this.mFlexLinePosition) >= 0 && i14 < list.size();
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("LayoutState{mAvailable=");
            sb3.append(this.mAvailable);
            sb3.append(", mFlexLinePosition=");
            sb3.append(this.mFlexLinePosition);
            sb3.append(", mPosition=");
            sb3.append(this.mPosition);
            sb3.append(", mOffset=");
            sb3.append(this.mOffset);
            sb3.append(", mScrollingOffset=");
            sb3.append(this.mScrollingOffset);
            sb3.append(", mLastScrollDelta=");
            sb3.append(this.mLastScrollDelta);
            sb3.append(", mItemDirection=");
            sb3.append(this.mItemDirection);
            sb3.append(", mLayoutDirection=");
            return e0.j(sb3, this.mLayoutDirection, CoreConstants.CURLY_RIGHT);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i14, int i15) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i14, i15);
        int i16 = properties.f10325a;
        if (i16 != 0) {
            if (i16 == 1) {
                if (properties.f10327c) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.f10327c) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        this.mContext = context;
    }

    private boolean canViewBeRecycledFromEnd(View view2, int i14) {
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            return this.mOrientationHelper.e(view2) >= this.mOrientationHelper.f() - i14;
        }
        return this.mOrientationHelper.b(view2) <= i14;
    }

    private boolean canViewBeRecycledFromStart(View view2, int i14) {
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            return this.mOrientationHelper.b(view2) <= i14;
        }
        return this.mOrientationHelper.f() - this.mOrientationHelper.e(view2) <= i14;
    }

    private void clearFlexLines() {
        this.mFlexLines.clear();
        this.mAnchorInfo.reset();
        this.mAnchorInfo.mPerpendicularCoordinate = 0;
    }

    private int computeScrollExtent(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = b0Var.b();
        ensureOrientationHelper();
        View viewFindFirstReferenceChild = findFirstReferenceChild(iB);
        View viewFindLastReferenceChild = findLastReferenceChild(iB);
        if (b0Var.b() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        return Math.min(this.mOrientationHelper.l(), this.mOrientationHelper.b(viewFindLastReferenceChild) - this.mOrientationHelper.e(viewFindFirstReferenceChild));
    }

    private int computeScrollOffset(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = b0Var.b();
        View viewFindFirstReferenceChild = findFirstReferenceChild(iB);
        View viewFindLastReferenceChild = findLastReferenceChild(iB);
        if (b0Var.b() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        int position = getPosition(viewFindFirstReferenceChild);
        int position2 = getPosition(viewFindLastReferenceChild);
        int iAbs = Math.abs(this.mOrientationHelper.b(viewFindLastReferenceChild) - this.mOrientationHelper.e(viewFindFirstReferenceChild));
        int[] iArr = this.mFlexboxHelper.mIndexToFlexLine;
        int i14 = iArr[position];
        if (i14 == 0 || i14 == -1) {
            return 0;
        }
        return Math.round((i14 * (iAbs / ((iArr[position2] - i14) + 1))) + (this.mOrientationHelper.k() - this.mOrientationHelper.e(viewFindFirstReferenceChild)));
    }

    private int computeScrollRange(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = b0Var.b();
        View viewFindFirstReferenceChild = findFirstReferenceChild(iB);
        View viewFindLastReferenceChild = findLastReferenceChild(iB);
        if (b0Var.b() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        return (int) ((Math.abs(this.mOrientationHelper.b(viewFindLastReferenceChild) - this.mOrientationHelper.e(viewFindFirstReferenceChild)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1)) * b0Var.b());
    }

    private void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = new LayoutState();
        }
    }

    private void ensureOrientationHelper() {
        if (this.mOrientationHelper != null) {
            return;
        }
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i14 = this.mFlexWrap;
        if (zIsMainAxisDirectionHorizontal) {
            if (i14 == 0) {
                this.mOrientationHelper = new b0(this);
                this.mSubOrientationHelper = new c0(this);
                return;
            } else {
                this.mOrientationHelper = new c0(this);
                this.mSubOrientationHelper = new b0(this);
                return;
            }
        }
        if (i14 == 0) {
            this.mOrientationHelper = new c0(this);
            this.mSubOrientationHelper = new b0(this);
        } else {
            this.mOrientationHelper = new b0(this);
            this.mSubOrientationHelper = new c0(this);
        }
    }

    private int fill(RecyclerView.w wVar, RecyclerView.b0 b0Var, LayoutState layoutState) {
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            if (layoutState.mAvailable < 0) {
                LayoutState.access$2012(layoutState, layoutState.mAvailable);
            }
            recycleByLayoutState(wVar, layoutState);
        }
        int i14 = layoutState.mAvailable;
        int crossSize = layoutState.mAvailable;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iLayoutFlexLine = 0;
        while (true) {
            if ((crossSize <= 0 && !this.mLayoutState.mInfinite) || !layoutState.hasMore(b0Var, this.mFlexLines)) {
                break;
            }
            FlexLine flexLine = this.mFlexLines.get(layoutState.mFlexLinePosition);
            layoutState.mPosition = flexLine.mFirstIndex;
            iLayoutFlexLine += layoutFlexLine(flexLine, layoutState);
            if (zIsMainAxisDirectionHorizontal || !this.mIsRtl) {
                LayoutState.access$1012(layoutState, flexLine.getCrossSize() * layoutState.mLayoutDirection);
            } else {
                LayoutState.access$1020(layoutState, flexLine.getCrossSize() * layoutState.mLayoutDirection);
            }
            crossSize -= flexLine.getCrossSize();
        }
        LayoutState.access$1220(layoutState, iLayoutFlexLine);
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            LayoutState.access$2012(layoutState, iLayoutFlexLine);
            if (layoutState.mAvailable < 0) {
                LayoutState.access$2012(layoutState, layoutState.mAvailable);
            }
            recycleByLayoutState(wVar, layoutState);
        }
        return i14 - layoutState.mAvailable;
    }

    private View findFirstReferenceChild(int i14) {
        View viewFindReferenceChild = findReferenceChild(0, getChildCount(), i14);
        if (viewFindReferenceChild == null) {
            return null;
        }
        int i15 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)];
        if (i15 == -1) {
            return null;
        }
        return findFirstReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(i15));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    private View findFirstReferenceViewInLine(View view2, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i14 = flexLine.mItemCount;
        for (int i15 = 1; i15 < i14; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.mIsRtl || zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.e(view2) > this.mOrientationHelper.e(childAt)) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.b(view2) < this.mOrientationHelper.b(childAt)) {
                    view2 = childAt;
                }
            }
        }
        return view2;
    }

    private View findLastReferenceChild(int i14) {
        View viewFindReferenceChild = findReferenceChild(getChildCount() - 1, -1, i14);
        if (viewFindReferenceChild == null) {
            return null;
        }
        return findLastReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    private View findLastReferenceViewInLine(View view2, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = (getChildCount() - flexLine.mItemCount) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.mIsRtl || zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.b(view2) < this.mOrientationHelper.b(childAt)) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.e(view2) > this.mOrientationHelper.e(childAt)) {
                    view2 = childAt;
                }
            }
        }
        return view2;
    }

    private View findOneVisibleChild(int i14, int i15, boolean z14) {
        int i16 = i15 > i14 ? 1 : -1;
        while (i14 != i15) {
            View childAt = getChildAt(i14);
            if (isViewVisible(childAt, z14)) {
                return childAt;
            }
            i14 += i16;
        }
        return null;
    }

    private View findReferenceChild(int i14, int i15, int i16) {
        int position;
        ensureOrientationHelper();
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        int i17 = i15 > i14 ? 1 : -1;
        View view2 = null;
        View view3 = null;
        while (i14 != i15) {
            View childAt = getChildAt(i14);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i16) {
                if (((RecyclerView.q) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view3 == null) {
                        view3 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) >= iK && this.mOrientationHelper.b(childAt) <= iG) {
                        return childAt;
                    }
                    if (view2 == null) {
                        view2 = childAt;
                    }
                }
            }
            i14 += i17;
        }
        return view2 != null ? view2 : view3;
    }

    private int fixLayoutEndGap(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z14) {
        int iHandleScrollingMainOrientation;
        int iG;
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int iG2 = this.mOrientationHelper.g() - i14;
            if (iG2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(-iG2, wVar, b0Var);
        } else {
            int iK = i14 - this.mOrientationHelper.k();
            if (iK <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(iK, wVar, b0Var);
        }
        int i15 = i14 + iHandleScrollingMainOrientation;
        if (!z14 || (iG = this.mOrientationHelper.g() - i15) <= 0) {
            return iHandleScrollingMainOrientation;
        }
        this.mOrientationHelper.p(iG);
        return iG + iHandleScrollingMainOrientation;
    }

    private int fixLayoutStartGap(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z14) {
        int iHandleScrollingMainOrientation;
        int iK;
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int iK2 = i14 - this.mOrientationHelper.k();
            if (iK2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(iK2, wVar, b0Var);
        } else {
            int iG = this.mOrientationHelper.g() - i14;
            if (iG <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(-iG, wVar, b0Var);
        }
        int i15 = i14 + iHandleScrollingMainOrientation;
        if (!z14 || (iK = i15 - this.mOrientationHelper.k()) <= 0) {
            return iHandleScrollingMainOrientation;
        }
        this.mOrientationHelper.p(-iK);
        return iHandleScrollingMainOrientation - iK;
    }

    private int getChildBottom(View view2) {
        return getDecoratedBottom(view2) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view2.getLayoutParams())).bottomMargin;
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    private int getChildLeft(View view2) {
        return getDecoratedLeft(view2) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view2.getLayoutParams())).leftMargin;
    }

    private int getChildRight(View view2) {
        return getDecoratedRight(view2) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view2.getLayoutParams())).rightMargin;
    }

    private int getChildTop(View view2) {
        return getDecoratedTop(view2) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view2.getLayoutParams())).topMargin;
    }

    private int handleScrollingMainOrientation(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i14 == 0) {
            return 0;
        }
        ensureOrientationHelper();
        int i15 = 1;
        this.mLayoutState.mShouldRecycle = true;
        boolean z14 = !isMainAxisDirectionHorizontal() && this.mIsRtl;
        if (!z14 ? i14 <= 0 : i14 >= 0) {
            i15 = -1;
        }
        int iAbs = Math.abs(i14);
        updateLayoutState(i15, iAbs);
        int iFill = this.mLayoutState.mScrollingOffset + fill(wVar, b0Var, this.mLayoutState);
        if (iFill < 0) {
            return 0;
        }
        if (z14) {
            if (iAbs > iFill) {
                i14 = (-i15) * iFill;
            }
        } else if (iAbs > iFill) {
            i14 = i15 * iFill;
        }
        this.mOrientationHelper.p(-i14);
        this.mLayoutState.mLastScrollDelta = i14;
        return i14;
    }

    private int handleScrollingSubOrientation(int i14) {
        if (getChildCount() == 0 || i14 == 0) {
            return 0;
        }
        ensureOrientationHelper();
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view2 = this.mParent;
        int width = zIsMainAxisDirectionHorizontal ? view2.getWidth() : view2.getHeight();
        int width2 = zIsMainAxisDirectionHorizontal ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i14);
            AnchorInfo anchorInfo = this.mAnchorInfo;
            if (i14 < 0) {
                return -Math.min((width2 + anchorInfo.mPerpendicularCoordinate) - width, iAbs);
            }
            if (anchorInfo.mPerpendicularCoordinate + i14 > 0) {
                return -this.mAnchorInfo.mPerpendicularCoordinate;
            }
        } else {
            AnchorInfo anchorInfo2 = this.mAnchorInfo;
            if (i14 > 0) {
                return Math.min((width2 - anchorInfo2.mPerpendicularCoordinate) - width, i14);
            }
            if (anchorInfo2.mPerpendicularCoordinate + i14 < 0) {
                return -this.mAnchorInfo.mPerpendicularCoordinate;
            }
        }
        return i14;
    }

    private static boolean isMeasurementUpToDate(int i14, int i15, int i16) {
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        if (i16 > 0 && i14 != i16) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i14;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i14;
        }
        return true;
    }

    private boolean isViewVisible(View view2, boolean z14) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int childLeft = getChildLeft(view2);
        int childTop = getChildTop(view2);
        int childRight = getChildRight(view2);
        int childBottom = getChildBottom(view2);
        boolean z15 = paddingLeft <= childLeft && width >= childRight;
        boolean z16 = childLeft >= width || childRight >= paddingLeft;
        boolean z17 = paddingTop <= childTop && height >= childBottom;
        boolean z18 = childTop >= height || childBottom >= paddingTop;
        if (z14) {
            return z15 && z17;
        }
        return z16 && z18;
    }

    private int layoutFlexLine(FlexLine flexLine, LayoutState layoutState) {
        return isMainAxisDirectionHorizontal() ? layoutFlexLineMainAxisHorizontal(flexLine, layoutState) : layoutFlexLineMainAxisVertical(flexLine, layoutState);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0138  */
    private int layoutFlexLineMainAxisHorizontal(FlexLine flexLine, LayoutState layoutState) {
        float f14;
        float f15;
        float f16;
        float rightDecorationWidth;
        float leftDecorationWidth;
        float fMax;
        int itemCount;
        int i14;
        int i15;
        float f17;
        View flexItemAt;
        int iExtractLowerInt;
        int iExtractHigherInt;
        LayoutParams layoutParams;
        float leftDecorationWidth2;
        float rightDecorationWidth2;
        int topDecorationHeight;
        boolean z14;
        FlexboxHelper flexboxHelper;
        FlexLine flexLine2 = flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int width = getWidth();
        int i16 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            i16 -= flexLine2.mCrossSize;
        }
        int i17 = i16;
        int i18 = layoutState.mPosition;
        int i19 = this.mJustifyContent;
        if (i19 == 0) {
            f14 = paddingLeft;
            f15 = width - paddingRight;
        } else {
            if (i19 != 1) {
                if (i19 == 2) {
                    int i24 = flexLine2.mMainSize;
                    f14 = paddingLeft + ((width - i24) / 2.0f);
                    f15 = (width - paddingRight) - ((width - i24) / 2.0f);
                } else if (i19 == 3) {
                    f14 = paddingLeft;
                    int i25 = flexLine2.mItemCount;
                    f16 = (width - flexLine2.mMainSize) / (i25 != 1 ? i25 - 1 : 1.0f);
                    f15 = width - paddingRight;
                } else if (i19 == 4) {
                    int i26 = flexLine2.mItemCount;
                    f16 = i26 != 0 ? (width - flexLine2.mMainSize) / i26 : 0.0f;
                    float f18 = f16 / 2.0f;
                    f14 = paddingLeft + f18;
                    f15 = (width - paddingRight) - f18;
                } else {
                    if (i19 != 5) {
                        e.i(this.mJustifyContent, "Invalid justifyContent is set: ");
                        return 0;
                    }
                    int i27 = flexLine2.mItemCount;
                    f16 = i27 != 0 ? (width - flexLine2.mMainSize) / (i27 + 1) : 0.0f;
                    f14 = paddingLeft + f16;
                    f15 = (width - paddingRight) - f16;
                }
                rightDecorationWidth = f14 - this.mAnchorInfo.mPerpendicularCoordinate;
                leftDecorationWidth = f15 - this.mAnchorInfo.mPerpendicularCoordinate;
                fMax = Math.max(f16, 0.0f);
                itemCount = flexLine2.getItemCount();
                i14 = 0;
                i15 = i18;
                while (i15 < i18 + itemCount) {
                    f17 = leftDecorationWidth;
                    flexItemAt = getFlexItemAt(i15);
                    if (flexItemAt == null) {
                        leftDecorationWidth = f17;
                    } else {
                        if (layoutState.mLayoutDirection == 1) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i14);
                            i14++;
                        }
                        int i28 = i14;
                        FlexboxHelper flexboxHelper2 = this.mFlexboxHelper;
                        long j8 = flexboxHelper2.mMeasureSpecCache[i15];
                        iExtractLowerInt = flexboxHelper2.extractLowerInt(j8);
                        iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j8);
                        layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                        if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                            flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                        }
                        leftDecorationWidth2 = rightDecorationWidth + getLeftDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        rightDecorationWidth2 = f17 - (getRightDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        topDecorationHeight = getTopDecorationHeight(flexItemAt) + i17;
                        z14 = this.mIsRtl;
                        flexboxHelper = this.mFlexboxHelper;
                        if (z14) {
                            flexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine2, Math.round(rightDecorationWidth2) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                        } else {
                            flexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine, Math.round(leftDecorationWidth2), topDecorationHeight, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                        }
                        rightDecorationWidth = getRightDecorationWidth(flexItemAt) + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + fMax + leftDecorationWidth2;
                        i14 = i28;
                        leftDecorationWidth = rightDecorationWidth2 - ((getLeftDecorationWidth(flexItemAt) + (flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + fMax);
                    }
                    i15++;
                    flexLine2 = flexLine;
                }
                LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
                return flexLine.getCrossSize();
            }
            int i29 = flexLine2.mMainSize;
            float f19 = (width - i29) + paddingRight;
            f15 = i29 - paddingLeft;
            f14 = f19;
        }
        f16 = 0.0f;
        rightDecorationWidth = f14 - this.mAnchorInfo.mPerpendicularCoordinate;
        leftDecorationWidth = f15 - this.mAnchorInfo.mPerpendicularCoordinate;
        fMax = Math.max(f16, 0.0f);
        itemCount = flexLine2.getItemCount();
        i14 = 0;
        i15 = i18;
        while (i15 < i18 + itemCount) {
            f17 = leftDecorationWidth;
            flexItemAt = getFlexItemAt(i15);
            if (flexItemAt == null) {
                leftDecorationWidth = f17;
            } else {
                if (layoutState.mLayoutDirection == 1) {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt);
                } else {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt, i14);
                    i14++;
                }
                int i210 = i14;
                FlexboxHelper flexboxHelper3 = this.mFlexboxHelper;
                long j14 = flexboxHelper3.mMeasureSpecCache[i15];
                iExtractLowerInt = flexboxHelper3.extractLowerInt(j14);
                iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j14);
                layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                    flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                }
                leftDecorationWidth2 = rightDecorationWidth + getLeftDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                rightDecorationWidth2 = f17 - (getRightDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                topDecorationHeight = getTopDecorationHeight(flexItemAt) + i17;
                z14 = this.mIsRtl;
                flexboxHelper = this.mFlexboxHelper;
                if (z14) {
                    flexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine2, Math.round(rightDecorationWidth2) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                } else {
                    flexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine, Math.round(leftDecorationWidth2), topDecorationHeight, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                }
                rightDecorationWidth = getRightDecorationWidth(flexItemAt) + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + fMax + leftDecorationWidth2;
                i14 = i210;
                leftDecorationWidth = rightDecorationWidth2 - ((getLeftDecorationWidth(flexItemAt) + (flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + fMax);
            }
            i15++;
            flexLine2 = flexLine;
        }
        LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
        return flexLine.getCrossSize();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0130  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    /* JADX WARN: Code duplicated, block: B:60:0x018c  */
    private int layoutFlexLineMainAxisVertical(FlexLine flexLine, LayoutState layoutState) {
        float f14;
        float f15;
        float f16;
        float bottomDecorationHeight;
        float topDecorationHeight;
        float fMax;
        int itemCount;
        int i14;
        int i15;
        float f17;
        View flexItemAt;
        int iExtractLowerInt;
        int iExtractHigherInt;
        LayoutParams layoutParams;
        float topDecorationHeight2;
        float bottomDecorationHeight2;
        int leftDecorationWidth;
        int rightDecorationWidth;
        boolean z14;
        boolean z15;
        boolean z16;
        FlexboxHelper flexboxHelper;
        FlexboxHelper flexboxHelper2;
        FlexLine flexLine2 = flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i16 = layoutState.mOffset;
        int i17 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            int i18 = flexLine2.mCrossSize;
            i16 -= i18;
            i17 += i18;
        }
        int i19 = i16;
        int i24 = i17;
        int i25 = layoutState.mPosition;
        int i26 = this.mJustifyContent;
        boolean z17 = true;
        if (i26 == 0) {
            f14 = paddingTop;
            f15 = height - paddingBottom;
        } else {
            if (i26 != 1) {
                if (i26 == 2) {
                    int i27 = flexLine2.mMainSize;
                    f14 = paddingTop + ((height - i27) / 2.0f);
                    f15 = (height - paddingBottom) - ((height - i27) / 2.0f);
                } else if (i26 == 3) {
                    f14 = paddingTop;
                    int i28 = flexLine2.mItemCount;
                    f16 = (height - flexLine2.mMainSize) / (i28 != 1 ? i28 - 1 : 1.0f);
                    f15 = height - paddingBottom;
                } else if (i26 == 4) {
                    int i29 = flexLine2.mItemCount;
                    f16 = i29 != 0 ? (height - flexLine2.mMainSize) / i29 : 0.0f;
                    float f18 = f16 / 2.0f;
                    f14 = paddingTop + f18;
                    f15 = (height - paddingBottom) - f18;
                } else {
                    if (i26 != 5) {
                        e.i(this.mJustifyContent, "Invalid justifyContent is set: ");
                        return 0;
                    }
                    int i30 = flexLine2.mItemCount;
                    f16 = i30 != 0 ? (height - flexLine2.mMainSize) / (i30 + 1) : 0.0f;
                    f14 = paddingTop + f16;
                    f15 = (height - paddingBottom) - f16;
                }
                bottomDecorationHeight = f14 - this.mAnchorInfo.mPerpendicularCoordinate;
                topDecorationHeight = f15 - this.mAnchorInfo.mPerpendicularCoordinate;
                fMax = Math.max(f16, 0.0f);
                itemCount = flexLine2.getItemCount();
                i14 = 0;
                i15 = i25;
                while (i15 < i25 + itemCount) {
                    f17 = topDecorationHeight;
                    flexItemAt = getFlexItemAt(i15);
                    if (flexItemAt == null) {
                        topDecorationHeight = f17;
                        z16 = z17;
                    } else {
                        FlexboxHelper flexboxHelper3 = this.mFlexboxHelper;
                        long j8 = flexboxHelper3.mMeasureSpecCache[i15];
                        iExtractLowerInt = flexboxHelper3.extractLowerInt(j8);
                        iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j8);
                        layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                        if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                            flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                        }
                        topDecorationHeight2 = bottomDecorationHeight + getTopDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        bottomDecorationHeight2 = f17 - (getBottomDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        if (layoutState.mLayoutDirection == 1) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i14);
                            i14++;
                        }
                        int i34 = i14;
                        leftDecorationWidth = getLeftDecorationWidth(flexItemAt) + i19;
                        rightDecorationWidth = i24 - getRightDecorationWidth(flexItemAt);
                        z14 = this.mIsRtl;
                        z15 = this.mFromBottomToTop;
                        if (z14) {
                            flexboxHelper2 = this.mFlexboxHelper;
                            if (z15) {
                                z16 = true;
                                flexboxHelper2.layoutSingleChildVertical(flexItemAt, flexLine2, z14, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight2));
                            } else {
                                z16 = true;
                                flexboxHelper2.layoutSingleChildVertical(flexItemAt, flexLine, z14, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                            }
                        } else {
                            z16 = true;
                            flexboxHelper = this.mFlexboxHelper;
                            if (z15) {
                                flexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z14, leftDecorationWidth, Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), flexItemAt.getMeasuredWidth() + leftDecorationWidth, Math.round(bottomDecorationHeight2));
                            } else {
                                flexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z14, leftDecorationWidth, Math.round(topDecorationHeight2), flexItemAt.getMeasuredWidth() + leftDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                            }
                        }
                        bottomDecorationHeight = getBottomDecorationHeight(flexItemAt) + flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + fMax + topDecorationHeight2;
                        i14 = i34;
                        topDecorationHeight = bottomDecorationHeight2 - ((getTopDecorationHeight(flexItemAt) + (flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin)) + fMax);
                    }
                    i15++;
                    flexLine2 = flexLine;
                    z17 = z16;
                }
                LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
                return flexLine.getCrossSize();
            }
            int i35 = flexLine2.mMainSize;
            float f19 = (height - i35) + paddingBottom;
            f15 = i35 - paddingTop;
            f14 = f19;
        }
        f16 = 0.0f;
        bottomDecorationHeight = f14 - this.mAnchorInfo.mPerpendicularCoordinate;
        topDecorationHeight = f15 - this.mAnchorInfo.mPerpendicularCoordinate;
        fMax = Math.max(f16, 0.0f);
        itemCount = flexLine2.getItemCount();
        i14 = 0;
        i15 = i25;
        while (i15 < i25 + itemCount) {
            f17 = topDecorationHeight;
            flexItemAt = getFlexItemAt(i15);
            if (flexItemAt == null) {
                topDecorationHeight = f17;
                z16 = z17;
            } else {
                FlexboxHelper flexboxHelper4 = this.mFlexboxHelper;
                long j14 = flexboxHelper4.mMeasureSpecCache[i15];
                iExtractLowerInt = flexboxHelper4.extractLowerInt(j14);
                iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j14);
                layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                    flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                }
                topDecorationHeight2 = bottomDecorationHeight + getTopDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                bottomDecorationHeight2 = f17 - (getBottomDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                if (layoutState.mLayoutDirection == 1) {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt);
                } else {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt, i14);
                    i14++;
                }
                int i36 = i14;
                leftDecorationWidth = getLeftDecorationWidth(flexItemAt) + i19;
                rightDecorationWidth = i24 - getRightDecorationWidth(flexItemAt);
                z14 = this.mIsRtl;
                z15 = this.mFromBottomToTop;
                if (z14) {
                    flexboxHelper2 = this.mFlexboxHelper;
                    if (z15) {
                        z16 = true;
                        flexboxHelper2.layoutSingleChildVertical(flexItemAt, flexLine2, z14, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight2));
                    } else {
                        z16 = true;
                        flexboxHelper2.layoutSingleChildVertical(flexItemAt, flexLine, z14, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                    }
                } else {
                    z16 = true;
                    flexboxHelper = this.mFlexboxHelper;
                    if (z15) {
                        flexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z14, leftDecorationWidth, Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), flexItemAt.getMeasuredWidth() + leftDecorationWidth, Math.round(bottomDecorationHeight2));
                    } else {
                        flexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z14, leftDecorationWidth, Math.round(topDecorationHeight2), flexItemAt.getMeasuredWidth() + leftDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                    }
                }
                bottomDecorationHeight = getBottomDecorationHeight(flexItemAt) + flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + fMax + topDecorationHeight2;
                i14 = i36;
                topDecorationHeight = bottomDecorationHeight2 - ((getTopDecorationHeight(flexItemAt) + (flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin)) + fMax);
            }
            i15++;
            flexLine2 = flexLine;
            z17 = z16;
        }
        LayoutState.access$1512(layoutState, this.mLayoutState.mLayoutDirection);
        return flexLine.getCrossSize();
    }

    private void recycleByLayoutState(RecyclerView.w wVar, LayoutState layoutState) {
        if (layoutState.mShouldRecycle) {
            if (layoutState.mLayoutDirection == -1) {
                recycleFlexLinesFromEnd(wVar, layoutState);
            } else {
                recycleFlexLinesFromStart(wVar, layoutState);
            }
        }
    }

    private void recycleChildren(RecyclerView.w wVar, int i14, int i15) {
        while (i15 >= i14) {
            removeAndRecycleViewAt(i15, wVar);
            i15--;
        }
    }

    private void recycleFlexLinesFromEnd(RecyclerView.w wVar, LayoutState layoutState) {
        int childCount;
        int i14;
        View childAt;
        int i15;
        if (layoutState.mScrollingOffset < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt((i14 = childCount - 1))) == null || (i15 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(childAt)]) == -1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(i15);
        for (int i16 = i14; i16 >= 0; i16--) {
            View childAt2 = getChildAt(i16);
            if (childAt2 != null) {
                if (!canViewBeRecycledFromEnd(childAt2, layoutState.mScrollingOffset)) {
                    break;
                }
                if (flexLine.mFirstIndex != getPosition(childAt2)) {
                    continue;
                } else if (i15 <= 0) {
                    childCount = i16;
                    break;
                } else {
                    i15 += layoutState.mLayoutDirection;
                    flexLine = this.mFlexLines.get(i15);
                    childCount = i16;
                }
            }
        }
        recycleChildren(wVar, childCount, i14);
    }

    private void recycleFlexLinesFromStart(RecyclerView.w wVar, LayoutState layoutState) {
        int childCount;
        View childAt;
        if (layoutState.mScrollingOffset < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        int i14 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(childAt)];
        int i15 = -1;
        if (i14 == -1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(i14);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2 != null) {
                if (!canViewBeRecycledFromStart(childAt2, layoutState.mScrollingOffset)) {
                    break;
                }
                if (flexLine.mLastIndex != getPosition(childAt2)) {
                    continue;
                } else if (i14 >= this.mFlexLines.size() - 1) {
                    i15 = i16;
                    break;
                } else {
                    i14 += layoutState.mLayoutDirection;
                    flexLine = this.mFlexLines.get(i14);
                    i15 = i16;
                }
            }
        }
        recycleChildren(wVar, 0, i15);
    }

    private void resolveInfiniteAmount() {
        int heightMode = isMainAxisDirectionHorizontal() ? getHeightMode() : getWidthMode();
        this.mLayoutState.mInfinite = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    private void resolveLayoutDirection() {
        int layoutDirection = getLayoutDirection();
        int i14 = this.mFlexDirection;
        if (i14 == 0) {
            this.mIsRtl = layoutDirection == 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i14 == 1) {
            this.mIsRtl = layoutDirection != 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i14 == 2) {
            boolean z14 = layoutDirection == 1;
            this.mIsRtl = z14;
            if (this.mFlexWrap == 2) {
                this.mIsRtl = !z14;
            }
            this.mFromBottomToTop = false;
            return;
        }
        if (i14 != 3) {
            this.mIsRtl = false;
            this.mFromBottomToTop = false;
            return;
        }
        boolean z15 = layoutDirection == 1;
        this.mIsRtl = z15;
        if (this.mFlexWrap == 2) {
            this.mIsRtl = !z15;
        }
        this.mFromBottomToTop = true;
    }

    private boolean shouldMeasureChild(View view2, int i14, int i15, RecyclerView.q qVar) {
        return (!view2.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view2.getWidth(), i14, ((ViewGroup.MarginLayoutParams) qVar).width) && isMeasurementUpToDate(view2.getHeight(), i15, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
    }

    private boolean updateAnchorFromChildren(RecyclerView.b0 b0Var, AnchorInfo anchorInfo) {
        if (getChildCount() == 0) {
            return false;
        }
        View viewFindLastReferenceChild = anchorInfo.mLayoutFromEnd ? findLastReferenceChild(b0Var.b()) : findFirstReferenceChild(b0Var.b());
        if (viewFindLastReferenceChild == null) {
            return false;
        }
        anchorInfo.assignFromView(viewFindLastReferenceChild);
        if (b0Var.f10291g || !supportsPredictiveItemAnimations()) {
            return true;
        }
        if (this.mOrientationHelper.e(viewFindLastReferenceChild) < this.mOrientationHelper.g() && this.mOrientationHelper.b(viewFindLastReferenceChild) >= this.mOrientationHelper.k()) {
            return true;
        }
        boolean z14 = anchorInfo.mLayoutFromEnd;
        d0 d0Var = this.mOrientationHelper;
        anchorInfo.mCoordinate = z14 ? d0Var.g() : d0Var.k();
        return true;
    }

    private boolean updateAnchorFromPendingState(RecyclerView.b0 b0Var, AnchorInfo anchorInfo, SavedState savedState) {
        int i14;
        View childAt;
        if (!b0Var.f10291g && (i14 = this.mPendingScrollPosition) != -1) {
            if (i14 >= 0 && i14 < b0Var.b()) {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
                SavedState savedState2 = this.mPendingSavedState;
                if (savedState2 != null && savedState2.hasValidAnchor(b0Var.b())) {
                    anchorInfo.mCoordinate = this.mOrientationHelper.k() + savedState.mAnchorOffset;
                    anchorInfo.mAssignedFromSavedState = true;
                    anchorInfo.mFlexLinePosition = -1;
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.k() + this.mPendingScrollPositionOffset;
                        return true;
                    }
                    anchorInfo.mCoordinate = this.mPendingScrollPositionOffset - this.mOrientationHelper.h();
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                        anchorInfo.mLayoutFromEnd = this.mPendingScrollPosition < getPosition(childAt);
                    }
                    anchorInfo.assignCoordinateFromPadding();
                    return true;
                }
                if (this.mOrientationHelper.c(viewFindViewByPosition) > this.mOrientationHelper.l()) {
                    anchorInfo.assignCoordinateFromPadding();
                    return true;
                }
                int iE = this.mOrientationHelper.e(viewFindViewByPosition) - this.mOrientationHelper.k();
                d0 d0Var = this.mOrientationHelper;
                if (iE < 0) {
                    anchorInfo.mCoordinate = d0Var.k();
                    anchorInfo.mLayoutFromEnd = false;
                    return true;
                }
                if (d0Var.g() - this.mOrientationHelper.b(viewFindViewByPosition) < 0) {
                    anchorInfo.mCoordinate = this.mOrientationHelper.g();
                    anchorInfo.mLayoutFromEnd = true;
                    return true;
                }
                boolean z14 = anchorInfo.mLayoutFromEnd;
                d0 d0Var2 = this.mOrientationHelper;
                anchorInfo.mCoordinate = z14 ? this.mOrientationHelper.m() + d0Var2.b(viewFindViewByPosition) : d0Var2.e(viewFindViewByPosition);
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.b0 b0Var, AnchorInfo anchorInfo) {
        if (updateAnchorFromPendingState(b0Var, anchorInfo, this.mPendingSavedState) || updateAnchorFromChildren(b0Var, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        anchorInfo.mPosition = 0;
        anchorInfo.mFlexLinePosition = 0;
    }

    private void updateDirtyPosition(int i14) {
        if (i14 >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.mFlexboxHelper.ensureMeasureSpecCache(childCount);
        this.mFlexboxHelper.ensureMeasuredSizeCache(childCount);
        this.mFlexboxHelper.ensureIndexToFlexLine(childCount);
        if (i14 >= this.mFlexboxHelper.mIndexToFlexLine.length) {
            return;
        }
        this.mDirtyPosition = i14;
        View childClosestToStart = getChildClosestToStart();
        if (childClosestToStart == null) {
            return;
        }
        this.mPendingScrollPosition = getPosition(childClosestToStart);
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mPendingScrollPositionOffset = this.mOrientationHelper.e(childClosestToStart) - this.mOrientationHelper.k();
        } else {
            this.mPendingScrollPositionOffset = this.mOrientationHelper.h() + this.mOrientationHelper.b(childClosestToStart);
        }
    }

    private void updateFlexLines(int i14) {
        int i15;
        int i16;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean z14 = false;
        if (isMainAxisDirectionHorizontal()) {
            int i17 = this.mLastWidth;
            if (i17 != Integer.MIN_VALUE && i17 != width) {
                z14 = true;
            }
            i15 = this.mLayoutState.mInfinite ? this.mContext.getResources().getDisplayMetrics().heightPixels : this.mLayoutState.mAvailable;
        } else {
            int i18 = this.mLastHeight;
            if (i18 != Integer.MIN_VALUE && i18 != height) {
                z14 = true;
            }
            i15 = this.mLayoutState.mInfinite ? this.mContext.getResources().getDisplayMetrics().widthPixels : this.mLayoutState.mAvailable;
        }
        int i19 = i15;
        this.mLastWidth = width;
        this.mLastHeight = height;
        int i24 = this.mDirtyPosition;
        if (i24 == -1 && (this.mPendingScrollPosition != -1 || z14)) {
            if (this.mAnchorInfo.mLayoutFromEnd) {
                return;
            }
            this.mFlexLines.clear();
            this.mFlexLinesResult.reset();
            boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
            FlexboxHelper flexboxHelper = this.mFlexboxHelper;
            if (zIsMainAxisDirectionHorizontal) {
                flexboxHelper.calculateHorizontalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i19, this.mAnchorInfo.mPosition, this.mFlexLines);
            } else {
                flexboxHelper.calculateVerticalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i19, this.mAnchorInfo.mPosition, this.mFlexLines);
            }
            this.mFlexLines = this.mFlexLinesResult.mFlexLines;
            this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.mFlexboxHelper.stretchViews();
            AnchorInfo anchorInfo = this.mAnchorInfo;
            anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
            this.mLayoutState.mFlexLinePosition = this.mAnchorInfo.mFlexLinePosition;
            return;
        }
        AnchorInfo anchorInfo2 = this.mAnchorInfo;
        int iMin = i24 != -1 ? Math.min(i24, anchorInfo2.mPosition) : anchorInfo2.mPosition;
        this.mFlexLinesResult.reset();
        boolean zIsMainAxisDirectionHorizontal2 = isMainAxisDirectionHorizontal();
        List<FlexLine> list = this.mFlexLines;
        if (zIsMainAxisDirectionHorizontal2) {
            int size = list.size();
            FlexboxHelper flexboxHelper2 = this.mFlexboxHelper;
            if (size > 0) {
                flexboxHelper2.clearFlexLines(this.mFlexLines, iMin);
                this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i19, iMin, this.mAnchorInfo.mPosition, this.mFlexLines);
                i16 = iMin;
            } else {
                i16 = iMin;
                flexboxHelper2.ensureIndexToFlexLine(i14);
                this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i19, 0, this.mFlexLines);
            }
        } else {
            i16 = iMin;
            int size2 = list.size();
            FlexboxHelper flexboxHelper3 = this.mFlexboxHelper;
            if (size2 > 0) {
                flexboxHelper3.clearFlexLines(this.mFlexLines, i16);
                iMin = i16;
                this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec2, iMakeMeasureSpec, i19, iMin, this.mAnchorInfo.mPosition, this.mFlexLines);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                i16 = iMin;
            } else {
                flexboxHelper3.ensureIndexToFlexLine(i14);
                this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i19, 0, this.mFlexLines);
            }
        }
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, i16);
        this.mFlexboxHelper.stretchViews(i16);
    }

    private void updateLayoutState(int i14, int i15) {
        this.mLayoutState.mLayoutDirection = i14;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z14 = !zIsMainAxisDirectionHorizontal && this.mIsRtl;
        if (i14 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt == null) {
                return;
            }
            this.mLayoutState.mOffset = this.mOrientationHelper.b(childAt);
            int position = getPosition(childAt);
            View viewFindLastReferenceViewInLine = findLastReferenceViewInLine(childAt, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position]));
            this.mLayoutState.mItemDirection = 1;
            LayoutState layoutState = this.mLayoutState;
            layoutState.mPosition = position + layoutState.mItemDirection;
            int length = this.mFlexboxHelper.mIndexToFlexLine.length;
            int i16 = this.mLayoutState.mPosition;
            LayoutState layoutState2 = this.mLayoutState;
            if (length <= i16) {
                layoutState2.mFlexLinePosition = -1;
            } else {
                layoutState2.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[layoutState2.mPosition];
            }
            LayoutState layoutState3 = this.mLayoutState;
            d0 d0Var = this.mOrientationHelper;
            if (z14) {
                layoutState3.mOffset = d0Var.e(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.k() + (-this.mOrientationHelper.e(viewFindLastReferenceViewInLine));
                LayoutState layoutState4 = this.mLayoutState;
                layoutState4.mScrollingOffset = Math.max(layoutState4.mScrollingOffset, 0);
            } else {
                layoutState3.mOffset = d0Var.b(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.b(viewFindLastReferenceViewInLine) - this.mOrientationHelper.g();
            }
            if ((this.mLayoutState.mFlexLinePosition == -1 || this.mLayoutState.mFlexLinePosition > this.mFlexLines.size() - 1) && this.mLayoutState.mPosition <= getFlexItemCount()) {
                int i17 = i15 - this.mLayoutState.mScrollingOffset;
                this.mFlexLinesResult.reset();
                if (i17 > 0) {
                    FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                    FlexboxHelper.FlexLinesResult flexLinesResult = this.mFlexLinesResult;
                    if (zIsMainAxisDirectionHorizontal) {
                        flexboxHelper.calculateHorizontalFlexLines(flexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i17, this.mLayoutState.mPosition, this.mFlexLines);
                    } else {
                        flexboxHelper.calculateVerticalFlexLines(flexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i17, this.mLayoutState.mPosition, this.mFlexLines);
                    }
                    this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, this.mLayoutState.mPosition);
                    this.mFlexboxHelper.stretchViews(this.mLayoutState.mPosition);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 == null) {
                return;
            }
            this.mLayoutState.mOffset = this.mOrientationHelper.e(childAt2);
            int position2 = getPosition(childAt2);
            View viewFindFirstReferenceViewInLine = findFirstReferenceViewInLine(childAt2, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position2]));
            this.mLayoutState.mItemDirection = 1;
            int i18 = this.mFlexboxHelper.mIndexToFlexLine[position2];
            if (i18 == -1) {
                i18 = 0;
            }
            if (i18 > 0) {
                this.mLayoutState.mPosition = position2 - this.mFlexLines.get(i18 - 1).getItemCount();
            } else {
                this.mLayoutState.mPosition = -1;
            }
            this.mLayoutState.mFlexLinePosition = i18 > 0 ? i18 - 1 : 0;
            LayoutState layoutState5 = this.mLayoutState;
            d0 d0Var2 = this.mOrientationHelper;
            if (z14) {
                layoutState5.mOffset = d0Var2.b(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.b(viewFindFirstReferenceViewInLine) - this.mOrientationHelper.g();
                LayoutState layoutState6 = this.mLayoutState;
                layoutState6.mScrollingOffset = Math.max(layoutState6.mScrollingOffset, 0);
            } else {
                layoutState5.mOffset = d0Var2.e(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.k() + (-this.mOrientationHelper.e(viewFindFirstReferenceViewInLine));
            }
        }
        LayoutState layoutState7 = this.mLayoutState;
        layoutState7.mAvailable = i15 - layoutState7.mScrollingOffset;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo, boolean z14, boolean z15) {
        if (z15) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.mAvailable = this.mOrientationHelper.g() - anchorInfo.mCoordinate;
        } else {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - getPaddingRight();
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = 1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z14 || this.mFlexLines.size() <= 1 || anchorInfo.mFlexLinePosition < 0 || anchorInfo.mFlexLinePosition >= this.mFlexLines.size() - 1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1508(this.mLayoutState);
        LayoutState.access$2212(this.mLayoutState, flexLine.getItemCount());
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo, boolean z14, boolean z15) {
        if (z15) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - this.mOrientationHelper.k();
        } else {
            this.mLayoutState.mAvailable = (this.mParent.getWidth() - anchorInfo.mCoordinate) - this.mOrientationHelper.k();
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = -1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z14 || anchorInfo.mFlexLinePosition <= 0 || this.mFlexLines.size() <= anchorInfo.mFlexLinePosition) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1510(this.mLayoutState);
        LayoutState.access$2220(this.mLayoutState, flexLine.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        if (this.mFlexWrap == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            return true;
        }
        int width = getWidth();
        View view2 = this.mParent;
        return width > (view2 != null ? view2.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        if (this.mFlexWrap == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            int height = getHeight();
            View view2 = this.mParent;
            if (height <= (view2 != null ? view2.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        return computeScrollExtent(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return computeScrollRange(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF computeScrollVectorForPosition(int i14) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i15 = i14 < getPosition(childAt) ? -1 : 1;
        return isMainAxisDirectionHorizontal() ? new PointF(0.0f, i15) : new PointF(i15, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        return computeScrollExtent(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return computeScrollRange(b0Var);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i14, int i15, int i16) {
        return RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), i15, i16, canScrollVertically());
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i14, int i15, int i16) {
        return RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), i15, i16, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view2) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view2);
            rightDecorationWidth = getBottomDecorationHeight(view2);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view2);
            rightDecorationWidth = getRightDecorationWidth(view2);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view2, int i14, int i15) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view2);
            bottomDecorationHeight = getRightDecorationWidth(view2);
        } else {
            topDecorationHeight = getTopDecorationHeight(view2);
            bottomDecorationHeight = getBottomDecorationHeight(view2);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i14) {
        View view2 = this.mViewCache.get(i14);
        return view2 != null ? view2 : this.mRecycler.e(i14);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return this.mState.b();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        int size = this.mFlexLines.size();
        for (int i14 = 0; i14 < size; i14++) {
            FlexLine flexLine = this.mFlexLines.get(i14);
            if (flexLine.getItemCount() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getLargestMainSize() {
        if (this.mFlexLines.size() == 0) {
            return 0;
        }
        int size = this.mFlexLines.size();
        int iMax = Integer.MIN_VALUE;
        for (int i14 = 0; i14 < size; i14++) {
            iMax = Math.max(iMax, this.mFlexLines.get(i14).mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public int getPositionToFlexLineIndex(int i14) {
        return this.mFlexboxHelper.mIndexToFlexLine[i14];
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i14) {
        return getFlexItemAt(i14);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i14 += this.mFlexLines.get(i15).mCrossSize;
        }
        return i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRtl() {
        return this.mIsRtl;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i14 = this.mFlexDirection;
        return i14 == 0 || i14 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mParent = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(wVar);
            wVar.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i14, int i15) {
        super.onItemsAdded(recyclerView, i14, i15);
        updateDirtyPosition(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i14, int i15, int i16) {
        super.onItemsMoved(recyclerView, i14, i15, i16);
        updateDirtyPosition(Math.min(i14, i15));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i14, int i15) {
        super.onItemsRemoved(recyclerView, i14, i15);
        updateDirtyPosition(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i14, int i15, Object obj) {
        super.onItemsUpdated(recyclerView, i14, i15, obj);
        updateDirtyPosition(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i14;
        int i15;
        this.mRecycler = wVar;
        this.mState = b0Var;
        int iB = b0Var.b();
        if (iB == 0 && b0Var.f10291g) {
            return;
        }
        resolveLayoutDirection();
        ensureOrientationHelper();
        ensureLayoutState();
        this.mFlexboxHelper.ensureMeasureSpecCache(iB);
        this.mFlexboxHelper.ensureMeasuredSizeCache(iB);
        this.mFlexboxHelper.ensureIndexToFlexLine(iB);
        this.mLayoutState.mShouldRecycle = false;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor(iB)) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        if (!this.mAnchorInfo.mValid || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.reset();
            updateAnchorInfoForLayout(b0Var, this.mAnchorInfo);
            this.mAnchorInfo.mValid = true;
        }
        detachAndScrapAttachedViews(wVar);
        boolean z14 = this.mAnchorInfo.mLayoutFromEnd;
        AnchorInfo anchorInfo = this.mAnchorInfo;
        if (z14) {
            updateLayoutStateToFillStart(anchorInfo, false, true);
        } else {
            updateLayoutStateToFillEnd(anchorInfo, false, true);
        }
        updateFlexLines(iB);
        fill(wVar, b0Var, this.mLayoutState);
        boolean z15 = this.mAnchorInfo.mLayoutFromEnd;
        LayoutState layoutState = this.mLayoutState;
        if (z15) {
            i15 = layoutState.mOffset;
            updateLayoutStateToFillEnd(this.mAnchorInfo, true, false);
            fill(wVar, b0Var, this.mLayoutState);
            i14 = this.mLayoutState.mOffset;
        } else {
            i14 = layoutState.mOffset;
            updateLayoutStateToFillStart(this.mAnchorInfo, true, false);
            fill(wVar, b0Var, this.mLayoutState);
            i15 = this.mLayoutState.mOffset;
        }
        if (getChildCount() > 0) {
            if (this.mAnchorInfo.mLayoutFromEnd) {
                fixLayoutStartGap(i15 + fixLayoutEndGap(i14, wVar, b0Var, true), wVar, b0Var, false);
            } else {
                fixLayoutEndGap(i14 + fixLayoutStartGap(i15, wVar, b0Var, true), wVar, b0Var, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mDirtyPosition = -1;
        this.mAnchorInfo.reset();
        this.mViewCache.clear();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view2, int i14, int i15, FlexLine flexLine) {
        calculateItemDecorationsForChild(view2, TEMP_RECT);
        if (isMainAxisDirectionHorizontal()) {
            int rightDecorationWidth = getRightDecorationWidth(view2) + getLeftDecorationWidth(view2);
            flexLine.mMainSize += rightDecorationWidth;
            flexLine.mDividerLengthInMainSize += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view2) + getTopDecorationHeight(view2);
        flexLine.mMainSize += bottomDecorationHeight;
        flexLine.mDividerLengthInMainSize += bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.invalidateAnchor();
            return savedState;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState.mAnchorPosition = getPosition(childClosestToStart);
        savedState.mAnchorOffset = this.mOrientationHelper.e(childClosestToStart) - this.mOrientationHelper.k();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (!isMainAxisDirectionHorizontal() || this.mFlexWrap == 0) {
            int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i14, wVar, b0Var);
            this.mViewCache.clear();
            return iHandleScrollingMainOrientation;
        }
        int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i14);
        AnchorInfo.access$2412(this.mAnchorInfo, iHandleScrollingSubOrientation);
        this.mSubOrientationHelper.p(-iHandleScrollingSubOrientation);
        return iHandleScrollingSubOrientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i14) {
        this.mPendingScrollPosition = i14;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (isMainAxisDirectionHorizontal() || (this.mFlexWrap == 0 && !isMainAxisDirectionHorizontal())) {
            int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i14, wVar, b0Var);
            this.mViewCache.clear();
            return iHandleScrollingMainOrientation;
        }
        int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i14);
        AnchorInfo.access$2412(this.mAnchorInfo, iHandleScrollingSubOrientation);
        this.mSubOrientationHelper.p(-iHandleScrollingSubOrientation);
        return iHandleScrollingSubOrientation;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i14) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i14) {
        int i15 = this.mAlignItems;
        if (i15 != i14) {
            if (i15 == 4 || i14 == 4) {
                removeAllViews();
                clearFlexLines();
            }
            this.mAlignItems = i14;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i14) {
        if (this.mFlexDirection != i14) {
            removeAllViews();
            this.mFlexDirection = i14;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            clearFlexLines();
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i14) {
        if (i14 == 2) {
            e.w("wrap_reverse is not supported in FlexboxLayoutManager");
            return;
        }
        int i15 = this.mFlexWrap;
        if (i15 != i14) {
            if (i15 == 0 || i14 == 0) {
                removeAllViews();
                clearFlexLines();
            }
            this.mFlexWrap = i14;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setJustifyContent(int i14) {
        if (this.mJustifyContent != i14) {
            this.mJustifyContent = i14;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setMaxLine(int i14) {
        if (this.mMaxLine != i14) {
            this.mMaxLine = i14;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z14) {
        this.mRecycleChildrenOnDetach = z14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i14) {
        w wVar = new w(recyclerView.getContext());
        wVar.setTargetPosition(i14);
        startSmoothScroll(wVar);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i14, View view2) {
        this.mViewCache.put(i14, view2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i14, int i15) {
        super.onItemsUpdated(recyclerView, i14, i15);
        updateDirtyPosition(i14);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i14) {
                return new SavedState[i14];
            }
        };
        private int mAnchorOffset;
        private int mAnchorPosition;

        private SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasValidAnchor(int i14) {
            int i15 = this.mAnchorPosition;
            return i15 >= 0 && i15 < i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("SavedState{mAnchorPosition=");
            sb3.append(this.mAnchorPosition);
            sb3.append(", mAnchorOffset=");
            return e0.j(sb3, this.mAnchorOffset, CoreConstants.CURLY_RIGHT);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
        }

        public SavedState() {
        }

        private SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
        }
    }

    public FlexboxLayoutManager(Context context, int i14) {
        this(context, i14, 1);
    }

    public FlexboxLayoutManager(Context context, int i14, int i15) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        setFlexDirection(i14);
        setFlexWrap(i15);
        setAlignItems(4);
        this.mContext = context;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    public static class LayoutParams extends RecyclerView.q implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i14) {
                return new LayoutParams[i14];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private boolean mWrapBefore;

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i14) {
            this.mAlignSelf = i14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f14) {
            this.mFlexBasisPercent = f14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f14) {
            this.mFlexGrow = f14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f14) {
            this.mFlexShrink = f14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i14) {
            ((ViewGroup.MarginLayoutParams) this).height = i14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i14) {
            this.mMaxHeight = i14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i14) {
            this.mMaxWidth = i14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i14) {
            this.mMinHeight = i14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i14) {
            this.mMinWidth = i14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i14) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i14) {
            ((ViewGroup.MarginLayoutParams) this).width = i14;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z14) {
            this.mWrapBefore = z14;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i14) {
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i14, int i15) {
            super(i14, i15);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(RecyclerView.q qVar) {
            super(qVar);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.q) layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }
    }
}
