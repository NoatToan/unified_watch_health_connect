package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class dq implements ef<dq, Object>, Serializable, Cloneable {
    private static final eu d = new eu("XmPushActionContainer");
    private static final em e = new em("", (byte) 8, 1);
    private static final em f = new em("", (byte) 2, 2);
    private static final em g = new em("", (byte) 2, 3);
    private static final em h = new em("", (byte) 11, 4);
    private static final em i = new em("", (byte) 11, 5);
    private static final em j = new em("", (byte) 11, 6);
    private static final em k = new em("", (byte) 12, 7);
    private static final em l = new em("", (byte) 12, 8);
    public cz a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public di f120a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f121a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f122a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ByteBuffer f123a;
    public String b;
    private BitSet c = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f124a = true;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f125b = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dq dqVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        if (!getClass().equals(dqVar.getClass())) {
            return getClass().getName().compareTo(dqVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3705a()).compareTo(Boolean.valueOf(dqVar.m3705a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3705a() && (iA8 = eg.a(this.a, dqVar.a)) != 0) {
            return iA8;
        }
        int iCompareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(dqVar.c()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (c() && (iA7 = eg.a(this.f124a, dqVar.f124a)) != 0) {
            return iA7;
        }
        int iCompareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dqVar.d()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (d() && (iA6 = eg.a(this.f125b, dqVar.f125b)) != 0) {
            return iA6;
        }
        int iCompareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dqVar.e()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (e() && (iA5 = eg.a(this.f123a, dqVar.f123a)) != 0) {
            return iA5;
        }
        int iCompareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dqVar.f()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (f() && (iA4 = eg.a(this.f122a, dqVar.f122a)) != 0) {
            return iA4;
        }
        int iCompareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dqVar.g()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (g() && (iA3 = eg.a(this.b, dqVar.b)) != 0) {
            return iA3;
        }
        int iCompareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dqVar.h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (h() && (iA2 = eg.a(this.f121a, dqVar.f121a)) != 0) {
            return iA2;
        }
        int iCompareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(dqVar.i()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!i() || (iA = eg.a(this.f120a, dqVar.f120a)) == 0) {
            return 0;
        }
        return iA;
    }

    public cz a() {
        return this.a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public di m3701a() {
        return this.f120a;
    }

    public dq a(cz czVar) {
        this.a = czVar;
        return this;
    }

    public dq a(di diVar) {
        this.f120a = diVar;
        return this;
    }

    public dq a(dk dkVar) {
        this.f121a = dkVar;
        return this;
    }

    public dq a(String str) {
        this.f122a = str;
        return this;
    }

    public dq a(ByteBuffer byteBuffer) {
        this.f123a = byteBuffer;
        return this;
    }

    public dq a(boolean z) {
        this.f124a = z;
        m3704a(true);
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3702a() {
        return this.f122a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3703a() throws eq {
        if (this.a == null) {
            throw new eq("Required field 'action' was not present! Struct: " + toString());
        }
        if (this.f123a == null) {
            throw new eq("Required field 'pushAction' was not present! Struct: " + toString());
        }
        if (this.f121a != null) {
            return;
        }
        throw new eq("Required field 'target' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                epVar.f();
                if (!c()) {
                    throw new eq("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
                }
                if (d()) {
                    m3703a();
                    return;
                }
                throw new eq("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 8) {
                        this.a = cz.a(epVar.mo3771a());
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 2) {
                        this.f124a = epVar.mo3783a();
                        m3704a(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 3:
                    if (b == 2) {
                        this.f125b = epVar.mo3783a();
                        m3708b(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 4:
                    if (b == 11) {
                        this.f123a = epVar.mo3779a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 5:
                    if (b == 11) {
                        this.f122a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 6:
                    if (b == 11) {
                        this.b = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 7:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f121a = dkVar;
                        dkVar.a(epVar);
                        continue;
                    }
                    epVar.g();
                    break;
                case 8:
                    if (b == 12) {
                        di diVar = new di();
                        this.f120a = diVar;
                        diVar.a(epVar);
                        continue;
                    }
                    epVar.g();
                    break;
            }
            es.a(epVar, b);
            epVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3704a(boolean z) {
        this.c.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3705a() {
        return this.a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3706a(dq dqVar) {
        if (dqVar == null) {
            return false;
        }
        boolean zM3705a = m3705a();
        boolean zM3705a2 = dqVar.m3705a();
        if (((zM3705a || zM3705a2) && (!zM3705a || !zM3705a2 || !this.a.equals(dqVar.a))) || this.f124a != dqVar.f124a || this.f125b != dqVar.f125b) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = dqVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f123a.equals(dqVar.f123a))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dqVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f122a.equals(dqVar.f122a))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dqVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.b.equals(dqVar.b))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dqVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f121a.m3682a(dqVar.f121a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = dqVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.f120a.m3674a(dqVar.f120a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m3707a() {
        a(eg.a(this.f123a));
        return this.f123a.array();
    }

    public dq b(String str) {
        this.b = str;
        return this;
    }

    public dq b(boolean z) {
        this.f125b = z;
        m3708b(true);
        return this;
    }

    public String b() {
        return this.b;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3703a();
        epVar.a(d);
        if (this.a != null) {
            epVar.a(e);
            epVar.mo3782a(this.a.a());
            epVar.b();
        }
        epVar.a(f);
        epVar.a(this.f124a);
        epVar.b();
        epVar.a(g);
        epVar.a(this.f125b);
        epVar.b();
        if (this.f123a != null) {
            epVar.a(h);
            epVar.a(this.f123a);
            epVar.b();
        }
        if (this.f122a != null && f()) {
            epVar.a(i);
            epVar.a(this.f122a);
            epVar.b();
        }
        if (this.b != null && g()) {
            epVar.a(j);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.f121a != null) {
            epVar.a(k);
            this.f121a.b(epVar);
            epVar.b();
        }
        if (this.f120a != null && i()) {
            epVar.a(l);
            this.f120a.b(epVar);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m3708b(boolean z) {
        this.c.set(1, z);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3709b() {
        return this.f124a;
    }

    public boolean c() {
        return this.c.get(0);
    }

    public boolean d() {
        return this.c.get(1);
    }

    public boolean e() {
        return this.f123a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dq)) {
            return m3706a((dq) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f122a != null;
    }

    public boolean g() {
        return this.b != null;
    }

    public boolean h() {
        return this.f121a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f120a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        cz czVar = this.a;
        if (czVar == null) {
            sb.append("null");
        } else {
            sb.append(czVar);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f124a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f125b);
        if (f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f122a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        dk dkVar = this.f121a;
        if (dkVar == null) {
            sb.append("null");
        } else {
            sb.append(dkVar);
        }
        if (i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            di diVar = this.f120a;
            if (diVar == null) {
                sb.append("null");
            } else {
                sb.append(diVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
