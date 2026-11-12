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
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class ik implements jm<ik, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f120a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ih f121a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f122a = new BitSet(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<im> f123a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f119a = new v3t("NormalConfig");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14086a = new l2t("", (byte) 8, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14087b = new l2t("", (byte) 15, 2);
    private static final l2t c = new l2t("", (byte) 8, 3);

    public int a() {
        return this.f120a;
    }

    public boolean b() {
        return this.f123a != null;
    }

    public boolean c() {
        return this.f121a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ik)) {
            return m697a((ik) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.f120a);
        sb.append(", ");
        sb.append("configItems:");
        List<im> list = this.f123a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        if (c()) {
            sb.append(", ");
            sb.append("type:");
            ih ihVar = this.f121a;
            if (ihVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(ihVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m696a() {
        return this.f122a.get(0);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m695a();
        r2tVar.v(f119a);
        r2tVar.s(f14086a);
        r2tVar.o(this.f120a);
        r2tVar.z();
        if (this.f123a != null) {
            r2tVar.s(f14087b);
            r2tVar.t(new n2t(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, this.f123a.size()));
            Iterator<im> it = this.f123a.iterator();
            while (it.hasNext()) {
                it.next().b(r2tVar);
            }
            r2tVar.C();
            r2tVar.z();
        }
        if (this.f121a != null && c()) {
            r2tVar.s(c);
            r2tVar.o(this.f121a.a());
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    public void a(boolean z) {
        this.f122a.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ih m694a() {
        return this.f121a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m697a(ik ikVar) {
        if (ikVar == null || this.f120a != ikVar.f120a) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = ikVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f123a.equals(ikVar.f123a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = ikVar.c();
        if (zC || zC2) {
            return zC && zC2 && this.f121a.equals(ikVar.f121a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ik ikVar) {
        int iD;
        int iG;
        int iB;
        if (!getClass().equals(ikVar.getClass())) {
            return getClass().getName().compareTo(ikVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m696a()).compareTo(Boolean.valueOf(ikVar.m696a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m696a() && (iB = c2t.b(this.f120a, ikVar.f120a)) != 0) {
            return iB;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ikVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iG = c2t.g(this.f123a, ikVar.f123a)) != 0) {
            return iG;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ikVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!c() || (iD = c2t.d(this.f121a, ikVar.f121a)) == 0) {
            return 0;
        }
        return iD;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) throws jy {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                break;
            }
            short s = l2tVarG.c;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        m3t.a(r2tVar, b2);
                    } else if (b2 == 8) {
                        this.f121a = ih.a(r2tVar.c());
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                } else if (b2 == 15) {
                    n2t n2tVarH = r2tVar.h();
                    this.f123a = new ArrayList(n2tVarH.f27496b);
                    for (int i = 0; i < n2tVarH.f27496b; i++) {
                        im imVar = new im();
                        imVar.a(r2tVar);
                        this.f123a.add(imVar);
                    }
                    r2tVar.G();
                } else {
                    m3t.a(r2tVar, b2);
                }
            } else if (b2 == 8) {
                this.f120a = r2tVar.c();
                a(true);
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
        r2tVar.D();
        if (m696a()) {
            m695a();
            return;
        }
        throw new jy("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m695a() throws jy {
        if (this.f123a != null) {
            return;
        }
        throw new jy("Required field 'configItems' was not present! Struct: " + toString());
    }
}
