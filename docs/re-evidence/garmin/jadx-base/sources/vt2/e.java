package vt2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class e extends n<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f180197b;

    public e(byte[] bArr) {
        super(bArr[0]);
        this.f180197b = Integer.valueOf(ByteBuffer.wrap(bArr, 1, bArr.length - 1).getInt());
    }

    @Override // vt2.n
    public final int c() {
        return 5;
    }

    @Override // vt2.n
    public final byte[] d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((byte) 19);
        byteBufferAllocate.putInt(this.f180197b.intValue());
        return byteBufferAllocate.array();
    }

    @Override // vt2.n
    public final Integer e() {
        Integer num = this.f180197b;
        num.intValue();
        return num;
    }

    public e(Integer num) {
        super((byte) 19);
        this.f180197b = num;
    }
}
