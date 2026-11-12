package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.fa2;
import defpackage.k8f;
import defpackage.pii;
import defpackage.pmi;

/* JADX INFO: loaded from: classes5.dex */
public final class CircularProgressIndicatorSpec extends fa2 {
    public int g;
    public int h;
    public int i;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.f30433k);
    }

    @Override // defpackage.fa2
    public void e() {
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.p);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(pmi.q0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(pmi.p0);
        TypedArray typedArrayH = c9p.h(context, attributeSet, b4j.L1, i, i2, new int[0]);
        this.g = Math.max(k8f.d(context, typedArrayH, b4j.O1, dimensionPixelSize), this.f17585a * 2);
        this.h = k8f.d(context, typedArrayH, b4j.N1, dimensionPixelSize2);
        this.i = typedArrayH.getInt(b4j.M1, 0);
        typedArrayH.recycle();
        e();
    }
}
