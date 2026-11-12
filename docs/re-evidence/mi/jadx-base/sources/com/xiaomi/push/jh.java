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
public class jh implements jm<jh, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f372a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f373a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f374a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f375a = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f376a = true;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f377b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f378c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f379d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f380e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f381f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f382g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f383h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f384i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f371a = new v3t("XmPushActionUnRegistration");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14144a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14145b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 11, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", (byte) 11, 8);
    private static final l2t i = new l2t("", (byte) 11, 9);
    private static final l2t j = new l2t("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l2t f14146k = new l2t("", (byte) 2, 11);
    private static final l2t l = new l2t("", (byte) 10, 12);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m802a() {
        return this.f374a != null;
    }

    public boolean b() {
        return this.f373a != null;
    }

    public boolean c() {
        return this.f377b != null;
    }

    public boolean d() {
        return this.f378c != null;
    }

    public boolean e() {
        return this.f379d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jh)) {
            return m803a((jh) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f380e != null;
    }

    public boolean g() {
        return this.f381f != null;
    }

    public boolean h() {
        return this.f382g != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f383h != null;
    }

    public boolean j() {
        return this.f384i != null;
    }

    public boolean k() {
        return this.f375a.get(0);
    }

    public boolean l() {
        return this.f375a.get(1);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    public String toString() {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        if (m802a()) {
            sb.append("debug:");
            String str9 = this.f374a;
            if (str9 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str9);
            }
            z = false;
        } else {
            z = true;
        }
        if (!b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f377b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            sb.append(", ");
            sb.append("appId:");
            str2 = this.f378c;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            if (e()) {
                sb.append(", ");
                sb.append("regId:");
                str8 = this.f379d;
                if (str8 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str8);
                }
            }
            if (f()) {
                sb.append(", ");
                sb.append("appVersion:");
                str7 = this.f380e;
                if (str7 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str7);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("packageName:");
                str6 = this.f381f;
                if (str6 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str6);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("token:");
                str5 = this.f382g;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (i()) {
                sb.append(", ");
                sb.append("deviceId:");
                str4 = this.f383h;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (j()) {
                sb.append(", ");
                sb.append("aliasName:");
                str3 = this.f384i;
                if (str3 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str3);
                }
            }
            if (k()) {
                sb.append(", ");
                sb.append("needAck:");
                sb.append(this.f376a);
            }
            if (l()) {
                sb.append(", ");
                sb.append("createdTs:");
                sb.append(this.f372a);
            }
            sb.append(")");
            return sb.toString();
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("target:");
        iq iqVar = this.f373a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f377b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        str2 = this.f378c;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        if (e()) {
            sb.append(", ");
            sb.append("regId:");
            str8 = this.f379d;
            if (str8 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str8);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("appVersion:");
            str7 = this.f380e;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            str6 = this.f381f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("token:");
            str5 = this.f382g;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("deviceId:");
            str4 = this.f383h;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("aliasName:");
            str3 = this.f384i;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f376a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f372a);
        }
        sb.append(")");
        return sb.toString();
    }

    public jh a(String str) {
        this.f377b = str;
        return this;
    }

    public jh b(String str) {
        this.f378c = str;
        return this;
    }

    public jh c(String str) {
        this.f379d = str;
        return this;
    }

    public jh d(String str) {
        this.f381f = str;
        return this;
    }

    public jh e(String str) {
        this.f382g = str;
        return this;
    }

    public void a(boolean z) {
        this.f375a.set(0, z);
    }

    public void b(boolean z) {
        this.f375a.set(1, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m803a(jh jhVar) {
        if (jhVar == null) {
            return false;
        }
        boolean zM802a = m802a();
        boolean zM802a2 = jhVar.m802a();
        if ((zM802a || zM802a2) && !(zM802a && zM802a2 && this.f374a.equals(jhVar.f374a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jhVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f373a.m725a(jhVar.f373a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jhVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f377b.equals(jhVar.f377b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jhVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f378c.equals(jhVar.f378c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jhVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f379d.equals(jhVar.f379d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jhVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f380e.equals(jhVar.f380e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jhVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f381f.equals(jhVar.f381f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jhVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f382g.equals(jhVar.f382g))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jhVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f383h.equals(jhVar.f383h))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jhVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f384i.equals(jhVar.f384i))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jhVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f376a == jhVar.f376a)) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jhVar.l();
        if (zL || zL2) {
            return zL && zL2 && this.f372a == jhVar.f372a;
        }
        return true;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        a();
        r2tVar.v(f371a);
        if (this.f374a != null && m802a()) {
            r2tVar.s(f14144a);
            r2tVar.q(this.f374a);
            r2tVar.z();
        }
        if (this.f373a != null && b()) {
            r2tVar.s(f14145b);
            this.f373a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f377b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f377b);
            r2tVar.z();
        }
        if (this.f378c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f378c);
            r2tVar.z();
        }
        if (this.f379d != null && e()) {
            r2tVar.s(e);
            r2tVar.q(this.f379d);
            r2tVar.z();
        }
        if (this.f380e != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f380e);
            r2tVar.z();
        }
        if (this.f381f != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f381f);
            r2tVar.z();
        }
        if (this.f382g != null && h()) {
            r2tVar.s(h);
            r2tVar.q(this.f382g);
            r2tVar.z();
        }
        if (this.f383h != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f383h);
            r2tVar.z();
        }
        if (this.f384i != null && j()) {
            r2tVar.s(j);
            r2tVar.q(this.f384i);
            r2tVar.z();
        }
        if (k()) {
            r2tVar.s(f14146k);
            r2tVar.x(this.f376a);
            r2tVar.z();
        }
        if (l()) {
            r2tVar.s(l);
            r2tVar.p(this.f372a);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jh jhVar) {
        int iC;
        int iK;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iD;
        int iE9;
        if (!getClass().equals(jhVar.getClass())) {
            return getClass().getName().compareTo(jhVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m802a()).compareTo(Boolean.valueOf(jhVar.m802a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m802a() && (iE9 = c2t.e(this.f374a, jhVar.f374a)) != 0) {
            return iE9;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jhVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iD = c2t.d(this.f373a, jhVar.f373a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jhVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iE8 = c2t.e(this.f377b, jhVar.f377b)) != 0) {
            return iE8;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jhVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE7 = c2t.e(this.f378c, jhVar.f378c)) != 0) {
            return iE7;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jhVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iE6 = c2t.e(this.f379d, jhVar.f379d)) != 0) {
            return iE6;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jhVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE5 = c2t.e(this.f380e, jhVar.f380e)) != 0) {
            return iE5;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jhVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE4 = c2t.e(this.f381f, jhVar.f381f)) != 0) {
            return iE4;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jhVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iE3 = c2t.e(this.f382g, jhVar.f382g)) != 0) {
            return iE3;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jhVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iE2 = c2t.e(this.f383h, jhVar.f383h)) != 0) {
            return iE2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jhVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iE = c2t.e(this.f384i, jhVar.f384i)) != 0) {
            return iE;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jhVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iK = c2t.k(this.f376a, jhVar.f376a)) != 0) {
            return iK;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jhVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!l() || (iC = c2t.c(this.f372a, jhVar.f372a)) == 0) {
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
                a();
                return;
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f374a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f373a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f377b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f378c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f379d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f380e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f381f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f382g = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f383h = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f384i = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 2) {
                        this.f376a = r2tVar.y();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 10) {
                        this.f372a = r2tVar.d();
                        b(true);
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
        if (this.f377b != null) {
            if (this.f378c != null) {
                return;
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
