package org.eclipse.californium.scandium.dtls.cipher;

import defpackage.zzp;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import org.eclipse.californium.elements.config.CertificateAuthenticationMode;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.SupportedPointFormatsExtension;

/* JADX INFO: loaded from: classes20.dex */
public class CipherSuiteParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CertificateBasedMismatch f44572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<CertificateType> f44573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CertificateAuthenticationMode f44574c;
    private List<CipherSuite> d;
    private List<X509Certificate> e;
    private CertificateType f;
    private SupportedPointFormatsExtension.ECPointFormat g;
    private CipherSuite h;
    private PublicKey i;
    private GeneralMismatch j;
    private List<CertificateType> k;
    private XECDHECryptography.SupportedGroup l;
    private List<SignatureAndHashAlgorithm> m;
    private CertificateType n;
    private SignatureAndHashAlgorithm o;
    private List<XECDHECryptography.SupportedGroup> t;

    public enum GeneralMismatch {
        CIPHER_SUITE("Peers have no common cipher suite."),
        EC_FORMAT("Peers have no common ec-point format."),
        EC_GROUPS("Peers have no common ec-groups.");

        private final String message;

        GeneralMismatch(String str) {
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public enum CertificateBasedMismatch {
        SERVER_CERT_TYPE("Peers have no common server certificate type."),
        CLIENT_CERT_TYPE("Peers have no common client certificate type."),
        SIGNATURE_ALGORITHMS("Peers have no common signature and hash algorithm."),
        CERTIFICATE_EC_GROUPS("The peer's node certificate uses no common ec-group."),
        CERTIFICATE_SIGNATURE_ALGORITHMS("The peer's node certificate uses no common signature and hash algorithm."),
        CERTIFICATE_PATH_SIGNATURE_ALGORITHMS("The peer's certificate-chain uses no common signature and hash algorithm.");

        private final String message;

        CertificateBasedMismatch(String str) {
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public CipherSuiteParameters(PublicKey publicKey, List<X509Certificate> list, CertificateAuthenticationMode certificateAuthenticationMode, List<CipherSuite> list2, List<CertificateType> list3, List<CertificateType> list4, List<XECDHECryptography.SupportedGroup> list5, List<SignatureAndHashAlgorithm> list6, SupportedPointFormatsExtension.ECPointFormat eCPointFormat) {
        this.i = publicKey;
        this.e = list;
        this.f44574c = certificateAuthenticationMode;
        this.d = list2;
        this.k = list3;
        this.f44573b = list4;
        this.t = list5;
        this.m = list6;
        this.g = eCPointFormat;
    }

    public CipherSuiteParameters(PublicKey publicKey, List<X509Certificate> list, CipherSuiteParameters cipherSuiteParameters) {
        this.i = publicKey;
        this.e = list;
        this.f44574c = cipherSuiteParameters.f44574c;
        this.d = cipherSuiteParameters.d;
        this.k = cipherSuiteParameters.k;
        this.f44573b = cipherSuiteParameters.f44573b;
        this.t = cipherSuiteParameters.t;
        this.m = cipherSuiteParameters.m;
        this.g = cipherSuiteParameters.g;
        this.h = cipherSuiteParameters.h;
        this.n = cipherSuiteParameters.n;
        this.f = cipherSuiteParameters.f;
        this.l = cipherSuiteParameters.l;
        this.o = cipherSuiteParameters.o;
    }

    public List<CipherSuite> b() {
        return this.d;
    }

    public List<CertificateType> l() {
        return this.k;
    }

    public List<CertificateType> d() {
        return this.f44573b;
    }

    public List<XECDHECryptography.SupportedGroup> s() {
        return this.t;
    }

    public List<SignatureAndHashAlgorithm> t() {
        return this.m;
    }

    public SupportedPointFormatsExtension.ECPointFormat h() {
        return this.g;
    }

    public PublicKey g() {
        return this.i;
    }

    public List<X509Certificate> a() {
        return this.e;
    }

    public CertificateBasedMismatch c() {
        return this.f44572a;
    }

    public CertificateAuthenticationMode e() {
        return this.f44574c;
    }

    public CipherSuite i() {
        return this.h;
    }

    public CertificateType n() {
        return this.n;
    }

    public CertificateType k() {
        return this.f;
    }

    public XECDHECryptography.SupportedGroup m() {
        return this.l;
    }

    public SignatureAndHashAlgorithm o() {
        return this.o;
    }

    public void c(GeneralMismatch generalMismatch) {
        this.j = generalMismatch;
    }

    public void e(CertificateBasedMismatch certificateBasedMismatch) {
        this.f44572a = certificateBasedMismatch;
    }

    public void c(CipherSuite cipherSuite) {
        if (cipherSuite == null) {
            throw new NullPointerException("Cipher suite must not be null!");
        }
        if (!this.d.contains(cipherSuite)) {
            throw new IllegalArgumentException(cipherSuite + " is no common cipher suite!");
        }
        this.h = cipherSuite;
    }

    public void a(CertificateType certificateType) {
        if (certificateType != null && !this.k.contains(certificateType)) {
            throw new IllegalArgumentException(certificateType + " server certificate type is no common certificate type.");
        }
        this.n = certificateType;
    }

    public void e(CertificateType certificateType) {
        if (certificateType != null && !this.f44573b.contains(certificateType)) {
            throw new IllegalArgumentException(certificateType + " client certificate type is no common certificate type.");
        }
        this.f = certificateType;
    }

    public void b(XECDHECryptography.SupportedGroup supportedGroup) {
        if (supportedGroup != null && !this.t.contains(supportedGroup)) {
            throw new IllegalArgumentException(supportedGroup + " is no common group/curve.");
        }
        this.l = supportedGroup;
    }

    public void d(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm != null && !this.m.contains(signatureAndHashAlgorithm)) {
            throw new IllegalArgumentException(signatureAndHashAlgorithm + " is no common signature and hash algorithm.");
        }
        this.o = signatureAndHashAlgorithm;
    }

    public String j() {
        GeneralMismatch generalMismatch = this.j;
        if (generalMismatch != null) {
            return generalMismatch.getMessage();
        }
        CertificateBasedMismatch certificateBasedMismatch = this.f44572a;
        if (certificateBasedMismatch != null) {
            return certificateBasedMismatch.getMessage();
        }
        return null;
    }

    public String f() {
        String strJ = j();
        if (strJ == null) {
            return strJ;
        }
        StringBuilder sb = new StringBuilder(strJ);
        sb.append(zzp.c());
        sb.append("\tcipher suites: ");
        Iterator<CipherSuite> it = this.d.iterator();
        while (it.hasNext()) {
            sb.append(it.next().name());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        if (this.f44572a == CertificateBasedMismatch.CERTIFICATE_EC_GROUPS) {
            sb.append(zzp.c());
            sb.append("\t\tec-groups: ");
            Iterator<XECDHECryptography.SupportedGroup> it2 = this.t.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().name());
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        } else if (this.f44572a == CertificateBasedMismatch.CERTIFICATE_SIGNATURE_ALGORITHMS || this.f44572a == CertificateBasedMismatch.CERTIFICATE_PATH_SIGNATURE_ALGORITHMS) {
            sb.append(zzp.c());
            sb.append("\t\tsignatures: ");
            Iterator<SignatureAndHashAlgorithm> it3 = this.m.iterator();
            while (it3.hasNext()) {
                sb.append(it3.next().e());
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cipher suites: ");
        for (CipherSuite cipherSuite : this.d) {
            if (this.h == cipherSuite) {
                sb.append("#");
            }
            sb.append(cipherSuite.name());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(zzp.c());
        List<X509Certificate> list = this.e;
        if (list != null && !list.isEmpty()) {
            sb.append("x509-DN: [");
            sb.append(this.e.get(0).getSubjectX500Principal().getName());
            sb.append("]");
            sb.append(zzp.c());
        }
        if (this.i != null) {
            if (this.f44574c == CertificateAuthenticationMode.NEEDED) {
                sb.append("client certificate required");
            } else if (this.f44574c == CertificateAuthenticationMode.WANTED) {
                sb.append("client certificate wanted");
            } else {
                sb.append("no client certificate");
            }
            sb.append(zzp.c());
        }
        sb.append("server certificate types: ");
        for (CertificateType certificateType : this.k) {
            if (this.n == certificateType) {
                sb.append("#");
            }
            sb.append(certificateType.name());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(zzp.c());
        sb.append("client certificate types: ");
        for (CertificateType certificateType2 : this.f44573b) {
            if (this.f == certificateType2) {
                sb.append("#");
            }
            sb.append(certificateType2.name());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(zzp.c());
        sb.append("ec-groups: ");
        for (XECDHECryptography.SupportedGroup supportedGroup : this.t) {
            if (this.l == supportedGroup) {
                sb.append("#");
            }
            sb.append(supportedGroup.name());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(zzp.c());
        sb.append("signatures: ");
        for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : this.m) {
            if (this.o == signatureAndHashAlgorithm) {
                sb.append("#");
            }
            sb.append(signatureAndHashAlgorithm.e());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(zzp.c());
        return sb.toString();
    }
}
