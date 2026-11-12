package com.sogou.map.loc;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
final class b0 extends h0 {
    private final List b;
    private final List c;
    private final List d;
    private final p1 e;
    private final r1 f;
    private final f1 g;
    private final m1 h;
    private final s i;
    private boolean j;
    private final l1 k;
    private final o1 l;
    private File m;
    private Pattern n;

    public b0(l0 l0Var, p1 p1Var, r1 r1Var, f1 f1Var, m1 m1Var) {
        super(l0Var);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.j = false;
        this.k = new v1(this);
        this.l = new x1(this);
        this.m = new File(a2.a);
        this.n = Pattern.compile("^(100|200|300)_(\\d{1,14}).txt$");
        this.e = p1Var;
        this.f = r1Var;
        this.g = f1Var;
        this.h = m1Var;
        this.i = new s(l0Var);
    }

    private String g(int i) {
        List listK = v1.k(this.m);
        int i2 = 0;
        if ((listK == null ? 0 : listK.size()) == 0) {
            return String.valueOf(i) + "_" + j0.b() + ".txt";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (listK != null) {
            Iterator it2 = listK.iterator();
            while (it2.hasNext()) {
                String name = ((File) it2.next()).getName();
                Matcher matcher = this.n.matcher(name);
                if (matcher.find()) {
                    i2++;
                    int i3 = Integer.parseInt(matcher.group(1));
                    if (i3 == i) {
                        arrayList.add(name);
                    } else if (i3 < i) {
                        arrayList2.add(name);
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            String str = (String) Collections.max(arrayList);
            if (new File(this.m, str).length() < 65536) {
                return str;
            }
        }
        if (i2 < 20) {
            return String.valueOf(i) + "_" + j0.b() + ".txt";
        }
        if (arrayList2.size() <= 0) {
            return null;
        }
        v1.g(new File(this.m, (String) Collections.min(arrayList2)));
        return String.valueOf(i) + "_" + j0.b() + ".txt";
    }

    public static /* synthetic */ void i(b0 b0Var, int i, List list) {
        List list2;
        if (list == null || list.size() == 0) {
            return;
        }
        if (i == 100) {
            list2 = b0Var.d;
        } else if (i == 200) {
            list2 = b0Var.c;
        } else if (i != 300) {
            return;
        } else {
            list2 = b0Var.b;
        }
        list2.addAll(list);
        r0.a(3, "collecter", "saveDataIntoMemory, size: " + b0Var.b.size() + ", " + b0Var.c.size() + ", " + b0Var.d.size());
        if (list2.size() >= 0) {
            long jB = j0.b();
            ArrayList arrayList = new ArrayList(list2);
            String strG = b0Var.g(i);
            if (strG == null) {
                b0Var.k();
            } else {
                v1.h(new File(b0Var.m, strG), (String[]) arrayList.toArray(new String[0]));
                arrayList.clear();
            }
            list2.clear();
            r0.a(3, "collecter", "putDataIntoFile_" + i + ":" + (j0.b() - jB));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    public static /* synthetic */ void j(b0 b0Var, y0 y0Var) {
        int i;
        d1 d1Var;
        long jB = j0.b();
        if (y0Var != null) {
            jB = y0Var.a();
        }
        try {
            if (!b0Var.g.w()) {
                i = 0;
            } else if (b0Var.g.w() && b0Var.e.m() && b0Var.f.A()) {
                i = 300;
            } else if (b0Var.g.w() && b0Var.e.m()) {
                i = 100;
            } else if (b0Var.g.w() && b0Var.f.A()) {
                i = 200;
            } else {
                i = 0;
            }
        } catch (Exception unused) {
        }
        int i2 = (y0Var == null || !y0Var.d().equals("network")) ? i : 100;
        r1 r1Var = b0Var.f;
        if (r1Var.b == null) {
            d1Var = null;
        } else {
            d1 d1Var2 = new d1();
            d1Var2.b(jB);
            d1Var2.c(q0.d(r1Var.b, jB));
            d1Var = d1Var2;
        }
        b0Var.f.f(2000L, false).a(new z1(b0Var, d1Var, new y1(b0Var, d1Var, y0Var, b0Var.e.f(jB), i2)));
    }

    public final synchronized void h() {
        r0.b("ct.start");
        if (this.j) {
            return;
        }
        this.j = true;
        this.g.l(this.k);
        this.h.d(this.l);
    }

    public final synchronized void k() {
        r0.b("ct.stop");
        if (this.j) {
            this.j = false;
            this.g.l(null);
            this.h.d(null);
            this.b.clear();
            this.c.clear();
            this.d.clear();
        }
    }
}
