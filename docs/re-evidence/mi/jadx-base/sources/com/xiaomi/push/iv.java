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
public class iv implements jm<iv, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f221a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f222a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f223a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f225a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f227b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f229c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f230d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f231e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f220a = new v3t("XmPushActionCommand");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14114a = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14115b = new l2t("", (byte) 11, 3);
    private static final l2t c = new l2t("", (byte) 11, 4);
    private static final l2t d = new l2t("", (byte) 11, 5);
    private static final l2t e = new l2t("", (byte) 15, 6);
    private static final l2t f = new l2t("", (byte) 11, 7);
    private static final l2t g = new l2t("", (byte) 11, 9);
    private static final l2t h = new l2t("", (byte) 2, 10);
    private static final l2t i = new l2t("", (byte) 2, 11);
    private static final l2t j = new l2t("", (byte) 10, 12);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f224a = new BitSet(3);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f226a = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f228b = true;

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m739a() {
        return this.f222a != null;
    }

    public boolean b() {
        return this.f223a != null;
    }

    public boolean c() {
        return this.f227b != null;
    }

    public boolean d() {
        return this.f229c != null;
    }

    public boolean e() {
        return this.f225a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iv)) {
            return m740a((iv) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f230d != null;
    }

    public boolean g() {
        return this.f231e != null;
    }

    public boolean h() {
        return this.f224a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f224a.get(1);
    }

    public boolean j() {
        return this.f224a.get(2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m739a()) {
            sb.append("target:");
            iq iqVar = this.f222a;
            if (iqVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(iqVar);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f223a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f227b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f229c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f225a;
            if (list == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(list);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f230d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f231e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f226a);
        }
        if (i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f228b);
        }
        if (j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f221a);
        }
        sb.append(")");
        return sb.toString();
    }

    public iv a(String str) {
        this.f223a = str;
        return this;
    }

    public iv b(String str) {
        this.f227b = str;
        return this;
    }

    public iv c(String str) {
        this.f229c = str;
        return this;
    }

    public iv d(String str) {
        this.f230d = str;
        return this;
    }

    public iv e(String str) {
        this.f231e = str;
        return this;
    }

    public String a() {
        return this.f229c;
    }

    public void b(boolean z) {
        this.f224a.set(1, z);
    }

    public void c(boolean z) {
        this.f224a.set(2, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m738a(String str) {
        if (this.f225a == null) {
            this.f225a = new ArrayList();
        }
        this.f225a.add(str);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m737a();
        r2tVar.v(f220a);
        if (this.f222a != null && m739a()) {
            r2tVar.s(f14114a);
            this.f222a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f223a != null) {
            r2tVar.s(f14115b);
            r2tVar.q(this.f223a);
            r2tVar.z();
        }
        if (this.f227b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f227b);
            r2tVar.z();
        }
        if (this.f229c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f229c);
            r2tVar.z();
        }
        if (this.f225a != null && e()) {
            r2tVar.s(e);
            r2tVar.t(new n2t((byte) 11, this.f225a.size()));
            Iterator<String> it = this.f225a.iterator();
            while (it.hasNext()) {
                r2tVar.q(it.next());
            }
            r2tVar.C();
            r2tVar.z();
        }
        if (this.f230d != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f230d);
            r2tVar.z();
        }
        if (this.f231e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f231e);
            r2tVar.z();
        }
        if (h()) {
            r2tVar.s(h);
            r2tVar.x(this.f226a);
            r2tVar.z();
        }
        if (i()) {
            r2tVar.s(i);
            r2tVar.x(this.f228b);
            r2tVar.z();
        }
        if (j()) {
            r2tVar.s(j);
            r2tVar.p(this.f221a);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    public void a(boolean z) {
        this.f224a.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m740a(iv ivVar) {
        if (ivVar == null) {
            return false;
        }
        boolean zM739a = m739a();
        boolean zM739a2 = ivVar.m739a();
        if ((zM739a || zM739a2) && !(zM739a && zM739a2 && this.f222a.m725a(ivVar.f222a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = ivVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f223a.equals(ivVar.f223a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = ivVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f227b.equals(ivVar.f227b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = ivVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f229c.equals(ivVar.f229c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = ivVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f225a.equals(ivVar.f225a))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = ivVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f230d.equals(ivVar.f230d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = ivVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f231e.equals(ivVar.f231e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = ivVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f226a == ivVar.f226a)) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = ivVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f228b == ivVar.f228b)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = ivVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.f221a == ivVar.f221a;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iv ivVar) {
        int iC;
        int iK;
        int iK2;
        int iE;
        int iE2;
        int iG;
        int iE3;
        int iE4;
        int iE5;
        int iD;
        if (!getClass().equals(ivVar.getClass())) {
            return getClass().getName().compareTo(ivVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m739a()).compareTo(Boolean.valueOf(ivVar.m739a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m739a() && (iD = c2t.d(this.f222a, ivVar.f222a)) != 0) {
            return iD;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ivVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iE5 = c2t.e(this.f223a, ivVar.f223a)) != 0) {
            return iE5;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ivVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iE4 = c2t.e(this.f227b, ivVar.f227b)) != 0) {
            return iE4;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ivVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE3 = c2t.e(this.f229c, ivVar.f229c)) != 0) {
            return iE3;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ivVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iG = c2t.g(this.f225a, ivVar.f225a)) != 0) {
            return iG;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ivVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE2 = c2t.e(this.f230d, ivVar.f230d)) != 0) {
            return iE2;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ivVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE = c2t.e(this.f231e, ivVar.f231e)) != 0) {
            return iE;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ivVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iK2 = c2t.k(this.f226a, ivVar.f226a)) != 0) {
            return iK2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ivVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iK = c2t.k(this.f228b, ivVar.f228b)) != 0) {
            return iK;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ivVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iC = c2t.c(this.f221a, ivVar.f221a)) == 0) {
            return 0;
        }
        return iC;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) throws jy {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                r2tVar.D();
                m737a();
                return;
            }
            switch (l2tVarG.c) {
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f222a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f223a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f227b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f229c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 15) {
                        n2t n2tVarH = r2tVar.h();
                        this.f225a = new ArrayList(n2tVarH.f27496b);
                        for (int i2 = 0; i2 < n2tVarH.f27496b; i2++) {
                            this.f225a.add(r2tVar.e());
                        }
                        r2tVar.G();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f230d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                default:
                    m3t.a(r2tVar, b2);
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f231e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 2) {
                        this.f226a = r2tVar.y();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 2) {
                        this.f228b = r2tVar.y();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 10) {
                        this.f221a = r2tVar.d();
                        c(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m737a() throws jy {
        if (this.f223a != null) {
            if (this.f227b != null) {
                if (this.f229c != null) {
                    return;
                }
                throw new jy("Required field 'cmdName' was not present! Struct: " + toString());
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
