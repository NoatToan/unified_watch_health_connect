package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.g2h;
import defpackage.h3p;
import defpackage.jlo;
import defpackage.m2h;
import defpackage.pr5;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class TemperatureParser extends NumberBasedParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11087a = Pattern.compile(jlo.c(Arrays.asList("(?<type1>摄氏|华氏)?(?<negative1><Number>下|负|负的)?(?<numberTemp1><Number>)度", "(?<negative2><Number>下|负|负的)?(?<type2>摄氏|华氏)?(?<numberTemp2><Number>)度", "(?<negative3><Number>下|负|负的)?(?<numberTemp3><Number>)(?<type3>摄氏|华氏)度", "(?<negative4><Number>下|负|负的)?(?<numberTemp4><Number>)°(?<type4>C|F)?"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11088b = Collections.singletonList(EntityType.Number);

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "TemperatureParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Temperature;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11088b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11087a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("numberTemp1") != null) {
            h(z, pr5Var, "numberTemp1");
            return s(str, a8fVar, treeMap, "numberTemp1", "type1", "negative1");
        }
        if (a8fVar.d("numberTemp2") != null) {
            h(z, pr5Var, "numberTemp2");
            return s(str, a8fVar, treeMap, "numberTemp2", "type2", "negative2");
        }
        if (a8fVar.d("numberTemp3") != null) {
            h(z, pr5Var, "numberTemp3");
            return s(str, a8fVar, treeMap, "numberTemp3", "type3", "negative3");
        }
        if (a8fVar.d("numberTemp4") != null) {
            h(z, pr5Var, "numberTemp4");
            return s(str, a8fVar, treeMap, "numberTemp4", "type4", "negative4");
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.NumberBasedParser
    public g2h m(int i, int i2, String str, double d, double d2, boolean z) {
        return new h3p(i, i2, str, d);
    }

    public final g2h s(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2, String str3, String str4) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        double dK = m2hVar.k();
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        String strD = a8fVar.d(str3);
        String str5 = "C";
        if (strD != null && !strD.equals("摄氏") && !strD.equals("C")) {
            str5 = "F";
        }
        String strD2 = a8fVar.d(str4);
        if (strD2 != null) {
            dK *= -1.0d;
            if (strD2.startsWith("<Number>")) {
                iB = b(a8fVar, str4, treeMap.get(Integer.valueOf(a8fVar.f(str4))));
            }
        }
        int i = iB;
        h3p h3pVar = new h3p(i, iA, str.substring(i, iA), dK);
        h3pVar.p(str5);
        return h3pVar;
    }
}
