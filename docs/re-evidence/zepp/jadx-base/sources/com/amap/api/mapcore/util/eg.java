package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class eg {
    private static void a(Bitmap bitmap, byte[] bArr) {
        int width = bitmap.getWidth() - 2;
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, width, 1, bitmap.getHeight() - 1, width, 1);
        for (int i = 0; i < width; i++) {
            if (-16777216 == iArr[i]) {
                a(bArr, 12, i);
                break;
            }
        }
        for (int i2 = width - 1; i2 >= 0; i2--) {
            if (-16777216 == iArr[i2]) {
                a(bArr, 16, (width - i2) - 2);
                break;
            }
        }
        int height = bitmap.getHeight() - 2;
        int[] iArr2 = new int[height];
        bitmap.getPixels(iArr2, 0, 1, bitmap.getWidth() - 1, 0, 1, height);
        for (int i3 = 0; i3 < height; i3++) {
            if (-16777216 == iArr2[i3]) {
                a(bArr, 20, i3);
                break;
            }
        }
        for (int i4 = height - 1; i4 >= 0; i4--) {
            if (-16777216 == iArr2[i4]) {
                a(bArr, 24, (height - i4) - 2);
                return;
            }
        }
    }

    private static void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    private static void a(byte[] bArr, int i, int i2) {
        bArr[i + 0] = (byte) (i2 >> 0);
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    private static int a(byte[] bArr, int i) {
        byte b = bArr[i + 0];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        return (bArr[i + 3] << 24) | (b & 255) | (b2 << 8) | (b3 << 16);
    }

    public static Drawable a(Context context, String str) throws Exception {
        int i;
        Bitmap bitmap;
        InputStream inputStreamOpen = el.a(context).open(str);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
        int width = bitmapDecodeStream.getWidth();
        int height = bitmapDecodeStream.getHeight();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 < 32; i2++) {
            byteArrayOutputStream.write(0);
        }
        int i3 = width - 2;
        int[] iArr = new int[i3];
        bitmapDecodeStream.getPixels(iArr, 0, width, 1, 0, i3, 1);
        boolean z = iArr[0] == -16777216;
        boolean z2 = iArr[i3 + (-1)] == -16777216;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (i4 != iArr[i6]) {
                i5++;
                a(byteArrayOutputStream, i6);
                i4 = iArr[i6];
            }
        }
        if (z2) {
            i5++;
            a(byteArrayOutputStream, i3);
        }
        int i7 = i5;
        int i8 = i7 + 1;
        if (z) {
            i8--;
        }
        if (z2) {
            i8--;
        }
        int i9 = i8;
        int i10 = height - 2;
        int[] iArr2 = new int[i10];
        bitmapDecodeStream.getPixels(iArr2, 0, 1, 0, 1, 1, i10);
        boolean z3 = iArr2[0] == -16777216;
        boolean z4 = iArr2[i10 + (-1)] == -16777216;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != iArr2[i13]) {
                i12++;
                a(byteArrayOutputStream, i13);
                i11 = iArr2[i13];
            }
        }
        if (z4) {
            i12++;
            a(byteArrayOutputStream, i10);
        }
        int i14 = i12 + 1;
        if (z3) {
            i14--;
        }
        if (z4) {
            i14--;
        }
        int i15 = 0;
        while (true) {
            i = i9 * i14;
            if (i15 >= i) {
                break;
            }
            a(byteArrayOutputStream, 1);
            i15++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray[0] = 1;
        byteArray[1] = (byte) i7;
        byteArray[2] = (byte) i12;
        byteArray[3] = (byte) i;
        a(bitmapDecodeStream, byteArray);
        if (NinePatch.isNinePatchChunk(byteArray)) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 1, 1, bitmapDecodeStream.getWidth() - 2, bitmapDecodeStream.getHeight() - 2);
            er.c(bitmapDecodeStream);
            if (Build.VERSION.SDK_INT >= 28) {
                Method declaredMethod = bitmapCreateBitmap.getClass().getDeclaredMethod("setNinePatchChunk", byte[].class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(bitmapCreateBitmap, byteArray);
            } else {
                Field declaredField = bitmapCreateBitmap.getClass().getDeclaredField("mNinePatchChunk");
                declaredField.setAccessible(true);
                declaredField.set(bitmapCreateBitmap, byteArray);
            }
            bitmap = bitmapCreateBitmap;
        } else {
            bitmap = bitmapDecodeStream;
        }
        inputStreamOpen.close();
        if (bitmap.getNinePatchChunk() == null) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        Rect rect = new Rect();
        byte[] ninePatchChunk = bitmap.getNinePatchChunk();
        rect.left = a(ninePatchChunk, 12);
        rect.right = a(ninePatchChunk, 16);
        rect.top = a(ninePatchChunk, 20);
        rect.bottom = a(ninePatchChunk, 24);
        return new NinePatchDrawable(context.getResources(), bitmap, bitmap.getNinePatchChunk(), rect, null);
    }
}
