package com.nimbusds.jose.mint;

import com.mapbox.maps.p;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.factories.DefaultJWSSignerFactory;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKMatcher;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.JWKSecurityContext;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.produce.JWSSignerFactory;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultJWSMinter<C extends SecurityContext> implements ConfigurableJWSMinter<C> {
    private JWKSource<C> jwkSource;
    private JWSSignerFactory jwsSignerFactory = new DefaultJWSSignerFactory();

    private List<JWK> jwks(JWSHeader jWSHeader, C c14) throws JOSEException {
        JWKSelector jWKSelector = new JWKSelector(JWKMatcher.forJWSHeader(jWSHeader));
        if (c14 instanceof JWKSecurityContext) {
            return jWKSelector.select(new JWKSet(((JWKSecurityContext) c14).getKeys()));
        }
        JWKSource<C> jWKSource = this.jwkSource;
        if (jWKSource != null) {
            return jWKSource.get(jWKSelector, c14);
        }
        p.p("No JWK source configured");
        return null;
    }

    @Override // com.nimbusds.jose.mint.JWSMinterConfiguration
    public JWKSource<C> getJWKSource() {
        return this.jwkSource;
    }

    @Override // com.nimbusds.jose.mint.JWSMinterConfiguration
    public JWSSignerFactory getJWSSignerFactory() {
        return this.jwsSignerFactory;
    }

    @Override // com.nimbusds.jose.mint.JWSMinter
    public JWSObject mint(JWSHeader jWSHeader, Payload payload, C c14) throws JOSEException {
        List<JWK> listJwks = jwks(jWSHeader, c14);
        if (listJwks.isEmpty()) {
            p.p("No JWKs found for signing");
            return null;
        }
        JWK jwk = listJwks.get(0);
        JWSObject jWSObject = new JWSObject(new JWSHeader.Builder(jWSHeader).keyID(jwk.getKeyID()).x509CertURL(jwk.getX509CertURL()).x509CertChain(jwk.getX509CertChain()).x509CertSHA256Thumbprint(jwk.getX509CertSHA256Thumbprint()).x509CertThumbprint(jwk.getX509CertThumbprint()).build(), payload);
        JWSSignerFactory jWSSignerFactory = this.jwsSignerFactory;
        if (jWSSignerFactory != null) {
            jWSObject.sign(jWSSignerFactory.createJWSSigner(jwk));
            return jWSObject;
        }
        p.p("No JWS signer factory configured");
        return null;
    }

    @Override // com.nimbusds.jose.mint.JWSMinterConfiguration
    public void setJWKSource(JWKSource<C> jWKSource) {
        this.jwkSource = jWKSource;
    }

    @Override // com.nimbusds.jose.mint.JWSMinterConfiguration
    public void setJWSSignerFactory(JWSSignerFactory jWSSignerFactory) {
        this.jwsSignerFactory = jWSSignerFactory;
    }
}
