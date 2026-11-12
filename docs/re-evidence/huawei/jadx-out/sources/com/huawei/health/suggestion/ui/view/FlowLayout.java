package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnTextClickListener f10192c;
    private List<Integer> d;
    private int e;

    public interface OnTextClickListener {
        void onClick(String str);
    }

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlowLayout);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        View view;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = paddingLeft + paddingRight;
        int i6 = paddingTop;
        int i7 = i5;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    view = childAt;
                    measureChildWithMargins(childAt, i, 0, i2, i6);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i10 = marginLayoutParams.leftMargin;
                    int i11 = marginLayoutParams.rightMargin;
                    i4 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    i3 = i10 + i11;
                } else {
                    view = childAt;
                    measureChild(view, i, i2);
                    i3 = 0;
                    i4 = 0;
                }
                int measuredWidth = i3 + view.getMeasuredWidth();
                int measuredHeight = i4 + view.getMeasuredHeight();
                if (i7 + measuredWidth > size) {
                    i6 += i8 + this.e;
                    i7 = i5;
                    i8 = 0;
                }
                if (measuredHeight > i8) {
                    i8 = measuredHeight;
                }
                i7 += measuredWidth;
            }
        }
        if (mode != 1073741824) {
            size2 = i6 + i8 + paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = paddingRight + paddingLeft;
        this.d.clear();
        int i15 = paddingLeft;
        int i16 = i14;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < getChildCount()) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                i5 = i14;
            } else {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParamsD = d(childAt.getLayoutParams());
                int i20 = marginLayoutParamsD.leftMargin;
                int i21 = marginLayoutParamsD.rightMargin;
                int i22 = marginLayoutParamsD.topMargin;
                i5 = i14;
                int i23 = marginLayoutParamsD.bottomMargin;
                int i24 = marginLayoutParamsD.leftMargin;
                int i25 = marginLayoutParamsD.topMargin;
                int i26 = marginLayoutParamsD.leftMargin;
                int i27 = marginLayoutParamsD.topMargin;
                int i28 = i20 + i21 + measuredWidth;
                int i29 = i22 + i23 + measuredHeight;
                if (i16 + i28 > i3 - i) {
                    this.d.add(Integer.valueOf(i18));
                    paddingTop += i19 + this.e;
                    i6 = marginLayoutParamsD.leftMargin + paddingLeft;
                    i8 = marginLayoutParamsD.topMargin + paddingTop;
                    i12 = marginLayoutParamsD.leftMargin + paddingLeft + measuredWidth;
                    i10 = i5;
                    i13 = paddingLeft;
                    i7 = marginLayoutParamsD.topMargin + paddingTop + measuredHeight;
                    i11 = 0;
                    i9 = 0;
                } else {
                    i6 = i24 + i15;
                    int i30 = i27 + paddingTop + measuredHeight;
                    int i31 = i26 + i15 + measuredWidth;
                    int i32 = i15;
                    i7 = i30;
                    i8 = i25 + paddingTop;
                    i9 = i19;
                    i10 = i16;
                    i11 = i18;
                    i12 = i31;
                    i13 = i32;
                }
                childAt.layout(i6, i8, i12, i7);
                i18 = i11 + 1;
                if (i29 > i9) {
                    i9 = i29;
                }
                i16 = i10 + i28;
                i15 = i13 + i28;
                i19 = i9;
            }
            i17++;
            i14 = i5;
        }
        this.d.add(Integer.valueOf(i18));
    }

    private ViewGroup.MarginLayoutParams d(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        return marginLayoutParams;
    }

    public void d(Context context, List<String> list) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        removeAllViews();
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            HealthTextView healthTextViewC = c(context);
            final String str = list.get(i);
            healthTextViewC.setText(str);
            healthTextViewC.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.view.FlowLayout.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (FlowLayout.this.f10192c != null) {
                        FlowLayout.this.f10192c.onClick(str);
                    }
                }
            });
            addView(healthTextViewC);
        }
    }

    private HealthTextView c(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (layoutInflaterFrom.inflate(R.layout.sug_flow_item_search, (ViewGroup) this, false) instanceof HealthTextView) {
            return (HealthTextView) layoutInflaterFrom.inflate(R.layout.sug_flow_item_search, (ViewGroup) this, false);
        }
        return new HealthTextView(context);
    }

    public void setTextOnClickListener(OnTextClickListener onTextClickListener) {
        this.f10192c = onTextClickListener;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(super.generateDefaultLayoutParams());
    }
}
