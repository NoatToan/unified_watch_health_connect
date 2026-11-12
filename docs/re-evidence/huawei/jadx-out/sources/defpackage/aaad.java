package defpackage;

import com.huawei.openalliance.ad.constant.Constants;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.List;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class aaad extends HandshakeMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f19a = aaex.a((Class<?>) aaad.class);
    private final SignatureAndHashAlgorithm d;
    private final byte[] e;

    public aaad(SignatureAndHashAlgorithm signatureAndHashAlgorithm, PrivateKey privateKey, List<HandshakeMessage> list) {
        this.d = signatureAndHashAlgorithm;
        this.e = b(signatureAndHashAlgorithm, privateKey, list);
    }

    private aaad(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr) {
        this.d = signatureAndHashAlgorithm;
        this.e = bArr;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        return HandshakeType.CERTIFICATE_VERIFY;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.e.length + 4;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl(this.e.length + 4);
        zzlVar.d(this.d.c().getCode(), 8);
        zzlVar.d(this.d.b().getCode(), 8);
        zzlVar.b(this.e, 16);
        return zzlVar.d();
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "Signature: " + this.d + Constants.LINK + zzp.a(this.e, (char) 0, 16) + zzp.c();
    }

    public static HandshakeMessage d(zzf zzfVar) {
        return new aaad(new SignatureAndHashAlgorithm(zzfVar.a(8), zzfVar.a(8)), zzfVar.j(16));
    }

    private static byte[] b(SignatureAndHashAlgorithm signatureAndHashAlgorithm, PrivateKey privateKey, List<HandshakeMessage> list) {
        byte[] bArr = zzg.f54809a;
        try {
            Signature signatureD = signatureAndHashAlgorithm.a().d();
            signatureD.initSign(privateKey, aacj.b());
            int i = 0;
            for (HandshakeMessage handshakeMessage : list) {
                signatureD.update(handshakeMessage.toByteArray());
                f19a.trace("  [{}] - {}", Integer.valueOf(i), handshakeMessage.getMessageType());
                i++;
            }
            return signatureD.sign();
        } catch (Exception e) {
            f19a.error("Could not create signature.", (Throwable) e);
            return bArr;
        }
    }

    public void e(PublicKey publicKey, List<HandshakeMessage> list) throws aaay {
        try {
            Signature signatureD = this.d.a().d();
            signatureD.initVerify(publicKey);
            int i = 0;
            for (HandshakeMessage handshakeMessage : list) {
                signatureD.update(handshakeMessage.toByteArray());
                f19a.trace("  [{}] - {}", Integer.valueOf(i), handshakeMessage.getMessageType());
                i++;
            }
            if (signatureD.verify(this.e)) {
                if (zzm.b() && this.d.b() == SignatureAndHashAlgorithm.SignatureAlgorithm.ECDSA) {
                    zza.a(this.e, publicKey);
                    return;
                }
                return;
            }
        } catch (GeneralSecurityException e) {
            f19a.error("Could not verify the client's signature.", (Throwable) e);
        }
        throw new aaay("The client's CertificateVerify message could not be verified.", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECRYPT_ERROR));
    }
}
