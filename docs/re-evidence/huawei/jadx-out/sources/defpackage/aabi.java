package defpackage;

import org.eclipse.californium.scandium.dtls.ClientKeyExchange;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;

/* JADX INFO: loaded from: classes20.dex */
public final class aabi extends ClientKeyExchange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aabp f87a;

    public aabi(aabp aabpVar) {
        this.f87a = aabpVar;
    }

    private aabi(byte[] bArr) {
        this.f87a = aabp.c(bArr);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.f87a.c() + 2;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "PSK Identity: " + this.f87a + zzp.c();
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl(this.f87a.c() + 2);
        zzlVar.c(this.f87a, 16);
        return zzlVar.d();
    }

    public static HandshakeMessage d(zzf zzfVar) {
        return new aabi(zzfVar.j(16));
    }

    public aabp b() {
        return this.f87a;
    }
}
