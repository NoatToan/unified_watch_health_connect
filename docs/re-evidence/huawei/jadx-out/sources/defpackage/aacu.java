package defpackage;

import org.eclipse.californium.scandium.dtls.ExtendedMasterSecretMode;
import org.eclipse.californium.scandium.dtls.HandshakeResultHandler;
import org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore;
import org.eclipse.californium.scandium.dtls.resumption.ExtendedResumptionVerifier;

/* JADX INFO: loaded from: classes20.dex */
public class aacu implements ExtendedResumptionVerifier {
    private volatile ResumptionSupportingConnectionStore e;

    @Override // org.eclipse.californium.scandium.dtls.resumption.ResumptionVerifier
    public void setResultHandler(HandshakeResultHandler handshakeResultHandler) {
    }

    public boolean d() {
        return this.e != null;
    }

    public void e(ResumptionSupportingConnectionStore resumptionSupportingConnectionStore) {
        if (resumptionSupportingConnectionStore == null) {
            throw new NullPointerException("Connection store must not be null!");
        }
        this.e = resumptionSupportingConnectionStore;
    }

    @Override // org.eclipse.californium.scandium.dtls.resumption.ResumptionVerifier
    public boolean skipRequestHelloVerify(aacd aacdVar) {
        ResumptionSupportingConnectionStore resumptionSupportingConnectionStore = this.e;
        boolean z = false;
        if (resumptionSupportingConnectionStore != null) {
            aaam aaamVarFind = resumptionSupportingConnectionStore.find(aacdVar);
            z = aaamVarFind != null;
            aadd.a(aaamVarFind);
        }
        return z;
    }

    @Override // org.eclipse.californium.scandium.dtls.resumption.ExtendedResumptionVerifier
    public boolean skipRequestHelloVerify(aaai aaaiVar, boolean z, ExtendedMasterSecretMode extendedMasterSecretMode) {
        aaam aaamVarFind;
        ResumptionSupportingConnectionStore resumptionSupportingConnectionStore = this.e;
        if (resumptionSupportingConnectionStore == null || (aaamVarFind = resumptionSupportingConnectionStore.find(aaaiVar.getSessionId())) == null) {
            return false;
        }
        boolean zC = aabw.c(aaamVarFind, aaaiVar, z, extendedMasterSecretMode);
        aadd.a(aaamVarFind);
        return zC;
    }

    @Override // org.eclipse.californium.scandium.dtls.resumption.ResumptionVerifier
    public aabs verifyResumptionRequest(aaae aaaeVar, aade aadeVar, aacd aacdVar) {
        return new aabs(aaaeVar, this.e.find(aacdVar), null);
    }
}
