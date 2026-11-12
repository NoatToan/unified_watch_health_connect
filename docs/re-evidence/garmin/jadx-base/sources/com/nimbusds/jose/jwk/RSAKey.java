package com.nimbusds.jose.jwk;

import com.airbnb.lottie.animation.keyframe.a;
import com.mapbox.maps.p;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.URI;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
import java.security.spec.RSAOtherPrimeInfo;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class RSAKey extends JWK implements AsymmetricJWK {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Base64URL f54724d;

    /* JADX INFO: renamed from: dp, reason: collision with root package name */
    private final Base64URL f54725dp;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private final Base64URL f54726dq;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Base64URL f54727e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Base64URL f54728n;
    private final List<OtherPrimesInfo> oth;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Base64URL f54729p;
    private final PrivateKey privateKey;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Base64URL f54730q;

    /* JADX INFO: renamed from: qi, reason: collision with root package name */
    private final Base64URL f54731qi;

    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8 A[ADDED_TO_REGION] */
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        Base64URL base64URL11;
        Base64URL base64URL12;
        super(KeyType.RSA, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, date, date2, date3, keyRevocation, keyStore);
        Objects.requireNonNull(base64URL, "The modulus value must not be null");
        this.f54728n = base64URL;
        Objects.requireNonNull(base64URL2, "The public exponent value must not be null");
        this.f54727e = base64URL2;
        if (getParsedX509CertChain() != null && !matches(getParsedX509CertChain().get(0))) {
            h.s("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
            throw null;
        }
        this.f54724d = base64URL3;
        if (base64URL4 != null && base64URL5 != null) {
            base64URL11 = base64URL7;
            if (base64URL6 != null) {
                base64URL12 = base64URL8;
                if (base64URL11 != null && base64URL12 != null) {
                    this.f54729p = base64URL4;
                    this.f54730q = base64URL5;
                    this.f54725dp = base64URL6;
                    this.f54726dq = base64URL11;
                    this.f54731qi = base64URL12;
                    if (list != null) {
                        this.oth = Collections.unmodifiableList(list);
                    } else {
                        this.oth = Collections.EMPTY_LIST;
                    }
                }
                this.privateKey = privateKey;
            }
            if (base64URL4 != null && base64URL5 == null && base64URL6 == null && base64URL11 == null && base64URL12 == null && list == null) {
                this.f54729p = null;
                this.f54730q = null;
                this.f54725dp = null;
                this.f54726dq = null;
                this.f54731qi = null;
                this.oth = Collections.EMPTY_LIST;
            } else {
                if (base64URL4 == null || base64URL5 != null || base64URL6 != null || base64URL11 != null || base64URL12 != null) {
                    Objects.requireNonNull(base64URL4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
                    Objects.requireNonNull(base64URL5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
                    Objects.requireNonNull(base64URL6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                    Objects.requireNonNull(base64URL11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                    h.s("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                    throw null;
                }
                this.f54729p = null;
                this.f54730q = null;
                this.f54725dp = null;
                this.f54726dq = null;
                this.f54731qi = null;
                this.oth = Collections.EMPTY_LIST;
            }
            this.privateKey = privateKey;
        }
        base64URL11 = base64URL7;
        base64URL12 = base64URL8;
        if (base64URL4 != null) {
            if (base64URL4 == null) {
            }
            Objects.requireNonNull(base64URL4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
            Objects.requireNonNull(base64URL5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
            Objects.requireNonNull(base64URL6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
            Objects.requireNonNull(base64URL11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
            h.s("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
            throw null;
        }
        if (base64URL4 == null) {
        }
        Objects.requireNonNull(base64URL4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
        Objects.requireNonNull(base64URL5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
        Objects.requireNonNull(base64URL6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
        Objects.requireNonNull(base64URL11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
        h.s("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
        throw null;
        this.privateKey = privateKey;
    }

    public static RSAKey load(KeyStore keyStore, String str, char[] cArr) {
        Certificate certificate = keyStore.getCertificate(str);
        if (!(certificate instanceof X509Certificate)) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!(x509Certificate.getPublicKey() instanceof RSAPublicKey)) {
            p.p("Couldn't load RSA JWK: The key algorithm is not RSA");
            return null;
        }
        RSAKey rSAKeyBuild = new Builder(parse(x509Certificate)).keyID(str).keyStore(keyStore).build();
        try {
            Key key = keyStore.getKey(str, cArr);
            if (key instanceof RSAPrivateKey) {
                return new Builder(rSAKeyBuild).privateKey((RSAPrivateKey) key).build();
            }
            return ((key instanceof PrivateKey) && "RSA".equalsIgnoreCase(key.getAlgorithm())) ? new Builder(rSAKeyBuild).privateKey((PrivateKey) key).build() : rSAKeyBuild;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e4) {
            throw new JOSEException("Couldn't retrieve private RSA key (bad pin?): " + e4.getMessage(), e4);
        }
    }

    public static RSAKey parse(Map<String, Object> map) throws ParseException {
        ArrayList arrayList;
        List<Object> jSONArray;
        if (!KeyType.RSA.equals(JWKMetadata.parseKeyType(map))) {
            p.i(0, "The key type \"kty\" must be RSA");
            return null;
        }
        Base64URL base64URL = JSONObjectUtils.getBase64URL(map, JWKParameterNames.RSA_MODULUS);
        Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, JWKParameterNames.RSA_EXPONENT);
        Base64URL base64URL3 = JSONObjectUtils.getBase64URL(map, "d");
        Base64URL base64URL4 = JSONObjectUtils.getBase64URL(map, "p");
        Base64URL base64URL5 = JSONObjectUtils.getBase64URL(map, JWKParameterNames.RSA_SECOND_PRIME_FACTOR);
        Base64URL base64URL6 = JSONObjectUtils.getBase64URL(map, JWKParameterNames.RSA_FIRST_FACTOR_CRT_EXPONENT);
        Base64URL base64URL7 = JSONObjectUtils.getBase64URL(map, JWKParameterNames.RSA_SECOND_FACTOR_CRT_EXPONENT);
        Base64URL base64URL8 = JSONObjectUtils.getBase64URL(map, JWKParameterNames.RSA_FIRST_CRT_COEFFICIENT);
        if (!map.containsKey(JWKParameterNames.RSA_OTHER_PRIMES) || (jSONArray = JSONObjectUtils.getJSONArray(map, JWKParameterNames.RSA_OTHER_PRIMES)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(jSONArray.size());
            for (Object obj : jSONArray) {
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    try {
                        arrayList.add(new OtherPrimesInfo(JSONObjectUtils.getBase64URL(map2, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR), JSONObjectUtils.getBase64URL(map2, JWKParameterNames.RSA_SECOND_FACTOR_CRT_EXPONENT), JSONObjectUtils.getBase64URL(map2, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT)));
                    } catch (IllegalArgumentException e4) {
                        p.i(0, e4.getMessage());
                        return null;
                    }
                }
            }
        }
        try {
            return new RSAKey(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, arrayList, null, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), JWKMetadata.parseExpirationTime(map), JWKMetadata.parseNotBeforeTime(map), JWKMetadata.parseIssueTime(map), JWKMetadata.parseKeyRevocation(map), null);
        } catch (Exception e14) {
            p.i(0, e14.getMessage());
            return null;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RSAKey) || !super.equals(obj)) {
            return false;
        }
        RSAKey rSAKey = (RSAKey) obj;
        return Objects.equals(this.f54728n, rSAKey.f54728n) && Objects.equals(this.f54727e, rSAKey.f54727e) && Objects.equals(this.f54724d, rSAKey.f54724d) && Objects.equals(this.f54729p, rSAKey.f54729p) && Objects.equals(this.f54730q, rSAKey.f54730q) && Objects.equals(this.f54725dp, rSAKey.f54725dp) && Objects.equals(this.f54726dq, rSAKey.f54726dq) && Objects.equals(this.f54731qi, rSAKey.f54731qi) && Objects.equals(this.oth, rSAKey.oth) && Objects.equals(this.privateKey, rSAKey.privateKey);
    }

    public Base64URL getFirstCRTCoefficient() {
        return this.f54731qi;
    }

    public Base64URL getFirstFactorCRTExponent() {
        return this.f54725dp;
    }

    public Base64URL getFirstPrimeFactor() {
        return this.f54729p;
    }

    public Base64URL getModulus() {
        return this.f54728n;
    }

    public List<OtherPrimesInfo> getOtherPrimes() {
        return this.oth;
    }

    public Base64URL getPrivateExponent() {
        return this.f54724d;
    }

    public Base64URL getPublicExponent() {
        return this.f54727e;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(JWKParameterNames.RSA_EXPONENT, this.f54727e.toString());
        linkedHashMap.put(JWKParameterNames.KEY_TYPE, getKeyType().getValue());
        linkedHashMap.put(JWKParameterNames.RSA_MODULUS, this.f54728n.toString());
        return linkedHashMap;
    }

    public Base64URL getSecondFactorCRTExponent() {
        return this.f54726dq;
    }

    public Base64URL getSecondPrimeFactor() {
        return this.f54730q;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f54728n, this.f54727e, this.f54724d, this.f54729p, this.f54730q, this.f54725dp, this.f54726dq, this.f54731qi, this.oth, this.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return (this.f54724d == null && this.f54729p == null && this.privateKey == null) ? false : true;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public boolean matches(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (this.f54727e.decodeToBigInteger().equals(rSAPublicKey.getPublicExponent())) {
                return this.f54728n.decodeToBigInteger().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        try {
            return ByteUtils.safeBitLength(this.f54728n.decode());
        } catch (IntegerOverflowException e4) {
            e.u(e4.getMessage());
            return 0;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put(JWKParameterNames.RSA_MODULUS, this.f54728n.toString());
        jSONObject.put(JWKParameterNames.RSA_EXPONENT, this.f54727e.toString());
        Base64URL base64URL = this.f54724d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        Base64URL base64URL2 = this.f54729p;
        if (base64URL2 != null) {
            jSONObject.put("p", base64URL2.toString());
        }
        Base64URL base64URL3 = this.f54730q;
        if (base64URL3 != null) {
            jSONObject.put(JWKParameterNames.RSA_SECOND_PRIME_FACTOR, base64URL3.toString());
        }
        Base64URL base64URL4 = this.f54725dp;
        if (base64URL4 != null) {
            jSONObject.put(JWKParameterNames.RSA_FIRST_FACTOR_CRT_EXPONENT, base64URL4.toString());
        }
        Base64URL base64URL5 = this.f54726dq;
        if (base64URL5 != null) {
            jSONObject.put(JWKParameterNames.RSA_SECOND_FACTOR_CRT_EXPONENT, base64URL5.toString());
        }
        Base64URL base64URL6 = this.f54731qi;
        if (base64URL6 != null) {
            jSONObject.put(JWKParameterNames.RSA_FIRST_CRT_COEFFICIENT, base64URL6.toString());
        }
        List<OtherPrimesInfo> list = this.oth;
        if (list != null && !list.isEmpty()) {
            List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
            for (OtherPrimesInfo otherPrimesInfo : this.oth) {
                Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
                mapNewJSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, otherPrimesInfo.f54742r.toString());
                mapNewJSONObject.put("d", otherPrimesInfo.f54741d.toString());
                mapNewJSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, otherPrimesInfo.f54743t.toString());
                listNewJSONArray.add(mapNewJSONObject);
            }
            jSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES, listNewJSONArray);
        }
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public KeyPair toKeyPair() {
        return new KeyPair(toRSAPublicKey(), toPrivateKey());
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PrivateKey toPrivateKey() throws JOSEException {
        RSAPrivateKey rSAPrivateKey = toRSAPrivateKey();
        return rSAPrivateKey != null ? rSAPrivateKey : this.privateKey;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public RSAKey toPublicJWK() {
        return new RSAKey(getModulus(), getPublicExponent(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getExpirationTime(), getNotBeforeTime(), getIssueTime(), getKeyRevocation(), getKeyStore());
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PublicKey toPublicKey() {
        return toRSAPublicKey();
    }

    public RSAPrivateKey toRSAPrivateKey() throws JOSEException {
        RSAPrivateKeySpec rSAPrivateCrtKeySpec;
        RSAPrivateKeySpec rSAPrivateKeySpec;
        if (this.f54724d == null) {
            return null;
        }
        BigInteger bigIntegerDecodeToBigInteger = this.f54728n.decodeToBigInteger();
        BigInteger bigIntegerDecodeToBigInteger2 = this.f54724d.decodeToBigInteger();
        if (this.f54729p == null) {
            rSAPrivateKeySpec = new RSAPrivateKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger2);
        } else {
            BigInteger bigIntegerDecodeToBigInteger3 = this.f54727e.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger4 = this.f54729p.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger5 = this.f54730q.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger6 = this.f54725dp.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger7 = this.f54726dq.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger8 = this.f54731qi.decodeToBigInteger();
            List<OtherPrimesInfo> list = this.oth;
            if (list == null || list.isEmpty()) {
                rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger3, bigIntegerDecodeToBigInteger2, bigIntegerDecodeToBigInteger4, bigIntegerDecodeToBigInteger5, bigIntegerDecodeToBigInteger6, bigIntegerDecodeToBigInteger7, bigIntegerDecodeToBigInteger8);
            } else {
                RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr = new RSAOtherPrimeInfo[this.oth.size()];
                for (int i14 = 0; i14 < this.oth.size(); i14++) {
                    OtherPrimesInfo otherPrimesInfo = this.oth.get(i14);
                    rSAOtherPrimeInfoArr[i14] = new RSAOtherPrimeInfo(otherPrimesInfo.getPrimeFactor().decodeToBigInteger(), otherPrimesInfo.getFactorCRTExponent().decodeToBigInteger(), otherPrimesInfo.getFactorCRTCoefficient().decodeToBigInteger());
                }
                rSAPrivateCrtKeySpec = new RSAMultiPrimePrivateCrtKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger3, bigIntegerDecodeToBigInteger2, bigIntegerDecodeToBigInteger4, bigIntegerDecodeToBigInteger5, bigIntegerDecodeToBigInteger6, bigIntegerDecodeToBigInteger7, bigIntegerDecodeToBigInteger8, rSAOtherPrimeInfoArr);
            }
            rSAPrivateKeySpec = rSAPrivateCrtKeySpec;
        }
        try {
            return (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(rSAPrivateKeySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e4) {
            throw new JOSEException(e4.getMessage(), e4);
        }
    }

    public RSAPublicKey toRSAPublicKey() throws JOSEException {
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(this.f54728n.decodeToBigInteger(), this.f54727e.decodeToBigInteger()));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e4) {
            throw new JOSEException(e4.getMessage(), e4);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public RSAKey toRevokedJWK(KeyRevocation keyRevocation) {
        if (getKeyRevocation() != null) {
            h.z("Already revoked");
            return null;
        }
        Builder builder = new Builder(this);
        Objects.requireNonNull(keyRevocation);
        return builder.keyRevocation(keyRevocation).build();
    }

    @Immutable
    public static class OtherPrimesInfo implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Base64URL f54741d;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Base64URL f54742r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Base64URL f54743t;

        public OtherPrimesInfo(RSAOtherPrimeInfo rSAOtherPrimeInfo) {
            this.f54742r = Base64URL.encode(rSAOtherPrimeInfo.getPrime());
            this.f54741d = Base64URL.encode(rSAOtherPrimeInfo.getExponent());
            this.f54743t = Base64URL.encode(rSAOtherPrimeInfo.getCrtCoefficient());
        }

        public static List<OtherPrimesInfo> toList(RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr) {
            ArrayList arrayList = new ArrayList();
            if (rSAOtherPrimeInfoArr != null) {
                for (RSAOtherPrimeInfo rSAOtherPrimeInfo : rSAOtherPrimeInfoArr) {
                    arrayList.add(new OtherPrimesInfo(rSAOtherPrimeInfo));
                }
            }
            return arrayList;
        }

        public Base64URL getFactorCRTCoefficient() {
            return this.f54743t;
        }

        public Base64URL getFactorCRTExponent() {
            return this.f54741d;
        }

        public Base64URL getPrimeFactor() {
            return this.f54742r;
        }

        public OtherPrimesInfo(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
            Objects.requireNonNull(base64URL);
            this.f54742r = base64URL;
            Objects.requireNonNull(base64URL2);
            this.f54741d = base64URL2;
            Objects.requireNonNull(base64URL3);
            this.f54743t = base64URL3;
        }
    }

    public static class Builder {
        private Algorithm alg;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Base64URL f54732d;

        /* JADX INFO: renamed from: dp, reason: collision with root package name */
        private Base64URL f54733dp;

        /* JADX INFO: renamed from: dq, reason: collision with root package name */
        private Base64URL f54734dq;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Base64URL f54735e;
        private Date exp;
        private Date iat;
        private String kid;

        /* JADX INFO: renamed from: ks, reason: collision with root package name */
        private KeyStore f54736ks;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Base64URL f54737n;
        private Date nbf;
        private Set<KeyOperation> ops;
        private List<OtherPrimesInfo> oth;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Base64URL f54738p;
        private PrivateKey priv;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Base64URL f54739q;

        /* JADX INFO: renamed from: qi, reason: collision with root package name */
        private Base64URL f54740qi;
        private KeyRevocation revocation;
        private KeyUse use;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;

        public Builder(RSAKey rSAKey) {
            this.f54737n = rSAKey.f54728n;
            this.f54735e = rSAKey.f54727e;
            this.f54732d = rSAKey.f54724d;
            this.f54738p = rSAKey.f54729p;
            this.f54739q = rSAKey.f54730q;
            this.f54733dp = rSAKey.f54725dp;
            this.f54734dq = rSAKey.f54726dq;
            this.f54740qi = rSAKey.f54731qi;
            this.oth = rSAKey.oth;
            this.priv = rSAKey.privateKey;
            this.use = rSAKey.getKeyUse();
            this.ops = rSAKey.getKeyOperations();
            this.alg = rSAKey.getAlgorithm();
            this.kid = rSAKey.getKeyID();
            this.x5u = rSAKey.getX509CertURL();
            this.x5t = rSAKey.getX509CertThumbprint();
            this.x5t256 = rSAKey.getX509CertSHA256Thumbprint();
            this.x5c = rSAKey.getX509CertChain();
            this.exp = rSAKey.getExpirationTime();
            this.nbf = rSAKey.getNotBeforeTime();
            this.iat = rSAKey.getIssueTime();
            this.revocation = rSAKey.getKeyRevocation();
            this.f54736ks = rSAKey.getKeyStore();
        }

        public Builder algorithm(Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public RSAKey build() {
            try {
                return new RSAKey(this.f54737n, this.f54735e, this.f54732d, this.f54738p, this.f54739q, this.f54733dp, this.f54734dq, this.f54740qi, this.oth, this.priv, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.revocation, this.f54736ks);
            } catch (IllegalArgumentException e4) {
                a.x(e4.getMessage(), e4);
                return null;
            }
        }

        public Builder expirationTime(Date date) {
            this.exp = date;
            return this;
        }

        public Builder firstCRTCoefficient(Base64URL base64URL) {
            this.f54740qi = base64URL;
            return this;
        }

        public Builder firstFactorCRTExponent(Base64URL base64URL) {
            this.f54733dp = base64URL;
            return this;
        }

        public Builder firstPrimeFactor(Base64URL base64URL) {
            this.f54738p = base64URL;
            return this;
        }

        public Builder issueTime(Date date) {
            this.iat = date;
            return this;
        }

        public Builder keyID(String str) {
            this.kid = str;
            return this;
        }

        public Builder keyIDFromThumbprint(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(JWKParameterNames.RSA_EXPONENT, this.f54735e.toString());
            linkedHashMap.put(JWKParameterNames.KEY_TYPE, KeyType.RSA.getValue());
            linkedHashMap.put(JWKParameterNames.RSA_MODULUS, this.f54737n.toString());
            this.kid = ThumbprintUtils.compute(str, (LinkedHashMap<String, ?>) linkedHashMap).toString();
            return this;
        }

        public Builder keyOperations(Set<KeyOperation> set) {
            this.ops = set;
            return this;
        }

        public Builder keyRevocation(KeyRevocation keyRevocation) {
            this.revocation = keyRevocation;
            return this;
        }

        public Builder keyStore(KeyStore keyStore) {
            this.f54736ks = keyStore;
            return this;
        }

        public Builder keyUse(KeyUse keyUse) {
            this.use = keyUse;
            return this;
        }

        public Builder notBeforeTime(Date date) {
            this.nbf = date;
            return this;
        }

        public Builder otherPrimes(List<OtherPrimesInfo> list) {
            this.oth = list;
            return this;
        }

        public Builder privateExponent(Base64URL base64URL) {
            this.f54732d = base64URL;
            return this;
        }

        public Builder privateKey(RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey) {
            if (rSAMultiPrimePrivateCrtKey != null) {
                this.f54732d = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent());
                this.f54738p = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP());
                this.f54739q = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ());
                this.f54733dp = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP());
                this.f54734dq = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ());
                this.f54740qi = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient());
                this.oth = OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo());
                return this;
            }
            this.f54732d = null;
            this.f54738p = null;
            this.f54739q = null;
            this.f54733dp = null;
            this.f54734dq = null;
            this.f54740qi = null;
            this.oth = null;
            return this;
        }

        public Builder secondFactorCRTExponent(Base64URL base64URL) {
            this.f54734dq = base64URL;
            return this;
        }

        public Builder secondPrimeFactor(Base64URL base64URL) {
            this.f54739q = base64URL;
            return this;
        }

        public Builder x509CertChain(List<Base64> list) {
            this.x5c = list;
            return this;
        }

        public Builder x509CertSHA256Thumbprint(Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        @Deprecated
        public Builder x509CertThumbprint(Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public Builder x509CertURL(URI uri) {
            this.x5u = uri;
            return this;
        }

        public Builder keyIDFromThumbprint() {
            return keyIDFromThumbprint(MessageDigestAlgorithms.SHA_256);
        }

        public Builder privateKey(PrivateKey privateKey) {
            if (privateKey instanceof RSAPrivateKey) {
                return privateKey((RSAPrivateKey) privateKey);
            }
            if (privateKey != null && !"RSA".equalsIgnoreCase(privateKey.getAlgorithm())) {
                h.s("The private key algorithm must be RSA");
                return null;
            }
            this.priv = privateKey;
            return this;
        }

        public Builder privateKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
            if (rSAPrivateCrtKey != null) {
                this.f54732d = Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent());
                this.f54738p = Base64URL.encode(rSAPrivateCrtKey.getPrimeP());
                this.f54739q = Base64URL.encode(rSAPrivateCrtKey.getPrimeQ());
                this.f54733dp = Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP());
                this.f54734dq = Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ());
                this.f54740qi = Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient());
                return this;
            }
            this.f54732d = null;
            this.f54738p = null;
            this.f54739q = null;
            this.f54733dp = null;
            this.f54734dq = null;
            this.f54740qi = null;
            return this;
        }

        public Builder privateKey(RSAPrivateKey rSAPrivateKey) {
            if (rSAPrivateKey instanceof RSAPrivateCrtKey) {
                return privateKey((RSAPrivateCrtKey) rSAPrivateKey);
            }
            if (rSAPrivateKey instanceof RSAMultiPrimePrivateCrtKey) {
                return privateKey((RSAMultiPrimePrivateCrtKey) rSAPrivateKey);
            }
            if (rSAPrivateKey != null) {
                this.f54732d = Base64URL.encode(rSAPrivateKey.getPrivateExponent());
                return this;
            }
            this.f54732d = null;
            return this;
        }

        public Builder(RSAPublicKey rSAPublicKey) {
            this.f54737n = Base64URL.encode(rSAPublicKey.getModulus());
            this.f54735e = Base64URL.encode(rSAPublicKey.getPublicExponent());
        }

        public Builder(Base64URL base64URL, Base64URL base64URL2) {
            Objects.requireNonNull(base64URL);
            this.f54737n = base64URL;
            Objects.requireNonNull(base64URL2);
            this.f54735e = base64URL2;
        }
    }

    public static RSAKey parse(String str) {
        return parse(JSONObjectUtils.parse(str));
    }

    public static RSAKey parse(X509Certificate x509Certificate) throws JOSEException {
        if (x509Certificate.getPublicKey() instanceof RSAPublicKey) {
            try {
                return new Builder((RSAPublicKey) x509Certificate.getPublicKey()).keyUse(KeyUse.from(x509Certificate)).keyID(x509Certificate.getSerialNumber().toString(10)).x509CertChain(Collections.singletonList(Base64.encode(x509Certificate.getEncoded()))).x509CertSHA256Thumbprint(Base64URL.encode(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(x509Certificate.getEncoded()))).expirationTime(x509Certificate.getNotAfter()).notBeforeTime(x509Certificate.getNotBefore()).build();
            } catch (NoSuchAlgorithmException e4) {
                throw new JOSEException("Couldn't encode x5t parameter: " + e4.getMessage(), e4);
            } catch (CertificateEncodingException e14) {
                throw new JOSEException("Couldn't encode x5c parameter: " + e14.getMessage(), e14);
            }
        }
        p.p("The public key of the X.509 certificate is not RSA");
        return null;
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(base64URL, base64URL2, null, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyStore);
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(base64URL, base64URL2, null, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyRevocation, keyStore);
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, null, null, null, keyStore);
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, date, date2, date3, null, keyStore);
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, date, date2, date3, keyRevocation, keyStore);
        Objects.requireNonNull(base64URL3, "The private exponent must not be null");
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL8, Base64URL base64URL9, List<Base64> list2, KeyStore keyStore) {
        this(base64URL, base64URL2, null, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, list, null, keyUse, set, algorithm, str, uri, base64URL8, base64URL9, list2, null, null, null, keyStore);
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL8, Base64URL base64URL9, List<Base64> list2, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, list, keyUse, set, algorithm, str, uri, base64URL8, base64URL9, list2, date, date2, date3, null, keyStore);
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL8, Base64URL base64URL9, List<Base64> list2, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(base64URL, base64URL2, null, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, list, null, keyUse, set, algorithm, str, uri, base64URL8, base64URL9, list2, date, date2, date3, keyRevocation, keyStore);
        Objects.requireNonNull(base64URL3, "The first prime factor must not be null");
        Objects.requireNonNull(base64URL4, "The second prime factor must not be null");
        Objects.requireNonNull(base64URL5, "The first factor CRT exponent must not be null");
        Objects.requireNonNull(base64URL6, "The second factor CRT exponent must not be null");
        Objects.requireNonNull(base64URL7, "The first CRT coefficient must not be null");
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2) {
        this(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, list, null, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, null);
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2, KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, list, privateKey, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, null, null, null, keyStore);
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, list, privateKey, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, date, date2, date3, null, keyStore);
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        this(base64URL, base64URL2, null, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, null, null, null, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(rSAPublicKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, null, null, null, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(rSAPublicKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, (KeyRevocation) null, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyRevocation, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(rSAPublicKey, rSAPrivateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(rSAPublicKey, rSAPrivateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, (KeyRevocation) null, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAPrivateKey.getPrivateExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyRevocation, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateCrtKey rSAPrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(rSAPublicKey, rSAPrivateCrtKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateCrtKey rSAPrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrimeP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient()), null, null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateCrtKey rSAPrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrimeP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient()), null, null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyRevocation, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(rSAPublicKey, rSAMultiPrimePrivateCrtKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient()), OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo()), null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient()), OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo()), null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyRevocation, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(rSAPublicKey, privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public RSAKey(RSAPublicKey rSAPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(rSAPublicKey, privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, (KeyRevocation) null, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), null, null, null, null, null, null, null, privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyRevocation, keyStore);
    }
}
