package com.xiaomi.ai.nlp.factoid.parsers;

import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.m2h;
import defpackage.vq5;
import defpackage.yb8;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DateTimeUnitParser extends RegexBasedParser {
    public abstract dq5 m(dq5 dq5Var, int i, int i2);

    public abstract dq5 n(dq5 dq5Var, int i, int i2);

    public abstract dq5 o(dq5 dq5Var, int i);

    public abstract dq5 p(dq5 dq5Var, int i);

    public abstract vq5 q(String str, a8f a8fVar, int i, dq5 dq5Var, dq5 dq5Var2);

    public abstract vq5 r(String str, a8f a8fVar, String str2, m2h m2hVar, dq5 dq5Var, dq5 dq5Var2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public vq5 s(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2, GrainType grainType) {
        int iB;
        boolean z;
        boolean z2;
        m2h m2hVar;
        int iK;
        if (a8fVar.d(str2).contains("半")) {
            m2hVar = null;
            z2 = false;
            z = true;
            iB = d(a8fVar.start(), treeMap);
            iK = 0;
        } else {
            m2h m2hVar2 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
            iB = b(a8fVar, str2, m2hVar2);
            z = false;
            z2 = true;
            m2hVar = m2hVar2;
            iK = (int) m2hVar2.k();
        }
        ?? r8 = a8fVar.group().contains("半") ? 1 : z;
        vq5 vq5VarR = z2 ? r(str, a8fVar, str2, m2hVar, n(dq5Var, 0, 0), m(dq5Var, iK, r8)) : q(str, a8fVar, iB, n(dq5Var, 0, 0), m(dq5Var, iK, r8));
        vq5VarR.t(grainType);
        vq5VarR.u(r8);
        vq5VarR.r(vq5VarR.l().i() - vq5VarR.n().i());
        return vq5VarR;
    }

    public vq5 t(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2, GrainType grainType) {
        int iK;
        boolean z;
        int i;
        int i2;
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        if (a8fVar.d(str2).contains("几")) {
            z = false;
            iK = 3;
        } else {
            iK = (int) m2hVar.k();
            z = true;
        }
        String strGroup = a8fVar.group();
        if (strGroup.startsWith("上") || strGroup.startsWith("前")) {
            i = 0 - iK;
            i2 = -1;
        } else {
            i2 = iK;
            i = 1;
        }
        vq5 vq5VarR = z ? r(str, a8fVar, str2, m2hVar, p(dq5Var, i), o(dq5Var, i2)) : q(str, a8fVar, d(a8fVar.start(), treeMap), p(dq5Var, i), o(dq5Var, i2));
        vq5VarR.t(grainType);
        vq5VarR.w(true);
        return vq5VarR;
    }

    public vq5 u(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2, GrainType grainType) {
        int iB;
        int i;
        boolean z;
        m2h m2hVar;
        int iK;
        vq5 vq5VarQ;
        String strD = a8fVar.d(str2);
        String strGroup = a8fVar.group();
        if (strD.contains("半")) {
            m2hVar = null;
            z = false;
            i = 1;
            iB = d(a8fVar.start(), treeMap);
            iK = 0;
        } else {
            m2h m2hVar2 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
            iB = b(a8fVar, str2, m2hVar2);
            i = 0;
            z = true;
            m2hVar = m2hVar2;
            iK = (int) m2hVar2.k();
        }
        if (strGroup.contains("半")) {
            i = 1;
        }
        if (strGroup.endsWith("前")) {
            iK *= -1;
            i *= -1;
        }
        if (z) {
            vq5VarQ = r(str, a8fVar, str2, m2hVar, n(dq5Var, iK, i), m(dq5Var, iK, i));
        } else {
            vq5VarQ = q(str, a8fVar, iB, n(dq5Var, iK, i), m(dq5Var, iK, i));
        }
        vq5VarQ.t(grainType);
        if (grainType == GrainType.DATE) {
            vq5VarQ.q(DateType.DATE);
        } else if (grainType == GrainType.DATETIME) {
            vq5VarQ.q(DateType.DATETIME);
        }
        vq5VarQ.y(TimeSubType.OFFSET);
        vq5VarQ.w(true);
        vq5VarQ.u(i != 0);
        return vq5VarQ;
    }

    public vq5 v(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2, GrainType grainType) {
        int iB;
        int iK;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        vq5 vq5VarQ;
        String strD = a8fVar.d(str2);
        m2h m2hVar = null;
        if (strD.contains("几")) {
            iK = 3;
            z = false;
            iB = d(a8fVar.start(), treeMap);
            i = 0;
        } else if (strD.contains("半")) {
            iB = d(a8fVar.start(), treeMap);
            iK = 0;
            z = false;
            i = 1;
        } else {
            m2h m2hVar2 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
            iB = b(a8fVar, str2, m2hVar2);
            iK = (int) m2hVar2.k();
            m2hVar = m2hVar2;
            i = 0;
            z = true;
        }
        String strGroup = a8fVar.group();
        if (strGroup.startsWith("过去") || strGroup.startsWith("之前")) {
            i2 = 0 - iK;
            i3 = i * (-1);
            i4 = 0;
        } else {
            i3 = i;
            i4 = iK;
            i2 = 0;
        }
        if (z) {
            vq5VarQ = r(str, a8fVar, str2, m2hVar, n(dq5Var, i2, Math.min(0, i3)), m(dq5Var, i4, Math.max(0, i3)));
        } else {
            vq5VarQ = q(str, a8fVar, iB, n(dq5Var, i2, Math.min(0, i3)), m(dq5Var, i4, Math.max(0, i3)));
        }
        vq5VarQ.t(grainType);
        vq5VarQ.w(true);
        vq5VarQ.u(i3 != 0);
        return vq5VarQ;
    }

    public vq5 w(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, String str2) {
        vq5 vq5VarR;
        String strD = a8fVar.d(str2);
        if (strD.contains("几")) {
            vq5VarR = q(str, a8fVar, d(a8fVar.start(), treeMap), n(dq5Var, -3, 0), m(dq5Var, 3, 0));
        } else if (strD.contains("半")) {
            vq5VarR = q(str, a8fVar, d(a8fVar.start(), treeMap), n(dq5Var, 0, -1), m(dq5Var, 0, 1));
        } else {
            m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
            int iK = (int) m2hVar.k();
            vq5VarR = r(str, a8fVar, str2, m2hVar, n(dq5Var, iK * (-1), 0), m(dq5Var, iK, 0));
        }
        vq5VarR.t(GrainType.RECENT);
        vq5VarR.w(true);
        return vq5VarR;
    }
}
