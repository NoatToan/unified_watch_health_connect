package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class dr implements ef<dr, Object>, Serializable, Cloneable {
    private static final eu b = new eu("XmPushActionCustomConfig");
    private static final em c = new em("", (byte) 15, 1);
    public List<dg> a;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dr drVar) {
        int iA;
        if (!getClass().equals(drVar.getClass())) {
            return getClass().getName().compareTo(drVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3711a()).compareTo(Boolean.valueOf(drVar.m3711a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m3711a() || (iA = eg.a(this.a, drVar.a)) == 0) {
            return 0;
        }
        return iA;
    }

    public List<dg> a() {
        return this.a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3710a() throws eq {
        if (this.a != null) {
            return;
        }
        throw new eq("Required field 'customConfigs' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b2 = emVarMo3773a.a;
            if (b2 == 0) {
                epVar.f();
                m3710a();
                return;
            }
            if (emVarMo3773a.f173a == 1 && b2 == 15) {
                en enVarMo3774a = epVar.mo3774a();
                this.a = new ArrayList(enVarMo3774a.f174a);
                for (int i = 0; i < enVarMo3774a.f174a; i++) {
                    dg dgVar = new dg();
                    dgVar.a(epVar);
                    this.a.add(dgVar);
                }
                epVar.i();
            } else {
                es.a(epVar, b2);
            }
            epVar.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3711a() {
        return this.a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3712a(dr drVar) {
        if (drVar == null) {
            return false;
        }
        boolean zM3711a = m3711a();
        boolean zM3711a2 = drVar.m3711a();
        if (zM3711a || zM3711a2) {
            return zM3711a && zM3711a2 && this.a.equals(drVar.a);
        }
        return true;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3710a();
        epVar.a(b);
        if (this.a != null) {
            epVar.a(c);
            epVar.a(new en((byte) 12, this.a.size()));
            Iterator<dg> it2 = this.a.iterator();
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
        if (obj != null && (obj instanceof dr)) {
            return m3712a((dr) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        List<dg> list = this.a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
