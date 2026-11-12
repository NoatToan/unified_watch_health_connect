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
public class fu implements jm<fu, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f78a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<ft> f79a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f80b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f77a = new v3t("StatsEvents");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14051a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14052b = new l2t("", (byte) 11, 2);
    private static final l2t c = new l2t("", (byte) 15, 3);

    public fu() {
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m676a() {
        return this.f78a != null;
    }

    public boolean b() {
        return this.f80b != null;
    }

    public boolean c() {
        return this.f79a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fu)) {
            return m677a((fu) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(");
        sb.append("uuid:");
        String str = this.f78a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f80b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<ft> list = this.f79a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    public fu(String str, List<ft> list) {
        this();
        this.f78a = str;
        this.f79a = list;
    }

    public fu a(String str) {
        this.f80b = str;
        return this;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) {
        a();
        r2tVar.v(f77a);
        if (this.f78a != null) {
            r2tVar.s(f14051a);
            r2tVar.q(this.f78a);
            r2tVar.z();
        }
        if (this.f80b != null && b()) {
            r2tVar.s(f14052b);
            r2tVar.q(this.f80b);
            r2tVar.z();
        }
        if (this.f79a != null) {
            r2tVar.s(c);
            r2tVar.t(new n2t(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, this.f79a.size()));
            Iterator<ft> it = this.f79a.iterator();
            while (it.hasNext()) {
                it.next().b(r2tVar);
            }
            r2tVar.C();
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m677a(fu fuVar) {
        if (fuVar == null) {
            return false;
        }
        boolean zM676a = m676a();
        boolean zM676a2 = fuVar.m676a();
        if ((zM676a || zM676a2) && !(zM676a && zM676a2 && this.f78a.equals(fuVar.f78a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = fuVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f80b.equals(fuVar.f80b))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = fuVar.c();
        if (zC || zC2) {
            return zC && zC2 && this.f79a.equals(fuVar.f79a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fu fuVar) {
        int iG;
        int iE;
        int iE2;
        if (!getClass().equals(fuVar.getClass())) {
            return getClass().getName().compareTo(fuVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m676a()).compareTo(Boolean.valueOf(fuVar.m676a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m676a() && (iE2 = c2t.e(this.f78a, fuVar.f78a)) != 0) {
            return iE2;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(fuVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iE = c2t.e(this.f80b, fuVar.f80b)) != 0) {
            return iE;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(fuVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!c() || (iG = c2t.g(this.f79a, fuVar.f79a)) == 0) {
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
            short s = l2tVarG.c;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        m3t.a(r2tVar, b2);
                    } else if (b2 == 15) {
                        n2t n2tVarH = r2tVar.h();
                        this.f79a = new ArrayList(n2tVarH.f27496b);
                        for (int i = 0; i < n2tVarH.f27496b; i++) {
                            ft ftVar = new ft();
                            ftVar.a(r2tVar);
                            this.f79a.add(ftVar);
                        }
                        r2tVar.G();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                } else if (b2 == 11) {
                    this.f80b = r2tVar.e();
                } else {
                    m3t.a(r2tVar, b2);
                }
            } else if (b2 == 11) {
                this.f78a = r2tVar.e();
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
    }

    public void a() throws jy {
        if (this.f78a != null) {
            if (this.f79a != null) {
                return;
            }
            throw new jy("Required field 'events' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'uuid' was not present! Struct: " + toString());
    }
}
