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
public class jk implements jm<jk, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f406a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f407a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f408a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f409a = new BitSet(1);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f410b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f411c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f412d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f413e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f414f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f415g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f405a = new v3t("XmPushActionUnSubscriptionResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14151a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14152b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 10, 6);
    private static final l2t f = new l2t("", (byte) 11, 7);
    private static final l2t g = new l2t("", (byte) 11, 8);
    private static final l2t h = new l2t("", (byte) 11, 9);
    private static final l2t i = new l2t("", (byte) 11, 10);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m810a() {
        return this.f408a != null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m812b() {
        return this.f407a != null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m813c() {
        return this.f410b != null;
    }

    public boolean d() {
        return this.f411c != null;
    }

    public boolean e() {
        return this.f409a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jk)) {
            return m811a((jk) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f412d != null;
    }

    public boolean g() {
        return this.f413e != null;
    }

    public boolean h() {
        return this.f414f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f415g != null;
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
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        if (m810a()) {
            sb.append("debug:");
            String str7 = this.f408a;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
            z = false;
        } else {
            z = true;
        }
        if (!m812b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f410b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            if (d()) {
                sb.append(", ");
                sb.append("appId:");
                str6 = this.f411c;
                if (str6 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str6);
                }
            }
            if (e()) {
                sb.append(", ");
                sb.append("errorCode:");
                sb.append(this.f406a);
            }
            if (f()) {
                sb.append(", ");
                sb.append("reason:");
                str5 = this.f412d;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("topic:");
                str4 = this.f413e;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("packageName:");
                str3 = this.f414f;
                if (str3 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str3);
                }
            }
            if (i()) {
                sb.append(", ");
                sb.append("category:");
                str2 = this.f415g;
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
        iq iqVar = this.f407a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f410b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            str6 = this.f411c;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f406a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            str5 = this.f412d;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            str4 = this.f413e;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            str3 = this.f414f;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            str2 = this.f415g;
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
        return this.f410b;
    }

    public String b() {
        return this.f413e;
    }

    public String c() {
        return this.f415g;
    }

    public void a(boolean z) {
        this.f409a.set(0, z);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m809a();
        r2tVar.v(f405a);
        if (this.f408a != null && m810a()) {
            r2tVar.s(f14151a);
            r2tVar.q(this.f408a);
            r2tVar.z();
        }
        if (this.f407a != null && m812b()) {
            r2tVar.s(f14152b);
            this.f407a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f410b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f410b);
            r2tVar.z();
        }
        if (this.f411c != null && d()) {
            r2tVar.s(d);
            r2tVar.q(this.f411c);
            r2tVar.z();
        }
        if (e()) {
            r2tVar.s(e);
            r2tVar.p(this.f406a);
            r2tVar.z();
        }
        if (this.f412d != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f412d);
            r2tVar.z();
        }
        if (this.f413e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f413e);
            r2tVar.z();
        }
        if (this.f414f != null && h()) {
            r2tVar.s(h);
            r2tVar.q(this.f414f);
            r2tVar.z();
        }
        if (this.f415g != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f415g);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m811a(jk jkVar) {
        if (jkVar == null) {
            return false;
        }
        boolean zM810a = m810a();
        boolean zM810a2 = jkVar.m810a();
        if ((zM810a || zM810a2) && !(zM810a && zM810a2 && this.f408a.equals(jkVar.f408a))) {
            return false;
        }
        boolean zM812b = m812b();
        boolean zM812b2 = jkVar.m812b();
        if ((zM812b || zM812b2) && !(zM812b && zM812b2 && this.f407a.m725a(jkVar.f407a))) {
            return false;
        }
        boolean zM813c = m813c();
        boolean zM813c2 = jkVar.m813c();
        if ((zM813c || zM813c2) && !(zM813c && zM813c2 && this.f410b.equals(jkVar.f410b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jkVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f411c.equals(jkVar.f411c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jkVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f406a == jkVar.f406a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jkVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f412d.equals(jkVar.f412d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jkVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f413e.equals(jkVar.f413e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jkVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f414f.equals(jkVar.f414f))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jkVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.f415g.equals(jkVar.f415g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jk jkVar) {
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iC;
        int iE5;
        int iE6;
        int iD;
        int iE7;
        if (!getClass().equals(jkVar.getClass())) {
            return getClass().getName().compareTo(jkVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m810a()).compareTo(Boolean.valueOf(jkVar.m810a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m810a() && (iE7 = c2t.e(this.f408a, jkVar.f408a)) != 0) {
            return iE7;
        }
        int iCompareTo2 = Boolean.valueOf(m812b()).compareTo(Boolean.valueOf(jkVar.m812b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m812b() && (iD = c2t.d(this.f407a, jkVar.f407a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(m813c()).compareTo(Boolean.valueOf(jkVar.m813c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m813c() && (iE6 = c2t.e(this.f410b, jkVar.f410b)) != 0) {
            return iE6;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jkVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE5 = c2t.e(this.f411c, jkVar.f411c)) != 0) {
            return iE5;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jkVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iC = c2t.c(this.f406a, jkVar.f406a)) != 0) {
            return iC;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jkVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE4 = c2t.e(this.f412d, jkVar.f412d)) != 0) {
            return iE4;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jkVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE3 = c2t.e(this.f413e, jkVar.f413e)) != 0) {
            return iE3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jkVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iE2 = c2t.e(this.f414f, jkVar.f414f)) != 0) {
            return iE2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jkVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!i() || (iE = c2t.e(this.f415g, jkVar.f415g)) == 0) {
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
                m809a();
                return;
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f408a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f407a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f410b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f411c = r2tVar.e();
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
                        this.f406a = r2tVar.d();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f412d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f413e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f414f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f415g = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m809a() throws jy {
        if (this.f410b != null) {
            return;
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
