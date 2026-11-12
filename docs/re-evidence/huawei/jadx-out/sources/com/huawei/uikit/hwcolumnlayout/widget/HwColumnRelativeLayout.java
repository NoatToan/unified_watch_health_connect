package com.huawei.uikit.hwcolumnlayout.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.uikit.hwcolumnlayout.R;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;

/* JADX INFO: loaded from: classes20.dex */
public class HwColumnRelativeLayout extends RelativeLayout implements HwColumnLayoutable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwColumnSystem f29340c;
    private int d;
    private int e;
    private int f;
    private float i;
    private int j;

    public HwColumnRelativeLayout(Context context) {
        this(context, null);
    }

    private void c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            viewGroup.requestLayout();
            viewGroup.invalidate();
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt);
            } else if (childAt != null) {
                childAt.requestLayout();
                childAt.invalidate();
            }
        }
    }

    private void d(Context context) {
        this.f29340c.d(this.d);
        this.f29340c.d(context, this.j, this.f, this.i);
        this.e = this.f29340c.g();
        this.f29339b = this.f29340c.e();
    }

    private boolean d(int i, int i2, float f) {
        return i > 0 && i2 > 0 && f > 0.0f;
    }

    private void e(Context context) {
        this.f29340c.d(this.d, false);
        this.f29340c.a(context, true);
        this.e = this.f29340c.g();
        this.f29339b = this.f29340c.e();
    }

    @Override // com.huawei.uikit.hwcolumnlayout.widget.HwColumnLayoutable
    public void configureColumn(int i, int i2, float f) {
        if (!d(i, i2, f)) {
            if (this.f29338a) {
                this.f29338a = false;
                b(getContext());
                c(this);
                return;
            }
            return;
        }
        this.f29338a = true;
        this.j = i;
        this.f = i2;
        this.i = f;
        b(getContext());
        c(this);
    }

    @Override // com.huawei.uikit.hwcolumnlayout.widget.HwColumnLayoutable
    public int getColumnType() {
        int i = this.d;
        if (i == 2) {
            return 1;
        }
        if (i == 18) {
            return 17;
        }
        return i;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f29340c.a(true);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int iA;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.d;
        if (i4 == 17) {
            iA = a(i, i2, size);
            if (iA > 0) {
                i = View.MeasureSpec.makeMeasureSpec(iA, mode);
            }
        } else if (i4 == 18 || i4 == 0) {
            b(getContext());
            i3 = this.e;
            if (i3 < size && i3 > 0) {
                i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            }
        } else if (i4 == 1) {
            iA = a(i, i2, size);
            if (iA > 0) {
                i = View.MeasureSpec.makeMeasureSpec(iA, mode);
            }
        } else if (i4 == 2 || i4 == 3 || i4 == 4) {
            b(getContext());
            i3 = this.e;
            if (i3 < size) {
                i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // com.huawei.uikit.hwcolumnlayout.widget.HwColumnLayoutable
    public void setColumnType(int i) {
        this.d = i;
        c(this);
    }

    public HwColumnRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HwColumnRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.f29339b = Integer.MIN_VALUE;
        this.f29338a = false;
        HwColumnSystem hwColumnSystem = new HwColumnSystem(context);
        this.f29340c = hwColumnSystem;
        hwColumnSystem.a(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwColumnRelativeLayout);
        this.d = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwColumnFrameLayout_hwColumnType, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b(Context context) {
        if (!this.f29338a) {
            e(getContext());
        } else {
            Log.d("HwColumnFrameLayout", "mIsColumnConfigured is false.");
            d(getContext());
        }
        this.f29340c.a(false);
    }

    private int a(int i, int i2, int i3) {
        int childCount = getChildCount();
        int i4 = 0;
        if (childCount == 1) {
            b(getContext());
            View childAt = getChildAt(0);
            childAt.setMinimumWidth(this.e);
            measureChild(childAt, i, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int i5 = this.e;
            if ((measuredWidth < i5 && i5 < i3) || (measuredWidth > (i5 = this.f29339b) && i5 < i3)) {
                i4 = i5;
            } else if (measuredWidth < i3) {
                i4 = measuredWidth;
            } else {
                Log.e("HwColumnFrameLayout", "invalid width");
            }
        }
        if (childCount == 2) {
            if (this.d == 1) {
                this.d = 2;
            } else {
                this.d = 18;
            }
            b(getContext());
            int i6 = this.e;
            if (i6 < i3) {
                return i6;
            }
        }
        return i4;
    }
}
