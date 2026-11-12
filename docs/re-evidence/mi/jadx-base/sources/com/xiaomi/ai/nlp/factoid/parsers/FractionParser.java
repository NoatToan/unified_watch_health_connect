package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.g2a;
import defpackage.jlo;
import defpackage.m2h;
import defpackage.pr5;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class FractionParser extends RegexBasedParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11062a = Pattern.compile(jlo.c(Arrays.asList("(?<total><Number>)分之(?<parts><Number>)", "(?<symbParts><Number>)/(?<symbTotal><Number>)", "(?:百|千|万)分之(?<percent><Number>)", "(?<symbPercent><Number>)(?:%|‰)", "(?<half><Number>)半"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11063b = Collections.singletonList(EntityType.Number);

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "FractionParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Fraction;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11063b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11062a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d(SportDataTypeKt.DIMEN_TOTAL) != null) {
            h(z, pr5Var, "total and parts");
            return p(str, a8fVar, treeMap, SportDataTypeKt.DIMEN_TOTAL, "parts");
        }
        if (a8fVar.d("symbTotal") != null) {
            h(z, pr5Var, "symbolic total and parts");
            return p(str, a8fVar, treeMap, "symbTotal", "symbParts");
        }
        if (a8fVar.d("percent") != null) {
            h(z, pr5Var, "percent");
            return n(str, a8fVar, treeMap);
        }
        if (a8fVar.d("symbPercent") != null) {
            h(z, pr5Var, "symbolic percent");
            return o(str, a8fVar, treeMap);
        }
        if (a8fVar.d("half") != null) {
            h(z, pr5Var, "half");
            return m(str, a8fVar, treeMap);
        }
        h(z, pr5Var, "None");
        return null;
    }

    public final yb8 m(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("half")));
        int iB = b(a8fVar, "half", m2hVar);
        int iA = a(a8fVar, "half", m2hVar);
        if (1 == ((int) m2hVar.k())) {
            return new g2a(iB, iA, str.substring(iB, iA), 0.5d);
        }
        return null;
    }

    public final yb8 n(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap) {
        double d;
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("percent")));
        int iB = b(a8fVar, "percent", m2hVar);
        int iA = a(a8fVar, "percent", m2hVar);
        double dK = m2hVar.k();
        String strGroup = a8fVar.group();
        if (strGroup.startsWith("百")) {
            d = 100.0d;
        } else {
            d = strGroup.startsWith("千") ? 1000.0d : 10000.0d;
        }
        return new g2a(iB, iA, str.substring(iB, iA), dK / d);
    }

    public final yb8 o(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("symbPercent")));
        int iB = b(a8fVar, "symbPercent", m2hVar);
        int iA = a(a8fVar, "symbPercent", m2hVar);
        return new g2a(iB, iA, str.substring(iB, iA), m2hVar.k() / (a8fVar.group().endsWith("%") ? 100.0d : 1000.0d));
    }

    public final yb8 p(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2, String str3) {
        int iA;
        int i;
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str3)));
        m2h m2hVar2 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        double dK = m2hVar.k();
        double dK2 = m2hVar2.k();
        double d = dK2 != 0.0d ? dK / dK2 : 0.0d;
        if (str2.endsWith(SportDataTypeKt.DIMEN_TOTAL)) {
            int iB = b(a8fVar, str2, m2hVar2);
            iA = a(a8fVar, str3, m2hVar);
            i = iB;
        } else {
            int iB2 = b(a8fVar, str3, m2hVar);
            iA = a(a8fVar, str2, m2hVar2);
            i = iB2;
        }
        return new g2a(i, iA, str.substring(i, iA), d);
    }
}
