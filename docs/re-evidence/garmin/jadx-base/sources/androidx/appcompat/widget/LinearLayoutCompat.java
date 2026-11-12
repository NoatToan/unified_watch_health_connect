package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = h.a.f80435o;
        w0 w0VarG = w0.g(context, attributeSet, iArr, i14, 0);
        androidx.core.view.s0.q(this, context, iArr, attributeSet, w0VarG.f5271b, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        int i15 = typedArray.getInt(1, -1);
        if (i15 >= 0) {
            setOrientation(i15);
        }
        int i16 = typedArray.getInt(0, -1);
        if (i16 >= 0) {
            setGravity(i16);
        }
        boolean z14 = typedArray.getBoolean(2, true);
        if (!z14) {
            setBaselineAligned(z14);
        }
        this.mWeightSum = typedArray.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(3, -1);
        this.mUseLargestChild = typedArray.getBoolean(7, false);
        setDividerDrawable(w0VarG.b(5));
        this.mShowDividers = typedArray.getInt(8, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(6, 0);
        w0VarG.h();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformHeight(int i14, int i15) {
        int i16;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i17 = 0;
        while (i17 < i14) {
            View virtualChildAt = getVirtualChildAt(i17);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i18 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = virtualChildAt.getMeasuredWidth();
                    i16 = i15;
                    measureChildWithMargins(virtualChildAt, i16, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i18;
                } else {
                    i16 = i15;
                }
            } else {
                i16 = i15;
            }
            i17++;
            i15 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformWidth(int i14, int i15) {
        int i16;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i17 = 0;
        while (i17 < i14) {
            View virtualChildAt = getVirtualChildAt(i17);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i18 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = virtualChildAt.getMeasuredHeight();
                    i16 = i15;
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i16, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i18;
                } else {
                    i16 = i15;
                }
            } else {
                i16 = i15;
            }
            i17++;
            i15 = i16;
        }
    }

    private void setChildFrame(View view2, int i14, int i15, int i16, int i17) {
        view2.layout(i14, i15, i16 + i14, i17 + i15);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i14;
        int virtualChildCount = getVirtualChildCount();
        boolean z14 = getLayoutDirection() == 1;
        for (int i15 = 0; i15 < virtualChildCount; i15++) {
            View virtualChildAt = getVirtualChildAt(i15);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i15)) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, z14 ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                a aVar2 = (a) virtualChildAt2.getLayoutParams();
                if (z14) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i14 = this.mDividerWidth;
                    right = left - i14;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (z14) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i14 = this.mDividerWidth;
                right = left - i14;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i14 = 0; i14 < virtualChildCount; i14++) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i14)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((a) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i14) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i14, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i14);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i14) {
        this.mDivider.setBounds(i14, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i14, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i14 = this.mOrientation;
        if (i14 == 0) {
            return new a(-2, -2);
        }
        if (i14 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i14;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i15 = this.mBaselineAlignedChildIndex;
        if (childCount <= i15) {
            kg.f.n("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i15);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            kg.f.n("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int iA = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i14 = this.mGravity & 112) != 48) {
            if (i14 == 16) {
                iA = am.j.a(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.mTotalLength, 2, iA);
            } else if (i14 == 80) {
                iA = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return iA + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view2, int i14) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view2) {
        return 0;
    }

    public int getNextLocationOffset(View view2) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i14) {
        return getChildAt(i14);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int i14) {
        if (i14 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        int childCount = getChildCount();
        int i15 = this.mShowDividers;
        if (i14 == childCount) {
            return (i15 & 4) != 0;
        }
        if ((i15 & 2) != 0) {
            for (int i16 = i14 - 1; i16 >= 0; i16--) {
                if (getChildAt(i16).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    public void layoutHorizontal(int i14, int i15, int i16, int i17) {
        int iA;
        int i18;
        int i19;
        char c14;
        int i24;
        int childrenSkipCount;
        int i25;
        int baseline;
        int i26;
        int i27;
        int iA2;
        int i28;
        int i29;
        char c15 = 1;
        boolean z14 = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i30 = i17 - i15;
        int paddingBottom = i30 - getPaddingBottom();
        int paddingBottom2 = (i30 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i34 = this.mGravity;
        int i35 = i34 & 112;
        boolean z15 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(8388615 & i34, getLayoutDirection());
        int i36 = 2;
        if (absoluteGravity != 1) {
            iA = absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i16) - i14) - this.mTotalLength;
        } else {
            iA = am.j.a(i16 - i14, this.mTotalLength, 2, getPaddingLeft());
        }
        if (z14) {
            i18 = virtualChildCount - 1;
            i19 = -1;
        } else {
            i18 = 0;
            i19 = 1;
        }
        int i37 = 0;
        while (i37 < virtualChildCount) {
            int i38 = (i19 * i37) + i18;
            int i39 = i37;
            View virtualChildAt = getVirtualChildAt(i38);
            if (virtualChildAt == null) {
                iA = measureNullChild(i38) + iA;
                childrenSkipCount = i39;
                c14 = c15;
                i24 = paddingBottom;
            } else {
                c14 = c15;
                int i44 = i36;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    int i45 = iA;
                    if (z15) {
                        i25 = measuredWidth;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i26 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i26 < 0) {
                            i26 = i35;
                        }
                        i27 = i26 & 112;
                        i24 = paddingBottom;
                        if (i27 != 16) {
                            iA2 = (am.j.a(paddingBottom2, measuredHeight, i44, paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        } else if (i27 != 48) {
                            if (i27 != 80) {
                                i28 = paddingTop;
                            } else {
                                iA2 = (i24 - measuredHeight) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    iA2 -= iArr2[i44] - (virtualChildAt.getMeasuredHeight() - baseline);
                                }
                            }
                            if (hasDividerBeforeChildAt(i38)) {
                                i29 = i45 + this.mDividerWidth;
                            } else {
                                i29 = i45;
                            }
                            int i46 = i29 + ((LinearLayout.LayoutParams) aVar).leftMargin;
                            int i47 = i25;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i46, i28, i47, measuredHeight);
                            iA = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) aVar).rightMargin + i47 + i46;
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i38) + i39;
                        } else {
                            iA2 = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                iA2 = (iArr[c14] - baseline) + iA2;
                            }
                        }
                        i28 = iA2;
                        if (hasDividerBeforeChildAt(i38)) {
                            i29 = i45 + this.mDividerWidth;
                        } else {
                            i29 = i45;
                        }
                        int i48 = i29 + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        int i49 = i25;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i48, i28, i49, measuredHeight);
                        iA = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) aVar).rightMargin + i49 + i48;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i38) + i39;
                    } else {
                        i25 = measuredWidth;
                    }
                    i26 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i26 < 0) {
                        i26 = i35;
                    }
                    i27 = i26 & 112;
                    i24 = paddingBottom;
                    if (i27 != 16) {
                        iA2 = (am.j.a(paddingBottom2, measuredHeight, i44, paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    } else if (i27 != 48) {
                        if (i27 != 80) {
                            i28 = paddingTop;
                        } else {
                            iA2 = (i24 - measuredHeight) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                iA2 -= iArr2[i44] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i38)) {
                            i29 = i45 + this.mDividerWidth;
                        } else {
                            i29 = i45;
                        }
                        int i410 = i29 + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        int i411 = i25;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i410, i28, i411, measuredHeight);
                        iA = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) aVar).rightMargin + i411 + i410;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i38) + i39;
                    } else {
                        iA2 = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                        if (baseline != -1) {
                            iA2 = (iArr[c14] - baseline) + iA2;
                        }
                    }
                    i28 = iA2;
                    if (hasDividerBeforeChildAt(i38)) {
                        i29 = i45 + this.mDividerWidth;
                    } else {
                        i29 = i45;
                    }
                    int i412 = i29 + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    int i413 = i25;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i412, i28, i413, measuredHeight);
                    iA = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) aVar).rightMargin + i413 + i412;
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i38) + i39;
                } else {
                    i24 = paddingBottom;
                    childrenSkipCount = i39;
                }
            }
            i37 = childrenSkipCount + 1;
            c15 = c14;
            paddingBottom = i24;
            paddingTop = paddingTop;
            i36 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    public void layoutVertical(int i14, int i15, int i16, int i17) {
        int iA;
        int iA2;
        int i18;
        int i19;
        int paddingLeft = getPaddingLeft();
        int i24 = i16 - i14;
        int paddingRight = i24 - getPaddingRight();
        int paddingRight2 = (i24 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i25 = this.mGravity;
        int i26 = i25 & 112;
        int i27 = i25 & 8388615;
        if (i26 != 16) {
            iA = i26 != 80 ? getPaddingTop() : ((getPaddingTop() + i17) - i15) - this.mTotalLength;
        } else {
            iA = am.j.a(i17 - i15, this.mTotalLength, 2, getPaddingTop());
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            int nextLocationOffset = iA;
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                iA = measureNullChild(childrenSkipCount) + nextLocationOffset;
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    int i28 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i28 < 0) {
                        i28 = i27;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i28, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i19 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            iA2 = paddingRight - measuredWidth;
                            i18 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        if (hasDividerBeforeChildAt(childrenSkipCount)) {
                            nextLocationOffset += this.mDividerHeight;
                        }
                        int i29 = ((LinearLayout.LayoutParams) aVar).topMargin + nextLocationOffset;
                        setChildFrame(virtualChildAt, i19, getLocationOffset(virtualChildAt) + i29, measuredWidth, measuredHeight);
                        nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + i29;
                        childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    } else {
                        iA2 = am.j.a(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i18 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i19 = iA2 - i18;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        nextLocationOffset += this.mDividerHeight;
                    }
                    int i210 = ((LinearLayout.LayoutParams) aVar).topMargin + nextLocationOffset;
                    setChildFrame(virtualChildAt, i19, getLocationOffset(virtualChildAt) + i210, measuredWidth, measuredHeight);
                    nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + i210;
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                }
                iA = nextLocationOffset;
            }
            childrenSkipCount++;
        }
    }

    public void measureChildBeforeLayout(View view2, int i14, int i15, int i16, int i17, int i18) {
        measureChildWithMargins(view2, i15, i16, i17, i18);
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0453  */
    public void measureHorizontal(int i14, int i15) {
        int i16;
        int i17;
        float f14;
        int i18;
        int i19;
        int i24;
        int iMax;
        int i25;
        int baseline;
        int i26;
        int i27;
        byte b14;
        int i28;
        int i29;
        int i30;
        boolean z14;
        View view2;
        boolean z15;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z16 = this.mBaselineAligned;
        boolean z17 = this.mUseLargestChild;
        int i34 = 1073741824;
        boolean z18 = mode == 1073741824;
        boolean z19 = z17;
        int childrenSkipCount = 0;
        int i35 = 0;
        int iMax2 = 0;
        boolean z24 = false;
        int iCombineMeasuredStates = 0;
        boolean z25 = false;
        boolean z26 = true;
        float f15 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i16 = i35;
            if (childrenSkipCount >= virtualChildCount) {
                break;
            }
            boolean z27 = z16;
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount) + this.mTotalLength;
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f17 = f15 + f16;
                    if (mode == i34 && ((LinearLayout.LayoutParams) aVar).width == 0 && f16 > 0.0f) {
                        int i36 = this.mTotalLength;
                        if (z18) {
                            this.mTotalLength = ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + i36;
                        } else {
                            this.mTotalLength = Math.max(i36, ((LinearLayout.LayoutParams) aVar).leftMargin + i36 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z27) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z24 = true;
                        }
                        i29 = i16;
                        i30 = 1073741824;
                        z14 = z19;
                        view2 = virtualChildAt;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f16 <= 0.0f) {
                            b14 = -2;
                            i28 = Integer.MIN_VALUE;
                        } else {
                            b14 = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i28 = 0;
                        }
                        virtualChildCount = virtualChildCount;
                        mode = mode;
                        iArr = iArr;
                        i29 = i16;
                        i30 = 1073741824;
                        z14 = z19;
                        iArr2 = iArr2;
                        int i37 = i28;
                        measureChildBeforeLayout(virtualChildAt, childrenSkipCount, i14, f17 == 0.0f ? this.mTotalLength : 0, i15, 0);
                        view2 = virtualChildAt;
                        if (i37 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i37;
                        }
                        int measuredWidth = view2.getMeasuredWidth();
                        int i38 = this.mTotalLength;
                        if (z18) {
                            this.mTotalLength = getNextLocationOffset(view2) + ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + i38;
                        } else {
                            this.mTotalLength = Math.max(i38, getNextLocationOffset(view2) + i38 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z14) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i30 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                        z15 = false;
                    } else {
                        z15 = true;
                        z25 = true;
                    }
                    int i39 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    int measuredHeight = view2.getMeasuredHeight() + i39;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                    if (z27 && (baseline2 = view2.getBaseline()) != -1) {
                        int i44 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i44 < 0) {
                            i44 = this.mGravity;
                        }
                        int i45 = (((i44 & 112) >> 4) & (-2)) >> 1;
                        iArr[i45] = Math.max(iArr[i45], baseline2);
                        iArr2[i45] = Math.max(iArr2[i45], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i29, measuredHeight);
                    z26 = z26 && ((LinearLayout.LayoutParams) aVar).height == -1;
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (!z15) {
                            i39 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i39);
                    } else {
                        if (z15 == 0) {
                            i39 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i39);
                    }
                    childrenSkipCount += getChildrenSkipCount(view2, childrenSkipCount);
                    i35 = iMax5;
                    f15 = f17;
                }
                childrenSkipCount++;
                z19 = z14;
                iArr2 = iArr2;
                z16 = z27;
                mode = mode;
                iArr = iArr;
                virtualChildCount = virtualChildCount;
                i34 = 1073741824;
            }
            virtualChildCount = virtualChildCount;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i35 = i16;
            z14 = z19;
            childrenSkipCount++;
            z19 = z14;
            iArr2 = iArr2;
            z16 = z27;
            mode = mode;
            iArr = iArr;
            virtualChildCount = virtualChildCount;
            i34 = 1073741824;
        }
        boolean z28 = z16;
        int i46 = virtualChildCount;
        int i47 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int iCombineMeasuredStates2 = iCombineMeasuredStates;
        boolean z29 = z19;
        if (this.mTotalLength > 0) {
            i17 = i46;
            if (hasDividerBeforeChildAt(i17)) {
                this.mTotalLength += this.mDividerWidth;
            }
        } else {
            i17 = i46;
        }
        int i48 = iArr3[1];
        int iMax6 = (i48 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i16 : Math.max(i16, Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))) + Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i48, iArr3[2]))));
        if (z29) {
            i18 = i47;
            if (i18 == Integer.MIN_VALUE || i18 == 0) {
                this.mTotalLength = 0;
                int childrenSkipCount2 = 0;
                while (childrenSkipCount2 < i17) {
                    View virtualChildAt2 = getVirtualChildAt(childrenSkipCount2);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
                    } else {
                        if (virtualChildAt2.getVisibility() == 8) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount2);
                        } else {
                            a aVar2 = (a) virtualChildAt2.getLayoutParams();
                            int i49 = this.mTotalLength;
                            if (z18) {
                                this.mTotalLength = getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i49;
                            } else {
                                this.mTotalLength = Math.max(i49, getNextLocationOffset(virtualChildAt2) + i49 + iMax2 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin);
                            }
                        }
                        childrenSkipCount2++;
                        f15 = f15;
                    }
                    childrenSkipCount2++;
                    f15 = f15;
                }
            }
            f14 = f15;
        } else {
            f14 = f15;
            i18 = i47;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = paddingRight;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i14, 0);
        int i54 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z24 || (i54 != 0 && f14 > 0.0f)) {
            float f18 = this.mWeightSum;
            if (f18 > 0.0f) {
                f14 = f18;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            this.mTotalLength = 0;
            iMax6 = -1;
            int i55 = 0;
            while (i55 < i17) {
                View virtualChildAt3 = getVirtualChildAt(i55);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) virtualChildAt3.getLayoutParams();
                    float f19 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f19 > 0.0f) {
                        int i56 = (int) ((i54 * f19) / f14);
                        f14 -= f19;
                        i54 -= i56;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i15, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i27 = 1073741824;
                            if (i18 == 1073741824) {
                                if (i56 <= 0) {
                                    i56 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i56, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                        } else {
                            i27 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i56;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i27), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                    }
                    int i57 = this.mTotalLength;
                    if (z18) {
                        this.mTotalLength = getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + i57;
                    } else {
                        this.mTotalLength = Math.max(i57, getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i57 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin);
                    }
                    boolean z34 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i58 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i58;
                    iMax6 = Math.max(iMax6, measuredHeight2);
                    if (!z34) {
                        i58 = measuredHeight2;
                    }
                    int iMax7 = Math.max(iMax3, i58);
                    if (z26) {
                        i25 = -1;
                        boolean z35 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z28 && (baseline = virtualChildAt3.getBaseline()) != i25) {
                            i26 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i26 < 0) {
                                i26 = this.mGravity;
                            }
                            int i59 = (((i26 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i59] = Math.max(iArr3[i59], baseline);
                            iArr4[i59] = Math.max(iArr4[i59], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax7;
                        z26 = z35;
                    } else {
                        i25 = -1;
                    }
                    if (z28) {
                        i26 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i26 < 0) {
                            i26 = this.mGravity;
                        }
                        int i510 = (((i26 & 112) >> 4) & (-2)) >> 1;
                        iArr3[i510] = Math.max(iArr3[i510], baseline);
                        iArr4[i510] = Math.max(iArr4[i510], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax7;
                    z26 = z35;
                }
                i55++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i19 = iResolveSizeAndState;
            i24 = -16777216;
            this.mTotalLength = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
            int i64 = iArr3[1];
            if (i64 != -1 || iArr3[0] != -1 || iArr3[2] != -1 || iArr3[3] != -1) {
                iMax6 = Math.max(iMax6, Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))) + Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i64, iArr3[2]))));
            }
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z29 && i18 != 1073741824) {
                for (int i65 = 0; i65 < i17; i65++) {
                    View virtualChildAt4 = getVirtualChildAt(i65);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i19 = iResolveSizeAndState;
            i24 = -16777216;
        }
        int i66 = iCombineMeasuredStates2;
        if (!z26 && mode2 != 1073741824) {
            iMax6 = iMax;
        }
        setMeasuredDimension(i19 | (i66 & i24), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax6, getSuggestedMinimumHeight()), i15, i66 << 16));
        if (z25) {
            forceUniformHeight(i17, i14);
        }
    }

    public int measureNullChild(int i14) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    public void measureVertical(int i14, int i15) {
        int i16;
        int iMax;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        View view2;
        boolean z14;
        int iMax2;
        boolean z15;
        int iMax3;
        int i30;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int i34 = this.mBaselineAlignedChildIndex;
        boolean z16 = this.mUseLargestChild;
        int childrenSkipCount = 0;
        int i35 = 0;
        int iMax4 = 0;
        int i36 = 0;
        int i37 = 0;
        int iMax5 = 0;
        boolean z17 = false;
        boolean z18 = false;
        float f14 = 0.0f;
        boolean z19 = true;
        while (true) {
            int i38 = 8;
            if (childrenSkipCount >= virtualChildCount) {
                float f15 = f14;
                int i39 = i35;
                int i44 = virtualChildCount;
                int i45 = mode2;
                boolean z24 = z16;
                int i46 = iMax4;
                int iMax6 = i36;
                int iCombineMeasuredStates = i37;
                if (this.mTotalLength > 0) {
                    i16 = i44;
                    if (hasDividerBeforeChildAt(i16)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i16 = i44;
                }
                int i47 = i45;
                if (z24 && (i47 == Integer.MIN_VALUE || i47 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i16) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength = measureNullChild(childrenSkipCount2) + this.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i38) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            a aVar = (a) virtualChildAt.getLayoutParams();
                            int i48 = this.mTotalLength;
                            this.mTotalLength = Math.max(i48, getNextLocationOffset(virtualChildAt) + i48 + i46 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin);
                        }
                        childrenSkipCount2++;
                        i38 = 8;
                    }
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                this.mTotalLength = paddingBottom;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i15, 0);
                int i49 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z17 || (i49 != 0 && f15 > 0.0f)) {
                    float f16 = this.mWeightSum;
                    if (f16 <= 0.0f) {
                        f16 = f15;
                    }
                    this.mTotalLength = 0;
                    float f17 = f16;
                    int i54 = i49;
                    int i55 = 0;
                    while (i55 < i16) {
                        View virtualChildAt2 = getVirtualChildAt(i55);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i47 = i47;
                            i55 = i55;
                        } else {
                            a aVar2 = (a) virtualChildAt2.getLayoutParams();
                            float f18 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f18 > 0.0f) {
                                int i56 = (int) ((i54 * f18) / f17);
                                f17 -= f18;
                                i54 -= i56;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i18 = 1073741824;
                                    if (i47 == 1073741824) {
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i56 > 0 ? i56 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                                } else {
                                    i18 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i56;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i18));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                            } else {
                                i47 = i47;
                            }
                            int i57 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i57;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i17 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i57;
                                }
                            } else {
                                i17 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z25 = z19 && ((LinearLayout.LayoutParams) aVar2).width == i17;
                            int i58 = this.mTotalLength;
                            this.mTotalLength = Math.max(i58, getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i58 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin);
                            iMax5 = iMax7;
                            z19 = z25;
                        }
                        i55++;
                        i47 = i47;
                    }
                    this.mTotalLength = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i39);
                    if (z24 && i47 != 1073741824) {
                        for (int i59 = 0; i59 < i16; i59++) {
                            View virtualChildAt3 = getVirtualChildAt(i59);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i46, 1073741824));
                            }
                        }
                    }
                }
                if (!z19 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i14, iCombineMeasuredStates), iResolveSizeAndState);
                if (z18) {
                    forceUniformWidth(i16, i15);
                    return;
                }
                return;
            }
            float f19 = f14;
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength = measureNullChild(childrenSkipCount) + this.mTotalLength;
            } else {
                if (virtualChildAt4.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    a aVar3 = (a) virtualChildAt4.getLayoutParams();
                    float f22 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f24 = f19 + f22;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f22 > 0.0f) {
                        int i64 = this.mTotalLength;
                        this.mTotalLength = Math.max(i64, ((LinearLayout.LayoutParams) aVar3).topMargin + i64 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i35;
                        i26 = virtualChildCount;
                        i27 = mode2;
                        z17 = true;
                        i29 = i36;
                        i28 = i37;
                        z14 = z16;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f22 <= 0.0f) {
                            i19 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i19 = 0;
                        }
                        if (f24 == 0.0f) {
                            int i65 = i37;
                            i25 = this.mTotalLength;
                            i24 = i65;
                        } else {
                            i24 = i37;
                            i25 = 0;
                        }
                        int i66 = iMax4;
                        i26 = virtualChildCount;
                        i27 = mode2;
                        i28 = i24;
                        i29 = i36;
                        view2 = virtualChildAt4;
                        z14 = z16;
                        iMax2 = i35;
                        measureChildBeforeLayout(view2, childrenSkipCount, i14, 0, i15, i25);
                        if (i19 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i19;
                        }
                        int measuredHeight2 = view2.getMeasuredHeight();
                        int i67 = this.mTotalLength;
                        this.mTotalLength = Math.max(i67, getNextLocationOffset(view2) + i67 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax4 = z14 ? Math.max(measuredHeight2, i66) : i66;
                    }
                    if (i34 >= 0 && i34 == childrenSkipCount + 1) {
                        view2 = virtualChildAt4;
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (childrenSkipCount < i34 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        kg.f.n("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        return;
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z15 = false;
                    } else {
                        z15 = true;
                        z18 = true;
                    }
                    int i68 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view2.getMeasuredWidth() + i68;
                    iMax3 = Math.max(i29, measuredWidth2);
                    int i69 = iMax4;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i28, view2.getMeasuredState());
                    if (z19) {
                        i30 = iCombineMeasuredStates2;
                        z19 = ((LinearLayout.LayoutParams) aVar3).width == -1;
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (!z15) {
                                i68 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i68);
                        } else {
                            if (!z15) {
                                i68 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i68);
                        }
                        childrenSkipCount += getChildrenSkipCount(view2, childrenSkipCount);
                        f14 = f24;
                        iMax4 = i69;
                        i37 = i30;
                    } else {
                        i30 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z15) {
                            i68 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i68);
                    } else {
                        if (!z15) {
                            i68 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i68);
                    }
                    childrenSkipCount += getChildrenSkipCount(view2, childrenSkipCount);
                    f14 = f24;
                    iMax4 = i69;
                    i37 = i30;
                }
                childrenSkipCount++;
                i36 = iMax3;
                i35 = iMax2;
                z16 = z14;
                mode2 = i27;
                virtualChildCount = i26;
            }
            iMax2 = i35;
            i26 = virtualChildCount;
            i27 = mode2;
            z14 = z16;
            f14 = f19;
            iMax3 = i36;
            childrenSkipCount++;
            i36 = iMax3;
            i35 = iMax2;
            z16 = z14;
            mode2 = i27;
            virtualChildCount = i26;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        if (this.mOrientation == 1) {
            layoutVertical(i14, i15, i16, i17);
        } else {
            layoutHorizontal(i14, i15, i16, i17);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        if (this.mOrientation == 1) {
            measureVertical(i14, i15);
        } else {
            measureHorizontal(i14, i15);
        }
    }

    public void setBaselineAligned(boolean z14) {
        this.mBaselineAligned = z14;
    }

    public void setBaselineAlignedChildIndex(int i14) {
        if (i14 < 0 || i14 >= getChildCount()) {
            sn.a.l(getChildCount(), "base aligned child index out of range (0, ", ")");
        } else {
            this.mBaselineAlignedChildIndex = i14;
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i14) {
        this.mDividerPadding = i14;
    }

    public void setGravity(int i14) {
        if (this.mGravity != i14) {
            if ((8388615 & i14) == 0) {
                i14 |= 8388611;
            }
            if ((i14 & 112) == 0) {
                i14 |= 48;
            }
            this.mGravity = i14;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i14) {
        int i15 = i14 & 8388615;
        int i16 = this.mGravity;
        if ((8388615 & i16) != i15) {
            this.mGravity = i15 | ((-8388616) & i16);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z14) {
        this.mUseLargestChild = z14;
    }

    public void setOrientation(int i14) {
        if (this.mOrientation != i14) {
            this.mOrientation = i14;
            requestLayout();
        }
    }

    public void setShowDividers(int i14) {
        if (i14 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i14;
    }

    public void setVerticalGravity(int i14) {
        int i15 = i14 & 112;
        int i16 = this.mGravity;
        if ((i16 & 112) != i15) {
            this.mGravity = i15 | (i16 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f14) {
        this.mWeightSum = Math.max(0.0f, f14);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i14, int i15) {
            super(i14, i15);
        }

        public a(int i14, int i15, float f14) {
            super(i14, i15, f14);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }
}
