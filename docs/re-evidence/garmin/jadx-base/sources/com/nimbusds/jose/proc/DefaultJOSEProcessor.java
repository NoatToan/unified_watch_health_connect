package com.nimbusds.jose.proc;

import com.mapbox.maps.p;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.PlainObject;
import com.nimbusds.jose.crypto.factories.DefaultJWEDecrypterFactory;
import com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import java.security.Key;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class DefaultJOSEProcessor<C extends SecurityContext> implements ConfigurableJOSEProcessor<C> {
    private JWEDecrypterFactory jweDecrypterFactory;
    private JWEKeySelector<C> jweKeySelector;
    private JOSEObjectTypeVerifier<C> jweTypeVerifier;
    private JWSKeySelector<C> jwsKeySelector;
    private JOSEObjectTypeVerifier<C> jwsTypeVerifier;
    private JWSVerifierFactory jwsVerifierFactory;

    public DefaultJOSEProcessor() {
        DefaultJOSEObjectTypeVerifier defaultJOSEObjectTypeVerifier = DefaultJOSEObjectTypeVerifier.JOSE;
        this.jwsTypeVerifier = defaultJOSEObjectTypeVerifier;
        this.jweTypeVerifier = defaultJOSEObjectTypeVerifier;
        this.jwsVerifierFactory = new DefaultJWSVerifierFactory();
        this.jweDecrypterFactory = new DefaultJWEDecrypterFactory();
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWEDecrypterFactory getJWEDecrypterFactory() {
        return this.jweDecrypterFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWEKeySelector<C> getJWEKeySelector() {
        return this.jweKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JOSEObjectTypeVerifier<C> getJWETypeVerifier() {
        return this.jweTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWSKeySelector<C> getJWSKeySelector() {
        return this.jwsKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JOSEObjectTypeVerifier<C> getJWSTypeVerifier() {
        return this.jwsTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWSVerifierFactory getJWSVerifierFactory() {
        return this.jwsVerifierFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(JWEObject jWEObject, C c14) throws BadJOSEException, JOSEException {
        JWSObject jWSObject;
        JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.jweTypeVerifier;
        if (jOSEObjectTypeVerifier == null) {
            throw new BadJOSEException("JWE object rejected: No JWE header typ (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(jWEObject.getHeader().getType(), c14);
        if (getJWEKeySelector() == null) {
            throw new BadJOSEException("JWE object rejected: No JWE key selector is configured");
        }
        if (getJWEDecrypterFactory() == null) {
            p.p("No JWE decrypter is configured");
            return null;
        }
        List<? extends Key> listSelectJWEKeys = getJWEKeySelector().selectJWEKeys(jWEObject.getHeader(), c14);
        if (listSelectJWEKeys == null || listSelectJWEKeys.isEmpty()) {
            throw new BadJOSEException("JWE object rejected: Another algorithm expected, or no matching key(s) found");
        }
        ListIterator<? extends Key> listIterator = listSelectJWEKeys.listIterator();
        while (listIterator.hasNext()) {
            JWEDecrypter jWEDecrypterCreateJWEDecrypter = getJWEDecrypterFactory().createJWEDecrypter(jWEObject.getHeader(), listIterator.next());
            if (jWEDecrypterCreateJWEDecrypter != null) {
                try {
                    jWEObject.decrypt(jWEDecrypterCreateJWEDecrypter);
                    if ("JWT".equalsIgnoreCase(jWEObject.getHeader().getContentType()) && (jWSObject = jWEObject.getPayload().toJWSObject()) != null) {
                        return process(jWSObject, (SecurityContext) c14);
                    }
                    return jWEObject.getPayload();
                } catch (JOSEException e4) {
                    if (!listIterator.hasNext()) {
                        throw new BadJWEException("JWE object rejected: " + e4.getMessage(), e4);
                    }
                }
            }
        }
        throw new BadJOSEException("JWE object rejected: No matching decrypter(s) found");
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEDecrypterFactory(JWEDecrypterFactory jWEDecrypterFactory) {
        this.jweDecrypterFactory = jWEDecrypterFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEKeySelector(JWEKeySelector<C> jWEKeySelector) {
        this.jweKeySelector = jWEKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWETypeVerifier(JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.jweTypeVerifier = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSKeySelector(JWSKeySelector<C> jWSKeySelector) {
        this.jwsKeySelector = jWSKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSTypeVerifier(JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.jwsTypeVerifier = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSVerifierFactory(JWSVerifierFactory jWSVerifierFactory) {
        this.jwsVerifierFactory = jWSVerifierFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(JOSEObject jOSEObject, C c14) throws JOSEException {
        if (jOSEObject instanceof JWSObject) {
            return process((JWSObject) jOSEObject, (SecurityContext) c14);
        }
        if (jOSEObject instanceof JWEObject) {
            return process((JWEObject) jOSEObject, (SecurityContext) c14);
        }
        if (jOSEObject instanceof PlainObject) {
            return process((PlainObject) jOSEObject, (SecurityContext) c14);
        }
        throw new JOSEException("Unexpected JOSE object type: " + jOSEObject.getClass());
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(PlainObject plainObject, C c14) throws BadJOSEException {
        JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.jwsTypeVerifier;
        if (jOSEObjectTypeVerifier == null) {
            throw new BadJOSEException("Unsecured (plain) JOSE object rejected: No JWS header typ (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(plainObject.getHeader().getType(), c14);
        throw new BadJOSEException("Unsecured (plain) JOSE objects are rejected, extend class to handle");
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(JWSObject jWSObject, C c14) throws BadJOSEException, JOSEException {
        JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.jwsTypeVerifier;
        if (jOSEObjectTypeVerifier != null) {
            jOSEObjectTypeVerifier.verify(jWSObject.getHeader().getType(), c14);
            if (getJWSKeySelector() != null) {
                if (getJWSVerifierFactory() != null) {
                    List<? extends Key> listSelectJWSKeys = getJWSKeySelector().selectJWSKeys(jWSObject.getHeader(), c14);
                    if (listSelectJWSKeys != null && !listSelectJWSKeys.isEmpty()) {
                        ListIterator<? extends Key> listIterator = listSelectJWSKeys.listIterator();
                        while (listIterator.hasNext()) {
                            JWSVerifier jWSVerifierCreateJWSVerifier = getJWSVerifierFactory().createJWSVerifier(jWSObject.getHeader(), listIterator.next());
                            if (jWSVerifierCreateJWSVerifier != null) {
                                if (jWSObject.verify(jWSVerifierCreateJWSVerifier)) {
                                    return jWSObject.getPayload();
                                }
                                if (!listIterator.hasNext()) {
                                    throw new BadJWSException("JWS object rejected: Invalid signature");
                                }
                            }
                        }
                        throw new BadJOSEException("JWS object rejected: No matching verifier(s) found");
                    }
                    throw new BadJOSEException("JWS object rejected: Another algorithm expected, or no matching key(s) found");
                }
                p.p("No JWS verifier is configured");
                return null;
            }
            throw new BadJOSEException("JWS object rejected: No JWS key selector is configured");
        }
        throw new BadJOSEException("JWS object rejected: No JWS header typ (type) verifier is configured");
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(String str, C c14) {
        return process(JOSEObject.parse(str), c14);
    }
}
