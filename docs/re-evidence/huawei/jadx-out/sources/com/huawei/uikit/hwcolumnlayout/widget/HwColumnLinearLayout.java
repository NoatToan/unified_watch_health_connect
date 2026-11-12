package com.huawei.uikit.hwcolumnlayout.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.uikit.hwcolumnlayout.R;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import defpackage.xft;

/* JADX INFO: loaded from: classes20.dex */
public class HwColumnLinearLayout extends LinearLayout implements HwColumnLayoutable {
    private static final int g = 1;
    private static final int h = Integer.MIN_VALUE;
    private static final int i = 1;
    private static final int j = 17;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwColumnSystem f29336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29337c;
    private int d;
    private int e;
    private float f;

    public HwColumnLinearLayout(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        if (this.f29337c) {
            b(getContext());
        } else {
            c(getContext());
        }
        this.f29336b.a(false);
    }

    private boolean a(int i2, int i3, float f) {
        return i2 > 0 && i3 > 0 && f > 0.0f;
    }

    private void b(Context context) {
        this.f29336b.d(this.f29335a);
        this.f29336b.d(context, this.d, this.e, this.f);
    }

    private void c(Context context) {
        this.f29336b.d(this.f29335a, false);
        this.f29336b.a(context, true);
    }

    public static HwColumnLinearLayout instantiate(Context context) {
        Object objC = xft.c(context, xft.b(context, HwColumnLinearLayout.class, xft.d(context, 1, 1)), HwColumnLinearLayout.class);
        if (objC instanceof HwColumnLinearLayout) {
            return (HwColumnLinearLayout) objC;
        }
        return null;
    }

    @Override // com.huawei.uikit.hwcolumnlayout.widget.HwColumnLayoutable
    public void configureColumn(int i2, int i3, float f) {
        if (!a(i2, i3, f)) {
            if (this.f29337c) {
                this.f29337c = false;
                a(getContext());
                a(this);
                return;
            }
            return;
        }
        this.f29337c = true;
        this.d = i2;
        this.e = i3;
        this.f = f;
        a(getContext());
        a(this);
    }

    @Override // com.huawei.uikit.hwcolumnlayout.widget.HwColumnLayoutable
    public int getColumnType() {
        int i2 = this.f29335a;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 18) {
            return 17;
        }
        return i2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f29336b.a(true);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        b();
        if (this.f29335a == Integer.MIN_VALUE) {
            super.onMeasure(i2, i3);
            return;
        }
        a(getContext());
        int i4 = this.f29335a;
        if (i4 == 1 || i4 == 17) {
            a();
        }
        int size = View.MeasureSpec.getSize(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(a(size), View.MeasureSpec.getMode(i2)), i3);
    }

    @Override // com.huawei.uikit.hwcolumnlayout.widget.HwColumnLayoutable
    public void setColumnType(int i2) {
        this.f29335a = i2;
        a(this);
    }

    public HwColumnLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HwColumnLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f29337c = false;
        HwColumnSystem hwColumnSystem = new HwColumnSystem(context);
        this.f29336b = hwColumnSystem;
        hwColumnSystem.a(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwColumnLinearLayout);
        this.f29335a = typedArrayObtainStyledAttributes.getInt(R.styleable.HwColumnLinearLayout_hwColumnType, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b() {
        int childCount = getChildCount();
        int i2 = this.f29335a;
        if (i2 == 1) {
            if (childCount > 1) {
                this.f29335a = 2;
                return;
            } else if (childCount == 1) {
                this.f29335a = 1;
                return;
            } else {
                this.f29335a = Integer.MIN_VALUE;
                return;
            }
        }
        if (i2 == 17) {
            if (childCount > 1) {
                this.f29335a = 18;
            } else if (childCount == 1) {
                this.f29335a = 17;
            } else {
                this.f29335a = Integer.MIN_VALUE;
            }
        }
    }

    private void a() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setMinimumWidth(this.f29336b.i());
        }
    }

    private int a(int i2) {
        int iE = this.f29336b.e();
        return (iE < 0 || iE > i2) ? i2 : iE;
    }

    private void a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            viewGroup.requestLayout();
            viewGroup.invalidate();
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            } else if (childAt != null) {
                childAt.requestLayout();
                childAt.invalidate();
            }
        }
    }
}
