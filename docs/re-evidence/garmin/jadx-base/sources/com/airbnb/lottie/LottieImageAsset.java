package com.airbnb.lottie;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public class LottieImageAsset {
    private Bitmap bitmap;
    private final String dirName;
    private final String fileName;
    private final int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f28193id;
    private final int width;

    public LottieImageAsset(int i14, int i15, String str, String str2, String str3) {
        this.width = i14;
        this.height = i15;
        this.f28193id = str;
        this.fileName = str2;
        this.dirName = str3;
    }

    public LottieImageAsset copyWithScale(float f14) {
        LottieImageAsset lottieImageAsset = new LottieImageAsset((int) (this.width * f14), (int) (this.height * f14), this.f28193id, this.fileName, this.dirName);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            lottieImageAsset.setBitmap(Bitmap.createScaledBitmap(bitmap, lottieImageAsset.width, lottieImageAsset.height, true));
        }
        return lottieImageAsset;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getDirName() {
        return this.dirName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f28193id;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean hasBitmap() {
        if (this.bitmap == null) {
            return this.fileName.startsWith("data:") && this.fileName.indexOf("base64,") > 0;
        }
        return true;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
