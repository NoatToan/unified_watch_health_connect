package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import defpackage.npd;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Header implements Serializable {
    private static final Map<String, Object> EMPTY_CUSTOM_PARAMS = Collections.unmodifiableMap(new HashMap());
    private static final long serialVersionUID = 1;
    private final Algorithm alg;
    private final Set<String> crit;
    private final String cty;
    private final Map<String, Object> customParams;
    private final Base64URL parsedBase64URL;
    private final JOSEObjectType typ;

    public Header(Algorithm algorithm, JOSEObjectType jOSEObjectType, String str, Set<String> set, Map<String, Object> map, Base64URL base64URL) {
        if (algorithm == null) {
            throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
        }
        this.alg = algorithm;
        this.typ = jOSEObjectType;
        this.cty = str;
        if (set != null) {
            this.crit = Collections.unmodifiableSet(new HashSet(set));
        } else {
            this.crit = null;
        }
        if (map != null) {
            this.customParams = Collections.unmodifiableMap(new HashMap(map));
        } else {
            this.customParams = EMPTY_CUSTOM_PARAMS;
        }
        this.parsedBase64URL = base64URL;
    }

    public static Header parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    public static Algorithm parseAlgorithm(Map<String, Object> map) throws ParseException {
        String strH = npd.h(map, "alg");
        if (strH == null) {
            throw new ParseException("Missing \"alg\" in header JSON object", 0);
        }
        Algorithm algorithm = Algorithm.NONE;
        if (strH.equals(algorithm.getName())) {
            return algorithm;
        }
        return map.containsKey("enc") ? JWEAlgorithm.parse(strH) : JWSAlgorithm.parse(strH);
    }

    public Algorithm getAlgorithm() {
        return this.alg;
    }

    public String getContentType() {
        return this.cty;
    }

    public Set<String> getCriticalParams() {
        return this.crit;
    }

    public Object getCustomParam(String str) {
        return this.customParams.get(str);
    }

    public Map<String, Object> getCustomParams() {
        return this.customParams;
    }

    public Set<String> getIncludedParams() {
        HashSet hashSet = new HashSet(getCustomParams().keySet());
        hashSet.add("alg");
        if (getType() != null) {
            hashSet.add("typ");
        }
        if (getContentType() != null) {
            hashSet.add("cty");
        }
        if (getCriticalParams() != null && !getCriticalParams().isEmpty()) {
            hashSet.add("crit");
        }
        return hashSet;
    }

    public Base64URL getParsedBase64URL() {
        return this.parsedBase64URL;
    }

    public JOSEObjectType getType() {
        return this.typ;
    }

    public Base64URL toBase64URL() {
        Base64URL base64URL = this.parsedBase64URL;
        return base64URL == null ? Base64URL.encode(toString()) : base64URL;
    }

    public Map<String, Object> toJSONObject() {
        Map<String, Object> mapL = npd.l();
        mapL.putAll(this.customParams);
        mapL.put("alg", this.alg.toString());
        JOSEObjectType jOSEObjectType = this.typ;
        if (jOSEObjectType != null) {
            mapL.put("typ", jOSEObjectType.toString());
        }
        String str = this.cty;
        if (str != null) {
            mapL.put("cty", str);
        }
        Set<String> set = this.crit;
        if (set != null && !set.isEmpty()) {
            mapL.put("crit", new ArrayList(this.crit));
        }
        return mapL;
    }

    public String toString() {
        return npd.n(toJSONObject());
    }

    public static Header parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        Algorithm algorithm = parseAlgorithm(map);
        if (algorithm.equals(Algorithm.NONE)) {
            return PlainHeader.parse(map, base64URL);
        }
        if (algorithm instanceof JWSAlgorithm) {
            return JWSHeader.parse(map, base64URL);
        }
        if (algorithm instanceof JWEAlgorithm) {
            return JWEHeader.parse(map, base64URL);
        }
        throw new AssertionError("Unexpected algorithm type: " + algorithm);
    }

    public static Header parse(String str) throws ParseException {
        return parse(str, (Base64URL) null);
    }

    public Header(Header header) {
        this(header.getAlgorithm(), header.getType(), header.getContentType(), header.getCriticalParams(), header.getCustomParams(), header.getParsedBase64URL());
    }

    public static Header parse(String str, Base64URL base64URL) throws ParseException {
        return parse(npd.m(str), base64URL);
    }

    public static Header parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
