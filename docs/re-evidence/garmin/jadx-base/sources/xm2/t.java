package xm2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f191583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f191584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f191585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f191586e;

    public t(byte[] bArr) {
        if (bArr.length < 4) {
            vb.h.s("Invalid data length");
            throw null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        this.f191582a = byteBufferWrap.get(0);
        this.f191583b = byteBufferWrap.get(1);
        this.f191584c = byteBufferWrap.get(2);
        this.f191585d = byteBufferWrap.get(3);
        this.f191586e = System.currentTimeMillis();
    }

    public final String toString() {
        return String.format("status: %d, level: %d , feedback: %d validSleep: %d", Integer.valueOf(this.f191582a), Integer.valueOf(this.f191583b), Integer.valueOf(this.f191584c), Integer.valueOf(this.f191585d));
    }
}
