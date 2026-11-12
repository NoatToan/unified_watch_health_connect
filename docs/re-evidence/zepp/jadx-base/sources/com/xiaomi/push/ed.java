package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class ed implements ef<ed, Object>, Serializable, Cloneable {
    private static final eu i = new eu("XmPushActionUnSubscriptionResult");
    private static final em j = new em("", (byte) 11, 1);
    private static final em k = new em("", (byte) 12, 2);
    private static final em l = new em("", (byte) 11, 3);
    private static final em m = new em("", (byte) 11, 4);
    private static final em n = new em("", (byte) 10, 6);
    private static final em o = new em("", (byte) 11, 7);
    private static final em p = new em("", (byte) 11, 8);
    private static final em q = new em("", (byte) 11, 9);
    private static final em r = new em("", (byte) 11, 10);
    public long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f168a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f169a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    private BitSet h = new BitSet(1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ed edVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        if (!getClass().equals(edVar.getClass())) {
            return getClass().getName().compareTo(edVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3764a()).compareTo(Boolean.valueOf(edVar.m3764a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3764a() && (iA9 = eg.a(this.f169a, edVar.f169a)) != 0) {
            return iA9;
        }
        int iCompareTo2 = Boolean.valueOf(m3766b()).compareTo(Boolean.valueOf(edVar.m3766b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3766b() && (iA8 = eg.a(this.f168a, edVar.f168a)) != 0) {
            return iA8;
        }
        int iCompareTo3 = Boolean.valueOf(m3767c()).compareTo(Boolean.valueOf(edVar.m3767c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3767c() && (iA7 = eg.a(this.b, edVar.b)) != 0) {
            return iA7;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(edVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA6 = eg.a(this.c, edVar.c)) != 0) {
            return iA6;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(edVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA5 = eg.a(this.a, edVar.a)) != 0) {
            return iA5;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(edVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA4 = eg.a(this.d, edVar.d)) != 0) {
            return iA4;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(edVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA3 = eg.a(this.e, edVar.e)) != 0) {
            return iA3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(edVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA2 = eg.a(this.f, edVar.f)) != 0) {
            return iA2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(edVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!i() || (iA = eg.a(this.g, edVar.g)) == 0) {
            return 0;
        }
        return iA;
    }

    public String a() {
        return this.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3763a() throws eq {
        if (this.b != null) {
            return;
        }
        throw new eq("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                epVar.f();
                m3763a();
                return;
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f169a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f168a = dkVar;
                        dkVar.a(epVar);
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
                case 6:
                    if (b == 10) {
                        this.a = epVar.mo3772a();
                        a(true);
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
            }
            es.a(epVar, b);
            epVar.g();
        }
    }

    public void a(boolean z) {
        this.h.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3764a() {
        return this.f169a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3765a(ed edVar) {
        if (edVar == null) {
            return false;
        }
        boolean zM3764a = m3764a();
        boolean zM3764a2 = edVar.m3764a();
        if ((zM3764a || zM3764a2) && !(zM3764a && zM3764a2 && this.f169a.equals(edVar.f169a))) {
            return false;
        }
        boolean zM3766b = m3766b();
        boolean zM3766b2 = edVar.m3766b();
        if ((zM3766b || zM3766b2) && !(zM3766b && zM3766b2 && this.f168a.m3682a(edVar.f168a))) {
            return false;
        }
        boolean zM3767c = m3767c();
        boolean zM3767c2 = edVar.m3767c();
        if ((zM3767c || zM3767c2) && !(zM3767c && zM3767c2 && this.b.equals(edVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = edVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.c.equals(edVar.c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = edVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.a == edVar.a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = edVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.d.equals(edVar.d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = edVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(edVar.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = edVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f.equals(edVar.f))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = edVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.g.equals(edVar.g);
        }
        return true;
    }

    public String b() {
        return this.e;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3763a();
        epVar.a(i);
        if (this.f169a != null && m3764a()) {
            epVar.a(j);
            epVar.a(this.f169a);
            epVar.b();
        }
        if (this.f168a != null && m3766b()) {
            epVar.a(k);
            this.f168a.b(epVar);
            epVar.b();
        }
        if (this.b != null) {
            epVar.a(l);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.c != null && d()) {
            epVar.a(m);
            epVar.a(this.c);
            epVar.b();
        }
        if (e()) {
            epVar.a(n);
            epVar.a(this.a);
            epVar.b();
        }
        if (this.d != null && f()) {
            epVar.a(o);
            epVar.a(this.d);
            epVar.b();
        }
        if (this.e != null && g()) {
            epVar.a(p);
            epVar.a(this.e);
            epVar.b();
        }
        if (this.f != null && h()) {
            epVar.a(q);
            epVar.a(this.f);
            epVar.b();
        }
        if (this.g != null && i()) {
            epVar.a(r);
            epVar.a(this.g);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3766b() {
        return this.f168a != null;
    }

    public String c() {
        return this.g;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3767c() {
        return this.b != null;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.h.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ed)) {
            return m3765a((ed) obj);
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

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (m3764a()) {
            sb.append("debug:");
            String str = this.f169a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m3766b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            dk dkVar = this.f168a;
            if (dkVar == null) {
                sb.append("null");
            } else {
                sb.append(dkVar);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.a);
        }
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
            sb.append("topic:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
