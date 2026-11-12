package com.xiaomi.push;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class dh implements ef<dh, Object>, Serializable, Cloneable {
    public long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public di f82a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f83a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f84a;
    public long b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f86b;
    public long c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f87c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    private static final eu n = new eu("PushMessage");
    private static final em o = new em("", (byte) 12, 1);
    private static final em p = new em("", (byte) 11, 2);
    private static final em q = new em("", (byte) 11, 3);
    private static final em r = new em("", (byte) 11, 4);
    private static final em s = new em("", (byte) 10, 5);
    private static final em t = new em("", (byte) 10, 6);
    private static final em u = new em("", (byte) 11, 7);
    private static final em v = new em("", (byte) 11, 8);
    private static final em w = new em("", (byte) 11, 9);
    private static final em x = new em("", (byte) 11, 10);
    private static final em y = new em("", (byte) 11, 11);
    private static final em z = new em("", (byte) 12, 12);
    private static final em A = new em("", (byte) 11, 13);
    private static final em B = new em("", (byte) 2, 14);
    private static final em C = new em("", (byte) 11, 15);
    private static final em D = new em("", (byte) 10, 16);
    private static final em E = new em("", (byte) 11, 20);
    private static final em F = new em("", (byte) 11, 21);
    private BitSet m = new BitSet(4);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f85a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dh dhVar) {
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
        if (!getClass().equals(dhVar.getClass())) {
            return getClass().getName().compareTo(dhVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3664a()).compareTo(Boolean.valueOf(dhVar.m3664a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3664a() && (iA18 = eg.a(this.f83a, dhVar.f83a)) != 0) {
            return iA18;
        }
        int iCompareTo2 = Boolean.valueOf(m3666b()).compareTo(Boolean.valueOf(dhVar.m3666b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3666b() && (iA17 = eg.a(this.f84a, dhVar.f84a)) != 0) {
            return iA17;
        }
        int iCompareTo3 = Boolean.valueOf(m3667c()).compareTo(Boolean.valueOf(dhVar.m3667c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3667c() && (iA16 = eg.a(this.f86b, dhVar.f86b)) != 0) {
            return iA16;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dhVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA15 = eg.a(this.f87c, dhVar.f87c)) != 0) {
            return iA15;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dhVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA14 = eg.a(this.a, dhVar.a)) != 0) {
            return iA14;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dhVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA13 = eg.a(this.b, dhVar.b)) != 0) {
            return iA13;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dhVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA12 = eg.a(this.d, dhVar.d)) != 0) {
            return iA12;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dhVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA11 = eg.a(this.e, dhVar.e)) != 0) {
            return iA11;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(dhVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA10 = eg.a(this.f, dhVar.f)) != 0) {
            return iA10;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(dhVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA9 = eg.a(this.g, dhVar.g)) != 0) {
            return iA9;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(dhVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA8 = eg.a(this.h, dhVar.h)) != 0) {
            return iA8;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(dhVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA7 = eg.a(this.f82a, dhVar.f82a)) != 0) {
            return iA7;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(dhVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA6 = eg.a(this.i, dhVar.i)) != 0) {
            return iA6;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(dhVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA5 = eg.a(this.f85a, dhVar.f85a)) != 0) {
            return iA5;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(dhVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iA4 = eg.a(this.j, dhVar.j)) != 0) {
            return iA4;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(dhVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iA3 = eg.a(this.c, dhVar.c)) != 0) {
            return iA3;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(dhVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iA2 = eg.a(this.k, dhVar.k)) != 0) {
            return iA2;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(dhVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (!r() || (iA = eg.a(this.l, dhVar.l)) == 0) {
            return 0;
        }
        return iA;
    }

    public long a() {
        return this.a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3662a() {
        return this.f84a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3663a() throws eq {
        if (this.f84a == null) {
            throw new eq("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f86b == null) {
            throw new eq("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f87c != null) {
            return;
        }
        throw new eq("Required field 'payload' was not present! Struct: " + toString());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                epVar.f();
                m3663a();
                return;
            }
            short s2 = emVarMo3773a.f173a;
            if (s2 != 20) {
                if (s2 != 21) {
                    switch (s2) {
                        case 1:
                            if (b == 12) {
                                dk dkVar = new dk();
                                this.f83a = dkVar;
                                dkVar.a(epVar);
                                continue;
                            }
                            break;
                        case 2:
                            if (b == 11) {
                                this.f84a = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 3:
                            if (b == 11) {
                                this.f86b = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 4:
                            if (b == 11) {
                                this.f87c = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 5:
                            if (b == 10) {
                                this.a = epVar.mo3772a();
                                a(true);
                                continue;
                            }
                            break;
                        case 6:
                            if (b == 10) {
                                this.b = epVar.mo3772a();
                                b(true);
                                continue;
                            }
                            break;
                        case 7:
                            if (b == 11) {
                                this.d = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 8:
                            if (b == 11) {
                                this.e = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 9:
                            if (b == 11) {
                                this.f = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 10:
                            if (b == 11) {
                                this.g = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 11:
                            if (b == 11) {
                                this.h = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 12:
                            if (b == 12) {
                                di diVar = new di();
                                this.f82a = diVar;
                                diVar.a(epVar);
                                continue;
                            }
                            break;
                        case 13:
                            if (b == 11) {
                                this.i = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 14:
                            if (b == 2) {
                                this.f85a = epVar.mo3783a();
                                c(true);
                            }
                            break;
                        case 15:
                            if (b == 11) {
                                this.j = epVar.mo3778a();
                                continue;
                            }
                            break;
                        case 16:
                            if (b == 10) {
                                this.c = epVar.mo3772a();
                                d(true);
                                continue;
                            }
                            break;
                    }
                    es.a(epVar, b);
                } else if (b == 11) {
                    this.l = epVar.mo3778a();
                } else {
                    es.a(epVar, b);
                }
            } else if (b == 11) {
                this.k = epVar.mo3778a();
            } else {
                es.a(epVar, b);
            }
            epVar.g();
        }
    }

    public void a(boolean z2) {
        this.m.set(0, z2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3664a() {
        return this.f83a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3665a(dh dhVar) {
        if (dhVar == null) {
            return false;
        }
        boolean zM3664a = m3664a();
        boolean zM3664a2 = dhVar.m3664a();
        if ((zM3664a || zM3664a2) && !(zM3664a && zM3664a2 && this.f83a.m3682a(dhVar.f83a))) {
            return false;
        }
        boolean zM3666b = m3666b();
        boolean zM3666b2 = dhVar.m3666b();
        if ((zM3666b || zM3666b2) && !(zM3666b && zM3666b2 && this.f84a.equals(dhVar.f84a))) {
            return false;
        }
        boolean zM3667c = m3667c();
        boolean zM3667c2 = dhVar.m3667c();
        if ((zM3667c || zM3667c2) && !(zM3667c && zM3667c2 && this.f86b.equals(dhVar.f86b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dhVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f87c.equals(dhVar.f87c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = dhVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.a == dhVar.a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dhVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.b == dhVar.b)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dhVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.d.equals(dhVar.d))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dhVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.e.equals(dhVar.e))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = dhVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f.equals(dhVar.f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = dhVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.g.equals(dhVar.g))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = dhVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.h.equals(dhVar.h))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = dhVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f82a.m3674a(dhVar.f82a))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = dhVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.i.equals(dhVar.i))) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = dhVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f85a == dhVar.f85a)) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = dhVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.j.equals(dhVar.j))) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = dhVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.c == dhVar.c)) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = dhVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.k.equals(dhVar.k))) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = dhVar.r();
        if (zR || zR2) {
            return zR && zR2 && this.l.equals(dhVar.l);
        }
        return true;
    }

    public String b() {
        return this.f86b;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3663a();
        epVar.a(n);
        if (this.f83a != null && m3664a()) {
            epVar.a(o);
            this.f83a.b(epVar);
            epVar.b();
        }
        if (this.f84a != null) {
            epVar.a(p);
            epVar.a(this.f84a);
            epVar.b();
        }
        if (this.f86b != null) {
            epVar.a(q);
            epVar.a(this.f86b);
            epVar.b();
        }
        if (this.f87c != null) {
            epVar.a(r);
            epVar.a(this.f87c);
            epVar.b();
        }
        if (e()) {
            epVar.a(s);
            epVar.a(this.a);
            epVar.b();
        }
        if (f()) {
            epVar.a(t);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.d != null && g()) {
            epVar.a(u);
            epVar.a(this.d);
            epVar.b();
        }
        if (this.e != null && h()) {
            epVar.a(v);
            epVar.a(this.e);
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
        if (this.h != null && k()) {
            epVar.a(y);
            epVar.a(this.h);
            epVar.b();
        }
        if (this.f82a != null && l()) {
            epVar.a(z);
            this.f82a.b(epVar);
            epVar.b();
        }
        if (this.i != null && m()) {
            epVar.a(A);
            epVar.a(this.i);
            epVar.b();
        }
        if (n()) {
            epVar.a(B);
            epVar.a(this.f85a);
            epVar.b();
        }
        if (this.j != null && o()) {
            epVar.a(C);
            epVar.a(this.j);
            epVar.b();
        }
        if (p()) {
            epVar.a(D);
            epVar.a(this.c);
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
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z2) {
        this.m.set(1, z2);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3666b() {
        return this.f84a != null;
    }

    public String c() {
        return this.f87c;
    }

    public void c(boolean z2) {
        this.m.set(2, z2);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3667c() {
        return this.f86b != null;
    }

    public void d(boolean z2) {
        this.m.set(3, z2);
    }

    public boolean d() {
        return this.f87c != null;
    }

    public boolean e() {
        return this.m.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dh)) {
            return m3665a((dh) obj);
        }
        return false;
    }

    public boolean f() {
        return this.m.get(1);
    }

    public boolean g() {
        return this.d != null;
    }

    public boolean h() {
        return this.e != null;
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
        return this.h != null;
    }

    public boolean l() {
        return this.f82a != null;
    }

    public boolean m() {
        return this.i != null;
    }

    public boolean n() {
        return this.m.get(2);
    }

    public boolean o() {
        return this.j != null;
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

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (m3664a()) {
            sb.append("to:");
            dk dkVar = this.f83a;
            if (dkVar == null) {
                sb.append("null");
            } else {
                sb.append(dkVar);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f84a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f86b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append(SDKConstants.PARAM_A2U_PAYLOAD);
        String str3 = this.f87c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.b);
        }
        if (g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("regId:");
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
            sb.append("topic:");
            String str8 = this.h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            di diVar = this.f82a;
            if (diVar == null) {
                sb.append("null");
            } else {
                sb.append(diVar);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f85a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.c);
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
        sb.append(")");
        return sb.toString();
    }
}
