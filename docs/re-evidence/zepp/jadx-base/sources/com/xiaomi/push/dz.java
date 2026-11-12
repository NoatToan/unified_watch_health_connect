package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class dz implements ef<dz, Object>, Serializable, Cloneable {
    private static final eu i = new eu("XmPushActionSubscriptionResult");
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
    public dk f157a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f158a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    private BitSet h = new BitSet(1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dz dzVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        if (!getClass().equals(dzVar.getClass())) {
            return getClass().getName().compareTo(dzVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3750a()).compareTo(Boolean.valueOf(dzVar.m3750a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3750a() && (iA9 = eg.a(this.f158a, dzVar.f158a)) != 0) {
            return iA9;
        }
        int iCompareTo2 = Boolean.valueOf(m3752b()).compareTo(Boolean.valueOf(dzVar.m3752b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3752b() && (iA8 = eg.a(this.f157a, dzVar.f157a)) != 0) {
            return iA8;
        }
        int iCompareTo3 = Boolean.valueOf(m3753c()).compareTo(Boolean.valueOf(dzVar.m3753c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3753c() && (iA7 = eg.a(this.b, dzVar.b)) != 0) {
            return iA7;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dzVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA6 = eg.a(this.c, dzVar.c)) != 0) {
            return iA6;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dzVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA5 = eg.a(this.a, dzVar.a)) != 0) {
            return iA5;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dzVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA4 = eg.a(this.d, dzVar.d)) != 0) {
            return iA4;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dzVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA3 = eg.a(this.e, dzVar.e)) != 0) {
            return iA3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dzVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA2 = eg.a(this.f, dzVar.f)) != 0) {
            return iA2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(dzVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!i() || (iA = eg.a(this.g, dzVar.g)) == 0) {
            return 0;
        }
        return iA;
    }

    public String a() {
        return this.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3749a() throws eq {
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
                m3749a();
                return;
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f158a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f157a = dkVar;
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
    public boolean m3750a() {
        return this.f158a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3751a(dz dzVar) {
        if (dzVar == null) {
            return false;
        }
        boolean zM3750a = m3750a();
        boolean zM3750a2 = dzVar.m3750a();
        if ((zM3750a || zM3750a2) && !(zM3750a && zM3750a2 && this.f158a.equals(dzVar.f158a))) {
            return false;
        }
        boolean zM3752b = m3752b();
        boolean zM3752b2 = dzVar.m3752b();
        if ((zM3752b || zM3752b2) && !(zM3752b && zM3752b2 && this.f157a.m3682a(dzVar.f157a))) {
            return false;
        }
        boolean zM3753c = m3753c();
        boolean zM3753c2 = dzVar.m3753c();
        if ((zM3753c || zM3753c2) && !(zM3753c && zM3753c2 && this.b.equals(dzVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dzVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.c.equals(dzVar.c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = dzVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.a == dzVar.a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dzVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.d.equals(dzVar.d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dzVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(dzVar.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dzVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f.equals(dzVar.f))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = dzVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.g.equals(dzVar.g);
        }
        return true;
    }

    public String b() {
        return this.e;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3749a();
        epVar.a(i);
        if (this.f158a != null && m3750a()) {
            epVar.a(j);
            epVar.a(this.f158a);
            epVar.b();
        }
        if (this.f157a != null && m3752b()) {
            epVar.a(k);
            this.f157a.b(epVar);
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
    public boolean m3752b() {
        return this.f157a != null;
    }

    public String c() {
        return this.g;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3753c() {
        return this.b != null;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.h.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dz)) {
            return m3751a((dz) obj);
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
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = false;
        if (m3750a()) {
            sb.append("debug:");
            String str = this.f158a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m3752b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            dk dkVar = this.f157a;
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
