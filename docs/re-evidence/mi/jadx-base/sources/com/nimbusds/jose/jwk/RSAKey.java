package com.nimbusds.jose.jwk;

import com.miuipub.internal.hybrid.SignUtils;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.jqd;
import defpackage.kpd;
import defpackage.npd;
import defpackage.y73;
import java.io.Serializable;
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
import java.security.spec.KeySpec;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
import java.security.spec.RSAOtherPrimeInfo;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class RSAKey extends JWK {
    private static final long serialVersionUID = 1;
    private final Base64URL d;
    private final Base64URL dp;
    private final Base64URL dq;
    private final Base64URL e;
    private final Base64URL n;
    private final List<OtherPrimesInfo> oth;
    private final Base64URL p;
    private final PrivateKey privateKey;
    private final Base64URL q;
    private final Base64URL qi;

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        this(base64URL, base64URL2, null, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
    }

    public static RSAKey load(KeyStore keyStore, String str, char[] cArr) throws JOSEException, KeyStoreException {
        Certificate certificate = keyStore.getCertificate(str);
        if (!(certificate instanceof X509Certificate)) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!(x509Certificate.getPublicKey() instanceof RSAPublicKey)) {
            throw new JOSEException("Couldn't load RSA JWK: The key algorithm is not RSA");
        }
        RSAKey rSAKeyA = new a(parse(x509Certificate)).b(str).c(keyStore).a();
        try {
            Key key = keyStore.getKey(str, cArr);
            if (key instanceof RSAPrivateKey) {
                return new a(rSAKeyA).h((RSAPrivateKey) key).a();
            }
            return ((key instanceof PrivateKey) && SignUtils.KEY_RSA.equalsIgnoreCase(key.getAlgorithm())) ? new a(rSAKeyA).e((PrivateKey) key).a() : rSAKeyA;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e) {
            throw new JOSEException("Couldn't retrieve private RSA key (bad pin?): " + e.getMessage(), e);
        }
    }

    public static RSAKey parse(String str) throws ParseException {
        return parse(npd.m(str));
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
        return Objects.equals(this.n, rSAKey.n) && Objects.equals(this.e, rSAKey.e) && Objects.equals(this.d, rSAKey.d) && Objects.equals(this.p, rSAKey.p) && Objects.equals(this.q, rSAKey.q) && Objects.equals(this.dp, rSAKey.dp) && Objects.equals(this.dq, rSAKey.dq) && Objects.equals(this.qi, rSAKey.qi) && Objects.equals(this.oth, rSAKey.oth) && Objects.equals(this.privateKey, rSAKey.privateKey);
    }

    public Base64URL getFirstCRTCoefficient() {
        return this.qi;
    }

    public Base64URL getFirstFactorCRTExponent() {
        return this.dp;
    }

    public Base64URL getFirstPrimeFactor() {
        return this.p;
    }

    public Base64URL getModulus() {
        return this.n;
    }

    public List<OtherPrimesInfo> getOtherPrimes() {
        return this.oth;
    }

    public Base64URL getPrivateExponent() {
        return this.d;
    }

    public Base64URL getPublicExponent() {
        return this.e;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(PluginDeviceInfo.FICONOFFLINE, this.e.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put("n", this.n.toString());
        return linkedHashMap;
    }

    public Base64URL getSecondFactorCRTExponent() {
        return this.dq;
    }

    public Base64URL getSecondPrimeFactor() {
        return this.q;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.n, this.e, this.d, this.p, this.q, this.dp, this.dq, this.qi, this.oth, this.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return (this.d == null && this.p == null && this.privateKey == null) ? false : true;
    }

    public boolean matches(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (this.e.decodeToBigInteger().equals(rSAPublicKey.getPublicExponent())) {
                return this.n.decodeToBigInteger().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        try {
            return y73.e(this.n.decode());
        } catch (IntegerOverflowException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("n", this.n.toString());
        jSONObject.put(PluginDeviceInfo.FICONOFFLINE, this.e.toString());
        Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put(PluginDeviceInfo.FICONOFF, base64URL.toString());
        }
        Base64URL base64URL2 = this.p;
        if (base64URL2 != null) {
            jSONObject.put(FitnessFilePathUtils.TimeZoneConstant.POSITIVE, base64URL2.toString());
        }
        Base64URL base64URL3 = this.q;
        if (base64URL3 != null) {
            jSONObject.put("q", base64URL3.toString());
        }
        Base64URL base64URL4 = this.dp;
        if (base64URL4 != null) {
            jSONObject.put("dp", base64URL4.toString());
        }
        Base64URL base64URL5 = this.dq;
        if (base64URL5 != null) {
            jSONObject.put("dq", base64URL5.toString());
        }
        Base64URL base64URL6 = this.qi;
        if (base64URL6 != null) {
            jSONObject.put("qi", base64URL6.toString());
        }
        List<OtherPrimesInfo> list = this.oth;
        if (list != null && !list.isEmpty()) {
            List<Object> listA = kpd.a();
            for (OtherPrimesInfo otherPrimesInfo : this.oth) {
                Map<String, Object> mapL = npd.l();
                mapL.put("r", otherPrimesInfo.f10425r.toString());
                mapL.put(PluginDeviceInfo.FICONOFF, otherPrimesInfo.d.toString());
                mapL.put(DeviceTagInterface.CUSTOM_TAG_TYPE, otherPrimesInfo.t.toString());
                listA.add(mapL);
            }
            jSONObject.put("oth", listA);
        }
        return jSONObject;
    }

    public KeyPair toKeyPair() throws JOSEException {
        return new KeyPair(toRSAPublicKey(), toPrivateKey());
    }

    public PrivateKey toPrivateKey() throws JOSEException {
        RSAPrivateKey rSAPrivateKey = toRSAPrivateKey();
        return rSAPrivateKey != null ? rSAPrivateKey : this.privateKey;
    }

    public PublicKey toPublicKey() throws JOSEException {
        return toRSAPublicKey();
    }

    public RSAPrivateKey toRSAPrivateKey() throws JOSEException {
        KeySpec rSAPrivateCrtKeySpec;
        if (this.d == null) {
            return null;
        }
        BigInteger bigIntegerDecodeToBigInteger = this.n.decodeToBigInteger();
        BigInteger bigIntegerDecodeToBigInteger2 = this.d.decodeToBigInteger();
        if (this.p == null) {
            rSAPrivateCrtKeySpec = new RSAPrivateKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger2);
        } else {
            BigInteger bigIntegerDecodeToBigInteger3 = this.e.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger4 = this.p.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger5 = this.q.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger6 = this.dp.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger7 = this.dq.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger8 = this.qi.decodeToBigInteger();
            List<OtherPrimesInfo> list = this.oth;
            if (list == null || list.isEmpty()) {
                rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger3, bigIntegerDecodeToBigInteger2, bigIntegerDecodeToBigInteger4, bigIntegerDecodeToBigInteger5, bigIntegerDecodeToBigInteger6, bigIntegerDecodeToBigInteger7, bigIntegerDecodeToBigInteger8);
            } else {
                RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr = new RSAOtherPrimeInfo[this.oth.size()];
                for (int i = 0; i < this.oth.size(); i++) {
                    OtherPrimesInfo otherPrimesInfo = this.oth.get(i);
                    rSAOtherPrimeInfoArr[i] = new RSAOtherPrimeInfo(otherPrimesInfo.getPrimeFactor().decodeToBigInteger(), otherPrimesInfo.getFactorCRTExponent().decodeToBigInteger(), otherPrimesInfo.getFactorCRTCoefficient().decodeToBigInteger());
                }
                rSAPrivateCrtKeySpec = new RSAMultiPrimePrivateCrtKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger3, bigIntegerDecodeToBigInteger2, bigIntegerDecodeToBigInteger4, bigIntegerDecodeToBigInteger5, bigIntegerDecodeToBigInteger6, bigIntegerDecodeToBigInteger7, bigIntegerDecodeToBigInteger8, rSAOtherPrimeInfoArr);
            }
        }
        try {
            return (RSAPrivateKey) KeyFactory.getInstance(SignUtils.KEY_RSA).generatePrivate(rSAPrivateCrtKeySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public RSAPublicKey toRSAPublicKey() throws JOSEException {
        try {
            return (RSAPublicKey) KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new RSAPublicKeySpec(this.n.decodeToBigInteger(), this.e.decodeToBigInteger()));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, keyStore);
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The private exponent must not be null");
        }
    }

    public static RSAKey parse(Map<String, Object> map) throws ParseException {
        ArrayList arrayList;
        List<Object> listE;
        if (!KeyType.RSA.equals(jqd.d(map))) {
            throw new ParseException("The key type \"kty\" must be RSA", 0);
        }
        Base64URL base64URLA = npd.a(map, "n");
        Base64URL base64URLA2 = npd.a(map, PluginDeviceInfo.FICONOFFLINE);
        Base64URL base64URLA3 = npd.a(map, PluginDeviceInfo.FICONOFF);
        Base64URL base64URLA4 = npd.a(map, FitnessFilePathUtils.TimeZoneConstant.POSITIVE);
        Base64URL base64URLA5 = npd.a(map, "q");
        Base64URL base64URLA6 = npd.a(map, "dp");
        Base64URL base64URLA7 = npd.a(map, "dq");
        Base64URL base64URLA8 = npd.a(map, "qi");
        if (!map.containsKey("oth") || (listE = npd.e(map, "oth")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(listE.size());
            for (Object obj : listE) {
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    try {
                        arrayList.add(new OtherPrimesInfo(npd.a(map2, "r"), npd.a(map2, "dq"), npd.a(map2, DeviceTagInterface.CUSTOM_TAG_TYPE)));
                    } catch (IllegalArgumentException e) {
                        throw new ParseException(e.getMessage(), 0);
                    }
                }
            }
        }
        try {
            return new RSAKey(base64URLA, base64URLA2, base64URLA3, base64URLA4, base64URLA5, base64URLA6, base64URLA7, base64URLA8, arrayList, null, jqd.e(map), jqd.c(map), jqd.a(map), jqd.b(map), jqd.i(map), jqd.h(map), jqd.g(map), jqd.f(map), null);
        } catch (IllegalArgumentException e2) {
            throw new ParseException(e2.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public RSAKey toPublicJWK() {
        return new RSAKey(getModulus(), getPublicExponent(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getKeyStore());
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Base64URL f10426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Base64URL f10427b;
        public Base64URL c;
        public Base64URL d;
        public Base64URL e;
        public Base64URL f;
        public Base64URL g;
        public Base64URL h;
        public List<OtherPrimesInfo> i;
        public PrivateKey j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public KeyUse f10428k;
        public Set<KeyOperation> l;
        public Algorithm m;
        public String n;
        public URI o;

        @Deprecated
        public Base64URL p;
        public Base64URL q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<Base64> f10429r;
        public KeyStore s;

        public a(RSAPublicKey rSAPublicKey) {
            this.f10426a = Base64URL.encode(rSAPublicKey.getModulus());
            this.f10427b = Base64URL.encode(rSAPublicKey.getPublicExponent());
        }

        public RSAKey a() {
            try {
                return new RSAKey(this.f10426a, this.f10427b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f10428k, this.l, this.m, this.n, this.o, this.p, this.q, this.f10429r, this.s);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }

        public a b(String str) {
            this.n = str;
            return this;
        }

        public a c(KeyStore keyStore) {
            this.s = keyStore;
            return this;
        }

        public a d(KeyUse keyUse) {
            this.f10428k = keyUse;
            return this;
        }

        public a e(PrivateKey privateKey) {
            if (privateKey instanceof RSAPrivateKey) {
                return h((RSAPrivateKey) privateKey);
            }
            if (!SignUtils.KEY_RSA.equalsIgnoreCase(privateKey.getAlgorithm())) {
                throw new IllegalArgumentException("The private key algorithm must be RSA");
            }
            this.j = privateKey;
            return this;
        }

        public a f(RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey) {
            this.c = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent());
            this.d = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP());
            this.e = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ());
            this.f = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP());
            this.g = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ());
            this.h = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient());
            this.i = OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo());
            return this;
        }

        public a g(RSAPrivateCrtKey rSAPrivateCrtKey) {
            this.c = Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent());
            this.d = Base64URL.encode(rSAPrivateCrtKey.getPrimeP());
            this.e = Base64URL.encode(rSAPrivateCrtKey.getPrimeQ());
            this.f = Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP());
            this.g = Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ());
            this.h = Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient());
            return this;
        }

        public a h(RSAPrivateKey rSAPrivateKey) {
            if (rSAPrivateKey instanceof RSAPrivateCrtKey) {
                return g((RSAPrivateCrtKey) rSAPrivateKey);
            }
            if (rSAPrivateKey instanceof RSAMultiPrimePrivateCrtKey) {
                return f((RSAMultiPrimePrivateCrtKey) rSAPrivateKey);
            }
            this.c = Base64URL.encode(rSAPrivateKey.getPrivateExponent());
            return this;
        }

        public a i(List<Base64> list) {
            this.f10429r = list;
            return this;
        }

        public a j(Base64URL base64URL) {
            this.q = base64URL;
            return this;
        }

        public a(RSAKey rSAKey) {
            this.f10426a = rSAKey.n;
            this.f10427b = rSAKey.e;
            this.c = rSAKey.d;
            this.d = rSAKey.p;
            this.e = rSAKey.q;
            this.f = rSAKey.dp;
            this.g = rSAKey.dq;
            this.h = rSAKey.qi;
            this.i = rSAKey.oth;
            this.j = rSAKey.privateKey;
            this.f10428k = rSAKey.getKeyUse();
            this.l = rSAKey.getKeyOperations();
            this.m = rSAKey.getAlgorithm();
            this.n = rSAKey.getKeyID();
            this.o = rSAKey.getX509CertURL();
            this.p = rSAKey.getX509CertThumbprint();
            this.q = rSAKey.getX509CertSHA256Thumbprint();
            this.f10429r = rSAKey.getX509CertChain();
            this.s = rSAKey.getKeyStore();
        }
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL8, Base64URL base64URL9, List<Base64> list2, KeyStore keyStore) {
        this(base64URL, base64URL2, null, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, list, null, keyUse, set, algorithm, str, uri, base64URL8, base64URL9, list2, keyStore);
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The first prime factor must not be null");
        }
        if (base64URL4 == null) {
            throw new IllegalArgumentException("The second prime factor must not be null");
        }
        if (base64URL5 == null) {
            throw new IllegalArgumentException("The first factor CRT exponent must not be null");
        }
        if (base64URL6 == null) {
            throw new IllegalArgumentException("The second factor CRT exponent must not be null");
        }
        if (base64URL7 == null) {
            throw new IllegalArgumentException("The first CRT coefficient must not be null");
        }
    }

    @Immutable
    public static class OtherPrimesInfo implements Serializable {
        private static final long serialVersionUID = 1;
        private final Base64URL d;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Base64URL f10425r;
        private final Base64URL t;

        public OtherPrimesInfo(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
            if (base64URL == null) {
                throw new IllegalArgumentException("The prime factor must not be null");
            }
            this.f10425r = base64URL;
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            this.d = base64URL2;
            if (base64URL3 == null) {
                throw new IllegalArgumentException("The factor CRT coefficient must not be null");
            }
            this.t = base64URL3;
        }

        public static List<OtherPrimesInfo> toList(RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr) {
            ArrayList arrayList = new ArrayList();
            if (rSAOtherPrimeInfoArr == null) {
                return arrayList;
            }
            for (RSAOtherPrimeInfo rSAOtherPrimeInfo : rSAOtherPrimeInfoArr) {
                arrayList.add(new OtherPrimesInfo(rSAOtherPrimeInfo));
            }
            return arrayList;
        }

        public Base64URL getFactorCRTCoefficient() {
            return this.t;
        }

        public Base64URL getFactorCRTExponent() {
            return this.d;
        }

        public Base64URL getPrimeFactor() {
            return this.f10425r;
        }

        public OtherPrimesInfo(RSAOtherPrimeInfo rSAOtherPrimeInfo) {
            this.f10425r = Base64URL.encode(rSAOtherPrimeInfo.getPrime());
            this.d = Base64URL.encode(rSAOtherPrimeInfo.getExponent());
            this.t = Base64URL.encode(rSAOtherPrimeInfo.getCrtCoefficient());
        }
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2) {
        this(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, list, null, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2, KeyStore keyStore) {
        Base64URL base64URL11;
        Base64URL base64URL12;
        Base64URL base64URL13;
        super(KeyType.RSA, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, keyStore);
        if (base64URL != null) {
            this.n = base64URL;
            if (base64URL2 != null) {
                this.e = base64URL2;
                if (getParsedX509CertChain() != null && !matches(getParsedX509CertChain().get(0))) {
                    throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
                }
                this.d = base64URL3;
                if (base64URL4 != null && base64URL5 != null) {
                    base64URL11 = base64URL6;
                    base64URL12 = base64URL7;
                    if (base64URL11 != null) {
                        base64URL13 = base64URL8;
                        if (base64URL12 != null && base64URL13 != null) {
                            this.p = base64URL4;
                            this.q = base64URL5;
                            this.dp = base64URL11;
                            this.dq = base64URL12;
                            this.qi = base64URL13;
                            if (list != null) {
                                this.oth = Collections.unmodifiableList(list);
                            } else {
                                this.oth = Collections.emptyList();
                            }
                        }
                        this.privateKey = privateKey;
                        return;
                    }
                    if (base64URL4 != null && base64URL5 == null && base64URL11 == null && base64URL12 == null && base64URL13 == null && list == null) {
                        this.p = null;
                        this.q = null;
                        this.dp = null;
                        this.dq = null;
                        this.qi = null;
                        this.oth = Collections.emptyList();
                    } else {
                        if (base64URL4 == null || base64URL5 != null || base64URL11 != null || base64URL12 != null || base64URL13 != null) {
                            if (base64URL4 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                            }
                            if (base64URL5 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                            }
                            if (base64URL11 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                            }
                            if (base64URL12 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                            }
                            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                        }
                        this.p = null;
                        this.q = null;
                        this.dp = null;
                        this.dq = null;
                        this.qi = null;
                        this.oth = Collections.emptyList();
                    }
                    this.privateKey = privateKey;
                    return;
                }
                base64URL11 = base64URL6;
                base64URL12 = base64URL7;
                base64URL13 = base64URL8;
                if (base64URL4 != null) {
                    if (base64URL4 == null) {
                    }
                    if (base64URL4 == null) {
                        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                    }
                    if (base64URL5 == null) {
                        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                    }
                    if (base64URL11 == null) {
                        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                    }
                    if (base64URL12 == null) {
                        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                    }
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                }
                if (base64URL4 == null) {
                }
                if (base64URL4 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                }
                if (base64URL5 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                }
                if (base64URL11 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                }
                if (base64URL12 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                }
                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                this.privateKey = privateKey;
                return;
            }
            throw new IllegalArgumentException("The public exponent value must not be null");
        }
        throw new IllegalArgumentException("The modulus value must not be null");
    }

    public static RSAKey parse(X509Certificate x509Certificate) throws JOSEException {
        if (x509Certificate.getPublicKey() instanceof RSAPublicKey) {
            try {
                return new a((RSAPublicKey) x509Certificate.getPublicKey()).d(KeyUse.from(x509Certificate)).b(x509Certificate.getSerialNumber().toString(10)).i(Collections.singletonList(Base64.encode(x509Certificate.getEncoded()))).j(Base64URL.encode(MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM).digest(x509Certificate.getEncoded()))).a();
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException("Couldn't encode x5t parameter: " + e.getMessage(), e);
            } catch (CertificateEncodingException e2) {
                throw new JOSEException("Couldn't encode x5c parameter: " + e2.getMessage(), e2);
            }
        }
        throw new JOSEException("The public key of the X.509 certificate is not RSA");
    }

    public RSAKey(RSAPublicKey rSAPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAPrivateKey.getPrivateExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateCrtKey rSAPrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrimeP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient()), null, null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient()), OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo()), null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), null, null, null, null, null, null, null, privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }
}
