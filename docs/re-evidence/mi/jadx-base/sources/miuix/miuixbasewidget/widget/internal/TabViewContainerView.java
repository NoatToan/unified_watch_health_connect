package miuix.miuixbasewidget.widget.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.dyq;
import defpackage.emi;
import defpackage.s6g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TabViewContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26682b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<View> f26683k;
    public final List<View> l;

    public TabViewContainerView(Context context) {
        this(context, null);
    }

    public final boolean a(View view) {
        return view.getVisibility() == 8;
    }

    public final void b(int i, int i2, int i3) {
        this.f26683k.clear();
        this.l.clear();
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).setMinimumWidth(0);
        }
        super.onMeasure(i, i2);
        int paddingStart = getPaddingStart() + getPaddingEnd();
        int i6 = i3 > 1 ? (i3 - 1) * this.f26681a : 0;
        int size = View.MeasureSpec.getSize(i);
        int i7 = (size - paddingStart) - i6;
        int i8 = i7 / i3;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            childAt.setMinimumWidth(0);
            if (!a(childAt)) {
                int measuredWidth = childAt.getMeasuredWidth();
                i9 += measuredWidth;
                if (measuredWidth > i8) {
                    this.f26683k.add(childAt);
                    i11 += measuredWidth;
                } else {
                    this.l.add(childAt);
                    i10 += measuredWidth;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        }
        int measuredHeight = getMeasuredHeight() + this.f26682b + this.c;
        if (i9 > i7) {
            setMeasuredDimension(i9 + i6 + paddingStart, measuredHeight);
            return;
        }
        if (this.f26683k.isEmpty()) {
            while (i4 < childCount) {
                View childAt2 = getChildAt(i4);
                if (!a(childAt2)) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824));
                }
                i4++;
            }
        } else if (i10 > 0) {
            int size2 = this.l.size();
            int i13 = i7 - i11;
            while (i4 < size2) {
                View view = this.l.get(i4);
                int measuredWidth2 = (int) (((view.getMeasuredWidth() * 1.0f) / i10) * i13);
                if (!a(view)) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                }
                i4++;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final boolean c(int i, int i2, int i3) {
        int paddingStart = getPaddingStart() + getPaddingEnd();
        int i4 = i3 > 1 ? (i3 - 1) * this.f26681a : 0;
        int size = View.MeasureSpec.getSize(i);
        int i5 = (size - paddingStart) - i4;
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (i3 <= 2) {
                childAt.setMinimumWidth(this.e);
                i6 = this.e;
            } else if (i3 == 3) {
                childAt.setMinimumWidth(this.f);
                i6 = this.f;
            } else {
                childAt.setMinimumWidth(this.g);
                i6 = this.g;
            }
        }
        super.onMeasure(i, i2);
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (!a(childAt2)) {
                int measuredWidth = childAt2.getMeasuredWidth();
                i8 += measuredWidth;
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        }
        this.i = i4 + i8;
        setMeasuredDimension(size, getMeasuredHeight() + this.f26682b + this.c);
        return i8 >= i5 - i6;
    }

    public final void d(int i, int i2, int i3) {
        int i4 = i3 > 1 ? (i3 - 1) * this.f26681a : 0;
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (!a(childAt)) {
                int measuredWidth = childAt.getMeasuredWidth();
                i5 += measuredWidth;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        }
        setMeasuredDimension(getPaddingStart() + getPaddingEnd() + i5 + i4, getMeasuredHeight() + this.f26682b + this.c);
    }

    public final void e() {
        Context context = getContext();
        Resources resources = getResources();
        this.f26681a = resources.getDimensionPixelSize(emi.m);
        this.f26682b = resources.getDimensionPixelSize(emi.o);
        this.c = resources.getDimensionPixelSize(emi.n);
        this.e = s6g.d(context, 220.0f);
        this.f = s6g.d(context, 180.0f);
        this.g = s6g.d(context, 150.0f);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.densityDpi;
        if (i != this.d) {
            this.d = i;
            e();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int childCount = getChildCount();
        int i6 = this.f26682b;
        int paddingStart = this.h ? getPaddingStart() + ((i5 - this.i) / 2) : getPaddingStart();
        int i7 = paddingStart;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!a(childAt)) {
                int measuredWidth = childAt.getMeasuredWidth() + i7;
                dyq.h(this, childAt, i7, i6, measuredWidth, i6 + childAt.getMeasuredHeight());
                i7 = measuredWidth + this.f26681a;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.h = false;
        this.i = 0;
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            if (!a(getChildAt(i4))) {
                i3++;
            }
        }
        if (i3 <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i5 = this.j;
        if (i5 == 2) {
            d(i, i2, i3);
            return;
        }
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("Unexpected layout mode: " + this.j);
            }
            if (!c(i, i2, i3)) {
                this.h = true;
                return;
            }
        }
        b(i, i2, i3);
    }

    public void setTabViewLayoutMode(int i) {
        if (this.j != i) {
            this.j = i;
            requestLayout();
        }
    }

    public TabViewContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabViewContainerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TabViewContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = false;
        this.j = 0;
        this.f26683k = new ArrayList();
        this.l = new ArrayList();
        e();
    }
}
