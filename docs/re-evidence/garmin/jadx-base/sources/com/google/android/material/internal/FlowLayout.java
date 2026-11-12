package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    private static int getMeasuredDimension(int i14, int i15, int i16) {
        if (i15 != Integer.MIN_VALUE) {
            return i15 != 1073741824 ? i16 : i14;
        }
        return Math.min(i16, i14);
    }

    private void loadFromAttributes(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getLineSpacing() {
        return this.lineSpacing;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(View view2) {
        Object tag = view2.getTag(R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        this.rowCount = 1;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        boolean z15 = getLayoutDirection() == 1;
        int paddingRight = z15 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z15 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i18 = (i16 - i14) - paddingLeft;
        int measuredWidth = paddingRight;
        int i19 = paddingTop;
        for (int i24 = 0; i24 < getChildCount(); i24++) {
            View childAt = getChildAt(i24);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                if (!this.singleLine && measuredWidth2 > i18) {
                    i19 = this.lineSpacing + paddingTop;
                    this.rowCount++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int i25 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i25;
                int measuredHeight = childAt.getMeasuredHeight() + i19;
                if (z15) {
                    childAt.layout(i18 - measuredWidth3, i19, (i18 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(i25, i19, measuredWidth3, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.itemSpacing;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        int i16;
        int i17;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i14);
        int mode = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i15);
        int mode2 = View.MeasureSpec.getMode(i15);
        int i18 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i18 - getPaddingRight();
        int i19 = paddingTop;
        int i24 = 0;
        for (int i25 = 0; i25 < getChildCount(); i25++) {
            View childAt = getChildAt(i25);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i14, i15);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i16 = marginLayoutParams.leftMargin;
                    i17 = marginLayoutParams.rightMargin;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                int i26 = paddingLeft2;
                if (childAt.getMeasuredWidth() + paddingLeft2 + i16 <= paddingRight || isSingleLine()) {
                    paddingLeft = i26;
                } else {
                    paddingLeft = getPaddingLeft();
                    i19 = this.lineSpacing + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i16;
                int measuredHeight = childAt.getMeasuredHeight() + i19;
                if (measuredWidth > i24) {
                    i24 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i16 + i17 + this.itemSpacing + paddingLeft;
                if (i25 == getChildCount() - 1) {
                    i24 += i17;
                }
                paddingLeft2 = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, getPaddingRight() + i24), getMeasuredDimension(size2, mode2, getPaddingBottom() + paddingTop));
    }

    public void setItemSpacing(int i14) {
        this.itemSpacing = i14;
    }

    public void setLineSpacing(int i14) {
        this.lineSpacing = i14;
    }

    public void setSingleLine(boolean z14) {
        this.singleLine = z14;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context) {
        this(context, null);
    }

    @TargetApi(21)
    public FlowLayout(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
