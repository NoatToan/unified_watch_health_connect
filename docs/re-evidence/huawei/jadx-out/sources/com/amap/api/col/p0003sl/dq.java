package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class dq {
    public static Drawable a(Context context, String str) throws Exception {
        Bitmap bitmapB = b(context, str);
        if (bitmapB.getNinePatchChunk() == null) {
            return new BitmapDrawable(context.getResources(), bitmapB);
        }
        Rect rect = new Rect();
        a(bitmapB.getNinePatchChunk(), rect);
        return new NinePatchDrawable(context.getResources(), bitmapB, bitmapB.getNinePatchChunk(), rect, null);
    }

    private static Bitmap a(InputStream inputStream) throws Exception {
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
        byte[] bArrA = a(bitmapDecodeStream);
        if (!NinePatch.isNinePatchChunk(bArrA)) {
            return bitmapDecodeStream;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 1, 1, bitmapDecodeStream.getWidth() - 2, bitmapDecodeStream.getHeight() - 2);
        eb.a(bitmapDecodeStream);
        if (Build.VERSION.SDK_INT >= 28) {
            Method declaredMethod = bitmapCreateBitmap.getClass().getDeclaredMethod("setNinePatchChunk", byte[].class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(bitmapCreateBitmap, bArrA);
            return bitmapCreateBitmap;
        }
        Field declaredField = bitmapCreateBitmap.getClass().getDeclaredField("mNinePatchChunk");
        declaredField.setAccessible(true);
        declaredField.set(bitmapCreateBitmap, bArrA);
        return bitmapCreateBitmap;
    }

    private static Bitmap b(Context context, String str) throws Exception {
        InputStream inputStreamOpen = dv.a(context).open(str);
        Bitmap bitmapA = a(inputStreamOpen);
        inputStreamOpen.close();
        return bitmapA;
    }

    private static void a(byte[] bArr, Rect rect) {
        rect.left = a(bArr, 12);
        rect.right = a(bArr, 16);
        rect.top = a(bArr, 20);
        rect.bottom = a(bArr, 24);
    }

    private static byte[] a(Bitmap bitmap) throws IOException {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < 32; i++) {
            byteArrayOutputStream.write(0);
        }
        int i2 = width - 2;
        int[] iArr = new int[i2];
        bitmap.getPixels(iArr, 0, width, 1, 0, i2, 1);
        boolean z = iArr[0] == -16777216;
        boolean z2 = iArr[width - 3] == -16777216;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i4 != iArr[i5]) {
                i3++;
                a(byteArrayOutputStream, i5);
                i4 = iArr[i5];
            }
        }
        if (z2) {
            i3++;
            a(byteArrayOutputStream, i2);
        }
        int i6 = i3 + 1;
        if (z) {
            i6 = i3;
        }
        if (z2) {
            i6--;
        }
        int i7 = height - 2;
        int[] iArr2 = new int[i7];
        bitmap.getPixels(iArr2, 0, 1, 0, 1, 1, i7);
        boolean z3 = iArr2[0] == -16777216;
        boolean z4 = iArr2[height - 3] == -16777216;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i9 != iArr2[i10]) {
                i8++;
                a(byteArrayOutputStream, i10);
                i9 = iArr2[i10];
            }
        }
        if (z4) {
            i8++;
            a(byteArrayOutputStream, i7);
        }
        int i11 = i8 + 1;
        if (z3) {
            i11 = i8;
        }
        if (z4) {
            i11--;
        }
        int i12 = 0;
        while (true) {
            int i13 = i6 * i11;
            if (i12 < i13) {
                a(byteArrayOutputStream, 1);
                i12++;
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray[0] = 1;
                byteArray[1] = (byte) i3;
                byteArray[2] = (byte) i8;
                byteArray[3] = (byte) i13;
                a(bitmap, byteArray);
                return byteArray;
            }
        }
    }

    private static void a(Bitmap bitmap, byte[] bArr) {
        int width = bitmap.getWidth();
        int i = width - 2;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, i, 1, bitmap.getHeight() - 1, i, 1);
        for (int i2 = 0; i2 < i; i2++) {
            if (-16777216 == iArr[i2]) {
                a(bArr, 12, i2);
                break;
            }
        }
        for (int i3 = width - 3; i3 >= 0; i3--) {
            if (-16777216 == iArr[i3]) {
                a(bArr, 16, (i - i3) - 2);
                break;
            }
        }
        int height = bitmap.getHeight();
        int i4 = height - 2;
        int[] iArr2 = new int[i4];
        bitmap.getPixels(iArr2, 0, 1, bitmap.getWidth() - 1, 0, 1, i4);
        for (int i5 = 0; i5 < i4; i5++) {
            if (-16777216 == iArr2[i5]) {
                a(bArr, 20, i5);
                break;
            }
        }
        for (int i6 = height - 3; i6 >= 0; i6--) {
            if (-16777216 == iArr2[i6]) {
                a(bArr, 24, (i4 - i6) - 2);
                return;
            }
        }
    }

    private static void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    private static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    private static int a(byte[] bArr, int i) {
        return (bArr[i + 3] << Ascii.CAN) | (bArr[i] & 255) | (bArr[i + 1] << 8) | (bArr[i + 2] << 16);
    }
}
