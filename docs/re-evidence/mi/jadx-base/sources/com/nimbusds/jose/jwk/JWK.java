package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.dep;
import defpackage.dgh;
import defpackage.kpd;
import defpackage.npd;
import defpackage.p0e;
import defpackage.ppr;
import defpackage.qpr;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class JWK implements Serializable {
    public static final String MIME_TYPE = "application/jwk+json; charset=UTF-8";
    private static final long serialVersionUID = 1;
    private final Algorithm alg;
    private final KeyStore keyStore;
    private final String kid;
    private final KeyType kty;
    private final Set<KeyOperation> ops;
    private final List<X509Certificate> parsedX5c;
    private final KeyUse use;
    private final List<Base64> x5c;

    @Deprecated
    private final Base64URL x5t;
    private final Base64URL x5t256;
    private final URI x5u;

    public JWK(KeyType keyType, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        if (keyType == null) {
            throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
        }
        this.kty = keyType;
        if (!p0e.a(keyUse, set)) {
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_opts\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        this.use = keyUse;
        this.ops = set;
        this.alg = algorithm;
        this.kid = str;
        this.x5u = uri;
        this.x5t = base64URL;
        this.x5t256 = base64URL2;
        if (list != null && list.isEmpty()) {
            throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
        }
        this.x5c = list;
        try {
            this.parsedX5c = ppr.a(list);
            this.keyStore = keyStore;
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e.getMessage(), e);
        }
    }

    public static JWK load(KeyStore keyStore, String str, char[] cArr) throws JOSEException, KeyStoreException {
        Certificate certificate = keyStore.getCertificate(str);
        if (certificate == null) {
            return OctetSequenceKey.load(keyStore, str, cArr);
        }
        if (certificate.getPublicKey() instanceof RSAPublicKey) {
            return RSAKey.load(keyStore, str, cArr);
        }
        if (certificate.getPublicKey() instanceof ECPublicKey) {
            return ECKey.load(keyStore, str, cArr);
        }
        throw new JOSEException("Unsupported public key algorithm: " + certificate.getPublicKey().getAlgorithm());
    }

    private static KeyPair mergeKeyPairs(List<KeyPair> list) throws JOSEException {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return twoKeysToKeyPair(list);
        }
        throw new JOSEException("Expected key or pair of PEM-encoded keys");
    }

    public static JWK parse(String str) throws ParseException {
        return parse(npd.m(str));
    }

    public static JWK parseFromPEMEncodedObjects(String str) throws JOSEException {
        List<KeyPair> listA = dgh.a(str);
        if (listA.isEmpty()) {
            throw new JOSEException("No PEM-encoded keys found");
        }
        KeyPair keyPairMergeKeyPairs = mergeKeyPairs(listA);
        PublicKey publicKey = keyPairMergeKeyPairs.getPublic();
        PrivateKey privateKey = keyPairMergeKeyPairs.getPrivate();
        if (publicKey == null) {
            throw new JOSEException("Missing PEM-encoded public key to construct JWK");
        }
        if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            ECParameterSpec params = eCPublicKey.getParams();
            if (privateKey instanceof ECPrivateKey) {
                validateEcCurves(eCPublicKey, (ECPrivateKey) privateKey);
            }
            if (privateKey == null || (privateKey instanceof ECPrivateKey)) {
                ECKey.a aVar = new ECKey.a(Curve.forECParameterSpec(params), eCPublicKey);
                if (privateKey != null) {
                    aVar.f((ECPrivateKey) privateKey);
                }
                return aVar.a();
            }
            throw new JOSEException("Unsupported EC private key type: " + privateKey);
        }
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new JOSEException("Unsupported algorithm of PEM-encoded key: " + publicKey.getAlgorithm());
        }
        RSAKey.a aVar2 = new RSAKey.a((RSAPublicKey) publicKey);
        if (privateKey instanceof RSAPrivateKey) {
            aVar2.h((RSAPrivateKey) privateKey);
        } else if (privateKey != null) {
            throw new JOSEException("Unsupported RSA private key type: " + privateKey);
        }
        return aVar2.a();
    }

    public static JWK parseFromPEMEncodedX509Cert(String str) throws JOSEException {
        X509Certificate x509CertificateA = qpr.a(str);
        if (x509CertificateA != null) {
            return parse(x509CertificateA);
        }
        throw new JOSEException("Couldn't parse PEM-encoded X.509 certificate");
    }

    private static KeyPair twoKeysToKeyPair(List<? extends KeyPair> list) throws JOSEException {
        KeyPair keyPair = list.get(0);
        KeyPair keyPair2 = list.get(1);
        if (keyPair.getPublic() != null && keyPair2.getPrivate() != null) {
            return new KeyPair(keyPair.getPublic(), keyPair2.getPrivate());
        }
        if (keyPair.getPrivate() == null || keyPair2.getPublic() == null) {
            throw new JOSEException("Not a public/private key pair");
        }
        return new KeyPair(keyPair2.getPublic(), keyPair.getPrivate());
    }

    private static void validateEcCurves(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws JOSEException {
        ECParameterSpec params = eCPublicKey.getParams();
        ECParameterSpec params2 = eCPrivateKey.getParams();
        if (!params.getCurve().equals(params2.getCurve())) {
            throw new JOSEException("Public/private EC key curve mismatch: " + eCPublicKey);
        }
        if (params.getCofactor() != params2.getCofactor()) {
            throw new JOSEException("Public/private EC key cofactor mismatch: " + eCPublicKey);
        }
        if (!params.getGenerator().equals(params2.getGenerator())) {
            throw new JOSEException("Public/private EC key generator mismatch: " + eCPublicKey);
        }
        if (params.getOrder().equals(params2.getOrder())) {
            return;
        }
        throw new JOSEException("Public/private EC key order mismatch: " + eCPublicKey);
    }

    public Base64URL computeThumbprint() throws JOSEException {
        return computeThumbprint(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWK)) {
            return false;
        }
        JWK jwk = (JWK) obj;
        return Objects.equals(this.kty, jwk.kty) && Objects.equals(this.use, jwk.use) && Objects.equals(this.ops, jwk.ops) && Objects.equals(this.alg, jwk.alg) && Objects.equals(this.kid, jwk.kid) && Objects.equals(this.x5u, jwk.x5u) && Objects.equals(this.x5t, jwk.x5t) && Objects.equals(this.x5t256, jwk.x5t256) && Objects.equals(this.x5c, jwk.x5c) && Objects.equals(this.keyStore, jwk.keyStore);
    }

    public Algorithm getAlgorithm() {
        return this.alg;
    }

    public String getKeyID() {
        return this.kid;
    }

    public Set<KeyOperation> getKeyOperations() {
        return this.ops;
    }

    public KeyStore getKeyStore() {
        return this.keyStore;
    }

    public KeyType getKeyType() {
        return this.kty;
    }

    public KeyUse getKeyUse() {
        return this.use;
    }

    public List<X509Certificate> getParsedX509CertChain() {
        List<X509Certificate> list = this.parsedX5c;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public abstract LinkedHashMap<String, ?> getRequiredParams();

    public List<Base64> getX509CertChain() {
        List<Base64> list = this.x5c;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public Base64URL getX509CertSHA256Thumbprint() {
        return this.x5t256;
    }

    @Deprecated
    public Base64URL getX509CertThumbprint() {
        return this.x5t;
    }

    public URI getX509CertURL() {
        return this.x5u;
    }

    public int hashCode() {
        return Objects.hash(this.kty, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.keyStore);
    }

    public abstract boolean isPrivate();

    public abstract int size();

    public ECKey toECKey() {
        return (ECKey) this;
    }

    public Map<String, Object> toJSONObject() {
        Map<String, Object> mapL = npd.l();
        mapL.put("kty", this.kty.getValue());
        KeyUse keyUse = this.use;
        if (keyUse != null) {
            mapL.put("use", keyUse.identifier());
        }
        if (this.ops != null) {
            List<Object> listA = kpd.a();
            Iterator<KeyOperation> it = this.ops.iterator();
            while (it.hasNext()) {
                listA.add(it.next().identifier());
            }
            mapL.put("key_ops", listA);
        }
        Algorithm algorithm = this.alg;
        if (algorithm != null) {
            mapL.put("alg", algorithm.getName());
        }
        String str = this.kid;
        if (str != null) {
            mapL.put("kid", str);
        }
        URI uri = this.x5u;
        if (uri != null) {
            mapL.put("x5u", uri.toString());
        }
        Base64URL base64URL = this.x5t;
        if (base64URL != null) {
            mapL.put("x5t", base64URL.toString());
        }
        Base64URL base64URL2 = this.x5t256;
        if (base64URL2 != null) {
            mapL.put("x5t#S256", base64URL2.toString());
        }
        if (this.x5c != null) {
            List<Object> listA2 = kpd.a();
            Iterator<Base64> it2 = this.x5c.iterator();
            while (it2.hasNext()) {
                listA2.add(it2.next().toString());
            }
            mapL.put("x5c", listA2);
        }
        return mapL;
    }

    public String toJSONString() {
        return npd.n(toJSONObject());
    }

    public OctetKeyPair toOctetKeyPair() {
        return (OctetKeyPair) this;
    }

    public OctetSequenceKey toOctetSequenceKey() {
        return (OctetSequenceKey) this;
    }

    public abstract JWK toPublicJWK();

    public RSAKey toRSAKey() {
        return (RSAKey) this;
    }

    public String toString() {
        return npd.n(toJSONObject());
    }

    public static JWK parse(Map<String, Object> map) throws ParseException {
        String strH = npd.h(map, "kty");
        if (strH == null) {
            throw new ParseException("Missing key type \"kty\" parameter", 0);
        }
        KeyType keyType = KeyType.parse(strH);
        if (keyType == KeyType.EC) {
            return ECKey.parse(map);
        }
        if (keyType == KeyType.RSA) {
            return RSAKey.parse(map);
        }
        if (keyType == KeyType.OCT) {
            return OctetSequenceKey.parse(map);
        }
        if (keyType == KeyType.OKP) {
            return OctetKeyPair.parse(map);
        }
        throw new ParseException("Unsupported key type \"kty\" parameter: " + keyType, 0);
    }

    public Base64URL computeThumbprint(String str) throws JOSEException {
        return dep.a(str, this);
    }

    public static JWK parse(X509Certificate x509Certificate) throws JOSEException {
        if (x509Certificate.getPublicKey() instanceof RSAPublicKey) {
            return RSAKey.parse(x509Certificate);
        }
        if (x509Certificate.getPublicKey() instanceof ECPublicKey) {
            return ECKey.parse(x509Certificate);
        }
        throw new JOSEException("Unsupported public key algorithm: " + x509Certificate.getPublicKey().getAlgorithm());
    }
}
