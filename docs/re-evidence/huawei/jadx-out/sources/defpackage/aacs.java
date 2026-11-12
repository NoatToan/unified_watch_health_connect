package defpackage;

import java.net.InetSocketAddress;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import org.eclipse.californium.scandium.dtls.HandshakeResultHandler;
import org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore;

/* JADX INFO: loaded from: classes20.dex */
public class aacs implements AdvancedPskStore, Destroyable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aabp f132c;
    private final SecretKey d;

    @Override // org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore
    public boolean hasEcdhePskSupported() {
        return true;
    }

    @Override // org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore
    public void setResultHandler(HandshakeResultHandler handshakeResultHandler) {
    }

    public aacs(String str, byte[] bArr) {
        this(new aabp(str), bArr);
    }

    public aacs(aabp aabpVar, byte[] bArr) {
        this.f132c = aabpVar;
        this.d = aadd.e(bArr, "PSK");
    }

    @Override // org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore
    public aabq requestPskSecretResult(aaae aaaeVar, aade aadeVar, aabp aabpVar, String str, SecretKey secretKey, byte[] bArr, boolean z) {
        return new aabq(aaaeVar, this.f132c, this.f132c.equals(aabpVar) ? aadd.d(this.d) : null);
    }

    @Override // org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore
    public aabp getIdentity(InetSocketAddress inetSocketAddress, aade aadeVar) {
        return this.f132c;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        aadd.e(this.d);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return aadd.a(this.d);
    }
}
