package defpackage;

import com.huawei.operation.utils.Constants;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import org.eclipse.californium.scandium.dtls.CompressionMethod;
import org.eclipse.californium.scandium.dtls.DTLSConnectionState;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aaal extends DTLSConnectionState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f40c = aaex.a((Class<?>) aaal.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aacw f41b;
    private final SecretKey e;

    public aaal(CipherSuite cipherSuite, CompressionMethod compressionMethod, SecretKey secretKey, aacw aacwVar) {
        super(cipherSuite, compressionMethod);
        if (secretKey == null) {
            throw new NullPointerException("Encryption key must not be null!");
        }
        if (aacwVar == null) {
            throw new NullPointerException("IV must not be null!");
        }
        this.e = aadd.d(secretKey);
        this.f41b = aadd.a(aacwVar);
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        aadd.e(this.e);
        aadd.a((Destroyable) this.f41b);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return aadd.b(this.f41b) && aadd.a(this.e);
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSConnectionState
    public byte[] encrypt(aabr aabrVar, byte[] bArr) throws GeneralSecurityException {
        zzl zzlVar = new zzl(12, true);
        this.f41b.c(zzlVar);
        aabrVar.e(zzlVar);
        byte[] bArrD = zzlVar.d();
        byte[] bArrE = aabrVar.e(bArr.length);
        Logger logger = f40c;
        if (logger.isTraceEnabled()) {
            logger.trace("encrypt: {} bytes", Integer.valueOf(bArr.length));
            logger.trace("nonce: {}", zzp.e(bArrD));
            logger.trace("adata: {}", zzp.e(bArrE));
        }
        byte[] bArrC = aack.c(this.cipherSuite, this.e, bArrD, bArrE, bArr);
        System.arraycopy(bArrD, this.cipherSuite.getFixedIvLength(), bArrC, 0, this.cipherSuite.getRecordIvLength());
        zzg.a(bArrD);
        logger.trace("==> {} bytes", Integer.valueOf(bArrC.length));
        return bArrC;
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSConnectionState
    public byte[] decrypt(aabr aabrVar, byte[] bArr) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("Ciphertext must not be null");
        }
        int recordIvLength = this.cipherSuite.getRecordIvLength();
        int length = (bArr.length - recordIvLength) - this.cipherSuite.getMacLength();
        if (length <= 0) {
            throw new GeneralSecurityException("Ciphertext too short!");
        }
        byte[] bArrE = aabrVar.e(length);
        zzl zzlVar = new zzl(12, true);
        this.f41b.c(zzlVar);
        zzlVar.b(bArr, 0, recordIvLength);
        byte[] bArrD = zzlVar.d();
        Logger logger = f40c;
        if (logger.isTraceEnabled()) {
            logger.trace("decrypt: {} bytes", Integer.valueOf(length));
            logger.trace("nonce: {}", zzp.e(bArrD));
            logger.trace("adata: {}", zzp.e(bArrE));
        }
        if (logger.isDebugEnabled() && "AES/CCM/NoPadding".equals(this.cipherSuite.getTransformation())) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, recordIvLength);
            aabrVar.e(zzlVar);
            byte[] bArrD2 = zzlVar.d();
            if (!Arrays.equals(bArrD2, bArrCopyOf)) {
                logger.debug("The explicit nonce used by the sender does not match the values provided in the DTLS record" + zzp.c() + "Used    : " + zzp.e(bArrCopyOf) + zzp.c() + "Expected: " + zzp.e(bArrD2));
            }
        }
        byte[] bArrB = aack.b(this.cipherSuite, this.e, bArrD, bArrE, bArr, recordIvLength, bArr.length - recordIvLength);
        zzg.a(bArrD);
        return bArrB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DtlsAeadConnectionState:");
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
        sb.append("IV: ");
        sb.append(this.f41b == null ? Constants.NULL : "not null");
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Encryption key: ");
        sb.append(this.e == null ? Constants.NULL : "not null");
        sb.append(zzp.c());
        return sb.toString();
    }

    @Override // org.eclipse.californium.scandium.dtls.DTLSConnectionState
    public void writeTo(zzl zzlVar) {
        aacy.b(zzlVar, this.e);
        aacy.d(zzlVar, this.f41b);
    }

    public aaal(CipherSuite cipherSuite, CompressionMethod compressionMethod, zzf zzfVar) {
        super(cipherSuite, compressionMethod);
        this.e = aacy.c(zzfVar);
        this.f41b = aacy.d(zzfVar);
    }
}
