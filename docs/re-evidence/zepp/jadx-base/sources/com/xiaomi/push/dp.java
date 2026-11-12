package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class dp implements ef<dp, Object>, Serializable, Cloneable {
    private static final eu h = new eu("XmPushActionCommandResult");
    private static final em i = new em("", (byte) 12, 2);
    private static final em j = new em("", (byte) 11, 3);
    private static final em k = new em("", (byte) 11, 4);
    private static final em l = new em("", (byte) 11, 5);
    private static final em m = new em("", (byte) 10, 7);
    private static final em n = new em("", (byte) 11, 8);
    private static final em o = new em("", (byte) 11, 9);
    private static final em p = new em("", (byte) 15, 10);
    private static final em q = new em("", (byte) 11, 12);
    private static final em r = new em("", (byte) 2, 13);
    public long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f116a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f117a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f118a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    private BitSet g = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f119a = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dp dpVar) {
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
        if (!getClass().equals(dpVar.getClass())) {
            return getClass().getName().compareTo(dpVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3697a()).compareTo(Boolean.valueOf(dpVar.m3697a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3697a() && (iA10 = eg.a(this.f116a, dpVar.f116a)) != 0) {
            return iA10;
        }
        int iCompareTo2 = Boolean.valueOf(m3699b()).compareTo(Boolean.valueOf(dpVar.m3699b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3699b() && (iA9 = eg.a(this.f117a, dpVar.f117a)) != 0) {
            return iA9;
        }
        int iCompareTo3 = Boolean.valueOf(m3700c()).compareTo(Boolean.valueOf(dpVar.m3700c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3700c() && (iA8 = eg.a(this.b, dpVar.b)) != 0) {
            return iA8;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dpVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA7 = eg.a(this.c, dpVar.c)) != 0) {
            return iA7;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dpVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA6 = eg.a(this.a, dpVar.a)) != 0) {
            return iA6;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dpVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA5 = eg.a(this.d, dpVar.d)) != 0) {
            return iA5;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dpVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA4 = eg.a(this.e, dpVar.e)) != 0) {
            return iA4;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dpVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA3 = eg.a(this.f118a, dpVar.f118a)) != 0) {
            return iA3;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(dpVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA2 = eg.a(this.f, dpVar.f)) != 0) {
            return iA2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(dpVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iA = eg.a(this.f119a, dpVar.f119a)) == 0) {
            return 0;
        }
        return iA;
    }

    public String a() {
        return this.f117a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public List<String> m3695a() {
        return this.f118a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3696a() throws eq {
        if (this.f117a == null) {
            throw new eq("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.b == null) {
            throw new eq("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.c != null) {
            return;
        }
        throw new eq("Required field 'cmdName' was not present! Struct: " + toString());
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
                    m3696a();
                    return;
                }
                throw new eq("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (emVarMo3773a.f173a) {
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f116a = dkVar;
                        dkVar.a(epVar);
                    }
                    epVar.g();
                    break;
                case 3:
                    if (b == 11) {
                        this.f117a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 4:
                    if (b == 11) {
                        this.b = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 5:
                    if (b == 11) {
                        this.c = epVar.mo3778a();
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
                        this.d = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 9:
                    if (b == 11) {
                        this.e = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 10:
                    if (b == 15) {
                        en enVarMo3774a = epVar.mo3774a();
                        this.f118a = new ArrayList(enVarMo3774a.f174a);
                        for (int i2 = 0; i2 < enVarMo3774a.f174a; i2++) {
                            this.f118a.add(epVar.mo3778a());
                        }
                        epVar.i();
                    }
                    epVar.g();
                    break;
                case 12:
                    if (b == 11) {
                        this.f = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 13:
                    if (b == 2) {
                        this.f119a = epVar.mo3783a();
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
        this.g.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3697a() {
        return this.f116a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3698a(dp dpVar) {
        if (dpVar == null) {
            return false;
        }
        boolean zM3697a = m3697a();
        boolean zM3697a2 = dpVar.m3697a();
        if ((zM3697a || zM3697a2) && !(zM3697a && zM3697a2 && this.f116a.m3682a(dpVar.f116a))) {
            return false;
        }
        boolean zM3699b = m3699b();
        boolean zM3699b2 = dpVar.m3699b();
        if ((zM3699b || zM3699b2) && !(zM3699b && zM3699b2 && this.f117a.equals(dpVar.f117a))) {
            return false;
        }
        boolean zM3700c = m3700c();
        boolean zM3700c2 = dpVar.m3700c();
        if ((zM3700c || zM3700c2) && !(zM3700c && zM3700c2 && this.b.equals(dpVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dpVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.c.equals(dpVar.c))) || this.a != dpVar.a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dpVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.d.equals(dpVar.d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dpVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(dpVar.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dpVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f118a.equals(dpVar.f118a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = dpVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f.equals(dpVar.f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = dpVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.f119a == dpVar.f119a;
        }
        return true;
    }

    public String b() {
        return this.c;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3696a();
        epVar.a(h);
        if (this.f116a != null && m3697a()) {
            epVar.a(i);
            this.f116a.b(epVar);
            epVar.b();
        }
        if (this.f117a != null) {
            epVar.a(j);
            epVar.a(this.f117a);
            epVar.b();
        }
        if (this.b != null) {
            epVar.a(k);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.c != null) {
            epVar.a(l);
            epVar.a(this.c);
            epVar.b();
        }
        epVar.a(m);
        epVar.a(this.a);
        epVar.b();
        if (this.d != null && f()) {
            epVar.a(n);
            epVar.a(this.d);
            epVar.b();
        }
        if (this.e != null && g()) {
            epVar.a(o);
            epVar.a(this.e);
            epVar.b();
        }
        if (this.f118a != null && h()) {
            epVar.a(p);
            epVar.a(new en((byte) 11, this.f118a.size()));
            Iterator<String> it2 = this.f118a.iterator();
            while (it2.hasNext()) {
                epVar.a(it2.next());
            }
            epVar.e();
            epVar.b();
        }
        if (this.f != null && i()) {
            epVar.a(q);
            epVar.a(this.f);
            epVar.b();
        }
        if (j()) {
            epVar.a(r);
            epVar.a(this.f119a);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z) {
        this.g.set(1, z);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3699b() {
        return this.f117a != null;
    }

    public String c() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3700c() {
        return this.b != null;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.g.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dp)) {
            return m3698a((dp) obj);
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
        return this.f118a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f != null;
    }

    public boolean j() {
        return this.g.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m3697a()) {
            sb.append("target:");
            dk dkVar = this.f116a;
            if (dkVar == null) {
                sb.append("null");
            } else {
                sb.append(dkVar);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f117a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.c;
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
            sb.append("cmdArgs:");
            List<String> list = this.f118a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f119a);
        }
        sb.append(")");
        return sb.toString();
    }
}
