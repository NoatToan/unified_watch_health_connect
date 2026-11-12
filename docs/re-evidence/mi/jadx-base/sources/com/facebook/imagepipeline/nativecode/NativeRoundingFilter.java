package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.ohg;
import defpackage.w07;

/* JADX INFO: loaded from: classes4.dex */
@w07
public class NativeRoundingFilter {
    static {
        ohg.a();
    }

    @w07
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @w07
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);
}
