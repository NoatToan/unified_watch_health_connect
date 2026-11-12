package nl2;

import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f126502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f126503e;

    private b(long j8, int i14, int i15, int i16) {
        super(3, j8, i14);
        this.f126502d = i15;
        this.f126503e = i16;
    }

    public static b a(byte[] bArr) {
        if (bArr == null || bArr.length < 14 || bArr[0] != 0 || bArr[1] != 3) {
            return null;
        }
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 2, bArr.length - 2);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            return new b(byteBufferWrap.getLong(), byteBufferWrap.getShort() & 65535, byteBufferWrap.get() & UnsignedBytes.MAX_VALUE, byteBufferWrap.get());
        } catch (BufferUnderflowException unused) {
            return null;
        }
    }
}
