package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class ca8 implements xu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7d f5119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aze f5120b;
    public final int c;

    public ca8(k7d k7dVar, aze azeVar, int i) {
        this.f5119a = k7dVar;
        this.f5120b = azeVar;
        this.c = i;
    }

    @Override // defpackage.xu0
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = this.f5119a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return b83.a(bArrA, this.f5120b.b(b83.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // defpackage.xu0
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f5120b.a(bArrCopyOfRange2, b83.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f5119a.b(bArrCopyOfRange);
    }
}
