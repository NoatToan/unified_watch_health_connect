package defpackage;

import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeType;

/* JADX INFO: loaded from: classes20.dex */
public final class aabe extends HandshakeMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f77a;
    private final aabl d;

    public aabe(aabl aablVar, byte[] bArr) {
        this.d = aablVar;
        this.f77a = bArr;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl(this.f77a.length + 3);
        zzlVar.d(this.d.c(), 8);
        zzlVar.d(this.d.d(), 8);
        zzlVar.b(this.f77a, 8);
        return zzlVar.d();
    }

    public static HandshakeMessage b(zzf zzfVar) {
        return new aabe(aabl.a(zzfVar.a(8), zzfVar.a(8)), zzfVar.j(8));
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public HandshakeType getMessageType() {
        return HandshakeType.HELLO_VERIFY_REQUEST;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.f77a.length + 3;
    }

    public byte[] e() {
        return this.f77a;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString(i));
        String strD = zzp.d(i + 1);
        sb.append(strD);
        sb.append("Server Version: ");
        sb.append(this.d.c());
        sb.append(", ");
        sb.append(this.d.d());
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Cookie Length: ");
        sb.append(this.f77a.length);
        sb.append(" bytes");
        sb.append(zzp.c());
        sb.append(strD);
        sb.append("Cookie: ");
        sb.append(zzp.e(this.f77a));
        sb.append(zzp.c());
        return sb.toString();
    }
}
