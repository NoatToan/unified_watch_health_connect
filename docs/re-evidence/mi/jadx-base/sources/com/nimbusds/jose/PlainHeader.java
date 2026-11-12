package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import defpackage.npd;
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
public final class PlainHeader extends Header {
    private static final Set<String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JOSEObjectType f10417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10418b;
        public Set<String> c;
        public Map<String, Object> d;
        public Base64URL e;

        public PlainHeader a() {
            return new PlainHeader(this.f10417a, this.f10418b, this.c, this.d, this.e);
        }

        public a b(String str) {
            this.f10418b = str;
            return this;
        }

        public a c(Set<String> set) {
            this.c = set;
            return this;
        }

        public a d(String str, Object obj) {
            if (!PlainHeader.getRegisteredParameterNames().contains(str)) {
                if (this.d == null) {
                    this.d = new HashMap();
                }
                this.d.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a e(Base64URL base64URL) {
            this.e = base64URL;
            return this;
        }

        public a f(JOSEObjectType jOSEObjectType) {
            this.f10417a = jOSEObjectType;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public PlainHeader() {
        this(null, null, null, null, null);
    }

    public static Set<String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    public static PlainHeader parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    @Override // com.nimbusds.jose.Header
    public Algorithm getAlgorithm() {
        return Algorithm.NONE;
    }

    public PlainHeader(JOSEObjectType jOSEObjectType, String str, Set<String> set, Map<String, Object> map, Base64URL base64URL) {
        super(Algorithm.NONE, jOSEObjectType, str, set, map, base64URL);
    }

    public static PlainHeader parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        if (Header.parseAlgorithm(map) != Algorithm.NONE) {
            throw new ParseException("The algorithm \"alg\" header parameter must be \"none\"", 0);
        }
        a aVarE = new a().e(base64URL);
        for (String str : map.keySet()) {
            if (!"alg".equals(str)) {
                if ("typ".equals(str)) {
                    String strH = npd.h(map, str);
                    if (strH != null) {
                        aVarE = aVarE.f(new JOSEObjectType(strH));
                    }
                } else if ("cty".equals(str)) {
                    aVarE = aVarE.b(npd.h(map, str));
                } else if ("crit".equals(str)) {
                    List<String> listJ = npd.j(map, str);
                    if (listJ != null) {
                        aVarE = aVarE.c(new HashSet(listJ));
                    }
                } else {
                    aVarE = aVarE.d(str, map.get(str));
                }
            }
        }
        return aVarE.a();
    }

    public PlainHeader(PlainHeader plainHeader) {
        this(plainHeader.getType(), plainHeader.getContentType(), plainHeader.getCriticalParams(), plainHeader.getCustomParams(), plainHeader.getParsedBase64URL());
    }

    public static PlainHeader parse(String str) throws ParseException {
        return parse(str, (Base64URL) null);
    }

    public static PlainHeader parse(String str, Base64URL base64URL) throws ParseException {
        return parse(npd.m(str), base64URL);
    }

    public static PlainHeader parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
