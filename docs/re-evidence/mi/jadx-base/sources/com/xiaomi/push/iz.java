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
public class iz implements jm<iz, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<ik> f257a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f256a = new v3t("XmPushActionNormalConfig");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14121a = new l2t("", (byte) 15, 1);

    public List<ik> a() {
        return this.f257a;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m759a();
        r2tVar.v(f256a);
        if (this.f257a != null) {
            r2tVar.s(f14121a);
            r2tVar.t(new n2t(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, this.f257a.size()));
            Iterator<ik> it = this.f257a.iterator();
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
        if (obj != null && (obj instanceof iz)) {
            return m761a((iz) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(");
        sb.append("normalConfigs:");
        List<ik> list = this.f257a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m760a() {
        return this.f257a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m761a(iz izVar) {
        if (izVar == null) {
            return false;
        }
        boolean zM760a = m760a();
        boolean zM760a2 = izVar.m760a();
        if (zM760a || zM760a2) {
            return zM760a && zM760a2 && this.f257a.equals(izVar.f257a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iz izVar) {
        int iG;
        if (!getClass().equals(izVar.getClass())) {
            return getClass().getName().compareTo(izVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m760a()).compareTo(Boolean.valueOf(izVar.m760a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m760a() || (iG = c2t.g(this.f257a, izVar.f257a)) == 0) {
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
                m759a();
                return;
            }
            if (l2tVarG.c != 1) {
                m3t.a(r2tVar, b2);
            } else if (b2 == 15) {
                n2t n2tVarH = r2tVar.h();
                this.f257a = new ArrayList(n2tVarH.f27496b);
                for (int i = 0; i < n2tVarH.f27496b; i++) {
                    ik ikVar = new ik();
                    ikVar.a(r2tVar);
                    this.f257a.add(ikVar);
                }
                r2tVar.G();
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m759a() throws jy {
        if (this.f257a != null) {
            return;
        }
        throw new jy("Required field 'normalConfigs' was not present! Struct: " + toString());
    }
}
