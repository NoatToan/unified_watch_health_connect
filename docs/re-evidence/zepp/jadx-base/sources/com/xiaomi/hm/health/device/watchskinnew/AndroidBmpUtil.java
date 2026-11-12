package com.xiaomi.hm.health.device.watchskinnew;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes19.dex */
public class AndroidBmpUtil {
    public static final int TYPE_ARGB = 1;
    public static final int TYPE_RBG = 0;
    private static final int a = 4;

    private static boolean a(int i, int i2) {
        return i2 > 0 && i2 % (i - 1) == 0;
    }

    private static boolean b(int i) {
        return i % 4 > 0;
    }

    private static byte[] c(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((i & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16)};
    }

    private static byte[] d(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & (-16777216)) >> 24)};
    }

    private static byte[] e(int i, int i2) {
        if (i2 == 0) {
            return c(i);
        }
        return i2 == 1 ? d(i) : c(i);
    }

    public static boolean save(Bitmap bitmap, String str) {
        return save(bitmap, str, false, true);
    }

    public static byte[] writeInt(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & (-16777216)) >> 24)};
    }

    public static byte[] writeShort(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s & 65280) >> 8)};
    }

    public static boolean save(Bitmap bitmap, String str, boolean z, boolean z2) {
        return save(bitmap, str, z, z2, 3);
    }

    public static boolean save(Bitmap bitmap, String str, boolean z, boolean z2, int i) {
        byte[] bArr;
        int i2;
        boolean z3;
        if (bitmap == null || str == null) {
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = i == 1 ? 4 : 3;
        if (z2 && b(width)) {
            i2 = 4 - (width % 4);
            int i4 = i2 * i3;
            byte[] bArr2 = new byte[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                bArr2[i5] = -1;
            }
            bArr = bArr2;
            z3 = true;
        } else {
            bArr = null;
            i2 = 0;
            z3 = false;
        }
        int i6 = width * height;
        int[] iArr = new int[i6];
        int i7 = (i6 * i3) + (i2 * height * i3);
        int i8 = i7 + 54;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
        try {
            byteBufferAllocate.put(a.l);
            byteBufferAllocate.put((byte) 77);
            byteBufferAllocate.put(writeInt(i8));
            byteBufferAllocate.put(writeShort((short) 0));
            byteBufferAllocate.put(writeShort((short) 0));
            byteBufferAllocate.put(writeInt(54));
            byteBufferAllocate.put(writeInt(40));
            byteBufferAllocate.put(writeInt(width));
            byteBufferAllocate.put(writeInt(height));
            byteBufferAllocate.put(writeShort((short) 1));
            byteBufferAllocate.put(writeShort((short) (i3 * 8)));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(i7));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(0));
            for (int i9 = height; i9 > 0; i9--) {
                int i10 = z ? (height + 1) - i9 : i9;
                int i11 = i10 * width;
                for (int i12 = (i10 - 1) * width; i12 < i11; i12++) {
                    byteBufferAllocate.put(e(iArr[i12], i));
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
}
