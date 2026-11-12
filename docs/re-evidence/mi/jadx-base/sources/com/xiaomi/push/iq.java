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
public class iq implements jm<iq, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f174a;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f179d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f172a = new v3t("Target");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14103a = new l2t("", (byte) 10, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14104b = new l2t("", (byte) 11, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 2, 5);
    private static final l2t f = new l2t("", (byte) 11, 7);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f175a = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f173a = 5;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f177b = "xiaomi.com";

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f178c = "";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f176a = false;

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m724a() {
        return this.f175a.get(0);
    }

    public boolean b() {
        return this.f174a != null;
    }

    public boolean c() {
        return this.f177b != null;
    }

    public boolean d() {
        return this.f178c != null;
    }

    public boolean e() {
        return this.f175a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iq)) {
            return m725a((iq) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f179d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.f173a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f174a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f177b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        if (d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f178c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f176a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f179d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void a(boolean z) {
        this.f175a.set(0, z);
    }

    public void b(boolean z) {
        this.f175a.set(1, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m725a(iq iqVar) {
        if (iqVar == null || this.f173a != iqVar.f173a) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = iqVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f174a.equals(iqVar.f174a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = iqVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f177b.equals(iqVar.f177b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = iqVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f178c.equals(iqVar.f178c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = iqVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f176a == iqVar.f176a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = iqVar.f();
        if (zF || zF2) {
            return zF && zF2 && this.f179d.equals(iqVar.f179d);
        }
        return true;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) {
        a();
        r2tVar.v(f172a);
        r2tVar.s(f14103a);
        r2tVar.p(this.f173a);
        r2tVar.z();
        if (this.f174a != null) {
            r2tVar.s(f14104b);
            r2tVar.q(this.f174a);
            r2tVar.z();
        }
        if (this.f177b != null && c()) {
            r2tVar.s(c);
            r2tVar.q(this.f177b);
            r2tVar.z();
        }
        if (this.f178c != null && d()) {
            r2tVar.s(d);
            r2tVar.q(this.f178c);
            r2tVar.z();
        }
        if (e()) {
            r2tVar.s(e);
            r2tVar.x(this.f176a);
            r2tVar.z();
        }
        if (this.f179d != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f179d);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iq iqVar) {
        int iE;
        int iK;
        int iE2;
        int iE3;
        int iE4;
        int iC;
        if (!getClass().equals(iqVar.getClass())) {
            return getClass().getName().compareTo(iqVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m724a()).compareTo(Boolean.valueOf(iqVar.m724a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m724a() && (iC = c2t.c(this.f173a, iqVar.f173a)) != 0) {
            return iC;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iqVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iE4 = c2t.e(this.f174a, iqVar.f174a)) != 0) {
            return iE4;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iqVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iE3 = c2t.e(this.f177b, iqVar.f177b)) != 0) {
            return iE3;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iqVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE2 = c2t.e(this.f178c, iqVar.f178c)) != 0) {
            return iE2;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iqVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iK = c2t.k(this.f176a, iqVar.f176a)) != 0) {
            return iK;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iqVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (!f() || (iE = c2t.e(this.f179d, iqVar.f179d)) == 0) {
            return 0;
        }
        return iE;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) {
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
                        if (s != 4) {
                            if (s != 5) {
                                if (s != 7) {
                                    m3t.a(r2tVar, b2);
                                } else if (b2 == 11) {
                                    this.f179d = r2tVar.e();
                                } else {
                                    m3t.a(r2tVar, b2);
                                }
                            } else if (b2 == 2) {
                                this.f176a = r2tVar.y();
                                b(true);
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                        } else if (b2 == 11) {
                            this.f178c = r2tVar.e();
                        } else {
                            m3t.a(r2tVar, b2);
                        }
                    } else if (b2 == 11) {
                        this.f177b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                } else if (b2 == 11) {
                    this.f174a = r2tVar.e();
                } else {
                    m3t.a(r2tVar, b2);
                }
            } else if (b2 == 10) {
                this.f173a = r2tVar.d();
                a(true);
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
        r2tVar.D();
        if (m724a()) {
            a();
            return;
        }
        throw new jy("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    public void a() throws jy {
        if (this.f174a != null) {
            return;
        }
        throw new jy("Required field 'userId' was not present! Struct: " + toString());
    }
}
