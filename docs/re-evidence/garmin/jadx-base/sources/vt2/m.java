package vt2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class m extends n<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f180204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f180205c;

    public m(byte[] bArr) {
        super(bArr[0]);
        this.f180204b = ByteBuffer.wrap(bArr, 1, bArr.length - 1).getInt();
    }

    @Override // vt2.n
    public final int c() {
        return 5;
    }

    @Override // vt2.n
    public final byte[] d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.putInt(this.f180204b);
        return byteBufferAllocate.array();
    }

    @Override // vt2.n
    public final String e() {
        return this.f180205c;
    }

    @Override // vt2.n
    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).f180205c.equals(this.f180205c);
        }
        return false;
    }

    @Override // vt2.n
    public final int hashCode() {
        String str = this.f180205c;
        return 445 + (str != null ? str.hashCode() : 0);
    }

    public m(String str) {
        super((byte) 3);
        this.f180205c = str;
    }
}
