package com.nimbusds.jwt;

import com.nimbusds.jose.Payload;
import defpackage.ar5;
import defpackage.kpd;
import defpackage.npd;
import defpackage.oqd;
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
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class JWTClaimsSet implements Serializable {
    private static final String AUDIENCE_CLAIM = "aud";
    private static final String EXPIRATION_TIME_CLAIM = "exp";
    private static final String ISSUED_AT_CLAIM = "iat";
    private static final String ISSUER_CLAIM = "iss";
    private static final String JWT_ID_CLAIM = "jti";
    private static final String NOT_BEFORE_CLAIM = "nbf";
    private static final Set<String> REGISTERED_CLAIM_NAMES;
    private static final String SUBJECT_CLAIM = "sub";
    private static final long serialVersionUID = 1;
    private final Map<String, Object> claims;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, Object> f10430a = new LinkedHashMap();

        public b a(String str) {
            if (str == null) {
                this.f10430a.put(JWTClaimsSet.AUDIENCE_CLAIM, null);
            } else {
                this.f10430a.put(JWTClaimsSet.AUDIENCE_CLAIM, Collections.singletonList(str));
            }
            return this;
        }

        public b b(List<String> list) {
            this.f10430a.put(JWTClaimsSet.AUDIENCE_CLAIM, list);
            return this;
        }

        public JWTClaimsSet c() {
            return new JWTClaimsSet(this.f10430a);
        }

        public b d(String str, Object obj) {
            this.f10430a.put(str, obj);
            return this;
        }

        public b e(Date date) {
            this.f10430a.put(JWTClaimsSet.EXPIRATION_TIME_CLAIM, date);
            return this;
        }

        public b f(Date date) {
            this.f10430a.put(JWTClaimsSet.ISSUED_AT_CLAIM, date);
            return this;
        }

        public b g(String str) {
            this.f10430a.put(JWTClaimsSet.ISSUER_CLAIM, str);
            return this;
        }

        public b h(String str) {
            this.f10430a.put(JWTClaimsSet.JWT_ID_CLAIM, str);
            return this;
        }

        public b i(Date date) {
            this.f10430a.put(JWTClaimsSet.NOT_BEFORE_CLAIM, date);
            return this;
        }

        public b j(String str) {
            this.f10430a.put(JWTClaimsSet.SUBJECT_CLAIM, str);
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(ISSUER_CLAIM);
        hashSet.add(SUBJECT_CLAIM);
        hashSet.add(AUDIENCE_CLAIM);
        hashSet.add(EXPIRATION_TIME_CLAIM);
        hashSet.add(NOT_BEFORE_CLAIM);
        hashSet.add(ISSUED_AT_CLAIM);
        hashSet.add(JWT_ID_CLAIM);
        REGISTERED_CLAIM_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public static Set<String> getRegisteredNames() {
        return REGISTERED_CLAIM_NAMES;
    }

    public static JWTClaimsSet parse(Map<String, Object> map) throws ParseException {
        b bVar = new b();
        for (String str : map.keySet()) {
            str.hashCode();
            switch (str) {
                case "aud":
                    Object obj = map.get(AUDIENCE_CLAIM);
                    if (!(obj instanceof String)) {
                        if (obj instanceof List) {
                            bVar.b(npd.j(map, AUDIENCE_CLAIM));
                        } else if (obj == null) {
                            bVar.a(null);
                        }
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(npd.h(map, AUDIENCE_CLAIM));
                        bVar.b(arrayList);
                        break;
                    }
                    break;
                case "exp":
                    bVar.e(new Date(npd.g(map, EXPIRATION_TIME_CLAIM) * 1000));
                    break;
                case "iat":
                    bVar.f(new Date(npd.g(map, ISSUED_AT_CLAIM) * 1000));
                    break;
                case "iss":
                    bVar.g(npd.h(map, ISSUER_CLAIM));
                    break;
                case "jti":
                    bVar.h(npd.h(map, JWT_ID_CLAIM));
                    break;
                case "nbf":
                    bVar.i(new Date(npd.g(map, NOT_BEFORE_CLAIM) * 1000));
                    break;
                case "sub":
                    bVar.j(npd.h(map, SUBJECT_CLAIM));
                    break;
                default:
                    bVar.d(str, map.get(str));
                    break;
            }
        }
        return bVar.c();
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
        Object claim = getClaim(AUDIENCE_CLAIM);
        if (claim instanceof String) {
            return Collections.singletonList((String) claim);
        }
        try {
            List<String> stringListClaim = getStringListClaim(AUDIENCE_CLAIM);
            return stringListClaim != null ? stringListClaim : Collections.emptyList();
        } catch (ParseException unused) {
            return Collections.emptyList();
        }
    }

    public Boolean getBooleanClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof Boolean)) {
            return (Boolean) claim;
        }
        throw new ParseException("The \"" + str + "\" claim is not a Boolean", 0);
    }

    public Object getClaim(String str) {
        return this.claims.get(str);
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
            return ar5.a(((Number) claim).longValue());
        }
        throw new ParseException("The \"" + str + "\" claim is not a Date", 0);
    }

    public Double getDoubleClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Double.valueOf(((Number) claim).doubleValue());
        }
        throw new ParseException("The \"" + str + "\" claim is not a Double", 0);
    }

    public Date getExpirationTime() {
        try {
            return getDateClaim(EXPIRATION_TIME_CLAIM);
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
        throw new ParseException("The \"" + str + "\" claim is not a Float", 0);
    }

    public Integer getIntegerClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Integer.valueOf(((Number) claim).intValue());
        }
        throw new ParseException("The \"" + str + "\" claim is not an Integer", 0);
    }

    public Date getIssueTime() {
        try {
            return getDateClaim(ISSUED_AT_CLAIM);
        } catch (ParseException unused) {
            return null;
        }
    }

    public String getIssuer() {
        try {
            return getStringClaim(ISSUER_CLAIM);
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
            throw new ParseException("The \"" + str + "\" claim is not a JSON object or Map", 0);
        }
        Map<String, Object> mapL = npd.l();
        for (Map.Entry entry : ((Map) claim).entrySet()) {
            if (entry.getKey() instanceof String) {
                mapL.put((String) entry.getKey(), entry.getValue());
            }
        }
        return mapL;
    }

    public String getJWTID() {
        try {
            return getStringClaim(JWT_ID_CLAIM);
        } catch (ParseException unused) {
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
        throw new ParseException("The \"" + str + "\" claim is not a Number", 0);
    }

    public Date getNotBeforeTime() {
        try {
            return getDateClaim(NOT_BEFORE_CLAIM);
        } catch (ParseException unused) {
            return null;
        }
    }

    public String[] getStringArrayClaim(String str) throws ParseException {
        if (getClaim(str) == null) {
            return null;
        }
        try {
            List list = (List) getClaim(str);
            int size = list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                try {
                    strArr[i] = (String) list.get(i);
                } catch (ClassCastException unused) {
                    throw new ParseException("The \"" + str + "\" claim is not a list / JSON array of strings", 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException("The \"" + str + "\" claim is not a list / JSON array", 0);
        }
    }

    public String getStringClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof String)) {
            return (String) claim;
        }
        throw new ParseException("The \"" + str + "\" claim is not a String", 0);
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
            return getStringClaim(SUBJECT_CLAIM);
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
        } catch (URISyntaxException e) {
            throw new ParseException("The \"" + str + "\" claim is not a URI: " + e.getMessage(), 0);
        }
    }

    public int hashCode() {
        return Objects.hash(this.claims);
    }

    public Map<String, Object> toJSONObject() {
        return toJSONObject(false);
    }

    public Payload toPayload() {
        return new Payload(toJSONObject());
    }

    public String toString() {
        return npd.n(toJSONObject());
    }

    public <T> T toType(oqd<T> oqdVar) {
        return oqdVar.a(this);
    }

    private JWTClaimsSet(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.claims = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    public Map<String, Object> toJSONObject(boolean z) {
        Map<String, Object> mapL = npd.l();
        for (Map.Entry<String, Object> entry : this.claims.entrySet()) {
            if (entry.getValue() instanceof Date) {
                mapL.put(entry.getKey(), Long.valueOf(ar5.b((Date) entry.getValue())));
            } else if (AUDIENCE_CLAIM.equals(entry.getKey())) {
                List<String> audience = getAudience();
                if (audience == null || audience.isEmpty()) {
                    if (z) {
                        mapL.put(AUDIENCE_CLAIM, null);
                    }
                } else if (audience.size() == 1) {
                    mapL.put(AUDIENCE_CLAIM, audience.get(0));
                } else {
                    List<Object> listA = kpd.a();
                    listA.addAll(audience);
                    mapL.put(AUDIENCE_CLAIM, listA);
                }
            } else if (entry.getValue() != null) {
                mapL.put(entry.getKey(), entry.getValue());
            } else if (z) {
                mapL.put(entry.getKey(), null);
            }
        }
        return mapL;
    }

    public String toString(boolean z) {
        return npd.n(toJSONObject(z));
    }

    public static JWTClaimsSet parse(String str) throws ParseException {
        return parse(npd.m(str));
    }
}
