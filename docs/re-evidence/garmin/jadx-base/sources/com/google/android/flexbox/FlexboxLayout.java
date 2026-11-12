package com.google.android.flexbox;

import am.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.internal.http2.Http2Connection;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;
    private Drawable mDividerDrawableHorizontal;
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout, i14, 0);
        this.mFlexDirection = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexDirection, 0);
        this.mFlexWrap = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexWrap, 0);
        this.mJustifyContent = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_justifyContent, 0);
        this.mAlignItems = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignItems, 0);
        this.mAlignContent = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignContent, 0);
        this.mMaxLine = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDivider, 0);
        if (i15 != 0) {
            this.mShowDividerVertical = i15;
            this.mShowDividerHorizontal = i15;
        }
        int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i16 != 0) {
            this.mShowDividerVertical = i16;
        }
        int i17 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i17 != 0) {
            this.mShowDividerHorizontal = i17;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean allFlexLinesAreDummyBefore(int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.mFlexLines.get(i15).getItemCountNotGone() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean allViewsAreGoneBefore(int i14, int i15) {
        for (int i16 = 1; i16 <= i15; i16++) {
            View reorderedChildAt = getReorderedChildAt(i14 - i16);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void drawDividersHorizontal(Canvas canvas, boolean z14, boolean z15) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i14 = 0; i14 < size; i14++) {
            FlexLine flexLine = this.mFlexLines.get(i14);
            for (int i15 = 0; i15 < flexLine.mItemCount; i15++) {
                int i16 = flexLine.mFirstIndex + i15;
                View reorderedChildAt = getReorderedChildAt(i16);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i16, i15)) {
                        drawVerticalDivider(canvas, z14 ? reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth, flexLine.mTop, flexLine.mCrossSize);
                    }
                    if (i15 == flexLine.mItemCount - 1 && (this.mShowDividerVertical & 4) > 0) {
                        drawVerticalDivider(canvas, z14 ? (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth : reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, flexLine.mTop, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i14)) {
                drawHorizontalDivider(canvas, paddingLeft, z15 ? flexLine.mBottom : flexLine.mTop - this.mDividerHorizontalHeight, iMax);
            }
            if (hasEndDividerAfterFlexLine(i14) && (this.mShowDividerHorizontal & 4) > 0) {
                drawHorizontalDivider(canvas, paddingLeft, z15 ? flexLine.mTop - this.mDividerHorizontalHeight : flexLine.mBottom, iMax);
            }
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean z14, boolean z15) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i14 = 0; i14 < size; i14++) {
            FlexLine flexLine = this.mFlexLines.get(i14);
            for (int i15 = 0; i15 < flexLine.mItemCount; i15++) {
                int i16 = flexLine.mFirstIndex + i15;
                View reorderedChildAt = getReorderedChildAt(i16);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i16, i15)) {
                        drawHorizontalDivider(canvas, flexLine.mLeft, z15 ? reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight, flexLine.mCrossSize);
                    }
                    if (i15 == flexLine.mItemCount - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        drawHorizontalDivider(canvas, flexLine.mLeft, z15 ? (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight : reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i14)) {
                drawVerticalDivider(canvas, z14 ? flexLine.mRight : flexLine.mLeft - this.mDividerVerticalWidth, paddingTop, iMax);
            }
            if (hasEndDividerAfterFlexLine(i14) && (this.mShowDividerVertical & 4) > 0) {
                drawVerticalDivider(canvas, z14 ? flexLine.mLeft - this.mDividerVerticalWidth : flexLine.mRight, paddingTop, iMax);
            }
        }
    }

    private void drawHorizontalDivider(Canvas canvas, int i14, int i15, int i16) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i14, i15, i16 + i14, this.mDividerHorizontalHeight + i15);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int i14, int i15, int i16) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i14, i15, this.mDividerVerticalWidth + i14, i16 + i15);
        this.mDividerDrawableVertical.draw(canvas);
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int i14, int i15) {
        if (allViewsAreGoneBefore(i14, i15)) {
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerVertical & 1) != 0;
            }
            return (this.mShowDividerHorizontal & 1) != 0;
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.mShowDividerVertical & 2) != 0;
        }
        return (this.mShowDividerHorizontal & 2) != 0;
    }

    private boolean hasDividerBeforeFlexLine(int i14) {
        if (i14 >= 0 && i14 < this.mFlexLines.size()) {
            if (allFlexLinesAreDummyBefore(i14)) {
                if (isMainAxisDirectionHorizontal()) {
                    return (this.mShowDividerHorizontal & 1) != 0;
                }
                return (this.mShowDividerVertical & 1) != 0;
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 2) != 0;
            }
            if ((this.mShowDividerVertical & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean hasEndDividerAfterFlexLine(int i14) {
        if (i14 >= 0 && i14 < this.mFlexLines.size()) {
            for (int i15 = i14 + 1; i15 < this.mFlexLines.size(); i15++) {
                if (this.mFlexLines.get(i15).getItemCountNotGone() > 0) {
                    return false;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 4) != 0;
            }
            if ((this.mShowDividerVertical & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    private void layoutHorizontal(boolean z14, int i14, int i15, int i16, int i17) {
        float measuredWidth;
        float f14;
        float f15;
        float fMax;
        int i18;
        int i19;
        View reorderedChildAt;
        boolean z15;
        int i24;
        int i25;
        float f16;
        float f17;
        int i26;
        float f18;
        int i27;
        View view2;
        FlexboxHelper flexboxHelper;
        FlexLine flexLine;
        FlexboxHelper flexboxHelper2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i28 = i16 - i14;
        int paddingBottom = (i17 - i15) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mFlexLines.size();
        for (int i29 = 0; i29 < size; i29++) {
            FlexLine flexLine2 = this.mFlexLines.get(i29);
            if (hasDividerBeforeFlexLine(i29)) {
                int i30 = this.mDividerHorizontalHeight;
                paddingBottom -= i30;
                paddingTop += i30;
            }
            int i34 = paddingBottom;
            int i35 = this.mJustifyContent;
            char c14 = 4;
            int i36 = 2;
            boolean z16 = true;
            if (i35 == 0) {
                measuredWidth = paddingLeft;
                f14 = i28 - paddingRight;
            } else if (i35 != 1) {
                if (i35 == 2) {
                    int i37 = flexLine2.mMainSize;
                    measuredWidth = paddingLeft + ((i28 - i37) / 2.0f);
                    f14 = (i28 - paddingRight) - ((i28 - i37) / 2.0f);
                } else if (i35 == 3) {
                    measuredWidth = paddingLeft;
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    f15 = (i28 - flexLine2.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f14 = i28 - paddingRight;
                } else if (i35 == 4) {
                    int itemCountNotGone2 = flexLine2.getItemCountNotGone();
                    float f19 = itemCountNotGone2 != 0 ? (i28 - flexLine2.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f22 = f19 / 2.0f;
                    measuredWidth = paddingLeft + f22;
                    float f24 = (i28 - paddingRight) - f22;
                    f15 = f19;
                    f14 = f24;
                } else {
                    if (i35 != 5) {
                        e.i(this.mJustifyContent, "Invalid justifyContent is set: ");
                        return;
                    }
                    int itemCountNotGone3 = flexLine2.getItemCountNotGone();
                    f15 = itemCountNotGone3 != 0 ? (i28 - flexLine2.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f15;
                    f14 = (i28 - paddingRight) - f15;
                }
                fMax = Math.max(f15, 0.0f);
                i18 = 0;
                while (i18 < flexLine2.mItemCount) {
                    i19 = flexLine2.mFirstIndex + i18;
                    reorderedChildAt = getReorderedChildAt(i19);
                    char c15 = c14;
                    if (reorderedChildAt != null) {
                        z15 = z16;
                        if (reorderedChildAt.getVisibility() == 8) {
                            z15 = z15;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f16 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            f17 = f14 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i19, i18)) {
                                int i38 = this.mDividerVerticalWidth;
                                float f25 = i38;
                                f16 += f25;
                                f17 -= f25;
                                i26 = i38;
                            } else {
                                i26 = 0;
                            }
                            f18 = f17;
                            if (i18 == flexLine2.mItemCount - 1 || (this.mShowDividerVertical & 4) <= 0) {
                                i27 = 0;
                            } else {
                                i27 = this.mDividerVerticalWidth;
                            }
                            if (this.mFlexWrap == i36) {
                                i25 = i36;
                                flexboxHelper2 = this.mFlexboxHelper;
                                if (z14) {
                                    view2 = reorderedChildAt;
                                    flexboxHelper2.layoutSingleChildHorizontal(view2, flexLine2, Math.round(f18) - reorderedChildAt.getMeasuredWidth(), i34 - reorderedChildAt.getMeasuredHeight(), Math.round(f18), i34);
                                } else {
                                    view2 = reorderedChildAt;
                                    flexboxHelper2.layoutSingleChildHorizontal(view2, flexLine2, Math.round(f16), i34 - view2.getMeasuredHeight(), view2.getMeasuredWidth() + Math.round(f16), i34);
                                }
                                i24 = i34;
                            } else {
                                i18 = i18;
                                view2 = reorderedChildAt;
                                z15 = z15;
                                i25 = i36;
                                i24 = i34;
                                flexboxHelper = this.mFlexboxHelper;
                                if (z14) {
                                    flexboxHelper.layoutSingleChildHorizontal(view2, flexLine2, Math.round(f18) - view2.getMeasuredWidth(), paddingTop, Math.round(f18), view2.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i39 = paddingTop;
                                    flexboxHelper.layoutSingleChildHorizontal(view2, flexLine2, Math.round(f16), i39, view2.getMeasuredWidth() + Math.round(f16), view2.getMeasuredHeight() + i39);
                                    paddingTop = i39;
                                }
                            }
                            measuredWidth = f16 + view2.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f18 - ((view2.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z14) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view2, i27, 0, i26, 0);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view2, i26, 0, i27, 0);
                            }
                            flexLine2 = flexLine;
                            f14 = measuredWidth2;
                        }
                        i18++;
                        c14 = c15;
                        i36 = i25;
                        z16 = z15;
                        i34 = i24;
                    } else {
                        z15 = z16;
                    }
                    i25 = i36;
                    i18 = i18;
                    i24 = i34;
                    i18++;
                    c14 = c15;
                    i36 = i25;
                    z16 = z15;
                    i34 = i24;
                }
                int i44 = flexLine2.mCrossSize;
                paddingTop += i44;
                paddingBottom = i34 - i44;
            } else {
                int i45 = flexLine2.mMainSize;
                f14 = i45 - paddingLeft;
                measuredWidth = (i28 - i45) + paddingRight;
            }
            f15 = 0.0f;
            fMax = Math.max(f15, 0.0f);
            i18 = 0;
            while (i18 < flexLine2.mItemCount) {
                i19 = flexLine2.mFirstIndex + i18;
                reorderedChildAt = getReorderedChildAt(i19);
                char c16 = c14;
                if (reorderedChildAt != null) {
                    z15 = z16;
                    if (reorderedChildAt.getVisibility() == 8) {
                        z15 = z15;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f16 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        f17 = f14 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i19, i18)) {
                            int i310 = this.mDividerVerticalWidth;
                            float f26 = i310;
                            f16 += f26;
                            f17 -= f26;
                            i26 = i310;
                        } else {
                            i26 = 0;
                        }
                        f18 = f17;
                        if (i18 == flexLine2.mItemCount - 1) {
                            i27 = 0;
                        } else {
                            i27 = 0;
                        }
                        if (this.mFlexWrap == i36) {
                            i25 = i36;
                            flexboxHelper2 = this.mFlexboxHelper;
                            if (z14) {
                                view2 = reorderedChildAt;
                                flexboxHelper2.layoutSingleChildHorizontal(view2, flexLine2, Math.round(f18) - reorderedChildAt.getMeasuredWidth(), i34 - reorderedChildAt.getMeasuredHeight(), Math.round(f18), i34);
                            } else {
                                view2 = reorderedChildAt;
                                flexboxHelper2.layoutSingleChildHorizontal(view2, flexLine2, Math.round(f16), i34 - view2.getMeasuredHeight(), view2.getMeasuredWidth() + Math.round(f16), i34);
                            }
                            i24 = i34;
                        } else {
                            i18 = i18;
                            view2 = reorderedChildAt;
                            z15 = z15;
                            i25 = i36;
                            i24 = i34;
                            flexboxHelper = this.mFlexboxHelper;
                            if (z14) {
                                flexboxHelper.layoutSingleChildHorizontal(view2, flexLine2, Math.round(f18) - view2.getMeasuredWidth(), paddingTop, Math.round(f18), view2.getMeasuredHeight() + paddingTop);
                            } else {
                                int i311 = paddingTop;
                                flexboxHelper.layoutSingleChildHorizontal(view2, flexLine2, Math.round(f16), i311, view2.getMeasuredWidth() + Math.round(f16), view2.getMeasuredHeight() + i311);
                                paddingTop = i311;
                            }
                        }
                        measuredWidth = f16 + view2.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f18 - ((view2.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z14) {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(view2, i27, 0, i26, 0);
                        } else {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(view2, i26, 0, i27, 0);
                        }
                        flexLine2 = flexLine;
                        f14 = measuredWidth3;
                    }
                    i18++;
                    c14 = c16;
                    i36 = i25;
                    z16 = z15;
                    i34 = i24;
                } else {
                    z15 = z16;
                }
                i25 = i36;
                i18 = i18;
                i24 = i34;
                i18++;
                c14 = c16;
                i36 = i25;
                z16 = z15;
                i34 = i24;
            }
            int i46 = flexLine2.mCrossSize;
            paddingTop += i46;
            paddingBottom = i34 - i46;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:66:0x017c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c9  */
    private void layoutVertical(boolean z14, boolean z15, int i14, int i15, int i16, int i17) {
        float measuredHeight;
        float f14;
        float f15;
        float fMax;
        int i18;
        int i19;
        int i24;
        View reorderedChildAt;
        char c14;
        int i25;
        int i26;
        float f16;
        float f17;
        int i27;
        float f18;
        int i28;
        FlexboxHelper flexboxHelper;
        FlexLine flexLine;
        FlexboxHelper flexboxHelper2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i29 = i17 - i15;
        int i30 = (i16 - i14) - paddingRight;
        int size = this.mFlexLines.size();
        for (int i34 = 0; i34 < size; i34++) {
            FlexLine flexLine2 = this.mFlexLines.get(i34);
            if (hasDividerBeforeFlexLine(i34)) {
                int i35 = this.mDividerVerticalWidth;
                paddingLeft += i35;
                i30 -= i35;
            }
            int i36 = i30;
            int i37 = this.mJustifyContent;
            char c15 = 4;
            int i38 = 1;
            if (i37 == 0) {
                measuredHeight = paddingTop;
                f14 = i29 - paddingBottom;
            } else if (i37 != 1) {
                if (i37 == 2) {
                    int i39 = flexLine2.mMainSize;
                    measuredHeight = paddingTop + ((i29 - i39) / 2.0f);
                    f14 = (i29 - paddingBottom) - ((i29 - i39) / 2.0f);
                } else if (i37 == 3) {
                    measuredHeight = paddingTop;
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    f15 = (i29 - flexLine2.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f14 = i29 - paddingBottom;
                } else if (i37 == 4) {
                    int itemCountNotGone2 = flexLine2.getItemCountNotGone();
                    f15 = itemCountNotGone2 != 0 ? (i29 - flexLine2.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f19 = f15 / 2.0f;
                    measuredHeight = paddingTop + f19;
                    f14 = (i29 - paddingBottom) - f19;
                } else {
                    if (i37 != 5) {
                        e.i(this.mJustifyContent, "Invalid justifyContent is set: ");
                        return;
                    }
                    int itemCountNotGone3 = flexLine2.getItemCountNotGone();
                    f15 = itemCountNotGone3 != 0 ? (i29 - flexLine2.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f15;
                    f14 = (i29 - paddingBottom) - f15;
                }
                fMax = Math.max(f15, 0.0f);
                i18 = 0;
                while (i18 < flexLine2.mItemCount) {
                    i19 = flexLine2.mFirstIndex + i18;
                    i24 = i38;
                    reorderedChildAt = getReorderedChildAt(i19);
                    if (reorderedChildAt != null) {
                        c14 = c15;
                        if (reorderedChildAt.getVisibility() == 8) {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f16 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            f17 = f14 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i19, i18)) {
                                i27 = this.mDividerHorizontalHeight;
                                float f22 = i27;
                                f16 += f22;
                                f17 -= f22;
                            } else {
                                i27 = 0;
                            }
                            f18 = f17;
                            if (i18 == flexLine2.mItemCount - i24 || (this.mShowDividerHorizontal & 4) <= 0) {
                                i28 = 0;
                            } else {
                                i28 = this.mDividerHorizontalHeight;
                            }
                            if (z14) {
                                i26 = i18;
                                flexboxHelper2 = this.mFlexboxHelper;
                                if (z15) {
                                    flexboxHelper2.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i36 - reorderedChildAt.getMeasuredWidth(), Math.round(f18) - reorderedChildAt.getMeasuredHeight(), i36, Math.round(f18));
                                } else {
                                    flexboxHelper2.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i36 - reorderedChildAt.getMeasuredWidth(), Math.round(f16), i36, reorderedChildAt.getMeasuredHeight() + Math.round(f16));
                                }
                                i25 = i36;
                            } else {
                                i26 = i18;
                                i24 = i24;
                                i25 = i36;
                                flexboxHelper = this.mFlexboxHelper;
                                if (z15) {
                                    flexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f18) - reorderedChildAt.getMeasuredHeight(), reorderedChildAt.getMeasuredWidth() + paddingLeft, Math.round(f18));
                                } else {
                                    int i44 = paddingLeft;
                                    flexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, i44, Math.round(f16), reorderedChildAt.getMeasuredWidth() + i44, reorderedChildAt.getMeasuredHeight() + Math.round(f16));
                                    paddingLeft = i44;
                                }
                            }
                            measuredHeight = f16 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f18 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z15) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i28, 0, i27);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i27, 0, i28);
                            }
                            flexLine2 = flexLine;
                            f14 = measuredHeight2;
                        }
                        i18 = i26 + 1;
                        c15 = c14;
                        i38 = i24;
                        i36 = i25;
                    } else {
                        c14 = c15;
                    }
                    i26 = i18;
                    i24 = i24;
                    i25 = i36;
                    i18 = i26 + 1;
                    c15 = c14;
                    i38 = i24;
                    i36 = i25;
                }
                int i45 = flexLine2.mCrossSize;
                paddingLeft += i45;
                i30 = i36 - i45;
            } else {
                int i46 = flexLine2.mMainSize;
                f14 = i46 - paddingTop;
                measuredHeight = (i29 - i46) + paddingBottom;
            }
            f15 = 0.0f;
            fMax = Math.max(f15, 0.0f);
            i18 = 0;
            while (i18 < flexLine2.mItemCount) {
                i19 = flexLine2.mFirstIndex + i18;
                i24 = i38;
                reorderedChildAt = getReorderedChildAt(i19);
                if (reorderedChildAt != null) {
                    c14 = c15;
                    if (reorderedChildAt.getVisibility() == 8) {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f16 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        f17 = f14 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i19, i18)) {
                            i27 = this.mDividerHorizontalHeight;
                            float f24 = i27;
                            f16 += f24;
                            f17 -= f24;
                        } else {
                            i27 = 0;
                        }
                        f18 = f17;
                        if (i18 == flexLine2.mItemCount - i24) {
                            i28 = 0;
                        } else {
                            i28 = 0;
                        }
                        if (z14) {
                            i26 = i18;
                            flexboxHelper2 = this.mFlexboxHelper;
                            if (z15) {
                                flexboxHelper2.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i36 - reorderedChildAt.getMeasuredWidth(), Math.round(f18) - reorderedChildAt.getMeasuredHeight(), i36, Math.round(f18));
                            } else {
                                flexboxHelper2.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i36 - reorderedChildAt.getMeasuredWidth(), Math.round(f16), i36, reorderedChildAt.getMeasuredHeight() + Math.round(f16));
                            }
                            i25 = i36;
                        } else {
                            i26 = i18;
                            i24 = i24;
                            i25 = i36;
                            flexboxHelper = this.mFlexboxHelper;
                            if (z15) {
                                flexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f18) - reorderedChildAt.getMeasuredHeight(), reorderedChildAt.getMeasuredWidth() + paddingLeft, Math.round(f18));
                            } else {
                                int i47 = paddingLeft;
                                flexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, i47, Math.round(f16), reorderedChildAt.getMeasuredWidth() + i47, reorderedChildAt.getMeasuredHeight() + Math.round(f16));
                                paddingLeft = i47;
                            }
                        }
                        measuredHeight = f16 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        float measuredHeight3 = f18 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                        if (z15) {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i28, 0, i27);
                        } else {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i27, 0, i28);
                        }
                        flexLine2 = flexLine;
                        f14 = measuredHeight3;
                    }
                    i18 = i26 + 1;
                    c15 = c14;
                    i38 = i24;
                    i36 = i25;
                } else {
                    c14 = c15;
                }
                i26 = i18;
                i24 = i24;
                i25 = i36;
                i18 = i26 + 1;
                c15 = c14;
                i38 = i24;
                i36 = i25;
            }
            int i48 = flexLine2.mCrossSize;
            paddingLeft += i48;
            i30 = i36 - i48;
        }
    }

    private void measureHorizontal(int i14, int i15) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, i14, i15);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i14, i15);
        if (this.mAlignItems == 3) {
            for (FlexLine flexLine : this.mFlexLines) {
                int iMax = Integer.MIN_VALUE;
                for (int i16 = 0; i16 < flexLine.mItemCount; i16++) {
                    View reorderedChildAt = getReorderedChildAt(flexLine.mFirstIndex + i16);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        int i17 = this.mFlexWrap;
                        int i18 = flexLine.mMaxBaseline;
                        iMax = i17 != 2 ? Math.max(iMax, reorderedChildAt.getMeasuredHeight() + Math.max(i18 - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(reorderedChildAt.getBaseline() + (i18 - reorderedChildAt.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                flexLine.mCrossSize = iMax;
            }
        }
        this.mFlexboxHelper.determineCrossSize(i14, i15, getPaddingBottom() + getPaddingTop());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i14, i15, this.mFlexLinesResult.mChildState);
    }

    private void measureVertical(int i14, int i15) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, i14, i15);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i14, i15);
        this.mFlexboxHelper.determineCrossSize(i14, i15, getPaddingRight() + getPaddingLeft());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i14, i15, this.mFlexLinesResult.mChildState);
    }

    private void setMeasuredDimensionForFlex(int i14, int i15, int i16, int i17) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        int mode2 = View.MeasureSpec.getMode(i16);
        int size2 = View.MeasureSpec.getSize(i16);
        if (i14 == 0 || i14 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i14 != 2 && i14 != 3) {
                h.s(j.h(i14, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i17 = View.combineMeasuredStates(i17, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i15, i17);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i15, i17);
        } else if (mode != 1073741824) {
            h.z(j.h(mode, "Unknown width mode is set: "));
            return;
        } else {
            if (size < largestMainSize) {
                i17 = View.combineMeasuredStates(i17, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i15, i17);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i17 = View.combineMeasuredStates(i17, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i16, i17);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i16, i17);
        } else if (mode2 != 1073741824) {
            h.z(j.h(mode2, "Unknown height mode is set: "));
            return;
        } else {
            if (size2 < paddingBottom) {
                i17 = View.combineMeasuredStates(i17, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i16, i17);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void setWillNotDrawFlag() {
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(view2, i14, layoutParams, this.mOrderCache);
        super.addView(view2, i14, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return this.mAlignContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i14, int i15, int i16) {
        return ViewGroup.getChildMeasureSpec(i14, i15, i16);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i14, int i15, int i16) {
        return ViewGroup.getChildMeasureSpec(i14, i15, i16);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view2) {
        return 0;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view2, int i14, int i15) {
        int i16;
        int i17;
        if (isMainAxisDirectionHorizontal()) {
            i16 = hasDividerBeforeChildAtAlongMainAxis(i14, i15) ? this.mDividerVerticalWidth : 0;
            if ((this.mShowDividerVertical & 4) <= 0) {
                return i16;
            }
            i17 = this.mDividerVerticalWidth;
        } else {
            i16 = hasDividerBeforeChildAtAlongMainAxis(i14, i15) ? this.mDividerHorizontalHeight : 0;
            if ((this.mShowDividerHorizontal & 4) <= 0) {
                return i16;
            }
            i17 = this.mDividerHorizontalHeight;
        }
        return i16 + i17;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i14) {
        return getChildAt(i14);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        for (FlexLine flexLine : this.mFlexLines) {
            if (flexLine.getItemCountNotGone() != 0) {
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
        Iterator<FlexLine> it = this.mFlexLines.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public View getReorderedChildAt(int i14) {
        if (i14 < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i14 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i14]);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i14) {
        return getReorderedChildAt(i14);
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            FlexLine flexLine = this.mFlexLines.get(i15);
            if (hasDividerBeforeFlexLine(i15)) {
                i14 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            if (hasEndDividerAfterFlexLine(i15)) {
                i14 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            i14 += flexLine.mCrossSize;
        }
        return i14;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i14 = this.mFlexDirection;
        return i14 == 0 || i14 == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical == null && this.mDividerDrawableHorizontal == null) {
            return;
        }
        if (this.mShowDividerHorizontal == 0 && this.mShowDividerVertical == 0) {
            return;
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int layoutDirection = getLayoutDirection();
        int i14 = this.mFlexDirection;
        if (i14 == 0) {
            drawDividersHorizontal(canvas, layoutDirection == 1, this.mFlexWrap == 2);
            return;
        }
        if (i14 == 1) {
            drawDividersHorizontal(canvas, layoutDirection != 1, this.mFlexWrap == 2);
            return;
        }
        if (i14 == 2) {
            boolean z14 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z14 = !z14;
            }
            drawDividersVertical(canvas, z14, false);
            return;
        }
        if (i14 != 3) {
            return;
        }
        boolean z15 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z15 = !z15;
        }
        drawDividersVertical(canvas, z15, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        boolean z15;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int layoutDirection = getLayoutDirection();
        int i18 = this.mFlexDirection;
        if (i18 == 0) {
            layoutHorizontal(layoutDirection == 1, i14, i15, i16, i17);
            return;
        }
        if (i18 == 1) {
            layoutHorizontal(layoutDirection != 1, i14, i15, i16, i17);
            return;
        }
        if (i18 == 2) {
            z15 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z15 = !z15;
            }
            layoutVertical(z15, false, i14, i15, i16, i17);
            return;
        }
        if (i18 != 3) {
            e.i(this.mFlexDirection, "Invalid flex direction is set: ");
            return;
        }
        z15 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z15 = !z15;
        }
        layoutVertical(z15, true, i14, i15, i16, i17);
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        if (this.mFlexboxHelper.isOrderChangedFromLastMeasurement(this.mOrderCache)) {
            this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(this.mOrderCache);
        }
        int i16 = this.mFlexDirection;
        if (i16 == 0 || i16 == 1) {
            measureHorizontal(i14, i15);
        } else if (i16 == 2 || i16 == 3) {
            measureVertical(i14, i15);
        } else {
            e.i(this.mFlexDirection, "Invalid value for the flex direction is set: ");
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view2, int i14, int i15, FlexLine flexLine) {
        if (hasDividerBeforeChildAtAlongMainAxis(i14, i15)) {
            if (isMainAxisDirectionHorizontal()) {
                int i16 = flexLine.mMainSize;
                int i17 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i16 + i17;
                flexLine.mDividerLengthInMainSize += i17;
                return;
            }
            int i18 = flexLine.mMainSize;
            int i19 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i18 + i19;
            flexLine.mDividerLengthInMainSize += i19;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                int i14 = flexLine.mMainSize;
                int i15 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i14 + i15;
                flexLine.mDividerLengthInMainSize += i15;
                return;
            }
            return;
        }
        if ((this.mShowDividerHorizontal & 4) > 0) {
            int i16 = flexLine.mMainSize;
            int i17 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i16 + i17;
            flexLine.mDividerLengthInMainSize += i17;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i14) {
        if (this.mAlignContent != i14) {
            this.mAlignContent = i14;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i14) {
        if (this.mAlignItems != i14) {
            this.mAlignItems = i14;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.mDividerDrawableHorizontal) {
            return;
        }
        this.mDividerDrawableHorizontal = drawable;
        if (drawable != null) {
            this.mDividerHorizontalHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerHorizontalHeight = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.mDividerDrawableVertical) {
            return;
        }
        this.mDividerDrawableVertical = drawable;
        if (drawable != null) {
            this.mDividerVerticalWidth = drawable.getIntrinsicWidth();
        } else {
            this.mDividerVerticalWidth = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i14) {
        if (this.mFlexDirection != i14) {
            this.mFlexDirection = i14;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i14) {
        if (this.mFlexWrap != i14) {
            this.mFlexWrap = i14;
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

    public void setShowDivider(int i14) {
        setShowDividerVertical(i14);
        setShowDividerHorizontal(i14);
    }

    public void setShowDividerHorizontal(int i14) {
        if (i14 != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = i14;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i14) {
        if (i14 != this.mShowDividerVertical) {
            this.mShowDividerVertical = i14;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i14, View view2) {
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.1
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
        private int mOrder;
        private boolean mWrapBefore;

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            this.mOrder = parcel.readInt();
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
            return this.mOrder;
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
            this.mOrder = i14;
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
            parcel.writeInt(this.mOrder);
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

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            this.mOrder = layoutParams.mOrder;
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

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(int i14, int i15) {
            super(new ViewGroup.LayoutParams(i14, i15));
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout_Layout);
            this.mOrder = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.mFlexGrow = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.mFlexShrink = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.mAlignSelf = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.mFlexBasisPercent = typedArrayObtainStyledAttributes.getFraction(R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxWidth, FlexItem.MAX_SIZE);
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxHeight, FlexItem.MAX_SIZE);
            this.mWrapBefore = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }
}
