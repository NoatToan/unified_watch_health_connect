package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import fb1.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class ImageConvertUtils {
    private static final ImageConvertUtils zza = new ImageConvertUtils();

    private ImageConvertUtils() {
    }

    @KeepForSdk
    public static ByteBuffer bufferWithBackingArray(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @KeepForSdk
    public static ImageConvertUtils getInstance() {
        return zza;
    }

    @KeepForSdk
    public static Bitmap yv12ToBitmap(ByteBuffer byteBuffer, int i14, int i15, int i16) throws MlKitException {
        byte[] bArrZzb = zzb(yv12ToNv21Buffer(byteBuffer, true).array(), i14, i15);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
        return zza(bitmapDecodeByteArray, i16, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @KeepForSdk
    public static ByteBuffer yv12ToNv21Buffer(ByteBuffer byteBuffer, boolean z14) {
        int i14;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i15 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z14 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i16 = 0;
        while (true) {
            i14 = i15 * 4;
            if (i16 >= i14) {
                break;
            }
            byteBufferAllocate.put(i16, byteBuffer.get(i16));
            i16++;
        }
        for (int i17 = 0; i17 < i15 + i15; i17++) {
            byteBufferAllocate.put(i14 + i17, byteBuffer.get((i17 / 2) + ((i17 % 2) * i15) + i14));
        }
        return byteBufferAllocate;
    }

    public static Bitmap zza(Bitmap bitmap, int i14, int i15, int i16) {
        if (i14 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i15, i16);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i14);
        return Bitmap.createBitmap(bitmap, 0, 0, i15, i16, matrix, true);
    }

    private static byte[] zzb(byte[] bArr, int i14, int i15) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i14, i15, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i14, i15), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        throw th3;
                    } catch (Exception unused) {
                        throw th3;
                    }
                }
            }
        } catch (IOException e4) {
            throw new MlKitException("Image conversion error from NV21 format", 13, e4);
        }
    }

    private static final void zzc(Image.Plane plane, int i14, int i15, byte[] bArr, int i16, int i17) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i18 = i14 / (i15 / rowStride);
        int rowStride2 = 0;
        for (int i19 = 0; i19 < rowStride; i19++) {
            int pixelStride = rowStride2;
            for (int i24 = 0; i24 < i18; i24++) {
                bArr[i16] = buffer.get(pixelStride);
                i16 += i17;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    @KeepForSdk
    public byte[] byteBufferToByteArray(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    @KeepForSdk
    public ByteBuffer cloneByteBuffer(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        ByteBuffer byteBufferAllocateDirect = byteBuffer.isDirect() ? ByteBuffer.allocateDirect(iCapacity) : ByteBuffer.allocate(iCapacity);
        byteBufferAllocateDirect.limit(byteBuffer.limit());
        byteBufferAllocateDirect.put((ByteBuffer) byteBuffer.rewind());
        byteBufferAllocateDirect.position(iPosition);
        byteBuffer.position(iPosition);
        return byteBufferAllocateDirect;
    }

    @KeepForSdk
    public Bitmap convertJpegToUpRightBitmap(Image image, int i14) {
        Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            h.s("Unexpected image format, JPEG should have exactly 1 image plane");
            return null;
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return zza(bitmapDecodeByteArray, i14, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @KeepForSdk
    public ByteBuffer convertToNv21Buffer(InputImage inputImage, boolean z14) throws MlKitException {
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format == 17) {
                return z14 ? bufferWithBackingArray((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())) : (ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer());
            }
            if (format == 35) {
                return yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight());
            }
            if (format == 842094169) {
                return yv12ToNv21Buffer((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), z14);
            }
            throw new MlKitException("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal());
        if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i14 = width * height;
        int[] iArr = new int[i14];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i14;
        ByteBuffer byteBufferAllocate = z14 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < height; i17++) {
            int i18 = 0;
            while (i18 < width) {
                int i19 = iArr[i16];
                int i24 = i19 >> 16;
                int i25 = i19 >> 8;
                int i26 = i19 & 255;
                int i27 = i15 + 1;
                int i28 = i24 & 255;
                int i29 = i25 & 255;
                byteBufferAllocate.put(i15, (byte) Math.min(255, (c.d(i26, 25, (i29 * 129) + (i28 * 66), 128) >> 8) + 16));
                if (i17 % 2 == 0 && i16 % 2 == 0) {
                    int i30 = i14 + 1;
                    byteBufferAllocate.put(i14, (byte) Math.min(255, (((((i28 * 112) - (i29 * 94)) - (i26 * 18)) + 128) >> 8) + 128));
                    i14 += 2;
                    byteBufferAllocate.put(i30, (byte) Math.min(255, (((((i28 * (-38)) - (i29 * 74)) + (i26 * 112)) + 128) >> 8) + 128));
                }
                i16++;
                i18++;
                i15 = i27;
            }
        }
        return byteBufferAllocate;
    }

    @KeepForSdk
    public Bitmap convertToUpRightBitmap(InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return zza((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()), inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight());
        }
        if (format == 17) {
            return nv21ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        if (format == 35) {
            return nv21ToBitmap(yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        if (format == 842094169) {
            return yv12ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        throw new MlKitException("Unsupported image format", 13);
    }

    @KeepForSdk
    public Bitmap getUpRightBitmap(InputImage inputImage) {
        Bitmap bitmapInternal = inputImage.getBitmapInternal();
        return bitmapInternal != null ? zza(bitmapInternal, inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight()) : convertToUpRightBitmap(inputImage);
    }

    @KeepForSdk
    public Bitmap nv21ToBitmap(ByteBuffer byteBuffer, int i14, int i15, int i16) throws MlKitException {
        byte[] bArrZzb = zzb(byteBufferToByteArray(byteBuffer), i14, i15);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
        return zza(bitmapDecodeByteArray, i16, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @KeepForSdk
    public ByteBuffer yuv420ThreePlanesToNV21(Image.Plane[] planeArr, int i14, int i15) {
        int i16 = i14 * i15;
        int i17 = i16 / 4;
        byte[] bArr = new byte[i17 + i17 + i16];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i18 = (i16 + i16) / 4;
        boolean z14 = buffer2.remaining() == i18 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z14) {
            planeArr[0].getBuffer().get(bArr, 0, i16);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i16, 1);
            buffer3.get(bArr, i16 + 1, i18 - 1);
        } else {
            zzc(planeArr[0], i14, i15, bArr, 0, 1);
            zzc(planeArr[1], i14, i15, bArr, i16 + 1, 2);
            zzc(planeArr[2], i14, i15, bArr, i16, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
