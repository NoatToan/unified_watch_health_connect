package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class du implements ef<du, Object>, Serializable, Cloneable {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f132a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dj f133a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f134a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f135a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f136a;
    public int b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f138b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f139b;
    public int c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f141c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    private static final eu t = new eu("XmPushActionRegistration");
    private static final em u = new em("", (byte) 11, 1);
    private static final em v = new em("", (byte) 12, 2);
    private static final em w = new em("", (byte) 11, 3);
    private static final em x = new em("", (byte) 11, 4);
    private static final em y = new em("", (byte) 11, 5);
    private static final em z = new em("", (byte) 11, 6);
    private static final em A = new em("", (byte) 11, 7);
    private static final em B = new em("", (byte) 11, 8);
    private static final em C = new em("", (byte) 11, 9);
    private static final em D = new em("", (byte) 11, 10);
    private static final em E = new em("", (byte) 11, 11);
    private static final em F = new em("", (byte) 11, 12);
    private static final em G = new em("", (byte) 8, 13);
    private static final em H = new em("", (byte) 8, 14);
    private static final em I = new em("", (byte) 11, 15);
    private static final em J = new em("", (byte) 11, 16);
    private static final em K = new em("", (byte) 11, 17);
    private static final em L = new em("", (byte) 11, 18);
    private static final em M = new em("", (byte) 8, 19);
    private static final em N = new em("", (byte) 8, 20);
    private static final em O = new em("", (byte) 2, 21);
    private static final em P = new em("", (byte) 10, 22);
    private static final em Q = new em("", (byte) 10, 23);
    private static final em R = new em("", (byte) 11, 24);
    private static final em S = new em("", (byte) 11, 25);
    private static final em T = new em("", (byte) 2, 26);
    private static final em U = new em("", (byte) 13, 100);
    private static final em V = new em("", (byte) 2, 101);
    private static final em W = new em("", (byte) 11, 102);
    private BitSet s = new BitSet(8);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f137a = true;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public boolean f142c = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f140b = false;

    public boolean A() {
        return this.f136a != null;
    }

    public boolean B() {
        return this.s.get(7);
    }

    public boolean C() {
        return this.r != null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(du duVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        int iA10;
        int iA11;
        int iA12;
        int iA13;
        int iA14;
        int iA15;
        int iA16;
        int iA17;
        int iA18;
        int iA19;
        int iA20;
        int iA21;
        int iA22;
        int iA23;
        int iA24;
        int iA25;
        int iA26;
        int iA27;
        int iA28;
        int iA29;
        if (!getClass().equals(duVar.getClass())) {
            return getClass().getName().compareTo(duVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3726a()).compareTo(Boolean.valueOf(duVar.m3726a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3726a() && (iA29 = eg.a(this.f135a, duVar.f135a)) != 0) {
            return iA29;
        }
        int iCompareTo2 = Boolean.valueOf(m3728b()).compareTo(Boolean.valueOf(duVar.m3728b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3728b() && (iA28 = eg.a(this.f134a, duVar.f134a)) != 0) {
            return iA28;
        }
        int iCompareTo3 = Boolean.valueOf(m3729c()).compareTo(Boolean.valueOf(duVar.m3729c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3729c() && (iA27 = eg.a(this.f139b, duVar.f139b)) != 0) {
            return iA27;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(duVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA26 = eg.a(this.f141c, duVar.f141c)) != 0) {
            return iA26;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(duVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA25 = eg.a(this.d, duVar.d)) != 0) {
            return iA25;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(duVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA24 = eg.a(this.e, duVar.e)) != 0) {
            return iA24;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(duVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA23 = eg.a(this.f, duVar.f)) != 0) {
            return iA23;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(duVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA22 = eg.a(this.g, duVar.g)) != 0) {
            return iA22;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(duVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA21 = eg.a(this.h, duVar.h)) != 0) {
            return iA21;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(duVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA20 = eg.a(this.i, duVar.i)) != 0) {
            return iA20;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(duVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA19 = eg.a(this.j, duVar.j)) != 0) {
            return iA19;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(duVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA18 = eg.a(this.k, duVar.k)) != 0) {
            return iA18;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(duVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA17 = eg.a(this.a, duVar.a)) != 0) {
            return iA17;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(duVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA16 = eg.a(this.b, duVar.b)) != 0) {
            return iA16;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(duVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iA15 = eg.a(this.l, duVar.l)) != 0) {
            return iA15;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(duVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iA14 = eg.a(this.m, duVar.m)) != 0) {
            return iA14;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(duVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iA13 = eg.a(this.n, duVar.n)) != 0) {
            return iA13;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(duVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (r() && (iA12 = eg.a(this.o, duVar.o)) != 0) {
            return iA12;
        }
        int iCompareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(duVar.s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (s() && (iA11 = eg.a(this.c, duVar.c)) != 0) {
            return iA11;
        }
        int iCompareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(duVar.t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (t() && (iA10 = eg.a(this.f133a, duVar.f133a)) != 0) {
            return iA10;
        }
        int iCompareTo21 = Boolean.valueOf(u()).compareTo(Boolean.valueOf(duVar.u()));
        if (iCompareTo21 != 0) {
            return iCompareTo21;
        }
        if (u() && (iA9 = eg.a(this.f137a, duVar.f137a)) != 0) {
            return iA9;
        }
        int iCompareTo22 = Boolean.valueOf(v()).compareTo(Boolean.valueOf(duVar.v()));
        if (iCompareTo22 != 0) {
            return iCompareTo22;
        }
        if (v() && (iA8 = eg.a(this.f132a, duVar.f132a)) != 0) {
            return iA8;
        }
        int iCompareTo23 = Boolean.valueOf(w()).compareTo(Boolean.valueOf(duVar.w()));
        if (iCompareTo23 != 0) {
            return iCompareTo23;
        }
        if (w() && (iA7 = eg.a(this.f138b, duVar.f138b)) != 0) {
            return iA7;
        }
        int iCompareTo24 = Boolean.valueOf(x()).compareTo(Boolean.valueOf(duVar.x()));
        if (iCompareTo24 != 0) {
            return iCompareTo24;
        }
        if (x() && (iA6 = eg.a(this.p, duVar.p)) != 0) {
            return iA6;
        }
        int iCompareTo25 = Boolean.valueOf(y()).compareTo(Boolean.valueOf(duVar.y()));
        if (iCompareTo25 != 0) {
            return iCompareTo25;
        }
        if (y() && (iA5 = eg.a(this.q, duVar.q)) != 0) {
            return iA5;
        }
        int iCompareTo26 = Boolean.valueOf(z()).compareTo(Boolean.valueOf(duVar.z()));
        if (iCompareTo26 != 0) {
            return iCompareTo26;
        }
        if (z() && (iA4 = eg.a(this.f140b, duVar.f140b)) != 0) {
            return iA4;
        }
        int iCompareTo27 = Boolean.valueOf(A()).compareTo(Boolean.valueOf(duVar.A()));
        if (iCompareTo27 != 0) {
            return iCompareTo27;
        }
        if (A() && (iA3 = eg.a(this.f136a, duVar.f136a)) != 0) {
            return iA3;
        }
        int iCompareTo28 = Boolean.valueOf(B()).compareTo(Boolean.valueOf(duVar.B()));
        if (iCompareTo28 != 0) {
            return iCompareTo28;
        }
        if (B() && (iA2 = eg.a(this.f142c, duVar.f142c)) != 0) {
            return iA2;
        }
        int iCompareTo29 = Boolean.valueOf(C()).compareTo(Boolean.valueOf(duVar.C()));
        if (iCompareTo29 != 0) {
            return iCompareTo29;
        }
        if (!C() || (iA = eg.a(this.r, duVar.r)) == 0) {
            return 0;
        }
        return iA;
    }

    public du a(int i) {
        this.a = i;
        a(true);
        return this;
    }

    public du a(dj djVar) {
        this.f133a = djVar;
        return this;
    }

    public du a(String str) {
        this.f139b = str;
        return this;
    }

    public String a() {
        return this.f139b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3725a() throws eq {
        if (this.f139b == null) {
            throw new eq("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f141c == null) {
            throw new eq("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f != null) {
            return;
        }
        throw new eq("Required field 'token' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                epVar.f();
                m3725a();
                return;
            }
            short s = emVarMo3773a.f173a;
            switch (s) {
                case 1:
                    if (b == 11) {
                        this.f135a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f134a = dkVar;
                        dkVar.a(epVar);
                    }
                    epVar.g();
                    break;
                case 3:
                    if (b == 11) {
                        this.f139b = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 4:
                    if (b == 11) {
                        this.f141c = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 5:
                    if (b == 11) {
                        this.d = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 6:
                    if (b == 11) {
                        this.e = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 7:
                    if (b == 11) {
                        this.f = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 8:
                    if (b == 11) {
                        this.g = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 9:
                    if (b == 11) {
                        this.h = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 10:
                    if (b == 11) {
                        this.i = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 11:
                    if (b == 11) {
                        this.j = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 12:
                    if (b == 11) {
                        this.k = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 13:
                    if (b == 8) {
                        this.a = epVar.mo3771a();
                        a(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 14:
                    if (b == 8) {
                        this.b = epVar.mo3771a();
                        b(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 15:
                    if (b == 11) {
                        this.l = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 16:
                    if (b == 11) {
                        this.m = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 17:
                    if (b == 11) {
                        this.n = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 18:
                    if (b == 11) {
                        this.o = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 19:
                    if (b == 8) {
                        this.c = epVar.mo3771a();
                        c(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 20:
                    if (b == 8) {
                        this.f133a = dj.a(epVar.mo3771a());
                        continue;
                    }
                    epVar.g();
                    break;
                case 21:
                    if (b == 2) {
                        this.f137a = epVar.mo3783a();
                        d(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 22:
                    if (b == 10) {
                        this.f132a = epVar.mo3772a();
                        e(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 23:
                    if (b == 10) {
                        this.f138b = epVar.mo3772a();
                        f(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 24:
                    if (b == 11) {
                        this.p = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 25:
                    if (b == 11) {
                        this.q = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 26:
                    if (b == 2) {
                        this.f140b = epVar.mo3783a();
                        g(true);
                        continue;
                    }
                    epVar.g();
                    break;
                default:
                    switch (s) {
                        case 100:
                            if (b == 13) {
                                eo eoVarMo3775a = epVar.mo3775a();
                                this.f136a = new HashMap(eoVarMo3775a.f175a * 2);
                                for (int i = 0; i < eoVarMo3775a.f175a; i++) {
                                    this.f136a.put(epVar.mo3778a(), epVar.mo3778a());
                                }
                                epVar.h();
                            }
                            epVar.g();
                            break;
                        case 101:
                            if (b == 2) {
                                this.f142c = epVar.mo3783a();
                                h(true);
                                continue;
                            }
                            epVar.g();
                            break;
                        case 102:
                            if (b == 11) {
                                this.r = epVar.mo3778a();
                                continue;
                            }
                            epVar.g();
                            break;
                    }
                    break;
            }
            es.a(epVar, b);
            epVar.g();
        }
    }

    public void a(boolean z2) {
        this.s.set(0, z2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3726a() {
        return this.f135a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3727a(du duVar) {
        if (duVar == null) {
            return false;
        }
        boolean zM3726a = m3726a();
        boolean zM3726a2 = duVar.m3726a();
        if ((zM3726a || zM3726a2) && !(zM3726a && zM3726a2 && this.f135a.equals(duVar.f135a))) {
            return false;
        }
        boolean zM3728b = m3728b();
        boolean zM3728b2 = duVar.m3728b();
        if ((zM3728b || zM3728b2) && !(zM3728b && zM3728b2 && this.f134a.m3682a(duVar.f134a))) {
            return false;
        }
        boolean zM3729c = m3729c();
        boolean zM3729c2 = duVar.m3729c();
        if ((zM3729c || zM3729c2) && !(zM3729c && zM3729c2 && this.f139b.equals(duVar.f139b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = duVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f141c.equals(duVar.f141c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = duVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.d.equals(duVar.d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = duVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.e.equals(duVar.e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = duVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f.equals(duVar.f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = duVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.g.equals(duVar.g))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = duVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.h.equals(duVar.h))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = duVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.i.equals(duVar.i))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = duVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.j.equals(duVar.j))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = duVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.k.equals(duVar.k))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = duVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.a == duVar.a)) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = duVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.b == duVar.b)) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = duVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.l.equals(duVar.l))) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = duVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.m.equals(duVar.m))) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = duVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.n.equals(duVar.n))) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = duVar.r();
        if ((zR || zR2) && !(zR && zR2 && this.o.equals(duVar.o))) {
            return false;
        }
        boolean zS = s();
        boolean zS2 = duVar.s();
        if ((zS || zS2) && !(zS && zS2 && this.c == duVar.c)) {
            return false;
        }
        boolean zT = t();
        boolean zT2 = duVar.t();
        if ((zT || zT2) && !(zT && zT2 && this.f133a.equals(duVar.f133a))) {
            return false;
        }
        boolean zU = u();
        boolean zU2 = duVar.u();
        if ((zU || zU2) && !(zU && zU2 && this.f137a == duVar.f137a)) {
            return false;
        }
        boolean zV = v();
        boolean zV2 = duVar.v();
        if ((zV || zV2) && !(zV && zV2 && this.f132a == duVar.f132a)) {
            return false;
        }
        boolean zW = w();
        boolean zW2 = duVar.w();
        if ((zW || zW2) && !(zW && zW2 && this.f138b == duVar.f138b)) {
            return false;
        }
        boolean zX = x();
        boolean zX2 = duVar.x();
        if ((zX || zX2) && !(zX && zX2 && this.p.equals(duVar.p))) {
            return false;
        }
        boolean zY = y();
        boolean zY2 = duVar.y();
        if ((zY || zY2) && !(zY && zY2 && this.q.equals(duVar.q))) {
            return false;
        }
        boolean z2 = z();
        boolean z3 = duVar.z();
        if ((z2 || z3) && !(z2 && z3 && this.f140b == duVar.f140b)) {
            return false;
        }
        boolean zA = A();
        boolean zA2 = duVar.A();
        if ((zA || zA2) && !(zA && zA2 && this.f136a.equals(duVar.f136a))) {
            return false;
        }
        boolean zB = B();
        boolean zB2 = duVar.B();
        if ((zB || zB2) && !(zB && zB2 && this.f142c == duVar.f142c)) {
            return false;
        }
        boolean zC = C();
        boolean zC2 = duVar.C();
        if (zC || zC2) {
            return zC && zC2 && this.r.equals(duVar.r);
        }
        return true;
    }

    public du b(int i) {
        this.b = i;
        b(true);
        return this;
    }

    public du b(String str) {
        this.f141c = str;
        return this;
    }

    public String b() {
        return this.f141c;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3725a();
        epVar.a(t);
        if (this.f135a != null && m3726a()) {
            epVar.a(u);
            epVar.a(this.f135a);
            epVar.b();
        }
        if (this.f134a != null && m3728b()) {
            epVar.a(v);
            this.f134a.b(epVar);
            epVar.b();
        }
        if (this.f139b != null) {
            epVar.a(w);
            epVar.a(this.f139b);
            epVar.b();
        }
        if (this.f141c != null) {
            epVar.a(x);
            epVar.a(this.f141c);
            epVar.b();
        }
        if (this.d != null && e()) {
            epVar.a(y);
            epVar.a(this.d);
            epVar.b();
        }
        if (this.e != null && f()) {
            epVar.a(z);
            epVar.a(this.e);
            epVar.b();
        }
        if (this.f != null) {
            epVar.a(A);
            epVar.a(this.f);
            epVar.b();
        }
        if (this.g != null && h()) {
            epVar.a(B);
            epVar.a(this.g);
            epVar.b();
        }
        if (this.h != null && i()) {
            epVar.a(C);
            epVar.a(this.h);
            epVar.b();
        }
        if (this.i != null && j()) {
            epVar.a(D);
            epVar.a(this.i);
            epVar.b();
        }
        if (this.j != null && k()) {
            epVar.a(E);
            epVar.a(this.j);
            epVar.b();
        }
        if (this.k != null && l()) {
            epVar.a(F);
            epVar.a(this.k);
            epVar.b();
        }
        if (m()) {
            epVar.a(G);
            epVar.mo3782a(this.a);
            epVar.b();
        }
        if (n()) {
            epVar.a(H);
            epVar.mo3782a(this.b);
            epVar.b();
        }
        if (this.l != null && o()) {
            epVar.a(I);
            epVar.a(this.l);
            epVar.b();
        }
        if (this.m != null && p()) {
            epVar.a(J);
            epVar.a(this.m);
            epVar.b();
        }
        if (this.n != null && q()) {
            epVar.a(K);
            epVar.a(this.n);
            epVar.b();
        }
        if (this.o != null && r()) {
            epVar.a(L);
            epVar.a(this.o);
            epVar.b();
        }
        if (s()) {
            epVar.a(M);
            epVar.mo3782a(this.c);
            epVar.b();
        }
        if (this.f133a != null && t()) {
            epVar.a(N);
            epVar.mo3782a(this.f133a.a());
            epVar.b();
        }
        if (u()) {
            epVar.a(O);
            epVar.a(this.f137a);
            epVar.b();
        }
        if (v()) {
            epVar.a(P);
            epVar.a(this.f132a);
            epVar.b();
        }
        if (w()) {
            epVar.a(Q);
            epVar.a(this.f138b);
            epVar.b();
        }
        if (this.p != null && x()) {
            epVar.a(R);
            epVar.a(this.p);
            epVar.b();
        }
        if (this.q != null && y()) {
            epVar.a(S);
            epVar.a(this.q);
            epVar.b();
        }
        if (z()) {
            epVar.a(T);
            epVar.a(this.f140b);
            epVar.b();
        }
        if (this.f136a != null && A()) {
            epVar.a(U);
            epVar.a(new eo((byte) 11, (byte) 11, this.f136a.size()));
            for (Map.Entry<String, String> entry : this.f136a.entrySet()) {
                epVar.a(entry.getKey());
                epVar.a(entry.getValue());
            }
            epVar.d();
            epVar.b();
        }
        if (B()) {
            epVar.a(V);
            epVar.a(this.f142c);
            epVar.b();
        }
        if (this.r != null && C()) {
            epVar.a(W);
            epVar.a(this.r);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z2) {
        this.s.set(1, z2);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3728b() {
        return this.f134a != null;
    }

    public du c(int i) {
        this.c = i;
        c(true);
        return this;
    }

    public du c(String str) {
        this.d = str;
        return this;
    }

    public String c() {
        return this.f;
    }

    public void c(boolean z2) {
        this.s.set(2, z2);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3729c() {
        return this.f139b != null;
    }

    public du d(String str) {
        this.e = str;
        return this;
    }

    public void d(boolean z2) {
        this.s.set(3, z2);
    }

    public boolean d() {
        return this.f141c != null;
    }

    public du e(String str) {
        this.f = str;
        return this;
    }

    public void e(boolean z2) {
        this.s.set(4, z2);
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof du)) {
            return m3727a((du) obj);
        }
        return false;
    }

    public du f(String str) {
        this.g = str;
        return this;
    }

    public void f(boolean z2) {
        this.s.set(5, z2);
    }

    public boolean f() {
        return this.e != null;
    }

    public du g(String str) {
        this.h = str;
        return this;
    }

    public void g(boolean z2) {
        this.s.set(6, z2);
    }

    public boolean g() {
        return this.f != null;
    }

    public du h(String str) {
        this.k = str;
        return this;
    }

    public void h(boolean z2) {
        this.s.set(7, z2);
    }

    public boolean h() {
        return this.g != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.h != null;
    }

    public boolean j() {
        return this.i != null;
    }

    public boolean k() {
        return this.j != null;
    }

    public boolean l() {
        return this.k != null;
    }

    public boolean m() {
        return this.s.get(0);
    }

    public boolean n() {
        return this.s.get(1);
    }

    public boolean o() {
        return this.l != null;
    }

    public boolean p() {
        return this.m != null;
    }

    public boolean q() {
        return this.n != null;
    }

    public boolean r() {
        return this.o != null;
    }

    public boolean s() {
        return this.s.get(2);
    }

    public boolean t() {
        return this.f133a != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        boolean z3 = false;
        if (m3726a()) {
            sb.append("debug:");
            String str = this.f135a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m3728b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            dk dkVar = this.f134a;
            if (dkVar == null) {
                sb.append("null");
            } else {
                sb.append(dkVar);
            }
        } else {
            z3 = z2;
        }
        if (!z3) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f139b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.aw.a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f141c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(", ");
        sb.append("token:");
        String str6 = this.f;
        if (str6 == null) {
            sb.append("null");
        } else {
            sb.append(str6);
        }
        if (h()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str7 = this.g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str8 = this.h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            String str9 = this.i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            String str10 = this.j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            String str11 = this.k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.b);
        }
        if (o()) {
            sb.append(", ");
            sb.append("androidId:");
            String str12 = this.l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("imei:");
            String str13 = this.m;
            if (str13 == null) {
                sb.append("null");
            } else {
                sb.append(str13);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("serial:");
            String str14 = this.n;
            if (str14 == null) {
                sb.append("null");
            } else {
                sb.append(str14);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str15 = this.o;
            if (str15 == null) {
                sb.append("null");
            } else {
                sb.append(str15);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.c);
        }
        if (t()) {
            sb.append(", ");
            sb.append("reason:");
            dj djVar = this.f133a;
            if (djVar == null) {
                sb.append("null");
            } else {
                sb.append(djVar);
            }
        }
        if (u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.f137a);
        }
        if (v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f132a);
        }
        if (w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f138b);
        }
        if (x()) {
            sb.append(", ");
            sb.append("subImei:");
            String str16 = this.p;
            if (str16 == null) {
                sb.append("null");
            } else {
                sb.append(str16);
            }
        }
        if (y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            String str17 = this.q;
            if (str17 == null) {
                sb.append("null");
            } else {
                sb.append(str17);
            }
        }
        if (z()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f140b);
        }
        if (A()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            Map<String, String> map = this.f136a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (B()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f142c);
        }
        if (C()) {
            sb.append(", ");
            sb.append("oldRegId:");
            String str18 = this.r;
            if (str18 == null) {
                sb.append("null");
            } else {
                sb.append(str18);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public boolean u() {
        return this.s.get(3);
    }

    public boolean v() {
        return this.s.get(4);
    }

    public boolean w() {
        return this.s.get(5);
    }

    public boolean x() {
        return this.p != null;
    }

    public boolean y() {
        return this.q != null;
    }

    public boolean z() {
        return this.s.get(6);
    }
}
