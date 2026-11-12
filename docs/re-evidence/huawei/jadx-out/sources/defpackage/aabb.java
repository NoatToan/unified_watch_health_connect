package defpackage;

import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;

/* JADX INFO: loaded from: classes20.dex */
public class aabb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CertificateType f63c;
    private final CipherSuite.KeyExchangeAlgorithm d;

    public aabb(CipherSuite.KeyExchangeAlgorithm keyExchangeAlgorithm, CertificateType certificateType) {
        if (keyExchangeAlgorithm == null) {
            throw new NullPointerException("key exchange must not be null!");
        }
        if (certificateType == null) {
            throw new NullPointerException("certificate type must not be null!");
        }
        this.d = keyExchangeAlgorithm;
        this.f63c = certificateType;
    }

    public CipherSuite.KeyExchangeAlgorithm b() {
        return this.d;
    }

    public CertificateType e() {
        return this.f63c;
    }

    public String toString() {
        return "KeyExgAl=" + this.d + ", cert.type=" + this.f63c;
    }
}
