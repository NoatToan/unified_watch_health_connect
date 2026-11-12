package com.xiaomi.push;

import defpackage.c2t;
import defpackage.l2t;
import defpackage.m3t;
import defpackage.r2t;
import defpackage.v3t;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class ft implements jm<ft, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public byte f66a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f67a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f68a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f69a = new BitSet(6);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f70b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f71b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f72c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f73c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public int f74d;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f75d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public int f76e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f65a = new v3t("StatsEvent");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14049a = new l2t("", (byte) 3, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14050b = new l2t("", (byte) 8, 2);
    private static final l2t c = new l2t("", (byte) 8, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 8, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", (byte) 11, 8);
    private static final l2t i = new l2t("", (byte) 8, 9);
    private static final l2t j = new l2t("", (byte) 8, 10);

    public ft a(byte b2) {
        this.f66a = b2;
        a(true);
        return this;
    }

    public boolean b() {
        return this.f69a.get(1);
    }

    public boolean c() {
        return this.f69a.get(2);
    }

    public boolean d() {
        return this.f68a != null;
    }

    public boolean e() {
        return this.f71b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ft)) {
            return m675a((ft) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f69a.get(3);
    }

    public boolean g() {
        return this.f73c != null;
    }

    public boolean h() {
        return this.f75d != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f69a.get(4);
    }

    public boolean j() {
        return this.f69a.get(5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(");
        sb.append("chid:");
        sb.append((int) this.f66a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f67a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f70b);
        sb.append(", ");
        sb.append("connpt:");
        String str = this.f68a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (e()) {
            sb.append(", ");
            sb.append("host:");
            String str2 = this.f71b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f72c);
        }
        if (g()) {
            sb.append(", ");
            sb.append("annotation:");
            String str3 = this.f73c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("user:");
            String str4 = this.f75d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f74d);
        }
        if (j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f76e);
        }
        sb.append(")");
        return sb.toString();
    }

    public void b(boolean z) {
        this.f69a.set(1, z);
    }

    public void c(boolean z) {
        this.f69a.set(2, z);
    }

    public void d(boolean z) {
        this.f69a.set(3, z);
    }

    public void e(boolean z) {
        this.f69a.set(4, z);
    }

    public void f(boolean z) {
        this.f69a.set(5, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m674a() {
        return this.f69a.get(0);
    }

    public ft b(int i2) {
        this.f70b = i2;
        c(true);
        return this;
    }

    public ft c(int i2) {
        this.f72c = i2;
        d(true);
        return this;
    }

    public ft d(String str) {
        this.f75d = str;
        return this;
    }

    public void a(boolean z) {
        this.f69a.set(0, z);
    }

    public ft d(int i2) {
        this.f74d = i2;
        e(true);
        return this;
    }

    public ft a(int i2) {
        this.f67a = i2;
        b(true);
        return this;
    }

    public ft b(String str) {
        this.f71b = str;
        return this;
    }

    public ft c(String str) {
        this.f73c = str;
        return this;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) {
        a();
        r2tVar.v(f65a);
        r2tVar.s(f14049a);
        r2tVar.n(this.f66a);
        r2tVar.z();
        r2tVar.s(f14050b);
        r2tVar.o(this.f67a);
        r2tVar.z();
        r2tVar.s(c);
        r2tVar.o(this.f70b);
        r2tVar.z();
        if (this.f68a != null) {
            r2tVar.s(d);
            r2tVar.q(this.f68a);
            r2tVar.z();
        }
        if (this.f71b != null && e()) {
            r2tVar.s(e);
            r2tVar.q(this.f71b);
            r2tVar.z();
        }
        if (f()) {
            r2tVar.s(f);
            r2tVar.o(this.f72c);
            r2tVar.z();
        }
        if (this.f73c != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f73c);
            r2tVar.z();
        }
        if (this.f75d != null && h()) {
            r2tVar.s(h);
            r2tVar.q(this.f75d);
            r2tVar.z();
        }
        if (i()) {
            r2tVar.s(i);
            r2tVar.o(this.f74d);
            r2tVar.z();
        }
        if (j()) {
            r2tVar.s(j);
            r2tVar.o(this.f76e);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    public ft a(String str) {
        this.f68a = str;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m675a(ft ftVar) {
        if (ftVar == null || this.f66a != ftVar.f66a || this.f67a != ftVar.f67a || this.f70b != ftVar.f70b) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = ftVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f68a.equals(ftVar.f68a))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = ftVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f71b.equals(ftVar.f71b))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = ftVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f72c == ftVar.f72c)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = ftVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f73c.equals(ftVar.f73c))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = ftVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f75d.equals(ftVar.f75d))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = ftVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f74d == ftVar.f74d)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = ftVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.f76e == ftVar.f76e;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ft ftVar) {
        int iB;
        int iB2;
        int iE;
        int iE2;
        int iB3;
        int iE3;
        int iE4;
        int iB4;
        int iB5;
        int iA;
        if (!getClass().equals(ftVar.getClass())) {
            return getClass().getName().compareTo(ftVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m674a()).compareTo(Boolean.valueOf(ftVar.m674a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m674a() && (iA = c2t.a(this.f66a, ftVar.f66a)) != 0) {
            return iA;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ftVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iB5 = c2t.b(this.f67a, ftVar.f67a)) != 0) {
            return iB5;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ftVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iB4 = c2t.b(this.f70b, ftVar.f70b)) != 0) {
            return iB4;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ftVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE4 = c2t.e(this.f68a, ftVar.f68a)) != 0) {
            return iE4;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ftVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iE3 = c2t.e(this.f71b, ftVar.f71b)) != 0) {
            return iE3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ftVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iB3 = c2t.b(this.f72c, ftVar.f72c)) != 0) {
            return iB3;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ftVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE2 = c2t.e(this.f73c, ftVar.f73c)) != 0) {
            return iE2;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ftVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iE = c2t.e(this.f75d, ftVar.f75d)) != 0) {
            return iE;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ftVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iB2 = c2t.b(this.f74d, ftVar.f74d)) != 0) {
            return iB2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ftVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iB = c2t.b(this.f76e, ftVar.f76e)) == 0) {
            return 0;
        }
        return iB;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) throws jy {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                r2tVar.D();
                if (m674a()) {
                    if (b()) {
                        if (c()) {
                            a();
                            return;
                        }
                        throw new jy("Required field 'value' was not found in serialized data! Struct: " + toString());
                    }
                    throw new jy("Required field 'type' was not found in serialized data! Struct: " + toString());
                }
                throw new jy("Required field 'chid' was not found in serialized data! Struct: " + toString());
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 3) {
                        this.f66a = r2tVar.a();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 8) {
                        this.f67a = r2tVar.c();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 8) {
                        this.f70b = r2tVar.c();
                        c(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f68a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f71b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 8) {
                        this.f72c = r2tVar.c();
                        d(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f73c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f75d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 8) {
                        this.f74d = r2tVar.c();
                        e(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 8) {
                        this.f76e = r2tVar.c();
                        f(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                default:
                    m3t.a(r2tVar, b2);
                    break;
            }
            r2tVar.E();
        }
    }

    public void a() throws jy {
        if (this.f68a != null) {
            return;
        }
        throw new jy("Required field 'connpt' was not present! Struct: " + toString());
    }
}
