package defpackage;

import java.util.Arrays;
import org.eclipse.californium.scandium.dtls.ClientKeyExchange;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;

/* JADX INFO: loaded from: classes20.dex */
public class aaas extends ClientKeyExchange {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f48c;

    public aaas(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("encoded point cannot be null");
        }
        this.f48c = bArr;
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        zzl zzlVar = new zzl();
        d(zzlVar);
        return zzlVar.d();
    }

    protected void d(zzl zzlVar) {
        zzlVar.b(this.f48c, 8);
    }

    protected static byte[] e(zzf zzfVar) {
        return zzfVar.j(8);
    }

    public static HandshakeMessage a(zzf zzfVar) {
        return new aaas(e(zzfVar));
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.f48c.length + 1;
    }

    public byte[] d() {
        byte[] bArr = this.f48c;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        return super.toString(i) + zzp.d(i + 1) + "Diffie-Hellman public value: " + zzp.a(this.f48c, (char) 0, 16) + zzp.c();
    }
}
