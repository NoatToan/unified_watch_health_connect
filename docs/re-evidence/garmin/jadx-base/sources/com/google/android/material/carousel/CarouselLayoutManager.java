package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import c7.d;
import cd0.h0;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import i3.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k7.h;

/* JADX INFO: loaded from: classes14.dex */
public class CarouselLayoutManager extends RecyclerView.p implements Carousel, RecyclerView.a0.b {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;
    private CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;
    private KeylineState currentKeylineState;
    private final DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;
    private KeylineStateList keylineStateList;
    private Map<Integer, KeylineState> keylineStatePositionMap;
    private int lastItemCount;
    int maxScroll;
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    private final View.OnLayoutChangeListener recyclerViewSizeChangeListener;
    int scrollOffset;

    public static final class ChildCalculations {
        final float center;
        final View child;
        final float offsetCenter;
        final KeylineRange range;

        public ChildCalculations(View view2, float f14, float f15, KeylineRange keylineRange) {
            this.child = view2;
            this.center = f14;
            this.offsetCenter = f15;
            this.range = keylineRange;
        }
    }

    public static class DebugItemDecoration extends RecyclerView.o {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            super.onDrawOver(canvas, recyclerView, b0Var);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(d.b(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }

        public void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = Collections.unmodifiableList(list);
        }
    }

