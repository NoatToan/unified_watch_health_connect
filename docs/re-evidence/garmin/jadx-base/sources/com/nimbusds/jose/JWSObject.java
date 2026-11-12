package com.nimbusds.jose;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.gson.internal.a;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import java.security.Signature;
import java.text.ParseException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class JWSObject extends JOSEObject {
    private static final long serialVersionUID = 1;
    private final JWSHeader header;
    private Base64URL signature;
    private final String signingInputString;
    private final AtomicReference<State> state;

    public enum State {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public JWSObject(Base64URL base64URL, Payload payload, Base64URL base64URL2) throws ParseException {
        AtomicReference<State> atomicReference = new AtomicReference<>();
        this.state = atomicReference;
        try {
            this.header = JWSHeader.parse(base64URL);
            Objects.requireNonNull(payload);
            setPayload(payload);
            this.signingInputString = composeSigningInput();
            if (base64URL2.toString().trim().isEmpty()) {
                p.i(0, "The signature must not be empty");
                throw null;
            }
            this.signature = base64URL2;
            atomicReference.set(State.SIGNED);
            if (getHeader().isBase64URLEncodePayload()) {
                setParsedParts(base64URL, payload.toBase64URL(), base64URL2);
            } else {
                setParsedParts(base64URL, new Base64URL(""), base64URL2);
            }
        } catch (ParseException e4) {
            a.A(e4.getMessage(), "Invalid JWS header: ");
            throw null;
        }
    }

    private String composeSigningInput() {
        if (this.header.isBase64URLEncodePayload()) {
            return getHeader().toBase64URL().toString() + '.' + getPayload().toBase64URL().toString();
        }
        return getHeader().toBase64URL().toString() + '.' + getPayload().toString();
    }

    private void ensureJWSSignerSupport(JWSSigner jWSSigner) throws JOSEException {
        if (jWSSigner.supportedJWSAlgorithms().contains(getHeader().getAlgorithm())) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("The ");
        sb3.append(getHeader().getAlgorithm());
        Set<JWSAlgorithm> setSupportedJWSAlgorithms = jWSSigner.supportedJWSAlgorithms();
        sb3.append(" algorithm is not allowed or supported by the JWS signer: Supported algorithms: ");
        sb3.append(setSupportedJWSAlgorithms);
        throw new JOSEException(sb3.toString());
    }

    private void ensureSignedOrVerifiedState() {
        if (this.state.get() == State.SIGNED || this.state.get() == State.VERIFIED) {
            return;
        }
        h.z("The JWS object must be in a signed or verified state");
    }

    private void ensureUnsignedState() {
        if (this.state.get() == State.UNSIGNED) {
            return;
        }
        h.z("The JWS object must be in an unsigned state");
    }

    public static JWSObject parse(String str, Payload payload) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit.length != 3) {
            p.i(0, "Unexpected number of Base64URL parts, must be three");
            return null;
        }
        if (base64URLArrSplit[1].toString().isEmpty()) {
            return new JWSObject(base64URLArrSplit[0], payload, base64URLArrSplit[2]);
        }
        p.i(0, "The payload Base64URL part must be empty");
        return null;
    }

    public Base64URL getSignature() {
        return this.signature;
    }

    public byte[] getSigningInput() {
        return this.signingInputString.getBytes(StandardCharset.UTF_8);
    }

    public State getState() {
        return this.state.get();
    }

    public String serialize(boolean z14) {
        ensureSignedOrVerifiedState();
        if (z14) {
            return this.header.toBase64URL().toString() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.signature.toString();
        }
        return this.signingInputString + '.' + this.signature.toString();
    }

    public synchronized void sign(JWSSigner jWSSigner) {
        ensureUnsignedState();
        ensureJWSSignerSupport(jWSSigner);
        try {
            this.signature = jWSSigner.sign(getHeader(), getSigningInput());
            this.state.set(State.SIGNED);
        } catch (ActionRequiredForJWSCompletionException e4) {
            throw new ActionRequiredForJWSCompletionException(e4.getMessage(), e4.getTriggeringOption(), new CompletableJWSObjectSigning() { // from class: com.nimbusds.jose.JWSObject.1
                @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                public Base64URL complete() {
                    JWSObject.this.signature = e4.getCompletableJWSObjectSigning().complete();
                    JWSObject.this.state.set(State.SIGNED);
                    return JWSObject.this.signature;
                }

                @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                public Signature getInitializedSignature() {
                    return e4.getCompletableJWSObjectSigning().getInitializedSignature();
                }
            });
        } catch (JOSEException e14) {
            throw e14;
        } catch (Exception e15) {
            throw new JOSEException(e15.getMessage(), e15);
        }
    }

    public synchronized boolean verify(JWSVerifier jWSVerifier) {
        boolean zVerify;
        ensureSignedOrVerifiedState();
        try {
            zVerify = jWSVerifier.verify(getHeader(), getSigningInput(), getSignature());
            if (zVerify) {
                this.state.set(State.VERIFIED);
            }
        } catch (JOSEException e4) {
            throw e4;
        } catch (Exception e14) {
            throw new JOSEException(e14.getMessage(), e14);
        }
        return zVerify;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public JWSHeader getHeader() {
        return this.header;
    }

    public static JWSObject parse(String str) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit.length == 3) {
            return new JWSObject(base64URLArrSplit[0], base64URLArrSplit[1], base64URLArrSplit[2]);
        }
        p.i(0, "Unexpected number of Base64URL parts, must be three");
        return null;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public String serialize() {
        return serialize(false);
    }

    public JWSObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
        this(base64URL, new Payload(base64URL2), base64URL3);
    }

    public JWSObject(JWSHeader jWSHeader, Payload payload) {
        AtomicReference<State> atomicReference = new AtomicReference<>();
        this.state = atomicReference;
        Objects.requireNonNull(jWSHeader);
        this.header = jWSHeader;
        Objects.requireNonNull(payload);
        setPayload(payload);
        this.signingInputString = composeSigningInput();
        this.signature = null;
        atomicReference.set(State.UNSIGNED);
    }
}
