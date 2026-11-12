package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.g2h;
import defpackage.hfe;
import defpackage.jlo;
import defpackage.pr5;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class LevelParser extends NumberBasedParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11066a = Pattern.compile(jlo.c(Arrays.asList("第?(?<concreteLevel><Number>)(?:级|档)"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11067b = Collections.singletonList(EntityType.Number);

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "LevelParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Level;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11067b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11066a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("concreteLevel") != null) {
            h(z, pr5Var, "concreteLevel");
            return s(str, a8fVar, treeMap, "concreteLevel");
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.NumberBasedParser
    public g2h m(int i, int i2, String str, double d, double d2, boolean z) {
        return new hfe(i, i2, str, d);
    }

    public final yb8 s(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        return n(str, a8fVar, treeMap, str2);
    }
}
