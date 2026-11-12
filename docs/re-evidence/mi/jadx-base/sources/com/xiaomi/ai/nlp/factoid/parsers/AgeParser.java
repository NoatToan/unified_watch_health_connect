package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.g2h;
import defpackage.jlo;
import defpackage.lw0;
import defpackage.pr5;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class AgeParser extends NumberBasedParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11050a = Pattern.compile(jlo.c(Arrays.asList("(?:大于|高于|超过|不低于)(?<greatThan1><Number>)岁半?", "(?<greatThan2><Number>)岁半?以上", "(?:小于|低于|不超过|不高于)(?<lessThan1><Number>)岁半?", "(?<lessThan2><Number>)岁半?以下", "(?<lowAge><Number>)岁?半?(?:到|至)(?<highAge><Number>)岁半?", "(?<concreteAge><Number>)岁半?"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11051b = Collections.singletonList(EntityType.Number);

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "AgeParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Age;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11051b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11050a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("greatThan1") != null) {
            h(z, pr5Var, "greatThan1");
            return s(str, a8fVar, treeMap, "greatThan1");
        }
        if (a8fVar.d("greatThan2") != null) {
            h(z, pr5Var, "greatThan2");
            return s(str, a8fVar, treeMap, "greatThan2");
        }
        if (a8fVar.d("lessThan1") != null) {
            h(z, pr5Var, "lessThan1");
            return t(str, a8fVar, treeMap, "lessThan1");
        }
        if (a8fVar.d("lessThan2") != null) {
            h(z, pr5Var, "lessThan2");
            return t(str, a8fVar, treeMap, "lessThan2");
        }
        if (a8fVar.d("lowAge") != null) {
            h(z, pr5Var, "lowAge and highAge");
            return u(str, a8fVar, treeMap, "lowAge", "highAge");
        }
        if (a8fVar.d("concreteAge") != null) {
            h(z, pr5Var, "concreteAge");
            return v(str, a8fVar, treeMap, "concreteAge");
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.NumberBasedParser
    public g2h m(int i, int i2, String str, double d, double d2, boolean z) {
        return new lw0(i, i2, str, d, d2, z);
    }

    public final yb8 s(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        return o(str, a8fVar, treeMap, str2);
    }

    public final yb8 t(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        return p(str, a8fVar, treeMap, str2);
    }

    public final yb8 u(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2, String str3) {
        return q(str, a8fVar, treeMap, str2, str3);
    }

    public final yb8 v(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        return n(str, a8fVar, treeMap, str2);
    }
}
