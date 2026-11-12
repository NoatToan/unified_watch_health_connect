package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ws3 implements xu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us3 f38301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final us3 f38302b;

    public ws3(byte[] bArr) throws InvalidKeyException {
        this.f38301a = g(bArr, 1);
        this.f38302b = g(bArr, 0);
    }

    public static byte[] f(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    @Override // defpackage.xu0
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631 - this.f38301a.g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + this.f38301a.g() + 16);
        d(byteBufferAllocate, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // defpackage.xu0
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return c(ByteBuffer.wrap(bArr), bArr2);
    }

    public final byte[] c(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() < this.f38301a.g() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr2 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr3 = new byte[this.f38301a.g()];
        byteBuffer.get(bArr3);
        if (bArr == null) {
            bArr = new byte[0];
        }
        try {
            u2i.f(e(bArr3), f(bArr, byteBuffer), bArr2);
            byteBuffer.position(iPosition);
            return this.f38301a.e(byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public final void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr.length + this.f38301a.g() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.f38301a.f(byteBuffer, bArr);
        byteBuffer.position(iPosition);
        byte[] bArr3 = new byte[this.f38301a.g()];
        byteBuffer.get(bArr3);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrA = u2i.a(e(bArr3), f(bArr2, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrA);
    }

    public final byte[] e(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.f38302b.c(bArr, 0).get(bArr2);
        return bArr2;
    }

    public abstract us3 g(byte[] bArr, int i) throws InvalidKeyException;
}
