package defpackage;

import org.eclipse.californium.scandium.dtls.ECDHServerKeyExchange;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;

/* JADX INFO: loaded from: classes20.dex */
public final class aaat extends ECDHServerKeyExchange {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aabp f49b;

    public aaat(aabp aabpVar, XECDHECryptography xECDHECryptography) {
        super(xECDHECryptography.f(), xECDHECryptography.j());
        if (aabpVar == null) {
            throw new NullPointerException("PSK hint must not be null");
        }
        this.f49b = aabpVar;
    }

    private aaat(byte[] bArr, XECDHECryptography.SupportedGroup supportedGroup, byte[] bArr2) throws aaay {
        super(supportedGroup, bArr2);
        this.f49b = aabp.c(bArr);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl();
        zzlVar.c(this.f49b, 16);
        writeNamedCurve(zzlVar);
        return zzlVar.d();
    }

    public static HandshakeMessage c(zzf zzfVar) throws aaay {
        byte[] bArrJ = zzfVar.j(16);
        ECDHServerKeyExchange.c namedCurve = readNamedCurve(zzfVar);
        return new aaat(bArrJ, namedCurve.f44550a, namedCurve.e);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.f49b.c() + 2 + getNamedCurveLength();
    }

    @Override // org.eclipse.californium.scandium.dtls.ECDHServerKeyExchange, org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString(i));
        sb.append(zzp.d(i + 1));
        sb.append("PSK Identity Hint: ");
        if (this.f49b.b()) {
            sb.append("not present");
        } else {
            sb.append(this.f49b);
        }
        sb.append(zzp.c());
        return sb.toString();
    }
}
