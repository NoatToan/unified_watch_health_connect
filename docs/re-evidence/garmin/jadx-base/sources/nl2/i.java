package nl2;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class i extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f126525d;

    private i(long j8, int i14, int i15) {
        super(-1, j8, i14);
        this.f126525d = i15;
    }

    public static i a(byte[] bArr) {
        if (bArr == null || bArr.length < 13 || bArr[0] != 0 || bArr[1] != -1) {
            return null;
        }
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 2, bArr.length - 2);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            return new i(byteBufferWrap.getLong(), byteBufferWrap.getShort() & 65535, byteBufferWrap.get());
        } catch (BufferUnderflowException unused) {
            return null;
        }
    }
}
