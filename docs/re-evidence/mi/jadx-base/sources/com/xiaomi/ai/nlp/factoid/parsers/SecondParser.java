package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import defpackage.a8f;
import defpackage.bql;
import defpackage.dq5;
import defpackage.jlo;
import defpackage.m2h;
import defpackage.pr5;
import defpackage.vq5;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class SecondParser extends DateTimeUnitParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11085a = Pattern.compile(jlo.c(Arrays.asList("(?:过去|未来|之前|之后)(?<pastFutureSeconds><Number>|几)秒钟?", "过(?<secondOffset1><Number>)秒钟?", "(?<secondOffset2><Number>)秒钟?(?:前|之前|以前|后|之后|以后|过后)", "(?<secondDuration><Number>)秒钟?(?:之内|内)?", "(?<now>当前|现在|此时此刻|此时|此刻|这会儿)"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11086b = Collections.singletonList(EntityType.Number);

    public final yb8 A(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2) {
        return u(str, a8fVar, treeMap, dq5Var, str2, GrainType.DATETIME);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "SecondParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Second;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11086b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11085a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("pastFutureSeconds") != null) {
            h(z, pr5Var, "pastFutureSeconds");
            return y(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("secondOffset1") != null) {
            h(z, pr5Var, "secondOffset1");
            return A(str, a8fVar, treeMap, dq5Var, "secondOffset1");
        }
        if (a8fVar.d("secondOffset2") != null) {
            h(z, pr5Var, "secondOffset2");
            return A(str, a8fVar, treeMap, dq5Var, "secondOffset2");
        }
        if (a8fVar.d("secondDuration") != null) {
            h(z, pr5Var, "secondDuration");
            return z(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("now") != null) {
            h(z, pr5Var, "now");
            return x(str, a8fVar, treeMap, dq5Var);
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 m(dq5 dq5Var, int i, int i2) {
        return dq5Var.z(i);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 n(dq5 dq5Var, int i, int i2) {
        return dq5Var.z(i);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 o(dq5 dq5Var, int i) {
        return dq5Var.z(i);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 p(dq5 dq5Var, int i) {
        return dq5Var.z(i);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 q(String str, a8f a8fVar, int i, dq5 dq5Var, dq5 dq5Var2) {
        int iEnd = (a8fVar.end() + i) - a8fVar.start();
        return new bql(i, iEnd, str.substring(i, iEnd), dq5Var, dq5Var2);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 r(String str, a8f a8fVar, String str2, m2h m2hVar, dq5 dq5Var, dq5 dq5Var2) {
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        return new bql(iB, iA, str.substring(iB, iA), dq5Var, dq5Var2);
    }

    public final yb8 x(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarQ = q(str, a8fVar, d(a8fVar.start(), treeMap), dq5Var, dq5Var);
        vq5VarQ.q(DateType.DATETIME);
        vq5VarQ.t(GrainType.DATETIME);
        vq5VarQ.y(TimeSubType.CONCRETE);
        vq5VarQ.w(true);
        return vq5VarQ;
    }

    public final yb8 y(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return v(str, a8fVar, treeMap, dq5Var, "pastFutureSeconds", GrainType.SECOND);
    }

    public final yb8 z(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        bql bqlVar = (bql) s(str, a8fVar, treeMap, dq5Var, "secondDuration", GrainType.SECOND);
        bqlVar.A((int) ((m2h) treeMap.get(Integer.valueOf(a8fVar.f("secondDuration")))).k());
        bqlVar.w(false);
        return bqlVar;
    }
}
