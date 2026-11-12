package com.xiaomi.push;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import defpackage.c2t;
import defpackage.l2t;
import defpackage.m3t;
import defpackage.r2t;
import defpackage.v3t;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class jg implements jm<jg, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f361a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f362a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f363a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f364a = new BitSet(1);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f365b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f366c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f367d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f368e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f369f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f370g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f360a = new v3t("XmPushActionSubscriptionResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14142a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14143b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 10, 6);
    private static final l2t f = new l2t("", (byte) 11, 7);
    private static final l2t g = new l2t("", (byte) 11, 8);
    private static final l2t h = new l2t("", (byte) 11, 9);
    private static final l2t i = new l2t("", (byte) 11, 10);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m798a() {
        return this.f363a != null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m800b() {
        return this.f362a != null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m801c() {
        return this.f365b != null;
    }

    public boolean d() {
        return this.f366c != null;
    }

    public boolean e() {
        return this.f364a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jg)) {
            return m799a((jg) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f367d != null;
    }

    public boolean g() {
        return this.f368e != null;
    }

    public boolean h() {
        return this.f369f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f370g != null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00de  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    public String toString() {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        if (m798a()) {
            sb.append("debug:");
            String str7 = this.f363a;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
            z = false;
        } else {
            z = true;
        }
        if (!m800b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f365b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            if (d()) {
                sb.append(", ");
                sb.append("appId:");
                str6 = this.f366c;
                if (str6 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str6);
                }
            }
            if (e()) {
                sb.append(", ");
                sb.append("errorCode:");
                sb.append(this.f361a);
            }
            if (f()) {
                sb.append(", ");
                sb.append("reason:");
                str5 = this.f367d;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("topic:");
                str4 = this.f368e;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("packageName:");
                str3 = this.f369f;
                if (str3 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str3);
                }
            }
            if (i()) {
                sb.append(", ");
                sb.append("category:");
                str2 = this.f370g;
                if (str2 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str2);
                }
            }
            sb.append(")");
            return sb.toString();
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("target:");
        iq iqVar = this.f362a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f365b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            str6 = this.f366c;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f361a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            str5 = this.f367d;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            str4 = this.f368e;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            str3 = this.f369f;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            str2 = this.f370g;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public String a() {
        return this.f365b;
    }

    public String b() {
        return this.f368e;
    }

    public String c() {
        return this.f370g;
    }

    public void a(boolean z) {
        this.f364a.set(0, z);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m797a();
        r2tVar.v(f360a);
        if (this.f363a != null && m798a()) {
            r2tVar.s(f14142a);
            r2tVar.q(this.f363a);
            r2tVar.z();
        }
        if (this.f362a != null && m800b()) {
            r2tVar.s(f14143b);
            this.f362a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f365b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f365b);
            r2tVar.z();
        }
        if (this.f366c != null && d()) {
            r2tVar.s(d);
            r2tVar.q(this.f366c);
            r2tVar.z();
        }
        if (e()) {
            r2tVar.s(e);
            r2tVar.p(this.f361a);
            r2tVar.z();
        }
        if (this.f367d != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f367d);
            r2tVar.z();
        }
        if (this.f368e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f368e);
            r2tVar.z();
        }
        if (this.f369f != null && h()) {
            r2tVar.s(h);
            r2tVar.q(this.f369f);
            r2tVar.z();
        }
        if (this.f370g != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f370g);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m799a(jg jgVar) {
        if (jgVar == null) {
            return false;
        }
        boolean zM798a = m798a();
        boolean zM798a2 = jgVar.m798a();
        if ((zM798a || zM798a2) && !(zM798a && zM798a2 && this.f363a.equals(jgVar.f363a))) {
            return false;
        }
        boolean zM800b = m800b();
        boolean zM800b2 = jgVar.m800b();
        if ((zM800b || zM800b2) && !(zM800b && zM800b2 && this.f362a.m725a(jgVar.f362a))) {
            return false;
        }
        boolean zM801c = m801c();
        boolean zM801c2 = jgVar.m801c();
        if ((zM801c || zM801c2) && !(zM801c && zM801c2 && this.f365b.equals(jgVar.f365b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jgVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f366c.equals(jgVar.f366c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jgVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f361a == jgVar.f361a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jgVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f367d.equals(jgVar.f367d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jgVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f368e.equals(jgVar.f368e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jgVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f369f.equals(jgVar.f369f))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jgVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.f370g.equals(jgVar.f370g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jg jgVar) {
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iC;
        int iE5;
        int iE6;
        int iD;
        int iE7;
        if (!getClass().equals(jgVar.getClass())) {
            return getClass().getName().compareTo(jgVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m798a()).compareTo(Boolean.valueOf(jgVar.m798a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m798a() && (iE7 = c2t.e(this.f363a, jgVar.f363a)) != 0) {
            return iE7;
        }
        int iCompareTo2 = Boolean.valueOf(m800b()).compareTo(Boolean.valueOf(jgVar.m800b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m800b() && (iD = c2t.d(this.f362a, jgVar.f362a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(m801c()).compareTo(Boolean.valueOf(jgVar.m801c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m801c() && (iE6 = c2t.e(this.f365b, jgVar.f365b)) != 0) {
            return iE6;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jgVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE5 = c2t.e(this.f366c, jgVar.f366c)) != 0) {
            return iE5;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jgVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iC = c2t.c(this.f361a, jgVar.f361a)) != 0) {
            return iC;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jgVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE4 = c2t.e(this.f367d, jgVar.f367d)) != 0) {
            return iE4;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jgVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE3 = c2t.e(this.f368e, jgVar.f368e)) != 0) {
            return iE3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jgVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iE2 = c2t.e(this.f369f, jgVar.f369f)) != 0) {
            return iE2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jgVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!i() || (iE = c2t.e(this.f370g, jgVar.f370g)) == 0) {
            return 0;
        }
        return iE;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) throws jy {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                r2tVar.D();
                m797a();
                return;
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f363a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f362a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f365b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f366c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                default:
                    m3t.a(r2tVar, b2);
                    break;
                case 6:
                    if (b2 == 10) {
                        this.f361a = r2tVar.d();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f367d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f368e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f369f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f370g = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m797a() throws jy {
        if (this.f365b != null) {
            return;
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
