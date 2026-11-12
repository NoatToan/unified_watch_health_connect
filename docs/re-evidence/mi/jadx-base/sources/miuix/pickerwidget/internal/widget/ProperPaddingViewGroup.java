package miuix.pickerwidget.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dyq;
import defpackage.l5j;

/* JADX INFO: loaded from: classes3.dex */
public class ProperPaddingViewGroup extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26704b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f26705k;

    public ProperPaddingViewGroup(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 1) {
            throw new IllegalStateException("Only one child view can be added into the ProperPaddingViewGroup!");
        }
        this.f26705k = getChildAt(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = dyq.e(this) ? this.j : this.i;
        this.f26705k.layout(i5, 0, this.f26705k.getMeasuredWidth() + i5, this.f26705k.getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = size;
        float f2 = this.f26703a;
        float f3 = f / f2;
        if (this.f26704b) {
            this.i = this.g;
            this.j = this.h;
        } else if (f3 <= 340.0f) {
            int i3 = ((int) (f - (f2 * 290.0f))) / 2;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = i3 / 2;
            this.i = this.e + i4;
            this.j = this.f + i4;
        } else {
            this.i = this.c;
            this.j = this.d;
        }
        this.f26705k.measure(ViewGroup.getChildMeasureSpec(i, this.i + this.j, this.f26705k.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, 0, this.f26705k.getLayoutParams().height));
        setMeasuredDimension(size, this.f26705k.getMeasuredHeight());
    }

    public ProperPaddingViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProperPaddingViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26704b = false;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        TypedArray typedArrayObtainStyledAttributes = null;
        this.f26705k = null;
        this.f26703a = context.getResources().getDisplayMetrics().density;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l5j.j0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.k0, 0);
            this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.m0, dimensionPixelSize);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.l0, dimensionPixelSize);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.n0, 0);
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.p0, dimensionPixelSize2);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(l5j.o0, dimensionPixelSize2);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }
}
