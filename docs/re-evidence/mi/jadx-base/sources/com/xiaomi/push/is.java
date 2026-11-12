package com.xiaomi.push;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.c2t;
import defpackage.l2t;
import defpackage.m3t;
import defpackage.p2t;
import defpackage.r2t;
import defpackage.v3t;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class is implements jm<is, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f204a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f205a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f207a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f208b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f209c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f210d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f211e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f212f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f213g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f202a = new v3t("XmPushActionAckNotification");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14109a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14110b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 10, 7);
    private static final l2t g = new l2t("", (byte) 11, 8);
    private static final l2t h = new l2t("", HMProSyncDataBaseProfile.DATA_TYPE_PAI, 9);
    private static final l2t i = new l2t("", (byte) 11, 10);
    private static final l2t j = new l2t("", (byte) 11, 11);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f206a = new BitSet(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f203a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m730a() {
        return this.f205a != null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m732b() {
        return this.f204a != null;
    }

    public boolean c() {
        return this.f208b != null;
    }

    public boolean d() {
        return this.f209c != null;
    }

    public boolean e() {
        return this.f210d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof is)) {
            return m731a((is) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f206a.get(0);
    }

    public boolean g() {
        return this.f211e != null;
    }

    public boolean h() {
        return this.f207a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f212f != null;
    }

    public boolean j() {
        return this.f213g != null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00de  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    public String toString() {
        boolean z;
        String str;
        String str2;
        String str3;
        Map<String, String> map;
        String str4;
        String str5;
        String str6;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        if (m730a()) {
            sb.append("debug:");
            String str7 = this.f205a;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
            z = false;
        } else {
            z = true;
        }
        if (!m732b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f208b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            if (d()) {
                sb.append(", ");
                sb.append("appId:");
                str6 = this.f209c;
                if (str6 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str6);
                }
            }
            if (e()) {
                sb.append(", ");
                sb.append("type:");
                str5 = this.f210d;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (f()) {
                sb.append(", ");
                sb.append("errorCode:");
                sb.append(this.f203a);
            }
            if (g()) {
                sb.append(", ");
                sb.append("reason:");
                str4 = this.f211e;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("extra:");
                map = this.f207a;
                if (map == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(map);
                }
            }
            if (i()) {
                sb.append(", ");
                sb.append("packageName:");
                str3 = this.f212f;
                if (str3 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str3);
                }
            }
            if (j()) {
                sb.append(", ");
                sb.append("category:");
                str2 = this.f213g;
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
        iq iqVar = this.f204a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f208b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            str6 = this.f209c;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            str5 = this.f210d;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f203a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("reason:");
            str4 = this.f211e;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            map = this.f207a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            str3 = this.f212f;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            str2 = this.f213g;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public is a(iq iqVar) {
        this.f204a = iqVar;
        return this;
    }

    public is b(String str) {
        this.f209c = str;
        return this;
    }

    public is c(String str) {
        this.f210d = str;
        return this;
    }

    public is d(String str) {
        this.f211e = str;
        return this;
    }

    public is e(String str) {
        this.f212f = str;
        return this;
    }

    public String a() {
        return this.f208b;
    }

    public String b() {
        return this.f210d;
    }

    public is a(String str) {
        this.f208b = str;
        return this;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m729a();
        r2tVar.v(f202a);
        if (this.f205a != null && m730a()) {
            r2tVar.s(f14109a);
            r2tVar.q(this.f205a);
            r2tVar.z();
        }
        if (this.f204a != null && m732b()) {
            r2tVar.s(f14110b);
            this.f204a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f208b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f208b);
            r2tVar.z();
        }
        if (this.f209c != null && d()) {
            r2tVar.s(d);
            r2tVar.q(this.f209c);
            r2tVar.z();
        }
        if (this.f210d != null && e()) {
            r2tVar.s(e);
            r2tVar.q(this.f210d);
            r2tVar.z();
        }
        if (f()) {
            r2tVar.s(f);
            r2tVar.p(this.f203a);
            r2tVar.z();
        }
        if (this.f211e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f211e);
            r2tVar.z();
        }
        if (this.f207a != null && h()) {
            r2tVar.s(h);
            r2tVar.u(new p2t((byte) 11, (byte) 11, this.f207a.size()));
            for (Map.Entry<String, String> entry : this.f207a.entrySet()) {
                r2tVar.q(entry.getKey());
                r2tVar.q(entry.getValue());
            }
            r2tVar.B();
            r2tVar.z();
        }
        if (this.f212f != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f212f);
            r2tVar.z();
        }
        if (this.f213g != null && j()) {
            r2tVar.s(j);
            r2tVar.q(this.f213g);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    public is a(long j2) {
        this.f203a = j2;
        a(true);
        return this;
    }

    public void a(boolean z) {
        this.f206a.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m728a() {
        return this.f207a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m731a(is isVar) {
        if (isVar == null) {
            return false;
        }
        boolean zM730a = m730a();
        boolean zM730a2 = isVar.m730a();
        if ((zM730a || zM730a2) && !(zM730a && zM730a2 && this.f205a.equals(isVar.f205a))) {
            return false;
        }
        boolean zM732b = m732b();
        boolean zM732b2 = isVar.m732b();
        if ((zM732b || zM732b2) && !(zM732b && zM732b2 && this.f204a.m725a(isVar.f204a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = isVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f208b.equals(isVar.f208b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = isVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f209c.equals(isVar.f209c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = isVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f210d.equals(isVar.f210d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = isVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f203a == isVar.f203a)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = isVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f211e.equals(isVar.f211e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = isVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f207a.equals(isVar.f207a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = isVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f212f.equals(isVar.f212f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = isVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.f213g.equals(isVar.f213g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(is isVar) {
        int iE;
        int iE2;
        int iH;
        int iE3;
        int iC;
        int iE4;
        int iE5;
        int iE6;
        int iD;
        int iE7;
        if (!getClass().equals(isVar.getClass())) {
            return getClass().getName().compareTo(isVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m730a()).compareTo(Boolean.valueOf(isVar.m730a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m730a() && (iE7 = c2t.e(this.f205a, isVar.f205a)) != 0) {
            return iE7;
        }
        int iCompareTo2 = Boolean.valueOf(m732b()).compareTo(Boolean.valueOf(isVar.m732b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m732b() && (iD = c2t.d(this.f204a, isVar.f204a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(isVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iE6 = c2t.e(this.f208b, isVar.f208b)) != 0) {
            return iE6;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(isVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE5 = c2t.e(this.f209c, isVar.f209c)) != 0) {
            return iE5;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(isVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iE4 = c2t.e(this.f210d, isVar.f210d)) != 0) {
            return iE4;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(isVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iC = c2t.c(this.f203a, isVar.f203a)) != 0) {
            return iC;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(isVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE3 = c2t.e(this.f211e, isVar.f211e)) != 0) {
            return iE3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(isVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iH = c2t.h(this.f207a, isVar.f207a)) != 0) {
            return iH;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(isVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iE2 = c2t.e(this.f212f, isVar.f212f)) != 0) {
            return iE2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(isVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iE = c2t.e(this.f213g, isVar.f213g)) == 0) {
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
                m729a();
                return;
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f205a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f204a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f208b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f209c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f210d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                default:
                    m3t.a(r2tVar, b2);
                    break;
                case 7:
                    if (b2 == 10) {
                        this.f203a = r2tVar.d();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f211e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 13) {
                        p2t p2tVarI = r2tVar.i();
                        this.f207a = new HashMap(p2tVarI.c * 2);
                        for (int i2 = 0; i2 < p2tVarI.c; i2++) {
                            this.f207a.put(r2tVar.e(), r2tVar.e());
                        }
                        r2tVar.F();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f212f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f213g = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m729a() throws jy {
        if (this.f208b != null) {
            return;
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
