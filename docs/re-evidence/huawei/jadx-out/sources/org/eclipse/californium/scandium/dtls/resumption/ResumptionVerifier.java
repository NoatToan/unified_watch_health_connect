package org.eclipse.californium.scandium.dtls.resumption;

import defpackage.aaae;
import defpackage.aabs;
import defpackage.aacd;
import defpackage.aade;
import org.eclipse.californium.scandium.dtls.HandshakeResultHandler;

/* JADX INFO: loaded from: classes20.dex */
public interface ResumptionVerifier {
    void setResultHandler(HandshakeResultHandler handshakeResultHandler);

    boolean skipRequestHelloVerify(aacd aacdVar);

    aabs verifyResumptionRequest(aaae aaaeVar, aade aadeVar, aacd aacdVar);
}
