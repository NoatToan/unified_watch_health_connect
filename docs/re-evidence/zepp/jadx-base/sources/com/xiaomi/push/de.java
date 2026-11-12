package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class de implements ef<de, Object>, Serializable, Cloneable {
    private static final eu c = new eu("NormalConfig");
    private static final em d = new em("", (byte) 8, 1);
    private static final em e = new em("", (byte) 15, 2);
    private static final em f = new em("", (byte) 8, 3);
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dc f74a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<dg> f75a;
    private BitSet b = new BitSet(1);

    public int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(de deVar) {
        int iA;
        int iA2;
        int iA3;
        if (!getClass().equals(deVar.getClass())) {
            return getClass().getName().compareTo(deVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3653a()).compareTo(Boolean.valueOf(deVar.m3653a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3653a() && (iA3 = eg.a(this.a, deVar.a)) != 0) {
            return iA3;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(deVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA2 = eg.a(this.f75a, deVar.f75a)) != 0) {
            return iA2;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(deVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!c() || (iA = eg.a(this.f74a, deVar.f74a)) == 0) {
            return 0;
        }
        return iA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public dc m3651a() {
        return this.f74a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3652a() throws eq {
        if (this.f75a != null) {
            return;
        }
        throw new eq("Required field 'configItems' was not present! Struct: " + toString());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                break;
            }
            short s = emVarMo3773a.f173a;
            if (s != 1) {
                if (s != 2) {
                    if (s == 3 && b == 8) {
                        this.f74a = dc.a(epVar.mo3771a());
                    } else {
                        es.a(epVar, b);
                    }
                } else if (b == 15) {
                    en enVarMo3774a = epVar.mo3774a();
                    this.f75a = new ArrayList(enVarMo3774a.f174a);
                    for (int i = 0; i < enVarMo3774a.f174a; i++) {
                        dg dgVar = new dg();
                        dgVar.a(epVar);
                        this.f75a.add(dgVar);
                    }
                    epVar.i();
                } else {
                    es.a(epVar, b);
                }
            } else if (b == 8) {
                this.a = epVar.mo3771a();
                a(true);
            } else {
                es.a(epVar, b);
            }
            epVar.g();
        }
        epVar.f();
        if (m3653a()) {
            m3652a();
            return;
        }
        throw new eq("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z) {
        this.b.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3653a() {
        return this.b.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3654a(de deVar) {
        if (deVar == null || this.a != deVar.a) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = deVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f75a.equals(deVar.f75a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = deVar.c();
        if (zC || zC2) {
            return zC && zC2 && this.f74a.equals(deVar.f74a);
        }
        return true;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3652a();
        epVar.a(c);
        epVar.a(d);
        epVar.mo3782a(this.a);
        epVar.b();
        if (this.f75a != null) {
            epVar.a(e);
            epVar.a(new en((byte) 12, this.f75a.size()));
            Iterator<dg> it2 = this.f75a.iterator();
            while (it2.hasNext()) {
                it2.next().b(epVar);
            }
            epVar.e();
            epVar.b();
        }
        if (this.f74a != null && c()) {
            epVar.a(f);
            epVar.mo3782a(this.f74a.a());
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public boolean b() {
        return this.f75a != null;
    }

    public boolean c() {
        return this.f74a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof de)) {
            return m3654a((de) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.a);
        sb.append(", ");
        sb.append("configItems:");
        List<dg> list = this.f75a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        if (c()) {
            sb.append(", ");
            sb.append("type:");
            dc dcVar = this.f74a;
            if (dcVar == null) {
                sb.append("null");
            } else {
                sb.append(dcVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
