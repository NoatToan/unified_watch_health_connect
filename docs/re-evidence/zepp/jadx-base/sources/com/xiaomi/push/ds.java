package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ds implements ef<ds, Object>, Serializable, Cloneable {
    private static final eu b = new eu("XmPushActionNormalConfig");
    private static final em c = new em("", (byte) 15, 1);
    public List<de> a;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ds dsVar) {
        int iA;
        if (!getClass().equals(dsVar.getClass())) {
            return getClass().getName().compareTo(dsVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3714a()).compareTo(Boolean.valueOf(dsVar.m3714a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m3714a() || (iA = eg.a(this.a, dsVar.a)) == 0) {
            return 0;
        }
        return iA;
    }

    public List<de> a() {
        return this.a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3713a() throws eq {
        if (this.a != null) {
            return;
        }
        throw new eq("Required field 'normalConfigs' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b2 = emVarMo3773a.a;
            if (b2 == 0) {
                epVar.f();
                m3713a();
                return;
            }
            if (emVarMo3773a.f173a == 1 && b2 == 15) {
                en enVarMo3774a = epVar.mo3774a();
                this.a = new ArrayList(enVarMo3774a.f174a);
                for (int i = 0; i < enVarMo3774a.f174a; i++) {
                    de deVar = new de();
                    deVar.a(epVar);
                    this.a.add(deVar);
                }
                epVar.i();
            } else {
                es.a(epVar, b2);
            }
            epVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3714a() {
        return this.a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3715a(ds dsVar) {
        if (dsVar == null) {
            return false;
        }
        boolean zM3714a = m3714a();
        boolean zM3714a2 = dsVar.m3714a();
        if (zM3714a || zM3714a2) {
            return zM3714a && zM3714a2 && this.a.equals(dsVar.a);
        }
        return true;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3713a();
        epVar.a(b);
        if (this.a != null) {
            epVar.a(c);
            epVar.a(new en((byte) 12, this.a.size()));
            Iterator<de> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().b(epVar);
            }
            epVar.e();
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ds)) {
            return m3715a((ds) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(");
        sb.append("normalConfigs:");
        List<de> list = this.a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
