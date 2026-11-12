package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class eb implements ef<eb, Object>, Serializable, Cloneable {
    private static final eu g = new eu("XmPushActionUnRegistrationResult");
    private static final em h = new em("", (byte) 11, 1);
    private static final em i = new em("", (byte) 12, 2);
    private static final em j = new em("", (byte) 11, 3);
    private static final em k = new em("", (byte) 11, 4);
    private static final em l = new em("", (byte) 10, 6);
    private static final em m = new em("", (byte) 11, 7);
    private static final em n = new em("", (byte) 11, 8);
    private static final em o = new em("", (byte) 10, 9);
    private static final em p = new em("", (byte) 10, 10);
    public long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f162a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f163a;
    public long b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f164b;
    public long c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f165c;
    public String d;
    public String e;
    private BitSet f = new BitSet(3);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(eb ebVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        if (!getClass().equals(ebVar.getClass())) {
            return getClass().getName().compareTo(ebVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3759a()).compareTo(Boolean.valueOf(ebVar.m3759a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3759a() && (iA9 = eg.a(this.f163a, ebVar.f163a)) != 0) {
            return iA9;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ebVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA8 = eg.a(this.f162a, ebVar.f162a)) != 0) {
            return iA8;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ebVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA7 = eg.a(this.f164b, ebVar.f164b)) != 0) {
            return iA7;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ebVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA6 = eg.a(this.f165c, ebVar.f165c)) != 0) {
            return iA6;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ebVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA5 = eg.a(this.a, ebVar.a)) != 0) {
            return iA5;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ebVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA4 = eg.a(this.d, ebVar.d)) != 0) {
            return iA4;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ebVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA3 = eg.a(this.e, ebVar.e)) != 0) {
            return iA3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ebVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA2 = eg.a(this.b, ebVar.b)) != 0) {
            return iA2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ebVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!i() || (iA = eg.a(this.c, ebVar.c)) == 0) {
            return 0;
        }
        return iA;
    }

    public String a() {
        return this.e;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3758a() throws eq {
        if (this.f164b == null) {
            throw new eq("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f165c != null) {
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
                    m3758a();
                    return;
                }
                throw new eq("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f163a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f162a = dkVar;
                        dkVar.a(epVar);
                    }
                    epVar.g();
                    break;
                case 3:
                    if (b == 11) {
                        this.f164b = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 4:
                    if (b == 11) {
                        this.f165c = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 6:
                    if (b == 10) {
                        this.a = epVar.mo3772a();
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
                    if (b == 10) {
                        this.b = epVar.mo3772a();
                        b(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 10:
                    if (b == 10) {
                        this.c = epVar.mo3772a();
                        c(true);
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
        this.f.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3759a() {
        return this.f163a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3760a(eb ebVar) {
        if (ebVar == null) {
            return false;
        }
        boolean zM3759a = m3759a();
        boolean zM3759a2 = ebVar.m3759a();
        if ((zM3759a || zM3759a2) && !(zM3759a && zM3759a2 && this.f163a.equals(ebVar.f163a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = ebVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f162a.m3682a(ebVar.f162a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = ebVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f164b.equals(ebVar.f164b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = ebVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f165c.equals(ebVar.f165c))) || this.a != ebVar.a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = ebVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.d.equals(ebVar.d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = ebVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(ebVar.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = ebVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.b == ebVar.b)) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = ebVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.c == ebVar.c;
        }
        return true;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3758a();
        epVar.a(g);
        if (this.f163a != null && m3759a()) {
            epVar.a(h);
            epVar.a(this.f163a);
            epVar.b();
        }
        if (this.f162a != null && b()) {
            epVar.a(i);
            this.f162a.b(epVar);
            epVar.b();
        }
        if (this.f164b != null) {
            epVar.a(j);
            epVar.a(this.f164b);
            epVar.b();
        }
        if (this.f165c != null) {
            epVar.a(k);
            epVar.a(this.f165c);
            epVar.b();
        }
        epVar.a(l);
        epVar.a(this.a);
        epVar.b();
        if (this.d != null && f()) {
            epVar.a(m);
            epVar.a(this.d);
            epVar.b();
        }
        if (this.e != null && g()) {
            epVar.a(n);
            epVar.a(this.e);
            epVar.b();
        }
        if (h()) {
            epVar.a(o);
            epVar.a(this.b);
            epVar.b();
        }
        if (i()) {
            epVar.a(p);
            epVar.a(this.c);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z) {
        this.f.set(1, z);
    }

    public boolean b() {
        return this.f162a != null;
    }

    public void c(boolean z) {
        this.f.set(2, z);
    }

    public boolean c() {
        return this.f164b != null;
    }

    public boolean d() {
        return this.f165c != null;
    }

    public boolean e() {
        return this.f.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof eb)) {
            return m3760a((eb) obj);
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
        return this.f.get(1);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = false;
        if (m3759a()) {
            sb.append("debug:");
            String str = this.f163a;
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
            dk dkVar = this.f162a;
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
        String str2 = this.f164b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f165c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.a);
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
            sb.append("packageName:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.c);
        }
        sb.append(")");
        return sb.toString();
    }
}
