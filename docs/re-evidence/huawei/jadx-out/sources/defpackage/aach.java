package defpackage;

import java.util.Iterator;
import org.eclipse.californium.elements.config.CertificateAuthenticationMode;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuiteParameters;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuiteSelector;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aach implements CipherSuiteSelector {

    @Deprecated
    protected static final Logger e = aaex.a((Class<?>) aach.class);

    @Override // org.eclipse.californium.scandium.dtls.cipher.CipherSuiteSelector
    public boolean select(CipherSuiteParameters cipherSuiteParameters) {
        if (cipherSuiteParameters.b().isEmpty()) {
            cipherSuiteParameters.c(CipherSuiteParameters.GeneralMismatch.CIPHER_SUITE);
            return false;
        }
        Iterator<CipherSuite> it = cipherSuiteParameters.b().iterator();
        while (it.hasNext()) {
            if (c(it.next(), cipherSuiteParameters)) {
                return true;
            }
        }
        return false;
    }

    protected boolean c(CipherSuite cipherSuite, CipherSuiteParameters cipherSuiteParameters) {
        if (cipherSuite.isEccBased()) {
            if (cipherSuiteParameters.s().isEmpty()) {
                cipherSuiteParameters.c(CipherSuiteParameters.GeneralMismatch.EC_GROUPS);
                return false;
            }
            if (cipherSuiteParameters.h() == null) {
                cipherSuiteParameters.c(CipherSuiteParameters.GeneralMismatch.EC_FORMAT);
                return false;
            }
        }
        if (cipherSuite.requiresServerCertificateMessage()) {
            if (cipherSuiteParameters.c() == null) {
                return b(cipherSuiteParameters, cipherSuite);
            }
            return false;
        }
        if (cipherSuite.isEccBased()) {
            cipherSuiteParameters.b(cipherSuiteParameters.s().get(0));
        }
        cipherSuiteParameters.c(cipherSuite);
        return true;
    }

    protected boolean b(CipherSuiteParameters cipherSuiteParameters, CipherSuite cipherSuite) {
        XECDHECryptography.SupportedGroup supportedGroupFromPublicKey;
        CipherSuite.CertificateKeyAlgorithm certificateKeyAlgorithm = cipherSuite.getCertificateKeyAlgorithm();
        if (!zzm.b(certificateKeyAlgorithm.name())) {
            throw new IllegalArgumentException(certificateKeyAlgorithm.name() + " based cipher suites are supported!");
        }
        if (!certificateKeyAlgorithm.isCompatible(cipherSuiteParameters.g())) {
            return false;
        }
        if (cipherSuiteParameters.l().isEmpty()) {
            cipherSuiteParameters.e(CipherSuiteParameters.CertificateBasedMismatch.SERVER_CERT_TYPE);
            return false;
        }
        CertificateAuthenticationMode certificateAuthenticationModeE = cipherSuiteParameters.e();
        if (certificateAuthenticationModeE.useCertificateRequest() && cipherSuiteParameters.d().isEmpty()) {
            cipherSuiteParameters.e(CipherSuiteParameters.CertificateBasedMismatch.CLIENT_CERT_TYPE);
            return false;
        }
        if (cipherSuiteParameters.t().isEmpty()) {
            cipherSuiteParameters.e(CipherSuiteParameters.CertificateBasedMismatch.SIGNATURE_ALGORITHMS);
            return false;
        }
        if (cipherSuite.getCertificateKeyAlgorithm() == CipherSuite.CertificateKeyAlgorithm.EC && ((supportedGroupFromPublicKey = XECDHECryptography.SupportedGroup.fromPublicKey(cipherSuiteParameters.g())) == null || !cipherSuiteParameters.s().contains(supportedGroupFromPublicKey))) {
            cipherSuiteParameters.e(CipherSuiteParameters.CertificateBasedMismatch.CERTIFICATE_EC_GROUPS);
            return false;
        }
        SignatureAndHashAlgorithm signatureAndHashAlgorithmA = SignatureAndHashAlgorithm.a(cipherSuiteParameters.t(), cipherSuiteParameters.g());
        if (signatureAndHashAlgorithmA == null) {
            cipherSuiteParameters.e(CipherSuiteParameters.CertificateBasedMismatch.CERTIFICATE_SIGNATURE_ALGORITHMS);
            return false;
        }
        CertificateType certificateType = cipherSuiteParameters.l().get(0);
        if (CertificateType.X_509.equals(certificateType)) {
            if (cipherSuiteParameters.a() == null) {
                throw new IllegalArgumentException("Certificate type x509 requires a certificate chain!");
            }
            boolean zD = SignatureAndHashAlgorithm.d(cipherSuiteParameters.t(), cipherSuiteParameters.a());
            if (zD) {
                zD = XECDHECryptography.SupportedGroup.isSupported(cipherSuiteParameters.s(), cipherSuiteParameters.a());
            }
            if (!zD) {
                if (cipherSuiteParameters.l().contains(CertificateType.RAW_PUBLIC_KEY)) {
                    certificateType = CertificateType.RAW_PUBLIC_KEY;
                } else {
                    cipherSuiteParameters.e(CipherSuiteParameters.CertificateBasedMismatch.CERTIFICATE_PATH_SIGNATURE_ALGORITHMS);
                    return false;
                }
            }
        }
        cipherSuiteParameters.c(cipherSuite);
        cipherSuiteParameters.a(certificateType);
        cipherSuiteParameters.d(signatureAndHashAlgorithmA);
        cipherSuiteParameters.b(cipherSuiteParameters.s().get(0));
        cipherSuiteParameters.e(certificateAuthenticationModeE.useCertificateRequest() ? cipherSuiteParameters.d().get(0) : null);
        return true;
    }
}
