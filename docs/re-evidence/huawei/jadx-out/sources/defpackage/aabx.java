package defpackage;

import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.CompressionMethod;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.eclipse.californium.scandium.dtls.HelloHandshakeMessage;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;

/* JADX INFO: loaded from: classes20.dex */
public final class aabx extends HelloHandshakeMessage {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CipherSuite f109c;
    private final CompressionMethod d;

    public aabx(aabl aablVar, aacd aacdVar, CipherSuite cipherSuite, CompressionMethod compressionMethod) {
        super(aablVar, aacdVar);
        if (cipherSuite == null) {
            throw new NullPointerException("Negotiated cipher suite must not be null");
        }
        if (compressionMethod == null) {
            throw new NullPointerException("Negotiated compression method must not be null");
        }
        this.f109c = cipherSuite;
        this.d = compressionMethod;
    }

    private aabx(zzf zzfVar) throws aaay {
        super(zzfVar);
        int iA = zzfVar.a(16);
        CipherSuite typeByCode = CipherSuite.getTypeByCode(iA);
        this.f109c = typeByCode;
        if (typeByCode == null) {
            throw new aaay(String.format("Server selected unknown cipher suite [%s]", Integer.toHexString(iA)), new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
        }
        if (!typeByCode.isValidForNegotiation()) {
            throw new aaay("Server tries to negotiate a cipher suite invalid for negotiation", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.HANDSHAKE_FAILURE));
        }
        this.d = CompressionMethod.getMethodByCode(zzfVar.a(8));
        this.extensions.e(zzfVar);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl();
        writeHeader(zzlVar);
        zzlVar.d(this.f109c.getCode(), 16);
        zzlVar.d(this.d.getCode(), 8);
        this.extensions.e(zzlVar);
        return zzlVar.d();
    }

    public static HandshakeMessage a(zzf zzfVar) throws aaay {
        return new aabx(zzfVar);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        return HandshakeType.SERVER_HELLO;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.sessionId.c() + 38 + this.extensions.a();
    }

    public CipherSuite a() {
        return this.f109c;
    }

    public CompressionMethod c() {
        return this.d;
    }

    @Override // org.eclipse.californium.scandium.dtls.HelloHandshakeMessage, org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder(super.toString(i));
        int i2 = i + 1;
        String strD = zzp.d(i2);
        sb.append(strD);
        sb.append("Cipher Suite: ");
        sb.append(this.f109c);
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Compression Method: ");
        sb.append(this.d);
        sb.append(zzp.c());
        sb.append(this.extensions.d(i2));
        return sb.toString();
    }
}
