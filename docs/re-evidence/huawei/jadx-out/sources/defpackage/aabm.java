package defpackage;

import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.ServerKeyExchange;

/* JADX INFO: loaded from: classes20.dex */
public final class aabm extends ServerKeyExchange {
    private final aabp d;

    private aabm(byte[] bArr) {
        this.d = aabp.c(bArr);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.d.c() + 2;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "PSK Identity Hint: " + this.d + zzp.c();
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl(this.d.c() + 2);
        zzlVar.c(this.d, 16);
        return zzlVar.d();
    }

    public static HandshakeMessage c(zzf zzfVar) {
        return new aabm(zzfVar.j(16));
    }
}
