package xm2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191569b;

    public o(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        this.f191568a = byteBufferWrap.get(0);
        this.f191569b = System.currentTimeMillis();
    }
}
