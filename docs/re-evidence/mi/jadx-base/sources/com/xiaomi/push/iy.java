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
public class iy implements jm<iy, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<im> f255a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f254a = new v3t("XmPushActionCustomConfig");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14120a = new l2t("", (byte) 15, 1);

    public List<im> a() {
        return this.f255a;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m756a();
        r2tVar.v(f254a);
        if (this.f255a != null) {
            r2tVar.s(f14120a);
            r2tVar.t(new n2t(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, this.f255a.size()));
            Iterator<im> it = this.f255a.iterator();
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
        if (obj != null && (obj instanceof iy)) {
            return m758a((iy) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        List<im> list = this.f255a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m757a() {
        return this.f255a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m758a(iy iyVar) {
        if (iyVar == null) {
            return false;
        }
        boolean zM757a = m757a();
        boolean zM757a2 = iyVar.m757a();
        if (zM757a || zM757a2) {
            return zM757a && zM757a2 && this.f255a.equals(iyVar.f255a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iy iyVar) {
        int iG;
        if (!getClass().equals(iyVar.getClass())) {
            return getClass().getName().compareTo(iyVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m757a()).compareTo(Boolean.valueOf(iyVar.m757a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m757a() || (iG = c2t.g(this.f255a, iyVar.f255a)) == 0) {
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
                m756a();
                return;
            }
            if (l2tVarG.c != 1) {
                m3t.a(r2tVar, b2);
            } else if (b2 == 15) {
                n2t n2tVarH = r2tVar.h();
                this.f255a = new ArrayList(n2tVarH.f27496b);
                for (int i = 0; i < n2tVarH.f27496b; i++) {
                    im imVar = new im();
                    imVar.a(r2tVar);
                    this.f255a.add(imVar);
                }
                r2tVar.G();
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m756a() throws jy {
        if (this.f255a != null) {
            return;
        }
        throw new jy("Required field 'customConfigs' was not present! Struct: " + toString());
    }
}
