package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class dv implements ef<dv, Object>, Serializable, Cloneable {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f143a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f144a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f145a;
    public int b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f146b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f147b;
    public long c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f148c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    private BitSet m = new BitSet(5);
    private static final eu n = new eu("XmPushActionRegistrationResult");
    private static final em o = new em("", (byte) 11, 1);
    private static final em p = new em("", (byte) 12, 2);
    private static final em q = new em("", (byte) 11, 3);
    private static final em r = new em("", (byte) 11, 4);
    private static final em s = new em("", (byte) 10, 6);
    private static final em t = new em("", (byte) 11, 7);
    private static final em u = new em("", (byte) 11, 8);
    private static final em v = new em("", (byte) 11, 9);
    private static final em w = new em("", (byte) 11, 10);
    private static final em x = new em("", (byte) 10, 11);
    private static final em y = new em("", (byte) 11, 12);
    private static final em z = new em("", (byte) 11, 13);
    private static final em A = new em("", (byte) 10, 14);
    private static final em B = new em("", (byte) 11, 15);
    private static final em C = new em("", (byte) 8, 16);
    private static final em D = new em("", (byte) 11, 17);
    private static final em E = new em("", (byte) 8, 18);
    private static final em F = new em("", (byte) 11, 19);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dv dvVar) {
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
        if (!getClass().equals(dvVar.getClass())) {
            return getClass().getName().compareTo(dvVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3732a()).compareTo(Boolean.valueOf(dvVar.m3732a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3732a() && (iA18 = eg.a(this.f145a, dvVar.f145a)) != 0) {
            return iA18;
        }
        int iCompareTo2 = Boolean.valueOf(m3734b()).compareTo(Boolean.valueOf(dvVar.m3734b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3734b() && (iA17 = eg.a(this.f144a, dvVar.f144a)) != 0) {
            return iA17;
        }
        int iCompareTo3 = Boolean.valueOf(m3735c()).compareTo(Boolean.valueOf(dvVar.m3735c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3735c() && (iA16 = eg.a(this.f147b, dvVar.f147b)) != 0) {
            return iA16;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dvVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA15 = eg.a(this.f148c, dvVar.f148c)) != 0) {
            return iA15;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dvVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA14 = eg.a(this.f143a, dvVar.f143a)) != 0) {
            return iA14;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dvVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA13 = eg.a(this.d, dvVar.d)) != 0) {
            return iA13;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dvVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA12 = eg.a(this.e, dvVar.e)) != 0) {
            return iA12;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dvVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA11 = eg.a(this.f, dvVar.f)) != 0) {
            return iA11;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(dvVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA10 = eg.a(this.g, dvVar.g)) != 0) {
            return iA10;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(dvVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA9 = eg.a(this.f146b, dvVar.f146b)) != 0) {
            return iA9;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(dvVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA8 = eg.a(this.h, dvVar.h)) != 0) {
            return iA8;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(dvVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA7 = eg.a(this.i, dvVar.i)) != 0) {
            return iA7;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(dvVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA6 = eg.a(this.c, dvVar.c)) != 0) {
            return iA6;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(dvVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA5 = eg.a(this.j, dvVar.j)) != 0) {
            return iA5;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(dvVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iA4 = eg.a(this.a, dvVar.a)) != 0) {
            return iA4;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(dvVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iA3 = eg.a(this.k, dvVar.k)) != 0) {
            return iA3;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(dvVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iA2 = eg.a(this.b, dvVar.b)) != 0) {
            return iA2;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(dvVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (!r() || (iA = eg.a(this.l, dvVar.l)) == 0) {
            return 0;
        }
        return iA;
    }

    public long a() {
        return this.f143a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3730a() {
        return this.f147b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3731a() throws eq {
        if (this.f147b == null) {
            throw new eq("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f148c != null) {
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
                    m3731a();
                    return;
                }
                throw new eq("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f145a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f144a = dkVar;
                        dkVar.a(epVar);
                    }
                    epVar.g();
                    break;
                case 3:
                    if (b == 11) {
                        this.f147b = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 4:
                    if (b == 11) {
                        this.f148c = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 6:
                    if (b == 10) {
                        this.f143a = epVar.mo3772a();
                        a(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 7:
                    if (b == 11) {
                        this.d = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 8:
                    if (b == 11) {
                        this.e = epVar.mo3778a();
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
                    if (b == 10) {
                        this.f146b = epVar.mo3772a();
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
                    if (b == 10) {
                        this.c = epVar.mo3772a();
                        c(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 15:
                    if (b == 11) {
                        this.j = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 16:
                    if (b == 8) {
                        this.a = epVar.mo3771a();
                        d(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 17:
                    if (b == 11) {
                        this.k = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 18:
                    if (b == 8) {
                        this.b = epVar.mo3771a();
                        e(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 19:
                    if (b == 11) {
                        this.l = epVar.mo3778a();
                        continue;
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
    public boolean m3732a() {
        return this.f145a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3733a(dv dvVar) {
        if (dvVar == null) {
            return false;
        }
        boolean zM3732a = m3732a();
        boolean zM3732a2 = dvVar.m3732a();
        if ((zM3732a || zM3732a2) && !(zM3732a && zM3732a2 && this.f145a.equals(dvVar.f145a))) {
            return false;
        }
        boolean zM3734b = m3734b();
        boolean zM3734b2 = dvVar.m3734b();
        if ((zM3734b || zM3734b2) && !(zM3734b && zM3734b2 && this.f144a.m3682a(dvVar.f144a))) {
            return false;
        }
        boolean zM3735c = m3735c();
        boolean zM3735c2 = dvVar.m3735c();
        if ((zM3735c || zM3735c2) && !(zM3735c && zM3735c2 && this.f147b.equals(dvVar.f147b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dvVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f148c.equals(dvVar.f148c))) || this.f143a != dvVar.f143a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dvVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.d.equals(dvVar.d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dvVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(dvVar.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dvVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f.equals(dvVar.f))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = dvVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.g.equals(dvVar.g))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = dvVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f146b == dvVar.f146b)) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = dvVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.h.equals(dvVar.h))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = dvVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.i.equals(dvVar.i))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = dvVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.c == dvVar.c)) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = dvVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.j.equals(dvVar.j))) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = dvVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.a == dvVar.a)) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = dvVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.k.equals(dvVar.k))) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = dvVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.b == dvVar.b)) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = dvVar.r();
        if (zR || zR2) {
            return zR && zR2 && this.l.equals(dvVar.l);
        }
        return true;
    }

    public String b() {
        return this.f;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3731a();
        epVar.a(n);
        if (this.f145a != null && m3732a()) {
            epVar.a(o);
            epVar.a(this.f145a);
            epVar.b();
        }
        if (this.f144a != null && m3734b()) {
            epVar.a(p);
            this.f144a.b(epVar);
            epVar.b();
        }
        if (this.f147b != null) {
            epVar.a(q);
            epVar.a(this.f147b);
            epVar.b();
        }
        if (this.f148c != null) {
            epVar.a(r);
            epVar.a(this.f148c);
            epVar.b();
        }
        epVar.a(s);
        epVar.a(this.f143a);
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
        if (this.f != null && h()) {
            epVar.a(v);
            epVar.a(this.f);
            epVar.b();
        }
        if (this.g != null && i()) {
            epVar.a(w);
            epVar.a(this.g);
            epVar.b();
        }
        if (j()) {
            epVar.a(x);
            epVar.a(this.f146b);
            epVar.b();
        }
        if (this.h != null && k()) {
            epVar.a(y);
            epVar.a(this.h);
            epVar.b();
        }
        if (this.i != null && l()) {
            epVar.a(z);
            epVar.a(this.i);
            epVar.b();
        }
        if (m()) {
            epVar.a(A);
            epVar.a(this.c);
            epVar.b();
        }
        if (this.j != null && n()) {
            epVar.a(B);
            epVar.a(this.j);
            epVar.b();
        }
        if (o()) {
            epVar.a(C);
            epVar.mo3782a(this.a);
            epVar.b();
        }
        if (this.k != null && p()) {
            epVar.a(D);
            epVar.a(this.k);
            epVar.b();
        }
        if (q()) {
            epVar.a(E);
            epVar.mo3782a(this.b);
            epVar.b();
        }
        if (this.l != null && r()) {
            epVar.a(F);
            epVar.a(this.l);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z2) {
        this.m.set(1, z2);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3734b() {
        return this.f144a != null;
    }

    public String c() {
        return this.g;
    }

    public void c(boolean z2) {
        this.m.set(2, z2);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3735c() {
        return this.f147b != null;
    }

    public void d(boolean z2) {
        this.m.set(3, z2);
    }

    public boolean d() {
        return this.f148c != null;
    }

    public void e(boolean z2) {
        this.m.set(4, z2);
    }

    public boolean e() {
        return this.m.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dv)) {
            return m3733a((dv) obj);
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
        return this.f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.g != null;
    }

    public boolean j() {
        return this.m.get(1);
    }

    public boolean k() {
        return this.h != null;
    }

    public boolean l() {
        return this.i != null;
    }

    public boolean m() {
        return this.m.get(2);
    }

    public boolean n() {
        return this.j != null;
    }

    public boolean o() {
        return this.m.get(3);
    }

    public boolean p() {
        return this.k != null;
    }

    public boolean q() {
        return this.m.get(4);
    }

    public boolean r() {
        return this.l != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z3 = false;
        if (m3732a()) {
            sb.append("debug:");
            String str = this.f145a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m3734b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            dk dkVar = this.f144a;
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
        String str2 = this.f147b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.aw.a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f148c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f143a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("regId:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.g;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f146b);
        }
        if (k()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str7 = this.h;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("clientId:");
            String str8 = this.i;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.c);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str9 = this.j;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            String str10 = this.k;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.b);
        }
        if (r()) {
            sb.append(", ");
            sb.append("region:");
            String str11 = this.l;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
