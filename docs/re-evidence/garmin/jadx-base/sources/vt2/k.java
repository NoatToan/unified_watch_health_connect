package vt2;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class k extends n<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f180203b;

    public k(byte[] bArr) {
        super(bArr[0]);
        this.f180203b = ByteBuffer.wrap(bArr, 1, bArr.length - 1).getLong();
    }

    @Override // vt2.n
    public final int c() {
        return 9;
    }

    @Override // vt2.n
    public final byte[] d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(9);
        byteBufferAllocate.put(Ascii.SO);
        byteBufferAllocate.putLong(this.f180203b);
        return byteBufferAllocate.array();
    }

    @Override // vt2.n
    public final Long e() {
        return Long.valueOf(this.f180203b);
    }

    public k(long j8) {
        super(Ascii.SO);
        this.f180203b = j8;
    }
}
