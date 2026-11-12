package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class dy implements ef<dy, Object>, Serializable, Cloneable {
    private static final eu g = new eu("XmPushActionSubscription");
    private static final em h = new em("", (byte) 11, 1);
    private static final em i = new em("", (byte) 12, 2);
    private static final em j = new em("", (byte) 11, 3);
    private static final em k = new em("", (byte) 11, 4);
    private static final em l = new em("", (byte) 11, 5);
    private static final em m = new em("", (byte) 11, 6);
    private static final em n = new em("", (byte) 11, 7);
    private static final em o = new em("", (byte) 15, 8);
    public dk a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f155a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f156a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dy dyVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        if (!getClass().equals(dyVar.getClass())) {
            return getClass().getName().compareTo(dyVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3747a()).compareTo(Boolean.valueOf(dyVar.m3747a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3747a() && (iA8 = eg.a(this.f155a, dyVar.f155a)) != 0) {
            return iA8;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(dyVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA7 = eg.a(this.a, dyVar.a)) != 0) {
            return iA7;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(dyVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA6 = eg.a(this.b, dyVar.b)) != 0) {
            return iA6;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dyVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA5 = eg.a(this.c, dyVar.c)) != 0) {
            return iA5;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dyVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA4 = eg.a(this.d, dyVar.d)) != 0) {
            return iA4;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dyVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA3 = eg.a(this.e, dyVar.e)) != 0) {
            return iA3;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dyVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA2 = eg.a(this.f, dyVar.f)) != 0) {
            return iA2;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dyVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!h() || (iA = eg.a(this.f156a, dyVar.f156a)) == 0) {
            return 0;
        }
        return iA;
    }

    public dy a(String str) {
        this.b = str;
        return this;
    }

    public void a() throws eq {
        if (this.b == null) {
            throw new eq("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.c == null) {
            throw new eq("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.d != null) {
            return;
        }
        throw new eq("Required field 'topic' was not present! Struct: " + toString());
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
                        this.f155a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.a = dkVar;
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
                    if (b == 15) {
                        en enVarMo3774a = epVar.mo3774a();
                        this.f156a = new ArrayList(enVarMo3774a.f174a);
                        for (int i2 = 0; i2 < enVarMo3774a.f174a; i2++) {
                            this.f156a.add(epVar.mo3778a());
                        }
                        epVar.i();
                    }
                    epVar.g();
                    break;
            }
            es.a(epVar, b);
            epVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3747a() {
        return this.f155a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3748a(dy dyVar) {
        if (dyVar == null) {
            return false;
        }
        boolean zM3747a = m3747a();
        boolean zM3747a2 = dyVar.m3747a();
        if ((zM3747a || zM3747a2) && !(zM3747a && zM3747a2 && this.f155a.equals(dyVar.f155a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = dyVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.a.m3682a(dyVar.a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = dyVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.b.equals(dyVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dyVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.c.equals(dyVar.c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = dyVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.d.equals(dyVar.d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dyVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.e.equals(dyVar.e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dyVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f.equals(dyVar.f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dyVar.h();
        if (zH || zH2) {
            return zH && zH2 && this.f156a.equals(dyVar.f156a);
        }
        return true;
    }

    public dy b(String str) {
        this.c = str;
        return this;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        a();
        epVar.a(g);
        if (this.f155a != null && m3747a()) {
            epVar.a(h);
            epVar.a(this.f155a);
            epVar.b();
        }
        if (this.a != null && b()) {
            epVar.a(i);
            this.a.b(epVar);
            epVar.b();
        }
        if (this.b != null) {
            epVar.a(j);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.c != null) {
            epVar.a(k);
            epVar.a(this.c);
            epVar.b();
        }
        if (this.d != null) {
            epVar.a(l);
            epVar.a(this.d);
            epVar.b();
        }
        if (this.e != null && f()) {
            epVar.a(m);
            epVar.a(this.e);
            epVar.b();
        }
        if (this.f != null && g()) {
            epVar.a(n);
            epVar.a(this.f);
            epVar.b();
        }
        if (this.f156a != null && h()) {
            epVar.a(o);
            epVar.a(new en((byte) 11, this.f156a.size()));
            Iterator<String> it2 = this.f156a.iterator();
            while (it2.hasNext()) {
                epVar.a(it2.next());
            }
            epVar.e();
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public boolean b() {
        return this.a != null;
    }

    public dy c(String str) {
        this.d = str;
        return this;
    }

    public boolean c() {
        return this.b != null;
    }

    public dy d(String str) {
        this.e = str;
        return this;
    }

    public boolean d() {
        return this.c != null;
    }

    public dy e(String str) {
        this.f = str;
        return this;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dy)) {
            return m3748a((dy) obj);
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
        return this.f156a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (m3747a()) {
            sb.append("debug:");
            String str = this.f155a;
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
            dk dkVar = this.a;
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
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
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
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f156a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
