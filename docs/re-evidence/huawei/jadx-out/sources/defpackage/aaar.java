package defpackage;

import com.huawei.operation.utils.Constants;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import org.eclipse.californium.scandium.dtls.CompressionMethod;
import org.eclipse.californium.scandium.dtls.DTLSConnectionState;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;

/* JADX INFO: loaded from: classes20.dex */
public class aaar extends DTLSConnectionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f46a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecretKey f47b;

    public aaar(CipherSuite cipherSuite, CompressionMethod compressionMethod, SecretKey secretKey, SecretKey secretKey2) {
        super(cipherSuite, compressionMethod);
        if (secretKey == null) {
            throw new NullPointerException("Encryption key must not be null!");
        }
        if (secretKey2 == null) {
            throw new NullPointerException("MAC key must not be null!");
        }
        this.f47b = aadd.d(secretKey);
        this.f46a = aadd.d(secretKey2);
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        aadd.e(this.f47b);
        aadd.e(this.f46a);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return aadd.a(this.f46a) && aadd.a(this.f47b);
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSConnectionState
    public byte[] encrypt(aabr aabrVar, byte[] bArr) throws GeneralSecurityException {
        return aacl.e(this.cipherSuite, this.f47b, this.f46a, aabrVar.e(bArr.length), bArr);
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSConnectionState
    public byte[] decrypt(aabr aabrVar, byte[] bArr) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("Ciphertext must not be null");
        }
        if (bArr.length % this.cipherSuite.getRecordIvLength() != 0) {
            throw new GeneralSecurityException("Ciphertext doesn't fit block size!");
        }
        if (bArr.length < this.cipherSuite.getRecordIvLength() + this.cipherSuite.getMacLength() + 1) {
            throw new GeneralSecurityException("Ciphertext too short!");
        }
        return aacl.b(this.cipherSuite, this.f47b, this.f46a, aabrVar.e(0), bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DtlsBlockConnectionState:");
        sb.append(zzp.c());
        String strD = zzp.d(1);
        sb.append(strD);
        sb.append("Cipher suite: ");
        sb.append(this.cipherSuite);
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Compression method: ");
        sb.append(this.compressionMethod);
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("MAC key: ");
        sb.append(this.f46a == null ? Constants.NULL : "not null");
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Encryption key: ");
        sb.append(this.f47b == null ? Constants.NULL : "not null");
        sb.append(zzp.c());
        return sb.toString();
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSConnectionState
    public void writeTo(zzl zzlVar) {
        aacy.b(zzlVar, this.f46a);
        aacy.b(zzlVar, this.f47b);
    }

    public aaar(CipherSuite cipherSuite, CompressionMethod compressionMethod, zzf zzfVar) {
        super(cipherSuite, compressionMethod);
        this.f46a = aacy.c(zzfVar);
        this.f47b = aacy.c(zzfVar);
    }
}
