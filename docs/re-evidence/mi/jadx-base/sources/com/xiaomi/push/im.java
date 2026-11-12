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
public class im implements jm<im, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f127a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f128a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f129a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f130a = new BitSet(6);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f131a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f132b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f133b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f134c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f126a = new v3t("OnlineConfigItem");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14092a = new l2t("", (byte) 8, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14093b = new l2t("", (byte) 8, 2);
    private static final l2t c = new l2t("", (byte) 2, 3);
    private static final l2t d = new l2t("", (byte) 8, 4);
    private static final l2t e = new l2t("", (byte) 10, 5);
    private static final l2t f = new l2t("", (byte) 11, 6);
    private static final l2t g = new l2t("", (byte) 2, 7);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m700a() {
    }

    public int b() {
        return this.f132b;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m704c() {
        return this.f130a.get(2);
    }

    public boolean d() {
        return this.f130a.get(3);
    }

    public boolean e() {
        return this.f130a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof im)) {
            return m702a((im) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f129a != null;
    }

    public boolean g() {
        return this.f133b;
    }

    public boolean h() {
        return this.f130a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (m701a()) {
            sb.append("key:");
            sb.append(this.f127a);
            z = false;
        } else {
            z = true;
        }
        if (m703b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f132b);
            z = false;
        }
        if (m704c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f131a);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f134c);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f128a);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f129a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
        } else {
            z2 = z;
        }
        if (h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f133b);
        }
        sb.append(")");
        return sb.toString();
    }

    public int a() {
        return this.f127a;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m703b() {
        return this.f130a.get(1);
    }

    public void c(boolean z) {
        this.f130a.set(2, z);
    }

    public void d(boolean z) {
        this.f130a.set(3, z);
    }

    public void e(boolean z) {
        this.f130a.set(4, z);
    }

    public void f(boolean z) {
        this.f130a.set(5, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m701a() {
        return this.f130a.get(0);
    }

    public void b(boolean z) {
        this.f130a.set(1, z);
    }

    public int c() {
        return this.f134c;
    }

    public void a(boolean z) {
        this.f130a.set(0, z);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) {
        m700a();
        r2tVar.v(f126a);
        if (m701a()) {
            r2tVar.s(f14092a);
            r2tVar.o(this.f127a);
            r2tVar.z();
        }
        if (m703b()) {
            r2tVar.s(f14093b);
            r2tVar.o(this.f132b);
            r2tVar.z();
        }
        if (m704c()) {
            r2tVar.s(c);
            r2tVar.x(this.f131a);
            r2tVar.z();
        }
        if (d()) {
            r2tVar.s(d);
            r2tVar.o(this.f134c);
            r2tVar.z();
        }
        if (e()) {
            r2tVar.s(e);
            r2tVar.p(this.f128a);
            r2tVar.z();
        }
        if (this.f129a != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f129a);
            r2tVar.z();
        }
        if (h()) {
            r2tVar.s(g);
            r2tVar.x(this.f133b);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m698a() {
        return this.f128a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m699a() {
        return this.f129a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m702a(im imVar) {
        if (imVar == null) {
            return false;
        }
        boolean zM701a = m701a();
        boolean zM701a2 = imVar.m701a();
        if ((zM701a || zM701a2) && !(zM701a && zM701a2 && this.f127a == imVar.f127a)) {
            return false;
        }
        boolean zM703b = m703b();
        boolean zM703b2 = imVar.m703b();
        if ((zM703b || zM703b2) && !(zM703b && zM703b2 && this.f132b == imVar.f132b)) {
            return false;
        }
        boolean zM704c = m704c();
        boolean zM704c2 = imVar.m704c();
        if ((zM704c || zM704c2) && !(zM704c && zM704c2 && this.f131a == imVar.f131a)) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = imVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f134c == imVar.f134c)) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = imVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f128a == imVar.f128a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = imVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f129a.equals(imVar.f129a))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = imVar.h();
        if (zH || zH2) {
            return zH && zH2 && this.f133b == imVar.f133b;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(im imVar) {
        int iK;
        int iE;
        int iC;
        int iB;
        int iK2;
        int iB2;
        int iB3;
        if (!getClass().equals(imVar.getClass())) {
            return getClass().getName().compareTo(imVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m701a()).compareTo(Boolean.valueOf(imVar.m701a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m701a() && (iB3 = c2t.b(this.f127a, imVar.f127a)) != 0) {
            return iB3;
        }
        int iCompareTo2 = Boolean.valueOf(m703b()).compareTo(Boolean.valueOf(imVar.m703b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m703b() && (iB2 = c2t.b(this.f132b, imVar.f132b)) != 0) {
            return iB2;
        }
        int iCompareTo3 = Boolean.valueOf(m704c()).compareTo(Boolean.valueOf(imVar.m704c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m704c() && (iK2 = c2t.k(this.f131a, imVar.f131a)) != 0) {
            return iK2;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(imVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iB = c2t.b(this.f134c, imVar.f134c)) != 0) {
            return iB;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(imVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iC = c2t.c(this.f128a, imVar.f128a)) != 0) {
            return iC;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(imVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE = c2t.e(this.f129a, imVar.f129a)) != 0) {
            return iE;
        }
        int iCompareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(imVar.h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!h() || (iK = c2t.k(this.f133b, imVar.f133b)) == 0) {
            return 0;
        }
        return iK;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                r2tVar.D();
                m700a();
                return;
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 8) {
                        this.f127a = r2tVar.c();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 8) {
                        this.f132b = r2tVar.c();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 2) {
                        this.f131a = r2tVar.y();
                        c(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 8) {
                        this.f134c = r2tVar.c();
                        d(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 10) {
                        this.f128a = r2tVar.d();
                        e(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f129a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 2) {
                        this.f133b = r2tVar.y();
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
}
