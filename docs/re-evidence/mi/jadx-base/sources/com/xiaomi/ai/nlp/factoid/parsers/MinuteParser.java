package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import defpackage.a5g;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.i2h;
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
public class MinuteParser extends DateTimeUnitParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11072a = Pattern.compile(jlo.c(Arrays.asList("(?:过去|未来|之前|之后)(?<pastFutureMinutes><Number>|几)分钟?", "(?<!<Number>点)过(?<minuteOffset1><Number>|半)分半?钟?", "(?<minuteOffset2><Number>|半)分半?钟?(?:前|之前|以前|后|之后|以后|过后)", "(?<minuteDuration><Number>|半)分半?钟?(?:之内|内)?", "(?<=<Number>点)过?(?<numberMinute1><Number>)分?", "(?<numberMinute2><Number>)"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11073b = Collections.singletonList(EntityType.Number);

    public final yb8 A(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        return v(str, a8fVar, treeMap, dq5Var, "pastFutureMinutes", GrainType.MINUTE);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "MinuteParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.Minute;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11073b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11072a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("pastFutureMinutes") != null) {
            h(z, pr5Var, "pastFutureMinutes");
            return A(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("minuteOffset1") != null) {
            h(z, pr5Var, "minuteOffset1");
            return y(str, a8fVar, treeMap, dq5Var, "minuteOffset1");
        }
        if (a8fVar.d("minuteOffset2") != null) {
            h(z, pr5Var, "minuteOffset2");
            return y(str, a8fVar, treeMap, dq5Var, "minuteOffset2");
        }
        if (a8fVar.d("minuteDuration") != null) {
            h(z, pr5Var, "minuteDuration");
            return x(str, a8fVar, treeMap, dq5Var);
        }
        if (a8fVar.d("numberMinute1") != null) {
            h(z, pr5Var, "numberMinute1");
            return z(str, a8fVar, treeMap, dq5Var, "numberMinute1");
        }
        if (a8fVar.d("numberMinute2") != null) {
            h(z, pr5Var, "numberMinute2");
            return z(str, a8fVar, treeMap, dq5Var, "numberMinute2");
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 m(dq5 dq5Var, int i, int i2) {
        return dq5Var.x(i).z(i2 * 30);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 n(dq5 dq5Var, int i, int i2) {
        return dq5Var.x(i).z(i2 * 30);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 o(dq5 dq5Var, int i) {
        return dq5Var.x(i).L(59);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public dq5 p(dq5 dq5Var, int i) {
        return dq5Var.x(i).L(0);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 q(String str, a8f a8fVar, int i, dq5 dq5Var, dq5 dq5Var2) {
        int iEnd = (a8fVar.end() + i) - a8fVar.start();
        return new a5g(i, iEnd, str.substring(i, iEnd), dq5Var, dq5Var2);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.DateTimeUnitParser
    public vq5 r(String str, a8f a8fVar, String str2, m2h m2hVar, dq5 dq5Var, dq5 dq5Var2) {
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        return new a5g(iB, iA, str.substring(iB, iA), dq5Var, dq5Var2);
    }

    public final yb8 x(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var) {
        double dK;
        String strE;
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("minuteDuration")));
        if (m2hVar != null) {
            dK = m2hVar.k();
            strE = m2hVar.e();
        } else {
            dK = 0.0d;
            strE = null;
        }
        double d = dK;
        if (strE == null || !strE.contains("点")) {
            a5g a5gVar = (a5g) s(str, a8fVar, treeMap, dq5Var, "minuteDuration", GrainType.MINUTE);
            a5gVar.B((int) d);
            return a5gVar;
        }
        String[] strArrSplit = strE.split("点");
        if (strArrSplit.length != 2) {
            return null;
        }
        int iIntValue = i2h.e(strArrSplit[0]).a().intValue();
        int iIntValue2 = i2h.e(strArrSplit[1]).a().intValue();
        if (iIntValue < 0 || iIntValue > 23 || iIntValue2 < 0 || iIntValue2 > 59) {
            return null;
        }
        dq5 dq5VarM = dq5Var.M(iIntValue, iIntValue2, 0);
        a5g a5gVar2 = (a5g) r(str, a8fVar, "minuteDuration", m2hVar, dq5VarM, dq5VarM);
        a5gVar2.B(iIntValue2);
        a5gVar2.q(DateType.DATETIME);
        a5gVar2.t(GrainType.DATETIME);
        a5gVar2.y(TimeSubType.CONCRETE);
        a5gVar2.C(true);
        a5gVar2.w(false);
        return a5gVar2;
    }

    public final yb8 y(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2) {
        return u(str, a8fVar, treeMap, dq5Var, str2, GrainType.DATETIME);
    }

    public final yb8 z(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        double dK = m2hVar.k();
        String strE = m2hVar.e();
        a5g a5gVar = null;
        if (strE.contains("点")) {
            String[] strArrSplit = strE.split("点");
            if (strArrSplit.length != 2) {
                return null;
            }
            int iIntValue = i2h.e(strArrSplit[0]).a().intValue();
            int iIntValue2 = i2h.e(strArrSplit[1]).a().intValue();
            if (iIntValue >= 0 && iIntValue <= 23 && iIntValue2 >= 0 && iIntValue2 <= 59) {
                if (iIntValue2 < 10 && !strArrSplit[1].startsWith("零") && !strArrSplit[1].startsWith("0")) {
                    return null;
                }
                dq5 dq5VarM = dq5Var.M(iIntValue, iIntValue2, 0);
                a5gVar = (a5g) r(str, a8fVar, str2, m2hVar, dq5VarM, dq5VarM);
                a5gVar.B(iIntValue2);
                a5gVar.q(DateType.DATETIME);
                a5gVar.t(GrainType.DATETIME);
                a5gVar.y(TimeSubType.CONCRETE);
                a5gVar.C(true);
            }
        } else if (str2.equals("numberMinute1")) {
            int i = (int) dK;
            a5gVar = (a5g) r(str, a8fVar, str2, m2hVar, dq5Var.J(i), dq5Var.J(i));
            a5gVar.B(i);
        }
        if (a5gVar != null) {
            a5gVar.w(false);
        }
        return a5gVar;
    }
}
