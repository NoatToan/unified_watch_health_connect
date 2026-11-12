package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.hbc;
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
public class HourParser extends DateTimeUnitParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11064a = Pattern.compile(jlo.c(Arrays.asList("(?<numberHour1><Number>)(?:点|时)(?:钟|整)?半?", "(?<numberHour2><Number>)\\:(?<numberMinute><Number>)(?<numberSecond>\\:<Number>)?(?<partOfDay>[aApP][mM])?", "(?:过去|未来|之前|之后)(?<pastFutureHours><Number>|几)个?(?:小时|钟头)", "过(?<hourOffset1><Number>|半)个?半?(?:小时|钟头)", "(?<hourOffset2><Number>|半)个?半?(?:小时|钟头)(?:前|之前|以前|后|之后|以后|过后)", "(?<hourDuration><Number>|半)个?半?(?:小时|钟头)(?:之内|内)?", "(?<numberHour3><Number>)"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11065b = Collections.singletonList(EntityType.Number);

    public final yb8 A(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return s(str, a8fVar, treeMap, dq5Var, "hourDuration", GrainType.HOUR);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "HourParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Hour;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11065b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11064a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("numberHour1") != null) {
            h(z, pr5Var, "numberHour1");
            return y(str, a8fVar, treeMap, dq5Var, "numberHour1");
        }
        if (a8fVar.d("numberHour2") != null) {
            h(z, pr5Var, "numberHour2");
            return y(str, a8fVar, treeMap, dq5Var, "numberHour2");
        }
        if (a8fVar.d("numberHour3") != null) {
            h(z, pr5Var, "numberHour3");
            return y(str, a8fVar, treeMap, dq5Var, "numberHour3");
        }
        if (a8fVar.d("pastFutureHours") != null) {
            h(z, pr5Var, "pastFutureHours");
            return z(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("hourOffset1") != null) {
            h(z, pr5Var, "hourOffset1");
            return x(str, a8fVar, treeMap, dq5Var, "hourOffset1");
        }
        if (a8fVar.d("hourOffset2") != null) {
            h(z, pr5Var, "hourOffset2");
            return x(str, a8fVar, treeMap, dq5Var, "hourOffset2");
        }
        if (a8fVar.d("hourDuration") != null) {
            h(z, pr5Var, "hourDuration");
            return A(str, a8fVar, treeMap, dq5Var);
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 m(dq5 dq5Var, int i, int i2) {
        return dq5Var.w(i).x(i2 * 30);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 n(dq5 dq5Var, int i, int i2) {
        return dq5Var.w(i).x(i2 * 30);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 o(dq5 dq5Var, int i) {
        return dq5Var.w(i).J(59).L(59);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 p(dq5 dq5Var, int i) {
        return dq5Var.w(i).J(0).L(0);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 q(String str, a8f a8fVar, int i, dq5 dq5Var, dq5 dq5Var2) {
        int iEnd = (a8fVar.end() + i) - a8fVar.start();
        return new hbc(i, iEnd, str.substring(i, iEnd), dq5Var, dq5Var2);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 r(String str, a8f a8fVar, String str2, m2h m2hVar, dq5 dq5Var, dq5 dq5Var2) {
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        return new hbc(iB, iA, str.substring(iB, iA), dq5Var, dq5Var2);
    }

    public final yb8 x(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2) {
        return u(str, a8fVar, treeMap, dq5Var, str2, GrainType.DATETIME);
    }

    public final yb8 y(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2) {
        int iB;
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        int iD = m2hVar.d();
        int iB2 = m2hVar.b() + (a8fVar.end() - a8fVar.a(str2));
        String strE = m2hVar.e();
        int iK = 0;
        if (str2.equals("numberHour3")) {
            int iIndexOf = strE.indexOf("点");
            if (iIndexOf <= 0) {
                return null;
            }
            int length = iB2 - ((strE.length() - iIndexOf) - 1);
            dq5 dq5VarM = dq5Var.M((int) m2hVar.k(), 0, 0);
            hbc hbcVar = new hbc(iD, length, str.substring(iD, length), dq5VarM, dq5VarM);
            hbcVar.q(DateType.DATETIME);
            hbcVar.t(GrainType.DATETIME);
            hbcVar.y(TimeSubType.CONCRETE);
            return hbcVar;
        }
        int iK2 = (int) m2hVar.k();
        if (iK2 < 0 || iK2 > 24) {
            return null;
        }
        int i = a8fVar.group().endsWith("半") ? 30 : 0;
        if (a8fVar.d("numberMinute") != null) {
            m2h m2hVar2 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("numberMinute")));
            int iK3 = (int) m2hVar2.k();
            if (iK3 < 1 || iK3 > 59) {
                return null;
            }
            iB2 = m2hVar2.b() + (a8fVar.end() - a8fVar.a("numberMinute"));
            i = iK3;
        }
        if (a8fVar.d("numberSecond") != null) {
            m2h m2hVar3 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("numberSecond")));
            iK = (int) m2hVar3.k();
            if (iK < 1 || iK > 59) {
                return null;
            }
            iB = m2hVar3.b() + (a8fVar.end() - a8fVar.a("numberSecond"));
        } else {
            iB = iB2;
        }
        String strD = a8fVar.d("partOfDay");
        if (strD != null && strD.toLowerCase().equals("pm") && iK2 < 12) {
            iK2 += 12;
        }
        dq5 dq5VarM2 = dq5Var.M(iK2, i, iK);
        hbc hbcVar2 = new hbc(iD, iB, str.substring(iD, iB), dq5VarM2, dq5VarM2);
        hbcVar2.q(DateType.DATETIME);
        hbcVar2.t(GrainType.DATETIME);
        hbcVar2.y(TimeSubType.CONCRETE);
        return hbcVar2;
    }

    public final yb8 z(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return v(str, a8fVar, treeMap, dq5Var, "pastFutureHours", GrainType.HOUR);
    }
}
