package com.nimbusds.jose.crypto;

import com.mapbox.maps.p;
import com.nimbusds.jose.ActionRequiredForJWSCompletionException;
import com.nimbusds.jose.CompletableJWSObjectSigning;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.JWSSignerOption;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ECDSA;
import com.nimbusds.jose.crypto.impl.ECDSAProvider;
import com.nimbusds.jose.crypto.opts.OptionUtils;
import com.nimbusds.jose.crypto.opts.UserAuthenticationRequired;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import java.util.Collections;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class ECDSASigner extends ECDSAProvider implements JWSSigner {
    private final Set<JWSSignerOption> opts;
    private final PrivateKey privateKey;

    public ECDSASigner(ECKey eCKey, Set<JWSSignerOption> set) throws JOSEException {
        super(ECDSA.resolveAlgorithm(eCKey.getCurve()));
        if (!eCKey.isPrivate()) {
            p.p("The EC JWK doesn't contain a private part");
            throw null;
        }
        this.privateKey = eCKey.toPrivateKey();
        this.opts = set == null ? Collections.EMPTY_SET : set;
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.JWSSigner
    public Base64URL sign(final JWSHeader jWSHeader, final byte[] bArr) throws JOSEException {
        JWSAlgorithm algorithm = jWSHeader.getAlgorithm();
        if (!supportedJWSAlgorithms().contains(algorithm)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(algorithm, supportedJWSAlgorithms()));
        }
        try {
            final Signature signerAndVerifier = ECDSA.getSignerAndVerifier(algorithm, getJCAContext().getProvider());
            signerAndVerifier.initSign(this.privateKey, getJCAContext().getSecureRandom());
            if (OptionUtils.optionIsPresent(this.opts, UserAuthenticationRequired.class)) {
                throw new ActionRequiredForJWSCompletionException("Authenticate user to complete signing", UserAuthenticationRequired.getInstance(), new CompletableJWSObjectSigning() { // from class: com.nimbusds.jose.crypto.ECDSASigner.1
                    @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                    public Base64URL complete() throws JOSEException {
                        try {
                            signerAndVerifier.update(bArr);
                            return Base64URL.encode(ECDSA.transcodeSignatureToConcat(signerAndVerifier.sign(), ECDSA.getSignatureByteArrayLength(jWSHeader.getAlgorithm())));
                        } catch (SignatureException e4) {
                            throw new JOSEException(e4.getMessage(), e4);
                        }
                    }

                    @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                    public Signature getInitializedSignature() {
                        return signerAndVerifier;
                    }
                });
            }
            signerAndVerifier.update(bArr);
            return Base64URL.encode(ECDSA.transcodeSignatureToConcat(signerAndVerifier.sign(), ECDSA.getSignatureByteArrayLength(jWSHeader.getAlgorithm())));
        } catch (InvalidKeyException | SignatureException e4) {
            throw new JOSEException(e4.getMessage(), e4);
        }
    }

    public ECDSASigner(ECPrivateKey eCPrivateKey, Set<JWSSignerOption> set) {
        super(ECDSA.resolveAlgorithm(eCPrivateKey));
        this.privateKey = eCPrivateKey;
        this.opts = set == null ? Collections.EMPTY_SET : set;
    }

    public ECDSASigner(PrivateKey privateKey, Curve curve) {
        this(privateKey, curve, null);
    }

    public ECDSASigner(PrivateKey privateKey, Curve curve, Set<JWSSignerOption> set) {
        super(ECDSA.resolveAlgorithm(curve));
        if ("EC".equalsIgnoreCase(privateKey.getAlgorithm())) {
            this.privateKey = privateKey;
            this.opts = set == null ? Collections.EMPTY_SET : set;
        } else {
            h.s("The private key algorithm must be EC");
            throw null;
        }
    }

    public ECDSASigner(ECKey eCKey) {
        this(eCKey, (Set<JWSSignerOption>) null);
    }

    public ECDSASigner(ECPrivateKey eCPrivateKey) {
        this(eCPrivateKey, (Set<JWSSignerOption>) null);
    }
}
