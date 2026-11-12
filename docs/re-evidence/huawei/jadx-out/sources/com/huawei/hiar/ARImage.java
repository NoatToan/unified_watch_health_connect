package com.huawei.hiar;

import android.graphics.Rect;
import android.media.Image;
import com.huawei.hiar.exceptions.ARFatalException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes33.dex */
public class ARImage extends a {
    private static final int ERROR_CODE_INT = -1;
    private static final long ERROR_CODE_LONG = -1;
    private long nativeHandle;

    private native void nativeClose(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native ByteBuffer nativeGetBuffer(long j, int i);

    private native int nativeGetFormat(long j);

    private native int nativeGetHeight(long j);

    private native int nativeGetNumberOfPlanes(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetPixelStride(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetRowStride(long j, int i);

    private native long nativeGetTimestamp(long j);

    private native int nativeGetWidth(long j);

    @Override // android.media.Image
    public void setTimestamp(long j) {
        throw new UnsupportedOperationException("This is read-only image.");
    }

    @Override // android.media.Image
    public void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is read-only image.");
    }

    @Override // android.media.Image
    public int getWidth() {
        int iNativeGetWidth = nativeGetWidth(this.nativeHandle);
        if (iNativeGetWidth != -1) {
            return iNativeGetWidth;
        }
        throw new ARFatalException("Unknown error in ArImage.getWidth().");
    }

    @Override // android.media.Image
    public long getTimestamp() {
        long jNativeGetTimestamp = nativeGetTimestamp(this.nativeHandle);
        if (jNativeGetTimestamp != -1) {
            return jNativeGetTimestamp;
        }
        throw new ARFatalException("Unknown error in ArImage.getTimestamp().");
    }

    @Override // android.media.Image
    public Image.Plane[] getPlanes() {
        int iNativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.nativeHandle);
        if (iNativeGetNumberOfPlanes == -1) {
            throw new ARFatalException("Unknown error in ArImage.getPlanes().");
        }
        b[] bVarArr = new b[iNativeGetNumberOfPlanes];
        for (int i = 0; i < iNativeGetNumberOfPlanes; i++) {
            bVarArr[i] = new b(this.nativeHandle, i);
        }
        return bVarArr;
    }

    @Override // android.media.Image
    public int getHeight() {
        int iNativeGetHeight = nativeGetHeight(this.nativeHandle);
        if (iNativeGetHeight != -1) {
            return iNativeGetHeight;
        }
        throw new ARFatalException("Unknown error in ArImage.getHeight().");
    }

    @Override // android.media.Image
    public int getFormat() {
        int iNativeGetFormat = nativeGetFormat(this.nativeHandle);
        if (iNativeGetFormat != -1) {
            return iNativeGetFormat;
        }
        throw new ARFatalException("Unknown error in ArImage.getFormat().");
    }

    @Override // android.media.Image
    public Rect getCropRect() {
        throw new UnsupportedOperationException("Crop rect is unknown in this image.");
    }

    class b extends com.huawei.hiar.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f11738b;
        private final int d;

        @Override // android.media.Image.Plane
        public final int getRowStride() {
            int iNativeGetRowStride = ARImage.this.nativeGetRowStride(this.f11738b, this.d);
            if (iNativeGetRowStride != -1) {
                return iNativeGetRowStride;
            }
            throw new ARFatalException("Unknown error in ArImage.Plane.getRowStride().");
        }

        @Override // android.media.Image.Plane
        public final int getPixelStride() {
            int iNativeGetPixelStride = ARImage.this.nativeGetPixelStride(this.f11738b, this.d);
            if (iNativeGetPixelStride != -1) {
                return iNativeGetPixelStride;
            }
            throw new ARFatalException("Unknown error in ArImage.Plane.getPixelStride().");
        }

        @Override // android.media.Image.Plane
        public final ByteBuffer getBuffer() {
            return ARImage.this.nativeGetBuffer(this.f11738b, this.d).asReadOnlyBuffer();
        }

        b(long j, int i) {
            this.f11738b = j;
            this.d = i;
        }
    }

    @Override // android.media.Image, java.lang.AutoCloseable
    public void close() {
        nativeClose(this.nativeHandle);
        this.nativeHandle = 0L;
    }

    public ARImage(long j) {
        this.nativeHandle = j;
    }
}
