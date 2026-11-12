package com.huawei.uikit.hwcolumnlayout.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.uikit.hwcolumnlayout.R;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;

/* JADX INFO: loaded from: classes44.dex */
public class HwColumnFrameLayout extends FrameLayout implements HwColumnLayoutable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29334c;
    private int d;
    private int e;
    private HwColumnSystem f;
    private boolean i;
    private float j;

    public HwColumnFrameLayout(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f.d(this.f29332a);
        this.f.d(context, this.e, this.f29333b, this.j);
        this.d = this.f.g();
        this.f29334c = this.f.e();
    }

    private void b(Context context) {
        this.f.d(this.f29332a, false);
        this.f.a(context, true);
        this.d = this.f.g();
        this.f29334c = this.f.e();
    }

    private boolean b(int i, int i2, float f) {
        return i > 0 && i2 > 0 && Float.compare(f, 0.0f) > 0;
    }

    @Override // com.huawei.uikit.hwcolumnlayout.widget.HwColumnLayoutable
    public void configureColumn(int i, int i2, float f) {
        if (!b(i, i2, f)) {
            if (this.i) {
                this.i = false;
                c(getContext());
                b(this);
                return;
            }
            return;
        }
        this.i = true;
        this.e = i;
        this.f29333b = i2;
        this.j = f;
        c(getContext());
        b(this);
    }

    @Override // com.huawei.uikit.hwcolumnlayout.widget.HwColumnLayoutable
    public int getColumnType() {
        int i = this.f29332a;
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
        this.f.a(true);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int iE;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.f29332a;
        if (i4 == 17) {
            iE = e(i, i2, size);
            if (iE > 0) {
                i = View.MeasureSpec.makeMeasureSpec(iE, mode);
            }
        } else if (i4 == 18 || i4 == 0) {
            c(getContext());
            i3 = this.d;
            if (i3 < size && i3 > 0) {
                i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            }
        } else if (i4 == 1) {
            iE = e(i, i2, size);
            if (iE > 0) {
                i = View.MeasureSpec.makeMeasureSpec(iE, mode);
            }
        } else if (i4 == 2 || i4 == 3 || i4 == 4) {
            c(getContext());
            i3 = this.d;
            if (i3 < size) {
                i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // com.huawei.uikit.hwcolumnlayout.widget.HwColumnLayoutable
    public void setColumnType(int i) {
        this.f29332a = i;
        b(this);
    }

    public HwColumnFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            viewGroup.requestLayout();
            viewGroup.invalidate();
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt);
            } else if (childAt != null) {
                childAt.requestLayout();
                childAt.invalidate();
            }
        }
    }

    public HwColumnFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = Integer.MIN_VALUE;
        this.f29332a = Integer.MIN_VALUE;
        this.f29334c = Integer.MIN_VALUE;
        this.i = false;
        HwColumnSystem hwColumnSystem = new HwColumnSystem(context);
        this.f = hwColumnSystem;
        hwColumnSystem.a(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwColumnFrameLayout);
        this.f29332a = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwColumnFrameLayout_hwColumnType, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(Context context) {
        if (!this.i) {
            b(getContext());
        } else {
            Log.i("HwColumnFrameLayout", "mIsColumnConfigured is false");
            a(getContext());
        }
        this.f.a(false);
    }

    private int e(int i, int i2, int i3) {
        int childCount = getChildCount();
        int i4 = 0;
        if (childCount == 1) {
            c(getContext());
            View childAt = getChildAt(0);
            childAt.setMinimumWidth(this.d);
            measureChild(childAt, i, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int i5 = this.d;
            if ((measuredWidth < i5 && i5 < i3) || (measuredWidth > (i5 = this.f29334c) && i5 < i3)) {
                i4 = i5;
            } else if (measuredWidth < i3) {
                i4 = measuredWidth;
            } else {
                Log.e("HwColumnFrameLayout", "invalid width");
            }
        }
        if (childCount == 2) {
            if (this.f29332a == 1) {
                this.f29332a = 2;
            } else {
                this.f29332a = 18;
            }
            c(getContext());
            int i6 = this.d;
            if (i6 < i3) {
                return i6;
            }
        }
        return i4;
    }
}
