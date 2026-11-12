package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DayType;
import defpackage.a8f;
import defpackage.cr5;
import defpackage.dq5;
import defpackage.hbc;
import defpackage.jlo;
import defpackage.kzr;
import defpackage.pr5;
import defpackage.wk9;
import defpackage.xk9;
import defpackage.yb8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class FestivalParser extends RegexBasedParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11060a = Pattern.compile(jlo.c(m(), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11061b = Arrays.asList(EntityType.Year, EntityType.Day, EntityType.Hour);

    public static List<String> m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("(?<fesYear><Year>)?的?(?<festival>" + jlo.c(wk9.c(), "|") + ")(?<partOfDay><Day>)?(?<hour><Hour>)?");
        arrayList.add("(?<solarTermYear><Year>)?的?(?<solarTerm>" + jlo.c(wk9.d(), "|") + ")");
        return arrayList;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "FestivalParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Festival;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11061b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11060a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("festival") != null) {
            h(z, pr5Var, "festival");
            return n(str, a8fVar, treeMap, dq5Var, "fesYear", "festival");
        }
        if (a8fVar.d("solarTerm") != null) {
            h(z, pr5Var, "solarTerm");
            return o(str, a8fVar, treeMap, dq5Var);
        }
        h(z, pr5Var, "None");
        return null;
    }

    public final yb8 n(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2, String str3) {
        boolean z;
        int i;
        DayType dayType;
        int iQ = dq5Var.q();
        int iD = d(a8fVar.start(), treeMap);
        int length = a8fVar.group().length() + iD;
        if (a8fVar.d(str2) != null) {
            kzr kzrVar = (kzr) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
            int iQ2 = kzrVar.n().q();
            int iB = b(a8fVar, str2, kzrVar);
            int iA = a(a8fVar, str2, kzrVar);
            iQ = iQ2;
            i = iB;
            length = iA;
            z = true;
        } else {
            z = false;
            i = iD;
        }
        String strD = a8fVar.d(str3);
        HashMap map = new HashMap();
        str3.hashCode();
        int iG = -1;
        if (str3.equals("solarTerm")) {
            dq5 dq5VarJ = wk9.j(strD, iQ);
            if (!z && dq5VarJ != null && dq5VarJ.N().i() < dq5Var.i()) {
                dq5VarJ = wk9.j(strD, iQ + 1);
            }
            if (dq5VarJ != null) {
                map.put(strD, dq5VarJ);
            }
            dayType = null;
        } else {
            if (!str3.equals("festival")) {
                return null;
            }
            DayType dayType2 = null;
            for (String str4 : wk9.h(strD)) {
                for (String str5 : wk9.e(str4)) {
                    dq5 dq5VarF = wk9.f(str4, str5, iQ);
                    if (!z && dq5VarF != null && dq5VarF.N().i() < dq5Var.i()) {
                        dq5VarF = wk9.f(str4, str5, iQ + 1);
                    }
                    if (dq5VarF != null) {
                        if (a8fVar.d("partOfDay") != null) {
                            cr5 cr5Var = (cr5) treeMap.get(Integer.valueOf(a8fVar.f("partOfDay")));
                            DayType dayTypeA = cr5Var.A();
                            length = a(a8fVar, "partOfDay", cr5Var);
                            dayType2 = dayTypeA;
                        }
                        if (a8fVar.d("hour") != null) {
                            hbc hbcVar = (hbc) treeMap.get(Integer.valueOf(a8fVar.f("hour")));
                            iG = hbcVar.n().g();
                            if (dayType2 == null) {
                                dayType2 = DayType.MORNING;
                            }
                            length = a(a8fVar, "hour", hbcVar);
                        }
                        map.put(str4, dq5VarF);
                    }
                }
            }
            dayType = dayType2;
        }
        int i2 = iG;
        int i3 = length;
        if (map.isEmpty()) {
            return null;
        }
        return new xk9(i, i3, str.substring(i, i3), map, dayType, i2);
    }

    public final yb8 o(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return n(str, a8fVar, treeMap, dq5Var, "solarTermYear", "solarTerm");
    }
}
