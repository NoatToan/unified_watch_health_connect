package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    public boolean A;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1919k;
    public float l;
    public ConstraintLayout m;
    public float n;
    public float o;
    public float p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f1920r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public View[] w;
    public float x;
    public float y;
    public boolean z;

    public Layer(Context context) {
        super(context);
        this.j = Float.NaN;
        this.f1919k = Float.NaN;
        this.l = Float.NaN;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.f1920r = Float.NaN;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = true;
        this.w = null;
        this.x = 0.0f;
        this.y = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.e = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.x1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.E1) {
                    this.z = true;
                } else if (index == u4j.L1) {
                    this.A = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = (ConstraintLayout) getParent();
        if (this.z || this.A) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f2000b; i++) {
                View viewById = this.m.getViewById(this.f1999a[i]);
                if (viewById != null) {
                    if (this.z) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.A && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void r(ConstraintLayout constraintLayout) {
        y();
        this.p = Float.NaN;
        this.q = Float.NaN;
        ConstraintWidget constraintWidgetB = ((ConstraintLayout.LayoutParams) getLayoutParams()).b();
        constraintWidgetB.o1(0);
        constraintWidgetB.P0(0);
        x();
        layout(((int) this.t) - getPaddingLeft(), ((int) this.u) - getPaddingTop(), ((int) this.f1920r) + getPaddingRight(), ((int) this.s) + getPaddingBottom());
        z();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.j = f;
        z();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f1919k = f;
        z();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.l = f;
        z();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.n = f;
        z();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.o = f;
        z();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.x = f;
        z();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.y = f;
        z();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void t(ConstraintLayout constraintLayout) {
        this.m = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.l = rotation;
        } else {
            if (Float.isNaN(this.l)) {
                return;
            }
            this.l = rotation;
        }
    }

    public void x() {
        if (this.m == null) {
            return;
        }
        if (this.v || Float.isNaN(this.p) || Float.isNaN(this.q)) {
            if (!Float.isNaN(this.j) && !Float.isNaN(this.f1919k)) {
                this.q = this.f1919k;
                this.p = this.j;
                return;
            }
            View[] viewArrN = n(this.m);
            int left = viewArrN[0].getLeft();
            int top = viewArrN[0].getTop();
            int right = viewArrN[0].getRight();
            int bottom = viewArrN[0].getBottom();
            for (int i = 0; i < this.f2000b; i++) {
                View view = viewArrN[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f1920r = right;
            this.s = bottom;
            this.t = left;
            this.u = top;
            if (Float.isNaN(this.j)) {
                this.p = (left + right) / 2;
            } else {
                this.p = this.j;
            }
            if (Float.isNaN(this.f1919k)) {
                this.q = (top + bottom) / 2;
            } else {
                this.q = this.f1919k;
            }
        }
    }

    public final void y() {
        int i;
        if (this.m == null || (i = this.f2000b) == 0) {
            return;
        }
        View[] viewArr = this.w;
        if (viewArr == null || viewArr.length != i) {
            this.w = new View[i];
        }
        for (int i2 = 0; i2 < this.f2000b; i2++) {
            this.w[i2] = this.m.getViewById(this.f1999a[i2]);
        }
    }

    public final void z() {
        if (this.m == null) {
            return;
        }
        if (this.w == null) {
            y();
        }
        x();
        double radians = Float.isNaN(this.l) ? 0.0d : Math.toRadians(this.l);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.n;
        float f2 = f * fCos;
        float f3 = this.o;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f2000b; i++) {
            View view = this.w[i];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f7 = left - this.p;
            float f8 = top - this.q;
            float f9 = (((f2 * f7) + (f4 * f8)) - f7) + this.x;
            float f10 = (((f7 * f5) + (f6 * f8)) - f8) + this.y;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.o);
            view.setScaleX(this.n);
            if (!Float.isNaN(this.l)) {
                view.setRotation(this.l);
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = Float.NaN;
        this.f1919k = Float.NaN;
        this.l = Float.NaN;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.f1920r = Float.NaN;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = true;
        this.w = null;
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = Float.NaN;
        this.f1919k = Float.NaN;
        this.l = Float.NaN;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.f1920r = Float.NaN;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = true;
        this.w = null;
        this.x = 0.0f;
        this.y = 0.0f;
    }
}
