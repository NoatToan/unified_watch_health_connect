package xm2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f191519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f191520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f191521d;

    public d(byte[] bArr) {
        if (bArr.length < 6) {
            vb.h.s("Invalid data length");
            throw null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer shortBufferAsShortBuffer = byteBufferWrap.asShortBuffer();
        this.f191518a = shortBufferAsShortBuffer.get(0);
        this.f191519b = shortBufferAsShortBuffer.get(1);
        this.f191520c = shortBufferAsShortBuffer.get(2);
        this.f191521d = System.currentTimeMillis();
    }
}
