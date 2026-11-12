package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.ui.commonui.togglebutton.HealthToggleButton;
import defpackage.njy;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class FilterFlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10186c;
    private OnCheckChangeListener d;
    private CompoundButton.OnCheckedChangeListener e;
    private int g;
    private int h;

    public interface OnCheckChangeListener {
        void onCancelCheck(int i);

        void onChecked(int i);
    }

    public FilterFlowLayout(Context context) {
        this(context, null);
    }

    public FilterFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.suggestion.ui.view.FilterFlowLayout.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2;
                if (FilterFlowLayout.this.d != null && (compoundButton.getTag() instanceof String) && Pattern.compile("^[-\\+]?[\\d]*$").matcher((String) compoundButton.getTag()).matches()) {
                    try {
                        i2 = Integer.parseInt((String) compoundButton.getTag());
                    } catch (NumberFormatException unused) {
                        LogUtil.e("FilterFlowLayout", "onCheckedChanged NumberFormatException.");
                        i2 = 0;
                    }
                    if (z) {
                        FilterFlowLayout.this.d.onChecked(i2);
                        return;
                    } else {
                        FilterFlowLayout.this.d.onCancelCheck(i2);
                        return;
                    }
                }
                LogUtil.d("FilterFlowLayout", "tag is error");
            }
        };
        this.f10186c = false;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FilterFlowLayout, 0, 0);
        this.f10185b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FilterFlowLayout_lineSpacing, 0);
        this.f10184a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FilterFlowLayout_itemSpacing, 0);
        this.g = R.layout.item_popwindow_checkbox;
        typedArrayObtainStyledAttributes.recycle();
    }

    protected int getLineSpacing() {
        return this.f10185b;
    }

    protected void setLineSpacing(int i) {
        this.f10185b = i;
    }

    protected int getItemSpacing() {
        return this.f10184a;
    }

    protected void setItemSpacing(int i) {
        this.f10184a = i;
    }

    public boolean c() {
        return this.f10186c;
    }

    public void setSingleLine(boolean z) {
        this.f10186c = z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i9 = i6;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i10 = paddingLeft2;
                if (paddingLeft2 + i4 + childAt.getMeasuredWidth() <= i5 - paddingRight || c()) {
                    paddingLeft = i10;
                } else {
                    paddingLeft = getPaddingLeft();
                    i9 = paddingTop + this.f10185b;
                }
                int measuredWidth = paddingLeft + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i4 + i3 + childAt.getMeasuredWidth() + this.f10184a;
                if (i8 == getChildCount() - 1) {
                    i7 += i3;
                }
                paddingTop = i9 + measuredHeight;
                i6 = i9;
            }
        }
        setMeasuredDimension(c(size, mode, i7 + getPaddingRight()), c(size2, mode2, paddingTop + getPaddingBottom()));
    }

    private static int c(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.h = 0;
            return;
        }
        this.h = 1;
        boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingLeft;
        int measuredWidth = paddingRight;
        int i6 = paddingTop;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                    marginEnd = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth();
                if (!this.f10186c && measuredWidth + marginStart + measuredWidth2 > i5) {
                    paddingTop = this.f10185b + i6;
                    this.h++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.h - 1));
                int i8 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                if (z2) {
                    childAt.layout(i5 - measuredWidth3, paddingTop, (i5 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(i8, paddingTop, measuredWidth3, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.f10184a;
                i6 = measuredHeight;
            }
        }
    }

    protected int getRowCount() {
        return this.h;
    }

    public void d(Context context, List<Attribute> list) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        removeAllViews();
        if (njy.e(list)) {
            LogUtil.j("FilterFlowLayout", "showData() datas is null");
            return;
        }
        if (njy.b(list)) {
            for (Attribute attribute : list) {
                if (attribute != null) {
                    HealthToggleButton healthToggleButtonD = d(context);
                    healthToggleButtonD.setText(attribute.getName());
                    healthToggleButtonD.setTag(attribute.getId());
                    healthToggleButtonD.setOnCheckedChangeListener(this.e);
                    addView(healthToggleButtonD);
                }
            }
        }
    }

    public void c(Context context, List<Attribute> list, List<Integer> list2) {
        if (njy.e(list)) {
            LogUtil.j("FilterFlowLayout", "showData() datas is null");
            return;
        }
        if (context == null) {
            context = BaseApplication.getContext();
        }
        removeAllViews();
        for (Attribute attribute : list) {
            if (attribute != null) {
                HealthToggleButton healthToggleButtonD = d(context);
                healthToggleButtonD.setText(attribute.getName());
                healthToggleButtonD.setTag(attribute.getId());
                if (!njy.e(list2)) {
                    d(attribute, list2, healthToggleButtonD);
                }
                healthToggleButtonD.setOnCheckedChangeListener(this.e);
                addView(healthToggleButtonD);
            }
        }
    }

    public void setData(Context context, List<Attribute> list, List<Long> list2) {
        if (njy.e(list)) {
            LogUtil.j("FilterFlowLayout", "showData() datas is null");
            return;
        }
        if (context == null) {
            context = BaseApplication.getContext();
        }
        removeAllViews();
        for (Attribute attribute : list) {
            if (attribute != null) {
                HealthToggleButton healthToggleButtonD = d(context);
                healthToggleButtonD.setText(attribute.getName());
                healthToggleButtonD.setTag(attribute.getId());
                if (njy.b(list2)) {
                    Iterator<Long> it = list2.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(attribute.getId(), String.valueOf(it.next()))) {
                            healthToggleButtonD.setChecked(true);
                        }
                    }
                }
                healthToggleButtonD.setOnCheckedChangeListener(this.e);
                addView(healthToggleButtonD);
            }
        }
    }

    private void d(Attribute attribute, List<Integer> list, HealthToggleButton healthToggleButton) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(attribute.getId(), String.valueOf(it.next()))) {
                healthToggleButton.setChecked(true);
            }
        }
    }

    public void setToggleButtonSourceId(int i) {
        this.g = i;
    }

    private HealthToggleButton d(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (layoutInflaterFrom.inflate(this.g, (ViewGroup) this, false) instanceof HealthToggleButton) {
            return (HealthToggleButton) layoutInflaterFrom.inflate(this.g, (ViewGroup) this, false);
        }
        return new HealthToggleButton(context);
    }

    public void setOnCheckedChangeListener(OnCheckChangeListener onCheckChangeListener) {
        this.d = onCheckChangeListener;
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
