package com.xiaomi.ai.nlp.factoid.parsers;

import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import defpackage.dq5;
import defpackage.fq5;
import defpackage.hl8;
import defpackage.vq5;
import defpackage.yb8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class DateTimeParser extends Parser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<EntityType> f11054a = Arrays.asList(EntityType.Year, EntityType.Month, EntityType.Week, EntityType.Day, EntityType.Hour, EntityType.Minute, EntityType.Second);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, Integer> f11055b;

    public class PatternIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11057b;
        public int c;

        public PatternIterator(String str) {
            this.f11057b = str;
            this.c = str.length();
        }

        public boolean a() {
            return this.f11056a < this.c - 1;
        }

        public String b() {
            if (this.f11057b.charAt(this.f11056a) != '<') {
                int i = this.f11056a;
                int i2 = i + 1;
                this.f11056a = i2;
                return this.f11057b.substring(i, i2);
            }
            int i3 = this.f11056a;
            while (true) {
                int i4 = this.f11056a;
                if (i4 >= this.c || this.f11057b.charAt(i4) == '>') {
                    break;
                }
                this.f11056a++;
            }
            int i5 = this.f11056a;
            if (i5 < this.c) {
                this.f11056a = i5 + 1;
            }
            return this.f11057b.substring(i3, this.f11056a);
        }
    }

    static {
        HashMap map = new HashMap();
        f11055b = map;
        map.put("<Year>", 8);
        f11055b.put("<Month>", 7);
        f11055b.put("<Week>", 6);
        f11055b.put("<Day>", 5);
        f11055b.put("<Hour>", 3);
        f11055b.put("<Minute>", 2);
        f11055b.put("<Second>", 1);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "DateTimeParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public void g(hl8 hl8Var, boolean z) {
        ParseResult parseResult;
        TreeMap<Integer, yb8> treeMap;
        PatternIterator patternIterator;
        dq5 dq5VarH = hl8Var.h();
        String strG = hl8Var.g();
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap2 = new TreeMap();
        ParseResult parseResultE = e(hl8Var, f11054a);
        if (z) {
            f(hl8Var.d(), parseResultE);
        }
        if (parseResultE == null || parseResultE.a().size() <= 0) {
            parseResult = new ParseResult(hl8Var.g(), treeMap2);
        } else {
            String strB = parseResultE.b();
            TreeMap<Integer, yb8> treeMapA = parseResultE.a();
            fq5 fq5Var = new fq5(strG, dq5VarH, null);
            int length = 0;
            fq5 fq5Var2 = null;
            int length2 = 0;
            int iB = 0;
            int i = 100;
            for (PatternIterator patternIterator2 = new PatternIterator(strB); patternIterator2.a(); patternIterator2 = patternIterator) {
                String strB2 = patternIterator2.b();
                if (f11055b.containsKey(strB2)) {
                    vq5 vq5Var = (vq5) treeMapA.get(Integer.valueOf(length));
                    treeMap = treeMapA;
                    int iIntValue = f11055b.get(strB2).intValue();
                    patternIterator = patternIterator2;
                    if (!(iIntValue == i && iIntValue == 5 && vq5Var.m() == GrainType.PARTOFDAY) && iIntValue >= i) {
                        if (fq5Var2 != null) {
                            fq5Var.k(fq5Var2);
                            fq5Var2 = null;
                        }
                        if (fq5Var.j()) {
                            treeMap2.put(Integer.valueOf(fq5Var.d() + length2), fq5Var);
                            length2 += fq5Var.c().length() - (fq5Var.b() - fq5Var.d());
                            sb.append((CharSequence) strG, iB, fq5Var.d());
                            sb.append(fq5Var.c());
                            iB = fq5Var.b();
                            fq5Var = new fq5(strG, dq5VarH, null);
                            fq5Var.l(vq5Var, iIntValue);
                        }
                    } else {
                        fq5Var.l(vq5Var, iIntValue);
                    }
                    i = iIntValue;
                } else {
                    treeMap = treeMapA;
                    patternIterator = patternIterator2;
                    if ((strB2.equals("到") || strB2.equals("至")) && fq5Var.j()) {
                        fq5Var2 = fq5Var;
                        i = 100;
                        fq5Var = new fq5(strG, dq5VarH, null);
                    } else if (!strB2.equals("的")) {
                        if (fq5Var2 != null) {
                            fq5Var.k(fq5Var2);
                            fq5Var2 = null;
                        }
                        if (fq5Var.j()) {
                            treeMap2.put(Integer.valueOf(fq5Var.d() + length2), fq5Var);
                            length2 += fq5Var.c().length() - (fq5Var.b() - fq5Var.d());
                            sb.append(strG.substring(iB, fq5Var.d()));
                            sb.append(fq5Var.c());
                            iB = fq5Var.b();
                            fq5Var = new fq5(strG, dq5VarH, null);
                            i = 100;
                        }
                    }
                    length += strB2.length();
                    treeMapA = treeMap;
                }
                length += strB2.length();
                treeMapA = treeMap;
            }
            if (fq5Var2 != null) {
                fq5Var.k(fq5Var2);
            }
            if (fq5Var.j()) {
                treeMap2.put(Integer.valueOf(fq5Var.d() + length2), fq5Var);
                sb.append(strG.substring(iB, fq5Var.d()));
                sb.append(fq5Var.c());
                iB = fq5Var.b();
            }
            sb.append(strG.substring(iB));
            parseResult = new ParseResult(sb.toString(), treeMap2);
        }
        hl8Var.i(EntityType.DateTime, parseResult);
        if (z) {
            f(hl8Var.d(), parseResult);
        }
    }
}
