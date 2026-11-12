package xm2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191523b;

    public e(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        this.f191522a = byteBufferWrap.get(0);
        this.f191523b = System.currentTimeMillis();
    }
}
