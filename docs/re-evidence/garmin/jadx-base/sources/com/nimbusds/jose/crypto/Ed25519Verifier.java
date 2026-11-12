package com.nimbusds.jose.crypto;

import com.google.crypto.tink.subtle.Ed25519Verify;
import com.mapbox.maps.p;
import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.EdDSAProvider;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.OctetKeyPair;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class Ed25519Verifier extends EdDSAProvider implements JWSVerifier, CriticalHeaderParamsAware {
    private final CriticalHeaderParamsDeferral critPolicy;
    private final OctetKeyPair publicKey;
    private final Ed25519Verify tinkVerifier;

    public Ed25519Verifier(OctetKeyPair octetKeyPair, Set<String> set) throws JOSEException {
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        if (!Curve.Ed25519.equals(octetKeyPair.getCurve())) {
            p.p("Ed25519Verifier only supports OctetKeyPairs with crv=Ed25519");
            throw null;
        }
        if (octetKeyPair.isPrivate()) {
            p.p("Ed25519Verifier requires a public key, use OctetKeyPair.toPublicJWK()");
            throw null;
        }
        this.publicKey = octetKeyPair;
        this.tinkVerifier = new Ed25519Verify(octetKeyPair.getDecodedX());
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public OctetKeyPair getPublicKey() {
        return this.publicKey;
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public boolean verify(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException {
        JWSAlgorithm algorithm = jWSHeader.getAlgorithm();
        if (!JWSAlgorithm.Ed25519.equals(algorithm) && !JWSAlgorithm.EdDSA.equals(algorithm)) {
            p.p("Ed25519Verifier requires alg=Ed25519 or alg=EdDSA in JWSHeader");
            return false;
        }
        if (!this.critPolicy.headerPasses(jWSHeader)) {
            return false;
        }
        try {
            this.tinkVerifier.verify(base64URL.decode(), bArr);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public Ed25519Verifier(OctetKeyPair octetKeyPair) {
        this(octetKeyPair, null);
    }
}
