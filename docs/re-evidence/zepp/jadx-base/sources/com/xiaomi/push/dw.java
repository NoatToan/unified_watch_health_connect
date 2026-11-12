package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class dw implements ef<dw, Object>, Serializable, Cloneable {
    private static final eu g = new eu("XmPushActionSendFeedbackResult");
    private static final em h = new em("", (byte) 11, 1);
    private static final em i = new em("", (byte) 12, 2);
    private static final em j = new em("", (byte) 11, 3);
    private static final em k = new em("", (byte) 11, 4);
    private static final em l = new em("", (byte) 10, 6);
    private static final em m = new em("", (byte) 11, 7);
    private static final em n = new em("", (byte) 11, 8);
    public long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f149a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f150a;
    public String b;
    public String c;
    public String d;
    public String e;
    private BitSet f = new BitSet(1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dw dwVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        if (!getClass().equals(dwVar.getClass())) {
            return getClass().getName().compareTo(dwVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3736a()).compareTo(Boolean.valueOf(dwVar.m3736a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3736a() && (iA7 = eg.a(this.f150a, dwVar.f150a)) != 0) {
            return iA7;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(dwVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA6 = eg.a(this.f149a, dwVar.f149a)) != 0) {
            return iA6;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(dwVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA5 = eg.a(this.b, dwVar.b)) != 0) {
            return iA5;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dwVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA4 = eg.a(this.c, dwVar.c)) != 0) {
            return iA4;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dwVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA3 = eg.a(this.a, dwVar.a)) != 0) {
            return iA3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dwVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA2 = eg.a(this.d, dwVar.d)) != 0) {
            return iA2;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dwVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!g() || (iA = eg.a(this.e, dwVar.e)) == 0) {
            return 0;
        }
        return iA;
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
                if (e()) {
                    a();
                    return;
                }
                throw new eq("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f150a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f149a = dkVar;
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
                case 6:
                    if (b == 10) {
                        this.a = epVar.mo3772a();
                        a(true);
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
            }
            es.a(epVar, b);
            epVar.g();
        }
    }

    public void a(boolean z) {
        this.f.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3736a() {
        return this.f150a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3737a(dw dwVar) {
        if (dwVar == null) {
            return false;
        }
        boolean zM3736a = m3736a();
        boolean zM3736a2 = dwVar.m3736a();
        if ((zM3736a || zM3736a2) && !(zM3736a && zM3736a2 && this.f150a.equals(dwVar.f150a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = dwVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f149a.m3682a(dwVar.f149a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = dwVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.b.equals(dwVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dwVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.c.equals(dwVar.c))) || this.a != dwVar.a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dwVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.d.equals(dwVar.d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dwVar.g();
        if (zG || zG2) {
            return zG && zG2 && this.e.equals(dwVar.e);
        }
        return true;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        a();
        epVar.a(g);
        if (this.f150a != null && m3736a()) {
            epVar.a(h);
            epVar.a(this.f150a);
            epVar.b();
        }
        if (this.f149a != null && b()) {
            epVar.a(i);
            this.f149a.b(epVar);
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
        epVar.c();
        epVar.mo3781a();
    }

    public boolean b() {
        return this.f149a != null;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.f.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dw)) {
            return m3737a((dw) obj);
        }
        return false;
    }

    public boolean f() {
        return this.d != null;
    }

    public boolean g() {
        return this.e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (m3736a()) {
            sb.append("debug:");
            String str = this.f150a;
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
            dk dkVar = this.f149a;
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
            sb.append("category:");
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
