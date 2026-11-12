package com.miui.tsmclient.common.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.view.View;
import com.miui.tsmclient.util.IOUtils;
import com.miui.tsmclient.util.LogUtils;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class ImageUtils {
    private static final int DEFAULT_QUALITY = 80;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final String TAG = "ImageUtils";

    private ImageUtils() {
    }

    public static byte[] bmpToByteArray(Bitmap bitmap) {
        return bmpToByteArray(bitmap, 80);
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static Bitmap clipToRoundRectBitmap(Bitmap bitmap, int i, int i2, int i3) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        Paint paint = new Paint(1);
        paint.setColor(MenuBuilder.CATEGORY_MASK);
        float f = i3;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        bitmapDrawable.setBounds(0, 0, i, i2);
        canvas.saveLayer(rectF, paint, 31);
        bitmapDrawable.draw(canvas);
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap getScreenShot(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    public static int parseImageDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("parseImageDegree: ");
            sb.append(e);
            return 0;
        }
    }

    public static Bitmap rotate(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap;
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError e) {
            LogUtils.e("rotate failed", e);
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = bitmap;
        }
        if (bitmap != bitmapCreateBitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static byte[] rotateYUV420Degree180(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (int i6 = i3 - 1; i6 >= 0; i6--) {
            bArr2[i5] = bArr[i6];
            i5++;
        }
        for (int i7 = i4 - 1; i7 >= i3; i7 -= 2) {
            int i8 = i5 + 1;
            bArr2[i5] = bArr[i7 - 1];
            i5 += 2;
            bArr2[i8] = bArr[i7];
        }
        return bArr2;
    }

    public static byte[] rotateYUV420Degree270(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[(i3 * 3) / 2];
        int i4 = i - 1;
        int i5 = 0;
        for (int i6 = i4; i6 >= 0; i6--) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                bArr2[i5] = bArr[i7 + i6];
                i5++;
                i7 += i;
            }
        }
        int i9 = i3;
        while (i4 > 0) {
            int i10 = i3;
            for (int i11 = 0; i11 < i2 / 2; i11++) {
                bArr2[i9] = bArr[(i4 - 1) + i10];
                bArr2[i9 + 1] = bArr[i10 + i4];
                i9 += 2;
                i10 += i;
            }
            i4 -= 2;
        }
        return bArr2;
    }

    public static byte[] rotateYUV420Degree90(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            for (int i7 = i2 - 1; i7 >= 0; i7--) {
                bArr2[i5] = bArr[(i7 * i) + i6];
                i5++;
            }
        }
        int i8 = i4 - 1;
        for (int i9 = i - 1; i9 > 0; i9 -= 2) {
            for (int i10 = 0; i10 < i2 / 2; i10++) {
                int i11 = (i10 * i) + i3;
                bArr2[i8] = bArr[i11 + i9];
                bArr2[i8 - 1] = bArr[i11 + (i9 - 1)];
                i8 -= 2;
            }
        }
        return bArr2;
    }

    public static boolean saveN21(byte[] bArr, int i, int i2, String str) throws Throwable {
        boolean zCompressToJpeg = false;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(str)));
                try {
                    zCompressToJpeg = yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 90, bufferedOutputStream2);
                    IOUtils.closeQuietly((OutputStream) bufferedOutputStream2);
                } catch (FileNotFoundException e) {
                    e = e;
                    bufferedOutputStream = bufferedOutputStream2;
                    LogUtils.e("saveN21 error occurred", e);
                    IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
        return zCompressToJpeg;
    }

    public boolean save(Bitmap bitmap, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File file;
        Throwable th;
        BufferedOutputStream bufferedOutputStream2 = null;
        boolean z = false;
        try {
            file = new File(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    try {
                        boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 90, bufferedOutputStream);
                        try {
                            bufferedOutputStream.flush();
                            try {
                                IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                                if (!zCompress) {
                                    file.delete();
                                }
                            } catch (Exception unused) {
                            }
                            return zCompress;
                        } catch (Throwable th2) {
                            th = th2;
                            z = zCompress;
                            try {
                                IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                                if (!z && file != null) {
                                    file.delete();
                                }
                            } catch (Exception unused2) {
                            }
                            throw th;
                        }
                    } catch (Exception unused3) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        try {
                            IOUtils.closeQuietly((OutputStream) bufferedOutputStream2);
                            if (file == null) {
                                return false;
                            }
                            file.delete();
                            return false;
                        } catch (Exception unused4) {
                            return false;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception unused5) {
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                th = th;
                IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                if (!z) {
                    file.delete();
                }
                throw th;
            }
        } catch (Exception unused6) {
            file = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            file = null;
        }
    }

    public static byte[] bmpToByteArray(Bitmap bitmap, int i) {
        if (bitmap == null || bitmap.isRecycled()) {
            return EMPTY_BYTE_ARRAY;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] rotate(byte[] bArr, int i, int i2, int i3) {
        if (i3 == 0) {
            return bArr;
        }
        if (i3 == 90) {
            return rotateYUV420Degree90(bArr, i, i2);
        }
        if (i3 == 180) {
            return rotateYUV420Degree180(bArr, i, i2);
        }
        if (i3 == 270) {
            return rotateYUV420Degree270(bArr, i, i2);
        }
        throw new IllegalArgumentException("invalid rotate angle");
    }
}
