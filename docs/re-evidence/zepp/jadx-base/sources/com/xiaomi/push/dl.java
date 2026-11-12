package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class dl implements ef<dl, Object>, Serializable, Cloneable {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f100a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f101a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dx f102a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f103a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f104a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public short f105a;
    public String b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public short f107b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    private static final eu n = new eu("XmPushActionAckMessage");
    private static final em o = new em("", (byte) 11, 1);
    private static final em p = new em("", (byte) 12, 2);
    private static final em q = new em("", (byte) 11, 3);
    private static final em r = new em("", (byte) 11, 4);
    private static final em s = new em("", (byte) 10, 5);
    private static final em t = new em("", (byte) 11, 6);
    private static final em u = new em("", (byte) 11, 7);
    private static final em v = new em("", (byte) 12, 8);
    private static final em w = new em("", (byte) 11, 9);
    private static final em x = new em("", (byte) 11, 10);
    private static final em y = new em("", (byte) 2, 11);
    private static final em z = new em("", (byte) 11, 12);
    private static final em A = new em("", (byte) 11, 13);
    private static final em B = new em("", (byte) 11, 14);
    private static final em C = new em("", (byte) 6, 15);
    private static final em D = new em("", (byte) 6, 16);
    private static final em E = new em("", (byte) 11, 20);
    private static final em F = new em("", (byte) 11, 21);
    private static final em G = new em("", (byte) 8, 22);
    private static final em H = new em("", (byte) 13, 23);
    private BitSet m = new BitSet(5);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f106a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dl dlVar) {
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
        if (!getClass().equals(dlVar.getClass())) {
            return getClass().getName().compareTo(dlVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3683a()).compareTo(Boolean.valueOf(dlVar.m3683a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3683a() && (iA20 = eg.a(this.f103a, dlVar.f103a)) != 0) {
            return iA20;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(dlVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA19 = eg.a(this.f101a, dlVar.f101a)) != 0) {
            return iA19;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(dlVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA18 = eg.a(this.b, dlVar.b)) != 0) {
            return iA18;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dlVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA17 = eg.a(this.c, dlVar.c)) != 0) {
            return iA17;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dlVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA16 = eg.a(this.f100a, dlVar.f100a)) != 0) {
            return iA16;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dlVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA15 = eg.a(this.d, dlVar.d)) != 0) {
            return iA15;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dlVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA14 = eg.a(this.e, dlVar.e)) != 0) {
            return iA14;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dlVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA13 = eg.a(this.f102a, dlVar.f102a)) != 0) {
            return iA13;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(dlVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA12 = eg.a(this.f, dlVar.f)) != 0) {
            return iA12;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(dlVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA11 = eg.a(this.g, dlVar.g)) != 0) {
            return iA11;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(dlVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA10 = eg.a(this.f106a, dlVar.f106a)) != 0) {
            return iA10;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(dlVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA9 = eg.a(this.h, dlVar.h)) != 0) {
            return iA9;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(dlVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA8 = eg.a(this.i, dlVar.i)) != 0) {
            return iA8;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(dlVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA7 = eg.a(this.j, dlVar.j)) != 0) {
            return iA7;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(dlVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iA6 = eg.a(this.f105a, dlVar.f105a)) != 0) {
            return iA6;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(dlVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iA5 = eg.a(this.f107b, dlVar.f107b)) != 0) {
            return iA5;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(dlVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iA4 = eg.a(this.k, dlVar.k)) != 0) {
            return iA4;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(dlVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (r() && (iA3 = eg.a(this.l, dlVar.l)) != 0) {
            return iA3;
        }
        int iCompareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(dlVar.s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (s() && (iA2 = eg.a(this.a, dlVar.a)) != 0) {
            return iA2;
        }
        int iCompareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(dlVar.t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!t() || (iA = eg.a(this.f104a, dlVar.f104a)) == 0) {
            return 0;
        }
        return iA;
    }

    public dl a(long j) {
        this.f100a = j;
        a(true);
        return this;
    }

    public dl a(String str) {
        this.b = str;
        return this;
    }

    public dl a(short s2) {
        this.f105a = s2;
        c(true);
        return this;
    }

    public void a() throws eq {
        if (this.b == null) {
            throw new eq("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.c != null) {
            return;
        }
        throw new eq("Required field 'appId' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                epVar.f();
                if (e()) {
                    a();
                    return;
                }
                throw new eq("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f103a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f101a = dkVar;
                        dkVar.a(epVar);
                        continue;
                    }
                    epVar.g();
                    break;
                case 3:
                    if (b == 11) {
                        this.b = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 4:
                    if (b == 11) {
                        this.c = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 5:
                    if (b == 10) {
                        this.f100a = epVar.mo3772a();
                        a(true);
                    }
                    epVar.g();
                    break;
                case 6:
                    if (b == 11) {
                        this.d = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 7:
                    if (b == 11) {
                        this.e = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 8:
                    if (b == 12) {
                        dx dxVar = new dx();
                        this.f102a = dxVar;
                        dxVar.a(epVar);
                        continue;
                    }
                    epVar.g();
                    break;
                case 9:
                    if (b == 11) {
                        this.f = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 10:
                    if (b == 11) {
                        this.g = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 11:
                    if (b == 2) {
                        this.f106a = epVar.mo3783a();
                        b(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 12:
                    if (b == 11) {
                        this.h = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 13:
                    if (b == 11) {
                        this.i = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 14:
                    if (b == 11) {
                        this.j = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 15:
                    if (b == 6) {
                        this.f105a = epVar.mo3780a();
                        c(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 16:
                    if (b == 6) {
                        this.f107b = epVar.mo3780a();
                        d(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 20:
                    if (b == 11) {
                        this.k = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 21:
                    if (b == 11) {
                        this.l = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 22:
                    if (b == 8) {
                        this.a = epVar.mo3771a();
                        e(true);
                    }
                    epVar.g();
                    break;
                case 23:
                    if (b == 13) {
                        eo eoVarMo3775a = epVar.mo3775a();
                        this.f104a = new HashMap(eoVarMo3775a.f175a * 2);
                        for (int i = 0; i < eoVarMo3775a.f175a; i++) {
                            this.f104a.put(epVar.mo3778a(), epVar.mo3778a());
                        }
                        epVar.h();
                    }
                    epVar.g();
                    break;
            }
            es.a(epVar, b);
            epVar.g();
        }
    }

    public void a(boolean z2) {
        this.m.set(0, z2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3683a() {
        return this.f103a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3684a(dl dlVar) {
        if (dlVar == null) {
            return false;
        }
        boolean zM3683a = m3683a();
        boolean zM3683a2 = dlVar.m3683a();
        if ((zM3683a || zM3683a2) && !(zM3683a && zM3683a2 && this.f103a.equals(dlVar.f103a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = dlVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f101a.m3682a(dlVar.f101a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = dlVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.b.equals(dlVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dlVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.c.equals(dlVar.c))) || this.f100a != dlVar.f100a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dlVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.d.equals(dlVar.d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dlVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(dlVar.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dlVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f102a.m3741a(dlVar.f102a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = dlVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f.equals(dlVar.f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = dlVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.g.equals(dlVar.g))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = dlVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f106a == dlVar.f106a)) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = dlVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.h.equals(dlVar.h))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = dlVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.i.equals(dlVar.i))) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = dlVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.j.equals(dlVar.j))) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = dlVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.f105a == dlVar.f105a)) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = dlVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.f107b == dlVar.f107b)) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = dlVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.k.equals(dlVar.k))) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = dlVar.r();
        if ((zR || zR2) && !(zR && zR2 && this.l.equals(dlVar.l))) {
            return false;
        }
        boolean zS = s();
        boolean zS2 = dlVar.s();
        if ((zS || zS2) && !(zS && zS2 && this.a == dlVar.a)) {
            return false;
        }
        boolean zT = t();
        boolean zT2 = dlVar.t();
        if (zT || zT2) {
            return zT && zT2 && this.f104a.equals(dlVar.f104a);
        }
        return true;
    }

    public dl b(String str) {
        this.c = str;
        return this;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        a();
        epVar.a(n);
        if (this.f103a != null && m3683a()) {
            epVar.a(o);
            epVar.a(this.f103a);
            epVar.b();
        }
        if (this.f101a != null && b()) {
            epVar.a(p);
            this.f101a.b(epVar);
            epVar.b();
        }
        if (this.b != null) {
            epVar.a(q);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.c != null) {
            epVar.a(r);
            epVar.a(this.c);
            epVar.b();
        }
        epVar.a(s);
        epVar.a(this.f100a);
        epVar.b();
        if (this.d != null && f()) {
            epVar.a(t);
            epVar.a(this.d);
            epVar.b();
        }
        if (this.e != null && g()) {
            epVar.a(u);
            epVar.a(this.e);
            epVar.b();
        }
        if (this.f102a != null && h()) {
            epVar.a(v);
            this.f102a.b(epVar);
            epVar.b();
        }
        if (this.f != null && i()) {
            epVar.a(w);
            epVar.a(this.f);
            epVar.b();
        }
        if (this.g != null && j()) {
            epVar.a(x);
            epVar.a(this.g);
            epVar.b();
        }
        if (k()) {
            epVar.a(y);
            epVar.a(this.f106a);
            epVar.b();
        }
        if (this.h != null && l()) {
            epVar.a(z);
            epVar.a(this.h);
            epVar.b();
        }
        if (this.i != null && m()) {
            epVar.a(A);
            epVar.a(this.i);
            epVar.b();
        }
        if (this.j != null && n()) {
            epVar.a(B);
            epVar.a(this.j);
            epVar.b();
        }
        if (o()) {
            epVar.a(C);
            epVar.a(this.f105a);
            epVar.b();
        }
        if (p()) {
            epVar.a(D);
            epVar.a(this.f107b);
            epVar.b();
        }
        if (this.k != null && q()) {
            epVar.a(E);
            epVar.a(this.k);
            epVar.b();
        }
        if (this.l != null && r()) {
            epVar.a(F);
            epVar.a(this.l);
            epVar.b();
        }
        if (s()) {
            epVar.a(G);
            epVar.mo3782a(this.a);
            epVar.b();
        }
        if (this.f104a != null && t()) {
            epVar.a(H);
            epVar.a(new eo((byte) 11, (byte) 11, this.f104a.size()));
            for (Map.Entry<String, String> entry : this.f104a.entrySet()) {
                epVar.a(entry.getKey());
                epVar.a(entry.getValue());
            }
            epVar.d();
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z2) {
        this.m.set(1, z2);
    }

    public boolean b() {
        return this.f101a != null;
    }

    public dl c(String str) {
        this.d = str;
        return this;
    }

    public void c(boolean z2) {
        this.m.set(2, z2);
    }

    public boolean c() {
        return this.b != null;
    }

    public dl d(String str) {
        this.e = str;
        return this;
    }

    public void d(boolean z2) {
        this.m.set(3, z2);
    }

    public boolean d() {
        return this.c != null;
    }

    public void e(boolean z2) {
        this.m.set(4, z2);
    }

    public boolean e() {
        return this.m.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dl)) {
            return m3684a((dl) obj);
        }
        return false;
    }

    public boolean f() {
        return this.d != null;
    }

    public boolean g() {
        return this.e != null;
    }

    public boolean h() {
        return this.f102a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f != null;
    }

    public boolean j() {
        return this.g != null;
    }

    public boolean k() {
        return this.m.get(1);
    }

    public boolean l() {
        return this.h != null;
    }

    public boolean m() {
        return this.i != null;
    }

    public boolean n() {
        return this.j != null;
    }

    public boolean o() {
        return this.m.get(2);
    }

    public boolean p() {
        return this.m.get(3);
    }

    public boolean q() {
        return this.k != null;
    }

    public boolean r() {
        return this.l != null;
    }

    public boolean s() {
        return this.m.get(4);
    }

    public boolean t() {
        return this.f104a != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z3 = false;
        if (m3683a()) {
            sb.append("debug:");
            String str = this.f103a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            dk dkVar = this.f101a;
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
        String str2 = this.b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f100a);
        if (f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("request:");
            dx dxVar = this.f102a;
            if (dxVar == null) {
                sb.append("null");
            } else {
                sb.append(dxVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f106a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f105a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f107b);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f104a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
