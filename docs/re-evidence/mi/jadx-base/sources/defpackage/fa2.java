package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fa2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17586b;
    public int[] c = new int[0];
    public int d;
    public int e;
    public int f;

    public fa2(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(pmi.r0);
        TypedArray typedArrayH = c9p.h(context, attributeSet, b4j.Q, i, i2, new int[0]);
        this.f17585a = k8f.d(context, typedArrayH, b4j.Y, dimensionPixelSize);
        this.f17586b = Math.min(k8f.d(context, typedArrayH, b4j.X, 0), this.f17585a / 2);
        this.e = typedArrayH.getInt(b4j.U, 0);
        this.f = typedArrayH.getInt(b4j.R, 0);
        c(context, typedArrayH);
        d(context, typedArrayH);
        typedArrayH.recycle();
    }

    public boolean a() {
        return this.f != 0;
    }

    public boolean b() {
        return this.e != 0;
    }

    public final void c(Context context, TypedArray typedArray) {
        if (!typedArray.hasValue(b4j.S)) {
            this.c = new int[]{i8f.b(context, pii.q, -1)};
            return;
        }
        if (typedArray.peekValue(b4j.S).type != 1) {
            this.c = new int[]{typedArray.getColor(b4j.S, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(b4j.S, -1));
        this.c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public final void d(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(b4j.W)) {
            this.d = typedArray.getColor(b4j.W, -1);
            return;
        }
        this.d = this.c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.d = i8f.a(this.d, (int) (f * 255.0f));
    }

    public abstract void e();
}
