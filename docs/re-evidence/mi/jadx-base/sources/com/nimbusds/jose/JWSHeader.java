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
public final class JWSHeader extends x64 {
    private static final Set<String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;
    private final boolean b64;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JWSAlgorithm f10412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JOSEObjectType f10413b;
        public String c;
        public Set<String> d;
        public URI e;
        public JWK f;
        public URI g;

        @Deprecated
        public Base64URL h;
        public Base64URL i;
        public List<Base64> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f10414k;
        public boolean l = true;
        public Map<String, Object> m;
        public Base64URL n;

        public a(JWSAlgorithm jWSAlgorithm) {
            if (jWSAlgorithm.getName().equals(Algorithm.NONE.getName())) {
                throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
            }
            this.f10412a = jWSAlgorithm;
        }

        public a a(boolean z) {
            this.l = z;
            return this;
        }

        public JWSHeader b() {
            return new JWSHeader(this.f10412a, this.f10413b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f10414k, this.l, this.m, this.n);
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a d(Set<String> set) {
            this.d = set;
            return this;
        }

        public a e(String str, Object obj) {
            if (!JWSHeader.getRegisteredParameterNames().contains(str)) {
                if (this.m == null) {
                    this.m = new HashMap();
                }
                this.m.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a f(JWK jwk) {
            this.f = jwk;
            return this;
        }

        public a g(URI uri) {
            this.e = uri;
            return this;
        }

        public a h(String str) {
            this.f10414k = str;
            return this;
        }

        public a i(Base64URL base64URL) {
            this.n = base64URL;
            return this;
        }

        public a j(JOSEObjectType jOSEObjectType) {
            this.f10413b = jOSEObjectType;
            return this;
        }

        public a k(List<Base64> list) {
            this.j = list;
            return this;
        }

        public a l(Base64URL base64URL) {
            this.i = base64URL;
            return this;
        }

        @Deprecated
        public a m(Base64URL base64URL) {
            this.h = base64URL;
            return this;
        }

        public a n(URI uri) {
            this.g = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
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
        hashSet.add("b64");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public JWSHeader(JWSAlgorithm jWSAlgorithm) {
        this(jWSAlgorithm, null, null, null, null, null, null, null, null, null, null, true, null, null);
    }

    public static Set<String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    public static JWSHeader parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    @Override // defpackage.x64, com.nimbusds.jose.Header
    public Set<String> getIncludedParams() {
        Set<String> includedParams = super.getIncludedParams();
        if (!isBase64URLEncodePayload()) {
            includedParams.add("b64");
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

    public boolean isBase64URLEncodePayload() {
        return this.b64;
    }

    @Override // defpackage.x64, com.nimbusds.jose.Header
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        if (!isBase64URLEncodePayload()) {
            jSONObject.put("b64", Boolean.FALSE);
        }
        return jSONObject;
    }

    @Deprecated
    public JWSHeader(JWSAlgorithm jWSAlgorithm, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, Map<String, Object> map, Base64URL base64URL3) {
        this(jWSAlgorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, true, map, base64URL3);
    }

    public static JWSHeader parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        Algorithm algorithm = Header.parseAlgorithm(map);
        if (!(algorithm instanceof JWSAlgorithm)) {
            throw new ParseException("Not a JWS header", 0);
        }
        a aVarI = new a((JWSAlgorithm) algorithm).i(base64URL);
        for (String str : map.keySet()) {
            if (!"alg".equals(str)) {
                if ("typ".equals(str)) {
                    String strH = npd.h(map, str);
                    if (strH != null) {
                        aVarI = aVarI.j(new JOSEObjectType(strH));
                    }
                } else if ("cty".equals(str)) {
                    aVarI = aVarI.c(npd.h(map, str));
                } else if ("crit".equals(str)) {
                    List<String> listJ = npd.j(map, str);
                    if (listJ != null) {
                        aVarI = aVarI.d(new HashSet(listJ));
                    }
                } else if ("jku".equals(str)) {
                    aVarI = aVarI.g(npd.k(map, str));
                } else if ("jwk".equals(str)) {
                    Map<String, Object> mapF = npd.f(map, str);
                    if (mapF != null) {
                        aVarI = aVarI.f(JWK.parse(mapF));
                    }
                } else if ("x5u".equals(str)) {
                    aVarI = aVarI.n(npd.k(map, str));
                } else if ("x5t".equals(str)) {
                    aVarI = aVarI.m(Base64URL.from(npd.h(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    aVarI = aVarI.l(Base64URL.from(npd.h(map, str)));
                } else if ("x5c".equals(str)) {
                    aVarI = aVarI.k(ppr.b(npd.e(map, str)));
                } else if ("kid".equals(str)) {
                    aVarI = aVarI.h(npd.h(map, str));
                } else {
                    aVarI = "b64".equals(str) ? aVarI.a(npd.b(map, str)) : aVarI.e(str, map.get(str));
                }
            }
        }
        return aVarI.b();
    }

    @Override // com.nimbusds.jose.Header
    public JWSAlgorithm getAlgorithm() {
        return (JWSAlgorithm) super.getAlgorithm();
    }

    public JWSHeader(JWSAlgorithm jWSAlgorithm, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, boolean z, Map<String, Object> map, Base64URL base64URL3) {
        super(jWSAlgorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL3);
        if (!jWSAlgorithm.getName().equals(Algorithm.NONE.getName())) {
            this.b64 = z;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    public JWSHeader(JWSHeader jWSHeader) {
        this(jWSHeader.getAlgorithm(), jWSHeader.getType(), jWSHeader.getContentType(), jWSHeader.getCriticalParams(), jWSHeader.getJWKURL(), jWSHeader.getJWK(), jWSHeader.getX509CertURL(), jWSHeader.getX509CertThumbprint(), jWSHeader.getX509CertSHA256Thumbprint(), jWSHeader.getX509CertChain(), jWSHeader.getKeyID(), jWSHeader.isBase64URLEncodePayload(), jWSHeader.getCustomParams(), jWSHeader.getParsedBase64URL());
    }

    public static JWSHeader parse(String str) throws ParseException {
        return parse(str, (Base64URL) null);
    }

    public static JWSHeader parse(String str, Base64URL base64URL) throws ParseException {
        return parse(npd.m(str), base64URL);
    }

    public static JWSHeader parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
