package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class AutoNextLineLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f11233c;
    private List<Integer> d;
    private List<List<View>> e;
    private int g;

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f11233c = new ArrayList();
        this.f11231a = (int) Utils.convertDpToPixel(8.0f);
        this.g = (int) Utils.convertDpToPixel(4.0f);
        this.d = new ArrayList();
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList();
        this.f11233c = new ArrayList();
        this.f11231a = (int) Utils.convertDpToPixel(8.0f);
        this.g = (int) Utils.convertDpToPixel(4.0f);
        this.d = new ArrayList();
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new ArrayList();
        this.f11233c = new ArrayList();
        this.f11231a = (int) Utils.convertDpToPixel(8.0f);
        this.g = (int) Utils.convertDpToPixel(4.0f);
        this.d = new ArrayList();
    }

    public int getLineHeight() {
        return this.f11232b;
    }

    public List<List<View>> getLines() {
        return this.e;
    }

    public List<Integer> getLineHeights() {
        return this.f11233c;
    }

    public int getHorizontalSpacing() {
        return this.f11231a;
    }

    public int getVerticalSpacing() {
        return this.g;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.e.clear();
        this.f11233c.clear();
        this.d.clear();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int size3 = 0;
        int iMax = 0;
        int i4 = 0;
        for (int childCount = getChildCount(); i3 < childCount; childCount = childCount) {
            View childAt = getChildAt(i3);
            int visibility = childAt.getVisibility();
            if (visibility != 8 && visibility != 4) {
                int i5 = i3 == 0 ? 0 : this.f11231a;
                measureChild(childAt, i, i2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin + i5;
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.topMargin;
                int i7 = layoutParams.bottomMargin;
                if (i4 + measuredWidth > (size - getPaddingLeft()) - getPaddingRight()) {
                    size3 += iMax;
                    this.e.add(arrayList);
                    this.d.add(Integer.valueOf(i4));
                    this.f11233c.add(Integer.valueOf(iMax));
                    arrayList = new ArrayList();
                    iMax = 0;
                    i4 = 0;
                }
                arrayList.add(childAt);
                i4 += measuredWidth;
                iMax = Math.max(iMax, measuredHeight + i6 + i7);
            }
            i3++;
            size2 = size2;
        }
        int i8 = size2;
        if (!arrayList.isEmpty()) {
            this.e.add(arrayList);
            this.f11233c.add(Integer.valueOf(iMax));
            size3 += iMax;
            this.d.add(Integer.valueOf(i4));
        }
        if (this.e.size() > 1) {
            size3 += (this.e.size() - 1) * this.g;
        }
        if (mode != 1073741824) {
            size = size + getPaddingLeft() + getPaddingRight();
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i8 : size3 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int iAbs = Math.abs(i3 - i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = 0;
        while (i5 < this.e.size()) {
            List<View> list = this.e.get(i5);
            int iIntValue = this.f11233c.get(i5).intValue();
            int paddingLeft2 = getPaddingLeft();
            int iIntValue2 = (((iAbs - paddingLeft) - paddingRight) - (this.d.get(i5).intValue() - ((list.size() - 1) * this.f11231a))) / (list.size() + 1);
            int i6 = this.f11231a;
            int iMax = iIntValue2 > i6 ? paddingLeft2 + iIntValue2 : paddingLeft2 + i6;
            for (View view : list) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int i7 = layoutParams.leftMargin + iMax;
                int i8 = layoutParams.topMargin + paddingTop;
                view.layout(i7, i8, i7 + measuredWidth, measuredHeight + i8);
                iMax += measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin + Math.max(iIntValue2, this.f11231a);
                iAbs = iAbs;
            }
            paddingTop += iIntValue + this.g;
            i5++;
            iAbs = iAbs;
        }
    }
}
