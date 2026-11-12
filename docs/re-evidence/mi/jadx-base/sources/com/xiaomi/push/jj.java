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
public class jj implements jm<jj, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f397a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f398a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f399a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f400b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f401c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f402d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f403e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f404f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f396a = new v3t("XmPushActionUnSubscription");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14149a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14150b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 11, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", (byte) 15, 8);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m807a() {
        return this.f398a != null;
    }

    public boolean b() {
        return this.f397a != null;
    }

    public boolean c() {
        return this.f400b != null;
    }

    public boolean d() {
        return this.f401c != null;
    }

    public boolean e() {
        return this.f402d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jj)) {
            return m808a((jj) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f403e != null;
    }

    public boolean g() {
        return this.f404f != null;
    }

    public boolean h() {
        return this.f399a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    public String toString() {
        boolean z;
        String str;
        String str2;
        String str3;
        List<String> list;
        String str4;
        String str5;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        if (m807a()) {
            sb.append("debug:");
            String str6 = this.f398a;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
            z = false;
        } else {
            z = true;
        }
        if (!b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f400b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            sb.append(", ");
            sb.append("appId:");
            str2 = this.f401c;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            sb.append(", ");
            sb.append("topic:");
            str3 = this.f402d;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
            if (f()) {
                sb.append(", ");
                sb.append("packageName:");
                str5 = this.f403e;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("category:");
                str4 = this.f404f;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("aliases:");
                list = this.f399a;
                if (list == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(list);
                }
            }
            sb.append(")");
            return sb.toString();
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("target:");
        iq iqVar = this.f397a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f400b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        str2 = this.f401c;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("topic:");
        str3 = this.f402d;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            str5 = this.f403e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            str4 = this.f404f;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            list = this.f399a;
            if (list == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public jj a(String str) {
        this.f400b = str;
        return this;
    }

    public jj b(String str) {
        this.f401c = str;
        return this;
    }

    public jj c(String str) {
        this.f402d = str;
        return this;
    }

    public jj d(String str) {
        this.f403e = str;
        return this;
    }

    public jj e(String str) {
        this.f404f = str;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m808a(jj jjVar) {
        if (jjVar == null) {
            return false;
        }
        boolean zM807a = m807a();
        boolean zM807a2 = jjVar.m807a();
        if ((zM807a || zM807a2) && !(zM807a && zM807a2 && this.f398a.equals(jjVar.f398a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jjVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f397a.m725a(jjVar.f397a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jjVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f400b.equals(jjVar.f400b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jjVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f401c.equals(jjVar.f401c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jjVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f402d.equals(jjVar.f402d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jjVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f403e.equals(jjVar.f403e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jjVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f404f.equals(jjVar.f404f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jjVar.h();
        if (zH || zH2) {
            return zH && zH2 && this.f399a.equals(jjVar.f399a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        a();
        r2tVar.v(f396a);
        if (this.f398a != null && m807a()) {
            r2tVar.s(f14149a);
            r2tVar.q(this.f398a);
            r2tVar.z();
        }
        if (this.f397a != null && b()) {
            r2tVar.s(f14150b);
            this.f397a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f400b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f400b);
            r2tVar.z();
        }
        if (this.f401c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f401c);
            r2tVar.z();
        }
        if (this.f402d != null) {
            r2tVar.s(e);
            r2tVar.q(this.f402d);
            r2tVar.z();
        }
        if (this.f403e != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f403e);
            r2tVar.z();
        }
        if (this.f404f != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f404f);
            r2tVar.z();
        }
        if (this.f399a != null && h()) {
            r2tVar.s(h);
            r2tVar.t(new n2t((byte) 11, this.f399a.size()));
            Iterator<String> it = this.f399a.iterator();
            while (it.hasNext()) {
                r2tVar.q(it.next());
            }
            r2tVar.C();
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jj jjVar) {
        int iG;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iD;
        int iE6;
        if (!getClass().equals(jjVar.getClass())) {
            return getClass().getName().compareTo(jjVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m807a()).compareTo(Boolean.valueOf(jjVar.m807a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m807a() && (iE6 = c2t.e(this.f398a, jjVar.f398a)) != 0) {
            return iE6;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jjVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iD = c2t.d(this.f397a, jjVar.f397a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jjVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iE5 = c2t.e(this.f400b, jjVar.f400b)) != 0) {
            return iE5;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jjVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE4 = c2t.e(this.f401c, jjVar.f401c)) != 0) {
            return iE4;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jjVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iE3 = c2t.e(this.f402d, jjVar.f402d)) != 0) {
            return iE3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jjVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE2 = c2t.e(this.f403e, jjVar.f403e)) != 0) {
            return iE2;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jjVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE = c2t.e(this.f404f, jjVar.f404f)) != 0) {
            return iE;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jjVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!h() || (iG = c2t.g(this.f399a, jjVar.f399a)) == 0) {
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
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f398a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f397a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f400b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f401c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f402d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f403e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f404f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 15) {
                        n2t n2tVarH = r2tVar.h();
                        this.f399a = new ArrayList(n2tVarH.f27496b);
                        for (int i = 0; i < n2tVarH.f27496b; i++) {
                            this.f399a.add(r2tVar.e());
                        }
                        r2tVar.G();
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
        if (this.f400b != null) {
            if (this.f401c != null) {
                if (this.f402d != null) {
                    return;
                }
                throw new jy("Required field 'topic' was not present! Struct: " + toString());
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
