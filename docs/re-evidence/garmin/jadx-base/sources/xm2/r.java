package xm2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f191580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f191581c;

    public r(byte[] bArr) {
        if (bArr.length < 4) {
            vb.h.s("Invalid data length");
            throw null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer intBufferAsIntBuffer = byteBufferWrap.asIntBuffer();
        this.f191579a = intBufferAsIntBuffer.get(0);
        this.f191580b = bArr.length >= 8 ? intBufferAsIntBuffer.get(1) : -1;
        this.f191581c = System.currentTimeMillis();
    }
}
