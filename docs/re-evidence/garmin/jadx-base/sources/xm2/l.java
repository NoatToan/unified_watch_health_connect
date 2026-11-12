package xm2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f191559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f191560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f191561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f191562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f191563f;

    public l(byte[] bArr) {
        if (bArr.length < 14) {
            vb.h.s("Invalid data length");
            throw null;
        }
        byte[] bArr2 = new byte[6];
        byte[] bArr3 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, 6);
        System.arraycopy(bArr, 6, bArr3, 0, 8);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferWrap.order(byteOrder);
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr3);
        byteBufferWrap2.order(byteOrder);
        ShortBuffer shortBufferAsShortBuffer = byteBufferWrap.asShortBuffer();
        IntBuffer intBufferAsIntBuffer = byteBufferWrap2.asIntBuffer();
        this.f191558a = shortBufferAsShortBuffer.get(0);
        this.f191559b = shortBufferAsShortBuffer.get(1);
        this.f191560c = shortBufferAsShortBuffer.get(2);
        this.f191561d = intBufferAsIntBuffer.get(0);
        this.f191562e = intBufferAsIntBuffer.get(1);
        this.f191563f = System.currentTimeMillis();
    }

    public final String toString() {
        return String.format("Vigorous: %d, Moderate: %d", Integer.valueOf(this.f191560c), Integer.valueOf(this.f191559b));
    }
}
