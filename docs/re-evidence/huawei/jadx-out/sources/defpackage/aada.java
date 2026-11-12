package defpackage;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;

/* JADX INFO: loaded from: classes20.dex */
public class aada {
    private boolean d;
    private boolean j;
    private final List<PublicKey> e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<List<X509Certificate>> f147c = new ArrayList();
    private final List<X509Certificate> i = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<SignatureAndHashAlgorithm> f146b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<XECDHECryptography.SupportedGroup> f145a = new ArrayList();

    public void b(X509Certificate[] x509CertificateArr) {
        if (x509CertificateArr != null) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                e(x509Certificate.getPublicKey());
                this.i.add(x509Certificate);
            }
        }
    }

    public void e(PublicKey publicKey) {
        if (publicKey != null) {
            SignatureAndHashAlgorithm.e(this.f146b, publicKey);
            if (zza.c(publicKey.getAlgorithm())) {
                XECDHECryptography.SupportedGroup supportedGroupFromPublicKey = XECDHECryptography.SupportedGroup.fromPublicKey(publicKey);
                if (supportedGroupFromPublicKey == null) {
                    throw new IllegalArgumentException("CA's public key ec-group must be supported!");
                }
                aacx.c(this.f145a, supportedGroupFromPublicKey);
            }
        }
    }

    public List<SignatureAndHashAlgorithm> a() {
        return this.f146b;
    }

    public List<XECDHECryptography.SupportedGroup> e() {
        return this.f145a;
    }

    public void c(List<SignatureAndHashAlgorithm> list) {
        for (PublicKey publicKey : this.e) {
            if (SignatureAndHashAlgorithm.a(list, publicKey) == null) {
                throw new IllegalStateException("supported signature and hash algorithms " + list + " doesn't match the public " + publicKey.getAlgorithm() + " key!");
            }
        }
        Iterator<List<X509Certificate>> it = this.f147c.iterator();
        while (it.hasNext()) {
            if (!SignatureAndHashAlgorithm.d(list, it.next())) {
                throw new IllegalStateException("supported signature and hash algorithms " + list + " doesn't match the certificate chain!");
            }
        }
        Iterator<X509Certificate> it2 = this.i.iterator();
        while (it2.hasNext()) {
            PublicKey publicKey2 = it2.next().getPublicKey();
            if (SignatureAndHashAlgorithm.a(list, publicKey2) == null) {
                throw new IllegalStateException("supported signature and hash algorithms " + list + " doesn't match the trust's public key " + publicKey2.getAlgorithm() + "!");
            }
        }
    }

    public void a(List<XECDHECryptography.SupportedGroup> list) {
        for (XECDHECryptography.SupportedGroup supportedGroup : this.f145a) {
            if (!supportedGroup.isUsable()) {
                throw new IllegalStateException("public key used with unsupported group (curve) " + supportedGroup.name() + "!");
            }
            if (!list.contains(supportedGroup)) {
                throw new IllegalStateException("public key used with not configured group (curve) " + supportedGroup.name() + "!");
            }
        }
    }

    public boolean b(boolean z) {
        if (this.f147c.isEmpty()) {
            return true;
        }
        if (z) {
            return this.d;
        }
        return this.j;
    }
}
