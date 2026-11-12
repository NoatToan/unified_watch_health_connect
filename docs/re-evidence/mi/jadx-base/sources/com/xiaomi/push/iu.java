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
public class iu implements jm<iu, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<ij> f219a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f218a = new v3t("XmPushActionCollectData");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14113a = new l2t("", (byte) 15, 1);

    public iu a(List<ij> list) {
        this.f219a = list;
        return this;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        a();
        r2tVar.v(f218a);
        if (this.f219a != null) {
            r2tVar.s(f14113a);
            r2tVar.t(new n2t(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, this.f219a.size()));
            Iterator<ij> it = this.f219a.iterator();
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
        if (obj != null && (obj instanceof iu)) {
            return m736a((iu) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(");
        sb.append("dataCollectionItems:");
        List<ij> list = this.f219a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m735a() {
        return this.f219a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m736a(iu iuVar) {
        if (iuVar == null) {
            return false;
        }
        boolean zM735a = m735a();
        boolean zM735a2 = iuVar.m735a();
        if (zM735a || zM735a2) {
            return zM735a && zM735a2 && this.f219a.equals(iuVar.f219a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iu iuVar) {
        int iG;
        if (!getClass().equals(iuVar.getClass())) {
            return getClass().getName().compareTo(iuVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m735a()).compareTo(Boolean.valueOf(iuVar.m735a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m735a() || (iG = c2t.g(this.f219a, iuVar.f219a)) == 0) {
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
                a();
                return;
            }
            if (l2tVarG.c != 1) {
                m3t.a(r2tVar, b2);
            } else if (b2 == 15) {
                n2t n2tVarH = r2tVar.h();
                this.f219a = new ArrayList(n2tVarH.f27496b);
                for (int i = 0; i < n2tVarH.f27496b; i++) {
                    ij ijVar = new ij();
                    ijVar.a(r2tVar);
                    this.f219a.add(ijVar);
                }
                r2tVar.G();
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
    }

    public void a() throws jy {
        if (this.f219a != null) {
            return;
        }
        throw new jy("Required field 'dataCollectionItems' was not present! Struct: " + toString());
    }
}
