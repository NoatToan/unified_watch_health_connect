package com.xiaomi.ai.nlp.factoid.parsers;

import defpackage.a8f;
import defpackage.g2h;
import defpackage.m2h;
import defpackage.yb8;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class NumberBasedParser extends RegexBasedParser {
    public abstract g2h m(int i, int i2, String str, double d, double d2, boolean z);

    public g2h n(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        double dK = m2hVar.k();
        if (a8fVar.group().contains("半")) {
            dK += 0.5d;
        }
        double d = dK;
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        return m(iB, iA, str.substring(iB, iA), d, d, false);
    }

    public g2h o(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        return r(str, a8fVar, treeMap, str2, true);
    }

    public g2h p(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2) {
        return r(str, a8fVar, treeMap, str2, false);
    }

    public g2h q(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2, String str3) {
        int length = str.length();
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        double dK = m2hVar.k();
        if (length > m2hVar.b() + 1 && str.charAt(m2hVar.b() + 1) == 21322) {
            dK += 0.5d;
        }
        m2h m2hVar2 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str3)));
        double dK2 = m2hVar2.k();
        if (length > m2hVar2.b() + 1 && str.charAt(m2hVar2.b() + 1) == 21322) {
            dK2 += 0.5d;
        }
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str3, m2hVar2);
        return m(iB, iA, str.substring(iB, iA), dK, dK2, true);
    }

    public final g2h r(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2, boolean z) {
        double d;
        double d2;
        m2h m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f(str2)));
        double dK = m2hVar.k();
        if (a8fVar.group().contains("半")) {
            dK += 0.5d;
        }
        int iB = b(a8fVar, str2, m2hVar);
        int iA = a(a8fVar, str2, m2hVar);
        String strSubstring = str.substring(iB, iA);
        if (z) {
            d2 = Double.MAX_VALUE;
            d = dK;
        } else {
            d = Double.MIN_VALUE;
            d2 = dK;
        }
        return m(iB, iA, strSubstring, d, d2, true);
    }
}
