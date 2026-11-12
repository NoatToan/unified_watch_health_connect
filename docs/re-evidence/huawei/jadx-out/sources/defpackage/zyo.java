package defpackage;

import java.io.ByteArrayInputStream;
import java.security.cert.CertPath;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.eclipse.californium.elements.auth.AbstractExtensiblePrincipal;

/* JADX INFO: loaded from: classes20.dex */
public class zyo extends AbstractExtensiblePrincipal<zyo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X509Certificate f54781a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CertPath f54782c;

    public zyo(CertPath certPath) {
        this(certPath, null);
    }

    private zyo(CertPath certPath, zyj zyjVar) {
        super(zyjVar);
        if (!"X.509".equals(certPath.getType())) {
            throw new IllegalArgumentException("Cert path must contain X.509 certificates only");
        }
        if (certPath.getCertificates().isEmpty()) {
            throw new IllegalArgumentException("Cert path must not be empty");
        }
        this.f54782c = certPath;
        this.f54781a = (X509Certificate) certPath.getCertificates().get(0);
    }

    @Override // org.eclipse.californium.elements.auth.ExtensiblePrincipal
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zyo amend(zyj zyjVar) {
        return new zyo(this.f54782c, zyjVar);
    }

    public static zyo e(byte[] bArr) {
        try {
            return new zyo(CertificateFactory.getInstance("X.509").generateCertPath(new ByteArrayInputStream(bArr), "PkiPath"));
        } catch (CertificateException unused) {
            throw new IllegalArgumentException("byte array does not contain X.509 certificate path");
        }
    }

    public byte[] d() {
        try {
            return this.f54782c.getEncoded("PkiPath");
        } catch (CertificateEncodingException unused) {
            return zzg.f54809a;
        }
    }

    @Override // java.security.Principal
    public String getName() {
        return this.f54781a.getSubjectX500Principal().getName();
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f54781a.equals(((zyo) obj).f54781a);
        }
        return false;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return this.f54781a.hashCode();
    }

    @Override // java.security.Principal
    public String toString() {
        return "x509 [" + getName() + "]";
    }
}
