package xm2;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes11.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f191550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f191551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f191552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f191553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f191554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f191555f;

    public i(byte[] bArr) {
        if (bArr.length < 5) {
            vb.h.s("Invalid data length");
            throw null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b14 = byteBufferWrap.get(0);
        if (j.values().length > b14) {
            this.f191550a = j.values()[b14];
        } else {
            this.f191550a = j.NO_SOURCE;
        }
        int i14 = byteBufferWrap.get(1) & UnsignedBytes.MAX_VALUE;
        int i15 = byteBufferWrap.get(2) & UnsignedBytes.MAX_VALUE;
        int i16 = byteBufferWrap.get(3) & UnsignedBytes.MAX_VALUE;
        int i17 = byteBufferWrap.get(4) & UnsignedBytes.MAX_VALUE;
        this.f191551b = i14 == 255 ? -1 : i14;
        this.f191552c = i15 == 255 ? -1 : i15;
        this.f191553d = i16 == 255 ? -1 : i16;
        this.f191554e = i17 == 255 ? -1 : i17;
        this.f191555f = System.currentTimeMillis();
    }
}
