package com.garmin.android.library.handalignment;

import android.graphics.Bitmap;
import android.util.Size;

/* JADX INFO: loaded from: classes11.dex */
public class WatchHandDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f50158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f50159b;

    static {
        System.loadLibrary("whp");
    }

    public final int a(byte[] bArr, Size size, int i14) {
        if (this.f50158a == null) {
            int debugImageSize = getDebugImageSize();
            this.f50159b = new int[debugImageSize * debugImageSize];
            this.f50158a = Bitmap.createBitmap(debugImageSize, debugImageSize, Bitmap.Config.ARGB_8888);
        }
        int iWatchHandsPosition = watchHandsPosition(size.getWidth(), size.getHeight(), i14, bArr, this.f50159b);
        Bitmap bitmap = this.f50158a;
        bitmap.setPixels(this.f50159b, 0, bitmap.getWidth(), 0, 0, this.f50158a.getWidth(), this.f50158a.getWidth());
        return iWatchHandsPosition;
    }

    public native void clearRecordingData();

    public native int getDebugImageSize();

    public native int getErrorCodePerFrame();

    public native float getHourHandOffsetAnglePerFrame();

    public native float getHourHandOffsetAngleResult();

    public native float getMinuteHandOffsetAnglePerFrame();

    public native float getMinuteHandOffsetAngleResult();

    public native void initialize(int i14);

    public native boolean setCropRegionSizeRatio(float f14, float f15);

    public native int watchHandsPosition(int i14, int i15, int i16, byte[] bArr, int[] iArr);
}
