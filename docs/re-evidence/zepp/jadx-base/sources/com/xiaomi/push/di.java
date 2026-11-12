package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class di implements ef<di, Object>, Serializable, Cloneable {
    private static final eu g = new eu("PushMetaInfo");
    private static final em h = new em("", (byte) 11, 1);
    private static final em i = new em("", (byte) 10, 2);
    private static final em j = new em("", (byte) 11, 3);
    private static final em k = new em("", (byte) 11, 4);
    private static final em l = new em("", (byte) 11, 5);
    private static final em m = new em("", (byte) 8, 6);
    private static final em n = new em("", (byte) 11, 7);
    private static final em o = new em("", (byte) 8, 8);
    private static final em p = new em("", (byte) 8, 9);
    private static final em q = new em("", (byte) 13, 10);
    private static final em r = new em("", (byte) 13, 11);
    private static final em s = new em("", (byte) 2, 12);
    private static final em t = new em("", (byte) 13, 13);
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f88a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f89a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f90a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f91a;
    public int b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f92b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public Map<String, String> f93b;
    public int c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f94c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public Map<String, String> f95c;
    public String d;
    public String e;
    private BitSet f;

    public di() {
        this.f = new BitSet(5);
        this.f91a = false;
    }

    public di(di diVar) {
        BitSet bitSet = new BitSet(5);
        this.f = bitSet;
        bitSet.clear();
        this.f.or(diVar.f);
        if (diVar.m3673a()) {
            this.f89a = diVar.f89a;
        }
        this.f88a = diVar.f88a;
        if (diVar.m3679c()) {
            this.f92b = diVar.f92b;
        }
        if (diVar.m3680d()) {
            this.f94c = diVar.f94c;
        }
        if (diVar.e()) {
            this.d = diVar.d;
        }
        this.a = diVar.a;
        if (diVar.g()) {
            this.e = diVar.e;
        }
        this.b = diVar.b;
        this.c = diVar.c;
        if (diVar.j()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, String> entry : diVar.f90a.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            this.f90a = map;
        }
        if (diVar.k()) {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, String> entry2 : diVar.f93b.entrySet()) {
                map2.put(entry2.getKey(), entry2.getValue());
            }
            this.f93b = map2;
        }
        this.f91a = diVar.f91a;
        if (diVar.n()) {
            HashMap map3 = new HashMap();
            for (Map.Entry<String, String> entry3 : diVar.f95c.entrySet()) {
                map3.put(entry3.getKey(), entry3.getValue());
            }
            this.f95c = map3;
        }
    }

    public int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(di diVar) {
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
        if (!getClass().equals(diVar.getClass())) {
            return getClass().getName().compareTo(diVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3673a()).compareTo(Boolean.valueOf(diVar.m3673a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3673a() && (iA13 = eg.a(this.f89a, diVar.f89a)) != 0) {
            return iA13;
        }
        int iCompareTo2 = Boolean.valueOf(m3677b()).compareTo(Boolean.valueOf(diVar.m3677b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3677b() && (iA12 = eg.a(this.f88a, diVar.f88a)) != 0) {
            return iA12;
        }
        int iCompareTo3 = Boolean.valueOf(m3679c()).compareTo(Boolean.valueOf(diVar.m3679c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3679c() && (iA11 = eg.a(this.f92b, diVar.f92b)) != 0) {
            return iA11;
        }
        int iCompareTo4 = Boolean.valueOf(m3680d()).compareTo(Boolean.valueOf(diVar.m3680d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m3680d() && (iA10 = eg.a(this.f94c, diVar.f94c)) != 0) {
            return iA10;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(diVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA9 = eg.a(this.d, diVar.d)) != 0) {
            return iA9;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(diVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA8 = eg.a(this.a, diVar.a)) != 0) {
            return iA8;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(diVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA7 = eg.a(this.e, diVar.e)) != 0) {
            return iA7;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(diVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA6 = eg.a(this.b, diVar.b)) != 0) {
            return iA6;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(diVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA5 = eg.a(this.c, diVar.c)) != 0) {
            return iA5;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(diVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA4 = eg.a(this.f90a, diVar.f90a)) != 0) {
            return iA4;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(diVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA3 = eg.a(this.f93b, diVar.f93b)) != 0) {
            return iA3;
        }
        int iCompareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(diVar.m()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m() && (iA2 = eg.a(this.f91a, diVar.f91a)) != 0) {
            return iA2;
        }
        int iCompareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(diVar.n()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (!n() || (iA = eg.a(this.f95c, diVar.f95c)) == 0) {
            return 0;
        }
        return iA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m3668a() {
        return this.f88a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public di m3669a() {
        return new di(this);
    }

    public di a(int i2) {
        this.a = i2;
        b(true);
        return this;
    }

    public di a(String str) {
        this.f89a = str;
        return this;
    }

    public di a(Map<String, String> map) {
        this.f90a = map;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3670a() {
        return this.f89a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m3671a() {
        return this.f90a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3672a() throws eq {
        if (this.f89a != null) {
            return;
        }
        throw new eq("Required field 'id' was not present! Struct: " + toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                epVar.f();
                if (m3677b()) {
                    m3672a();
                    return;
                }
                throw new eq("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i2 = 0;
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b != 11) {
                        es.a(epVar, b);
                    } else {
                        this.f89a = epVar.mo3778a();
                    }
                    break;
                case 2:
                    if (b != 10) {
                        es.a(epVar, b);
                    } else {
                        this.f88a = epVar.mo3772a();
                        a(true);
                    }
                    break;
                case 3:
                    if (b != 11) {
                        es.a(epVar, b);
                    } else {
                        this.f92b = epVar.mo3778a();
                    }
                    break;
                case 4:
                    if (b != 11) {
                        es.a(epVar, b);
                    } else {
                        this.f94c = epVar.mo3778a();
                    }
                    break;
                case 5:
                    if (b != 11) {
                        es.a(epVar, b);
                    } else {
                        this.d = epVar.mo3778a();
                    }
                    break;
                case 6:
                    if (b != 8) {
                        es.a(epVar, b);
                    } else {
                        this.a = epVar.mo3771a();
                        b(true);
                    }
                    break;
                case 7:
                    if (b != 11) {
                        es.a(epVar, b);
                    } else {
                        this.e = epVar.mo3778a();
                    }
                    break;
                case 8:
                    if (b != 8) {
                        es.a(epVar, b);
                    } else {
                        this.b = epVar.mo3771a();
                        c(true);
                    }
                    break;
                case 9:
                    if (b != 8) {
                        es.a(epVar, b);
                    } else {
                        this.c = epVar.mo3771a();
                        d(true);
                    }
                    break;
                case 10:
                    if (b != 13) {
                        es.a(epVar, b);
                    } else {
                        eo eoVarMo3775a = epVar.mo3775a();
                        this.f90a = new HashMap(eoVarMo3775a.f175a * 2);
                        while (i2 < eoVarMo3775a.f175a) {
                            this.f90a.put(epVar.mo3778a(), epVar.mo3778a());
                            i2++;
                        }
                        epVar.h();
                    }
                    break;
                case 11:
                    if (b != 13) {
                        es.a(epVar, b);
                    } else {
                        eo eoVarMo3775a2 = epVar.mo3775a();
                        this.f93b = new HashMap(eoVarMo3775a2.f175a * 2);
                        while (i2 < eoVarMo3775a2.f175a) {
                            this.f93b.put(epVar.mo3778a(), epVar.mo3778a());
                            i2++;
                        }
                        epVar.h();
                    }
                    break;
                case 12:
                    if (b != 2) {
                        es.a(epVar, b);
                    } else {
                        this.f91a = epVar.mo3783a();
                        e(true);
                    }
                    break;
                case 13:
                    if (b != 13) {
                        es.a(epVar, b);
                    } else {
                        eo eoVarMo3775a3 = epVar.mo3775a();
                        this.f95c = new HashMap(eoVarMo3775a3.f175a * 2);
                        while (i2 < eoVarMo3775a3.f175a) {
                            this.f95c.put(epVar.mo3778a(), epVar.mo3778a());
                            i2++;
                        }
                        epVar.h();
                    }
                    break;
                default:
                    es.a(epVar, b);
                    break;
            }
            epVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f90a == null) {
            this.f90a = new HashMap();
        }
        this.f90a.put(str, str2);
    }

    public void a(boolean z) {
        this.f.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3673a() {
        return this.f89a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3674a(di diVar) {
        if (diVar == null) {
            return false;
        }
        boolean zM3673a = m3673a();
        boolean zM3673a2 = diVar.m3673a();
        if (((zM3673a || zM3673a2) && !(zM3673a && zM3673a2 && this.f89a.equals(diVar.f89a))) || this.f88a != diVar.f88a) {
            return false;
        }
        boolean zM3679c = m3679c();
        boolean zM3679c2 = diVar.m3679c();
        if ((zM3679c || zM3679c2) && !(zM3679c && zM3679c2 && this.f92b.equals(diVar.f92b))) {
            return false;
        }
        boolean zM3680d = m3680d();
        boolean zM3680d2 = diVar.m3680d();
        if ((zM3680d || zM3680d2) && !(zM3680d && zM3680d2 && this.f94c.equals(diVar.f94c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = diVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.d.equals(diVar.d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = diVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.a == diVar.a)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = diVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(diVar.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = diVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.b == diVar.b)) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = diVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.c == diVar.c)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = diVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f90a.equals(diVar.f90a))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = diVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f93b.equals(diVar.f93b))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = diVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f91a == diVar.f91a)) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = diVar.n();
        if (zN || zN2) {
            return zN && zN2 && this.f95c.equals(diVar.f95c);
        }
        return true;
    }

    public int b() {
        return this.b;
    }

    public di b(int i2) {
        this.b = i2;
        c(true);
        return this;
    }

    public di b(String str) {
        this.f92b = str;
        return this;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public String m3675b() {
        return this.f92b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public Map<String, String> m3676b() {
        return this.f93b;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3672a();
        epVar.a(g);
        if (this.f89a != null) {
            epVar.a(h);
            epVar.a(this.f89a);
            epVar.b();
        }
        epVar.a(i);
        epVar.a(this.f88a);
        epVar.b();
        if (this.f92b != null && m3679c()) {
            epVar.a(j);
            epVar.a(this.f92b);
            epVar.b();
        }
        if (this.f94c != null && m3680d()) {
            epVar.a(k);
            epVar.a(this.f94c);
            epVar.b();
        }
        if (this.d != null && e()) {
            epVar.a(l);
            epVar.a(this.d);
            epVar.b();
        }
        if (f()) {
            epVar.a(m);
            epVar.mo3782a(this.a);
            epVar.b();
        }
        if (this.e != null && g()) {
            epVar.a(n);
            epVar.a(this.e);
            epVar.b();
        }
        if (h()) {
            epVar.a(o);
            epVar.mo3782a(this.b);
            epVar.b();
        }
        if (i()) {
            epVar.a(p);
            epVar.mo3782a(this.c);
            epVar.b();
        }
        if (this.f90a != null && j()) {
            epVar.a(q);
            epVar.a(new eo((byte) 11, (byte) 11, this.f90a.size()));
            for (Map.Entry<String, String> entry : this.f90a.entrySet()) {
                epVar.a(entry.getKey());
                epVar.a(entry.getValue());
            }
            epVar.d();
            epVar.b();
        }
        if (this.f93b != null && k()) {
            epVar.a(r);
            epVar.a(new eo((byte) 11, (byte) 11, this.f93b.size()));
            for (Map.Entry<String, String> entry2 : this.f93b.entrySet()) {
                epVar.a(entry2.getKey());
                epVar.a(entry2.getValue());
            }
            epVar.d();
            epVar.b();
        }
        if (m()) {
            epVar.a(s);
            epVar.a(this.f91a);
            epVar.b();
        }
        if (this.f95c != null && n()) {
            epVar.a(t);
            epVar.a(new eo((byte) 11, (byte) 11, this.f95c.size()));
            for (Map.Entry<String, String> entry3 : this.f95c.entrySet()) {
                epVar.a(entry3.getKey());
                epVar.a(entry3.getValue());
            }
            epVar.d();
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z) {
        this.f.set(1, z);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3677b() {
        return this.f.get(0);
    }

    public int c() {
        return this.c;
    }

    public di c(int i2) {
        this.c = i2;
        d(true);
        return this;
    }

    public di c(String str) {
        this.f94c = str;
        return this;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public String m3678c() {
        return this.f94c;
    }

    public void c(boolean z) {
        this.f.set(2, z);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3679c() {
        return this.f92b != null;
    }

    public di d(String str) {
        this.d = str;
        return this;
    }

    public String d() {
        return this.d;
    }

    public void d(boolean z) {
        this.f.set(3, z);
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m3680d() {
        return this.f94c != null;
    }

    public void e(boolean z) {
        this.f.set(4, z);
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof di)) {
            return m3674a((di) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f.get(1);
    }

    public boolean g() {
        return this.e != null;
    }

    public boolean h() {
        return this.f.get(2);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f.get(3);
    }

    public boolean j() {
        return this.f90a != null;
    }

    public boolean k() {
        return this.f93b != null;
    }

    public boolean l() {
        return this.f91a;
    }

    public boolean m() {
        return this.f.get(4);
    }

    public boolean n() {
        return this.f95c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        String str = this.f89a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.aw.a(str));
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f88a);
        if (m3679c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f92b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m3680d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f94c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.c);
        }
        if (j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f90a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f93b;
            if (map2 == null) {
                sb.append("null");
            } else {
                sb.append(map2);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f91a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f95c;
            if (map3 == null) {
                sb.append("null");
            } else {
                sb.append(map3);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
