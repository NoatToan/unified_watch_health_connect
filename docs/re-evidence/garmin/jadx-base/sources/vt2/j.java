package vt2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class j extends n<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180202b;

    public j(byte[] bArr) {
        super(bArr[0]);
        this.f180202b = ByteBuffer.wrap(bArr, 1, bArr.length - 1).getInt();
    }

    @Override // vt2.n
    public final int c() {
        return 5;
    }

    @Override // vt2.n
    public final byte[] d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put(this.f180206a);
        byteBufferAllocate.putInt(this.f180202b);
        return byteBufferAllocate.array();
    }

    @Override // vt2.n
    public final Integer e() {
        return Integer.valueOf(this.f180202b);
    }

    public j(int i14) {
        super((byte) 1);
        this.f180202b = i14;
    }
}
