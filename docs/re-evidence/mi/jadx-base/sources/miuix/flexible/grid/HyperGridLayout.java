package miuix.flexible.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.boc;
import defpackage.c77;
import defpackage.d77;
import defpackage.dyq;
import defpackage.e77;
import defpackage.i5j;
import defpackage.sw9;

/* JADX INFO: loaded from: classes3.dex */
public class HyperGridLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boc f26625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26626b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26627k;
    public int l;
    public int m;
    public boolean n;

    public HyperGridLayout(Context context) {
        super(context);
        this.f26626b = 0;
        this.e = 0.0f;
        this.f = Float.MAX_VALUE;
        this.j = Float.MAX_VALUE;
        this.f26627k = 1;
        this.l = 1;
        this.m = 0;
        this.n = false;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i5j.W);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i5j.c0) {
                    this.f26626b = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i5j.X) {
                    this.m = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == i5j.b0) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == i5j.g0) {
                    this.e = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == i5j.e0) {
                    this.f = typedArrayObtainStyledAttributes.getDimension(index, Float.MAX_VALUE);
                } else if (index == i5j.h0) {
                    this.g = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == i5j.Y) {
                    this.h = typedArrayObtainStyledAttributes.getDimension(index, 1.0f);
                } else if (index == i5j.f0) {
                    this.i = typedArrayObtainStyledAttributes.getDimension(index, 1.0f);
                } else if (index == i5j.d0) {
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, Float.MAX_VALUE);
                } else if (index == i5j.Z) {
                    this.f26627k = typedArrayObtainStyledAttributes.getInt(index, 1);
                } else if (index == i5j.a0) {
                    this.l = typedArrayObtainStyledAttributes.getInt(index, 1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void b(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i2, 0), 0, layoutParams.height));
        }
    }

    public void c(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -1 || view.getMeasuredHeight() == i2) {
            return;
        }
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), 0, layoutParams.height));
    }

    public final void d(boc bocVar) {
        if (bocVar != null) {
            bocVar.b();
        }
    }

    public void e(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                c(childAt, i, i2);
            }
        }
    }

    public float getCellWidth() {
        return this.h;
    }

    public int getColumnCount() {
        return this.f26627k;
    }

    public int getColumnMultiple() {
        return this.l;
    }

    public float getColumnSpacing() {
        return this.d;
    }

    public boolean getDisallowAutoColumnCount() {
        return this.n;
    }

    public int getGravity() {
        return this.m;
    }

    public float getMaxCellWidth() {
        return this.j;
    }

    public float getMaxColumnSpacing() {
        return this.f;
    }

    public float getMinCellWidth() {
        return this.i;
    }

    public float getMinColumnSpacing() {
        return this.e;
    }

    public int getMode() {
        return this.f26626b;
    }

    public float getRowSpacing() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int iMax = Math.max(1, this.f26625a.f4419a);
        float f = iMax;
        int iCeil = (int) Math.ceil(childCount / f);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int i7 = this.m;
        int i8 = i7 & 112;
        int i9 = i7 & 7;
        if (i8 == 16) {
            float f2 = this.g;
            paddingTop = getPaddingTop() + ((((i6 - getPaddingTop()) - getPaddingBottom()) - ((int) ((iCeil * (this.c + f2)) - (iCeil > 0 ? f2 : 0.0f)))) / 2);
        } else if (i8 == 80) {
            float f3 = this.g;
            paddingTop = (i6 - ((int) ((iCeil * (this.c + f3)) - (iCeil > 0 ? f3 : 0.0f)))) - getPaddingBottom();
        }
        if (i9 == 1) {
            boc bocVar = this.f26625a;
            float f4 = bocVar.f4420b;
            paddingStart = getPaddingStart() + ((((i5 - getPaddingStart()) - getPaddingEnd()) - ((int) ((f * (bocVar.c + f4)) - f4))) / 2);
        } else if (i9 == 5) {
            boc bocVar2 = this.f26625a;
            float f5 = bocVar2.f4420b;
            paddingStart = (i5 - ((int) ((f * (bocVar2.c + f5)) - f5))) - getPaddingEnd();
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                boc bocVar3 = this.f26625a;
                float f6 = bocVar3.f4420b;
                float f7 = bocVar3.c;
                int measuredWidth = (int) (paddingStart + ((i10 % iMax) * (f6 + f7)) + ((f7 - childAt.getMeasuredWidth()) / 2.0f));
                float f8 = this.g;
                float f9 = this.c;
                int measuredHeight = (int) (paddingTop + ((i10 / iMax) * (f8 + f9)) + ((f9 - childAt.getMeasuredHeight()) / 2.0f));
                dyq.h(this, childAt, measuredWidth, measuredHeight, measuredWidth + childAt.getMeasuredWidth(), measuredHeight + childAt.getMeasuredHeight());
                i10++;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boc bocVar;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        View.MeasureSpec.getMode(i);
        int mode = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            if (getChildAt(i4).getVisibility() != 8) {
                i3++;
            }
        }
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        if (!this.n || (bocVar = this.f26625a) == null) {
            int i5 = this.f26626b;
            if (i5 == 1) {
                d(this.f26625a);
                this.f26625a = d77.a(paddingStart, this.d, this.i, this.j, i3);
            } else if (i5 == 2) {
                d(this.f26625a);
                this.f26625a = c77.a(paddingStart, this.e, this.f, this.h, this.l);
            } else if (i5 == 4) {
                d(this.f26625a);
                this.f26625a = sw9.a(paddingStart, this.f26627k, this.d);
            } else {
                d(this.f26625a);
                this.f26625a = e77.a(paddingStart, this.d, this.i, this.j, this.l);
            }
        } else {
            d(bocVar);
            boc bocVar2 = this.f26625a;
            this.f26625a = sw9.a(paddingStart, bocVar2.f4419a, bocVar2.f4420b);
        }
        boc bocVar3 = this.f26625a;
        bocVar3.f4419a = Math.max(1, bocVar3.f4419a);
        boc bocVar4 = this.f26625a;
        bocVar4.c = Math.max(0.0f, bocVar4.c);
        boc bocVar5 = this.f26625a;
        bocVar5.f4420b = Math.max(0.0f, bocVar5.f4420b);
        this.c = 0.0f;
        int iMin = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                b(childAt, (int) Math.ceil(this.f26625a.c), size2);
                this.c = Math.max(this.c, childAt.getMeasuredHeight());
                iMin = Math.min(iMin, childAt.getMeasuredHeight());
            }
        }
        if (iMin != this.c) {
            e((int) Math.ceil(this.f26625a.c), (int) this.c);
        }
        int iCeil = (int) Math.ceil(((double) i3) / ((double) this.f26625a.f4419a));
        if (mode != 1073741824) {
            float f = this.c;
            float f2 = this.g;
            size2 = (int) (((iCeil * (f + f2)) - (iCeil > 0 ? f2 : 0.0f)) + getPaddingTop() + getPaddingBottom());
        }
        setMeasuredDimension(size, size2);
    }

    public void setCellWidth(float f) {
        this.h = f;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.f26627k = i;
        requestLayout();
    }

    public void setColumnMultiple(int i) {
        this.l = i;
        requestLayout();
    }

    public void setColumnSpacing(float f) {
        this.d = f;
        requestLayout();
    }

    public void setDisallowAutoColumnCount(boolean z) {
        this.n = z;
        if (z) {
            return;
        }
        requestLayout();
    }

    public void setGravity(int i) {
        this.m = i;
        requestLayout();
    }

    public void setMaxCellWidth(float f) {
        this.j = f;
        requestLayout();
    }

    public void setMaxColumnSpacing(float f) {
        this.f = f;
        requestLayout();
    }

    public void setMinCellWidth(float f) {
        this.i = f;
        requestLayout();
    }

    public void setMinColumnSpacing(float f) {
        this.e = f;
        requestLayout();
    }

    public void setMode(int i) {
        this.f26626b = i;
        requestLayout();
    }

    public void setRowSpacing(float f) {
        this.g = f;
        requestLayout();
    }

    public HyperGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26626b = 0;
        this.e = 0.0f;
        this.f = Float.MAX_VALUE;
        this.j = Float.MAX_VALUE;
        this.f26627k = 1;
        this.l = 1;
        this.m = 0;
        this.n = false;
        a(context, attributeSet);
    }

    public HyperGridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26626b = 0;
        this.e = 0.0f;
        this.f = Float.MAX_VALUE;
        this.j = Float.MAX_VALUE;
        this.f26627k = 1;
        this.l = 1;
        this.m = 0;
        this.n = false;
        a(context, attributeSet);
    }
}
