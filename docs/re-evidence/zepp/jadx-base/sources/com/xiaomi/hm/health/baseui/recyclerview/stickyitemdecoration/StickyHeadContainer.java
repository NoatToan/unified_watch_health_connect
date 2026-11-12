package com.xiaomi.hm.health.baseui.recyclerview.stickyitemdecoration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes19.dex */
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
        void onDataChange(int pos);
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    public StickyHeadContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new ViewGroup.MarginLayoutParams(p);
    }

    public int getChildHeight() {
        return getChildAt(0).getHeight();
    }

    public void onDataChange(int stickyHeadPosition) {
        DataCallback dataCallback = this.h;
        if (dataCallback != null && this.c != stickyHeadPosition) {
            dataCallback.onDataChange(stickyHeadPosition);
        }
        this.c = stickyHeadPosition;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.d = paddingLeft + marginLayoutParams.leftMargin;
        this.e = childAt.getMeasuredWidth() + this.d;
        this.f = paddingTop + marginLayoutParams.topMargin + this.a;
        int measuredHeight = childAt.getMeasuredHeight();
        int i = this.f;
        int i2 = measuredHeight + i;
        this.g = i2;
        childAt.layout(this.d, i, this.e, i2);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getChildCount() != 1) {
            throw new IllegalArgumentException("只允许容器添加1个子View！");
        }
        View childAt = getChildAt(0);
        measureChildWithMargins(childAt, widthMeasureSpec, 0, heightMeasureSpec, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSize(Math.max(paddingLeft, getSuggestedMinimumWidth()), widthMeasureSpec), ViewGroup.resolveSize(Math.max(paddingTop, getSuggestedMinimumHeight()), heightMeasureSpec));
    }

    public void reset() {
        this.c = Integer.MIN_VALUE;
    }

    public void scrollChild(int offset) {
        if (this.b != offset) {
            this.a = offset;
            ViewCompat.offsetTopAndBottom(getChildAt(0), this.a - this.b);
        }
        this.b = this.a;
    }

    public void setDataCallback(DataCallback dataCallback) {
        this.h = dataCallback;
    }

    public StickyHeadContainer(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    public StickyHeadContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        setOnClickListener(new a());
    }
}
