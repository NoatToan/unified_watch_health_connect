package nl2;

import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class g extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f126519d;

    private g(int i14) {
        super(4, 0L, 0);
        this.f126519d = i14;
    }

    public static g a(byte[] bArr) {
        if ((bArr == null ? 0 : bArr.length) < 13 || bArr[0] != 0 || bArr[1] != 4) {
            return null;
        }
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 2, bArr.length - 2);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            return new g(byteBufferWrap.get(12) & UnsignedBytes.MAX_VALUE);
        } catch (BufferUnderflowException unused) {
            return null;
        }
    }
}
