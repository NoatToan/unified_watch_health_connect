package com.huami.lib.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.camera.core.ImageProxy;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.common.HybridBinarizer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@WorkerThread
public final class QRCodeDecoder {
    private static final Map<DecodeHintType, Object> a;

    public static class a {
        public byte[] a;
        public int b;
        public int c;

        public a(byte[] bArr, int i, int i2) {
            this.a = bArr;
            this.b = i;
            this.c = i2;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        a = enumMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(BarcodeFormat.CODE_39);
        arrayList.add(BarcodeFormat.CODE_128);
        arrayList.add(BarcodeFormat.DATA_MATRIX);
        arrayList.add(BarcodeFormat.EAN_8);
        arrayList.add(BarcodeFormat.EAN_13);
        arrayList.add(BarcodeFormat.ITF);
        arrayList.add(BarcodeFormat.PDF_417);
        arrayList.add(BarcodeFormat.QR_CODE);
        arrayList.add(BarcodeFormat.UPC_A);
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, arrayList);
        enumMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        enumMap.put(DecodeHintType.CHARACTER_SET, "utf-8");
    }

    private QRCodeDecoder() {
    }

    @NonNull
    private static byte[] a(@NonNull ImageProxy imageProxy) {
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        ByteBuffer buffer = planeProxy.getBuffer();
        byte[] bArr = new byte[buffer.remaining()];
        buffer.rewind();
        buffer.get(bArr);
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = planeProxy.getRowStride();
        int pixelStride = planeProxy.getPixelStride();
        if (width == rowStride && pixelStride == 1) {
            return bArr;
        }
        byte[] bArr2 = new byte[width * height];
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                bArr2[(i * width) + i2] = bArr[(i * rowStride) + (i2 * pixelStride)];
            }
        }
        return bArr2;
    }

    private static void b(a aVar, int i) {
        if (i != 0 && i % 90 == 0) {
            int i2 = aVar.b;
            int i3 = aVar.c;
            byte[] bArr = new byte[aVar.a.length];
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    if (i == 90) {
                        bArr[(((i5 * i3) + i3) - i4) - 1] = aVar.a[(i4 * i2) + i5];
                    } else if (i == 180) {
                        bArr[(((((i3 - i4) - 1) * i2) + i2) - i5) - 1] = aVar.a[(i4 * i2) + i5];
                    } else if (i == 270) {
                        bArr[(i5 * i3) + i4] = aVar.a[(((i4 * i2) + i2) - i5) - 1];
                    }
                }
            }
            aVar.a = bArr;
            if (i != 180) {
                aVar.c = i2;
                aVar.b = i3;
            }
        }
    }

    private static Bitmap c(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    @Nullable
    @WorkerThread
    private static Result d(Bitmap bitmap) {
        RGBLuminanceSource rGBLuminanceSource;
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        multiFormatReader.setHints(a);
        try {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int[] iArr = new int[width * height];
                bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                rGBLuminanceSource = new RGBLuminanceSource(width, height, iArr);
                try {
                    Result resultDecodeWithState = multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource)));
                    multiFormatReader.reset();
                    return resultDecodeWithState;
                } catch (Exception unused) {
                    if (rGBLuminanceSource == null) {
                        multiFormatReader.reset();
                        return null;
                    }
                    try {
                        Result resultDecodeWithState2 = multiFormatReader.decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(rGBLuminanceSource)));
                        multiFormatReader.reset();
                        return resultDecodeWithState2;
                    } catch (NotFoundException unused2) {
                        Result resultD = d(c(bitmap));
                        multiFormatReader.reset();
                        return resultD;
                    }
                }
            } catch (Exception unused3) {
                rGBLuminanceSource = null;
            }
        } catch (Throwable th) {
            multiFormatReader.reset();
            throw th;
        }
    }

    @Nullable
    @WorkerThread
    public static Result e(Context context, @NonNull Uri uri) {
        return d(c.a(context, uri));
    }

    @Nullable
    @WorkerThread
    public static Result f(@NonNull ImageProxy imageProxy) {
        PlanarYUVLuminanceSource planarYUVLuminanceSource;
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        multiFormatReader.setHints(a);
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        byte[] bArrA = a(imageProxy);
        a aVar = new a(bArrA, width, height);
        b(aVar, imageProxy.getImageInfo().getRotationDegrees());
        try {
            try {
                planarYUVLuminanceSource = new PlanarYUVLuminanceSource(bArrA, width, height, 0, 0, width, height, false);
                try {
                    Result resultDecodeWithState = multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource)));
                    multiFormatReader.reset();
                    return resultDecodeWithState;
                } catch (Exception unused) {
                    if (planarYUVLuminanceSource != null) {
                        try {
                            Result resultDecodeWithState2 = multiFormatReader.decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(planarYUVLuminanceSource)));
                            multiFormatReader.reset();
                            return resultDecodeWithState2;
                        } catch (NotFoundException unused2) {
                            byte[] bArr = aVar.a;
                            int i = aVar.b;
                            int i2 = aVar.c;
                            PlanarYUVLuminanceSource planarYUVLuminanceSource2 = new PlanarYUVLuminanceSource(bArr, i, i2, 100, i2 >> 2, i - 100, i2 >> 1, false);
                            try {
                                try {
                                    Result resultDecodeWithState3 = multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource2)));
                                    multiFormatReader.reset();
                                    return resultDecodeWithState3;
                                } catch (NotFoundException unused3) {
                                    Result resultDecodeWithState4 = multiFormatReader.decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(planarYUVLuminanceSource2)));
                                    multiFormatReader.reset();
                                    return resultDecodeWithState4;
                                }
                            } catch (NotFoundException unused4) {
                                multiFormatReader.reset();
                                return null;
                            }
                        }
                    }
                    multiFormatReader.reset();
                    return null;
                }
            } catch (Throwable th) {
                multiFormatReader.reset();
                throw th;
            }
        } catch (Exception unused5) {
            planarYUVLuminanceSource = null;
        }
    }

    @WorkerThread
    public static String syncDecodeQRCode(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return syncDecodeQRCode(BitmapFactory.decodeFile(str, options));
    }

    @Nullable
    @WorkerThread
    public static String syncDecodeQRCode(Bitmap bitmap) {
        Result resultD = d(bitmap);
        if (resultD == null) {
            return null;
        }
        return resultD.getText();
    }
}
