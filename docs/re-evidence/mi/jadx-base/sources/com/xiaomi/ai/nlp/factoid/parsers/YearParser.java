package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.jlo;
import defpackage.kzr;
import defpackage.m2h;
import defpackage.pr5;
import defpackage.vq5;
import defpackage.y4f;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class YearParser extends DateTimeUnitParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11091a = Pattern.compile(jlo.c(Arrays.asList("(?<yearList>今年|去年|明年|前年|后年|大前年|大后年|大大前年|大大后年)", "(?<decade><Number>)年代", "(?<numberYear><Number>)(?:年|版)(?:前|之前|以前|后|之后|以后|过后)?", "最近(?<recentYears><Number>|几|半)年", "(?:过去|未来|之前|之后)(?<pastFutureYears><Number>|几|半)年", "(?:上|前|下|后)(?<lastNextYears><Number>)年", "(?:上|前|下|后)(?<startEndHalfYears>半)年", "年(?<partOfYear>初(?!(夏|伏|几|见))|中(?!(国|央|共|秋))|末|尾|底)", "(?<pureNumber><Number>)"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, Integer> f11092b;
    public static List<EntityType> c;

    static {
        HashMap map = new HashMap();
        f11092b = map;
        map.put("今年", 0);
        f11092b.put("去年", -1);
        f11092b.put("明年", 1);
        f11092b.put("前年", -2);
        f11092b.put("后年", 2);
        f11092b.put("大前年", -3);
        f11092b.put("大后年", 3);
        f11092b.put("大大前年", -4);
        f11092b.put("大大后年", 4);
        c = Collections.singletonList(EntityType.Number);
    }

    public final yb8 A(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return t(str, a8fVar, treeMap, dq5Var, "lastNextYears", GrainType.YEAR);
    }

    public final yb8 B(String str, a8f a8fVar, Map<Integer, yb8> map, dq5 dq5Var) {
        int i;
        int i2;
        m2h m2hVar = (m2h) map.get(Integer.valueOf(a8fVar.f("numberYear")));
        int iK = (int) m2hVar.k();
        String strE = m2hVar.e();
        String strGroup = a8fVar.group();
        if (dq5.r(iK, strE)) {
            int iT = dq5.t(iK);
            if (strGroup.contains("后")) {
                i2 = Integer.MAX_VALUE;
            } else if (strGroup.contains("前")) {
                i2 = iT;
                iT = Integer.MIN_VALUE;
            } else {
                i2 = iT;
            }
            return r(str, a8fVar, "numberYear", m2hVar, y(iT), x(i2));
        }
        if (strGroup.contains("后")) {
            i = iK;
        } else {
            i = strGroup.contains("前") ? -iK : 0;
        }
        if (i == 0) {
            vq5 vq5VarR = r(str, a8fVar, "numberYear", m2hVar, dq5Var, dq5Var.B(iK));
            vq5VarR.q(DateType.DURATION);
            vq5VarR.t(GrainType.YEAR);
            return vq5VarR;
        }
        vq5 vq5VarR2 = r(str, a8fVar, "numberYear", m2hVar, dq5Var.B(i), dq5Var.B(i));
        vq5VarR2.q(DateType.DATETIME);
        vq5VarR2.t(GrainType.DATETIME);
        vq5VarR2.y(TimeSubType.OFFSET);
        return vq5VarR2;
    }

    public final yb8 C(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        dq5 dq5Var2;
        dq5 dq5Var3;
        int iD = d(a8fVar.start(), treeMap);
        String strGroup = a8fVar.group();
        int iQ = dq5Var.q();
        if (strGroup.endsWith("初")) {
            dq5Var2 = new dq5(iQ, 1, 1, 0, 0, 0);
            dq5Var3 = new dq5(iQ, 3, 31, 23, 59, 59);
        } else if (strGroup.endsWith("中")) {
            dq5Var2 = new dq5(iQ, 5, 1, 0, 0, 0);
            dq5Var3 = new dq5(iQ, 7, 31, 23, 59, 59);
        } else {
            dq5Var2 = new dq5(iQ, 11, 1, 0, 0, 0);
            dq5Var3 = new dq5(iQ, 12, 31, 23, 59, 59);
        }
        return q(str, a8fVar, iD, dq5Var2, dq5Var3);
    }

    public final yb8 D(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarV = v(str, a8fVar, treeMap, dq5Var, "pastFutureYears", GrainType.YEAR);
        if (vq5VarV.n().q() < dq5Var.q()) {
            vq5VarV.s(dq5Var.N());
        } else {
            vq5VarV.x(dq5Var.O());
        }
        return vq5VarV;
    }

    public final yb8 E(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("pureNumber")));
        int iK = (int) m2hVar.k();
        String strE = m2hVar.e();
        int iB = b(a8fVar, "pureNumber", m2hVar);
        int iA = a(a8fVar, "pureNumber", m2hVar);
        if (strE.endsWith("五一") || strE.endsWith("六一") || strE.endsWith("八一")) {
            iK /= 100;
            iA -= 2;
        } else if (strE.endsWith("十一")) {
            iK /= 10;
            iA--;
        }
        int i = iA;
        if (iK <= 1950 || iK >= 2050) {
            return null;
        }
        return new kzr(iB, i, str.substring(iB, i), y(iK), x(iK));
    }

    public final yb8 F(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return w(str, a8fVar, treeMap, dq5Var, "recentYears");
    }

    public final yb8 G(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        dq5 dq5Var2;
        dq5 dq5Var3;
        int iD = d(a8fVar.start(), treeMap);
        String strGroup = a8fVar.group();
        int iQ = dq5Var.q();
        if (strGroup.startsWith("上") || strGroup.startsWith("前")) {
            dq5Var2 = new dq5(iQ, 1, 1, 0, 0, 0);
            dq5Var3 = new dq5(iQ, 6, 30, 23, 59, 59);
        } else {
            dq5Var2 = new dq5(iQ, 7, 1, 0, 0, 0);
            dq5Var3 = new dq5(iQ, 12, 31, 23, 59, 59);
        }
        return q(str, a8fVar, iD, dq5Var2, dq5Var3);
    }

    public final yb8 H(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        int iQ = dq5Var.q() + ((Integer) y4f.a(f11092b, a8fVar.d("yearList"), 0)).intValue();
        vq5 vq5VarQ = q(str, a8fVar, d(a8fVar.start(), treeMap), y(iQ), x(iQ));
        vq5VarQ.w(true);
        return vq5VarQ;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "YearParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Year;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return c;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11091a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("decade") != null) {
            h(z, pr5Var, "decade");
            return z(str, a8fVar, treeMap);
        }
        if (a8fVar.d("yearList") != null) {
            h(z, pr5Var, "yearList");
            return H(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("numberYear") != null) {
            h(z, pr5Var, "numberYear");
            return B(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("recentYears") != null) {
            h(z, pr5Var, "recentYears");
            return F(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("pastFutureYears") != null) {
            h(z, pr5Var, "pastFutureYears");
            return D(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("lastNextYears") != null) {
            h(z, pr5Var, "lastNextYears");
            return A(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("pureNumber") != null) {
            h(z, pr5Var, "pureNumber");
            return E(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("startEndHalfYears") != null) {
            h(z, pr5Var, "startEndHalfYears");
            return G(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("partOfYear") != null) {
            h(z, pr5Var, "partOfYear");
            return C(str, a8fVar, treeMap, dq5Var);
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 m(dq5 dq5Var, int i, int i2) {
        return x(dq5Var.q() + i);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 n(dq5 dq5Var, int i, int i2) {
        return y(dq5Var.q() + i);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 o(dq5 dq5Var, int i) {
        return x(dq5Var.q() + i);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 p(dq5 dq5Var, int i) {
        return y(dq5Var.q() + i);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 q(String str, a8f a8fVar, int i, dq5 dq5Var, dq5 dq5Var2) {
        int iEnd = (a8fVar.end() + i) - a8fVar.start();
        return new kzr(i, iEnd, str.substring(i, iEnd), dq5Var, dq5Var2);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 r(String str, a8f a8fVar, String str2, m2h m2hVar, dq5 dq5Var, dq5 dq5Var2) {
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        return new kzr(iB, iA, str.substring(iB, iA), dq5Var, dq5Var2);
    }

    public final dq5 x(int i) {
        return new dq5(i, 12, 31, 23, 59, 59);
    }

    public final dq5 y(int i) {
        return new dq5(i, 1, 1, 0, 0, 0);
    }

    public final yb8 z(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("decade")));
        int iK = (int) m2hVar.k();
        if (iK >= 100 || iK % 10 != 0) {
            return null;
        }
        int i = iK > 20 ? iK + 1900 : iK + 200;
        return r(str, a8fVar, "decade", m2hVar, y(i), x(i + 9));
    }
}
