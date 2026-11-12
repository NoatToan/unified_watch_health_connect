package com.huawei.openalliance.ad.views.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.openalliance.ad.utils.as;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class FlowLayoutView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f21198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21200c;
    private int d;
    private int e;
    private final List<e> f;

    public void setDefaultDisplayMode(int i) {
        this.d = i;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        b();
        a();
        int childCount = getChildCount();
        int iA = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, mode == 1073741824 ? Integer.MIN_VALUE : mode), View.MeasureSpec.makeMeasureSpec((size2 - paddingBottom) - paddingTop, mode2 != 1073741824 ? mode2 : Integer.MIN_VALUE));
            int measuredWidth = childAt.getMeasuredWidth();
            if (this.e + measuredWidth > size) {
                c();
            }
            int i4 = this.e + this.f21199b + measuredWidth;
            this.e = i4;
            this.f21198a.a(i4);
            this.f21198a.a(childAt);
        }
        e eVar = this.f21198a;
        if (eVar != null && !this.f.contains(eVar)) {
            c();
        }
        Iterator<e> it = this.f.iterator();
        while (it.hasNext()) {
            iA += it.next().a();
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), resolveSize(iA + (this.f21200c * (this.f.size() - 1)) + getPaddingBottom() + getPaddingTop(), i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth();
        int iA = paddingTop;
        for (e eVar : this.f) {
            eVar.a(this.d, getLeft(), paddingLeft, iA, (measuredWidth - paddingLeft) - paddingTop, this.f21199b);
            iA = this.f21200c + eVar.a() + iA;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    private void c() {
        int i = this.e;
        if (i > 0) {
            this.f21198a.a(i - this.f21199b);
        }
        e eVar = this.f21198a;
        if (eVar != null) {
            this.f.add(eVar);
        }
        this.e = 0;
        this.f21198a = new e();
    }

    private void b() {
        this.f.clear();
        this.f21198a = new e();
        this.e = 0;
    }

    private void a() {
        if (this.f21198a == null) {
            this.f21198a = new e();
        }
    }

    public FlowLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 1;
        this.f21199b = as.a(context, 8.0f);
        this.f21200c = as.a(context, 8.0f);
        this.f = new ArrayList();
        this.e = 0;
    }

    public FlowLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayoutView(Context context) {
        this(context, null);
    }
}
