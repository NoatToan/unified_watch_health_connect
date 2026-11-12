package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.b6i;
import defpackage.n5d;
import defpackage.w07;

/* JADX INFO: loaded from: classes4.dex */
@w07
public class Bitmaps {
    static {
        n5d.a();
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2) {
        b6i.b(bitmap2.getConfig() == bitmap.getConfig());
        b6i.b(bitmap.isMutable());
        b6i.b(bitmap.getWidth() == bitmap2.getWidth());
        b6i.b(bitmap.getHeight() == bitmap2.getHeight());
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @w07
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
