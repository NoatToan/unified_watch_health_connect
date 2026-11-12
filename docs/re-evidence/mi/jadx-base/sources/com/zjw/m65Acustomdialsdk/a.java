package com.zjw.m65Acustomdialsdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static int a(byte[] bArr, int i, int i2) {
        return f(g(bArr, i, i2));
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap c(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, i, i2, (Paint) null);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static byte[] d(Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        byte[] bArr = new byte[112];
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i4 & 255);
        bArr[2] = (byte) ((i4 & 65280) >> 8);
        bArr[3] = (byte) (i5 & 255);
        bArr[4] = (byte) ((i5 & 65280) >> 8);
        bArr[5] = (byte) (width & 255);
        bArr[6] = (byte) ((width & 65280) >> 8);
        bArr[7] = (byte) (height & 255);
        bArr[8] = (byte) ((height & 65280) >> 8);
        bArr[9] = 1;
        bArr[10] = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("pos = ");
        sb.append(11);
        sb.append(" address = ");
        sb.append(i2);
        bArr[11] = (byte) (i2 & 255);
        bArr[12] = (byte) ((i2 & 65280) >> 8);
        bArr[13] = (byte) ((i2 & 16711680) >> 16);
        bArr[14] = (byte) (i2 >> 24);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("pos = ");
        sb2.append(15);
        sb2.append(" size = ");
        sb2.append(i3);
        bArr[15] = (byte) (i3 & 255);
        bArr[16] = (byte) ((65280 & i3) >> 8);
        bArr[17] = (byte) ((16711680 & i3) >> 16);
        bArr[18] = (byte) (i3 >> 24);
        return bArr;
    }

    public static byte[] e(byte[] bArr) {
        return LzoUtils.INSTANCE.a().a(bArr);
    }

    public static int f(byte[] bArr) {
        int i;
        byte b2;
        if (bArr.length == 1) {
            return bArr[0] & 255;
        }
        if (bArr.length == 2) {
            i = (bArr[0] & 255) << 8;
            b2 = bArr[1];
        } else if (bArr.length == 3) {
            i = ((bArr[0] & 65535) << 16) | ((bArr[1] & 255) << 8);
            b2 = bArr[2];
        } else {
            if (bArr.length != 4) {
                return 0;
            }
            i = ((bArr[0] & 16777215) << 24) | ((bArr[1] & 65535) << 16) | ((bArr[2] & 255) << 8);
            b2 = bArr[3];
        }
        return i | (b2 & 255);
    }

    public static byte[] g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
