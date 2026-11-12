package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes22.dex */
public class dn implements ef<dn, Object>, Serializable, Cloneable {
    private static final eu d = new eu("XmPushActionCheckClientInfo");
    private static final em e = new em("", (byte) 8, 1);
    private static final em f = new em("", (byte) 8, 2);
    public int a;
    public int b;
    private BitSet c = new BitSet(2);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dn dnVar) {
        int iA;
        int iA2;
        if (!getClass().equals(dnVar.getClass())) {
            return getClass().getName().compareTo(dnVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3690a()).compareTo(Boolean.valueOf(dnVar.m3690a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3690a() && (iA2 = eg.a(this.a, dnVar.a)) != 0) {
            return iA2;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(dnVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (!b() || (iA = eg.a(this.b, dnVar.b)) == 0) {
            return 0;
        }
        return iA;
    }

    public dn a(int i) {
        this.a = i;
        a(true);
        return this;
    }

    public void a() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
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
                if (s == 2 && b == 8) {
                    this.b = epVar.mo3771a();
                    b(true);
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
        if (!m3690a()) {
            throw new eq("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        }
        if (b()) {
            a();
            return;
        }
        throw new eq("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z) {
        this.c.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3690a() {
        return this.c.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3691a(dn dnVar) {
        return dnVar != null && this.a == dnVar.a && this.b == dnVar.b;
    }

    public dn b(int i) {
        this.b = i;
        b(true);
        return this;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) {
        a();
        epVar.a(d);
        epVar.a(e);
        epVar.mo3782a(this.a);
        epVar.b();
        epVar.a(f);
        epVar.mo3782a(this.b);
        epVar.b();
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z) {
        this.c.set(1, z);
    }

    public boolean b() {
        return this.c.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dn)) {
            return m3691a((dn) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.a + ", pluginConfigVersion:" + this.b + ")";
    }
}
