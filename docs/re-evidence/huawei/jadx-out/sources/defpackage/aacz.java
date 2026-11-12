package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.eclipse.californium.elements.util.SslContextUtil;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.HandshakeResultHandler;
import org.eclipse.californium.scandium.dtls.x509.ConfigurationHelperSetup;
import org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier;
import org.eclipse.californium.scandium.util.ServerName;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aacz implements NewAdvancedCertificateVerifier, ConfigurationHelperSetup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final X509Certificate[] f136c = new X509Certificate[0];
    private static final zyg[] e = new zyg[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<CertificateType> f137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    protected final Logger f138b = aaex.a(getClass());
    private final X509Certificate[] d;
    private final Set<zyg> g;
    private final boolean i;

    @Override // org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier
    public void setResultHandler(HandshakeResultHandler handshakeResultHandler) {
    }

    public aacz(X509Certificate[] x509CertificateArr, zyg[] zygVarArr, List<CertificateType> list, boolean z) {
        if (x509CertificateArr == null && zygVarArr == null) {
            throw new IllegalArgumentException("no trusts provided!");
        }
        if (list == null) {
            list = new ArrayList<>(2);
            if (zygVarArr != null) {
                list.add(CertificateType.RAW_PUBLIC_KEY);
            }
            if (x509CertificateArr != null) {
                list.add(CertificateType.X_509);
            }
        } else {
            if (list.isEmpty()) {
                throw new IllegalArgumentException("list of supported certificate types must not be empty!");
            }
            if (list.contains(CertificateType.RAW_PUBLIC_KEY) && zygVarArr == null) {
                throw new IllegalArgumentException("RPK support requires RPK trusts!");
            }
            if (list.contains(CertificateType.X_509) && x509CertificateArr == null) {
                throw new IllegalArgumentException("x509support requires x509 trusts!");
            }
        }
        this.d = x509CertificateArr == null ? null : (X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length);
        this.g = zygVarArr != null ? new HashSet(Arrays.asList(zygVarArr)) : null;
        this.f137a = Collections.unmodifiableList(list);
        this.i = z;
    }

    @Override // org.eclipse.californium.scandium.dtls.x509.ConfigurationHelperSetup
    public void setupConfigurationHelper(aada aadaVar) {
        aadaVar.b(this.d);
        Set<zyg> set = this.g;
        if (set != null) {
            Iterator<zyg> it = set.iterator();
            while (it.hasNext()) {
                aadaVar.e(it.next().a());
            }
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier
    public List<CertificateType> getSupportedCertificateTypes() {
        return this.f137a;
    }

    @Override // org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier
    public aaac verifyCertificate(aaae aaaeVar, aade aadeVar, InetSocketAddress inetSocketAddress, boolean z, boolean z2, boolean z3, zzz zzzVar) {
        this.f138b.debug("Verify for SNI: {}, IP: {}", aadeVar, zzp.e(inetSocketAddress));
        try {
            CertPath certPathB = zzzVar.b();
            if (certPathB == null) {
                if (this.g == null) {
                    throw new aaay("RPK verification not enabled!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNSUPPORTED_CERTIFICATE));
                }
                PublicKey publicKeyA = zzzVar.a();
                if (!this.g.isEmpty()) {
                    if (!this.g.contains(new zyg(publicKeyA))) {
                        this.f138b.debug("Certificate validation failed: Raw public key is not trusted");
                        throw new aaay("Raw public key is not trusted!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE));
                    }
                }
                return new aaac(aaaeVar, publicKeyA, (Object) null);
            }
            if (this.d == null) {
                throw new aaay("x509 verification not enabled!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.UNSUPPORTED_CERTIFICATE));
            }
            try {
                if (!zzzVar.e()) {
                    Certificate certificate = certPathB.getCertificates().get(0);
                    if (certificate instanceof X509Certificate) {
                        X509Certificate x509Certificate = (X509Certificate) certificate;
                        if (!zzi.e(x509Certificate, z)) {
                            this.f138b.debug("Certificate validation failed: key usage doesn't match");
                            throw new aaay("Key Usage doesn't match!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE));
                        }
                        if (z2) {
                            c(aadeVar, inetSocketAddress, x509Certificate);
                        }
                    }
                    certPathB = zzi.e(z3, certPathB, this.d);
                }
                return new aaac(aaaeVar, certPathB, (Object) null);
            } catch (CertPathValidatorException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof CertificateExpiredException) {
                    this.f138b.debug("Certificate expired: {}", cause.getMessage());
                    throw new aaay("Certificate expired", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.CERTIFICATE_EXPIRED));
                }
                if (cause != null) {
                    this.f138b.debug("Certificate validation failed: {}/{}", e2.getMessage(), cause.getMessage());
                } else {
                    this.f138b.debug("Certificate validation failed: {}", e2.getMessage());
                }
                throw new aaay("Certificate chain could not be validated", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE), e2);
            } catch (GeneralSecurityException e3) {
                if (this.f138b.isTraceEnabled()) {
                    this.f138b.trace("Certificate validation failed", (Throwable) e3);
                } else if (this.f138b.isDebugEnabled()) {
                    this.f138b.debug("Certificate validation failed due to {}", e3.getMessage());
                }
                throw new aaay("Certificate chain could not be validated", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.DECRYPT_ERROR), e3);
            }
        } catch (aaay e4) {
            this.f138b.debug("Certificate validation failed!", (Throwable) e4);
            return new aaac(aaaeVar, e4, (Object) null);
        }
    }

    public void c(aade aadeVar, InetSocketAddress inetSocketAddress, X509Certificate x509Certificate) throws aaay {
        String hostAddress;
        String strB;
        ServerName serverNameB;
        if (x509Certificate == null) {
            throw new NullPointerException("Certficate must not be null!");
        }
        if (aadeVar == null && inetSocketAddress == null) {
            return;
        }
        if (inetSocketAddress != null) {
            strB = zzp.a(inetSocketAddress);
            InetAddress address = inetSocketAddress.getAddress();
            hostAddress = address != null ? address.getHostAddress() : null;
        } else {
            hostAddress = null;
            strB = null;
        }
        if (aadeVar != null && (serverNameB = aadeVar.b(ServerName.NameType.HOST_NAME)) != null) {
            strB = serverNameB.b();
        }
        String str = (strB == null || !strB.equals(hostAddress)) ? strB : null;
        if (str != null) {
            if (zzi.a(x509Certificate, str)) {
                return;
            }
            String strC = zzi.c(x509Certificate);
            this.f138b.debug("Certificate {} validation failed: destination doesn't match", strC);
            throw new aaay("Certificate " + strC + ": Destination '" + str + "' doesn't match!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE));
        }
        if (zzi.d(x509Certificate, hostAddress)) {
            return;
        }
        String strC2 = zzi.c(x509Certificate);
        this.f138b.debug("Certificate {} validation failed: literal IP doesn't match", strC2);
        throw new aaay("Certificate " + strC2 + ": Literal IP " + hostAddress + " doesn't match!", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.BAD_CERTIFICATE));
    }

    @Override // org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier
    public List<X500Principal> getAcceptedIssuers() {
        X509Certificate[] x509CertificateArr;
        if (!this.i && (x509CertificateArr = this.d) != null) {
            return zzi.b(Arrays.asList(x509CertificateArr));
        }
        return zzi.b(null);
    }

    public static e b() {
        return new e();
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected List<CertificateType> f139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected boolean f140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected zyg[] f141c;
        protected X509Certificate[] e;

        public e c(Certificate... certificateArr) {
            if (certificateArr == null) {
                this.e = null;
                return this;
            }
            if (certificateArr.length == 0) {
                this.e = aacz.f136c;
                return this;
            }
            X509Certificate[] x509CertificateArrC = SslContextUtil.c(certificateArr);
            SslContextUtil.b(x509CertificateArrC);
            this.e = x509CertificateArrC;
            return this;
        }

        public e d() {
            this.f141c = aacz.e;
            return this;
        }

        public NewAdvancedCertificateVerifier a() {
            return new aacz(this.e, this.f141c, this.f139a, this.f140b);
        }
    }
}
