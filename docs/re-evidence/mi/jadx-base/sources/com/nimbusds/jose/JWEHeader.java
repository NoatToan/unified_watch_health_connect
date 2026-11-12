package com.nimbusds.jose;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import defpackage.npd;
import defpackage.ppr;
import defpackage.x64;
import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class JWEHeader extends x64 {
    private static final Set<String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;
    private final Base64URL apu;
    private final Base64URL apv;
    private final EncryptionMethod enc;
    private final JWK epk;
    private final Base64URL iv;
    private final int p2c;
    private final Base64URL p2s;
    private final Base64URL tag;
    private final CompressionAlgorithm zip;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JWEAlgorithm f10408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EncryptionMethod f10409b;
        public JOSEObjectType c;
        public String d;
        public Set<String> e;
        public URI f;
        public JWK g;
        public URI h;

        @Deprecated
        public Base64URL i;
        public Base64URL j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<Base64> f10410k;
        public String l;
        public JWK m;
        public CompressionAlgorithm n;
        public Base64URL o;
        public Base64URL p;
        public Base64URL q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f10411r;
        public Base64URL s;
        public Base64URL t;
        public Map<String, Object> u;
        public Base64URL v;

        public a(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
            if (jWEAlgorithm.getName().equals(Algorithm.NONE.getName())) {
                throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
            }
            this.f10408a = jWEAlgorithm;
            if (encryptionMethod == null) {
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            this.f10409b = encryptionMethod;
        }

        public a a(Base64URL base64URL) {
            this.o = base64URL;
            return this;
        }

        public a b(Base64URL base64URL) {
            this.p = base64URL;
            return this;
        }

        public a c(Base64URL base64URL) {
            this.t = base64URL;
            return this;
        }

        public JWEHeader d() {
            return new JWEHeader(this.f10408a, this.f10409b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f10410k, this.l, this.m, this.n, this.o, this.p, this.q, this.f10411r, this.s, this.t, this.u, this.v);
        }

        public a e(CompressionAlgorithm compressionAlgorithm) {
            this.n = compressionAlgorithm;
            return this;
        }

        public a f(String str) {
            this.d = str;
            return this;
        }

        public a g(Set<String> set) {
            this.e = set;
            return this;
        }

        public a h(String str, Object obj) {
            if (!JWEHeader.getRegisteredParameterNames().contains(str)) {
                if (this.u == null) {
                    this.u = new HashMap();
                }
                this.u.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a i(JWK jwk) {
            this.m = jwk;
            return this;
        }

        public a j(Base64URL base64URL) {
            this.s = base64URL;
            return this;
        }

        public a k(JWK jwk) {
            this.g = jwk;
            return this;
        }

        public a l(URI uri) {
            this.f = uri;
            return this;
        }

        public a m(String str) {
            this.l = str;
            return this;
        }

        public a n(Base64URL base64URL) {
            this.v = base64URL;
            return this;
        }

        public a o(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
            }
            this.f10411r = i;
            return this;
        }

        public a p(Base64URL base64URL) {
            this.q = base64URL;
            return this;
        }

        public a q(JOSEObjectType jOSEObjectType) {
            this.c = jOSEObjectType;
            return this;
        }

        public a r(List<Base64> list) {
            this.f10410k = list;
            return this;
        }

        public a s(Base64URL base64URL) {
            this.j = base64URL;
            return this;
        }

        @Deprecated
        public a t(Base64URL base64URL) {
            this.i = base64URL;
            return this;
        }

        public a u(URI uri) {
            this.h = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("authTag");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public JWEHeader(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
        this(jWEAlgorithm, encryptionMethod, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null);
    }

    public static Set<String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    public static JWEHeader parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    private static EncryptionMethod parseEncryptionMethod(Map<String, Object> map) throws ParseException {
        return EncryptionMethod.parse(npd.h(map, "enc"));
    }

    public Base64URL getAgreementPartyUInfo() {
        return this.apu;
    }

    public Base64URL getAgreementPartyVInfo() {
        return this.apv;
    }

    public Base64URL getAuthTag() {
        return this.tag;
    }

    public CompressionAlgorithm getCompressionAlgorithm() {
        return this.zip;
    }

    public EncryptionMethod getEncryptionMethod() {
        return this.enc;
    }

    public JWK getEphemeralPublicKey() {
        return this.epk;
    }

    public Base64URL getIV() {
        return this.iv;
    }

    @Override // defpackage.x64, com.nimbusds.jose.Header
    public Set<String> getIncludedParams() {
        Set<String> includedParams = super.getIncludedParams();
        if (this.enc != null) {
            includedParams.add("enc");
        }
        if (this.epk != null) {
            includedParams.add("epk");
        }
        if (this.zip != null) {
            includedParams.add("zip");
        }
        if (this.apu != null) {
            includedParams.add("apu");
        }
        if (this.apv != null) {
            includedParams.add("apv");
        }
        if (this.p2s != null) {
            includedParams.add("p2s");
        }
        if (this.p2c > 0) {
            includedParams.add("p2c");
        }
        if (this.iv != null) {
            includedParams.add("iv");
        }
        if (this.tag != null) {
            includedParams.add("tag");
        }
        return includedParams;
    }

    @Override // defpackage.x64
    public /* bridge */ /* synthetic */ JWK getJWK() {
        return super.getJWK();
    }

    @Override // defpackage.x64
    public /* bridge */ /* synthetic */ URI getJWKURL() {
        return super.getJWKURL();
    }

    @Override // defpackage.x64
    public /* bridge */ /* synthetic */ String getKeyID() {
        return super.getKeyID();
    }

    public int getPBES2Count() {
        return this.p2c;
    }

    public Base64URL getPBES2Salt() {
        return this.p2s;
    }

    @Override // defpackage.x64
    public /* bridge */ /* synthetic */ List getX509CertChain() {
        return super.getX509CertChain();
    }

    @Override // defpackage.x64
    public /* bridge */ /* synthetic */ Base64URL getX509CertSHA256Thumbprint() {
        return super.getX509CertSHA256Thumbprint();
    }

    @Override // defpackage.x64
    @Deprecated
    public /* bridge */ /* synthetic */ Base64URL getX509CertThumbprint() {
        return super.getX509CertThumbprint();
    }

    @Override // defpackage.x64
    public /* bridge */ /* synthetic */ URI getX509CertURL() {
        return super.getX509CertURL();
    }

    @Override // defpackage.x64, com.nimbusds.jose.Header
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        EncryptionMethod encryptionMethod = this.enc;
        if (encryptionMethod != null) {
            jSONObject.put("enc", encryptionMethod.toString());
        }
        JWK jwk = this.epk;
        if (jwk != null) {
            jSONObject.put("epk", jwk.toJSONObject());
        }
        CompressionAlgorithm compressionAlgorithm = this.zip;
        if (compressionAlgorithm != null) {
            jSONObject.put("zip", compressionAlgorithm.toString());
        }
        Base64URL base64URL = this.apu;
        if (base64URL != null) {
            jSONObject.put("apu", base64URL.toString());
        }
        Base64URL base64URL2 = this.apv;
        if (base64URL2 != null) {
            jSONObject.put("apv", base64URL2.toString());
        }
        Base64URL base64URL3 = this.p2s;
        if (base64URL3 != null) {
            jSONObject.put("p2s", base64URL3.toString());
        }
        int i = this.p2c;
        if (i > 0) {
            jSONObject.put("p2c", Integer.valueOf(i));
        }
        Base64URL base64URL4 = this.iv;
        if (base64URL4 != null) {
            jSONObject.put("iv", base64URL4.toString());
        }
        Base64URL base64URL5 = this.tag;
        if (base64URL5 != null) {
            jSONObject.put("tag", base64URL5.toString());
        }
        return jSONObject;
    }

    public JWEHeader(Algorithm algorithm, EncryptionMethod encryptionMethod, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, JWK jwk2, CompressionAlgorithm compressionAlgorithm, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i, Base64URL base64URL6, Base64URL base64URL7, Map<String, Object> map, Base64URL base64URL8) {
        super(algorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL8);
        if (algorithm.getName().equals(Algorithm.NONE.getName())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (encryptionMethod == null) {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        }
        if (jwk2 != null && jwk2.isPrivate()) {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
        this.enc = encryptionMethod;
        this.epk = jwk2;
        this.zip = compressionAlgorithm;
        this.apu = base64URL3;
        this.apv = base64URL4;
        this.p2s = base64URL5;
        this.p2c = i;
        this.iv = base64URL6;
        this.tag = base64URL7;
    }

    public static JWEHeader parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        Algorithm algorithm = Header.parseAlgorithm(map);
        if (!(algorithm instanceof JWEAlgorithm)) {
            throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
        }
        a aVarN = new a((JWEAlgorithm) algorithm, parseEncryptionMethod(map)).n(base64URL);
        for (String str : map.keySet()) {
            if (!"alg".equals(str) && !"enc".equals(str)) {
                if ("typ".equals(str)) {
                    String strH = npd.h(map, str);
                    if (strH != null) {
                        aVarN = aVarN.q(new JOSEObjectType(strH));
                    }
                } else if ("cty".equals(str)) {
                    aVarN = aVarN.f(npd.h(map, str));
                } else if ("crit".equals(str)) {
                    List<String> listJ = npd.j(map, str);
                    if (listJ != null) {
                        aVarN = aVarN.g(new HashSet(listJ));
                    }
                } else if ("jku".equals(str)) {
                    aVarN = aVarN.l(npd.k(map, str));
                } else if ("jwk".equals(str)) {
                    Map<String, Object> mapF = npd.f(map, str);
                    if (mapF != null) {
                        aVarN = aVarN.k(JWK.parse(mapF));
                    }
                } else if ("x5u".equals(str)) {
                    aVarN = aVarN.u(npd.k(map, str));
                } else if ("x5t".equals(str)) {
                    aVarN = aVarN.t(Base64URL.from(npd.h(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    aVarN = aVarN.s(Base64URL.from(npd.h(map, str)));
                } else if ("x5c".equals(str)) {
                    aVarN = aVarN.r(ppr.b(npd.e(map, str)));
                } else if ("kid".equals(str)) {
                    aVarN = aVarN.m(npd.h(map, str));
                } else if ("epk".equals(str)) {
                    aVarN = aVarN.i(JWK.parse(npd.f(map, str)));
                } else if ("zip".equals(str)) {
                    String strH2 = npd.h(map, str);
                    if (strH2 != null) {
                        aVarN = aVarN.e(new CompressionAlgorithm(strH2));
                    }
                } else if ("apu".equals(str)) {
                    aVarN = aVarN.a(Base64URL.from(npd.h(map, str)));
                } else if ("apv".equals(str)) {
                    aVarN = aVarN.b(Base64URL.from(npd.h(map, str)));
                } else if ("p2s".equals(str)) {
                    aVarN = aVarN.p(Base64URL.from(npd.h(map, str)));
                } else if ("p2c".equals(str)) {
                    aVarN = aVarN.o(npd.d(map, str));
                } else if ("iv".equals(str)) {
                    aVarN = aVarN.j(Base64URL.from(npd.h(map, str)));
                } else {
                    aVarN = "tag".equals(str) ? aVarN.c(Base64URL.from(npd.h(map, str))) : aVarN.h(str, map.get(str));
                }
            }
        }
        return aVarN.d();
    }

    @Override // com.nimbusds.jose.Header
    public JWEAlgorithm getAlgorithm() {
        return (JWEAlgorithm) super.getAlgorithm();
    }

    public JWEHeader(JWEHeader jWEHeader) {
        this(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod(), jWEHeader.getType(), jWEHeader.getContentType(), jWEHeader.getCriticalParams(), jWEHeader.getJWKURL(), jWEHeader.getJWK(), jWEHeader.getX509CertURL(), jWEHeader.getX509CertThumbprint(), jWEHeader.getX509CertSHA256Thumbprint(), jWEHeader.getX509CertChain(), jWEHeader.getKeyID(), jWEHeader.getEphemeralPublicKey(), jWEHeader.getCompressionAlgorithm(), jWEHeader.getAgreementPartyUInfo(), jWEHeader.getAgreementPartyVInfo(), jWEHeader.getPBES2Salt(), jWEHeader.getPBES2Count(), jWEHeader.getIV(), jWEHeader.getAuthTag(), jWEHeader.getCustomParams(), jWEHeader.getParsedBase64URL());
    }

    public static JWEHeader parse(String str) throws ParseException {
        return parse(npd.m(str), (Base64URL) null);
    }

    public static JWEHeader parse(String str, Base64URL base64URL) throws ParseException {
        return parse(npd.m(str), base64URL);
    }

    public static JWEHeader parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
