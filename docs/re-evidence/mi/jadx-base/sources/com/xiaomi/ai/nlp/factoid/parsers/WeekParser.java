package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.gdr;
import defpackage.i2h;
import defpackage.jlo;
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
public class WeekParser extends DateTimeUnitParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11089a = Pattern.compile(jlo.c(Arrays.asList("(?<weekList>本|这|上|下|上上|下下)个?(?:周|礼拜|星期)?(?:周|礼拜|星期)(?<weekDay1><Number>|日|天气?温?|末)?", "(?:周|礼拜|星期)(?<weekDay2><Number>|日|天|末)", "(?<weekOffset><Number>)个?(?:周|礼拜|星期)(前|之前|以前|后|之后|以后|过后)", "最?近(?<recentWeeks><Number>|几)个?(?:周|礼拜|星期)", "(?:过去|未来|之前|之后|今后)的?(?<pastFutureWeeks><Number>|几)个?(?:周|礼拜|星期)", "(?:上|前|下|后)(?<lastNextWeeks><Number>)个?(?:周|礼拜|星期)", "(?<weekDuration1><Number>)个?(?:周|礼拜|星期)(?=天气)", "(?<weekDuration2><Number>)个?(?:周|礼拜|星期)(?!<Number>|日|天)"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, Integer> f11090b;
    public static List<EntityType> c;

    static {
        HashMap map = new HashMap();
        f11090b = map;
        map.put("本", 0);
        f11090b.put("这", 0);
        f11090b.put("上", -1);
        f11090b.put("下", 1);
        f11090b.put("上上", -2);
        f11090b.put("下下", 2);
        c = Collections.singletonList(EntityType.Number);
    }

    public final yb8 A(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return w(str, a8fVar, treeMap, dq5Var, "recentWeeks");
    }

    public final yb8 B(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2) {
        return C(str, a8fVar, treeMap, dq5Var, str2, 0, -1);
    }

    public final yb8 C(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2, int i, int i2) {
        int i3;
        vq5 vq5VarR;
        boolean z;
        vq5 gdrVar;
        String strD = a8fVar.d(str2);
        int iF = a8fVar.f(str2);
        int iD = i2 == -1 ? d(a8fVar.start(), treeMap) : i2;
        if (strD.startsWith("末")) {
            vq5VarR = q(str, a8fVar, iD, dq5Var.A(i).F(6), dq5Var.A(i).F(7));
            vq5VarR.t(GrainType.DAY);
        } else if (strD.startsWith("日")) {
            dq5 dq5VarF = dq5Var.A(i).F(7);
            vq5VarR = q(str, a8fVar, iD, dq5VarF, dq5VarF);
            vq5VarR.q(DateType.DATE);
            vq5VarR.t(GrainType.DATE);
        } else {
            if (!strD.startsWith("天")) {
                m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(iF));
                int iB = b(a8fVar, str2, m2hVar);
                int iA = a(a8fVar, str2, m2hVar);
                double dK = m2hVar.k();
                int i4 = (int) dK;
                if (dK != i4 || dK < 1.0d || dK > 6.0d) {
                    int iD2 = m2hVar.d();
                    int iB2 = m2hVar.b();
                    int iD3 = i2h.d(str.charAt(m2hVar.d()), true);
                    if (iD3 >= 1 && iD3 <= 6) {
                        double dDoubleValue = i2h.e(str.substring(iD2 + 1, iB2)).a().doubleValue();
                        int i5 = (int) dDoubleValue;
                        if (dDoubleValue != i5) {
                            int iRound = (int) (Math.round(dDoubleValue * 100.0d) - ((long) (i5 * 100)));
                            if (i5 >= 0 && i5 <= 23 && iRound >= 0 && iRound <= 59) {
                                if (str.length() > iB2 && str.charAt(iB2) == 20998) {
                                    iA = iB2 + 1;
                                }
                                i3 = iRound;
                            }
                        } else {
                            if (str.length() <= iB2 || str.charAt(iB2) != 28857) {
                                return null;
                            }
                            iA = iB2 + 1;
                            if (str.length() > iA && str.charAt(iA) == 21322) {
                                iA = iB2 + 2;
                            }
                            if (dDoubleValue < 1.0d && dDoubleValue > 23.0d) {
                                return null;
                            }
                            i3 = str.charAt(iA + (-1)) == 21322 ? 30 : 0;
                        }
                        dq5 dq5VarM = dq5Var.A(i).F(iD3).M(i5, i3, 0);
                        vq5 gdrVar2 = new gdr(iB, iA, str.substring(iB, iA), dq5VarM, dq5VarM);
                        gdrVar2.q(DateType.DATETIME);
                        gdrVar2.t(GrainType.DATETIME);
                        gdrVar2.y(TimeSubType.CONCRETE);
                        vq5VarR = gdrVar2;
                        z = true;
                    }
                    return null;
                }
                dq5 dq5VarF2 = dq5Var.A(i).F(i4);
                vq5VarR = r(str, a8fVar, str2, m2hVar, dq5VarF2, dq5VarF2);
                vq5VarR.q(DateType.DATE);
                vq5VarR.t(GrainType.DATE);
                vq5VarR.w(z);
                return vq5VarR;
            }
            if (strD.endsWith("气")) {
                int iEnd = ((a8fVar.end() + iD) - a8fVar.start()) - 2;
                gdrVar = new gdr(iD, iEnd, str.substring(iD, iEnd), p(dq5Var, i), o(dq5Var, i));
                gdrVar.t(GrainType.WEEK);
            } else {
                dq5 dq5VarF3 = dq5Var.A(i).F(7);
                int iEnd2 = (a8fVar.end() + iD) - a8fVar.start();
                if (strD.endsWith("温")) {
                    iEnd2 -= 2;
                }
                gdrVar = new gdr(iD, iEnd2, str.substring(iD, iEnd2), dq5VarF3, dq5VarF3);
                gdrVar.q(DateType.DATE);
                gdrVar.t(GrainType.DATE);
            }
            vq5VarR = gdrVar;
        }
        z = true;
        vq5VarR.w(z);
        return vq5VarR;
    }

    public final yb8 D(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2) {
        return s(str, a8fVar, treeMap, dq5Var, str2, GrainType.WEEK);
    }

    public final yb8 E(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        String strD = a8fVar.d("weekList");
        String strD2 = a8fVar.d("weekDay1");
        int iD = d(a8fVar.start(), treeMap);
        int iIntValue = ((Integer) y4f.a(f11090b, strD, 0)).intValue();
        if (strD2 != null) {
            return C(str, a8fVar, treeMap, dq5Var, "weekDay1", iIntValue, iD);
        }
        vq5 vq5VarQ = q(str, a8fVar, iD, p(dq5Var, iIntValue), o(dq5Var, iIntValue));
        vq5VarQ.w(true);
        return vq5VarQ;
    }

    public final yb8 F(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        String strGroup = a8fVar.group();
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("weekOffset")));
        int iK = (int) m2hVar.k();
        if (strGroup.endsWith("前")) {
            iK *= -1;
        }
        vq5 vq5VarR = r(str, a8fVar, "weekOffset", m2hVar, dq5Var.A(iK), dq5Var.A(iK));
        vq5VarR.q(DateType.DATETIME);
        vq5VarR.t(GrainType.DATETIME);
        vq5VarR.y(TimeSubType.OFFSET);
        vq5VarR.w(true);
        return vq5VarR;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "WeekParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Week;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return c;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11089a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("weekList") != null) {
            h(z, pr5Var, "weekList");
            return E(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("weekDay2") != null) {
            h(z, pr5Var, "weekDay2");
            return B(str, a8fVar, treeMap, dq5Var, "weekDay2");
        }
        if (a8fVar.d("weekOffset") != null) {
            h(z, pr5Var, "weekOffset");
            return F(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("recentWeeks") != null) {
            h(z, pr5Var, "recentWeeks");
            return A(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("pastFutureWeeks") != null) {
            h(z, pr5Var, "pastFutureWeeks");
            return z(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("lastNextWeeks") != null) {
            h(z, pr5Var, "lastNextWeeks");
            return y(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("weekDuration1") != null) {
            h(z, pr5Var, "weekDuration1");
            return D(str, a8fVar, treeMap, dq5Var, "weekDuration1");
        }
        if (a8fVar.d("weekDuration2") != null) {
            h(z, pr5Var, "weekDuration2");
            return D(str, a8fVar, treeMap, dq5Var, "weekDuration2");
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 m(dq5 dq5Var, int i, int i2) {
        return x(dq5Var, i).N();
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 n(dq5 dq5Var, int i, int i2) {
        return x(dq5Var, i).O();
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 o(dq5 dq5Var, int i) {
        return dq5Var.A(i).F(7).N();
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 p(dq5 dq5Var, int i) {
        return dq5Var.A(i).F(1).O();
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 q(String str, a8f a8fVar, int i, dq5 dq5Var, dq5 dq5Var2) {
        int iEnd = (a8fVar.end() + i) - a8fVar.start();
        return new gdr(i, iEnd, str.substring(i, iEnd), dq5Var, dq5Var2);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 r(String str, a8f a8fVar, String str2, m2h m2hVar, dq5 dq5Var, dq5 dq5Var2) {
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        return new gdr(iB, iA, str.substring(iB, iA), dq5Var, dq5Var2);
    }

    public final dq5 x(dq5 dq5Var, int i) {
        return dq5Var.A(i);
    }

    public final yb8 y(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return t(str, a8fVar, treeMap, dq5Var, "lastNextWeeks", GrainType.WEEK);
    }

    public final yb8 z(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        vq5 vq5VarV = v(str, a8fVar, treeMap, dq5Var, "pastFutureWeeks", GrainType.WEEK);
        if (vq5VarV.l().i() > dq5Var.i()) {
            vq5VarV.x(vq5VarV.n().v(1));
        }
        if (vq5VarV.n().i() < dq5Var.i()) {
            vq5VarV.x(vq5VarV.n().v(-1));
            vq5VarV.s(vq5VarV.l().v(-1));
        }
        return vq5VarV;
    }
}
