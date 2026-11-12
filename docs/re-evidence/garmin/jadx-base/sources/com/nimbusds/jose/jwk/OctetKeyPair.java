package com.nimbusds.jose.jwk;

import com.google.firebase.messaging.l;
import com.mapbox.maps.p;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.shaded.gson.internal.a;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.net.URI;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
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
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public class OctetKeyPair extends JWK implements AsymmetricJWK, CurveBasedJWK {
    public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.Ed25519, Curve.Ed448, Curve.X25519, Curve.X448)));
    private static final long serialVersionUID = 1;
    private final Curve crv;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Base64URL f54716d;
    private final byte[] decodedD;
    private final byte[] decodedX;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Base64URL f54717x;

    public OctetKeyPair(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        super(KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyRevocation, keyStore);
        Objects.requireNonNull(curve, "The curve must not be null");
        if (!SUPPORTED_CURVES.contains(curve)) {
            l.j(curve, "Unknown / unsupported curve: ");
            throw null;
        }
        this.crv = curve;
        Objects.requireNonNull(base64URL, "The x parameter must not be null");
        this.f54717x = base64URL;
        this.decodedX = base64URL.decode();
        Objects.requireNonNull(base64URL2, "The d parameter must not be null");
        this.f54716d = base64URL2;
        this.decodedD = base64URL2.decode();
    }

    public static OctetKeyPair parse(Map<String, Object> map) throws ParseException {
        KeyType keyType = KeyType.OKP;
        if (!keyType.equals(JWKMetadata.parseKeyType(map))) {
            a.A(keyType.getValue(), "The key type kty must be ");
            return null;
        }
        try {
            Curve curve = Curve.parse(JSONObjectUtils.getString(map, "crv"));
            Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "x");
            Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, "d");
            try {
                return base64URL2 == null ? new OctetKeyPair(curve, base64URL, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), JWKMetadata.parseExpirationTime(map), JWKMetadata.parseNotBeforeTime(map), JWKMetadata.parseIssueTime(map), JWKMetadata.parseKeyRevocation(map), (KeyStore) null) : new OctetKeyPair(curve, base64URL, base64URL2, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), JWKMetadata.parseExpirationTime(map), JWKMetadata.parseNotBeforeTime(map), JWKMetadata.parseIssueTime(map), JWKMetadata.parseKeyRevocation(map), null);
            } catch (Exception e4) {
                p.i(0, e4.getMessage());
                return null;
            }
        } catch (IllegalArgumentException e14) {
            p.i(0, e14.getMessage());
            return null;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OctetKeyPair) || !super.equals(obj)) {
            return false;
        }
        OctetKeyPair octetKeyPair = (OctetKeyPair) obj;
        return Objects.equals(this.crv, octetKeyPair.crv) && Objects.equals(this.f54717x, octetKeyPair.f54717x) && Arrays.equals(this.decodedX, octetKeyPair.decodedX) && Objects.equals(this.f54716d, octetKeyPair.f54716d) && Arrays.equals(this.decodedD, octetKeyPair.decodedD);
    }

    @Override // com.nimbusds.jose.jwk.CurveBasedJWK
    public Curve getCurve() {
        return this.crv;
    }

    public Base64URL getD() {
        return this.f54716d;
    }

    public byte[] getDecodedD() {
        byte[] bArr = this.decodedD;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public byte[] getDecodedX() {
        return (byte[]) this.decodedX.clone();
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("crv", this.crv.toString());
        linkedHashMap.put(JWKParameterNames.KEY_TYPE, getKeyType().getValue());
        linkedHashMap.put("x", this.f54717x.toString());
        return linkedHashMap;
    }

    public Base64URL getX() {
        return this.f54717x;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Arrays.hashCode(this.decodedD) + ((Arrays.hashCode(this.decodedX) + (Objects.hash(Integer.valueOf(super.hashCode()), this.crv, this.f54717x, this.f54716d) * 31)) * 31);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return this.f54716d != null;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public boolean matches(X509Certificate x509Certificate) {
        return false;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        return ByteUtils.bitLength(this.f54717x.decode());
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.crv.toString());
        jSONObject.put("x", this.f54717x.toString());
        Base64URL base64URL = this.f54716d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public KeyPair toKeyPair() throws JOSEException {
        throw new JOSEException("Export to java.security.KeyPair not supported");
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PrivateKey toPrivateKey() throws JOSEException {
        throw new JOSEException("Export to java.security.PrivateKey not supported");
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public OctetKeyPair toPublicJWK() {
        return new OctetKeyPair(getCurve(), getX(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getExpirationTime(), getNotBeforeTime(), getIssueTime(), getKeyRevocation(), getKeyStore());
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PublicKey toPublicKey() throws JOSEException {
        throw new JOSEException("Export to java.security.PublicKey not supported");
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public OctetKeyPair toRevokedJWK(KeyRevocation keyRevocation) {
        if (getKeyRevocation() != null) {
            h.z("Already revoked");
            return null;
        }
        Builder builder = new Builder(this);
        Objects.requireNonNull(keyRevocation);
        return builder.keyRevocation(keyRevocation).build();
    }

    public static class Builder {
        private Algorithm alg;
        private final Curve crv;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Base64URL f54718d;
        private Date exp;
        private Date iat;
        private String kid;

        /* JADX INFO: renamed from: ks, reason: collision with root package name */
        private KeyStore f54719ks;
        private Date nbf;
        private Set<KeyOperation> ops;
        private KeyRevocation revocation;
        private KeyUse use;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final Base64URL f54720x;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;

        public Builder(OctetKeyPair octetKeyPair) {
            this.crv = octetKeyPair.crv;
            this.f54720x = octetKeyPair.f54717x;
            this.f54718d = octetKeyPair.f54716d;
            this.use = octetKeyPair.getKeyUse();
            this.ops = octetKeyPair.getKeyOperations();
            this.alg = octetKeyPair.getAlgorithm();
            this.kid = octetKeyPair.getKeyID();
            this.x5u = octetKeyPair.getX509CertURL();
            this.x5t = octetKeyPair.getX509CertThumbprint();
            this.x5t256 = octetKeyPair.getX509CertSHA256Thumbprint();
            this.x5c = octetKeyPair.getX509CertChain();
            this.exp = octetKeyPair.getExpirationTime();
            this.nbf = octetKeyPair.getNotBeforeTime();
            this.iat = octetKeyPair.getIssueTime();
            this.revocation = octetKeyPair.getKeyRevocation();
            this.f54719ks = octetKeyPair.getKeyStore();
        }

        public Builder algorithm(Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public OctetKeyPair build() {
            try {
                return this.f54718d == null ? new OctetKeyPair(this.crv, this.f54720x, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.revocation, this.f54719ks) : new OctetKeyPair(this.crv, this.f54720x, this.f54718d, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.revocation, this.f54719ks);
            } catch (IllegalArgumentException e4) {
                com.airbnb.lottie.animation.keyframe.a.x(e4.getMessage(), e4);
                return null;
            }
        }

        public Builder d(Base64URL base64URL) {
            this.f54718d = base64URL;
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
            linkedHashMap.put(JWKParameterNames.KEY_TYPE, KeyType.OKP.getValue());
            linkedHashMap.put("x", this.f54720x.toString());
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
            this.f54719ks = keyStore;
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

        public Builder(Curve curve, Base64URL base64URL) {
            Objects.requireNonNull(curve, "The curve must not be null");
            this.crv = curve;
            Objects.requireNonNull(base64URL, "The x coordinate must not be null");
            this.f54720x = base64URL;
        }
    }

    @Deprecated
    public OctetKeyPair(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        this(curve, base64URL, base64URL2, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, (Date) null, (Date) null, (Date) null, keyStore);
    }

    @Deprecated
    public OctetKeyPair(Curve curve, Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(curve, base64URL, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, date, date2, date3, (KeyRevocation) null, keyStore);
    }

    public OctetKeyPair(Curve curve, Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        super(KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, date, date2, date3, keyRevocation, keyStore);
        Objects.requireNonNull(curve, "The curve must not be null");
        if (SUPPORTED_CURVES.contains(curve)) {
            this.crv = curve;
            Objects.requireNonNull(base64URL, "The x parameter must not be null");
            this.f54717x = base64URL;
            this.decodedX = base64URL.decode();
            this.f54716d = null;
            this.decodedD = null;
            return;
        }
        l.j(curve, "Unknown / unsupported curve: ");
        throw null;
    }

    @Deprecated
    public OctetKeyPair(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(curve, base64URL, base64URL2, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, null, keyStore);
    }

    @Deprecated
    public OctetKeyPair(Curve curve, Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        this(curve, base64URL, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, null, null, null, keyStore);
    }

    public static OctetKeyPair parse(String str) {
        return parse(JSONObjectUtils.parse(str));
    }
}
