package com.huawei.hiar;

import android.util.Size;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARCameraConfig {
    long mNativeHandle;
    final ARSession mSession;

    private static native void nativeDestroy(long j);

    private native int[] nativeGetImageDimensions(long j, long j2);

    private native int[] nativeGetTextureDimensions(long j, long j2);

    public String toString() {
        return String.format(Locale.ENGLISH, "ARCameraConfig: {handle=0x%x, ImageDimensions=(%d,%d), TextureDimensions=(%d,%d)}", Long.valueOf(this.mNativeHandle), Integer.valueOf(getImageDimensions().getWidth()), Integer.valueOf(getImageDimensions().getHeight()), Integer.valueOf(getTextureDimensions().getWidth()), Integer.valueOf(getTextureDimensions().getHeight()));
    }

    public int hashCode() {
        return Long.valueOf(this.mNativeHandle).hashCode();
    }

    public Size getTextureDimensions() {
        int[] iArrNativeGetTextureDimensions = nativeGetTextureDimensions(this.mSession.mNativeHandle, this.mNativeHandle);
        return new Size(iArrNativeGetTextureDimensions[0], iArrNativeGetTextureDimensions[1]);
    }

    public Size getImageDimensions() {
        int[] iArrNativeGetImageDimensions = nativeGetImageDimensions(this.mSession.mNativeHandle, this.mNativeHandle);
        return new Size(iArrNativeGetImageDimensions[0], iArrNativeGetImageDimensions[1]);
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeDestroy(j);
        }
        super.finalize();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ARCameraConfig) && ((ARCameraConfig) obj).mNativeHandle == this.mNativeHandle;
    }

    ARCameraConfig(ARSession aRSession, long j) {
        this.mSession = aRSession;
        this.mNativeHandle = j;
    }

    private ARCameraConfig() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
