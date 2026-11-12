package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes5.dex */
public class l8i implements aze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8i f24781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24782b;

    public l8i(i8i i8iVar, int i) throws GeneralSecurityException {
        this.f24781a = i8iVar;
        this.f24782b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        i8iVar.a(new byte[0], i);
    }

    @Override // defpackage.aze
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!b83.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // defpackage.aze
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        return this.f24781a.a(bArr, this.f24782b);
    }
}
