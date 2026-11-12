package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DayType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import defpackage.a8f;
import defpackage.cr5;
import defpackage.dq5;
import defpackage.jlo;
import defpackage.ljh;
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
public class DayParser extends DateTimeUnitParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11058a = Pattern.compile(jlo.c(Arrays.asList("(?<numberDay1><Number>)(?:日|号)", "(?<=<Number>月)(?<numberDay2><Number>)", "(?<dayList>今天|今日|今儿个|今儿|明天|明日|明儿个|明儿|昨天|昨日|昨儿个|昨儿|前天|后天|大前天|大大前天|大后天|大大后天|明天的后天)", "(?<dayOffset><Number>)(?:天|日)半?(前|之前|以前|后|之后|以后|过后)", "(?<partOfDay>早上|早晨|晨间|下午|晚上|中午|午间|上午|傍晚|黄昏|凌晨|半夜|夜间|夜晚)", "(?<abbrDayPart>今早上|今早|明早上|明早|今晚上|今晚|明晚上|明晚|昨晚上|昨晚)", "(?<monthLastDay>这个月底|这月底|本月底|月底|这个月末|这月末|本月末|月末|这个月的最后一天|这个月最后一天|本月的最后一天|本月最后一天)", "(?:最近|这|近)(?<recentDays><Number>|几)(?:天|日)", "(?:过去|未来|之前|之后|今后)的?(?<pastFutureDays><Number>|几|半)(?:天|日)", "(?:前|后|接下来|将来)(?<lastNextDays><Number>|几)(?:天|日)", "今明(?<todayTomorrow><Number>)?天?", "(?<futureTwoDays>明后天?)", "(?<recent>最近|近期|这段时间)", "(?<dayDuration><Number>)天半?"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, Integer> f11059b;
    public static Map<String, DayType> c;
    public static List<EntityType> d;

    static {
        HashMap map = new HashMap();
        f11059b = map;
        map.put("今天", 0);
        f11059b.put("今日", 0);
        f11059b.put("今儿个", 0);
        f11059b.put("今儿", 0);
        f11059b.put("明天", 1);
        f11059b.put("明日", 1);
        f11059b.put("明儿个", 1);
        f11059b.put("明儿", 1);
        f11059b.put("昨天", -1);
        f11059b.put("昨日", -1);
        f11059b.put("昨儿个", -1);
        f11059b.put("昨儿", -1);
        f11059b.put("前天", -2);
        f11059b.put("后天", 2);
        f11059b.put("大前天", -3);
        f11059b.put("大后天", 3);
        f11059b.put("大大前天", -4);
        f11059b.put("大大后天", 4);
        f11059b.put("明天的后天", 3);
        f11059b.put("今早", 0);
        f11059b.put("今早上", 0);
        f11059b.put("明早", 1);
        f11059b.put("明早上", 1);
        f11059b.put("今晚", 0);
        f11059b.put("今晚上", 0);
        f11059b.put("明晚", 1);
        f11059b.put("明晚上", 1);
        f11059b.put("昨晚", -1);
        f11059b.put("昨晚上", -1);
        HashMap map2 = new HashMap();
        c = map2;
        DayType dayType = DayType.MORNING;
        map2.put("早上", dayType);
        c.put("早晨", dayType);
        c.put("晨间", dayType);
        c.put("下午", DayType.AFTERNOON);
        Map<String, DayType> map3 = c;
        DayType dayType2 = DayType.NIGHT;
        map3.put("晚上", dayType2);
        c.put("夜间", dayType2);
        c.put("夜晚", dayType2);
        Map<String, DayType> map4 = c;
        DayType dayType3 = DayType.NOON;
        map4.put("中午", dayType3);
        c.put("午间", dayType3);
        c.put("上午", DayType.FORENOON);
        Map<String, DayType> map5 = c;
        DayType dayType4 = DayType.EVENING;
        map5.put("傍晚", dayType4);
        c.put("黄昏", dayType4);
        Map<String, DayType> map6 = c;
        DayType dayType5 = DayType.EARLY_MORNING;
        map6.put("凌晨", dayType5);
        c.put("半夜", dayType5);
        c.put("今早", dayType);
        c.put("今早上", dayType);
        c.put("明早", dayType);
        c.put("明早上", dayType);
        c.put("今晚", dayType2);
        c.put("今晚上", dayType2);
        c.put("明晚", dayType2);
        c.put("明晚上", dayType2);
        c.put("昨晚", dayType2);
        c.put("昨晚上", dayType2);
        d = Collections.singletonList(EntityType.Number);
    }

    public final yb8 A(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        int iIntValue = ((Integer) y4f.a(f11059b, a8fVar.d("dayList"), 0)).intValue();
        cr5 cr5Var = (cr5) q(str, a8fVar, d(a8fVar.start(), treeMap), p(dq5Var, iIntValue), o(dq5Var, iIntValue));
        cr5Var.q(DateType.DATE);
        cr5Var.t(GrainType.DATE);
        cr5Var.w(true);
        return cr5Var;
    }

    public final yb8 B(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("dayOffset")));
        int iK = (int) m2hVar.k();
        if (a8fVar.group().contains("前")) {
            iK *= -1;
        }
        dq5 dq5VarV = dq5Var.v(iK);
        cr5 cr5Var = (cr5) r(str, a8fVar, "dayOffset", m2hVar, dq5VarV, dq5VarV);
        cr5Var.q(DateType.DATE);
        cr5Var.t(GrainType.DATE);
        cr5Var.y(TimeSubType.OFFSET);
        cr5Var.w(true);
        return cr5Var;
    }

    public final yb8 C(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarQ = q(str, a8fVar, d(a8fVar.start(), treeMap), dq5Var.v(1).O(), dq5Var.v(2).N());
        vq5VarQ.w(true);
        return vq5VarQ;
    }

    public final yb8 D(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return t(str, a8fVar, treeMap, dq5Var, "lastNextDays", GrainType.DAY);
    }

    public final yb8 E(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        int iD = d(a8fVar.start(), treeMap);
        dq5 dq5VarH = dq5Var.H();
        cr5 cr5Var = (cr5) q(str, a8fVar, iD, dq5VarH.O(), dq5VarH.N());
        cr5Var.B(dq5Var.h());
        cr5Var.q(DateType.DATE);
        cr5Var.t(GrainType.DATE);
        cr5Var.y(TimeSubType.CONCRETE);
        cr5Var.w(true);
        return cr5Var;
    }

    public final yb8 F(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        int iK = (int) m2hVar.k();
        if (iK < 1 || iK > 31) {
            return null;
        }
        cr5 cr5Var = (cr5) r(str, a8fVar, str2, m2hVar, dq5Var, dq5Var);
        cr5Var.B(iK);
        cr5Var.q(DateType.DATE);
        cr5Var.t(GrainType.DATE);
        cr5Var.y(TimeSubType.CONCRETE);
        return cr5Var;
    }

    public final yb8 G(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        String strD = a8fVar.d("partOfDay");
        int iD = d(a8fVar.start(), treeMap);
        ljh<dq5, dq5> ljhVarX = x(dq5Var, strD);
        cr5 cr5Var = (cr5) q(str, a8fVar, iD, ljhVarX.a(), ljhVarX.b());
        cr5Var.t(GrainType.PARTOFDAY);
        cr5Var.C(c.get(strD));
        return cr5Var;
    }

    public final yb8 H(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarV = v(str, a8fVar, treeMap, dq5Var, "pastFutureDays", GrainType.DAY);
        if (vq5VarV.l().i() > dq5Var.i() + 43200000) {
            vq5VarV.x(vq5VarV.n().v(1));
            vq5VarV.s(vq5VarV.l().v(1));
        }
        if (vq5VarV.l().i() < dq5Var.i() - 43200000) {
            vq5VarV.x(vq5VarV.n().v(-1));
            vq5VarV.s(vq5VarV.l().v(-1));
        }
        return vq5VarV;
    }

    public final yb8 I(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarW = w(str, a8fVar, treeMap, dq5Var, "recentDays");
        vq5VarW.x(vq5VarW.n().O());
        vq5VarW.s(vq5VarW.l().N());
        return vq5VarW;
    }

    public final yb8 J(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarQ = q(str, a8fVar, d(a8fVar.start(), treeMap), dq5Var.v(-2).O(), dq5Var.v(2).N());
        vq5VarQ.t(GrainType.RECENT);
        vq5VarQ.w(true);
        return vq5VarQ;
    }

    public final yb8 K(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarR = r(str, a8fVar, "todayTomorrow", (m2h) treeMap.get(Integer.valueOf(a8fVar.f("todayTomorrow"))), dq5Var.O(), dq5Var.v(1).N());
        vq5VarR.w(true);
        return vq5VarR;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "DayParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Day;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return d;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11058a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("numberDay1") != null) {
            h(z, pr5Var, "numberDay1");
            return F(str, a8fVar, treeMap, dq5Var, "numberDay1");
        }
        if (a8fVar.d("numberDay2") != null) {
            h(z, pr5Var, "numberDay2");
            return F(str, a8fVar, treeMap, dq5Var, "numberDay2");
        }
        if (a8fVar.d("dayList") != null) {
            h(z, pr5Var, "dayList");
            return A(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("dayOffset") != null) {
            h(z, pr5Var, "dayOffset");
            return B(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("partOfDay") != null) {
            h(z, pr5Var, "partOfDay");
            return G(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("abbrDayPart") != null) {
            h(z, pr5Var, "abbrDayPart");
            return y(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("monthLastDay") != null) {
            h(z, pr5Var, "monthLastDay");
            return E(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("recentDays") != null) {
            h(z, pr5Var, "recentDays");
            return I(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("pastFutureDays") != null) {
            h(z, pr5Var, "pastFutureDays");
            return H(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("lastNextDays") != null) {
            h(z, pr5Var, "lastNextDays");
            return D(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("todayTomorrow") != null) {
            h(z, pr5Var, "todayTomorrow");
            return K(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("futureTwoDays") != null) {
            h(z, pr5Var, "futureTwoDays");
            return C(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("recent") != null) {
            h(z, pr5Var, "recent");
            return J(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("dayDuration") != null) {
            h(z, pr5Var, "dayDuration");
            return z(str, a8fVar, treeMap, dq5Var);
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 m(dq5 dq5Var, int i, int i2) {
        if (i > 0) {
            i--;
        }
        return dq5Var.v(i).w(i2 * 12);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 n(dq5 dq5Var, int i, int i2) {
        if (i < 0) {
            i++;
        }
        return dq5Var.v(i).w(i2 * 12);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 o(dq5 dq5Var, int i) {
        return dq5Var.v(i).M(23, 59, 59);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 p(dq5 dq5Var, int i) {
        return dq5Var.v(i).O();
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 q(String str, a8f a8fVar, int i, dq5 dq5Var, dq5 dq5Var2) {
        int iEnd = (a8fVar.end() + i) - a8fVar.start();
        return new cr5(i, iEnd, str.substring(i, iEnd), dq5Var, dq5Var2);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 r(String str, a8f a8fVar, String str2, m2h m2hVar, dq5 dq5Var, dq5 dq5Var2) {
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        return new cr5(iB, iA, str.substring(iB, iA), dq5Var, dq5Var2);
    }

    public final ljh<dq5, dq5> x(dq5 dq5Var, String str) {
        return dq5.n(dq5Var, c.get(str));
    }

    public final yb8 y(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        String strD = a8fVar.d("abbrDayPart");
        int iD = d(a8fVar.start(), treeMap);
        ljh<dq5, dq5> ljhVarX = x(dq5Var.v(f11059b.get(strD).intValue()), strD);
        cr5 cr5Var = (cr5) q(str, a8fVar, iD, ljhVarX.a(), ljhVarX.b());
        cr5Var.t(GrainType.PARTOFDAY);
        cr5Var.C(c.get(strD));
        cr5Var.w(true);
        return cr5Var;
    }

    public final yb8 z(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarS = s(str, a8fVar, treeMap, dq5Var, "dayDuration", GrainType.DAY);
        vq5VarS.s(vq5VarS.l().v(1));
        return vq5VarS;
    }
}
