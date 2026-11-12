package com.nimbusds.jwt;

import am.j;
import com.mapbox.maps.p;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jwt.util.DateUtils;
import hb.a;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class JWTClaimsSet implements Serializable {
    private static final Set<String> REGISTERED_CLAIM_NAMES;
    private static final long serialVersionUID = 1;
    private final Map<String, Object> claims;
    private final boolean serializeNullClaims;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add(JWTClaimNames.JWT_ID);
        REGISTERED_CLAIM_NAMES = Collections.unmodifiableSet(hashSet);
    }

    private JWTClaimsSet(Map<String, Object> map, boolean z14) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.claims = linkedHashMap;
        linkedHashMap.putAll(map);
        this.serializeNullClaims = z14;
    }

    public static Set<String> getRegisteredNames() {
        return REGISTERED_CLAIM_NAMES;
    }

    private static boolean isWrapper(Class<?> cls) {
        return cls == Integer.class || cls == Double.class || cls == Float.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Character.class || cls == Boolean.class;
    }

    public static JWTClaimsSet parse(Map<String, Object> map) throws ParseException {
        Builder builder = new Builder();
        for (String str : map.keySet()) {
            str.getClass();
            switch (str) {
                case "aud":
                    Object obj = map.get("aud");
                    if (obj instanceof String) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(JSONObjectUtils.getString(map, "aud"));
                        builder.audience(arrayList);
                        break;
                    } else {
                        if (!(obj instanceof List)) {
                            if (obj != null) {
                                p.i(0, "Illegal aud claim");
                                return null;
                            }
                            builder.audience((String) null);
                        } else {
                            builder.audience(JSONObjectUtils.getStringList(map, "aud"));
                        }
                        break;
                    }
                    break;
                case "exp":
                    builder.expirationTime(JSONObjectUtils.getEpochSecondAsDate(map, "exp"));
                    break;
                case "iat":
                    builder.issueTime(JSONObjectUtils.getEpochSecondAsDate(map, "iat"));
                    break;
                case "iss":
                    builder.issuer(JSONObjectUtils.getString(map, "iss"));
                    break;
                case "jti":
                    builder.jwtID(JSONObjectUtils.getString(map, JWTClaimNames.JWT_ID));
                    break;
                case "nbf":
                    builder.notBeforeTime(JSONObjectUtils.getEpochSecondAsDate(map, "nbf"));
                    break;
                case "sub":
                    Object obj2 = map.get("sub");
                    if (obj2 instanceof String) {
                        builder.subject(JSONObjectUtils.getString(map, "sub"));
                        break;
                    } else {
                        if (!(obj2 instanceof Number)) {
                            if (obj2 != null) {
                                p.i(0, "Illegal sub claim");
                                return null;
                            }
                            builder.subject(null);
                        } else {
                            builder.subject(String.valueOf(obj2));
                        }
                        break;
                    }
                    break;
                default:
                    builder.claim(str, map.get(str));
                    break;
            }
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JWTClaimsSet) {
            return Objects.equals(this.claims, ((JWTClaimsSet) obj).claims);
        }
        return false;
    }

    public List<String> getAudience() {
        Object claim = getClaim("aud");
        if (claim instanceof String) {
            return Collections.singletonList((String) claim);
        }
        try {
            List<String> stringListClaim = getStringListClaim("aud");
            return stringListClaim != null ? stringListClaim : Collections.EMPTY_LIST;
        } catch (ParseException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public Boolean getBooleanClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof Boolean)) {
            return (Boolean) claim;
        }
        p.i(0, j.m("The \"", str, "\" claim is not a Boolean"));
        return null;
    }

    public Object getClaim(String str) {
        return this.claims.get(str);
    }

    public String getClaimAsString(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof String)) {
            return (String) claim;
        }
        Class<?> cls = claim.getClass();
        if (cls.isPrimitive() || isWrapper(cls)) {
            return String.valueOf(claim);
        }
        p.i(0, j.m("The ", str, " claim is not and cannot be converted to a String"));
        return null;
    }

    public Map<String, Object> getClaims() {
        return Collections.unmodifiableMap(this.claims);
    }

    public Date getDateClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Date) {
            return (Date) claim;
        }
        if (claim instanceof Number) {
            return DateUtils.fromSecondsSinceEpoch(((Number) claim).longValue());
        }
        p.i(0, j.m("The \"", str, "\" claim is not a Date"));
        return null;
    }

    public Double getDoubleClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Double.valueOf(((Number) claim).doubleValue());
        }
        p.i(0, j.m("The \"", str, "\" claim is not a Double"));
        return null;
    }

    public Date getExpirationTime() {
        try {
            return getDateClaim("exp");
        } catch (ParseException unused) {
            return null;
        }
    }

    public Float getFloatClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Float.valueOf(((Number) claim).floatValue());
        }
        p.i(0, j.m("The \"", str, "\" claim is not a Float"));
        return null;
    }

    public Integer getIntegerClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Integer.valueOf(((Number) claim).intValue());
        }
        p.i(0, j.m("The \"", str, "\" claim is not an Integer"));
        return null;
    }

    public Date getIssueTime() {
        try {
            return getDateClaim("iat");
        } catch (ParseException unused) {
            return null;
        }
    }

    public String getIssuer() {
        try {
            return getStringClaim("iss");
        } catch (ParseException unused) {
            return null;
        }
    }

    public Map<String, Object> getJSONObjectClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (!(claim instanceof Map)) {
            p.i(0, j.m("The \"", str, "\" claim is not a JSON object or Map"));
            return null;
        }
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        for (Map.Entry entry : ((Map) claim).entrySet()) {
            if (entry.getKey() instanceof String) {
                mapNewJSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        return mapNewJSONObject;
    }

    public String getJWTID() {
        try {
            return getStringClaim(JWTClaimNames.JWT_ID);
        } catch (ParseException unused) {
            return null;
        }
    }

    public List<Object> getListClaim(String str) throws ParseException {
        if (getClaim(str) == null) {
            return null;
        }
        try {
            return (List) getClaim(str);
        } catch (ClassCastException unused) {
            p.i(0, j.m("The ", str, " claim is not a list / JSON array"));
            return null;
        }
    }

    public Long getLongClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Long.valueOf(((Number) claim).longValue());
        }
        p.i(0, j.m("The \"", str, "\" claim is not a Number"));
        return null;
    }

    public Date getNotBeforeTime() {
        try {
            return getDateClaim("nbf");
        } catch (ParseException unused) {
            return null;
        }
    }

    public String[] getStringArrayClaim(String str) throws ParseException {
        List<Object> listClaim = getListClaim(str);
        if (listClaim == null) {
            return null;
        }
        int size = listClaim.size();
        String[] strArr = new String[size];
        for (int i14 = 0; i14 < size; i14++) {
            try {
                strArr[i14] = (String) listClaim.get(i14);
            } catch (ClassCastException unused) {
                p.i(0, j.m("The ", str, " claim is not a list / JSON array of strings"));
                return null;
            }
        }
        return strArr;
    }

    public String getStringClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof String)) {
            return (String) claim;
        }
        p.i(0, j.m("The ", str, " claim is not a String"));
        return null;
    }

    public List<String> getStringListClaim(String str) throws ParseException {
        String[] stringArrayClaim = getStringArrayClaim(str);
        if (stringArrayClaim == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(stringArrayClaim));
    }

    public String getSubject() {
        try {
            return getStringClaim("sub");
        } catch (ParseException unused) {
            return null;
        }
    }

    public URI getURIClaim(String str) throws ParseException {
        String stringClaim = getStringClaim(str);
        if (stringClaim == null) {
            return null;
        }
        try {
            return new URI(stringClaim);
        } catch (URISyntaxException e4) {
            StringBuilder sbL = a.l("The \"", str, "\" claim is not a URI: ");
            sbL.append(e4.getMessage());
            throw new ParseException(sbL.toString(), 0);
        }
    }

    public int hashCode() {
        return Objects.hash(this.claims);
    }

    public Map<String, Object> toJSONObject(boolean z14) {
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        for (Map.Entry<String, Object> entry : this.claims.entrySet()) {
            if (entry.getValue() instanceof Date) {
                mapNewJSONObject.put(entry.getKey(), Long.valueOf(DateUtils.toSecondsSinceEpoch((Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                List<String> audience = getAudience();
                if (audience == null || audience.isEmpty()) {
                    if (z14) {
                        mapNewJSONObject.put("aud", null);
                    }
                } else if (audience.size() == 1) {
                    mapNewJSONObject.put("aud", audience.get(0));
                } else {
                    List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
                    listNewJSONArray.addAll(audience);
                    mapNewJSONObject.put("aud", listNewJSONArray);
                }
            } else if (entry.getValue() != null) {
                mapNewJSONObject.put(entry.getKey(), entry.getValue());
            } else if (z14) {
                mapNewJSONObject.put(entry.getKey(), null);
            }
        }
        return mapNewJSONObject;
    }

    public Payload toPayload() {
        return new Payload(toJSONObject(this.serializeNullClaims));
    }

    public String toString() {
        return JSONObjectUtils.toJSONString(toJSONObject());
    }

    public <T> T toType(JWTClaimsSetTransformer<T> jWTClaimsSetTransformer) {
        return jWTClaimsSetTransformer.transform(this);
    }

    public String toString(boolean z14) {
        return JSONObjectUtils.toJSONString(toJSONObject(z14));
    }

    public Payload toPayload(boolean z14) {
        return new Payload(toJSONObject(z14));
    }

    public static class Builder {
        private final Map<String, Object> claims;
        private boolean serializeNullClaims;

        public Builder(JWTClaimsSet jWTClaimsSet) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.claims = linkedHashMap;
            this.serializeNullClaims = false;
            linkedHashMap.putAll(jWTClaimsSet.claims);
        }

        public Builder audience(String str) {
            Map<String, Object> map = this.claims;
            if (str == null) {
                map.put("aud", null);
                return this;
            }
            map.put("aud", Collections.singletonList(str));
            return this;
        }

        public JWTClaimsSet build() {
            return new JWTClaimsSet(this.claims, this.serializeNullClaims);
        }

        public Builder claim(String str, Object obj) {
            this.claims.put(str, obj);
            return this;
        }

        public Builder expirationTime(Date date) {
            this.claims.put("exp", date);
            return this;
        }

        public Map<String, Object> getClaims() {
            return Collections.unmodifiableMap(this.claims);
        }

        public Builder issueTime(Date date) {
            this.claims.put("iat", date);
            return this;
        }

        public Builder issuer(String str) {
            this.claims.put("iss", str);
            return this;
        }

        public Builder jwtID(String str) {
            this.claims.put(JWTClaimNames.JWT_ID, str);
            return this;
        }

        public Builder notBeforeTime(Date date) {
            this.claims.put("nbf", date);
            return this;
        }

        public Builder serializeNullClaims(boolean z14) {
            this.serializeNullClaims = z14;
            return this;
        }

        public Builder subject(String str) {
            this.claims.put("sub", str);
            return this;
        }

        public Builder audience(List<String> list) {
            this.claims.put("aud", list);
            return this;
        }

        public Builder() {
            this.claims = new LinkedHashMap();
            this.serializeNullClaims = false;
        }
    }

    public Map<String, Object> toJSONObject() {
        return toJSONObject(this.serializeNullClaims);
    }

    public static JWTClaimsSet parse(String str) {
        return parse(JSONObjectUtils.parse(str));
    }
}
