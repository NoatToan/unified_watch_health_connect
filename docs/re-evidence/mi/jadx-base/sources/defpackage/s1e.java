package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes5.dex */
public final class s1e implements xu0 {
    public static final byte[] c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0e f33165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xu0 f33166b;

    public s1e(k0e k0eVar, xu0 xu0Var) {
        this.f33165a = k0eVar;
        this.f33166b = xu0Var;
    }

    @Override // defpackage.xu0
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] byteArray = cdk.o(this.f33165a).toByteArray();
        return c(this.f33166b.a(byteArray, c), ((xu0) cdk.i(this.f33165a.I(), byteArray, xu0.class)).a(bArr, bArr2));
    }

    @Override // defpackage.xu0
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((xu0) cdk.i(this.f33165a.I(), this.f33166b.b(bArr3, c), xu0.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }
}