    public static class KeylineRange {
        final KeylineState.Keyline leftOrTop;
        final KeylineState.Keyline rightOrBottom;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            h.a(keyline.loc <= keyline2.loc);
            this.leftOrTop = keyline;
            this.rightOrBottom = keyline2;
        }
    }

    public static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
        }
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i14, int i15) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new a(this, 0);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attributeSet);
    }

    private void addAndLayoutView(View view2, int i14, ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view2, i14);
        float f14 = childCalculations.offsetCenter;
        this.orientationHelper.layoutDecoratedWithMargins(view2, (int) (f14 - itemSize), (int) (f14 + itemSize));
        updateChildMaskForLocation(view2, childCalculations.center, childCalculations.range);
    }

    private float addEnd(float f14, float f15) {
        return isLayoutRtl() ? f14 - f15 : f14 + f15;
    }

    private float addStart(float f14, float f15) {
        return isLayoutRtl() ? f14 + f15 : f14 - f15;
    }

    private void addViewAtPosition(RecyclerView.w wVar, int i14, int i15) {
        if (i14 < 0 || i14 >= getItemCount()) {
            return;
        }
        ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(wVar, calculateChildStartForFill(i14), i14);
        addAndLayoutView(childCalculationsMakeChildCalculations.child, i15, childCalculationsMakeChildCalculations);
    }

    private void addViewsEnd(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i14) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i14);
        while (i14 < b0Var.b()) {
            ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(wVar, fCalculateChildStartForFill, i14);
            if (isLocOffsetOutOfFillBoundsEnd(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                return;
            }
            fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsStart(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                addAndLayoutView(childCalculationsMakeChildCalculations.child, -1, childCalculationsMakeChildCalculations);
            }
            i14++;
        }
    }

    private void addViewsStart(RecyclerView.w wVar, int i14) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i14);
        while (i14 >= 0) {
            ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(wVar, fCalculateChildStartForFill, i14);
            if (isLocOffsetOutOfFillBoundsStart(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                return;
            }
            fCalculateChildStartForFill = addStart(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsEnd(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                addAndLayoutView(childCalculationsMakeChildCalculations.child, 0, childCalculationsMakeChildCalculations);
            }
            i14--;
        }
    }

    private float calculateChildOffsetCenterForLocation(View view2, float f14, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f15 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float fLerp = AnimationUtils.lerp(f15, keyline2.locOffset, keyline.loc, keyline2.loc, f14);
        if (keylineRange.rightOrBottom != this.currentKeylineState.getFirstKeyline() && keylineRange.leftOrTop != this.currentKeylineState.getLastKeyline()) {
            return fLerp;
        }
        float maskMargins = this.orientationHelper.getMaskMargins((RecyclerView.q) view2.getLayoutParams()) / this.currentKeylineState.getItemSize();
        KeylineState.Keyline keyline3 = keylineRange.rightOrBottom;
        return (((1.0f - keyline3.mask) + maskMargins) * (f14 - keyline3.loc)) + fLerp;
    }

    private float calculateChildStartForFill(int i14) {
        return addEnd(getParentStart() - this.scrollOffset, this.currentKeylineState.getItemSize() * i14);
    }

    private int calculateEndScroll(RecyclerView.b0 b0Var, KeylineStateList keylineStateList) {
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineState startState = zIsLayoutRtl ? keylineStateList.getStartState() : keylineStateList.getEndState();
        KeylineState.Keyline firstFocalKeyline = zIsLayoutRtl ? startState.getFirstFocalKeyline() : startState.getLastFocalKeyline();
        int iB = (int) (((((b0Var.b() - 1) * startState.getItemSize()) * (zIsLayoutRtl ? -1.0f : 1.0f)) - (firstFocalKeyline.loc - getParentStart())) + (getParentEnd() - firstFocalKeyline.loc) + (zIsLayoutRtl ? -firstFocalKeyline.leftOrTopPaddingShift : firstFocalKeyline.rightOrBottomPaddingShift));
        return zIsLayoutRtl ? Math.min(0, iB) : Math.max(0, iB);
    }

    private static int calculateShouldScrollBy(int i14, int i15, int i16, int i17) {
        int i18 = i15 + i14;
        if (i18 < i16) {
            return i16 - i15;
        }
        return i18 > i17 ? i17 - i15 : i14;
    }

    private int calculateStartScroll(KeylineStateList keylineStateList) {
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineState endState = zIsLayoutRtl ? keylineStateList.getEndState() : keylineStateList.getStartState();
        return (int) (getParentStart() - addStart((zIsLayoutRtl ? endState.getLastFocalKeyline() : endState.getFirstFocalKeyline()).loc, endState.getItemSize() / 2.0f));
    }

    private int convertFocusDirectionToLayoutDirection(int i14) {
        int orientation = getOrientation();
        if (i14 == 1) {
            return -1;
        }
        if (i14 == 2) {
            return 1;
        }
        if (i14 == 17) {
            if (orientation == 0) {
                return isLayoutRtl() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i14 == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i14 != 66) {
            return (i14 == 130 && orientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        if (orientation == 0) {
            return isLayoutRtl() ? -1 : 1;
        }
        return Integer.MIN_VALUE;
    }

    private void fill(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        removeAndRecycleOutOfBoundsViews(wVar);
        if (getChildCount() == 0) {
            addViewsStart(wVar, this.currentFillStartPosition - 1);
            addViewsEnd(wVar, b0Var, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(wVar, position - 1);
            addViewsEnd(wVar, b0Var, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private View getChildClosestToEnd() {
        return getChildAt(isLayoutRtl() ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(isLayoutRtl() ? getChildCount() - 1 : 0);
    }

    private int getContainerSize() {
        return isHorizontal() ? getContainerWidth() : getContainerHeight();
    }

    private float getDecoratedCenterWithMargins(View view2) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view2, rect);
        return isHorizontal() ? rect.centerX() : rect.centerY();
    }

    private int getItemMargins() {
        int i14;
        int i15;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            i14 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i15 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i14 = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i15 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i14 + i15;
    }

    private KeylineState getKeylineStateForPosition(int i14) {
        KeylineState keylineState;
        Map<Integer, KeylineState> map = this.keylineStatePositionMap;
        return (map == null || (keylineState = map.get(Integer.valueOf(g7.a.b(i14, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.keylineStateList.getDefaultState() : keylineState;
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    private float getMaskedItemSizeForLocOffset(float f14, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f15 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        return AnimationUtils.lerp(f15, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    private int getParentEnd() {
        return this.orientationHelper.getParentEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    private int getScrollOffsetForPosition(int i14, KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (i14 * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) ((keylineState.getItemSize() / 2.0f) + ((i14 * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int i14, KeylineState keylineState) {
        int i15 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float itemSize = (keylineState.getItemSize() / 2.0f) + (i14 * keylineState.getItemSize());
            int containerSize = (isLayoutRtl() ? (int) ((getContainerSize() - keyline.loc) - itemSize) : (int) (itemSize - keyline.loc)) - this.scrollOffset;
            if (Math.abs(i15) > Math.abs(containerSize)) {
                i15 = containerSize;
            }
        }
        return i15;
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f14, boolean z14) {
        float f15 = Float.MAX_VALUE;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        float f16 = -3.4028235E38f;
        float f17 = Float.MAX_VALUE;
        float f18 = Float.MAX_VALUE;
        for (int i18 = 0; i18 < list.size(); i18++) {
            KeylineState.Keyline keyline = list.get(i18);
            float f19 = z14 ? keyline.locOffset : keyline.loc;
            float fAbs = Math.abs(f19 - f14);
            if (f19 <= f14 && fAbs <= f15) {
                i14 = i18;
                f15 = fAbs;
            }
            if (f19 > f14 && fAbs <= f17) {
                i16 = i18;
                f17 = fAbs;
            }
            if (f19 <= f18) {
                i15 = i18;
                f18 = f19;
            }
            if (f19 > f16) {
                i17 = i18;
                f16 = f19;
            }
        }
        if (i14 == -1) {
            i14 = i15;
        }
        if (i16 == -1) {
            i16 = i17;
        }
        return new KeylineRange(list.get(i14), list.get(i16));
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f14, KeylineRange keylineRange) {
        float fAddStart = addStart(f14, getMaskedItemSizeForLocOffset(f14, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            return fAddStart < 0.0f;
        }
        return fAddStart > ((float) getContainerSize());
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f14, KeylineRange keylineRange) {
        float fAddEnd = addEnd(f14, getMaskedItemSizeForLocOffset(f14, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            return fAddEnd > ((float) getContainerSize());
        }
        return fAddEnd < 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        if (i14 == i18 && i15 == i19 && i16 == i24 && i17 == i25) {
            return;
        }
        view2.post(new h0(this, 15));
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                getDecoratedCenterWithMargins(childAt);
                getPosition(childAt);
            }
        }
    }

    private ChildCalculations makeChildCalculations(RecyclerView.w wVar, float f14, int i14) {
        View viewE = wVar.e(i14);
        measureChildWithMargins(viewE, 0, 0);
        float fAddEnd = addEnd(f14, this.currentKeylineState.getItemSize() / 2.0f);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        return new ChildCalculations(viewE, fAddEnd, calculateChildOffsetCenterForLocation(viewE, fAddEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private float offsetChild(View view2, float f14, float f15, Rect rect) {
        float fAddEnd = addEnd(f14, f15);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view2, fAddEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view2, rect);
        updateChildMaskForLocation(view2, fAddEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view2, rect, f15, fCalculateChildOffsetCenterForLocation);
        return fCalculateChildOffsetCenterForLocation;
    }

    private void recalculateKeylineStateList(RecyclerView.w wVar) {
        View viewE = wVar.e(0);
        measureChildWithMargins(viewE, 0, 0);
        KeylineState keylineStateOnFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, viewE);
        if (isLayoutRtl()) {
            keylineStateOnFirstChildMeasuredWithMargins = KeylineState.reverse(keylineStateOnFirstChildMeasuredWithMargins, getContainerSize());
        }
        this.keylineStateList = KeylineStateList.from(this, keylineStateOnFirstChildMeasuredWithMargins, getItemMargins(), getLeftOrTopPaddingForKeylineShift(), getRightOrBottomPaddingForKeylineShift());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.w wVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterWithMargins = getDecoratedCenterWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, wVar);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterWithMargins2 = getDecoratedCenterWithMargins(childAt2);
            if (!isLocOffsetOutOfFillBoundsEnd(decoratedCenterWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, wVar);
            }
        }
    }

    private int scrollBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i14 == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(wVar);
        }
        int iCalculateShouldScrollBy = calculateShouldScrollBy(i14, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += iCalculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float fCalculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineState keylineState = this.currentKeylineState;
        float f14 = zIsLayoutRtl ? keylineState.getLastFocalKeyline().locOffset : keylineState.getFirstFocalKeyline().locOffset;
        float f15 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            float fAbs = Math.abs(f14 - offsetChild(childAt, fCalculateChildStartForFill, itemSize, rect));
            if (childAt != null && fAbs < f15) {
                this.currentEstimatedPosition = getPosition(childAt);
                f15 = fAbs;
            }
            fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
        }
        fill(wVar, b0Var);
        return iCalculateShouldScrollBy;
    }

    private void setCarouselAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            setCarouselAlignment(typedArrayObtainStyledAttributes.getInt(R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(View view2, float f14, KeylineRange keylineRange) {
        if (view2 instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.leftOrTop;
            float f15 = keyline.mask;
            KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
            float fLerp = AnimationUtils.lerp(f15, keyline2.mask, keyline.loc, keyline2.loc, f14);
            float height = view2.getHeight();
            float width = view2.getWidth();
            RectF maskRect = this.orientationHelper.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, fLerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, fLerp));
            float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view2, f14, keylineRange);
            RectF rectF = new RectF(fCalculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), fCalculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), (maskRect.width() / 2.0f) + fCalculateChildOffsetCenterForLocation, (maskRect.height() / 2.0f) + fCalculateChildOffsetCenterForLocation);
            RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
            if (this.carouselStrategy.isContained()) {
                this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
            }
            this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
            ((Maskable) view2).setMaskRectF(maskRect);
        }
    }

    private void updateCurrentKeylineStateForScrollOffset(KeylineStateList keylineStateList) {
        int i14 = this.maxScroll;
        int i15 = this.minScroll;
        if (i14 <= i15) {
            this.currentKeylineState = isLayoutRtl() ? keylineStateList.getEndState() : keylineStateList.getStartState();
        } else {
            this.currentKeylineState = keylineStateList.getShiftedState(this.scrollOffset, i15, i14);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private void updateItemCount() {
        int itemCount = getItemCount();
        int i14 = this.lastItemCount;
        if (itemCount == i14 || this.keylineStateList == null) {
            return;
        }
        if (this.carouselStrategy.shouldRefreshKeylineState(this, i14)) {
            refreshKeylineState();
        }
        this.lastItemCount = itemCount;
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() < 1) {
            return;
        }
        int i14 = 0;
        while (i14 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i14));
            int i15 = i14 + 1;
            int position2 = getPosition(getChildAt(i15));
            if (position > position2) {
                logChildrenIfDebugging();
                vb.h.z(j.e(i15, position2, "] had adapter position [", "].", e5.j(i14, position, "Detected invalid child order. Child at index [", "] had adapter position [", "] and child at index [")));
                return;
            }
            i14 = i15;
        }
    }

    public int calculateScrollDeltaToMakePositionVisible(int i14) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i14, getKeylineStateForPosition(i14)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.keylineStateList.getDefaultState().getItemSize() / computeHorizontalScrollRange(b0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF computeScrollVectorForPosition(int i14) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i14, getKeylineStateForPosition(i14));
        return isHorizontal() ? new PointF(offsetToScrollToPosition, 0.0f) : new PointF(0.0f, offsetToScrollToPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.keylineStateList.getDefaultState().getItemSize() / computeVerticalScrollRange(b0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void getDecoratedBoundsWithMargins(View view2, Rect rect) {
        super.getDecoratedBoundsWithMargins(view2, rect);
        float fCenterY = rect.centerY();
        if (isHorizontal()) {
            fCenterY = rect.centerX();
        }
        float maskedItemSizeForLocOffset = getMaskedItemSizeForLocOffset(fCenterY, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fCenterY, true));
        float fWidth = isHorizontal() ? (rect.width() - maskedItemSizeForLocOffset) / 2.0f : 0.0f;
        float fHeight = isHorizontal() ? 0.0f : (rect.height() - maskedItemSizeForLocOffset) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOffsetToScrollToPosition(int i14, KeylineState keylineState) {
        return getScrollOffsetForPosition(i14, keylineState) - this.scrollOffset;
    }

    public int getOffsetToScrollToPositionForSnap(int i14, boolean z14) {
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i14, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        int offsetToScrollToPosition2 = this.keylineStatePositionMap != null ? getOffsetToScrollToPosition(i14, getKeylineStateForPosition(i14)) : offsetToScrollToPosition;
        return (!z14 || Math.abs(offsetToScrollToPosition2) >= Math.abs(offsetToScrollToPosition)) ? offsetToScrollToPosition : offsetToScrollToPosition2;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    public boolean isLayoutRtl() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void measureChildWithMargins(View view2, int i14, int i15) {
        if (!(view2 instanceof Maskable)) {
            vb.h.z("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view2, rect);
        int i16 = rect.left + rect.right + i14;
        int i17 = rect.top + rect.bottom + i15;
        KeylineStateList keylineStateList = this.keylineStateList;
        float itemSize = (keylineStateList == null || this.orientationHelper.orientation != 0) ? ((ViewGroup.MarginLayoutParams) qVar).width : keylineStateList.getDefaultState().getItemSize();
        KeylineStateList keylineStateList2 = this.keylineStateList;
        view2.measure(RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i16, (int) itemSize, canScrollHorizontally()), RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i17, (int) ((keylineStateList2 == null || this.orientationHelper.orientation != 1) ? ((ViewGroup.MarginLayoutParams) qVar).height : keylineStateList2.getDefaultState().getItemSize()), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.carouselStrategy.initialize(recyclerView.getContext());
        refreshKeylineState();
        recyclerView.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        recyclerView.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view2, int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i14)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view2) == 0) {
                return null;
            }
            addViewAtPosition(wVar, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view2) == getItemCount() - 1) {
            return null;
        }
        addViewAtPosition(wVar, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i14, int i15) {
        super.onItemsAdded(recyclerView, i14, i15);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i14, int i15) {
        super.onItemsRemoved(recyclerView, i14, i15);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.b() <= 0 || getContainerSize() <= 0.0f) {
            removeAndRecycleAllViews(wVar);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean zIsLayoutRtl = isLayoutRtl();
        boolean z14 = this.keylineStateList == null;
        if (z14) {
            recalculateKeylineStateList(wVar);
        }
        int iCalculateStartScroll = calculateStartScroll(this.keylineStateList);
        int iCalculateEndScroll = calculateEndScroll(b0Var, this.keylineStateList);
        this.minScroll = zIsLayoutRtl ? iCalculateEndScroll : iCalculateStartScroll;
        if (zIsLayoutRtl) {
            iCalculateEndScroll = iCalculateStartScroll;
        }
        this.maxScroll = iCalculateEndScroll;
        if (z14) {
            this.scrollOffset = iCalculateStartScroll;
            this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
            int i14 = this.currentEstimatedPosition;
            if (i14 != -1) {
                this.scrollOffset = getScrollOffsetForPosition(i14, getKeylineStateForPosition(i14));
            }
        }
        int i15 = this.scrollOffset;
        this.scrollOffset = i15 + calculateShouldScrollBy(0, i15, this.minScroll, this.maxScroll);
        this.currentFillStartPosition = g7.a.b(this.currentFillStartPosition, 0, b0Var.b());
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        detachAndScrapAttachedViews(wVar);
        fill(wVar, b0Var);
        this.lastItemCount = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view2, Rect rect, boolean z14, boolean z15) {
        int smallestScrollOffsetToFocalKeyline;
        if (this.keylineStateList == null || (smallestScrollOffsetToFocalKeyline = getSmallestScrollOffsetToFocalKeyline(getPosition(view2), getKeylineStateForPosition(getPosition(view2)))) == 0) {
            return false;
        }
        scrollBy(recyclerView, getSmallestScrollOffsetToFocalKeyline(getPosition(view2), this.keylineStateList.getShiftedState(this.scrollOffset + calculateShouldScrollBy(smallestScrollOffsetToFocalKeyline, this.scrollOffset, this.minScroll, this.maxScroll), this.minScroll, this.maxScroll)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (canScrollHorizontally()) {
            return scrollBy(i14, wVar, b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i14) {
        this.currentEstimatedPosition = i14;
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i14, getKeylineStateForPosition(i14));
        this.currentFillStartPosition = g7.a.b(i14, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i14, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (canScrollVertically()) {
            return scrollBy(i14, wVar, b0Var);
        }
        return 0;
    }

    public void setCarouselAlignment(int i14) {
        this.carouselAlignment = i14;
        refreshKeylineState();
    }

    public void setCarouselStrategy(CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    public void setDebuggingEnabled(RecyclerView recyclerView, boolean z14) {
        this.isDebuggingEnabled = z14;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z14) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i14) {
        if (i14 != 0 && i14 != 1) {
            vb.h.s(am.j.h(i14, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i14 != carouselOrientationHelper.orientation) {
            this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, i14);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i14) {
        w wVar = new w(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.w
            public int calculateDxToMakeVisible(View view2, int i15) {
                if (CarouselLayoutManager.this.keylineStateList == null || !CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view2));
            }

            @Override // androidx.recyclerview.widget.w
            public int calculateDyToMakeVisible(View view2, int i15) {
                if (CarouselLayoutManager.this.keylineStateList == null || CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view2));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.a0
            public PointF computeScrollVectorForPosition(int i15) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i15);
            }
        };
        wVar.setTargetPosition(i14);
        startSmoothScroll(wVar);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy, int i14) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new a(this, 0);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i14);
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private void scrollBy(RecyclerView recyclerView, int i14) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i14, 0);
        } else {
            recyclerView.scrollBy(0, i14);
        }
    }
}
