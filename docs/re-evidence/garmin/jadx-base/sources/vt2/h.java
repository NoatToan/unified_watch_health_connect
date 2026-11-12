package vt2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class h extends n<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f180199b;

    public h(byte[] bArr) {
        super(bArr[0]);
        this.f180199b = ByteBuffer.wrap(bArr, 1, bArr.length - 1).getFloat();
    }

    @Override // vt2.n
    public final int c() {
        return 5;
    }

    @Override // vt2.n
    public final byte[] d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.putFloat(this.f180199b);
        return byteBufferAllocate.array();
    }

    @Override // vt2.n
    public final Float e() {
        return Float.valueOf(this.f180199b);
    }

    public h(float f14) {
        super((byte) 2);
        this.f180199b = f14;
    }
}
