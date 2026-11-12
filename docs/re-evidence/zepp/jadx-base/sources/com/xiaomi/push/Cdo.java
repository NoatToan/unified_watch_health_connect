package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.xiaomi.push.do, reason: invalid class name */
/* JADX INFO: loaded from: classes22.dex */
public class Cdo implements ef<Cdo, Object>, Serializable, Cloneable {
    private static final eu g = new eu("XmPushActionCommand");
    private static final em h = new em("", (byte) 12, 2);
    private static final em i = new em("", (byte) 11, 3);
    private static final em j = new em("", (byte) 11, 4);
    private static final em k = new em("", (byte) 11, 5);
    private static final em l = new em("", (byte) 15, 6);
    private static final em m = new em("", (byte) 11, 7);
    private static final em n = new em("", (byte) 11, 9);
    private static final em o = new em("", (byte) 2, 10);
    private static final em p = new em("", (byte) 2, 11);
    private static final em q = new em("", (byte) 10, 12);
    public long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f111a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f112a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f113a;
    public String b;
    public String c;
    public String d;
    public String e;
    private BitSet f = new BitSet(3);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f114a = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f115b = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Cdo cdo) {
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
        if (!getClass().equals(cdo.getClass())) {
            return getClass().getName().compareTo(cdo.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3693a()).compareTo(Boolean.valueOf(cdo.m3693a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3693a() && (iA10 = eg.a(this.f111a, cdo.f111a)) != 0) {
            return iA10;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(cdo.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA9 = eg.a(this.f112a, cdo.f112a)) != 0) {
            return iA9;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(cdo.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA8 = eg.a(this.b, cdo.b)) != 0) {
            return iA8;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(cdo.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA7 = eg.a(this.c, cdo.c)) != 0) {
            return iA7;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(cdo.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA6 = eg.a(this.f113a, cdo.f113a)) != 0) {
            return iA6;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(cdo.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA5 = eg.a(this.d, cdo.d)) != 0) {
            return iA5;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(cdo.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA4 = eg.a(this.e, cdo.e)) != 0) {
            return iA4;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(cdo.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA3 = eg.a(this.f114a, cdo.f114a)) != 0) {
            return iA3;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(cdo.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA2 = eg.a(this.f115b, cdo.f115b)) != 0) {
            return iA2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(cdo.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iA = eg.a(this.a, cdo.a)) == 0) {
            return 0;
        }
        return iA;
    }

    public Cdo a(String str) {
        this.f112a = str;
        return this;
    }

    public void a() throws eq {
        if (this.f112a == null) {
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
                a();
                return;
            }
            switch (emVarMo3773a.f173a) {
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f111a = dkVar;
                        dkVar.a(epVar);
                    }
                    epVar.g();
                    break;
                case 3:
                    if (b == 11) {
                        this.f112a = epVar.mo3778a();
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
                case 6:
                    if (b == 15) {
                        en enVarMo3774a = epVar.mo3774a();
                        this.f113a = new ArrayList(enVarMo3774a.f174a);
                        for (int i2 = 0; i2 < enVarMo3774a.f174a; i2++) {
                            this.f113a.add(epVar.mo3778a());
                        }
                        epVar.i();
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
                case 9:
                    if (b == 11) {
                        this.e = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 10:
                    if (b == 2) {
                        this.f114a = epVar.mo3783a();
                        a(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 11:
                    if (b == 2) {
                        this.f115b = epVar.mo3783a();
                        b(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 12:
                    if (b == 10) {
                        this.a = epVar.mo3772a();
                        c(true);
                    }
                    epVar.g();
                    break;
            }
            es.a(epVar, b);
            epVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3692a(String str) {
        if (this.f113a == null) {
            this.f113a = new ArrayList();
        }
        this.f113a.add(str);
    }

    public void a(boolean z) {
        this.f.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3693a() {
        return this.f111a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3694a(Cdo cdo) {
        if (cdo == null) {
            return false;
        }
        boolean zM3693a = m3693a();
        boolean zM3693a2 = cdo.m3693a();
        if ((zM3693a || zM3693a2) && !(zM3693a && zM3693a2 && this.f111a.m3682a(cdo.f111a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = cdo.b();
        if ((zB || zB2) && !(zB && zB2 && this.f112a.equals(cdo.f112a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = cdo.c();
        if ((zC || zC2) && !(zC && zC2 && this.b.equals(cdo.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = cdo.d();
        if ((zD || zD2) && !(zD && zD2 && this.c.equals(cdo.c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = cdo.e();
        if ((zE || zE2) && !(zE && zE2 && this.f113a.equals(cdo.f113a))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = cdo.f();
        if ((zF || zF2) && !(zF && zF2 && this.d.equals(cdo.d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = cdo.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(cdo.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = cdo.h();
        if ((zH || zH2) && !(zH && zH2 && this.f114a == cdo.f114a)) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = cdo.i();
        if ((zI || zI2) && !(zI && zI2 && this.f115b == cdo.f115b)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = cdo.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.a == cdo.a;
        }
        return true;
    }

    public Cdo b(String str) {
        this.b = str;
        return this;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        a();
        epVar.a(g);
        if (this.f111a != null && m3693a()) {
            epVar.a(h);
            this.f111a.b(epVar);
            epVar.b();
        }
        if (this.f112a != null) {
            epVar.a(i);
            epVar.a(this.f112a);
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
        if (this.f113a != null && e()) {
            epVar.a(l);
            epVar.a(new en((byte) 11, this.f113a.size()));
            Iterator<String> it2 = this.f113a.iterator();
            while (it2.hasNext()) {
                epVar.a(it2.next());
            }
            epVar.e();
            epVar.b();
        }
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
            epVar.a(this.f114a);
            epVar.b();
        }
        if (i()) {
            epVar.a(p);
            epVar.a(this.f115b);
            epVar.b();
        }
        if (j()) {
            epVar.a(q);
            epVar.a(this.a);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z) {
        this.f.set(1, z);
    }

    public boolean b() {
        return this.f112a != null;
    }

    public Cdo c(String str) {
        this.c = str;
        return this;
    }

    public void c(boolean z) {
        this.f.set(2, z);
    }

    public boolean c() {
        return this.b != null;
    }

    public Cdo d(String str) {
        this.d = str;
        return this;
    }

    public boolean d() {
        return this.c != null;
    }

    public Cdo e(String str) {
        this.e = str;
        return this;
    }

    public boolean e() {
        return this.f113a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Cdo)) {
            return m3694a((Cdo) obj);
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
        return this.f.get(0);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f.get(1);
    }

    public boolean j() {
        return this.f.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m3693a()) {
            sb.append("target:");
            dk dkVar = this.f111a;
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
        String str = this.f112a;
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
        if (e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f113a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f114a);
        }
        if (i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f115b);
        }
        if (j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.a);
        }
        sb.append(")");
        return sb.toString();
    }
}
