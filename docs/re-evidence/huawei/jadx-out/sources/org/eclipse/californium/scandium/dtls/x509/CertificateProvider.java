package org.eclipse.californium.scandium.dtls.x509;

import defpackage.aaab;
import defpackage.aaae;
import defpackage.aade;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.HandshakeResultHandler;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;

/* JADX INFO: loaded from: classes20.dex */
public interface CertificateProvider {
    List<CipherSuite.CertificateKeyAlgorithm> getSupportedCertificateKeyAlgorithms();

    List<CertificateType> getSupportedCertificateTypes();

    aaab requestCertificateIdentity(aaae aaaeVar, boolean z, List<X500Principal> list, aade aadeVar, List<CipherSuite.CertificateKeyAlgorithm> list2, List<SignatureAndHashAlgorithm> list3, List<XECDHECryptography.SupportedGroup> list4);

    void setResultHandler(HandshakeResultHandler handshakeResultHandler);
}
