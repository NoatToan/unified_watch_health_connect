package com.nimbusds.jose.jwk;

import com.mapbox.maps.p;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.shaded.gson.internal.a;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.net.URI;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class OctetSequenceKey extends JWK implements SecretJWK {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Base64URL f54721k;

    public OctetSequenceKey(Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, Date date, Date date2, Date date3, KeyRevocation keyRevocation, KeyStore keyStore) {
        super(KeyType.OCT, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, date, date2, date3, keyRevocation, keyStore);
        Objects.requireNonNull(base64URL, "The key value must not be null");
        this.f54721k = base64URL;
    }

    public static OctetSequenceKey load(KeyStore keyStore, String str, char[] cArr) {
        try {
            Key key = keyStore.getKey(str, cArr);
            if (key instanceof SecretKey) {
                return new Builder((SecretKey) key).keyID(str).keyStore(keyStore).build();
            }
            return null;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e4) {
            throw new JOSEException("Couldn't retrieve secret key (bad pin?): " + e4.getMessage(), e4);
        }
    }

    public static OctetSequenceKey parse(Map<String, Object> map) throws ParseException {
        KeyType keyType = KeyType.OCT;
        if (!keyType.equals(JWKMetadata.parseKeyType(map))) {
            a.A(keyType.getValue(), "The key type kty must be ");
            return null;
        }
        try {
            return new OctetSequenceKey(JSONObjectUtils.getBase64URL(map, JWKParameterNames.OCT_KEY_VALUE), JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), JWKMetadata.parseExpirationTime(map), JWKMetadata.parseNotBeforeTime(map), JWKMetadata.parseIssueTime(map), JWKMetadata.parseKeyRevocation(map), null);
        } catch (Exception e4) {
            p.i(0, e4.getMessage());
            return null;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OctetSequenceKey) && super.equals(obj)) {
            return Objects.equals(this.f54721k, ((OctetSequenceKey) obj).f54721k);
        }
        return false;
    }

    public Base64URL getKeyValue() {
        return this.f54721k;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(JWKParameterNames.OCT_KEY_VALUE, this.f54721k.toString());
        linkedHashMap.put(JWKParameterNames.KEY_TYPE, getKeyType().toString());
        return linkedHashMap;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f54721k);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        try {
            return ByteUtils.safeBitLength(this.f54721k.decode());
        } catch (IntegerOverflowException e4) {
            e.u(e4.getMessage());
            return 0;
        }
    }

    public byte[] toByteArray() {
        return getKeyValue().decode();
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put(JWKParameterNames.OCT_KEY_VALUE, this.f54721k.toString());
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public OctetSequenceKey toRevokedJWK(KeyRevocation keyRevocation) {
        if (getKeyRevocation() != null) {
            h.z("Already revoked");
            return null;
        }
        Builder builder = new Builder(this);
        Objects.requireNonNull(keyRevocation);
        return builder.keyRevocation(keyRevocation).build();
    }

    public SecretKey toSecretKey(String str) {
        return new SecretKeySpec(toByteArray(), str);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public OctetSequenceKey toPublicJWK() {
        return null;
    }

    @Override // com.nimbusds.jose.jwk.SecretJWK
    public SecretKey toSecretKey() {
        return toSecretKey("NONE");
    }

    public static class Builder {
        private Algorithm alg;
        private Date exp;
        private Date iat;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Base64URL f54722k;
        private String kid;

        /* JADX INFO: renamed from: ks, reason: collision with root package name */
        private KeyStore f54723ks;
        private Date nbf;
        private Set<KeyOperation> ops;
        private KeyRevocation revocation;
        private KeyUse use;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;

        public Builder(OctetSequenceKey octetSequenceKey) {
            this.f54722k = octetSequenceKey.f54721k;
            this.use = octetSequenceKey.getKeyUse();
            this.ops = octetSequenceKey.getKeyOperations();
            this.alg = octetSequenceKey.getAlgorithm();
            this.kid = octetSequenceKey.getKeyID();
            this.x5u = octetSequenceKey.getX509CertURL();
            this.x5t = octetSequenceKey.getX509CertThumbprint();
            this.x5t256 = octetSequenceKey.getX509CertSHA256Thumbprint();
            this.x5c = octetSequenceKey.getX509CertChain();
            this.exp = octetSequenceKey.getExpirationTime();
            this.nbf = octetSequenceKey.getNotBeforeTime();
            this.iat = octetSequenceKey.getIssueTime();
            this.revocation = octetSequenceKey.getKeyRevocation();
            this.f54723ks = octetSequenceKey.getKeyStore();
        }

        public Builder algorithm(Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public OctetSequenceKey build() {
            try {
                return new OctetSequenceKey(this.f54722k, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.revocation, this.f54723ks);
            } catch (IllegalArgumentException e4) {
                com.airbnb.lottie.animation.keyframe.a.x(e4.getMessage(), e4);
                return null;
            }
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
            linkedHashMap.put(JWKParameterNames.OCT_KEY_VALUE, this.f54722k.toString());
            linkedHashMap.put(JWKParameterNames.KEY_TYPE, KeyType.OCT.getValue());
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
            this.f54723ks = keyStore;
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

        public Builder(byte[] bArr) {
            this(Base64URL.encode(bArr));
            if (bArr.length != 0) {
                return;
            }
            h.s("The key must have a positive length");
            throw null;
        }

        public Builder(SecretKey secretKey) {
            this(secretKey.getEncoded());
        }

        public Builder(Base64URL base64URL) {
            Objects.requireNonNull(base64URL);
            this.f54722k = base64URL;
        }
    }

    @Deprecated
    public OctetSequenceKey(Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, Date date, Date date2, Date date3, KeyStore keyStore) {
        this(base64URL, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, date, date2, date3, null, keyStore);
    }

    @Deprecated
    public OctetSequenceKey(Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        this(base64URL, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, null, null, null, keyStore);
    }

    public static OctetSequenceKey parse(String str) {
        return parse(JSONObjectUtils.parse(str));
    }
}
