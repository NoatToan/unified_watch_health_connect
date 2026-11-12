package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes10.dex */
public class d6l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15144b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;

    public int a() {
        return this.f15144b;
    }

    public int b() {
        return this.f15143a;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.g;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.e;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.j;
    }

    public boolean j() {
        return this.i;
    }

    public void k(Context context, AttributeSet attributeSet) {
        this.f15143a = qoi.f;
        this.f15144b = qoi.e;
        this.c = qoi.g;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(bmi.e);
        this.d = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.g = dimensionPixelSize;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.T1);
            this.f15143a = typedArrayObtainStyledAttributes.getResourceId(b5j.V1, this.f15143a);
            this.f15144b = typedArrayObtainStyledAttributes.getResourceId(b5j.U1, this.f15144b);
            this.c = typedArrayObtainStyledAttributes.getResourceId(b5j.W1, this.c);
            if (typedArrayObtainStyledAttributes.hasValue(b5j.e2)) {
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b5j.e2, dimensionPixelSize);
                this.d = dimensionPixelSize2;
                this.e = dimensionPixelSize2;
                this.f = dimensionPixelSize2;
                this.g = dimensionPixelSize2;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b5j.b2)) {
                this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(b5j.b2, this.d);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b5j.d2)) {
                this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(b5j.d2, this.e);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b5j.c2)) {
                this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(b5j.c2, this.f);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b5j.a2)) {
                this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(b5j.a2, this.g);
            }
            this.h = typedArrayObtainStyledAttributes.getBoolean(b5j.X1, false);
            this.i = typedArrayObtainStyledAttributes.getBoolean(b5j.Z1, true);
            this.j = typedArrayObtainStyledAttributes.getBoolean(b5j.Y1, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
