package defpackage;

import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.eclipse.californium.scandium.dtls.cipher.PseudoRandomFunction;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class aaaw extends HandshakeMessage {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f54c = aaex.a((Class<?>) aaaw.class);
    private final byte[] d;

    public aaaw(Mac mac, SecretKey secretKey, boolean z, byte[] bArr) {
        this.d = e(mac, secretKey, z, bArr);
    }

    private aaaw(zzf zzfVar) {
        this.d = zzfVar.i();
    }

    public void a(Mac mac, SecretKey secretKey, boolean z, byte[] bArr) throws aaay {
        byte[] bArrE = e(mac, secretKey, z, bArr);
        if (MessageDigest.isEqual(bArrE, this.d)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Verification of FINISHED message failed");
        Logger logger = f54c;
        if (logger.isTraceEnabled()) {
            sb.append(zzp.c());
            sb.append("Expected: ");
            sb.append(zzp.e(bArrE));
            sb.append(zzp.c());
            sb.append("Received: ");
            sb.append(zzp.e(this.d));
        }
        logger.debug(sb.toString());
        throw new aaay("Verification of FINISHED message failed", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECRYPT_ERROR));
    }

    private byte[] e(Mac mac, SecretKey secretKey, boolean z, byte[] bArr) {
        if (z) {
            return PseudoRandomFunction.a(mac, secretKey, PseudoRandomFunction.Label.CLIENT_FINISHED_LABEL, bArr);
        }
        return PseudoRandomFunction.a(mac, secretKey, PseudoRandomFunction.Label.SERVER_FINISHED_LABEL, bArr);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        return HandshakeType.FINISHED;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.d.length;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "Verify Data: " + zzp.e(this.d) + zzp.c();
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        return this.d;
    }

    public static HandshakeMessage b(zzf zzfVar) {
        return new aaaw(zzfVar);
    }
}
