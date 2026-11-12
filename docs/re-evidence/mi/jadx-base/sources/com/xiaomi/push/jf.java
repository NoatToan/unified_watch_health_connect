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
public class jf implements jm<jf, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f352a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f353a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f354a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f355b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f356c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f357d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f358e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f359f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f351a = new v3t("XmPushActionSubscription");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14140a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14141b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 11, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", (byte) 15, 8);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m795a() {
        return this.f353a != null;
    }

    public boolean b() {
        return this.f352a != null;
    }

    public boolean c() {
        return this.f355b != null;
    }

    public boolean d() {
        return this.f356c != null;
    }

    public boolean e() {
        return this.f357d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jf)) {
            return m796a((jf) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f358e != null;
    }

    public boolean g() {
        return this.f359f != null;
    }

    public boolean h() {
        return this.f354a != null;
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
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        if (m795a()) {
            sb.append("debug:");
            String str6 = this.f353a;
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
            str = this.f355b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            sb.append(", ");
            sb.append("appId:");
            str2 = this.f356c;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            sb.append(", ");
            sb.append("topic:");
            str3 = this.f357d;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
            if (f()) {
                sb.append(", ");
                sb.append("packageName:");
                str5 = this.f358e;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("category:");
                str4 = this.f359f;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("aliases:");
                list = this.f354a;
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
        iq iqVar = this.f352a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f355b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        str2 = this.f356c;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("topic:");
        str3 = this.f357d;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            str5 = this.f358e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            str4 = this.f359f;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            list = this.f354a;
            if (list == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public jf a(String str) {
        this.f355b = str;
        return this;
    }

    public jf b(String str) {
        this.f356c = str;
        return this;
    }

    public jf c(String str) {
        this.f357d = str;
        return this;
    }

    public jf d(String str) {
        this.f358e = str;
        return this;
    }

    public jf e(String str) {
        this.f359f = str;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m796a(jf jfVar) {
        if (jfVar == null) {
            return false;
        }
        boolean zM795a = m795a();
        boolean zM795a2 = jfVar.m795a();
        if ((zM795a || zM795a2) && !(zM795a && zM795a2 && this.f353a.equals(jfVar.f353a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jfVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f352a.m725a(jfVar.f352a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jfVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f355b.equals(jfVar.f355b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jfVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f356c.equals(jfVar.f356c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jfVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f357d.equals(jfVar.f357d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jfVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f358e.equals(jfVar.f358e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jfVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f359f.equals(jfVar.f359f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jfVar.h();
        if (zH || zH2) {
            return zH && zH2 && this.f354a.equals(jfVar.f354a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        a();
        r2tVar.v(f351a);
        if (this.f353a != null && m795a()) {
            r2tVar.s(f14140a);
            r2tVar.q(this.f353a);
            r2tVar.z();
        }
        if (this.f352a != null && b()) {
            r2tVar.s(f14141b);
            this.f352a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f355b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f355b);
            r2tVar.z();
        }
        if (this.f356c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f356c);
            r2tVar.z();
        }
        if (this.f357d != null) {
            r2tVar.s(e);
            r2tVar.q(this.f357d);
            r2tVar.z();
        }
        if (this.f358e != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f358e);
            r2tVar.z();
        }
        if (this.f359f != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f359f);
            r2tVar.z();
        }
        if (this.f354a != null && h()) {
            r2tVar.s(h);
            r2tVar.t(new n2t((byte) 11, this.f354a.size()));
            Iterator<String> it = this.f354a.iterator();
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
    public int compareTo(jf jfVar) {
        int iG;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iD;
        int iE6;
        if (!getClass().equals(jfVar.getClass())) {
            return getClass().getName().compareTo(jfVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m795a()).compareTo(Boolean.valueOf(jfVar.m795a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m795a() && (iE6 = c2t.e(this.f353a, jfVar.f353a)) != 0) {
            return iE6;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jfVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iD = c2t.d(this.f352a, jfVar.f352a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jfVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iE5 = c2t.e(this.f355b, jfVar.f355b)) != 0) {
            return iE5;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jfVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE4 = c2t.e(this.f356c, jfVar.f356c)) != 0) {
            return iE4;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jfVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iE3 = c2t.e(this.f357d, jfVar.f357d)) != 0) {
            return iE3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jfVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE2 = c2t.e(this.f358e, jfVar.f358e)) != 0) {
            return iE2;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jfVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE = c2t.e(this.f359f, jfVar.f359f)) != 0) {
            return iE;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jfVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!h() || (iG = c2t.g(this.f354a, jfVar.f354a)) == 0) {
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
                        this.f353a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f352a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f355b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f356c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f357d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f358e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f359f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 15) {
                        n2t n2tVarH = r2tVar.h();
                        this.f354a = new ArrayList(n2tVarH.f27496b);
                        for (int i = 0; i < n2tVarH.f27496b; i++) {
                            this.f354a.add(r2tVar.e());
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
        if (this.f355b != null) {
            if (this.f356c != null) {
                if (this.f357d != null) {
                    return;
                }
                throw new jy("Required field 'topic' was not present! Struct: " + toString());
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
