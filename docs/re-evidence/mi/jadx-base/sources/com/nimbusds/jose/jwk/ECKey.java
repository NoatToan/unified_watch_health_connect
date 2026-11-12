package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.jqd;
import defpackage.npd;
import defpackage.wi2;
import defpackage.x77;
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
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.jcip.annotations.Immutable;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class ECKey extends JWK {
    public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.P_256, Curve.SECP256K1, Curve.P_384, Curve.P_521)));
    private static final long serialVersionUID = 1;
    private final Curve crv;
    private final Base64URL d;
    private final PrivateKey privateKey;
    private final Base64URL x;
    private final Base64URL y;

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        this.crv = curve;
        if (base64URL == null) {
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.x = base64URL;
        if (base64URL2 == null) {
            throw new IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        this.d = null;
        this.privateKey = null;
    }

    public static Base64URL encodeCoordinate(int i, BigInteger bigInteger) {
        byte[] bArrA = wi2.a(bigInteger);
        int i2 = (i + 7) / 8;
        if (bArrA.length >= i2) {
            return Base64URL.encode(bArrA);
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(bArrA, 0, bArr, i2 - bArrA.length, bArrA.length);
        return Base64URL.encode(bArr);
    }

    private void ensureMatches(List<X509Certificate> list) {
        if (list != null && !matches(list.get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    private static void ensurePublicCoordinatesOnCurve(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
        if (x77.a(base64URL.decodeToBigInteger(), base64URL2.decodeToBigInteger(), curve.toECParameterSpec())) {
            return;
        }
        throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + curve + " curve");
    }

    public static ECKey load(KeyStore keyStore, String str, char[] cArr) throws JOSEException, KeyStoreException {
        Certificate certificate = keyStore.getCertificate(str);
        if (!(certificate instanceof X509Certificate)) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!(x509Certificate.getPublicKey() instanceof ECPublicKey)) {
            throw new JOSEException("Couldn't load EC JWK: The key algorithm is not EC");
        }
        ECKey eCKeyA = new a(parse(x509Certificate)).b(str).c(keyStore).a();
        try {
            Key key = keyStore.getKey(str, cArr);
            if (key instanceof ECPrivateKey) {
                return new a(eCKeyA).f((ECPrivateKey) key).a();
            }
            return ((key instanceof PrivateKey) && "EC".equalsIgnoreCase(key.getAlgorithm())) ? new a(eCKeyA).e((PrivateKey) key).a() : eCKeyA;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e) {
            throw new JOSEException("Couldn't retrieve private EC key (bad pin?): " + e.getMessage(), e);
        }
    }

    public static ECKey parse(String str) throws ParseException {
        return parse(npd.m(str));
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
        return Objects.equals(this.crv, eCKey.crv) && Objects.equals(this.x, eCKey.x) && Objects.equals(this.y, eCKey.y) && Objects.equals(this.d, eCKey.d) && Objects.equals(this.privateKey, eCKey.privateKey);
    }

    public Curve getCurve() {
        return this.crv;
    }

    public Base64URL getD() {
        return this.d;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("crv", this.crv.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put("x", this.x.toString());
        linkedHashMap.put("y", this.y.toString());
        return linkedHashMap;
    }

    public Base64URL getX() {
        return this.x;
    }

    public Base64URL getY() {
        return this.y;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.crv, this.x, this.y, this.d, this.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return (this.d == null && this.privateKey == null) ? false : true;
    }

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

    public ECPrivateKey toECPrivateKey() throws JOSEException {
        return toECPrivateKey(null);
    }

    public ECPublicKey toECPublicKey() throws JOSEException {
        return toECPublicKey(null);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.crv.toString());
        jSONObject.put("x", this.x.toString());
        jSONObject.put("y", this.y.toString());
        Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put(PluginDeviceInfo.FICONOFF, base64URL.toString());
        }
        return jSONObject;
    }

    public KeyPair toKeyPair() throws JOSEException {
        return toKeyPair(null);
    }

    public PrivateKey toPrivateKey() throws JOSEException {
        ECPrivateKey eCPrivateKey = toECPrivateKey();
        return eCPrivateKey != null ? eCPrivateKey : this.privateKey;
    }

    public PublicKey toPublicKey() throws JOSEException {
        return toECPublicKey();
    }

    public static ECKey parse(Map<String, Object> map) throws ParseException {
        if (!KeyType.EC.equals(jqd.d(map))) {
            throw new ParseException("The key type \"kty\" must be EC", 0);
        }
        try {
            Curve curve = Curve.parse(npd.h(map, "crv"));
            Base64URL base64URLA = npd.a(map, "x");
            Base64URL base64URLA2 = npd.a(map, "y");
            Base64URL base64URLA3 = npd.a(map, PluginDeviceInfo.FICONOFF);
            try {
                return base64URLA3 == null ? new ECKey(curve, base64URLA, base64URLA2, jqd.e(map), jqd.c(map), jqd.a(map), jqd.b(map), jqd.i(map), jqd.h(map), jqd.g(map), jqd.f(map), (KeyStore) null) : new ECKey(curve, base64URLA, base64URLA2, base64URLA3, jqd.e(map), jqd.c(map), jqd.a(map), jqd.b(map), jqd.i(map), jqd.h(map), jqd.g(map), jqd.f(map), (KeyStore) null);
            } catch (IllegalArgumentException e) {
                throw new ParseException(e.getMessage(), 0);
            }
        } catch (IllegalArgumentException e2) {
            throw new ParseException(e2.getMessage(), 0);
        }
    }

    public ECPrivateKey toECPrivateKey(Provider provider) throws JOSEException {
        if (this.d == null) {
            return null;
        }
        ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        if (eCParameterSpec == null) {
            throw new JOSEException("Couldn't get EC parameter spec for curve " + this.crv);
        }
        try {
            return (ECPrivateKey) (provider == null ? KeyFactory.getInstance("EC") : KeyFactory.getInstance("EC", provider)).generatePrivate(new ECPrivateKeySpec(this.d.decodeToBigInteger(), eCParameterSpec));
        } catch (NoSuchAlgorithmException e) {
            e = e;
            throw new JOSEException(e.getMessage(), e);
        } catch (InvalidKeySpecException e2) {
            e = e2;
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public ECPublicKey toECPublicKey(Provider provider) throws JOSEException {
        ECParameterSpec eCParameterSpec = this.crv.toECParameterSpec();
        if (eCParameterSpec == null) {
            throw new JOSEException("Couldn't get EC parameter spec for curve " + this.crv);
        }
        try {
            return (ECPublicKey) (provider == null ? KeyFactory.getInstance("EC") : KeyFactory.getInstance("EC", provider)).generatePublic(new ECPublicKeySpec(new ECPoint(this.x.decodeToBigInteger(), this.y.decodeToBigInteger()), eCParameterSpec));
        } catch (NoSuchAlgorithmException e) {
            e = e;
            throw new JOSEException(e.getMessage(), e);
        } catch (InvalidKeySpecException e2) {
            e = e2;
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public KeyPair toKeyPair(Provider provider) throws JOSEException {
        return this.privateKey != null ? new KeyPair(toECPublicKey(provider), this.privateKey) : new KeyPair(toECPublicKey(provider), toECPrivateKey(provider));
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public ECKey toPublicJWK() {
        return new ECKey(getCurve(), getX(), getY(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getKeyStore());
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Curve f10419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Base64URL f10420b;
        public final Base64URL c;
        public Base64URL d;
        public PrivateKey e;
        public KeyUse f;
        public Set<KeyOperation> g;
        public Algorithm h;
        public String i;
        public URI j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public Base64URL f10421k;
        public Base64URL l;
        public List<Base64> m;
        public KeyStore n;

        public a(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
            if (curve == null) {
                throw new IllegalArgumentException("The curve must not be null");
            }
            this.f10419a = curve;
            if (base64URL == null) {
                throw new IllegalArgumentException("The 'x' coordinate must not be null");
            }
            this.f10420b = base64URL;
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            this.c = base64URL2;
        }

        public ECKey a() {
            try {
                if (this.d == null && this.e == null) {
                    return new ECKey(this.f10419a, this.f10420b, this.c, this.f, this.g, this.h, this.i, this.j, this.f10421k, this.l, this.m, this.n);
                }
                return this.e != null ? new ECKey(this.f10419a, this.f10420b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.f10421k, this.l, this.m, this.n) : new ECKey(this.f10419a, this.f10420b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.f10421k, this.l, this.m, this.n);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }

        public a b(String str) {
            this.i = str;
            return this;
        }

        public a c(KeyStore keyStore) {
            this.n = keyStore;
            return this;
        }

        public a d(KeyUse keyUse) {
            this.f = keyUse;
            return this;
        }

        public a e(PrivateKey privateKey) {
            if (privateKey instanceof ECPrivateKey) {
                return f((ECPrivateKey) privateKey);
            }
            if (!"EC".equalsIgnoreCase(privateKey.getAlgorithm())) {
                throw new IllegalArgumentException("The private key algorithm must be EC");
            }
            this.e = privateKey;
            return this;
        }

        public a f(ECPrivateKey eCPrivateKey) {
            if (eCPrivateKey != null) {
                this.d = ECKey.encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS());
            }
            return this;
        }

        public a g(List<Base64> list) {
            this.m = list;
            return this;
        }

        public a h(Base64URL base64URL) {
            this.l = base64URL;
            return this;
        }

        public a(Curve curve, ECPublicKey eCPublicKey) {
            this(curve, ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), ECKey.encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }

        public a(ECKey eCKey) {
            this.f10419a = eCKey.crv;
            this.f10420b = eCKey.x;
            this.c = eCKey.y;
            this.d = eCKey.d;
            this.e = eCKey.privateKey;
            this.f = eCKey.getKeyUse();
            this.g = eCKey.getKeyOperations();
            this.h = eCKey.getAlgorithm();
            this.i = eCKey.getKeyID();
            this.j = eCKey.getX509CertURL();
            this.f10421k = eCKey.getX509CertThumbprint();
            this.l = eCKey.getX509CertSHA256Thumbprint();
            this.m = eCKey.getX509CertChain();
            this.n = eCKey.getKeyStore();
        }
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, keyStore);
        if (curve != null) {
            this.crv = curve;
            if (base64URL != null) {
                this.x = base64URL;
                if (base64URL2 != null) {
                    this.y = base64URL2;
                    ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
                    ensureMatches(getParsedX509CertChain());
                    if (base64URL3 != null) {
                        this.d = base64URL3;
                        this.privateKey = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
        if (curve != null) {
            this.crv = curve;
            if (base64URL != null) {
                this.x = base64URL;
                if (base64URL2 != null) {
                    this.y = base64URL2;
                    ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
                    ensureMatches(getParsedX509CertChain());
                    this.d = null;
                    this.privateKey = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static ECKey parse(X509Certificate x509Certificate) throws JOSEException {
        if (x509Certificate.getPublicKey() instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) x509Certificate.getPublicKey();
            try {
                String string = new JcaX509CertificateHolder(x509Certificate).getSubjectPublicKeyInfo().g().i().toString();
                Curve curveForOID = Curve.forOID(string);
                if (curveForOID != null) {
                    return new a(curveForOID, eCPublicKey).d(KeyUse.from(x509Certificate)).b(x509Certificate.getSerialNumber().toString(10)).g(Collections.singletonList(Base64.encode(x509Certificate.getEncoded()))).h(Base64URL.encode(MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM).digest(x509Certificate.getEncoded()))).a();
                }
                throw new JOSEException("Couldn't determine EC JWK curve for OID " + string);
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException("Couldn't encode x5t parameter: " + e.getMessage(), e);
            } catch (CertificateEncodingException e2) {
                throw new JOSEException("Couldn't encode x5c parameter: " + e2.getMessage(), e2);
            }
        }
        throw new JOSEException("The public key of the X.509 certificate is not EC");
    }

    public ECKey(Curve curve, ECPublicKey eCPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public ECKey(Curve curve, ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), encodeCoordinate(eCPrivateKey.getParams().getCurve().getField().getFieldSize(), eCPrivateKey.getS()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public ECKey(Curve curve, ECPublicKey eCPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(curve, encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), encodeCoordinate(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()), privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }
}
