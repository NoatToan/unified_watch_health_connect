package vt2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class c extends n<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f180195b;

    public c(byte[] bArr) {
        super(bArr[0]);
        this.f180195b = ByteBuffer.wrap(bArr, 1, bArr.length - 1).get() > 0;
    }

    @Override // vt2.n
    public final int c() {
        return 2;
    }

    @Override // vt2.n
    public final byte[] d() {
        return new byte[]{9, this.f180195b ? (byte) 1 : (byte) 0};
    }

    @Override // vt2.n
    public final Boolean e() {
        return Boolean.valueOf(this.f180195b);
    }

    public c(boolean z14) {
        super((byte) 9);
        this.f180195b = z14;
    }
}
