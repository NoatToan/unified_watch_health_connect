package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.b6i;
import defpackage.ohg;
import defpackage.w07;

/* JADX INFO: loaded from: classes4.dex */
@w07
public class NativeBlurFilter {
    static {
        ohg.a();
    }

    public static void a(Bitmap bitmap, int i, int i2) {
        b6i.g(bitmap);
        b6i.b(i > 0);
        b6i.b(i2 > 0);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @w07
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
