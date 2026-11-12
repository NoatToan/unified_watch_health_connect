package com.oubowu.stickyitemdecoration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes18.dex */
public class StickyHeadContainer extends ViewGroup {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private DataCallback h;

    public interface DataCallback {
        void onDataChange(int i);
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public StickyHeadContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getChildHeight() {
        return getChildAt(0).getHeight();
    }

    public void onDataChange(int i) {
        DataCallback dataCallback = this.h;
        if (dataCallback != null && this.c != i) {
            dataCallback.onDataChange(i);
        }
        this.c = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.d = paddingLeft + marginLayoutParams.leftMargin;
        this.e = childAt.getMeasuredWidth() + this.d;
        this.f = paddingTop + marginLayoutParams.topMargin + this.a;
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = this.f;
        int i6 = measuredHeight + i5;
        this.g = i6;
        childAt.layout(this.d, i5, this.e, i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (getChildCount() != 1) {
            throw new IllegalArgumentException("只允许容器添加1个子View！");
        }
        View childAt = getChildAt(0);
        measureChildWithMargins(childAt, i, 0, i2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSize(Math.max(paddingLeft, getSuggestedMinimumWidth()), i), ViewGroup.resolveSize(Math.max(paddingTop, getSuggestedMinimumHeight()), i2));
    }

    public void reset() {
        this.c = Integer.MIN_VALUE;
    }

    public void scrollChild(int i) {
        if (this.b != i) {
            this.a = i;
            ViewCompat.offsetTopAndBottom(getChildAt(0), this.a - this.b);
        }
        this.b = this.a;
    }

    public void setDataCallback(DataCallback dataCallback) {
        this.h = dataCallback;
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        setOnClickListener(new a());
    }
}
