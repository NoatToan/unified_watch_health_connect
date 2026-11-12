package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes5.dex */
public final class vs3 extends ws3 {
    public vs3(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // defpackage.ws3, defpackage.xu0
    public /* bridge */ /* synthetic */ byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.a(bArr, bArr2);
    }

    @Override // defpackage.ws3, defpackage.xu0
    public /* bridge */ /* synthetic */ byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.b(bArr, bArr2);
    }

    @Override // defpackage.ws3
    public us3 g(byte[] bArr, int i) throws InvalidKeyException {
        return new ts3(bArr, i);
    }
}
