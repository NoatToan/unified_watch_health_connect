package com.huami.watchfacesstore.device.process;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes17.dex */
public class AndroidBmpUtil {
    public static final int TYPE_ARGB = 1;
    public static final int TYPE_RBG = 0;
    private static final int a = 4;

    private static boolean a(int width, int i) {
        return i > 0 && i % (width - 1) == 0;
    }

    private static boolean b(int width) {
        return width % 4 > 0;
    }

    private static byte[] c(int value) {
        return new byte[]{(byte) (value & 255), (byte) ((65280 & value) >> 8), (byte) ((value & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16)};
    }

    private static byte[] d(int value) {
        return new byte[]{(byte) (value & 255), (byte) ((65280 & value) >> 8), (byte) ((16711680 & value) >> 16), (byte) ((value & (-16777216)) >> 24)};
    }

    private static byte[] e(int value, int type) {
        if (type == 0) {
            return c(value);
        }
        return type == 1 ? d(value) : c(value);
    }

    public static boolean save(Bitmap orgBitmap, String filePath) {
        return save(orgBitmap, filePath, false, true);
    }

    public static byte[] writeInt(int value) {
        return new byte[]{(byte) (value & 255), (byte) ((65280 & value) >> 8), (byte) ((16711680 & value) >> 16), (byte) ((value & (-16777216)) >> 24)};
    }

    public static byte[] writeShort(short value) {
        return new byte[]{(byte) (value & 255), (byte) ((value & 65280) >> 8)};
    }

    public static boolean save(Bitmap orgBitmap, String filePath, boolean isFromToptoBottom, boolean withPadding) {
        return save(orgBitmap, filePath, isFromToptoBottom, withPadding, 3);
    }

    public static boolean save(Bitmap orgBitmap, String filePath, boolean isFromToptoBottom, boolean withPadding, int bmpType) {
        byte[] bArr;
        int i;
        boolean z;
        if (orgBitmap == null || filePath == null) {
            return false;
        }
        int width = orgBitmap.getWidth();
        int height = orgBitmap.getHeight();
        int i2 = bmpType == 1 ? 4 : 3;
        if (withPadding && b(width)) {
            i = 4 - (width % 4);
            int i3 = i * i2;
            byte[] bArr2 = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                bArr2[i4] = -1;
            }
            bArr = bArr2;
            z = true;
        } else {
            bArr = null;
            i = 0;
            z = false;
        }
        int i5 = width * height;
        int[] iArr = new int[i5];
        int i6 = (i5 * i2) + (i * height * i2);
        int i7 = i6 + 54;
        orgBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i7);
        try {
            byteBufferAllocate.put(a.l);
            byteBufferAllocate.put((byte) 77);
            byteBufferAllocate.put(writeInt(i7));
            byteBufferAllocate.put(writeShort((short) 0));
            byteBufferAllocate.put(writeShort((short) 0));
            byteBufferAllocate.put(writeInt(54));
            byteBufferAllocate.put(writeInt(40));
            byteBufferAllocate.put(writeInt(width));
            byteBufferAllocate.put(writeInt(height));
            byteBufferAllocate.put(writeShort((short) 1));
            byteBufferAllocate.put(writeShort((short) (i2 * 8)));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(i6));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(0));
            byteBufferAllocate.put(writeInt(0));
            for (int i8 = height; i8 > 0; i8--) {
                int i9 = isFromToptoBottom ? (height + 1) - i8 : i8;
                int i10 = i9 * width;
                for (int i11 = (i9 - 1) * width; i11 < i10; i11++) {
                    byteBufferAllocate.put(e(iArr[i11], bmpType));
                }
                if (z && withPadding) {
                    byteBufferAllocate.put(bArr);
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream.write(byteBufferAllocate.array());
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
