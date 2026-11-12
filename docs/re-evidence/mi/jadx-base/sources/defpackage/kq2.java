package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Base64;
import com.xiaomi.fitness.common.log.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class kq2 {
    public static Bitmap a(String str, float f) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("data:image/jpeg;base64,")) {
            str = str.replace("data:image/jpeg;base64,", "");
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        return bitmapDecodeByteArray != null ? Bitmap.createScaledBitmap(bitmapDecodeByteArray, (int) (bitmapDecodeByteArray.getWidth() * f), (int) (bitmapDecodeByteArray.getHeight() * f), true) : bitmapDecodeByteArray;
    }

    public static byte[] b(Bitmap bitmap, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        if (z) {
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArray;
    }

    public static Boolean c(Bitmap bitmap, String str) throws Throwable {
        if (bitmap == null) {
            return Boolean.FALSE;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    return Boolean.FALSE;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        Logger.e("BitmapUtil", "saveBitmap: ", e);
                    }
                    return Boolean.TRUE;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Logger.e("BitmapUtil", "saveBitmap: ", e);
                    Boolean bool = Boolean.FALSE;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            Logger.e("BitmapUtil", "saveBitmap: ", e3);
                        }
                    }
                    return bool;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            Logger.e("BitmapUtil", "saveBitmap: ", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public static Boolean d(Bitmap bitmap, String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        return e(byteBufferAllocate.array(), str);
    }

    public static Boolean e(byte[] bArr, String str) {
        return Boolean.valueOf(r72.a(new ByteArrayInputStream(bArr), str));
    }

    public static Boolean f(Bitmap bitmap, String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        return g(byteBufferAllocate.array(), str);
    }

    public static Boolean g(byte[] bArr, String str) {
        for (int i = 0; i < bArr.length; i += 2) {
            int i2 = i + 1;
            byte b2 = bArr[i2];
            bArr[i2] = bArr[i];
            bArr[i] = b2;
        }
        return Boolean.valueOf(r72.a(new ByteArrayInputStream(bArr), str));
    }

    public static Boolean h(Bitmap bitmap, String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        byte[] bArrArray = byteBufferAllocate.array();
        return Boolean.valueOf(r72.a(new ByteArrayInputStream(z ? j(bArrArray) : i(bArrArray)), str));
    }

    public static byte[] i(byte[] bArr) {
        int length = bArr.length;
        if (length % 4 != 0) {
            return new byte[0];
        }
        int i = length - (length / 4);
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 3) {
            byte b2 = bArr[i2];
            byte b3 = bArr[i2 + 1];
            byte b4 = bArr[i2 + 2];
            byte b5 = bArr[i2 + 3];
            bArr2[i3] = (byte) ((b2 & 248) | ((b3 >> 5) & 7));
            bArr2[i3 + 1] = (byte) (((b3 & 28) << 3) | ((b4 >> 3) & 31));
            bArr2[i3 + 2] = b5;
            i2 += 4;
        }
        return bArr2;
    }

    public static byte[] j(byte[] bArr) {
        int length = bArr.length;
        if (length % 4 != 0) {
            return new byte[0];
        }
        int i = length - (length / 4);
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 3) {
            byte b2 = bArr[i2];
            byte b3 = bArr[i2 + 1];
            byte b4 = bArr[i2 + 2];
            byte b5 = bArr[i2 + 3];
            bArr2[i3] = (byte) (((b4 >> 3) & 31) | ((b3 & 28) << 3));
            bArr2[i3 + 1] = (byte) ((b2 & 248) | ((b3 >> 5) & 7));
            bArr2[i3 + 2] = b5;
            i2 += 4;
        }
        return bArr2;
    }

    public static Boolean k(Bitmap bitmap, String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        return l(byteBufferAllocate.array(), str);
    }

    public static Boolean l(byte[] bArr, String str) {
        if (bArr.length < 4) {
            return Boolean.FALSE;
        }
        Logger.i("saveBytesTo8888 length = " + bArr.length, new Object[0]);
        for (int i = 0; i < bArr.length; i += 4) {
            byte b2 = bArr[i];
            int i2 = i + 2;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return Boolean.valueOf(r72.a(new ByteArrayInputStream(bArr), str));
    }

    public static Bitmap m(Bitmap bitmap, float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.postScale(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
