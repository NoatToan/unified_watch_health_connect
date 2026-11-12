package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class dm implements ef<dm, Object>, Serializable, Cloneable {
    private static final eu i = new eu("XmPushActionAckNotification");
    private static final em j = new em("", (byte) 11, 1);
    private static final em k = new em("", (byte) 12, 2);
    private static final em l = new em("", (byte) 11, 3);
    private static final em m = new em("", (byte) 11, 4);
    private static final em n = new em("", (byte) 11, 5);
    private static final em o = new em("", (byte) 10, 7);
    private static final em p = new em("", (byte) 11, 8);
    private static final em q = new em("", (byte) 13, 9);
    private static final em r = new em("", (byte) 11, 10);
    private static final em s = new em("", (byte) 11, 11);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f108a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f109a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f110a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    private BitSet h = new BitSet(1);
    public long a = 0;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dm dmVar) {
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
        if (!getClass().equals(dmVar.getClass())) {
            return getClass().getName().compareTo(dmVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3687a()).compareTo(Boolean.valueOf(dmVar.m3687a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3687a() && (iA10 = eg.a(this.f109a, dmVar.f109a)) != 0) {
            return iA10;
        }
        int iCompareTo2 = Boolean.valueOf(m3689b()).compareTo(Boolean.valueOf(dmVar.m3689b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3689b() && (iA9 = eg.a(this.f108a, dmVar.f108a)) != 0) {
            return iA9;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(dmVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA8 = eg.a(this.b, dmVar.b)) != 0) {
            return iA8;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dmVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA7 = eg.a(this.c, dmVar.c)) != 0) {
            return iA7;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dmVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA6 = eg.a(this.d, dmVar.d)) != 0) {
            return iA6;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dmVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA5 = eg.a(this.a, dmVar.a)) != 0) {
            return iA5;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dmVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA4 = eg.a(this.e, dmVar.e)) != 0) {
            return iA4;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dmVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA3 = eg.a(this.f110a, dmVar.f110a)) != 0) {
            return iA3;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(dmVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA2 = eg.a(this.f, dmVar.f)) != 0) {
            return iA2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(dmVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iA = eg.a(this.g, dmVar.g)) == 0) {
            return 0;
        }
        return iA;
    }

    public dm a(long j2) {
        this.a = j2;
        a(true);
        return this;
    }

    public dm a(dk dkVar) {
        this.f108a = dkVar;
        return this;
    }

    public dm a(String str) {
        this.b = str;
        return this;
    }

    public String a() {
        return this.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m3685a() {
        return this.f110a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3686a() throws eq {
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
                m3686a();
                return;
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f109a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f108a = dkVar;
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
                case 7:
                    if (b == 10) {
                        this.a = epVar.mo3772a();
                        a(true);
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
                    if (b == 13) {
                        eo eoVarMo3775a = epVar.mo3775a();
                        this.f110a = new HashMap(eoVarMo3775a.f175a * 2);
                        for (int i2 = 0; i2 < eoVarMo3775a.f175a; i2++) {
                            this.f110a.put(epVar.mo3778a(), epVar.mo3778a());
                        }
                        epVar.h();
                    }
                    epVar.g();
                    break;
                case 10:
                    if (b == 11) {
                        this.f = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 11:
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
    public boolean m3687a() {
        return this.f109a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3688a(dm dmVar) {
        if (dmVar == null) {
            return false;
        }
        boolean zM3687a = m3687a();
        boolean zM3687a2 = dmVar.m3687a();
        if ((zM3687a || zM3687a2) && !(zM3687a && zM3687a2 && this.f109a.equals(dmVar.f109a))) {
            return false;
        }
        boolean zM3689b = m3689b();
        boolean zM3689b2 = dmVar.m3689b();
        if ((zM3689b || zM3689b2) && !(zM3689b && zM3689b2 && this.f108a.m3682a(dmVar.f108a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = dmVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.b.equals(dmVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dmVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.c.equals(dmVar.c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = dmVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.d.equals(dmVar.d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dmVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.a == dmVar.a)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dmVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(dmVar.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dmVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f110a.equals(dmVar.f110a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = dmVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f.equals(dmVar.f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = dmVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.g.equals(dmVar.g);
        }
        return true;
    }

    public dm b(String str) {
        this.c = str;
        return this;
    }

    public String b() {
        return this.d;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3686a();
        epVar.a(i);
        if (this.f109a != null && m3687a()) {
            epVar.a(j);
            epVar.a(this.f109a);
            epVar.b();
        }
        if (this.f108a != null && m3689b()) {
            epVar.a(k);
            this.f108a.b(epVar);
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
        if (this.d != null && e()) {
            epVar.a(n);
            epVar.a(this.d);
            epVar.b();
        }
        if (f()) {
            epVar.a(o);
            epVar.a(this.a);
            epVar.b();
        }
        if (this.e != null && g()) {
            epVar.a(p);
            epVar.a(this.e);
            epVar.b();
        }
        if (this.f110a != null && h()) {
            epVar.a(q);
            epVar.a(new eo((byte) 11, (byte) 11, this.f110a.size()));
            for (Map.Entry<String, String> entry : this.f110a.entrySet()) {
                epVar.a(entry.getKey());
                epVar.a(entry.getValue());
            }
            epVar.d();
            epVar.b();
        }
        if (this.f != null && i()) {
            epVar.a(r);
            epVar.a(this.f);
            epVar.b();
        }
        if (this.g != null && j()) {
            epVar.a(s);
            epVar.a(this.g);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3689b() {
        return this.f108a != null;
    }

    public dm c(String str) {
        this.d = str;
        return this;
    }

    public boolean c() {
        return this.b != null;
    }

    public dm d(String str) {
        this.e = str;
        return this;
    }

    public boolean d() {
        return this.c != null;
    }

    public dm e(String str) {
        this.f = str;
        return this;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dm)) {
            return m3688a((dm) obj);
        }
        return false;
    }

    public boolean f() {
        return this.h.get(0);
    }

    public boolean g() {
        return this.e != null;
    }

    public boolean h() {
        return this.f110a != null;
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

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (m3687a()) {
            sb.append("debug:");
            String str = this.f109a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m3689b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            dk dkVar = this.f108a;
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
            sb.append("type:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f110a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
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
        sb.append(")");
        return sb.toString();
    }
}
