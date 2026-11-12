package defpackage;

import com.huawei.openalliance.ad.constant.Constants;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.ECDHServerKeyExchange;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class aaax extends ECDHServerKeyExchange {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f55b = aaex.a((Class<?>) aaax.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SignatureAndHashAlgorithm f56a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f57c;

    public aaax(SignatureAndHashAlgorithm signatureAndHashAlgorithm, XECDHECryptography xECDHECryptography, PrivateKey privateKey, aabn aabnVar, aabn aabnVar2) throws aaay {
        super(xECDHECryptography.f(), xECDHECryptography.j());
        if (signatureAndHashAlgorithm == null) {
            throw new NullPointerException("signature and hash algorithm cannot be null");
        }
        this.f56a = signatureAndHashAlgorithm;
        try {
            Signature signatureD = signatureAndHashAlgorithm.a().d();
            signatureD.initSign(privateKey, aacj.b());
            c(signatureD, aabnVar, aabnVar2);
            this.f57c = signatureD.sign();
        } catch (GeneralSecurityException e) {
            throw new aaay(String.format("Server failed to sign key exchange: %s", e.getMessage()), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.ILLEGAL_PARAMETER));
        }
    }

    private aaax(SignatureAndHashAlgorithm signatureAndHashAlgorithm, XECDHECryptography.SupportedGroup supportedGroup, byte[] bArr, byte[] bArr2) {
        super(supportedGroup, bArr);
        if (signatureAndHashAlgorithm == null && bArr2 != null) {
            throw new NullPointerException("signature and hash algorithm cannot be null");
        }
        if (signatureAndHashAlgorithm != null && bArr2 == null) {
            throw new NullPointerException("signature cannot be null");
        }
        this.f56a = signatureAndHashAlgorithm;
        this.f57c = bArr2;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        byte[] bArr = this.f57c;
        return getNamedCurveLength() + (bArr == null ? 0 : bArr.length + 4);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl();
        writeNamedCurve(zzlVar);
        if (this.f57c != null) {
            zzlVar.d(this.f56a.c().getCode(), 8);
            zzlVar.d(this.f56a.b().getCode(), 8);
            zzlVar.b(this.f57c, 16);
        }
        return zzlVar.d();
    }

    public static HandshakeMessage c(zzf zzfVar) throws aaay {
        SignatureAndHashAlgorithm signatureAndHashAlgorithm;
        byte[] bArrJ;
        ECDHServerKeyExchange.c namedCurve = readNamedCurve(zzfVar);
        if (zzfVar.d()) {
            signatureAndHashAlgorithm = new SignatureAndHashAlgorithm(zzfVar.a(8), zzfVar.a(8));
            bArrJ = zzfVar.j(16);
        } else {
            signatureAndHashAlgorithm = null;
            bArrJ = null;
        }
        return new aaax(signatureAndHashAlgorithm, namedCurve.f44550a, namedCurve.e, bArrJ);
    }

    public void a(PublicKey publicKey, aabn aabnVar, aabn aabnVar2) throws aaay {
        if (this.f57c == null) {
            throw new aaay("The server's ECDHE key exchange message has no signature.", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECRYPT_ERROR));
        }
        try {
            Signature signatureD = this.f56a.a().d();
            signatureD.initVerify(publicKey);
            c(signatureD, aabnVar, aabnVar2);
            if (signatureD.verify(this.f57c)) {
                if (zzm.b() && this.f56a.b() == SignatureAndHashAlgorithm.SignatureAlgorithm.ECDSA) {
                    zza.a(this.f57c, publicKey);
                    return;
                }
                return;
            }
        } catch (GeneralSecurityException e) {
            f55b.error("Could not verify the server's signature.", (Throwable) e);
        }
        throw new aaay("The server's ECDHE key exchange message's signature could not be verified.", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECRYPT_ERROR));
    }

    private void c(Signature signature, aabn aabnVar, aabn aabnVar2) throws SignatureException {
        signature.update(aabnVar.d());
        signature.update(aabnVar2.d());
        updateSignatureForNamedCurve(signature);
    }

    @Override // org.eclipse.californium.scandium.dtls.ECDHServerKeyExchange, org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        String string = super.toString(i);
        if (this.f57c == null) {
            return string;
        }
        return string + zzp.d(i + 1) + "Signature: " + this.f56a + Constants.LINK + zzp.a(this.f57c, (char) 0, 16) + zzp.c();
    }
}
