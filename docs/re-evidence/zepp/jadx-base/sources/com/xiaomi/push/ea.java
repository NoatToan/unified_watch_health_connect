package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class ea implements ef<ea, Object>, Serializable, Cloneable {
    private static final eu k = new eu("XmPushActionUnRegistration");
    private static final em l = new em("", (byte) 11, 1);
    private static final em m = new em("", (byte) 12, 2);
    private static final em n = new em("", (byte) 11, 3);
    private static final em o = new em("", (byte) 11, 4);
    private static final em p = new em("", (byte) 11, 5);
    private static final em q = new em("", (byte) 11, 6);
    private static final em r = new em("", (byte) 11, 7);
    private static final em s = new em("", (byte) 11, 8);
    private static final em t = new em("", (byte) 11, 9);
    private static final em u = new em("", (byte) 11, 10);
    private static final em v = new em("", (byte) 2, 11);
    private static final em w = new em("", (byte) 10, 12);
    public long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f159a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f160a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    private BitSet j = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f161a = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ea eaVar) {
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
        if (!getClass().equals(eaVar.getClass())) {
            return getClass().getName().compareTo(eaVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3756a()).compareTo(Boolean.valueOf(eaVar.m3756a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3756a() && (iA12 = eg.a(this.f160a, eaVar.f160a)) != 0) {
            return iA12;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(eaVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA11 = eg.a(this.f159a, eaVar.f159a)) != 0) {
            return iA11;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(eaVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA10 = eg.a(this.b, eaVar.b)) != 0) {
            return iA10;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(eaVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA9 = eg.a(this.c, eaVar.c)) != 0) {
            return iA9;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(eaVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA8 = eg.a(this.d, eaVar.d)) != 0) {
            return iA8;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(eaVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA7 = eg.a(this.e, eaVar.e)) != 0) {
            return iA7;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(eaVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA6 = eg.a(this.f, eaVar.f)) != 0) {
            return iA6;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(eaVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA5 = eg.a(this.g, eaVar.g)) != 0) {
            return iA5;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(eaVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA4 = eg.a(this.h, eaVar.h)) != 0) {
            return iA4;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(eaVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA3 = eg.a(this.i, eaVar.i)) != 0) {
            return iA3;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(eaVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA2 = eg.a(this.f161a, eaVar.f161a)) != 0) {
            return iA2;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(eaVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!l() || (iA = eg.a(this.a, eaVar.a)) == 0) {
            return 0;
        }
        return iA;
    }

    public ea a(String str) {
        this.b = str;
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
                a();
                return;
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f160a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f159a = dkVar;
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
                    if (b == 2) {
                        this.f161a = epVar.mo3783a();
                        a(true);
                    }
                    epVar.g();
                    break;
                case 12:
                    if (b == 10) {
                        this.a = epVar.mo3772a();
                        b(true);
                    }
                    epVar.g();
                    break;
            }
            es.a(epVar, b);
            epVar.g();
        }
    }

    public void a(boolean z) {
        this.j.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3756a() {
        return this.f160a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3757a(ea eaVar) {
        if (eaVar == null) {
            return false;
        }
        boolean zM3756a = m3756a();
        boolean zM3756a2 = eaVar.m3756a();
        if ((zM3756a || zM3756a2) && !(zM3756a && zM3756a2 && this.f160a.equals(eaVar.f160a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = eaVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f159a.m3682a(eaVar.f159a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = eaVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.b.equals(eaVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = eaVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.c.equals(eaVar.c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = eaVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.d.equals(eaVar.d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = eaVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.e.equals(eaVar.e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = eaVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f.equals(eaVar.f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = eaVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.g.equals(eaVar.g))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = eaVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.h.equals(eaVar.h))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = eaVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.i.equals(eaVar.i))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = eaVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f161a == eaVar.f161a)) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = eaVar.l();
        if (zL || zL2) {
            return zL && zL2 && this.a == eaVar.a;
        }
        return true;
    }

    public ea b(String str) {
        this.c = str;
        return this;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        a();
        epVar.a(k);
        if (this.f160a != null && m3756a()) {
            epVar.a(l);
            epVar.a(this.f160a);
            epVar.b();
        }
        if (this.f159a != null && b()) {
            epVar.a(m);
            this.f159a.b(epVar);
            epVar.b();
        }
        if (this.b != null) {
            epVar.a(n);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.c != null) {
            epVar.a(o);
            epVar.a(this.c);
            epVar.b();
        }
        if (this.d != null && e()) {
            epVar.a(p);
            epVar.a(this.d);
            epVar.b();
        }
        if (this.e != null && f()) {
            epVar.a(q);
            epVar.a(this.e);
            epVar.b();
        }
        if (this.f != null && g()) {
            epVar.a(r);
            epVar.a(this.f);
            epVar.b();
        }
        if (this.g != null && h()) {
            epVar.a(s);
            epVar.a(this.g);
            epVar.b();
        }
        if (this.h != null && i()) {
            epVar.a(t);
            epVar.a(this.h);
            epVar.b();
        }
        if (this.i != null && j()) {
            epVar.a(u);
            epVar.a(this.i);
            epVar.b();
        }
        if (k()) {
            epVar.a(v);
            epVar.a(this.f161a);
            epVar.b();
        }
        if (l()) {
            epVar.a(w);
            epVar.a(this.a);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z) {
        this.j.set(1, z);
    }

    public boolean b() {
        return this.f159a != null;
    }

    public ea c(String str) {
        this.d = str;
        return this;
    }

    public boolean c() {
        return this.b != null;
    }

    public ea d(String str) {
        this.f = str;
        return this;
    }

    public boolean d() {
        return this.c != null;
    }

    public ea e(String str) {
        this.g = str;
        return this;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ea)) {
            return m3757a((ea) obj);
        }
        return false;
    }

    public boolean f() {
        return this.e != null;
    }

    public boolean g() {
        return this.f != null;
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
        return this.j.get(0);
    }

    public boolean l() {
        return this.j.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        boolean z2 = false;
        if (m3756a()) {
            sb.append("debug:");
            String str = this.f160a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            dk dkVar = this.f159a;
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
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("regId:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("token:");
            String str7 = this.g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str8 = this.h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f161a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.a);
        }
        sb.append(")");
        return sb.toString();
    }
}
