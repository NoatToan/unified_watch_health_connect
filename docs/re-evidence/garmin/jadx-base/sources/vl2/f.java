package vl2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class f {
    public static short a(byte[] bArr, int i14) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(bArr[i14]);
        byteBufferAllocate.put(bArr[i14 + 1]);
        return byteBufferAllocate.getShort(0);
    }
}
