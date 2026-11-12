package xm2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f191525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f191526c;

    public f(byte[] bArr) {
        if (bArr.length < 4) {
            vb.h.s("Invalid data length");
            throw null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer intBufferAsIntBuffer = byteBufferWrap.asIntBuffer();
        this.f191524a = intBufferAsIntBuffer.get(0);
        this.f191525b = bArr.length >= 8 ? intBufferAsIntBuffer.get(1) : -1;
        this.f191526c = System.currentTimeMillis();
    }
}
