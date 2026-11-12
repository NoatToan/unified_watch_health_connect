package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.fa2;
import defpackage.pii;

/* JADX INFO: loaded from: classes5.dex */
public final class LinearProgressIndicatorSpec extends fa2 {
    public int g;
    public int h;
    public boolean i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.B);
    }

    @Override // defpackage.fa2
    public void e() {
        if (this.g == 0) {
            if (this.f17586b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.p);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayH = c9p.h(context, attributeSet, b4j.J3, pii.B, LinearProgressIndicator.p, new int[0]);
        this.g = typedArrayH.getInt(b4j.K3, 1);
        this.h = typedArrayH.getInt(b4j.L3, 0);
        typedArrayH.recycle();
        e();
        this.i = this.h == 1;
    }
}
