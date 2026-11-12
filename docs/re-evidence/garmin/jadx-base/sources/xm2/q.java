package xm2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class q {
    public q(byte[] bArr) {
        for (byte b14 : bArr) {
            if (b14 != -1) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferWrap.get(0);
                byteBufferWrap.getInt(1);
                return;
            }
        }
        vb.h.z("All data was invalid, reconnect packet.");
        throw null;
    }
}
