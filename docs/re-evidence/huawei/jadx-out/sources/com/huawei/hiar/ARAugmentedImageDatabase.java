package com.huawei.hiar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* JADX INFO: loaded from: classes33.dex */
public class ARAugmentedImageDatabase {
    private static final int STREAM_END = -1;
    static final String TAG = "ARAugmentedImageDatabase";
    long mNativeDatabaseHandle;
    private final ARSession mSession;

    private native int nativeAddImage(long j, long j2, String str, byte[] bArr, int i, int i2, int i3);

    private native int nativeAddImageWithPhysicalSize(long j, long j2, String str, byte[] bArr, int i, int i2, int i3, float f);

    private static native long nativeCreate(long j);

    private static native long nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestroy(long j);

    private native int nativeGetNumImages(long j, long j2);

    private native byte[] nativeSerialize(long j, long j2);

    public void serialize(OutputStream outputStream) throws IOException {
        byte[] bArrNativeSerialize = nativeSerialize(this.mSession.mNativeHandle, this.mNativeDatabaseHandle);
        ByteBuffer byteBufferPut = ByteBuffer.allocateDirect(bArrNativeSerialize.length).put(bArrNativeSerialize);
        byteBufferPut.flip();
        Channels.newChannel(outputStream).write(byteBufferPut);
    }

    public int getNumImages() {
        return nativeGetNumImages(this.mSession.mNativeHandle, this.mNativeDatabaseHandle);
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeDatabaseHandle;
        if (j != 0) {
            nativeDestroy(j);
        }
        super.finalize();
    }

    public int addImage(String str, Bitmap bitmap, float f) {
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            return 0;
        }
        return nativeAddImageWithPhysicalSize(this.mSession.mNativeHandle, this.mNativeDatabaseHandle, str, convertBitmapToGrayScaleByteArray(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth(), f);
    }

    public int addImage(String str, Bitmap bitmap) {
        if (bitmap == null || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            return 0;
        }
        return nativeAddImage(this.mSession.mNativeHandle, this.mNativeDatabaseHandle, str, convertBitmapToGrayScaleByteArray(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth());
    }

    private static byte[] loadDirectByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static ARAugmentedImageDatabase deserialize(ARSession aRSession, InputStream inputStream) throws IOException {
        return new ARAugmentedImageDatabase(aRSession, nativeDeserialize(aRSession.mNativeHandle, loadDirectByteArray(inputStream)));
    }

    private static byte[] convertBitmapToGrayScaleByteArray(Bitmap bitmap) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        byte[] bArr = new byte[bitmap.getWidth() * bitmap.getHeight()];
        for (int i = 0; i < bitmap.getHeight(); i++) {
            for (int i2 = 0; i2 < bitmap.getWidth(); i2++) {
                bArr[(bitmap.getWidth() * i) + i2] = (byte) Color.red(bitmapCreateBitmap.getPixel(i2, i));
            }
        }
        return bArr;
    }

    ARAugmentedImageDatabase(ARSession aRSession, long j) {
        this.mSession = aRSession;
        this.mNativeDatabaseHandle = j;
    }

    public ARAugmentedImageDatabase(ARSession aRSession) {
        this.mSession = aRSession;
        this.mNativeDatabaseHandle = nativeCreate(aRSession.mNativeHandle);
    }
}
