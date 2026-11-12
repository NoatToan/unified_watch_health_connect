package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.huawei.operation.utils.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
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

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    int measureNullChild(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.LinearLayoutCompat, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.LinearLayoutCompat, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int i2 = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = tintTypedArrayObtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = tintTypedArrayObtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
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

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((LayoutParams) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (zIsLayoutRtl) {
                    left2 = virtualChildAt.getRight() + layoutParams.rightMargin;
                } else {
                    left2 = (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (zIsLayoutRtl) {
                    left = virtualChildAt2.getLeft() - layoutParams2.leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + layoutParams2.rightMargin;
                }
            } else if (zIsLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        Drawable drawable = this.mDivider;
        int paddingLeft = getPaddingLeft();
        int i2 = this.mDividerPadding;
        int width = getWidth();
        int paddingRight = getPaddingRight();
        drawable.setBounds(paddingLeft + i2, i, (width - paddingRight) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + Constants.RIGHT_BRACKET_ONLY);
        }
        this.mBaselineAlignedChildIndex = i;
    }

    View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int iMax;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i16 = this.mBaselineAlignedChildIndex;
        boolean z2 = this.mUseLargestChild;
        int iMax2 = 0;
        int iMax3 = 0;
        int i17 = 0;
        int i18 = 0;
        int iMax4 = 0;
        int childrenSkipCount = 0;
        boolean z3 = false;
        boolean z4 = false;
        float f = 0.0f;
        boolean z5 = true;
        while (true) {
            int i19 = 8;
            int i20 = i18;
            if (childrenSkipCount < virtualChildCount) {
                View virtualChildAt = getVirtualChildAt(childrenSkipCount);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(childrenSkipCount);
                    i7 = iMax2;
                } else {
                    i7 = iMax2;
                    if (virtualChildAt.getVisibility() == 8) {
                        childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    } else {
                        if (hasDividerBeforeChildAt(childrenSkipCount)) {
                            this.mTotalLength += this.mDividerHeight;
                        }
                        LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                        float f2 = f + layoutParams.weight;
                        if (mode2 == 1073741824 && layoutParams.height == 0 && layoutParams.weight > 0.0f) {
                            int i21 = this.mTotalLength;
                            this.mTotalLength = Math.max(i21, layoutParams.topMargin + i21 + layoutParams.bottomMargin);
                            i10 = i17;
                            i15 = childrenSkipCount;
                            i13 = virtualChildCount;
                            z3 = true;
                            i14 = i7;
                            i9 = iMax3;
                            i11 = mode2;
                            i12 = i20;
                        } else {
                            int i22 = iMax3;
                            if (layoutParams.height != 0 || layoutParams.weight <= 0.0f) {
                                i8 = Integer.MIN_VALUE;
                            } else {
                                layoutParams.height = -2;
                                i8 = 0;
                            }
                            int i23 = i8;
                            i9 = i22;
                            i10 = i17;
                            i11 = mode2;
                            i12 = i20;
                            i13 = virtualChildCount;
                            int i24 = iMax4;
                            i14 = i7;
                            i15 = childrenSkipCount;
                            measureChildBeforeLayout(virtualChildAt, childrenSkipCount, i, 0, i2, f2 == 0.0f ? this.mTotalLength : 0);
                            if (i23 != Integer.MIN_VALUE) {
                                layoutParams.height = i23;
                            }
                            int measuredHeight = virtualChildAt.getMeasuredHeight();
                            int i25 = this.mTotalLength;
                            virtualChildAt = virtualChildAt;
                            this.mTotalLength = Math.max(i25, i25 + measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin + getNextLocationOffset(virtualChildAt));
                            iMax4 = z2 ? Math.max(measuredHeight, i24) : i24;
                        }
                        if (i16 >= 0 && i16 == i15 + 1) {
                            this.mBaselineChildTop = this.mTotalLength;
                        }
                        if (i15 < i16 && layoutParams.weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (mode == 1073741824 || layoutParams.width != -1) {
                            z = false;
                        } else {
                            z = true;
                            z4 = true;
                        }
                        int i26 = layoutParams.leftMargin + layoutParams.rightMargin;
                        int measuredWidth = virtualChildAt.getMeasuredWidth() + i26;
                        int iMax5 = Math.max(i12, measuredWidth);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i10, virtualChildAt.getMeasuredState());
                        z5 = z5 && layoutParams.width == -1;
                        if (layoutParams.weight > 0.0f) {
                            if (!z) {
                                i26 = measuredWidth;
                            }
                            iMax2 = Math.max(i14, i26);
                            iMax3 = i9;
                        } else {
                            int i27 = i14;
                            if (!z) {
                                i26 = measuredWidth;
                            }
                            iMax3 = Math.max(i9, i26);
                            iMax2 = i27;
                        }
                        int childrenSkipCount2 = getChildrenSkipCount(virtualChildAt, i15) + i15;
                        i18 = iMax5;
                        i17 = iCombineMeasuredStates;
                        childrenSkipCount = childrenSkipCount2;
                        f = f2;
                    }
                    childrenSkipCount++;
                    virtualChildCount = i13;
                    mode2 = i11;
                }
                i13 = virtualChildCount;
                i18 = i20;
                iMax2 = i7;
                i11 = mode2;
                childrenSkipCount++;
                virtualChildCount = i13;
                mode2 = i11;
            } else {
                int i28 = i17;
                int i29 = virtualChildCount;
                int i30 = mode2;
                int iMax6 = i20;
                int i31 = iMax4;
                if (this.mTotalLength > 0) {
                    i3 = i29;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i29;
                }
                if (z2 && (i30 == Integer.MIN_VALUE || i30 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount3 = 0;
                    while (childrenSkipCount3 < i3) {
                        View virtualChildAt2 = getVirtualChildAt(childrenSkipCount3);
                        if (virtualChildAt2 == null) {
                            this.mTotalLength += measureNullChild(childrenSkipCount3);
                        } else if (virtualChildAt2.getVisibility() == i19) {
                            childrenSkipCount3 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount3);
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            int i32 = this.mTotalLength;
                            this.mTotalLength = Math.max(i32, i32 + i31 + layoutParams2.topMargin + layoutParams2.bottomMargin + getNextLocationOffset(virtualChildAt2));
                        }
                        childrenSkipCount3++;
                        i19 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int iCombineMeasuredStates2 = i28;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i33 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z3 || (i33 != 0 && f > 0.0f)) {
                    float f3 = this.mWeightSum;
                    if (f3 > 0.0f) {
                        f = f3;
                    }
                    this.mTotalLength = 0;
                    int i34 = i33;
                    int i35 = 0;
                    while (i35 < i3) {
                        View virtualChildAt3 = getVirtualChildAt(i35);
                        if (virtualChildAt3.getVisibility() == 8) {
                            i3 = i3;
                        } else {
                            LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                            float f4 = layoutParams3.weight;
                            if (f4 > 0.0f) {
                                int i36 = (int) ((i34 * f4) / f);
                                float f5 = f - f4;
                                int i37 = i34 - i36;
                                int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams3.leftMargin + layoutParams3.rightMargin, layoutParams3.width);
                                if (layoutParams3.height == 0) {
                                    i6 = 1073741824;
                                    if (i30 == 1073741824) {
                                        if (i36 <= 0) {
                                            i36 = 0;
                                        }
                                        virtualChildAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                                    }
                                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-256));
                                    f = f5;
                                    i34 = i37;
                                } else {
                                    i6 = 1073741824;
                                }
                                int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i36;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                virtualChildAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6));
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-256));
                                f = f5;
                                i34 = i37;
                            }
                            int i38 = layoutParams3.leftMargin + layoutParams3.rightMargin;
                            int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i38;
                            iMax6 = Math.max(iMax6, measuredWidth2);
                            float f6 = f;
                            if (mode != 1073741824) {
                                i5 = -1;
                                if (layoutParams3.width == -1) {
                                    measuredWidth2 = i38;
                                }
                            } else {
                                i5 = -1;
                            }
                            int iMax7 = Math.max(iMax3, measuredWidth2);
                            boolean z6 = z5 && layoutParams3.width == i5;
                            int i39 = this.mTotalLength;
                            this.mTotalLength = Math.max(i39, virtualChildAt3.getMeasuredHeight() + i39 + layoutParams3.topMargin + layoutParams3.bottomMargin + getNextLocationOffset(virtualChildAt3));
                            z5 = z6;
                            iMax3 = iMax7;
                            f = f6;
                        }
                        i35++;
                        i3 = i3;
                    }
                    i4 = i3;
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    iMax = iMax3;
                } else {
                    iMax = Math.max(iMax3, iMax2);
                    if (z2 && i30 != 1073741824) {
                        for (int i40 = 0; i40 < i3; i40++) {
                            View virtualChildAt4 = getVirtualChildAt(i40);
                            if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LayoutParams) virtualChildAt4.getLayoutParams()).weight > 0.0f) {
                                virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i31, 1073741824));
                            }
                        }
                    }
                    i4 = i3;
                }
                int i41 = iCombineMeasuredStates2;
                int i42 = iMax6;
                if (z5 || mode == 1073741824) {
                    iMax = i42;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i41), iResolveSizeAndState);
                if (z4) {
                    forceUniformWidth(i4, i2);
                    return;
                }
                return;
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0463  */
    void measureHorizontal(int i, int i2) {
        int[] iArr;
        int iCombineMeasuredStates;
        int i3;
        int iMax;
        int i4;
        int baseline;
        int i5;
        byte b2;
        int i6;
        int i7;
        boolean z;
        View view;
        boolean z2;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr2 = this.mMaxAscent;
        int[] iArr3 = this.mMaxDescent;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z3 = this.mBaselineAligned;
        boolean z4 = this.mUseLargestChild;
        int i8 = 1073741824;
        boolean z5 = mode == 1073741824;
        int childrenSkipCount = 0;
        int iCombineMeasuredStates2 = 0;
        int iMax2 = 0;
        boolean z6 = false;
        int iMax3 = 0;
        int iMax4 = 0;
        boolean z7 = false;
        int iMax5 = 0;
        boolean z8 = true;
        float f = 0.0f;
        while (true) {
            iArr = iArr3;
            if (childrenSkipCount >= virtualChildCount) {
                break;
            }
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    float f2 = f + layoutParams.weight;
                    if (mode == i8 && layoutParams.width == 0 && layoutParams.weight > 0.0f) {
                        if (z5) {
                            this.mTotalLength += layoutParams.leftMargin + layoutParams.rightMargin;
                        } else {
                            int i9 = this.mTotalLength;
                            this.mTotalLength = Math.max(i9, layoutParams.leftMargin + i9 + layoutParams.rightMargin);
                        }
                        if (z3) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z6 = true;
                        }
                        i7 = childrenSkipCount;
                        z = z4;
                        view = virtualChildAt;
                        i8 = 1073741824;
                    } else {
                        if (layoutParams.width != 0 || layoutParams.weight <= 0.0f) {
                            b2 = -2;
                            i6 = Integer.MIN_VALUE;
                        } else {
                            b2 = -2;
                            layoutParams.width = -2;
                            i6 = 0;
                        }
                        i7 = childrenSkipCount;
                        int i10 = i6;
                        z = z4;
                        measureChildBeforeLayout(virtualChildAt, i7, i, f2 == 0.0f ? this.mTotalLength : 0, i2, 0);
                        if (i10 != Integer.MIN_VALUE) {
                            layoutParams.width = i10;
                        }
                        int measuredWidth = virtualChildAt.getMeasuredWidth();
                        if (z5) {
                            view = virtualChildAt;
                            this.mTotalLength += layoutParams.leftMargin + measuredWidth + layoutParams.rightMargin + getNextLocationOffset(view);
                        } else {
                            view = virtualChildAt;
                            int i11 = this.mTotalLength;
                            this.mTotalLength = Math.max(i11, i11 + measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin + getNextLocationOffset(view));
                        }
                        int i12 = iMax5;
                        if (z) {
                            iMax5 = Math.max(measuredWidth, i12);
                        }
                        i8 = 1073741824;
                    }
                    if (mode2 == i8 || layoutParams.height != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z7 = true;
                    }
                    int i13 = layoutParams.topMargin + layoutParams.bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i13;
                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                    if (z3 != 0 && (baseline2 = view.getBaseline()) != -1) {
                        int i14 = ((((layoutParams.gravity < 0 ? this.mGravity : layoutParams.gravity) & 112) >> 4) & (-2)) >> 1;
                        iArr2[i14] = Math.max(iArr2[i14], baseline2);
                        iArr[i14] = Math.max(iArr[i14], measuredHeight - baseline2);
                    }
                    iMax2 = Math.max(iMax2, measuredHeight);
                    z8 = z8 && layoutParams.height == -1;
                    if (layoutParams.weight > 0.0f) {
                        if (!z2) {
                            i13 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i13);
                    } else {
                        int i15 = iMax4;
                        if (!z2) {
                            i13 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i13);
                        iMax4 = i15;
                    }
                    int i16 = i7;
                    childrenSkipCount = i16 + getChildrenSkipCount(view, i16);
                    f = f2;
                }
                childrenSkipCount++;
                iArr3 = iArr;
                z4 = z;
                z3 = z3;
            }
            z = z4;
            z3 = z3;
            childrenSkipCount++;
            iArr3 = iArr;
            z4 = z;
            z3 = z3;
        }
        boolean z9 = z4;
        boolean z10 = z3;
        int i17 = iMax2;
        int i18 = iMax3;
        int i19 = iMax4;
        int i20 = iMax5;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i21 = iArr2[1];
        int iMax6 = (i21 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i17 : Math.max(i17, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i21, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z9 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            int childrenSkipCount2 = 0;
            while (childrenSkipCount2 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(childrenSkipCount2);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(childrenSkipCount2);
                } else if (virtualChildAt2.getVisibility() == 8) {
                    childrenSkipCount2 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount2);
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                    if (z5) {
                        this.mTotalLength += layoutParams2.leftMargin + i20 + layoutParams2.rightMargin + getNextLocationOffset(virtualChildAt2);
                    } else {
                        int i22 = this.mTotalLength;
                        this.mTotalLength = Math.max(i22, i22 + i20 + layoutParams2.leftMargin + layoutParams2.rightMargin + getNextLocationOffset(virtualChildAt2));
                    }
                }
                childrenSkipCount2++;
            }
        }
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i23 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z6 || (i23 != 0 && f > 0.0f)) {
            float f3 = this.mWeightSum;
            if (f3 > 0.0f) {
                f = f3;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.mTotalLength = 0;
            iMax6 = -1;
            iCombineMeasuredStates = iCombineMeasuredStates2;
            int i24 = 0;
            while (i24 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i24);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    virtualChildCount = virtualChildCount;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f4 = layoutParams3.weight;
                    if (f4 > 0.0f) {
                        int i25 = (int) ((i23 * f4) / f);
                        float f5 = f - f4;
                        int i26 = i23 - i25;
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + layoutParams3.topMargin + layoutParams3.bottomMargin, layoutParams3.height);
                        if (layoutParams3.width == 0) {
                            i5 = 1073741824;
                            if (mode == 1073741824) {
                                if (i25 <= 0) {
                                    i25 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i25, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt3.getMeasuredState() & (-16777216));
                            f = f5;
                            i23 = i26;
                        } else {
                            i5 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i25;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i5), childMeasureSpec);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt3.getMeasuredState() & (-16777216));
                        f = f5;
                        i23 = i26;
                    }
                    if (z5) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + layoutParams3.leftMargin + layoutParams3.rightMargin + getNextLocationOffset(virtualChildAt3);
                    } else {
                        int i27 = this.mTotalLength;
                        this.mTotalLength = Math.max(i27, virtualChildAt3.getMeasuredWidth() + i27 + layoutParams3.leftMargin + layoutParams3.rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z11 = mode2 != 1073741824 && layoutParams3.height == -1;
                    int i28 = layoutParams3.topMargin + layoutParams3.bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i28;
                    iMax6 = Math.max(iMax6, measuredHeight2);
                    if (!z11) {
                        i28 = measuredHeight2;
                    }
                    int iMax7 = Math.max(i18, i28);
                    if (z8) {
                        i4 = -1;
                        boolean z12 = layoutParams3.height == -1;
                        if (!z10 && (baseline = virtualChildAt3.getBaseline()) != i4) {
                            int i29 = ((((layoutParams3.gravity < 0 ? this.mGravity : layoutParams3.gravity) & 112) >> 4) & (-2)) >> 1;
                            iArr2[i29] = Math.max(iArr2[i29], baseline);
                            iArr[i29] = Math.max(iArr[i29], measuredHeight2 - baseline);
                        }
                        z8 = z12;
                        i23 = i23;
                        i18 = iMax7;
                        f = f;
                    } else {
                        i4 = -1;
                    }
                    if (!z10) {
                    }
                    z8 = z12;
                    i23 = i23;
                    i18 = iMax7;
                    f = f;
                }
                i24++;
                virtualChildCount = virtualChildCount;
            }
            i3 = virtualChildCount;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i30 = iArr2[1];
            if (i30 != -1 || iArr2[0] != -1 || iArr2[2] != -1 || iArr2[3] != -1) {
                iMax6 = Math.max(iMax6, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i30, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            }
            iMax = i18;
        } else {
            iMax = Math.max(i18, i19);
            if (z9 && mode != 1073741824) {
                for (int i31 = 0; i31 < virtualChildCount; i31++) {
                    View virtualChildAt4 = getVirtualChildAt(i31);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LayoutParams) virtualChildAt4.getLayoutParams()).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = virtualChildCount;
            iCombineMeasuredStates = iCombineMeasuredStates2;
        }
        if (z8 || mode2 == 1073741824) {
            iMax = iMax6;
        }
        setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState, View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16));
        if (z7) {
            forceUniformHeight(i3, i);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, iMakeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = getPaddingRight();
        int paddingRight2 = getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.mGravity;
        int i10 = i9 & 112;
        if (i10 == 16) {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        } else if (i10 == 80) {
            paddingTop = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        } else {
            paddingTop = getPaddingTop();
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(childrenSkipCount);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i11 = layoutParams.gravity;
                if (i11 < 0) {
                    i11 = 8388615 & i9;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i11, ViewCompat.getLayoutDirection(this)) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((((i8 - paddingLeft) - paddingRight2) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else {
                    if (absoluteGravity == 5) {
                        i5 = (i8 - paddingRight) - measuredWidth;
                        i6 = layoutParams.rightMargin;
                    } else {
                        i7 = layoutParams.leftMargin + paddingLeft;
                    }
                    int i12 = i7;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i13 = paddingTop + layoutParams.topMargin;
                    setChildFrame(virtualChildAt, i12, i13 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    int nextLocationOffset = i13 + measuredHeight + layoutParams.bottomMargin + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    paddingTop = nextLocationOffset;
                }
                i7 = i5 - i6;
                int i14 = i7;
                if (hasDividerBeforeChildAt(childrenSkipCount)) {
                    paddingTop += this.mDividerHeight;
                }
                int i15 = paddingTop + layoutParams.topMargin;
                setChildFrame(virtualChildAt, i14, i15 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                int nextLocationOffset2 = i15 + measuredHeight + layoutParams.bottomMargin + getNextLocationOffset(virtualChildAt);
                childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                paddingTop = nextLocationOffset2;
            }
            childrenSkipCount++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean z;
        int baseline;
        int i7;
        int i8;
        int i9;
        int measuredHeight;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i10 = i4 - i2;
        int paddingBottom = getPaddingBottom();
        int paddingBottom2 = getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i11 = this.mGravity;
        boolean z2 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(8388615 & i11, ViewCompat.getLayoutDirection(this));
        boolean z3 = true;
        if (absoluteGravity == 1) {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
        } else if (absoluteGravity == 5) {
            paddingLeft = ((getPaddingLeft() + i3) - i) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (zIsLayoutRtl) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            int i12 = i5 + (i6 * childrenSkipCount);
            View virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i12);
                z = z3;
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i13 = childrenSkipCount;
                    if (z2) {
                        virtualChildCount = virtualChildCount;
                        baseline = layoutParams.height != -1 ? virtualChildAt.getBaseline() : -1;
                        i7 = layoutParams.gravity;
                        if (i7 < 0) {
                            i7 = i11 & 112;
                        }
                        i8 = i7 & 112;
                        i11 = i11;
                        if (i8 != 16) {
                            z = true;
                            i9 = ((((i10 - paddingTop) - paddingBottom2) - measuredHeight2) / 2) + paddingTop + layoutParams.topMargin;
                            measuredHeight = layoutParams.bottomMargin;
                        } else {
                            if (i8 != 48) {
                                i9 = layoutParams.topMargin + paddingTop;
                                if (baseline != -1) {
                                    z = true;
                                    i9 += iArr[1] - baseline;
                                }
                                if (hasDividerBeforeChildAt(i12)) {
                                    paddingLeft += this.mDividerWidth;
                                }
                                int i14 = layoutParams.leftMargin + paddingLeft;
                                paddingTop = paddingTop;
                                setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i14, i9, measuredWidth, measuredHeight2);
                                int i15 = layoutParams.rightMargin;
                                int nextLocationOffset = getNextLocationOffset(virtualChildAt);
                                childrenSkipCount = getChildrenSkipCount(virtualChildAt, i12) + i13;
                                paddingLeft = i14 + i15 + measuredWidth + nextLocationOffset;
                            } else if (i8 != 80) {
                                i9 = paddingTop;
                            } else {
                                i9 = ((i10 - paddingBottom) - measuredHeight2) - layoutParams.bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                                    z = true;
                                }
                                if (hasDividerBeforeChildAt(i12)) {
                                    paddingLeft += this.mDividerWidth;
                                }
                                int i16 = layoutParams.leftMargin + paddingLeft;
                                paddingTop = paddingTop;
                                setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i16, i9, measuredWidth, measuredHeight2);
                                int i17 = layoutParams.rightMargin;
                                int nextLocationOffset2 = getNextLocationOffset(virtualChildAt);
                                childrenSkipCount = getChildrenSkipCount(virtualChildAt, i12) + i13;
                                paddingLeft = i16 + i17 + measuredWidth + nextLocationOffset2;
                            }
                            z = true;
                            if (hasDividerBeforeChildAt(i12)) {
                                paddingLeft += this.mDividerWidth;
                            }
                            int i18 = layoutParams.leftMargin + paddingLeft;
                            paddingTop = paddingTop;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i18, i9, measuredWidth, measuredHeight2);
                            int i19 = layoutParams.rightMargin;
                            int nextLocationOffset3 = getNextLocationOffset(virtualChildAt);
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i12) + i13;
                            paddingLeft = i18 + i19 + measuredWidth + nextLocationOffset3;
                        }
                        i9 -= measuredHeight;
                        if (hasDividerBeforeChildAt(i12)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i110 = layoutParams.leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i110, i9, measuredWidth, measuredHeight2);
                        int i111 = layoutParams.rightMargin;
                        int nextLocationOffset4 = getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i12) + i13;
                        paddingLeft = i110 + i111 + measuredWidth + nextLocationOffset4;
                    } else {
                        virtualChildCount = virtualChildCount;
                    }
                    i7 = layoutParams.gravity;
                    if (i7 < 0) {
                        i7 = i11 & 112;
                    }
                    i8 = i7 & 112;
                    i11 = i11;
                    if (i8 != 16) {
                        z = true;
                        i9 = ((((i10 - paddingTop) - paddingBottom2) - measuredHeight2) / 2) + paddingTop + layoutParams.topMargin;
                        measuredHeight = layoutParams.bottomMargin;
                    } else {
                        if (i8 != 48) {
                            i9 = layoutParams.topMargin + paddingTop;
                            if (baseline != -1) {
                                z = true;
                                i9 += iArr[1] - baseline;
                            }
                            if (hasDividerBeforeChildAt(i12)) {
                                paddingLeft += this.mDividerWidth;
                            }
                            int i112 = layoutParams.leftMargin + paddingLeft;
                            paddingTop = paddingTop;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i112, i9, measuredWidth, measuredHeight2);
                            int i113 = layoutParams.rightMargin;
                            int nextLocationOffset5 = getNextLocationOffset(virtualChildAt);
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i12) + i13;
                            paddingLeft = i112 + i113 + measuredWidth + nextLocationOffset5;
                        } else if (i8 != 80) {
                            i9 = paddingTop;
                        } else {
                            i9 = ((i10 - paddingBottom) - measuredHeight2) - layoutParams.bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                                z = true;
                            }
                            if (hasDividerBeforeChildAt(i12)) {
                                paddingLeft += this.mDividerWidth;
                            }
                            int i114 = layoutParams.leftMargin + paddingLeft;
                            paddingTop = paddingTop;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i114, i9, measuredWidth, measuredHeight2);
                            int i115 = layoutParams.rightMargin;
                            int nextLocationOffset6 = getNextLocationOffset(virtualChildAt);
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i12) + i13;
                            paddingLeft = i114 + i115 + measuredWidth + nextLocationOffset6;
                        }
                        z = true;
                        if (hasDividerBeforeChildAt(i12)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i116 = layoutParams.leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i116, i9, measuredWidth, measuredHeight2);
                        int i117 = layoutParams.rightMargin;
                        int nextLocationOffset7 = getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i12) + i13;
                        paddingLeft = i116 + i117 + measuredWidth + nextLocationOffset7;
                    }
                    i9 -= measuredHeight;
                    if (hasDividerBeforeChildAt(i12)) {
                        paddingLeft += this.mDividerWidth;
                    }
                    int i118 = layoutParams.leftMargin + paddingLeft;
                    paddingTop = paddingTop;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i118, i9, measuredWidth, measuredHeight2);
                    int i119 = layoutParams.rightMargin;
                    int nextLocationOffset8 = getNextLocationOffset(virtualChildAt);
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i12) + i13;
                    paddingLeft = i118 + i119 + measuredWidth + nextLocationOffset8;
                } else {
                    z = true;
                }
                childrenSkipCount++;
                virtualChildCount = virtualChildCount;
                i11 = i11;
                z3 = z;
                paddingTop = paddingTop;
            }
            childrenSkipCount++;
            virtualChildCount = virtualChildCount;
            i11 = i11;
            z3 = z;
            paddingTop = paddingTop;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
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

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }
}
