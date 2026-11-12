package com.google.android.flexbox;

import am.j;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.animation.keyframe.a;
import ds.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
class FlexboxHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_CAPACITY = 10;
    private static final long MEASURE_SPEC_WIDTH_MASK = 4294967295L;
    private boolean[] mChildrenFrozen;
    private final FlexContainer mFlexContainer;
    int[] mIndexToFlexLine;
    long[] mMeasureSpecCache;
    private long[] mMeasuredSizeCache;

    public static class FlexLinesResult {
        int mChildState;
        List<FlexLine> mFlexLines;

        public void reset() {
            this.mFlexLines = null;
            this.mChildState = 0;
        }
    }

    public static class Order implements Comparable<Order> {
        int index;
        int order;

        private Order() {
        }

        @Override // java.lang.Comparable
        public int compareTo(Order order) {
            int i14 = this.order;
            int i15 = order.order;
            return i14 != i15 ? i14 - i15 : this.index - order.index;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("Order{order=");
            sb3.append(this.order);
            sb3.append(", index=");
            return e0.j(sb3, this.index, CoreConstants.CURLY_RIGHT);
        }
    }

    public FlexboxHelper(FlexContainer flexContainer) {
        this.mFlexContainer = flexContainer;
    }

    private void addFlexLine(List<FlexLine> list, FlexLine flexLine, int i14, int i15) {
        flexLine.mSumCrossSizeBefore = i15;
        this.mFlexContainer.onNewFlexLineAdded(flexLine);
        flexLine.mLastIndex = i14;
        list.add(flexLine);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void checkSizeConstraints(View view2, int i14) {
        boolean z14;
        FlexItem flexItem = (FlexItem) view2.getLayoutParams();
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view2.getMeasuredHeight();
        boolean z15 = true;
        if (measuredWidth >= flexItem.getMinWidth()) {
            if (measuredWidth > flexItem.getMaxWidth()) {
                measuredWidth = flexItem.getMaxWidth();
            } else {
                z14 = false;
            }
            if (measuredHeight < flexItem.getMinHeight()) {
                measuredHeight = flexItem.getMinHeight();
            } else if (measuredHeight > flexItem.getMaxHeight()) {
                measuredHeight = flexItem.getMaxHeight();
            } else {
                z15 = z14;
            }
            if (z15) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                updateMeasureCache(i14, iMakeMeasureSpec, iMakeMeasureSpec2, view2);
                this.mFlexContainer.updateViewCache(i14, view2);
            }
        }
        measuredWidth = flexItem.getMinWidth();
        z14 = true;
        if (measuredHeight < flexItem.getMinHeight()) {
            measuredHeight = flexItem.getMinHeight();
        } else if (measuredHeight > flexItem.getMaxHeight()) {
            measuredHeight = flexItem.getMaxHeight();
        } else {
            z15 = z14;
        }
        if (z15) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view2.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            updateMeasureCache(i14, iMakeMeasureSpec3, iMakeMeasureSpec4, view2);
            this.mFlexContainer.updateViewCache(i14, view2);
        }
    }

    private List<FlexLine> constructFlexLinesForAlignContentCenter(List<FlexLine> list, int i14, int i15) {
        int i16 = (i14 - i15) / 2;
        ArrayList arrayList = new ArrayList();
        FlexLine flexLine = new FlexLine();
        flexLine.mCrossSize = i16;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (i17 == 0) {
                arrayList.add(flexLine);
            }
            arrayList.add(list.get(i17));
            if (i17 == list.size() - 1) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    private List<Order> createOrders(int i14) {
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            FlexItem flexItem = (FlexItem) this.mFlexContainer.getFlexItemAt(i15).getLayoutParams();
            Order order = new Order();
            order.order = flexItem.getOrder();
            order.index = i15;
            arrayList.add(order);
        }
        return arrayList;
    }

    private void ensureChildrenFrozen(int i14) {
        boolean[] zArr = this.mChildrenFrozen;
        if (zArr == null) {
            this.mChildrenFrozen = new boolean[Math.max(i14, 10)];
        } else if (zArr.length < i14) {
            this.mChildrenFrozen = new boolean[Math.max(zArr.length * 2, i14)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void evaluateMinimumSizeForCompoundButton(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int minWidth = flexItem.getMinWidth();
        int minHeight = flexItem.getMinHeight();
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
        int minimumHeight = buttonDrawable != null ? buttonDrawable.getMinimumHeight() : 0;
        if (minWidth == -1) {
            minWidth = minimumWidth;
        }
        flexItem.setMinWidth(minWidth);
        if (minHeight == -1) {
            minHeight = minimumHeight;
        }
        flexItem.setMinHeight(minHeight);
    }

    private void expandFlexItems(int i14, int i15, FlexLine flexLine, int i16, int i17, boolean z14) {
        int i18;
        float f14;
        float f15;
        boolean z15;
        int i19;
        int iMax;
        int maxWidth;
        int i24;
        double d14;
        double d15;
        float f16 = flexLine.mTotalFlexGrow;
        float f17 = 0.0f;
        if (f16 <= 0.0f || i16 < (i18 = flexLine.mMainSize)) {
            return;
        }
        float f18 = (i16 - i18) / f16;
        flexLine.mMainSize = i17 + flexLine.mDividerLengthInMainSize;
        if (!z14) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i25 = 0;
        boolean z16 = false;
        int i26 = 0;
        float f19 = 0.0f;
        while (i25 < flexLine.mItemCount) {
            int i27 = flexLine.mFirstIndex + i25;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i27);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f14 = f17;
                f15 = f18;
                z15 = z16;
                i19 = i25;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                f14 = f17;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    f15 = f18;
                    z15 = z16;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i27]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i27]);
                    }
                    if (this.mChildrenFrozen[i27] || flexItem.getFlexGrow() <= f14) {
                        i19 = i25;
                    } else {
                        float flexGrow = (flexItem.getFlexGrow() * f15) + measuredWidth;
                        if (i25 == flexLine.mItemCount - 1) {
                            flexGrow += f19;
                            f19 = f14;
                        }
                        int iRound = Math.round(flexGrow);
                        if (iRound > flexItem.getMaxWidth()) {
                            maxWidth = flexItem.getMaxWidth();
                            this.mChildrenFrozen[i27] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            z15 = true;
                            i19 = i25;
                        } else {
                            float f22 = (flexGrow - iRound) + f19;
                            i19 = i25;
                            double d16 = f22;
                            if (d16 > 1.0d) {
                                i24 = iRound + 1;
                                d14 = d16 - 1.0d;
                            } else if (d16 < -1.0d) {
                                i24 = iRound - 1;
                                d14 = d16 + 1.0d;
                            } else {
                                maxWidth = iRound;
                                f19 = f22;
                            }
                            f19 = (float) d14;
                            maxWidth = i24;
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i15, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(maxWidth, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i27, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i27, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i26, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + flexLine.mMainSize;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i27]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i27]);
                    }
                    if (!this.mChildrenFrozen[i27] && flexItem.getFlexGrow() > f14) {
                        float flexGrow2 = (flexItem.getFlexGrow() * f18) + measuredHeight3;
                        if (i25 == flexLine.mItemCount - 1) {
                            flexGrow2 += f19;
                            f19 = f14;
                        }
                        int iRound2 = Math.round(flexGrow2);
                        if (iRound2 > flexItem.getMaxHeight()) {
                            iRound2 = flexItem.getMaxHeight();
                            this.mChildrenFrozen[i27] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            z16 = true;
                        } else {
                            float f24 = (flexGrow2 - iRound2) + f19;
                            double d17 = f24;
                            if (d17 > 1.0d) {
                                iRound2++;
                                d15 = d17 - 1.0d;
                            } else if (d17 < -1.0d) {
                                iRound2--;
                                d15 = d17 + 1.0d;
                            } else {
                                f19 = f24;
                            }
                            f19 = (float) d15;
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i14, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i27, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i27, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i26, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom() + flexLine.mMainSize;
                    f15 = f18;
                    z15 = z16;
                    i19 = i25;
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i26 = iMax;
            }
            i25 = i19 + 1;
            f18 = f15;
            z16 = z15;
            f17 = f14;
        }
        if (!z16 || i18 == flexLine.mMainSize) {
            return;
        }
        expandFlexItems(i14, i15, flexLine, i16, i17, true);
    }

    private int getChildHeightMeasureSpecInternal(int i14, FlexItem flexItem, int i15) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childHeightMeasureSpec = flexContainer.getChildHeightMeasureSpec(i14, flexContainer.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i15, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        if (size > flexItem.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec));
        }
        return size < flexItem.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : childHeightMeasureSpec;
    }

    private int getChildWidthMeasureSpecInternal(int i14, FlexItem flexItem, int i15) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childWidthMeasureSpec = flexContainer.getChildWidthMeasureSpec(i14, flexContainer.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i15, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        if (size > flexItem.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec));
        }
        return size < flexItem.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : childWidthMeasureSpec;
    }

    private int getFlexItemMarginEndCross(FlexItem flexItem, boolean z14) {
        return z14 ? flexItem.getMarginBottom() : flexItem.getMarginRight();
    }

    private int getFlexItemMarginEndMain(FlexItem flexItem, boolean z14) {
        return z14 ? flexItem.getMarginRight() : flexItem.getMarginBottom();
    }

    private int getFlexItemMarginStartCross(FlexItem flexItem, boolean z14) {
        return z14 ? flexItem.getMarginTop() : flexItem.getMarginLeft();
    }

    private int getFlexItemMarginStartMain(FlexItem flexItem, boolean z14) {
        return z14 ? flexItem.getMarginLeft() : flexItem.getMarginTop();
    }

    private int getFlexItemSizeCross(FlexItem flexItem, boolean z14) {
        return z14 ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int getFlexItemSizeMain(FlexItem flexItem, boolean z14) {
        return z14 ? flexItem.getWidth() : flexItem.getHeight();
    }

    private int getPaddingEndCross(boolean z14) {
        FlexContainer flexContainer = this.mFlexContainer;
        return z14 ? flexContainer.getPaddingBottom() : flexContainer.getPaddingEnd();
    }

    private int getPaddingEndMain(boolean z14) {
        FlexContainer flexContainer = this.mFlexContainer;
        return z14 ? flexContainer.getPaddingEnd() : flexContainer.getPaddingBottom();
    }

    private int getPaddingStartCross(boolean z14) {
        FlexContainer flexContainer = this.mFlexContainer;
        return z14 ? flexContainer.getPaddingTop() : flexContainer.getPaddingStart();
    }

    private int getPaddingStartMain(boolean z14) {
        FlexContainer flexContainer = this.mFlexContainer;
        return z14 ? flexContainer.getPaddingStart() : flexContainer.getPaddingTop();
    }

    private int getViewMeasuredSizeCross(View view2, boolean z14) {
        return z14 ? view2.getMeasuredHeight() : view2.getMeasuredWidth();
    }

    private int getViewMeasuredSizeMain(View view2, boolean z14) {
        return z14 ? view2.getMeasuredWidth() : view2.getMeasuredHeight();
    }

    private boolean isLastFlexItem(int i14, int i15, FlexLine flexLine) {
        return i14 == i15 - 1 && flexLine.getItemCountNotGone() != 0;
    }

    private boolean isWrapRequired(View view2, int i14, int i15, int i16, int i17, FlexItem flexItem, int i18, int i19, int i24) {
        if (this.mFlexContainer.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.isWrapBefore()) {
            return true;
        }
        if (i14 == 0) {
            return false;
        }
        int maxLine = this.mFlexContainer.getMaxLine();
        if (maxLine != -1 && maxLine <= i24 + 1) {
            return false;
        }
        int decorationLengthMainAxis = this.mFlexContainer.getDecorationLengthMainAxis(view2, i18, i19);
        if (decorationLengthMainAxis > 0) {
            i17 += decorationLengthMainAxis;
        }
        return i15 < i16 + i17;
    }

    private void shrinkFlexItems(int i14, int i15, FlexLine flexLine, int i16, int i17, boolean z14) {
        float f14;
        float f15;
        int iMax;
        int i18 = flexLine.mMainSize;
        float f16 = flexLine.mTotalFlexShrink;
        float f17 = 0.0f;
        if (f16 <= 0.0f || i16 > i18) {
            return;
        }
        float f18 = (i18 - i16) / f16;
        flexLine.mMainSize = i17 + flexLine.mDividerLengthInMainSize;
        if (!z14) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i19 = 0;
        boolean z15 = false;
        int i24 = 0;
        float f19 = 0.0f;
        while (i19 < flexLine.mItemCount) {
            int i25 = flexLine.mFirstIndex + i19;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i25);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f14 = f17;
                f15 = f18;
                z15 = z15;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                f14 = f17;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i25]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    f15 = f18;
                    boolean z16 = z15;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i25]);
                    }
                    if (this.mChildrenFrozen[i25] || flexItem.getFlexShrink() <= f14) {
                        z15 = z16;
                    } else {
                        float flexShrink = measuredWidth - (f15 * flexItem.getFlexShrink());
                        if (i19 == flexLine.mItemCount - 1) {
                            flexShrink += f19;
                            f19 = f14;
                        }
                        int iRound = Math.round(flexShrink);
                        if (iRound < flexItem.getMinWidth()) {
                            iRound = flexItem.getMinWidth();
                            this.mChildrenFrozen[i25] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z15 = true;
                        } else {
                            float f22 = (flexShrink - iRound) + f19;
                            double d14 = f22;
                            if (d14 > 1.0d) {
                                iRound++;
                                f22 -= 1.0f;
                            } else if (d14 < -1.0d) {
                                iRound--;
                                f22 += 1.0f;
                            }
                            f19 = f22;
                            z15 = z16;
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i15, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i25, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i25, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i24, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + flexLine.mMainSize;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i25]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i25]);
                    }
                    if (!this.mChildrenFrozen[i25] && flexItem.getFlexShrink() > f14) {
                        float flexShrink2 = measuredHeight3 - (flexItem.getFlexShrink() * f18);
                        if (i19 == flexLine.mItemCount - 1) {
                            flexShrink2 += f19;
                            f19 = f14;
                        }
                        int iRound2 = Math.round(flexShrink2);
                        if (iRound2 < flexItem.getMinHeight()) {
                            iRound2 = flexItem.getMinHeight();
                            this.mChildrenFrozen[i25] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z15 = true;
                        } else {
                            float f24 = (flexShrink2 - iRound2) + f19;
                            double d15 = f24;
                            if (d15 > 1.0d) {
                                iRound2++;
                                f24 -= 1.0f;
                            } else if (d15 < -1.0d) {
                                iRound2--;
                                f24 += 1.0f;
                            }
                            f19 = f24;
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i14, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i25, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i25, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i24, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom() + flexLine.mMainSize;
                    f15 = f18;
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i24 = iMax;
            }
            i19++;
            f18 = f15;
            f17 = f14;
        }
        if (!z15 || i18 == flexLine.mMainSize) {
            return;
        }
        shrinkFlexItems(i14, i15, flexLine, i16, i17, true);
    }

    private int[] sortOrdersIntoReorderedIndices(int i14, List<Order> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i14];
        int i15 = 0;
        for (Order order : list) {
            int i16 = order.index;
            iArr[i15] = i16;
            sparseIntArray.append(i16, order.order);
            i15++;
        }
        return iArr;
    }

    private void stretchViewHorizontally(View view2, int i14, int i15) {
        FlexItem flexItem = (FlexItem) view2.getLayoutParams();
        int iMin = Math.min(Math.max(((i14 - flexItem.getMarginLeft()) - flexItem.getMarginRight()) - this.mFlexContainer.getDecorationLengthCrossAxis(view2), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.mMeasuredSizeCache;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? extractHigherInt(jArr[i15]) : view2.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view2.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        updateMeasureCache(i15, iMakeMeasureSpec2, iMakeMeasureSpec, view2);
        this.mFlexContainer.updateViewCache(i15, view2);
    }

    private void stretchViewVertically(View view2, int i14, int i15) {
        FlexItem flexItem = (FlexItem) view2.getLayoutParams();
        int iMin = Math.min(Math.max(((i14 - flexItem.getMarginTop()) - flexItem.getMarginBottom()) - this.mFlexContainer.getDecorationLengthCrossAxis(view2), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.mMeasuredSizeCache;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? extractLowerInt(jArr[i15]) : view2.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        updateMeasureCache(i15, iMakeMeasureSpec, iMakeMeasureSpec2, view2);
        this.mFlexContainer.updateViewCache(i15, view2);
    }

    private void updateMeasureCache(int i14, int i15, int i16, View view2) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr != null) {
            jArr[i14] = makeCombinedLong(i15, i16);
        }
        long[] jArr2 = this.mMeasuredSizeCache;
        if (jArr2 != null) {
            jArr2[i14] = makeCombinedLong(view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void calculateFlexLines(FlexLinesResult flexLinesResult, int i14, int i15, int i16, int i17, int i18, List<FlexLine> list) {
        int i19;
        boolean z14;
        int i24;
        int i25;
        int i26;
        int childWidthMeasureSpec;
        int i27;
        int i28;
        int i29;
        FlexLine flexLine;
        int i30;
        int i34;
        boolean z15;
        int i35;
        int i36;
        int i37 = i14;
        boolean zIsMainAxisDirectionHorizontal = this.mFlexContainer.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i37);
        int size = View.MeasureSpec.getSize(i37);
        List<FlexLine> arrayList = list == null ? new ArrayList() : list;
        flexLinesResult.mFlexLines = arrayList;
        boolean z16 = i18 == -1;
        int paddingStartMain = getPaddingStartMain(zIsMainAxisDirectionHorizontal);
        int paddingEndMain = getPaddingEndMain(zIsMainAxisDirectionHorizontal);
        int paddingStartCross = getPaddingStartCross(zIsMainAxisDirectionHorizontal);
        int paddingEndCross = getPaddingEndCross(zIsMainAxisDirectionHorizontal);
        FlexLine flexLine2 = new FlexLine();
        int i38 = i17;
        flexLine2.mFirstIndex = i38;
        int i39 = paddingStartMain + paddingEndMain;
        flexLine2.mMainSize = i39;
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        boolean z17 = z16;
        FlexLine flexLine3 = flexLine2;
        int i44 = Integer.MIN_VALUE;
        int i45 = 0;
        int iCombineMeasuredStates = 0;
        int i46 = 0;
        while (i38 < flexItemCount) {
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i38);
            if (reorderedFlexItemAt == null) {
                if (isLastFlexItem(i38, flexItemCount, flexLine3)) {
                    addFlexLine(arrayList, flexLine3, i38, i45);
                }
                i24 = i39;
                z14 = true;
            } else {
                z14 = true;
                i24 = i39;
                if (reorderedFlexItemAt.getVisibility() == 8) {
                    flexLine3.mGoneItemCount++;
                    flexLine3.mItemCount++;
                    if (isLastFlexItem(i38, flexItemCount, flexLine3)) {
                        addFlexLine(arrayList, flexLine3, i38, i45);
                    }
                } else {
                    if (reorderedFlexItemAt instanceof CompoundButton) {
                        evaluateMinimumSizeForCompoundButton((CompoundButton) reorderedFlexItemAt);
                    }
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    int i47 = flexItemCount;
                    if (flexItem.getAlignSelf() == 4) {
                        flexLine3.mIndicesAlignSelfStretch.add(Integer.valueOf(i38));
                    }
                    int flexItemSizeMain = getFlexItemSizeMain(flexItem, zIsMainAxisDirectionHorizontal);
                    if (flexItem.getFlexBasisPercent() != -1.0f && mode == 1073741824) {
                        flexItemSizeMain = Math.round(size * flexItem.getFlexBasisPercent());
                    }
                    FlexContainer flexContainer = this.mFlexContainer;
                    if (zIsMainAxisDirectionHorizontal) {
                        childWidthMeasureSpec = flexContainer.getChildWidthMeasureSpec(i37, i24 + getFlexItemMarginStartMain(flexItem, true) + getFlexItemMarginEndMain(flexItem, true), flexItemSizeMain);
                        i25 = i45;
                        int childHeightMeasureSpec = this.mFlexContainer.getChildHeightMeasureSpec(i15, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, true) + getFlexItemMarginEndCross(flexItem, true) + i45, getFlexItemSizeCross(flexItem, true));
                        reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                        updateMeasureCache(i38, childWidthMeasureSpec, childHeightMeasureSpec, reorderedFlexItemAt);
                        i26 = 0;
                    } else {
                        i25 = i45;
                        i26 = 0;
                        int childWidthMeasureSpec2 = flexContainer.getChildWidthMeasureSpec(i15, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, false) + getFlexItemMarginEndCross(flexItem, false) + i25, getFlexItemSizeCross(flexItem, false));
                        int childHeightMeasureSpec2 = this.mFlexContainer.getChildHeightMeasureSpec(i37, i24 + getFlexItemMarginStartMain(flexItem, false) + getFlexItemMarginEndMain(flexItem, false), flexItemSizeMain);
                        reorderedFlexItemAt.measure(childWidthMeasureSpec2, childHeightMeasureSpec2);
                        updateMeasureCache(i38, childWidthMeasureSpec2, childHeightMeasureSpec2, reorderedFlexItemAt);
                        childWidthMeasureSpec = childHeightMeasureSpec2;
                    }
                    this.mFlexContainer.updateViewCache(i38, reorderedFlexItemAt);
                    checkSizeConstraints(reorderedFlexItemAt, i38);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, reorderedFlexItemAt.getMeasuredState());
                    int i48 = i26;
                    i27 = i38;
                    int i49 = childWidthMeasureSpec;
                    FlexLine flexLine4 = flexLine3;
                    int i54 = i46;
                    i28 = i24;
                    i29 = i25;
                    boolean z18 = zIsMainAxisDirectionHorizontal;
                    size = size;
                    if (isWrapRequired(reorderedFlexItemAt, mode, size, flexLine3.mMainSize, getViewMeasuredSizeMain(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartMain(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndMain(flexItem, zIsMainAxisDirectionHorizontal), flexItem, i27, i54, arrayList.size())) {
                        if (flexLine4.getItemCountNotGone() > 0) {
                            addFlexLine(arrayList, flexLine4, i27 > 0 ? i27 - 1 : i48, i29);
                            i36 = i29 + flexLine4.mCrossSize;
                        } else {
                            i36 = i29;
                        }
                        if (z18) {
                            if (flexItem.getHeight() == -1) {
                                FlexContainer flexContainer2 = this.mFlexContainer;
                                reorderedFlexItemAt.measure(i49, flexContainer2.getChildHeightMeasureSpec(i15, flexContainer2.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i36, flexItem.getHeight()));
                                checkSizeConstraints(reorderedFlexItemAt, i27);
                            }
                        } else if (flexItem.getWidth() == -1) {
                            FlexContainer flexContainer3 = this.mFlexContainer;
                            reorderedFlexItemAt.measure(flexContainer3.getChildWidthMeasureSpec(i15, flexContainer3.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i36, flexItem.getWidth()), i49);
                            checkSizeConstraints(reorderedFlexItemAt, i27);
                        }
                        FlexLine flexLine5 = new FlexLine();
                        flexLine5.mItemCount = 1;
                        flexLine5.mMainSize = i28;
                        flexLine5.mFirstIndex = i27;
                        i29 = i36;
                        i30 = i48;
                        flexLine = flexLine5;
                        i34 = Integer.MIN_VALUE;
                    } else {
                        flexLine = flexLine4;
                        flexLine.mItemCount++;
                        i30 = i54 + 1;
                        i34 = i44;
                    }
                    flexLine.mAnyItemsHaveFlexGrow = (flexLine.mAnyItemsHaveFlexGrow ? 1 : 0) | (flexItem.getFlexGrow() != 0.0f ? 1 : i48);
                    flexLine.mAnyItemsHaveFlexShrink = (flexLine.mAnyItemsHaveFlexShrink ? 1 : 0) | (flexItem.getFlexShrink() != 0.0f ? 1 : i48);
                    int[] iArr = this.mIndexToFlexLine;
                    if (iArr != null) {
                        iArr[i27] = arrayList.size();
                    }
                    z15 = z18;
                    flexLine.mMainSize = getViewMeasuredSizeMain(reorderedFlexItemAt, z15) + getFlexItemMarginStartMain(flexItem, z15) + getFlexItemMarginEndMain(flexItem, z15) + flexLine.mMainSize;
                    flexLine.mTotalFlexGrow += flexItem.getFlexGrow();
                    flexLine.mTotalFlexShrink += flexItem.getFlexShrink();
                    this.mFlexContainer.onNewFlexItemAdded(reorderedFlexItemAt, i27, i30, flexLine);
                    int iMax = Math.max(i34, getViewMeasuredSizeCross(reorderedFlexItemAt, z15) + getFlexItemMarginStartCross(flexItem, z15) + getFlexItemMarginEndCross(flexItem, z15) + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                    if (z15) {
                        int flexWrap = this.mFlexContainer.getFlexWrap();
                        int i55 = flexLine.mMaxBaseline;
                        if (flexWrap != 2) {
                            flexLine.mMaxBaseline = Math.max(i55, reorderedFlexItemAt.getBaseline() + flexItem.getMarginTop());
                        } else {
                            flexLine.mMaxBaseline = Math.max(i55, (reorderedFlexItemAt.getMeasuredHeight() - reorderedFlexItemAt.getBaseline()) + flexItem.getMarginBottom());
                        }
                    }
                    i35 = i47;
                    if (isLastFlexItem(i27, i35, flexLine)) {
                        addFlexLine(arrayList, flexLine, i27, i29);
                        i29 += flexLine.mCrossSize;
                    }
                    if (i18 != -1 && arrayList.size() > 0) {
                        if (((FlexLine) a.c(1, arrayList)).mLastIndex >= i18 && i27 >= i18 && !z17) {
                            i29 = -flexLine.getCrossSize();
                            z17 = true;
                        }
                    }
                    if (i29 > i16 && z17) {
                        i19 = iCombineMeasuredStates;
                        flexLinesResult.mChildState = i19;
                    } else {
                        i44 = iMax;
                        i46 = i30;
                    }
                }
                int i56 = i27 + 1;
                zIsMainAxisDirectionHorizontal = z15;
                flexLine3 = flexLine;
                i39 = i28;
                i45 = i29;
                i37 = i14;
                flexItemCount = i35;
                i38 = i56;
                mode = mode;
            }
            i27 = i38;
            mode = mode;
            i35 = flexItemCount;
            i29 = i45;
            z15 = zIsMainAxisDirectionHorizontal;
            i28 = i24;
            flexLine = flexLine3;
            int i57 = i27 + 1;
            zIsMainAxisDirectionHorizontal = z15;
            flexLine3 = flexLine;
            i39 = i28;
            i45 = i29;
            i37 = i14;
            flexItemCount = i35;
            i38 = i57;
            mode = mode;
        }
        i19 = iCombineMeasuredStates;
        flexLinesResult.mChildState = i19;
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i14, int i15) {
        calculateFlexLines(flexLinesResult, i14, i15, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateHorizontalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i14, int i15, int i16, int i17, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i14, i15, i16, 0, i17, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i14, int i15) {
        calculateFlexLines(flexLinesResult, i15, i14, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateVerticalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i14, int i15, int i16, int i17, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i15, i14, i16, 0, i17, list);
    }

    public void clearFlexLines(List<FlexLine> list, int i14) {
        int i15 = this.mIndexToFlexLine[i14];
        if (i15 == -1) {
            i15 = 0;
        }
        if (list.size() > i15) {
            list.subList(i15, list.size()).clear();
        }
        int[] iArr = this.mIndexToFlexLine;
        int length = iArr.length - 1;
        if (i14 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i14, length, -1);
        }
        long[] jArr = this.mMeasureSpecCache;
        int length2 = jArr.length - 1;
        if (i14 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i14, length2, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] createReorderedIndices(View view2, int i14, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        List<Order> listCreateOrders = createOrders(flexItemCount);
        Order order = new Order();
        if (view2 == null || !(layoutParams instanceof FlexItem)) {
            order.order = 1;
        } else {
            order.order = ((FlexItem) layoutParams).getOrder();
        }
        if (i14 == -1 || i14 == flexItemCount || i14 >= this.mFlexContainer.getFlexItemCount()) {
            order.index = flexItemCount;
        } else {
            order.index = i14;
            while (i14 < flexItemCount) {
                listCreateOrders.get(i14).index++;
                i14++;
            }
        }
        listCreateOrders.add(order);
        return sortOrdersIntoReorderedIndices(flexItemCount + 1, listCreateOrders, sparseIntArray);
    }

    public void determineCrossSize(int i14, int i15, int i16) {
        int mode;
        int size;
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i15);
            int size2 = View.MeasureSpec.getSize(i15);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            h.s(j.h(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i14);
            size = View.MeasureSpec.getSize(i14);
        }
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.mFlexContainer.getSumOfCrossSize() + i16;
            int i17 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).mCrossSize = size - i16;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.mFlexContainer.getAlignContent();
                if (alignContent == 1) {
                    int i18 = size - sumOfCrossSize;
                    FlexLine flexLine = new FlexLine();
                    flexLine.mCrossSize = i18;
                    flexLinesInternal.add(0, flexLine);
                    return;
                }
                if (alignContent == 2) {
                    this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f14 = 0.0f;
                    while (i17 < size4) {
                        arrayList.add(flexLinesInternal.get(i17));
                        if (i17 != flexLinesInternal.size() - 1) {
                            FlexLine flexLine2 = new FlexLine();
                            if (i17 == flexLinesInternal.size() - 2) {
                                flexLine2.mCrossSize = Math.round(f14 + size3);
                                f14 = 0.0f;
                            } else {
                                flexLine2.mCrossSize = Math.round(size3);
                            }
                            int i19 = flexLine2.mCrossSize;
                            float f15 = (size3 - i19) + f14;
                            if (f15 > 1.0f) {
                                flexLine2.mCrossSize = i19 + 1;
                                f15 -= 1.0f;
                            } else if (f15 < -1.0f) {
                                flexLine2.mCrossSize = i19 - 1;
                                f15 += 1.0f;
                            }
                            f14 = f15;
                            arrayList.add(flexLine2);
                        }
                        i17++;
                    }
                    this.mFlexContainer.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    FlexLine flexLine3 = new FlexLine();
                    flexLine3.mCrossSize = size5;
                    for (FlexLine flexLine4 : flexLinesInternal) {
                        arrayList2.add(flexLine3);
                        arrayList2.add(flexLine4);
                        arrayList2.add(flexLine3);
                    }
                    this.mFlexContainer.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f16 = 0.0f;
                    while (i17 < size7) {
                        FlexLine flexLine5 = flexLinesInternal.get(i17);
                        float f17 = flexLine5.mCrossSize + size6;
                        if (i17 == flexLinesInternal.size() - 1) {
                            f17 += f16;
                            f16 = 0.0f;
                        }
                        int iRound = Math.round(f17);
                        float f18 = (f17 - iRound) + f16;
                        if (f18 > 1.0f) {
                            iRound++;
                            f18 -= 1.0f;
                        } else if (f18 < -1.0f) {
                            iRound--;
                            f18 += 1.0f;
                        }
                        f16 = f18;
                        flexLine5.mCrossSize = iRound;
                        i17++;
                    }
                }
            }
        }
    }

    public void determineMainSize(int i14, int i15, int i16) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i17;
        int i18;
        ensureChildrenFrozen(this.mFlexContainer.getFlexItemCount());
        if (i16 >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        int flexDirection2 = this.mFlexContainer.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i14);
            size = View.MeasureSpec.getSize(i14);
            int largestMainSize = this.mFlexContainer.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.mFlexContainer.getPaddingLeft();
            paddingRight = this.mFlexContainer.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                h.s(j.h(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i15);
            size = View.MeasureSpec.getSize(i15);
            if (mode2 != 1073741824) {
                size = this.mFlexContainer.getLargestMainSize();
            }
            paddingLeft = this.mFlexContainer.getPaddingTop();
            paddingRight = this.mFlexContainer.getPaddingBottom();
        }
        int i19 = paddingLeft + paddingRight;
        int i24 = size;
        int[] iArr = this.mIndexToFlexLine;
        int i25 = iArr != null ? iArr[i16] : 0;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i25 < size2) {
            FlexLine flexLine = flexLinesInternal.get(i25);
            int i26 = flexLine.mMainSize;
            if (i26 >= i24 || !flexLine.mAnyItemsHaveFlexGrow) {
                i17 = i14;
                i18 = i15;
                if (i26 > i24 && flexLine.mAnyItemsHaveFlexShrink) {
                    shrinkFlexItems(i17, i18, flexLine, i24, i19, false);
                }
            } else {
                i17 = i14;
                i18 = i15;
                expandFlexItems(i17, i18, flexLine, i24, i19, false);
            }
            i25++;
            i14 = i17;
            i15 = i18;
        }
    }

    public void ensureIndexToFlexLine(int i14) {
        int[] iArr = this.mIndexToFlexLine;
        if (iArr == null) {
            this.mIndexToFlexLine = new int[Math.max(i14, 10)];
        } else if (iArr.length < i14) {
            this.mIndexToFlexLine = Arrays.copyOf(this.mIndexToFlexLine, Math.max(iArr.length * 2, i14));
        }
    }

    public void ensureMeasureSpecCache(int i14) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr == null) {
            this.mMeasureSpecCache = new long[Math.max(i14, 10)];
        } else if (jArr.length < i14) {
            this.mMeasureSpecCache = Arrays.copyOf(this.mMeasureSpecCache, Math.max(jArr.length * 2, i14));
        }
    }

    public void ensureMeasuredSizeCache(int i14) {
        long[] jArr = this.mMeasuredSizeCache;
        if (jArr == null) {
            this.mMeasuredSizeCache = new long[Math.max(i14, 10)];
        } else if (jArr.length < i14) {
            this.mMeasuredSizeCache = Arrays.copyOf(this.mMeasuredSizeCache, Math.max(jArr.length * 2, i14));
        }
    }

    public int extractHigherInt(long j8) {
        return (int) (j8 >> 32);
    }

    public int extractLowerInt(long j8) {
        return (int) j8;
    }

    public boolean isOrderChangedFromLastMeasurement(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i14 = 0; i14 < flexItemCount; i14++) {
            View flexItemAt = this.mFlexContainer.getFlexItemAt(i14);
            if (flexItemAt != null && ((FlexItem) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i14)) {
                return true;
            }
        }
        return false;
    }

    public void layoutSingleChildHorizontal(View view2, FlexLine flexLine, int i14, int i15, int i16, int i17) {
        FlexItem flexItem = (FlexItem) view2.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i18 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int i19 = i15 + i18;
                    view2.layout(i14, (i19 - view2.getMeasuredHeight()) - flexItem.getMarginBottom(), i16, i19 - flexItem.getMarginBottom());
                    return;
                } else {
                    view2.layout(i14, view2.getMeasuredHeight() + (i15 - i18) + flexItem.getMarginTop(), i16, view2.getMeasuredHeight() + (i17 - i18) + flexItem.getMarginTop());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i18 - view2.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int i24 = i15 + measuredHeight;
                    view2.layout(i14, i24, i16, view2.getMeasuredHeight() + i24);
                    return;
                } else {
                    int i25 = i15 - measuredHeight;
                    view2.layout(i14, i25, i16, view2.getMeasuredHeight() + i25);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = this.mFlexContainer.getFlexWrap();
                int i26 = flexLine.mMaxBaseline;
                if (flexWrap != 2) {
                    int iMax = Math.max(i26 - view2.getBaseline(), flexItem.getMarginTop());
                    view2.layout(i14, i15 + iMax, i16, i17 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view2.getBaseline() + (i26 - view2.getMeasuredHeight()), flexItem.getMarginBottom());
                    view2.layout(i14, i15 - iMax2, i16, i17 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.mFlexContainer.getFlexWrap() != 2) {
            view2.layout(i14, i15 + flexItem.getMarginTop(), i16, i17 + flexItem.getMarginTop());
        } else {
            view2.layout(i14, i15 - flexItem.getMarginBottom(), i16, i17 - flexItem.getMarginBottom());
        }
    }

    public void layoutSingleChildVertical(View view2, FlexLine flexLine, boolean z14, int i14, int i15, int i16, int i17) {
        FlexItem flexItem = (FlexItem) view2.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i18 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z14) {
                    view2.layout(((i14 + i18) - view2.getMeasuredWidth()) - flexItem.getMarginRight(), i15, ((i16 + i18) - view2.getMeasuredWidth()) - flexItem.getMarginRight(), i17);
                    return;
                }
                view2.layout(view2.getMeasuredWidth() + (i14 - i18) + flexItem.getMarginLeft(), i15, view2.getMeasuredWidth() + (i16 - i18) + flexItem.getMarginLeft(), i17);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i18 - view2.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z14) {
                    view2.layout(i14 - marginStart, i15, i16 - marginStart, i17);
                    return;
                } else {
                    view2.layout(i14 + marginStart, i15, i16 + marginStart, i17);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z14) {
            view2.layout(i14 - flexItem.getMarginRight(), i15, i16 - flexItem.getMarginRight(), i17);
        } else {
            view2.layout(i14 + flexItem.getMarginLeft(), i15, i16 + flexItem.getMarginLeft(), i17);
        }
    }

    public long makeCombinedLong(int i14, int i15) {
        return (((long) i14) & MEASURE_SPEC_WIDTH_MASK) | (((long) i15) << 32);
    }

    public void stretchViews(int i14) {
        View reorderedFlexItemAt;
        if (i14 >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (this.mFlexContainer.getAlignItems() != 4) {
            for (FlexLine flexLine : this.mFlexContainer.getFlexLinesInternal()) {
                for (Integer num : flexLine.mIndicesAlignSelfStretch) {
                    View reorderedFlexItemAt2 = this.mFlexContainer.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        stretchViewVertically(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            h.s(j.h(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        stretchViewHorizontally(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.mIndexToFlexLine;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i15 = iArr != null ? iArr[i14] : 0; i15 < size; i15++) {
            FlexLine flexLine2 = flexLinesInternal.get(i15);
            int i16 = flexLine2.mItemCount;
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = flexLine2.mFirstIndex + i17;
                if (i17 < this.mFlexContainer.getFlexItemCount() && (reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i18)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            stretchViewVertically(reorderedFlexItemAt, flexLine2.mCrossSize, i18);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                h.s(j.h(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            stretchViewHorizontally(reorderedFlexItemAt, flexLine2.mCrossSize, i18);
                        }
                    }
                }
            }
        }
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i14, int i15, int i16, int i17, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i14, i15, i16, i17, -1, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i14, int i15, int i16, int i17, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i15, i14, i16, i17, -1, list);
    }

    public int[] createReorderedIndices(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        return sortOrdersIntoReorderedIndices(flexItemCount, createOrders(flexItemCount), sparseIntArray);
    }

    public void determineMainSize(int i14, int i15) {
        determineMainSize(i14, i15, 0);
    }

    public void stretchViews() {
        stretchViews(0);
    }
}
