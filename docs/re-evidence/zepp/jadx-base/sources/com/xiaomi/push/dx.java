package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class dx implements ef<dx, Object>, Serializable, Cloneable {
    private static final eu j = new eu("XmPushActionSendMessage");
    private static final em k = new em("", (byte) 11, 1);
    private static final em l = new em("", (byte) 12, 2);
    private static final em m = new em("", (byte) 11, 3);
    private static final em n = new em("", (byte) 11, 4);
    private static final em o = new em("", (byte) 11, 5);
    private static final em p = new em("", (byte) 11, 6);
    private static final em q = new em("", (byte) 11, 7);
    private static final em r = new em("", (byte) 12, 8);
    private static final em s = new em("", (byte) 2, 9);
    private static final em t = new em("", (byte) 13, 10);
    private static final em u = new em("", (byte) 11, 11);
    private static final em v = new em("", (byte) 11, 12);
    public dh a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f151a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f152a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f153a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    private BitSet i = new BitSet(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f154a = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dx dxVar) {
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
        if (!getClass().equals(dxVar.getClass())) {
            return getClass().getName().compareTo(dxVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3740a()).compareTo(Boolean.valueOf(dxVar.m3740a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3740a() && (iA12 = eg.a(this.f152a, dxVar.f152a)) != 0) {
            return iA12;
        }
        int iCompareTo2 = Boolean.valueOf(m3742b()).compareTo(Boolean.valueOf(dxVar.m3742b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3742b() && (iA11 = eg.a(this.f151a, dxVar.f151a)) != 0) {
            return iA11;
        }
        int iCompareTo3 = Boolean.valueOf(m3743c()).compareTo(Boolean.valueOf(dxVar.m3743c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3743c() && (iA10 = eg.a(this.b, dxVar.b)) != 0) {
            return iA10;
        }
        int iCompareTo4 = Boolean.valueOf(m3744d()).compareTo(Boolean.valueOf(dxVar.m3744d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m3744d() && (iA9 = eg.a(this.c, dxVar.c)) != 0) {
            return iA9;
        }
        int iCompareTo5 = Boolean.valueOf(m3745e()).compareTo(Boolean.valueOf(dxVar.m3745e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m3745e() && (iA8 = eg.a(this.d, dxVar.d)) != 0) {
            return iA8;
        }
        int iCompareTo6 = Boolean.valueOf(m3746f()).compareTo(Boolean.valueOf(dxVar.m3746f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m3746f() && (iA7 = eg.a(this.e, dxVar.e)) != 0) {
            return iA7;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dxVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA6 = eg.a(this.f, dxVar.f)) != 0) {
            return iA6;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dxVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA5 = eg.a(this.a, dxVar.a)) != 0) {
            return iA5;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(dxVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA4 = eg.a(this.f154a, dxVar.f154a)) != 0) {
            return iA4;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(dxVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA3 = eg.a(this.f153a, dxVar.f153a)) != 0) {
            return iA3;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(dxVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA2 = eg.a(this.g, dxVar.g)) != 0) {
            return iA2;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(dxVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!l() || (iA = eg.a(this.h, dxVar.h)) == 0) {
            return 0;
        }
        return iA;
    }

    public dh a() {
        return this.a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3738a() {
        return this.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3739a() throws eq {
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
                m3739a();
                return;
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f152a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f151a = dkVar;
                        dkVar.a(epVar);
                        continue;
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
                    if (b == 12) {
                        dh dhVar = new dh();
                        this.a = dhVar;
                        dhVar.a(epVar);
                        continue;
                    }
                    epVar.g();
                    break;
                case 9:
                    if (b == 2) {
                        this.f154a = epVar.mo3783a();
                        a(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 10:
                    if (b == 13) {
                        eo eoVarMo3775a = epVar.mo3775a();
                        this.f153a = new HashMap(eoVarMo3775a.f175a * 2);
                        for (int i = 0; i < eoVarMo3775a.f175a; i++) {
                            this.f153a.put(epVar.mo3778a(), epVar.mo3778a());
                        }
                        epVar.h();
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
                case 12:
                    if (b == 11) {
                        this.h = epVar.mo3778a();
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
        this.i.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3740a() {
        return this.f152a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3741a(dx dxVar) {
        if (dxVar == null) {
            return false;
        }
        boolean zM3740a = m3740a();
        boolean zM3740a2 = dxVar.m3740a();
        if ((zM3740a || zM3740a2) && !(zM3740a && zM3740a2 && this.f152a.equals(dxVar.f152a))) {
            return false;
        }
        boolean zM3742b = m3742b();
        boolean zM3742b2 = dxVar.m3742b();
        if ((zM3742b || zM3742b2) && !(zM3742b && zM3742b2 && this.f151a.m3682a(dxVar.f151a))) {
            return false;
        }
        boolean zM3743c = m3743c();
        boolean zM3743c2 = dxVar.m3743c();
        if ((zM3743c || zM3743c2) && !(zM3743c && zM3743c2 && this.b.equals(dxVar.b))) {
            return false;
        }
        boolean zM3744d = m3744d();
        boolean zM3744d2 = dxVar.m3744d();
        if ((zM3744d || zM3744d2) && !(zM3744d && zM3744d2 && this.c.equals(dxVar.c))) {
            return false;
        }
        boolean zM3745e = m3745e();
        boolean zM3745e2 = dxVar.m3745e();
        if ((zM3745e || zM3745e2) && !(zM3745e && zM3745e2 && this.d.equals(dxVar.d))) {
            return false;
        }
        boolean zM3746f = m3746f();
        boolean zM3746f2 = dxVar.m3746f();
        if ((zM3746f || zM3746f2) && !(zM3746f && zM3746f2 && this.e.equals(dxVar.e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dxVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f.equals(dxVar.f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dxVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.a.m3665a(dxVar.a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = dxVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f154a == dxVar.f154a)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = dxVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f153a.equals(dxVar.f153a))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = dxVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.g.equals(dxVar.g))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = dxVar.l();
        if (zL || zL2) {
            return zL && zL2 && this.h.equals(dxVar.h);
        }
        return true;
    }

    public String b() {
        return this.c;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3739a();
        epVar.a(j);
        if (this.f152a != null && m3740a()) {
            epVar.a(k);
            epVar.a(this.f152a);
            epVar.b();
        }
        if (this.f151a != null && m3742b()) {
            epVar.a(l);
            this.f151a.b(epVar);
            epVar.b();
        }
        if (this.b != null) {
            epVar.a(m);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.c != null) {
            epVar.a(n);
            epVar.a(this.c);
            epVar.b();
        }
        if (this.d != null && m3745e()) {
            epVar.a(o);
            epVar.a(this.d);
            epVar.b();
        }
        if (this.e != null && m3746f()) {
            epVar.a(p);
            epVar.a(this.e);
            epVar.b();
        }
        if (this.f != null && g()) {
            epVar.a(q);
            epVar.a(this.f);
            epVar.b();
        }
        if (this.a != null && h()) {
            epVar.a(r);
            this.a.b(epVar);
            epVar.b();
        }
        if (i()) {
            epVar.a(s);
            epVar.a(this.f154a);
            epVar.b();
        }
        if (this.f153a != null && j()) {
            epVar.a(t);
            epVar.a(new eo((byte) 11, (byte) 11, this.f153a.size()));
            for (Map.Entry<String, String> entry : this.f153a.entrySet()) {
                epVar.a(entry.getKey());
                epVar.a(entry.getValue());
            }
            epVar.d();
            epVar.b();
        }
        if (this.g != null && k()) {
            epVar.a(u);
            epVar.a(this.g);
            epVar.b();
        }
        if (this.h != null && l()) {
            epVar.a(v);
            epVar.a(this.h);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3742b() {
        return this.f151a != null;
    }

    public String c() {
        return this.e;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3743c() {
        return this.b != null;
    }

    public String d() {
        return this.f;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m3744d() {
        return this.c != null;
    }

    public String e() {
        return this.g;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public boolean m3745e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dx)) {
            return m3741a((dx) obj);
        }
        return false;
    }

    public String f() {
        return this.h;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public boolean m3746f() {
        return this.e != null;
    }

    public boolean g() {
        return this.f != null;
    }

    public boolean h() {
        return this.a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.i.get(0);
    }

    public boolean j() {
        return this.f153a != null;
    }

    public boolean k() {
        return this.g != null;
    }

    public boolean l() {
        return this.h != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z2 = false;
        if (m3740a()) {
            sb.append("debug:");
            String str = this.f152a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m3742b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            dk dkVar = this.f151a;
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
        if (m3745e()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m3746f()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str6 = this.f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("message:");
            dh dhVar = this.a;
            if (dhVar == null) {
                sb.append("null");
            } else {
                sb.append(dhVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f154a);
        }
        if (j()) {
            sb.append(", ");
            sb.append("params:");
            Map<String, String> map = this.f153a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str8 = this.h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
