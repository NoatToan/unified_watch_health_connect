package com.google.android.material.elevation;

import android.content.Context;
import androidx.annotation.Dimension;
import defpackage.i8f;
import defpackage.pii;
import defpackage.pmi;
import defpackage.v68;

/* JADX INFO: loaded from: classes5.dex */
public enum SurfaceColors {
    SURFACE_0(pmi.f30545r),
    SURFACE_1(pmi.s),
    SURFACE_2(pmi.t),
    SURFACE_3(pmi.u),
    SURFACE_4(pmi.v),
    SURFACE_5(pmi.w);

    private final int elevationResId;

    SurfaceColors(int i) {
        this.elevationResId = i;
    }

    public static int getColorForElevation(Context context, @Dimension float f) {
        return new v68(context).b(i8f.b(context, pii.s, 0), f);
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
