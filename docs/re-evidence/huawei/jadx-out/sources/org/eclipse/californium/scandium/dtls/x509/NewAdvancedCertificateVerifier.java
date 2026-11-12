package org.eclipse.californium.scandium.dtls.x509;

import defpackage.aaac;
import defpackage.aaae;
import defpackage.aade;
import defpackage.zzz;
import java.net.InetSocketAddress;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.HandshakeResultHandler;

/* JADX INFO: loaded from: classes20.dex */
public interface NewAdvancedCertificateVerifier {
    List<X500Principal> getAcceptedIssuers();

    List<CertificateType> getSupportedCertificateTypes();

    void setResultHandler(HandshakeResultHandler handshakeResultHandler);

    aaac verifyCertificate(aaae aaaeVar, aade aadeVar, InetSocketAddress inetSocketAddress, boolean z, boolean z2, boolean z3, zzz zzzVar);
}
