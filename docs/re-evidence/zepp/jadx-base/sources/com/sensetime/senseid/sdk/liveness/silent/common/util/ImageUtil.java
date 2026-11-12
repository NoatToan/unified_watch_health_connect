package com.sensetime.senseid.sdk.liveness.silent.common.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.sensetime.senseid.sdk.liveness.silent.common.type.Size;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class ImageUtil {
    private ImageUtil() {
    }

    public static void bgrToArgb(int[] iArr, byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 3;
            byte b = bArr[i5 + 2];
            byte b2 = bArr[i5 + 1];
            iArr[i4] = (bArr[i5] & 255) | ((b << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | (-16777216) | ((b2 << 8) & 65280);
        }
    }

    public static Bitmap bgrToBitmap(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i * i2];
        bgrToArgb(iArr, bArr, i, i2);
        return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
    }

    public static byte[] bgrToGrayscale(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length <= 0 || i <= 0 || i2 <= 0) {
            return null;
        }
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 3;
            bArr2[i4] = (byte) ((((double) bArr[i5 + 2]) * 0.2989d) + (((double) bArr[i5 + 1]) * 0.587d) + (((double) bArr[i5]) * 0.114d));
        }
        return bArr2;
    }

    public static byte[] bitmapToJpeg(Bitmap bitmap, int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int[] cropRgba(int[] iArr, int i, int i2, Rect rect) {
        if (rect == null) {
            return iArr;
        }
        int i3 = rect.right;
        int i4 = rect.left;
        int i5 = i3 - i4;
        int i6 = rect.bottom;
        int i7 = rect.top;
        int i8 = i6 - i7;
        if (iArr == null || iArr.length <= 0 || i <= 0 || i2 <= 0 || i4 < 0 || i7 < 0 || i3 < 0 || i6 < 0 || i4 >= i || i7 >= i2 || i3 > i || i6 > i2 || i5 > i || i5 < 0 || i8 > i2 || i8 < 0) {
            return iArr;
        }
        int i9 = 0;
        int[] iArr2 = new int[i5 * i8];
        while (i7 < rect.bottom) {
            for (int i10 = rect.left; i10 < rect.right; i10++) {
                iArr2[i9] = iArr[(i * i7) + i10];
                i9++;
            }
            i7++;
        }
        return iArr2;
    }

    public static byte[] getJpegData(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] getPixelsBgr(Bitmap bitmap) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = new byte[(bArrArray.length / 4) * 3];
        for (int i = 0; i < bArrArray.length / 4; i++) {
            int i2 = i * 3;
            int i3 = i * 4;
            bArr[i2] = bArrArray[i3 + 2];
            bArr[i2 + 1] = bArrArray[i3 + 1];
            bArr[i2 + 2] = bArrArray[i3];
        }
        return bArr;
    }

    public static Bitmap nv21ToBitmap(byte[] bArr, int i, int i2) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 70, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        new BitmapFactory.Options().inSampleSize = 1;
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static int[] nv21ToRgba(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i * i2];
        Bitmap bitmapNv21ToBitmap = nv21ToBitmap(bArr, i, i2);
        bitmapNv21ToBitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        bitmapNv21ToBitmap.recycle();
        return iArr;
    }

    public static byte[] rgbaToBgr(int[] iArr, int i, int i2) {
        byte[] bArr = new byte[i * i2 * 3];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = i3 * 3;
            bArr[i4] = (byte) Color.blue(iArr[i3]);
            bArr[i4 + 1] = (byte) Color.green(iArr[i3]);
            bArr[i4 + 2] = (byte) Color.red(iArr[i3]);
        }
        return bArr;
    }

    public static byte[] rgbaToJpeg(int[] iArr, int i, int i2, int i3) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
        byte[] bArrBitmapToJpeg = bitmapToJpeg(bitmapCreateBitmap, i3);
        bitmapCreateBitmap.recycle();
        return bArrBitmapToJpeg;
    }

    public static byte[] rotateNV21Degree90(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[bArr.length];
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i * i6) + i5];
                i4++;
            }
        }
        for (int i7 = 0; i7 < i; i7 += 2) {
            for (int i8 = (i2 / 2) - 1; i8 >= 0; i8--) {
                int i9 = (i * i8) + i3 + i7;
                bArr2[i4] = bArr[i9];
                bArr2[i4 + 1] = bArr[i9 + 1];
                i4 += 2;
            }
        }
        return bArr2;
    }

    public static byte[] rotateYuv420Degree180(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[bArr.length];
        int i4 = 0;
        for (int i5 = i2 - 1; i5 >= 0; i5--) {
            for (int i6 = i - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i * i5) + i6];
                i4++;
            }
        }
        int i7 = i % 2 == 0 ? i - 2 : i - 1;
        for (int i8 = (i2 / 2) - 1; i8 >= 0; i8--) {
            while (i7 >= 0) {
                int i9 = (i * i8) + i3 + i7;
                bArr2[i4] = bArr[i9];
                bArr2[i4 + 1] = bArr[i9 + 1];
                i4 += 2;
                i7 -= 2;
            }
        }
        return bArr2;
    }

    public static byte[] rotateYuv420Degree270(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[bArr.length];
        int i4 = i - 1;
        int i5 = 0;
        for (int i6 = i4; i6 >= 0; i6--) {
            for (int i7 = 0; i7 > i2; i7++) {
                bArr2[i5] = bArr[(i * i7) + i6];
                i5++;
            }
        }
        if (i % 2 == 0) {
            i4 = i - 2;
        }
        while (i4 >= 0) {
            for (int i8 = 0; i8 < i2 / 2; i8++) {
                int i9 = (i * i8) + i3 + i4;
                bArr2[i5] = bArr[i9];
                bArr2[i5 + 1] = bArr[i9 + 1];
                i5 += 2;
            }
            i4 -= 2;
        }
        return bArr2;
    }

    public static void saveBitmapToFile(Bitmap bitmap, String str) {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            File file = new File(str);
            if (file.exists() || !file.getParentFile().mkdirs() || file.createNewFile()) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
                bufferedOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveNV21ToFile(byte[] bArr, Size size, String str) {
        Bitmap bitmapNv21ToBitmap = nv21ToBitmap(bArr, size.getWidth(), size.getHeight());
        saveBitmapToFile(bitmapNv21ToBitmap, str);
        bitmapNv21ToBitmap.recycle();
    }

    public static Bitmap scaledBitmapToWidth(Bitmap bitmap, int i) {
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            i2 = (height * i) / width;
        } else {
            int i3 = (width * i) / height;
            i2 = i;
            i = i3;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, true);
    }
}
