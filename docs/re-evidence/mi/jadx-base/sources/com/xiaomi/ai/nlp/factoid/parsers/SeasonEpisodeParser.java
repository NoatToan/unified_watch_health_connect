package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.SeasonEpisodeEntity;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.g2h;
import defpackage.jlo;
import defpackage.m2h;
import defpackage.pr5;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class SeasonEpisodeParser extends NumberBasedParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11083a = Pattern.compile(jlo.c(Arrays.asList("(?:最后|最新|倒数第)(?<lastEpisode><Number>)(?:集|期|辑|回|篇|章|课|讲)", "(?:最后|最新|倒数第)(?<lastSeason><Number>)(?:季|部|版|册|卷)", "第?(?<concreteEpisode><Number>)(?:集|期|辑|回|篇|章|课|讲)", "第?(?<concreteSeason><Number>)(?:季|部|版|册|卷)", "卷(?<concreteSeason2><Number>)"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11084b = Collections.singletonList(EntityType.Number);

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "SeasonEpisodeParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.SeasonEpisode;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11084b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11083a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("lastEpisode") != null) {
            h(z, pr5Var, "lastEpisode");
            return v(str, a8fVar, treeMap, "lastEpisode");
        }
        if (a8fVar.d("lastSeason") != null) {
            h(z, pr5Var, "lastSeason");
            return w(str, a8fVar, treeMap, "lastSeason");
        }
        if (a8fVar.d("concreteEpisode") != null) {
            h(z, pr5Var, "concreteEpisode");
            return s(str, a8fVar, treeMap, "concreteEpisode");
        }
        if (a8fVar.d("concreteSeason") != null) {
            h(z, pr5Var, "concreteSeason");
            return t(str, a8fVar, treeMap, "concreteSeason");
        }
        if (a8fVar.d("concreteSeason2") != null) {
            h(z, pr5Var, "concreteSeason2");
            return t(str, a8fVar, treeMap, "concreteSeason2");
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.NumberBasedParser
    public g2h m(int i, int i2, String str, double d, double d2, boolean z) {
        return new SeasonEpisodeEntity(i, i2, str, d);
    }

    public final yb8 s(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        SeasonEpisodeEntity seasonEpisodeEntity = (SeasonEpisodeEntity) n(str, a8fVar, treeMap, str2);
        seasonEpisodeEntity.p(SeasonEpisodeEntity.Type.Episode);
        return seasonEpisodeEntity;
    }

    public final yb8 t(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        SeasonEpisodeEntity seasonEpisodeEntity = (SeasonEpisodeEntity) n(str, a8fVar, treeMap, str2);
        seasonEpisodeEntity.p(SeasonEpisodeEntity.Type.Season);
        return seasonEpisodeEntity;
    }

    public final SeasonEpisodeEntity u(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        int iK = (int) m2hVar.k();
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        return new SeasonEpisodeEntity(iB, iA, str.substring(iB, iA), iK * (-1));
    }

    public final yb8 v(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        SeasonEpisodeEntity seasonEpisodeEntityU = u(str, a8fVar, treeMap, str2);
        seasonEpisodeEntityU.p(SeasonEpisodeEntity.Type.Episode);
        return seasonEpisodeEntityU;
    }

    public final yb8 w(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        SeasonEpisodeEntity seasonEpisodeEntityU = u(str, a8fVar, treeMap, str2);
        seasonEpisodeEntityU.p(SeasonEpisodeEntity.Type.Season);
        return seasonEpisodeEntityU;
    }
}
