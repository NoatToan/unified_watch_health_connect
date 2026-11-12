package com.nimbusds.jose.jwk;

import com.airbnb.lottie.animation.keyframe.a;
import com.google.firebase.messaging.l;
import com.mapbox.maps.p;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.crypto.utils.ECChecks;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.BigIntegerUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.math.BigInteger;
import java.net.URI;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.lang3.e;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class ECKey extends JWK implements AsymmetricJWK, CurveBasedJWK {
    public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.P_256, Curve.SECP256K1, Curve.P_384, Curve.P_521)));
    private static final long serialVersionUID = 1;
    private final Curve crv;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Base64URL f54709d;
    private final PrivateKey privateKey;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Base64URL f54710x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Base64URL f54711y;

    public ECKey(Curve curve, ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyRevocation, keyStore);
    }

    public static Base64URL encodeCoordinate(int i14, BigInteger bigInteger) {
        byte[] bytesUnsigned = BigIntegerUtils.toBytesUnsigned(bigInteger);
        int i15 = (i14 + 7) / 8;
        if (bytesUnsigned.length >= i15) {
            return Base64URL.encode(bytesUnsigned);
        }
        byte[] bArr = new byte[i15];
        System.arraycopy(bytesUnsigned, 0, bArr, i15 - bytesUnsigned.length, bytesUnsigned.length);
        return Base64URL.encode(bArr);
    }

    private void ensureMatches(List<X509Certificate> list) {
        if (list == null || matches(list.get(0))) {
            return;
        }
        h.s("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
    }

    private static void ensurePublicCoordinatesOnCurve(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
        if (!SUPPORTED_CURVES.contains(curve)) {
            l.j(curve, "Unknown / unsupported curve: ");
        } else {
            if (ECChecks.isPointOnCurve(base64URL.decodeToBigInteger(), base64URL2.decodeToBigInteger(), curve.toECParameterSpec())) {
                return;
            }
            e.l("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the ", curve, " curve");
        }
    }

    public static ECKey load(KeyStore keyStore, String str, char[] cArr) throws JOSEException, KeyStoreException {
        Certificate certificate = keyStore.getCertificate(str);
        if (!(certificate instanceof X509Certificate)) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!(x509Certificate.getPublicKey() instanceof ECPublicKey)) {
            p.p("Couldn't load EC JWK: The key algorithm is not EC");
            return null;
        }
        ECKey eCKeyBuild = new Builder(parse(x509Certificate)).keyID(str).keyStore(keyStore).build();
        try {
            Key key = keyStore.getKey(str, cArr);
            if (key instanceof ECPrivateKey) {
                return new Builder(eCKeyBuild).privateKey((ECPrivateKey) key).build();
            }
            return ((key instanceof PrivateKey) && "EC".equalsIgnoreCase(key.getAlgorithm())) ? new Builder(eCKeyBuild).privateKey((PrivateKey) key).build() : eCKeyBuild;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e4) {
            throw new JOSEException("Couldn't retrieve private EC key (bad pin?): " + e4.getMessage(), e4);
        }
    }

    public static ECKey parse(X509Certificate x509Certificate) throws JOSEException {
        if (!(x509Certificate.getPublicKey() instanceof ECPublicKey)) {
            p.p("The public key of the X.509 certificate is not EC");
            return null;
        }
        ECPublicKey eCPublicKey = (ECPublicKey) x509Certificate.getPublicKey();
        try {
            String string = new JcaX509CertificateHolder(x509Certificate).getSubjectPublicKeyInfo().getAlgorithm().getParameters().toString();
            Curve curveForOID = Curve.forOID(string);
            if (curveForOID != null) {
                return new Builder(curveForOID, eCPublicKey).keyUse(KeyUse.from(x509Certificate)).keyID(x509Certificate.getSerialNumber().toString(10)).x509CertChain(Collections.singletonList(Base64.encode(x509Certificate.getEncoded()))).x509CertSHA256Thumbprint(Base64URL.encode(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(x509Certificate.getEncoded()))).expirationTime(x509Certificate.getNotAfter()).notBeforeTime(x509Certificate.getNotBefore()).build();
            }
            throw new JOSEException("Couldn't determine EC JWK curve for OID " + string);
        } catch (NoSuchAlgorithmException e4) {
            throw new JOSEException("Couldn't encode x5t parameter: " + e4.getMessage(), e4);
        } catch (CertificateEncodingException e14) {
            throw new JOSEException("Couldn't encode x5c parameter: " + e14.getMessage(), e14);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECKey) || !super.equals(obj)) {
            return false;
        }
        ECKey eCKey = (ECKey) obj;
        return Objects.equals(this.crv, eCKey.crv) && Objects.equals(this.f54710x, eCKey.f54710x) && Objects.equals(this.f54711y, eCKey.f54711y) && Objects.equals(this.f54709d, eCKey.f54709d) && Objects.equals(this.privateKey, eCKey.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.CurveBasedJWK
    public Curve getCurve() {
        return this.crv;
    }

    public Base64URL getD() {
        return this.f54709d;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("crv", this.crv.toString());
        linkedHashMap.put(JWKParameterNames.KEY_TYPE, getKeyType().getValue());
        linkedHashMap.put("x", this.f54710x.toString());
        linkedHashMap.put(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, this.f54711y.toString());
        return linkedHashMap;
    }

    public Base64URL getX() {
        return this.f54710x;
    }

    public Base64URL getY() {
        return this.f54711y;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.crv, this.f54710x, this.f54711y, this.f54709d, this.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return (this.f54709d == null && this.privateKey == null) ? false : true;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public boolean matches(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (getX().decodeToBigInteger().equals(eCPublicKey.getW().getAffineX())) {
                return getY().decodeToBigInteger().equals(eCPublicKey.getW().getAffineY());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        if (eCParameterSpec != null) {
            return eCParameterSpec.getCurve().getField().getFieldSize();
        }
        throw new UnsupportedOperationException("Couldn't determine field size for curve " + this.crv.getName());
    }

    public ECPrivateKey toECPrivateKey(Provider provider) throws JOSEException {
        if (this.f54709d == null) {
            return null;
        }
        ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        if (eCParameterSpec == null) {
            throw new JOSEException("Couldn't get EC parameter spec for curve " + this.crv);
        }
        try {
            return (ECPrivateKey) (provider == null ? KeyFactory.getInstance("EC") : KeyFactory.getInstance("EC", provider)).generatePrivate(new ECPrivateKeySpec(this.f54709d.decodeToBigInteger(), eCParameterSpec));
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            throw new JOSEException(e.getMessage(), e);
        } catch (InvalidKeySpecException e14) {
            e = e14;
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public ECPublicKey toECPublicKey(Provider provider) throws JOSEException {
        ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        if (eCParameterSpec == null) {
            throw new JOSEException("Couldn't get EC parameter spec for curve " + this.crv);
        }
        try {
            return (ECPublicKey) (provider == null ? KeyFactory.getInstance("EC") : KeyFactory.getInstance("EC", provider)).generatePublic(new ECPublicKeySpec(new ECPoint(this.f54710x.decodeToBigInteger(), this.f54711y.decodeToBigInteger()), eCParameterSpec));
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            throw new JOSEException(e.getMessage(), e);
        } catch (InvalidKeySpecException e14) {
            e = e14;
            throw new JOSEException(e.getMessage(), e);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.crv.toString());
        jSONObject.put("x", this.f54710x.toString());
        jSONObject.put(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, this.f54711y.toString());
        Base64URL base64URL = this.f54709d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        return jSONObject;
    }

    public KeyPair toKeyPair(Provider provider) {
        return this.privateKey != null ? new KeyPair(toECPublicKey(provider), this.privateKey) : new KeyPair(toECPublicKey(provider), toECPrivateKey(provider));
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PrivateKey toPrivateKey() {
        ECPrivateKey eCPrivateKey = toECPrivateKey();
        return eCPrivateKey != null ? eCPrivateKey : this.privateKey;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public ECKey toPublicJWK() {
        return new ECKey(getCurve(), getX(), getY(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getExpirationTime(), getNotBeforeTime(), getIssueTime(), getKeyRevocation(), getKeyStore());
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PublicKey toPublicKey() {
        return toECPublicKey();
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public ECKey toRevokedJWK(KeyRevocation keyRevocation) {
        if (getKeyRevocation() != null) {
            h.z("Already revoked");
            return null;
        }
        Builder builder = new Builder(this);
        Objects.requireNonNull(keyRevocation);
        return builder.keyRevocation(keyRevocation).build();
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public KeyPair toKeyPair() {
        return toKeyPair(null);
    }

    public static class Builder {
        private Algorithm alg;
        private final Curve crv;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Base64URL f54712d;
        private Date exp;
        private Date iat;
        private String kid;

        /* JADX INFO: renamed from: ks, reason: collision with root package name */
        private KeyStore f54713ks;
        private Date nbf;
        private Set<KeyOperation> ops;
        private PrivateKey priv;
        private KeyRevocation revocation;
        private KeyUse use;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final Base64URL f54714x;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final Base64URL f54715y;

        public Builder(ECKey eCKey) {
            this.crv = eCKey.crv;
            this.f54714x = eCKey.f54710x;
            this.f54715y = eCKey.f54711y;
            this.f54712d = eCKey.f54709d;
            this.priv = eCKey.privateKey;
            this.use = eCKey.getKeyUse();
            this.ops = eCKey.getKeyOperations();
            this.alg = eCKey.getAlgorithm();
            this.kid = eCKey.getKeyID();
            this.x5u = eCKey.getX509CertURL();
            this.x5t = eCKey.getX509CertThumbprint();
            this.x5t256 = eCKey.getX509CertSHA256Thumbprint();
            this.x5c = eCKey.getX509CertChain();
            this.exp = eCKey.getExpirationTime();
            this.nbf = eCKey.getNotBeforeTime();
            this.iat = eCKey.getIssueTime();
            this.revocation = eCKey.getKeyRevocation();
            this.f54713ks = eCKey.getKeyStore();
        }

        public Builder algorithm(Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public ECKey build() {
            try {
                if (this.f54712d == null && this.priv == null) {
                    return new ECKey(this.crv, this.f54714x, this.f54715y, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.revocation, this.f54713ks);
                }
                return this.priv != null ? new ECKey(this.crv, this.f54714x, this.f54715y, this.priv, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.revocation, this.f54713ks) : new ECKey(this.crv, this.f54714x, this.f54715y, this.f54712d, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.revocation, this.f54713ks);
            } catch (IllegalArgumentException e4) {
                a.x(e4.getMessage(), e4);
                return null;
            }
        }

        public Builder d(Base64URL base64URL) {
            this.f54712d = base64URL;
            return this;
        }

        public Builder expirationTime(Date date) {
            this.exp = date;
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
            linkedHashMap.put("crv", this.crv.toString());
            linkedHashMap.put(JWKParameterNames.KEY_TYPE, KeyType.EC.getValue());
            linkedHashMap.put("x", this.f54714x.toString());
            linkedHashMap.put(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, this.f54715y.toString());
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
            this.f54713ks = keyStore;
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

        public Builder privateKey(PrivateKey privateKey) {
            if (privateKey instanceof ECPrivateKey) {
                return privateKey((ECPrivateKey) privateKey);
            }
            if (privateKey == null || "EC".equalsIgnoreCase(privateKey.getAlgorithm())) {
                this.priv = privateKey;
                return this;
            }
            h.s("The private key algorithm must be EC");
            return null;
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

        public Builder privateKey(ECPrivateKey eCPrivateKey) {
            if (eCPrivateKey != null) {
                this.f54712d = ECKey.encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS());
                return this;
            }
            this.f54712d = null;
            return this;
        }

        public Builder keyIDFromThumbprint() {
            return keyIDFromThumbprint(MessageDigestAlgorithms.SHA_256);
        }

        public Builder(Curve curve, ECPublicKey eCPublicKey) {
            this(curve, ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }

        public Builder(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
            Objects.requireNonNull(curve, "The curve must not be null");
            this.crv = curve;
            Objects.requireNonNull(base64URL, "The x coordinate must not be null");
            this.f54714x = base64URL;
            Objects.requireNonNull(base64URL2, "The y coordinate must not be null");
            this.f54715y = base64URL2;
        }
    }

    public ECPrivateKey toECPrivateKey() {
        return toECPrivateKey(null);
    }

    public ECPublicKey toECPublicKey() {
        return toECPublicKey(null);
    }

    @Deprecated
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        this(curve, base64URL, base64URL2, base64URL3, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        this(curve, base64URL, base64URL2, privateKey, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public ECKey(Curve curve, ECPublicKey eCPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public ECKey(Curve curve, ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public ECKey(Curve curve, ECPublicKey eCPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(curve, base64URL, base64URL2, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, (KeyRevocation) null, keyStore);
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyRevocation, keyStore);
        Objects.requireNonNull(curve, "The curve must not be null");
        this.crv = curve;
        Objects.requireNonNull(base64URL, "The x coordinate must not be null");
        this.f54710x = base64URL;
        Objects.requireNonNull(base64URL2, "The y coordinate must not be null");
        this.f54711y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        this.f54709d = null;
        this.privateKey = null;
    }

    @Deprecated
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(curve, base64URL, base64URL2, base64URL3, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, date, date2, date3, (KeyRevocation) null, keyStore);
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, date, date2, date3, keyRevocation, keyStore);
        Objects.requireNonNull(curve, "The curve must not be null");
        this.crv = curve;
        Objects.requireNonNull(base64URL, "The x coordinate must not be null");
        this.f54710x = base64URL;
        Objects.requireNonNull(base64URL2, "The y coordinate must not be null");
        this.f54711y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        Objects.requireNonNull(base64URL3, "The d coordinate must not be null");
        this.f54709d = base64URL3;
        this.privateKey = null;
    }

    @Deprecated
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(curve, base64URL, base64URL2, privateKey, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, (KeyRevocation) null, keyStore);
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyRevocation, keyStore);
        Objects.requireNonNull(curve, "The curve must not be null");
        this.crv = curve;
        Objects.requireNonNull(base64URL, "The x coordinate must not be null");
        this.f54710x = base64URL;
        Objects.requireNonNull(base64URL2, "The y coordinate must not be null");
        this.f54711y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        this.f54709d = null;
        this.privateKey = privateKey;
    }

    @Deprecated
    public ECKey(Curve curve, ECPublicKey eCPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(curve, eCPublicKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, (KeyRevocation) null, keyStore);
    }

    public ECKey(Curve curve, ECPublicKey eCPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyRevocation, keyStore);
    }

    @Deprecated
    public ECKey(Curve curve, ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(curve, eCPublicKey, eCPrivateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, (KeyRevocation) null, keyStore);
    }

    @Deprecated
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        this(curve, base64URL, base64URL2, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public ECKey(Curve curve, ECPublicKey eCPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyStore);
    }

    public ECKey(Curve curve, ECPublicKey eCPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, date, date2, date3, keyRevocation, keyStore);
    }

    public static ECKey parse(Map<String, Object> map) throws ParseException {
        if (KeyType.EC.equals(JWKMetadata.parseKeyType(map))) {
            try {
                Curve curve = Curve.parse(JSONObjectUtils.getString(map, "crv"));
                Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "x");
                Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE);
                Base64URL base64URL3 = JSONObjectUtils.getBase64URL(map, "d");
                try {
                    if (base64URL3 == null) {
                        return new ECKey(curve, base64URL, base64URL2, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), JWKMetadata.parseExpirationTime(map), JWKMetadata.parseNotBeforeTime(map), JWKMetadata.parseIssueTime(map), JWKMetadata.parseKeyRevocation(map), (KeyStore) null);
                    }
                    return new ECKey(curve, base64URL, base64URL2, base64URL3, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), JWKMetadata.parseExpirationTime(map), JWKMetadata.parseNotBeforeTime(map), JWKMetadata.parseIssueTime(map), JWKMetadata.parseKeyRevocation(map), (KeyStore) null);
                } catch (Exception e4) {
                    p.i(0, e4.getMessage());
                    return null;
                }
            } catch (IllegalArgumentException e14) {
                p.i(0, e14.getMessage());
                return null;
            }
        }
        p.i(0, "The key type \"kty\" must be EC");
        return null;
    }

    public static ECKey parse(String str) {
        return parse(JSONObjectUtils.parse(str));
    }
}
