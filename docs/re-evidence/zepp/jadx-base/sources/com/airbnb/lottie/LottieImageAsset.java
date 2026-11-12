package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public class LottieImageAsset {
    private final int a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;

    @Nullable
    private Bitmap f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieImageAsset(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Nullable
    public Bitmap getBitmap() {
        return this.f;
    }

    public String getDirName() {
        return this.e;
    }

    public String getFileName() {
        return this.d;
    }

    public int getHeight() {
        return this.b;
    }

    public String getId() {
        return this.c;
    }

    public int getWidth() {
        return this.a;
    }

    public boolean hasBitmap() {
        return this.f != null || (this.d.startsWith("data:") && this.d.indexOf("base64,") > 0);
    }

    public void setBitmap(@Nullable Bitmap bitmap) {
        this.f = bitmap;
    }
}
