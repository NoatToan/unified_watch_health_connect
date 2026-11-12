package com.xiaomi.push;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import defpackage.c2t;
import defpackage.l2t;
import defpackage.m3t;
import defpackage.n2t;
import defpackage.r2t;
import defpackage.v3t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class ie implements jm<ie, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<Cif> f94a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f93a = new v3t("ClientUploadData");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14072a = new l2t("", (byte) 15, 1);

    public int a() {
        List<Cif> list = this.f94a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m678a();
        r2tVar.v(f93a);
        if (this.f94a != null) {
            r2tVar.s(f14072a);
            r2tVar.t(new n2t(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, this.f94a.size()));
            Iterator<Cif> it = this.f94a.iterator();
            while (it.hasNext()) {
                it.next().b(r2tVar);
            }
            r2tVar.C();
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ie)) {
            return m680a((ie) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(");
        sb.append("uploadDataItems:");
        List<Cif> list = this.f94a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    public void a(Cif cif) {
        if (this.f94a == null) {
            this.f94a = new ArrayList();
        }
        this.f94a.add(cif);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m679a() {
        return this.f94a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m680a(ie ieVar) {
        if (ieVar == null) {
            return false;
        }
        boolean zM679a = m679a();
        boolean zM679a2 = ieVar.m679a();
        if (zM679a || zM679a2) {
            return zM679a && zM679a2 && this.f94a.equals(ieVar.f94a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ie ieVar) {
        int iG;
        if (!getClass().equals(ieVar.getClass())) {
            return getClass().getName().compareTo(ieVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m679a()).compareTo(Boolean.valueOf(ieVar.m679a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m679a() || (iG = c2t.g(this.f94a, ieVar.f94a)) == 0) {
            return 0;
        }
        return iG;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) throws jy {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                r2tVar.D();
                m678a();
                return;
            }
            if (l2tVarG.c != 1) {
                m3t.a(r2tVar, b2);
            } else if (b2 == 15) {
                n2t n2tVarH = r2tVar.h();
                this.f94a = new ArrayList(n2tVarH.f27496b);
                for (int i = 0; i < n2tVarH.f27496b; i++) {
                    Cif cif = new Cif();
                    cif.a(r2tVar);
                    this.f94a.add(cif);
                }
                r2tVar.G();
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m678a() throws jy {
        if (this.f94a != null) {
            return;
        }
        throw new jy("Required field 'uploadDataItems' was not present! Struct: " + toString());
    }
}
