package defpackage;

import org.eclipse.californium.scandium.dtls.HandshakeMessage;

/* JADX INFO: loaded from: classes20.dex */
public final class aaaq extends aaas {
    private final aabp d;

    public aaaq(aabp aabpVar, byte[] bArr) {
        super(bArr);
        if (aabpVar == null) {
            throw new NullPointerException("identity cannot be null");
        }
        this.d = aabpVar;
    }

    @Override // defpackage.aaas
    protected void d(zzl zzlVar) {
        zzlVar.c(this.d, 16);
        super.d(zzlVar);
    }

    public static HandshakeMessage c(zzf zzfVar) {
        return new aaaq(aabp.c(zzfVar.j(16)), e(zzfVar));
    }

    @Override // defpackage.aaas, org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.d.c() + 2 + super.getMessageLength();
    }

    @Override // defpackage.aaas, org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "Encoded identity value: " + this.d + zzp.c();
    }

    public aabp c() {
        return this.d;
    }
}
