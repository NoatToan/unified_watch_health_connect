package com.nimbusds.jose;

import am.j;
import com.garmin.android.apps.connectmobile.f3;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.X509CertChainUtils;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class JWEHeader extends CommonSEHeader {
    private static final Set<String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;
    private final Base64URL apu;
    private final Base64URL apv;
    private final List<String> aud;
    private final EncryptionMethod enc;
    private final JWK epk;
    private final String iss;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final Base64URL f54705iv;
    private final int p2c;
    private final Base64URL p2s;
    private final String skid;
    private final String sub;
    private final Base64URL tag;
    private final CompressionAlgorithm zip;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add(HeaderParameterNames.ENCRYPTION_ALGORITHM);
        hashSet.add(HeaderParameterNames.EPHEMERAL_PUBLIC_KEY);
        hashSet.add(HeaderParameterNames.COMPRESSION_ALGORITHM);
        hashSet.add(HeaderParameterNames.JWK_SET_URL);
        f3.m(hashSet, HeaderParameterNames.JWK, "x5u", "x5t", "x5t#S256");
        f3.m(hashSet, "x5c", "kid", HeaderParameterNames.TYPE, HeaderParameterNames.CONTENT_TYPE);
        f3.m(hashSet, HeaderParameterNames.CRITICAL, HeaderParameterNames.AGREEMENT_PARTY_U_INFO, HeaderParameterNames.AGREEMENT_PARTY_V_INFO, HeaderParameterNames.PBES2_SALT_INPUT);
        f3.m(hashSet, HeaderParameterNames.PBES2_COUNT, HeaderParameterNames.INITIALIZATION_VECTOR, HeaderParameterNames.AUTHENTICATION_TAG, HeaderParameterNames.SENDER_KEY_ID);
        f3.m(hashSet, "iss", "sub", "aud", "authTag");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public JWEHeader(Algorithm algorithm, EncryptionMethod encryptionMethod, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, JWK jwk2, CompressionAlgorithm compressionAlgorithm, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i14, Base64URL base64URL6, Base64URL base64URL7, String str3, String str4, String str5, List<String> list2, Map<String, Object> map, Base64URL base64URL8) {
        super(algorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL8);
        if (algorithm != null && algorithm.getName().equals(Algorithm.NONE.getName())) {
            h.s("The JWE algorithm cannot be \"none\"");
            throw null;
        }
        if (jwk2 != null && jwk2.isPrivate()) {
            h.s("Ephemeral public key should not be a private key");
            throw null;
        }
        Objects.requireNonNull(encryptionMethod);
        this.enc = encryptionMethod;
        this.epk = jwk2;
        this.zip = compressionAlgorithm;
        this.apu = base64URL3;
        this.apv = base64URL4;
        this.p2s = base64URL5;
        this.p2c = i14;
        this.f54705iv = base64URL6;
        this.tag = base64URL7;
        this.skid = str3;
        this.iss = str4;
        this.sub = str5;
        this.aud = list2;
    }

    public static Set<String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    public static JWEHeader parse(Map<String, Object> map, Base64URL base64URL) {
        Builder builderAlg = new Builder(parseEncryptionMethod(map)).parsedBase64URL(base64URL);
        for (String str : map.keySet()) {
            if ("alg".equals(str)) {
                builderAlg = builderAlg.alg(JWEAlgorithm.parse(JSONObjectUtils.getString(map, str)));
            } else if (!HeaderParameterNames.ENCRYPTION_ALGORITHM.equals(str)) {
                if (HeaderParameterNames.TYPE.equals(str)) {
                    String string = JSONObjectUtils.getString(map, str);
                    if (string != null) {
                        builderAlg = builderAlg.type(new JOSEObjectType(string));
                    }
                } else if (HeaderParameterNames.CONTENT_TYPE.equals(str)) {
                    builderAlg = builderAlg.contentType(JSONObjectUtils.getString(map, str));
                } else if (HeaderParameterNames.CRITICAL.equals(str)) {
                    List<String> stringList = JSONObjectUtils.getStringList(map, str);
                    if (stringList != null) {
                        builderAlg = builderAlg.criticalParams(new HashSet(stringList));
                    }
                } else if (HeaderParameterNames.JWK_SET_URL.equals(str)) {
                    builderAlg = builderAlg.jwkURL(JSONObjectUtils.getURI(map, str));
                } else if (HeaderParameterNames.JWK.equals(str)) {
                    builderAlg = builderAlg.jwk(CommonSEHeader.parsePublicJWK(JSONObjectUtils.getJSONObject(map, str)));
                } else if ("x5u".equals(str)) {
                    builderAlg = builderAlg.x509CertURL(JSONObjectUtils.getURI(map, str));
                } else if ("x5t".equals(str)) {
                    builderAlg = builderAlg.x509CertThumbprint(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    builderAlg = builderAlg.x509CertSHA256Thumbprint(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("x5c".equals(str)) {
                    builderAlg = builderAlg.x509CertChain(X509CertChainUtils.toBase64List(JSONObjectUtils.getJSONArray(map, str)));
                } else if ("kid".equals(str)) {
                    builderAlg = builderAlg.keyID(JSONObjectUtils.getString(map, str));
                } else if (HeaderParameterNames.EPHEMERAL_PUBLIC_KEY.equals(str)) {
                    builderAlg = builderAlg.ephemeralPublicKey(JWK.parse(JSONObjectUtils.getJSONObject(map, str)));
                } else if (HeaderParameterNames.COMPRESSION_ALGORITHM.equals(str)) {
                    String string2 = JSONObjectUtils.getString(map, str);
                    if (string2 != null) {
                        builderAlg = builderAlg.compressionAlgorithm(new CompressionAlgorithm(string2));
                    }
                } else if (HeaderParameterNames.AGREEMENT_PARTY_U_INFO.equals(str)) {
                    builderAlg = builderAlg.agreementPartyUInfo(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if (HeaderParameterNames.AGREEMENT_PARTY_V_INFO.equals(str)) {
                    builderAlg = builderAlg.agreementPartyVInfo(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if (HeaderParameterNames.PBES2_SALT_INPUT.equals(str)) {
                    builderAlg = builderAlg.pbes2Salt(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if (HeaderParameterNames.PBES2_COUNT.equals(str)) {
                    builderAlg = builderAlg.pbes2Count(JSONObjectUtils.getInt(map, str));
                } else if (HeaderParameterNames.INITIALIZATION_VECTOR.equals(str)) {
                    builderAlg = builderAlg.iv(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if (HeaderParameterNames.AUTHENTICATION_TAG.equals(str)) {
                    builderAlg = builderAlg.authTag(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if (HeaderParameterNames.SENDER_KEY_ID.equals(str)) {
                    builderAlg = builderAlg.senderKeyID(JSONObjectUtils.getString(map, str));
                } else if ("iss".equals(str)) {
                    builderAlg = builderAlg.issuer(JSONObjectUtils.getString(map, str));
                } else if ("sub".equals(str)) {
                    builderAlg = builderAlg.subject(JSONObjectUtils.getString(map, str));
                } else if ("aud".equals(str)) {
                    builderAlg = map.get(str) instanceof String ? builderAlg.audience(Collections.singletonList(JSONObjectUtils.getString(map, str))) : builderAlg.audience(JSONObjectUtils.getStringList(map, str));
                } else {
                    builderAlg = builderAlg.customParam(str, map.get(str));
                }
            }
        }
        return builderAlg.build();
    }

    private static EncryptionMethod parseEncryptionMethod(Map<String, Object> map) {
        return EncryptionMethod.parse(JSONObjectUtils.getString(map, HeaderParameterNames.ENCRYPTION_ALGORITHM));
    }

    public Base64URL getAgreementPartyUInfo() {
        return this.apu;
    }

    public Base64URL getAgreementPartyVInfo() {
        return this.apv;
    }

    @Override // com.nimbusds.jose.Header
    public JWEAlgorithm getAlgorithm() {
        return (JWEAlgorithm) super.getAlgorithm();
    }

    public List<String> getAudience() {
        List<String> list = this.aud;
        return list == null ? Collections.EMPTY_LIST : list;
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
        return this.f54705iv;
    }

    @Override // com.nimbusds.jose.CommonSEHeader, com.nimbusds.jose.Header
    public Set<String> getIncludedParams() {
        Set<String> includedParams = super.getIncludedParams();
        if (this.enc != null) {
            includedParams.add(HeaderParameterNames.ENCRYPTION_ALGORITHM);
        }
        if (this.epk != null) {
            includedParams.add(HeaderParameterNames.EPHEMERAL_PUBLIC_KEY);
        }
        if (this.zip != null) {
            includedParams.add(HeaderParameterNames.COMPRESSION_ALGORITHM);
        }
        if (this.apu != null) {
            includedParams.add(HeaderParameterNames.AGREEMENT_PARTY_U_INFO);
        }
        if (this.apv != null) {
            includedParams.add(HeaderParameterNames.AGREEMENT_PARTY_V_INFO);
        }
        if (this.p2s != null) {
            includedParams.add(HeaderParameterNames.PBES2_SALT_INPUT);
        }
        if (this.p2c > 0) {
            includedParams.add(HeaderParameterNames.PBES2_COUNT);
        }
        if (this.f54705iv != null) {
            includedParams.add(HeaderParameterNames.INITIALIZATION_VECTOR);
        }
        if (this.tag != null) {
            includedParams.add(HeaderParameterNames.AUTHENTICATION_TAG);
        }
        if (this.skid != null) {
            includedParams.add(HeaderParameterNames.SENDER_KEY_ID);
        }
        if (this.iss != null) {
            includedParams.add("iss");
        }
        if (this.sub != null) {
            includedParams.add("sub");
        }
        if (this.aud != null) {
            includedParams.add("aud");
        }
        return includedParams;
    }

    public String getIssuer() {
        return this.iss;
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ JWK getJWK() {
        return super.getJWK();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ URI getJWKURL() {
        return super.getJWKURL();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ String getKeyID() {
        return super.getKeyID();
    }

    public int getPBES2Count() {
        return this.p2c;
    }

    public Base64URL getPBES2Salt() {
        return this.p2s;
    }

    public String getSenderKeyID() {
        return this.skid;
    }

    public String getSubject() {
        return this.sub;
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ List getX509CertChain() {
        return super.getX509CertChain();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ Base64URL getX509CertSHA256Thumbprint() {
        return super.getX509CertSHA256Thumbprint();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    @Deprecated
    public /* bridge */ /* synthetic */ Base64URL getX509CertThumbprint() {
        return super.getX509CertThumbprint();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ URI getX509CertURL() {
        return super.getX509CertURL();
    }

    @Override // com.nimbusds.jose.CommonSEHeader, com.nimbusds.jose.Header
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        EncryptionMethod encryptionMethod = this.enc;
        if (encryptionMethod != null) {
            jSONObject.put(HeaderParameterNames.ENCRYPTION_ALGORITHM, encryptionMethod.toString());
        }
        JWK jwk = this.epk;
        if (jwk != null) {
            jSONObject.put(HeaderParameterNames.EPHEMERAL_PUBLIC_KEY, jwk.toJSONObject());
        }
        CompressionAlgorithm compressionAlgorithm = this.zip;
        if (compressionAlgorithm != null) {
            jSONObject.put(HeaderParameterNames.COMPRESSION_ALGORITHM, compressionAlgorithm.toString());
        }
        Base64URL base64URL = this.apu;
        if (base64URL != null) {
            jSONObject.put(HeaderParameterNames.AGREEMENT_PARTY_U_INFO, base64URL.toString());
        }
        Base64URL base64URL2 = this.apv;
        if (base64URL2 != null) {
            jSONObject.put(HeaderParameterNames.AGREEMENT_PARTY_V_INFO, base64URL2.toString());
        }
        Base64URL base64URL3 = this.p2s;
        if (base64URL3 != null) {
            jSONObject.put(HeaderParameterNames.PBES2_SALT_INPUT, base64URL3.toString());
        }
        int i14 = this.p2c;
        if (i14 > 0) {
            jSONObject.put(HeaderParameterNames.PBES2_COUNT, Integer.valueOf(i14));
        }
        Base64URL base64URL4 = this.f54705iv;
        if (base64URL4 != null) {
            jSONObject.put(HeaderParameterNames.INITIALIZATION_VECTOR, base64URL4.toString());
        }
        Base64URL base64URL5 = this.tag;
        if (base64URL5 != null) {
            jSONObject.put(HeaderParameterNames.AUTHENTICATION_TAG, base64URL5.toString());
        }
        String str = this.skid;
        if (str != null) {
            jSONObject.put(HeaderParameterNames.SENDER_KEY_ID, str);
        }
        String str2 = this.iss;
        if (str2 != null) {
            jSONObject.put("iss", str2);
        }
        String str3 = this.sub;
        if (str3 != null) {
            jSONObject.put("sub", str3);
        }
        List<String> list = this.aud;
        if (list != null) {
            int size = list.size();
            List<String> list2 = this.aud;
            if (size == 1) {
                jSONObject.put("aud", list2.get(0));
                return jSONObject;
            }
            if (!list2.isEmpty()) {
                jSONObject.put("aud", this.aud);
            }
        }
        return jSONObject;
    }

    public JWEHeader(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
        this(jWEAlgorithm, encryptionMethod, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null);
    }

    @Deprecated
    public JWEHeader(Algorithm algorithm, EncryptionMethod encryptionMethod, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, JWK jwk2, CompressionAlgorithm compressionAlgorithm, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i14, Base64URL base64URL6, Base64URL base64URL7, String str3, Map<String, Object> map, Base64URL base64URL8) {
        this(algorithm, encryptionMethod, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, jwk2, compressionAlgorithm, base64URL3, base64URL4, base64URL5, i14, base64URL6, base64URL7, str3, null, null, null, map, base64URL8);
    }

    public JWEHeader(EncryptionMethod encryptionMethod) {
        this(null, encryptionMethod, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null);
    }

    public JWEHeader(JWEHeader jWEHeader) {
        this(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod(), jWEHeader.getType(), jWEHeader.getContentType(), jWEHeader.getCriticalParams(), jWEHeader.getJWKURL(), jWEHeader.getJWK(), jWEHeader.getX509CertURL(), jWEHeader.getX509CertThumbprint(), jWEHeader.getX509CertSHA256Thumbprint(), jWEHeader.getX509CertChain(), jWEHeader.getKeyID(), jWEHeader.getEphemeralPublicKey(), jWEHeader.getCompressionAlgorithm(), jWEHeader.getAgreementPartyUInfo(), jWEHeader.getAgreementPartyVInfo(), jWEHeader.getPBES2Salt(), jWEHeader.getPBES2Count(), jWEHeader.getIV(), jWEHeader.getAuthTag(), jWEHeader.getSenderKeyID(), jWEHeader.getIssuer(), jWEHeader.getSubject(), jWEHeader.getAudience(), jWEHeader.getCustomParams(), jWEHeader.getParsedBase64URL());
    }

    public static class Builder {
        private JWEAlgorithm alg;
        private Base64URL apu;
        private Base64URL apv;
        private List<String> aud;
        private Set<String> crit;
        private String cty;
        private Map<String, Object> customParams;
        private final EncryptionMethod enc;
        private JWK epk;
        private String iss;

        /* JADX INFO: renamed from: iv, reason: collision with root package name */
        private Base64URL f54706iv;
        private URI jku;
        private JWK jwk;
        private String kid;
        private int p2c;
        private Base64URL p2s;
        private Base64URL parsedBase64URL;
        private String skid;
        private String sub;
        private Base64URL tag;
        private JOSEObjectType typ;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;
        private CompressionAlgorithm zip;

        public Builder(JWEHeader jWEHeader) {
            this(jWEHeader.getEncryptionMethod());
            this.alg = jWEHeader.getAlgorithm();
            this.typ = jWEHeader.getType();
            this.cty = jWEHeader.getContentType();
            this.crit = jWEHeader.getCriticalParams();
            this.customParams = jWEHeader.getCustomParams();
            this.jku = jWEHeader.getJWKURL();
            this.jwk = jWEHeader.getJWK();
            this.x5u = jWEHeader.getX509CertURL();
            this.x5t = jWEHeader.getX509CertThumbprint();
            this.x5t256 = jWEHeader.getX509CertSHA256Thumbprint();
            this.x5c = jWEHeader.getX509CertChain();
            this.kid = jWEHeader.getKeyID();
            this.epk = jWEHeader.getEphemeralPublicKey();
            this.zip = jWEHeader.getCompressionAlgorithm();
            this.apu = jWEHeader.getAgreementPartyUInfo();
            this.apv = jWEHeader.getAgreementPartyVInfo();
            this.p2s = jWEHeader.getPBES2Salt();
            this.p2c = jWEHeader.getPBES2Count();
            this.f54706iv = jWEHeader.getIV();
            this.tag = jWEHeader.getAuthTag();
            this.skid = jWEHeader.getSenderKeyID();
            this.iss = jWEHeader.getIssuer();
            this.sub = jWEHeader.getSubject();
            this.aud = jWEHeader.getAudience();
            this.customParams = jWEHeader.getCustomParams();
        }

        public Builder agreementPartyUInfo(Base64URL base64URL) {
            this.apu = base64URL;
            return this;
        }

        public Builder agreementPartyVInfo(Base64URL base64URL) {
            this.apv = base64URL;
            return this;
        }

        public Builder alg(JWEAlgorithm jWEAlgorithm) {
            this.alg = jWEAlgorithm;
            return this;
        }

        public Builder audience(List<String> list) {
            this.aud = list;
            return this;
        }

        public Builder authTag(Base64URL base64URL) {
            this.tag = base64URL;
            return this;
        }

        public JWEHeader build() {
            return new JWEHeader(this.alg, this.enc, this.typ, this.cty, this.crit, this.jku, this.jwk, this.x5u, this.x5t, this.x5t256, this.x5c, this.kid, this.epk, this.zip, this.apu, this.apv, this.p2s, this.p2c, this.f54706iv, this.tag, this.skid, this.iss, this.sub, this.aud, this.customParams, this.parsedBase64URL);
        }

        public Builder compressionAlgorithm(CompressionAlgorithm compressionAlgorithm) {
            this.zip = compressionAlgorithm;
            return this;
        }

        public Builder contentType(String str) {
            this.cty = str;
            return this;
        }

        public Builder criticalParams(Set<String> set) {
            this.crit = set;
            return this;
        }

        public Builder customParam(String str, Object obj) {
            if (JWEHeader.getRegisteredParameterNames().contains(str)) {
                h.s(j.m("The parameter name \"", str, "\" matches a registered name"));
                return null;
            }
            if (this.customParams == null) {
                this.customParams = new HashMap();
            }
            this.customParams.put(str, obj);
            return this;
        }

        public Builder customParams(Map<String, Object> map) {
            this.customParams = map;
            return this;
        }

        public Builder ephemeralPublicKey(JWK jwk) {
            this.epk = jwk;
            return this;
        }

        public Builder issuer(String str) {
            this.iss = str;
            return this;
        }

        public Builder iv(Base64URL base64URL) {
            this.f54706iv = base64URL;
            return this;
        }

        public Builder jwk(JWK jwk) {
            if (jwk == null || !jwk.isPrivate()) {
                this.jwk = jwk;
                return this;
            }
            h.s("The JWK must be public");
            return null;
        }

        public Builder jwkURL(URI uri) {
            this.jku = uri;
            return this;
        }

        public Builder keyID(String str) {
            this.kid = str;
            return this;
        }

        public Builder parsedBase64URL(Base64URL base64URL) {
            this.parsedBase64URL = base64URL;
            return this;
        }

        public Builder pbes2Count(int i14) {
            if (i14 >= 0) {
                this.p2c = i14;
                return this;
            }
            h.s("The PBES2 count parameter must not be negative");
            return null;
        }

        public Builder pbes2Salt(Base64URL base64URL) {
            this.p2s = base64URL;
            return this;
        }

        public Builder senderKeyID(String str) {
            this.skid = str;
            return this;
        }

        public Builder subject(String str) {
            this.sub = str;
            return this;
        }

        public Builder type(JOSEObjectType jOSEObjectType) {
            this.typ = jOSEObjectType;
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

        public Builder(EncryptionMethod encryptionMethod) {
            Objects.requireNonNull(encryptionMethod);
            this.enc = encryptionMethod;
        }

        public Builder(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
            if (!jWEAlgorithm.getName().equals(Algorithm.NONE.getName())) {
                this.alg = jWEAlgorithm;
                Objects.requireNonNull(encryptionMethod);
                this.enc = encryptionMethod;
                return;
            }
            h.s("The JWE algorithm \"alg\" cannot be \"none\"");
            throw null;
        }
    }

    public static JWEHeader parse(Map<String, Object> map) {
        return parse(map, (Base64URL) null);
    }

    public static JWEHeader parse(String str) {
        return parse(JSONObjectUtils.parse(str), (Base64URL) null);
    }

    public static JWEHeader parse(String str, Base64URL base64URL) {
        return parse(JSONObjectUtils.parse(str, 20000), base64URL);
    }

    public static JWEHeader parse(Base64URL base64URL) {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
