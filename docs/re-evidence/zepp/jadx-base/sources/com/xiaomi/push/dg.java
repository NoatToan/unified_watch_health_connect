package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class dg implements ef<dg, Object>, Serializable, Cloneable {
    private static final eu e = new eu("OnlineConfigItem");
    private static final em f = new em("", (byte) 8, 1);
    private static final em g = new em("", (byte) 8, 2);
    private static final em h = new em("", (byte) 2, 3);
    private static final em i = new em("", (byte) 8, 4);
    private static final em j = new em("", (byte) 10, 5);
    private static final em k = new em("", (byte) 11, 6);
    private static final em l = new em("", (byte) 2, 7);
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f78a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f79a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f80a;
    public int b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f81b;
    public int c;
    private BitSet d = new BitSet(6);

    public int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dg dgVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        if (!getClass().equals(dgVar.getClass())) {
            return getClass().getName().compareTo(dgVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3658a()).compareTo(Boolean.valueOf(dgVar.m3658a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3658a() && (iA7 = eg.a(this.a, dgVar.a)) != 0) {
            return iA7;
        }
        int iCompareTo2 = Boolean.valueOf(m3660b()).compareTo(Boolean.valueOf(dgVar.m3660b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3660b() && (iA6 = eg.a(this.b, dgVar.b)) != 0) {
            return iA6;
        }
        int iCompareTo3 = Boolean.valueOf(m3661c()).compareTo(Boolean.valueOf(dgVar.m3661c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3661c() && (iA5 = eg.a(this.f80a, dgVar.f80a)) != 0) {
            return iA5;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dgVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA4 = eg.a(this.c, dgVar.c)) != 0) {
            return iA4;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dgVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA3 = eg.a(this.f78a, dgVar.f78a)) != 0) {
            return iA3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dgVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA2 = eg.a(this.f79a, dgVar.f79a)) != 0) {
            return iA2;
        }
        int iCompareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dgVar.h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!h() || (iA = eg.a(this.f81b, dgVar.f81b)) == 0) {
            return 0;
        }
        return iA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m3655a() {
        return this.f78a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3656a() {
        return this.f79a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3657a() {
    }

    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                epVar.f();
                m3657a();
                return;
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 8) {
                        this.a = epVar.mo3771a();
                        a(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 8) {
                        this.b = epVar.mo3771a();
                        b(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 3:
                    if (b == 2) {
                        this.f80a = epVar.mo3783a();
                        c(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 4:
                    if (b == 8) {
                        this.c = epVar.mo3771a();
                        d(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 5:
                    if (b == 10) {
                        this.f78a = epVar.mo3772a();
                        e(true);
                    }
                    epVar.g();
                    break;
                case 6:
                    if (b == 11) {
                        this.f79a = epVar.mo3778a();
                    }
                    epVar.g();
                    break;
                case 7:
                    if (b == 2) {
                        this.f81b = epVar.mo3783a();
                        f(true);
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
        this.d.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3658a() {
        return this.d.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3659a(dg dgVar) {
        if (dgVar == null) {
            return false;
        }
        boolean zM3658a = m3658a();
        boolean zM3658a2 = dgVar.m3658a();
        if ((zM3658a || zM3658a2) && !(zM3658a && zM3658a2 && this.a == dgVar.a)) {
            return false;
        }
        boolean zM3660b = m3660b();
        boolean zM3660b2 = dgVar.m3660b();
        if ((zM3660b || zM3660b2) && !(zM3660b && zM3660b2 && this.b == dgVar.b)) {
            return false;
        }
        boolean zM3661c = m3661c();
        boolean zM3661c2 = dgVar.m3661c();
        if ((zM3661c || zM3661c2) && !(zM3661c && zM3661c2 && this.f80a == dgVar.f80a)) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dgVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.c == dgVar.c)) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = dgVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f78a == dgVar.f78a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dgVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f79a.equals(dgVar.f79a))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dgVar.h();
        if (zH || zH2) {
            return zH && zH2 && this.f81b == dgVar.f81b;
        }
        return true;
    }

    public int b() {
        return this.b;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) {
        m3657a();
        epVar.a(e);
        if (m3658a()) {
            epVar.a(f);
            epVar.mo3782a(this.a);
            epVar.b();
        }
        if (m3660b()) {
            epVar.a(g);
            epVar.mo3782a(this.b);
            epVar.b();
        }
        if (m3661c()) {
            epVar.a(h);
            epVar.a(this.f80a);
            epVar.b();
        }
        if (d()) {
            epVar.a(i);
            epVar.mo3782a(this.c);
            epVar.b();
        }
        if (e()) {
            epVar.a(j);
            epVar.a(this.f78a);
            epVar.b();
        }
        if (this.f79a != null && f()) {
            epVar.a(k);
            epVar.a(this.f79a);
            epVar.b();
        }
        if (h()) {
            epVar.a(l);
            epVar.a(this.f81b);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z) {
        this.d.set(1, z);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3660b() {
        return this.d.get(1);
    }

    public int c() {
        return this.c;
    }

    public void c(boolean z) {
        this.d.set(2, z);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3661c() {
        return this.d.get(2);
    }

    public void d(boolean z) {
        this.d.set(3, z);
    }

    public boolean d() {
        return this.d.get(3);
    }

    public void e(boolean z) {
        this.d.set(4, z);
    }

    public boolean e() {
        return this.d.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dg)) {
            return m3659a((dg) obj);
        }
        return false;
    }

    public void f(boolean z) {
        this.d.set(5, z);
    }

    public boolean f() {
        return this.f79a != null;
    }

    public boolean g() {
        return this.f81b;
    }

    public boolean h() {
        return this.d.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (m3658a()) {
            sb.append("key:");
            sb.append(this.a);
            z = false;
        } else {
            z = true;
        }
        if (m3660b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.b);
            z = false;
        }
        if (m3661c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f80a);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.c);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f78a);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f79a;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
        } else {
            z2 = z;
        }
        if (h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f81b);
        }
        sb.append(")");
        return sb.toString();
    }
}
