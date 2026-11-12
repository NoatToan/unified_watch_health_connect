package defpackage;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ggt {
    public static boolean a(int i) {
        return i % 4 > 0;
    }

    public static boolean b(Bitmap bitmap, String str, boolean z, boolean z2) {
        int i;
        boolean z3;
        byte[] bArr;
        if (bitmap == null || str == null) {
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (z2 && a(width)) {
            i = 4 - (width % 4);
            int i2 = i * 3;
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr2[i3] = -1;
            }
            bArr = bArr2;
            z3 = true;
        } else {
            i = 0;
            z3 = false;
            bArr = null;
        }
        int i4 = width * height;
        int[] iArr = new int[i4];
        int i5 = (i4 * 3) + (i * height * 3);
        int i6 = i5 + 54;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i6);
        try {
            byteBufferAllocate.put((byte) 66);
            byteBufferAllocate.put((byte) 77);
            byteBufferAllocate.put(e(i6));
            byteBufferAllocate.put(c((short) 0));
            byteBufferAllocate.put(c((short) 0));
            byteBufferAllocate.put(e(54));
            byteBufferAllocate.put(e(40));
            byteBufferAllocate.put(e(width));
            byteBufferAllocate.put(e(height));
            byteBufferAllocate.put(c((short) 1));
            byteBufferAllocate.put(c((short) 24));
            byteBufferAllocate.put(e(0));
            byteBufferAllocate.put(e(i5));
            byteBufferAllocate.put(e(0));
            byteBufferAllocate.put(e(0));
            byteBufferAllocate.put(e(0));
            byteBufferAllocate.put(e(0));
            for (int i7 = height; i7 > 0; i7--) {
                int i8 = z ? (height + 1) - i7 : i7;
                int i9 = i8 * width;
                for (int i10 = (i8 - 1) * width; i10 < i9; i10++) {
                    byteBufferAllocate.put(d(iArr[i10]));
                }
                if (z3 && z2) {
                    byteBufferAllocate.put(bArr);
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(byteBufferAllocate.array());
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static byte[] c(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s & 65280) >> 8)};
    }

    public static byte[] d(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((i & 16711680) >> 16)};
    }

    public static byte[] e(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & (-16777216)) >> 24)};
    }
}
