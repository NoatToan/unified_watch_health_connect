package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.i55;
import defpackage.jlo;
import defpackage.m2h;
import defpackage.pr5;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class CurrencyParser extends RegexBasedParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11052a = Pattern.compile(jlo.c(Arrays.asList("(?<yuan1><Number>)(?:元|块)(?<jiao1><Number>)(?:角|毛)(?<fen1><Number>)分?", "(?<yuan2><Number>)(?:元|块)(?<fen2><Number>)分", "(?<yuan3><Number>)(?:元|块)(?<jiao3><Number>)(?:角|毛)?", "(?<yuan4><Number>)(?:元|块)", "(?<jiao5><Number>)(?:角|毛)(?<fen5><Number>)分?", "(?<jiao6><Number>)(?:角|毛)", "(?<fen7><Number>)分"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11053b = Collections.singletonList(EntityType.Number);

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "CurrencyParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Currency;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11053b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11052a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("yuan1") != null) {
            h(z, pr5Var, "yuanJiaoFen");
            return m(str, a8fVar, treeMap, "yuan1", "jiao1", "fen1");
        }
        if (a8fVar.d("yuan2") != null) {
            h(z, pr5Var, "yuanFen");
            return m(str, a8fVar, treeMap, "yuan2", null, "fen2");
        }
        if (a8fVar.d("yuan3") != null) {
            h(z, pr5Var, "yuanJiao");
            return m(str, a8fVar, treeMap, "yuan3", "jiao3", null);
        }
        if (a8fVar.d("yuan4") != null) {
            h(z, pr5Var, "yuan");
            return m(str, a8fVar, treeMap, "yuan4", null, null);
        }
        if (a8fVar.d("jiao5") != null) {
            h(z, pr5Var, "jiaoFen");
            return m(str, a8fVar, treeMap, null, "jiao5", "fen5");
        }
        if (a8fVar.d("jiao6") != null) {
            h(z, pr5Var, "jiao");
            return m(str, a8fVar, treeMap, null, "jiao6", null);
        }
        if (a8fVar.d("fen7") != null) {
            h(z, pr5Var, "fen");
            return m(str, a8fVar, treeMap, null, null, "fen7");
        }
        h(z, pr5Var, "None");
        return null;
    }

    public final yb8 m(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2, String str3, String str4) {
        int iB;
        double dK;
        double dK2;
        int length = str.length();
        double dK3 = 0.0d;
        if (str2 != null) {
            m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
            dK = m2hVar.k();
            iB = b(a8fVar, str2, m2hVar);
            length = a(a8fVar, str2, m2hVar);
        } else {
            iB = -1;
            dK = 0.0d;
        }
        if (str3 != null) {
            m2h m2hVar2 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str3)));
            dK2 = m2hVar2.k();
            if (iB == -1) {
                iB = b(a8fVar, str3, m2hVar2);
            }
            length = a(a8fVar, str3, m2hVar2);
        } else {
            dK2 = 0.0d;
        }
        if (str4 != null) {
            m2h m2hVar3 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str4)));
            dK3 = m2hVar3.k();
            if (iB == -1) {
                iB = b(a8fVar, str4, m2hVar3);
            }
            length = a(a8fVar, str4, m2hVar3);
        }
        int i = length;
        int i2 = iB;
        return new i55(i2, i, str.substring(i2, i), dK + (dK2 * 0.1d) + (dK3 * 0.01d));
    }
}
