package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.jlo;
import defpackage.m2h;
import defpackage.pr5;
import defpackage.vq5;
import defpackage.x7g;
import defpackage.y4f;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class MonthParser extends DateTimeUnitParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11074a = Pattern.compile(jlo.c(Arrays.asList("(?<monthList>本月|这个月|上月|上个月|下月|下个月)", "(?<numberMonth><Number>|元)月份?", "第?(?<timeSeason><Number>)季度", "最近(?<recentMonths><Number>|几|半)个?月", "(?:过去|未来|之前|之后|今后)的?(?<pastFutureMonths><Number>|几|半)个月", "(?:上|前|下|后)(?<lastNextMonths><Number>)个月", "(?<monthOffset><Number>|半)个半?月(前|之前|以前|后|之后|以后|过后)"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, Integer> f11075b;
    public static List<EntityType> c;

    static {
        HashMap map = new HashMap();
        f11075b = map;
        map.put("本月", 0);
        f11075b.put("这个月", 0);
        f11075b.put("上月", -1);
        f11075b.put("上个月", -1);
        f11075b.put("下月", 1);
        f11075b.put("下个月", 1);
        c = Collections.singletonList(EntityType.Number);
    }

    public final yb8 A(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        int iIntValue = ((Integer) y4f.a(f11075b, a8fVar.d("monthList"), 0)).intValue();
        vq5 vq5VarQ = q(str, a8fVar, d(a8fVar.start(), treeMap), p(dq5Var, iIntValue), o(dq5Var, iIntValue));
        vq5VarQ.w(true);
        return vq5VarQ;
    }

    public final yb8 B(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return u(str, a8fVar, treeMap, dq5Var, "monthOffset", GrainType.DATE);
    }

    public final yb8 C(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        int iF = a8fVar.f("numberMonth");
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(iF));
        if (m2hVar == null) {
            int iD = d(iF, treeMap);
            if (str.charAt(iD) == 20803) {
                return q(str, a8fVar, iD, y(dq5Var, 1), x(dq5Var, 1));
            }
            return null;
        }
        int iK = (int) m2hVar.k();
        if (iK < 1 || iK > 12) {
            return null;
        }
        return r(str, a8fVar, "numberMonth", m2hVar, y(dq5Var, iK), x(dq5Var, iK));
    }

    public final yb8 D(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarV = v(str, a8fVar, treeMap, dq5Var, "pastFutureMonths", GrainType.MONTH);
        if (vq5VarV.n().i() < dq5Var.O().i()) {
            vq5VarV.s(vq5VarV.l().v(-1).N());
        } else {
            vq5VarV.x(vq5VarV.n().v(1).O());
        }
        return vq5VarV;
    }

    public final yb8 E(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return w(str, a8fVar, treeMap, dq5Var, "recentMonths");
    }

    public final yb8 F(String str, a8f a8fVar, Map<Integer, yb8> map, dq5 dq5Var) {
        m2h m2hVar = (m2h) map.get(Integer.valueOf(a8fVar.f("timeSeason")));
        int iK = (int) m2hVar.k();
        if (iK < 1 || iK > 4) {
            return null;
        }
        return r(str, a8fVar, "timeSeason", m2hVar, y(dq5Var, ((iK - 1) * 3) + 1), x(dq5Var, iK * 3));
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "MonthParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Month;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return c;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11074a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("monthList") != null) {
            h(z, pr5Var, "monthList");
            return A(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("numberMonth") != null) {
            h(z, pr5Var, "numberMonth");
            return C(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("timeSeason") != null) {
            h(z, pr5Var, "timeSeason");
            return F(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("recentMonths") != null) {
            h(z, pr5Var, "recentMonths");
            return E(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("pastFutureMonths") != null) {
            h(z, pr5Var, "pastFutureMonths");
            return D(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("lastNextMonths") != null) {
            h(z, pr5Var, "lastNextMonths");
            return z(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("monthOffset") != null) {
            h(z, pr5Var, "monthOffset");
            return B(str, a8fVar, treeMap, dq5Var);
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 m(dq5 dq5Var, int i, int i2) {
        return dq5Var.v(i * 30).v(i2 * 15).N();
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 n(dq5 dq5Var, int i, int i2) {
        return dq5Var.v(i * 30).v(i2 * 15).O();
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 o(dq5 dq5Var, int i) {
        return dq5Var.y(i).H().N();
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 p(dq5 dq5Var, int i) {
        return dq5Var.y(i).I().O();
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 q(String str, a8f a8fVar, int i, dq5 dq5Var, dq5 dq5Var2) {
        int iEnd = (a8fVar.end() + i) - a8fVar.start();
        return new x7g(i, iEnd, str.substring(i, iEnd), dq5Var, dq5Var2);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 r(String str, a8f a8fVar, String str2, m2h m2hVar, dq5 dq5Var, dq5 dq5Var2) {
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        return new x7g(iB, iA, str.substring(iB, iA), dq5Var, dq5Var2);
    }

    public final dq5 x(dq5 dq5Var, int i) {
        return dq5Var.K(i).H().N();
    }

    public final dq5 y(dq5 dq5Var, int i) {
        return dq5Var.K(i).I().O();
    }

    public final yb8 z(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return t(str, a8fVar, treeMap, dq5Var, "lastNextMonths", GrainType.MONTH);
    }
}
