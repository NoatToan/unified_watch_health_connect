package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ec implements ef<ec, Object>, Serializable, Cloneable {
    private static final eu g = new eu("XmPushActionUnSubscription");
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
    public String f166a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f167a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ec ecVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        if (!getClass().equals(ecVar.getClass())) {
            return getClass().getName().compareTo(ecVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3761a()).compareTo(Boolean.valueOf(ecVar.m3761a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3761a() && (iA8 = eg.a(this.f166a, ecVar.f166a)) != 0) {
            return iA8;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ecVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA7 = eg.a(this.a, ecVar.a)) != 0) {
            return iA7;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ecVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA6 = eg.a(this.b, ecVar.b)) != 0) {
            return iA6;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ecVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA5 = eg.a(this.c, ecVar.c)) != 0) {
            return iA5;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ecVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA4 = eg.a(this.d, ecVar.d)) != 0) {
            return iA4;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ecVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA3 = eg.a(this.e, ecVar.e)) != 0) {
            return iA3;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ecVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA2 = eg.a(this.f, ecVar.f)) != 0) {
            return iA2;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ecVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!h() || (iA = eg.a(this.f167a, ecVar.f167a)) == 0) {
            return 0;
        }
        return iA;
    }

    public ec a(String str) {
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
                        this.f166a = epVar.mo3778a();
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
                        this.f167a = new ArrayList(enVarMo3774a.f174a);
                        for (int i2 = 0; i2 < enVarMo3774a.f174a; i2++) {
                            this.f167a.add(epVar.mo3778a());
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
    public boolean m3761a() {
        return this.f166a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3762a(ec ecVar) {
        if (ecVar == null) {
            return false;
        }
        boolean zM3761a = m3761a();
        boolean zM3761a2 = ecVar.m3761a();
        if ((zM3761a || zM3761a2) && !(zM3761a && zM3761a2 && this.f166a.equals(ecVar.f166a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = ecVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.a.m3682a(ecVar.a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = ecVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.b.equals(ecVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = ecVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.c.equals(ecVar.c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = ecVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.d.equals(ecVar.d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = ecVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.e.equals(ecVar.e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = ecVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f.equals(ecVar.f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = ecVar.h();
        if (zH || zH2) {
            return zH && zH2 && this.f167a.equals(ecVar.f167a);
        }
        return true;
    }

    public ec b(String str) {
        this.c = str;
        return this;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        a();
        epVar.a(g);
        if (this.f166a != null && m3761a()) {
            epVar.a(h);
            epVar.a(this.f166a);
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
        if (this.f167a != null && h()) {
            epVar.a(o);
            epVar.a(new en((byte) 11, this.f167a.size()));
            Iterator<String> it2 = this.f167a.iterator();
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

    public ec c(String str) {
        this.d = str;
        return this;
    }

    public boolean c() {
        return this.b != null;
    }

    public ec d(String str) {
        this.e = str;
        return this;
    }

    public boolean d() {
        return this.c != null;
    }

    public ec e(String str) {
        this.f = str;
        return this;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ec)) {
            return m3762a((ec) obj);
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
        return this.f167a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (m3761a()) {
            sb.append("debug:");
            String str = this.f166a;
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
            List<String> list = this.f167a;
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
