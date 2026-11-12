package com.huawei.maps.offlinedata.service.device.tlvtools;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {
    private static byte[] a(byte[] bArr, int i) throws g {
        int i2 = 0;
        int i3 = i;
        while ((bArr[i3] & 128) == 128) {
            i3++;
            i2++;
            if (i2 == 3) {
                throw new g();
            }
        }
        int i4 = i2 + 1;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i4);
        byteBufferAllocate.put(bArr, i, i4);
        return byteBufferAllocate.array();
    }

    public static d b(byte[] bArr) {
        return b(bArr, 0);
    }

    private static d b(byte[] bArr, int i) throws g {
        d dVar = new d();
        if (bArr == null || bArr.length == 0) {
            com.huawei.maps.offlinedata.utils.g.d("TlvByteUtils", "hexString is null");
            return dVar;
        }
        if (i > 50) {
            throw new g();
        }
        int i2 = 0;
        while (i2 != bArr.length) {
            try {
                byte b2 = bArr[i2];
                if (b2 == 0) {
                    throw new g();
                }
                int i3 = i2 + 1;
                byte[] bArrA = a(bArr, i3);
                int length = i3 + bArrA.length;
                int iA = a(bArrA);
                byte[] bArrArray = ByteBuffer.allocate(iA).put(bArr, length, iA).array();
                i2 = length + iA;
                if ((b2 & 128) == 128) {
                    dVar.a().add(b(bArrArray, i + 1));
                } else {
                    dVar.b().add(new f(b2, iA, bArrArray));
                }
            } catch (IndexOutOfBoundsException e) {
                com.huawei.maps.offlinedata.utils.g.b("TlvByteUtils", "parseTlv occur exception " + e.getMessage());
                throw new g();
            }
        }
        return dVar;
    }

    private static int a(byte[] bArr) throws g {
        byte b2;
        int i;
        int length = bArr.length;
        if (length == 1) {
            byte b3 = bArr[0];
            if ((b3 & 128) != 128) {
                return b3;
            }
            throw new g();
        }
        if (length == 2) {
            byte b4 = bArr[0];
            if ((b4 & 128) == 128) {
                b2 = bArr[1];
                if ((b2 & 128) == 128) {
                    throw new g();
                }
                i = (b4 & Ascii.DEL) << 7;
            } else {
                throw new g();
            }
        } else if (length == 3) {
            byte b5 = bArr[0];
            if ((b5 & 128) == 128) {
                byte b6 = bArr[1];
                if ((b6 & 128) == 128) {
                    b2 = bArr[2];
                    if ((b2 & 128) == 128) {
                        throw new g();
                    }
                    i = ((b5 & Ascii.DEL) << 14) | ((b6 & Ascii.DEL) << 7);
                } else {
                    throw new g();
                }
            } else {
                throw new g();
            }
        } else {
            throw new g();
        }
        return (b2 & Ascii.DEL) | i;
    }
}
