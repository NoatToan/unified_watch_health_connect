package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f2009a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final void c(AttributeSet attributeSet) {
    }

    public a getConstraintSet() {
        if (this.f2009a == null) {
            this.f2009a = new a();
        }
        this.f2009a.u(this);
        return this.f2009a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(attributeSet);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;
        public float J0;
        public float x0;
        public boolean y0;
        public float z0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.x0 = 1.0f;
            this.y0 = false;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.x0 = 1.0f;
            this.y0 = false;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.f5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.g5) {
                    this.x0 = typedArrayObtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == u4j.r5) {
                    this.z0 = typedArrayObtainStyledAttributes.getFloat(index, this.z0);
                    this.y0 = true;
                } else if (index == u4j.o5) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == u4j.p5) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == u4j.n5) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == u4j.l5) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == u4j.m5) {
                    this.E0 = typedArrayObtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == u4j.h5) {
                    this.F0 = typedArrayObtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == u4j.i5) {
                    this.G0 = typedArrayObtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == u4j.j5) {
                    this.H0 = typedArrayObtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == u4j.k5) {
                    this.I0 = typedArrayObtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == u4j.q5) {
                    this.J0 = typedArrayObtainStyledAttributes.getFloat(index, this.J0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
