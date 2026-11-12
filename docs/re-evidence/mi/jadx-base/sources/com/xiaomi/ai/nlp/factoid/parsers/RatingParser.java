package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.g2h;
import defpackage.jlo;
import defpackage.pr5;
import defpackage.xbj;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class RatingParser extends NumberBasedParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11081a = Pattern.compile(jlo.c(Arrays.asList("(?:大于|高于|超过|不低于)(?<greatThan1><Number>)分", "(?<greatThan2><Number>)分以上", "(?<=评分|分数)(?:大于|高于|超过|不低于)(?<greatThan3><Number>)", "(?<=评分|分数)在?(?<greatThan4><Number>)以上", "(?:小于|低于|不超过|不高于)(?<lessThan1><Number>)分", "(?<lessThan2><Number>)分以下", "(?<=评分|分数)(?:小于|低于|不超过|不高于)(?<lessThan3><Number>)", "(?<=评分|分数)在?(?<lessThan4><Number>)以下", "(?<lowRating><Number>)分?(?:到|至)(?<highRating><Number>)分", "(?<concreteRating><Number>)分"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11082b = Collections.singletonList(EntityType.Number);

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "RatingParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Rating;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11082b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11081a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("greatThan1") != null) {
            h(z, pr5Var, "greatThan1");
            return t(str, a8fVar, treeMap, "greatThan1");
        }
        if (a8fVar.d("greatThan2") != null) {
            h(z, pr5Var, "greatThan2");
            return t(str, a8fVar, treeMap, "greatThan2");
        }
        if (a8fVar.d("greatThan3") != null) {
            h(z, pr5Var, "greatThan3");
            return t(str, a8fVar, treeMap, "greatThan3");
        }
        if (a8fVar.d("greatThan4") != null) {
            h(z, pr5Var, "greatThan4");
            return t(str, a8fVar, treeMap, "greatThan4");
        }
        if (a8fVar.d("lessThan1") != null) {
            h(z, pr5Var, "lessThan1");
            return u(str, a8fVar, treeMap, "lessThan1");
        }
        if (a8fVar.d("lessThan2") != null) {
            h(z, pr5Var, "lessThan2");
            return u(str, a8fVar, treeMap, "lessThan2");
        }
        if (a8fVar.d("lessThan3") != null) {
            h(z, pr5Var, "lessThan3");
            return u(str, a8fVar, treeMap, "lessThan3");
        }
        if (a8fVar.d("lessThan4") != null) {
            h(z, pr5Var, "lessThan4");
            return u(str, a8fVar, treeMap, "lessThan4");
        }
        if (a8fVar.d("lowRating") != null) {
            h(z, pr5Var, "lowRating and highRating");
            return v(str, a8fVar, treeMap, "lowRating", "highRating");
        }
        if (a8fVar.d("concreteRating") != null) {
            h(z, pr5Var, "concreteRating");
            return s(str, a8fVar, treeMap, "concreteRating");
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.NumberBasedParser
    public g2h m(int i, int i2, String str, double d, double d2, boolean z) {
        return new xbj(i, i2, str, d, d2, z);
    }

    public final yb8 s(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        return n(str, a8fVar, treeMap, str2);
    }

    public final yb8 t(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        return o(str, a8fVar, treeMap, str2);
    }

    public final yb8 u(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        return p(str, a8fVar, treeMap, str2);
    }

    public final yb8 v(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2, String str3) {
        return q(str, a8fVar, treeMap, str2, str3);
    }
}
