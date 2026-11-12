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
public class je implements jm<je, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public in f338a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f339a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f340a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f342a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f344b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f345c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f346d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f347e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f348f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f349g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f350h;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f337a = new v3t("XmPushActionSendMessage");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14137a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14138b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 11, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 8);
    private static final l2t i = new l2t("", (byte) 2, 9);
    private static final l2t j = new l2t("", HMProSyncDataBaseProfile.DATA_TYPE_PAI, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l2t f14139k = new l2t("", (byte) 11, 11);
    private static final l2t l = new l2t("", (byte) 11, 12);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f341a = new BitSet(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f343a = true;

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m788a() {
        return this.f340a != null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m790b() {
        return this.f339a != null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m791c() {
        return this.f344b != null;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m792d() {
        return this.f345c != null;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public boolean m793e() {
        return this.f346d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof je)) {
            return m789a((je) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public boolean m794f() {
        return this.f347e != null;
    }

    public boolean g() {
        return this.f348f != null;
    }

    public boolean h() {
        return this.f338a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f341a.get(0);
    }

    public boolean j() {
        return this.f342a != null;
    }

    public boolean k() {
        return this.f349g != null;
    }

    public boolean l() {
        return this.f350h != null;
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
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:71:0x0123  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    public String toString() {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        Map<String, String> map;
        in inVar;
        String str5;
        String str6;
        String str7;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        if (m788a()) {
            sb.append("debug:");
            String str8 = this.f340a;
            if (str8 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str8);
            }
            z = false;
        } else {
            z = true;
        }
        if (!m790b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f344b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            sb.append(", ");
            sb.append("appId:");
            str2 = this.f345c;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            if (m793e()) {
                sb.append(", ");
                sb.append("packageName:");
                str7 = this.f346d;
                if (str7 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str7);
                }
            }
            if (m794f()) {
                sb.append(", ");
                sb.append("topic:");
                str6 = this.f347e;
                if (str6 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str6);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("aliasName:");
                str5 = this.f348f;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("message:");
                inVar = this.f338a;
                if (inVar == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(inVar);
                }
            }
            if (i()) {
                sb.append(", ");
                sb.append("needAck:");
                sb.append(this.f343a);
            }
            if (j()) {
                sb.append(", ");
                sb.append("params:");
                map = this.f342a;
                if (map == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(map);
                }
            }
            if (k()) {
                sb.append(", ");
                sb.append("category:");
                str4 = this.f349g;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (l()) {
                sb.append(", ");
                sb.append("userAccount:");
                str3 = this.f350h;
                if (str3 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str3);
                }
            }
            sb.append(")");
            return sb.toString();
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("target:");
        iq iqVar = this.f339a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f344b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        str2 = this.f345c;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        if (m793e()) {
            sb.append(", ");
            sb.append("packageName:");
            str7 = this.f346d;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        if (m794f()) {
            sb.append(", ");
            sb.append("topic:");
            str6 = this.f347e;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            str5 = this.f348f;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("message:");
            inVar = this.f338a;
            if (inVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(inVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f343a);
        }
        if (j()) {
            sb.append(", ");
            sb.append("params:");
            map = this.f342a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("category:");
            str4 = this.f349g;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("userAccount:");
            str3 = this.f350h;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m786a() {
        return this.f344b;
    }

    public String b() {
        return this.f345c;
    }

    public String c() {
        return this.f347e;
    }

    public String d() {
        return this.f348f;
    }

    public String e() {
        return this.f349g;
    }

    public String f() {
        return this.f350h;
    }

    public in a() {
        return this.f338a;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m787a();
        r2tVar.v(f337a);
        if (this.f340a != null && m788a()) {
            r2tVar.s(f14137a);
            r2tVar.q(this.f340a);
            r2tVar.z();
        }
        if (this.f339a != null && m790b()) {
            r2tVar.s(f14138b);
            this.f339a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f344b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f344b);
            r2tVar.z();
        }
        if (this.f345c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f345c);
            r2tVar.z();
        }
        if (this.f346d != null && m793e()) {
            r2tVar.s(e);
            r2tVar.q(this.f346d);
            r2tVar.z();
        }
        if (this.f347e != null && m794f()) {
            r2tVar.s(f);
            r2tVar.q(this.f347e);
            r2tVar.z();
        }
        if (this.f348f != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f348f);
            r2tVar.z();
        }
        if (this.f338a != null && h()) {
            r2tVar.s(h);
            this.f338a.b(r2tVar);
            r2tVar.z();
        }
        if (i()) {
            r2tVar.s(i);
            r2tVar.x(this.f343a);
            r2tVar.z();
        }
        if (this.f342a != null && j()) {
            r2tVar.s(j);
            r2tVar.u(new p2t((byte) 11, (byte) 11, this.f342a.size()));
            for (Map.Entry<String, String> entry : this.f342a.entrySet()) {
                r2tVar.q(entry.getKey());
                r2tVar.q(entry.getValue());
            }
            r2tVar.B();
            r2tVar.z();
        }
        if (this.f349g != null && k()) {
            r2tVar.s(f14139k);
            r2tVar.q(this.f349g);
            r2tVar.z();
        }
        if (this.f350h != null && l()) {
            r2tVar.s(l);
            r2tVar.q(this.f350h);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    public void a(boolean z) {
        this.f341a.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m789a(je jeVar) {
        if (jeVar == null) {
            return false;
        }
        boolean zM788a = m788a();
        boolean zM788a2 = jeVar.m788a();
        if ((zM788a || zM788a2) && !(zM788a && zM788a2 && this.f340a.equals(jeVar.f340a))) {
            return false;
        }
        boolean zM790b = m790b();
        boolean zM790b2 = jeVar.m790b();
        if ((zM790b || zM790b2) && !(zM790b && zM790b2 && this.f339a.m725a(jeVar.f339a))) {
            return false;
        }
        boolean zM791c = m791c();
        boolean zM791c2 = jeVar.m791c();
        if ((zM791c || zM791c2) && !(zM791c && zM791c2 && this.f344b.equals(jeVar.f344b))) {
            return false;
        }
        boolean zM792d = m792d();
        boolean zM792d2 = jeVar.m792d();
        if ((zM792d || zM792d2) && !(zM792d && zM792d2 && this.f345c.equals(jeVar.f345c))) {
            return false;
        }
        boolean zM793e = m793e();
        boolean zM793e2 = jeVar.m793e();
        if ((zM793e || zM793e2) && !(zM793e && zM793e2 && this.f346d.equals(jeVar.f346d))) {
            return false;
        }
        boolean zM794f = m794f();
        boolean zM794f2 = jeVar.m794f();
        if ((zM794f || zM794f2) && !(zM794f && zM794f2 && this.f347e.equals(jeVar.f347e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jeVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f348f.equals(jeVar.f348f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jeVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f338a.m708a(jeVar.f338a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jeVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f343a == jeVar.f343a)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jeVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f342a.equals(jeVar.f342a))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jeVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f349g.equals(jeVar.f349g))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jeVar.l();
        if (zL || zL2) {
            return zL && zL2 && this.f350h.equals(jeVar.f350h);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(je jeVar) {
        int iE;
        int iE2;
        int iH;
        int iK;
        int iD;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iD2;
        int iE8;
        if (!getClass().equals(jeVar.getClass())) {
            return getClass().getName().compareTo(jeVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m788a()).compareTo(Boolean.valueOf(jeVar.m788a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m788a() && (iE8 = c2t.e(this.f340a, jeVar.f340a)) != 0) {
            return iE8;
        }
        int iCompareTo2 = Boolean.valueOf(m790b()).compareTo(Boolean.valueOf(jeVar.m790b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m790b() && (iD2 = c2t.d(this.f339a, jeVar.f339a)) != 0) {
            return iD2;
        }
        int iCompareTo3 = Boolean.valueOf(m791c()).compareTo(Boolean.valueOf(jeVar.m791c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m791c() && (iE7 = c2t.e(this.f344b, jeVar.f344b)) != 0) {
            return iE7;
        }
        int iCompareTo4 = Boolean.valueOf(m792d()).compareTo(Boolean.valueOf(jeVar.m792d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m792d() && (iE6 = c2t.e(this.f345c, jeVar.f345c)) != 0) {
            return iE6;
        }
        int iCompareTo5 = Boolean.valueOf(m793e()).compareTo(Boolean.valueOf(jeVar.m793e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m793e() && (iE5 = c2t.e(this.f346d, jeVar.f346d)) != 0) {
            return iE5;
        }
        int iCompareTo6 = Boolean.valueOf(m794f()).compareTo(Boolean.valueOf(jeVar.m794f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m794f() && (iE4 = c2t.e(this.f347e, jeVar.f347e)) != 0) {
            return iE4;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jeVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE3 = c2t.e(this.f348f, jeVar.f348f)) != 0) {
            return iE3;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jeVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iD = c2t.d(this.f338a, jeVar.f338a)) != 0) {
            return iD;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jeVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iK = c2t.k(this.f343a, jeVar.f343a)) != 0) {
            return iK;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jeVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iH = c2t.h(this.f342a, jeVar.f342a)) != 0) {
            return iH;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jeVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iE2 = c2t.e(this.f349g, jeVar.f349g)) != 0) {
            return iE2;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jeVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!l() || (iE = c2t.e(this.f350h, jeVar.f350h)) == 0) {
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
                m787a();
                return;
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f340a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f339a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f344b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f345c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f346d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f347e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f348f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 12) {
                        in inVar = new in();
                        this.f338a = inVar;
                        inVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 2) {
                        this.f343a = r2tVar.y();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 13) {
                        p2t p2tVarI = r2tVar.i();
                        this.f342a = new HashMap(p2tVarI.c * 2);
                        for (int i2 = 0; i2 < p2tVarI.c; i2++) {
                            this.f342a.put(r2tVar.e(), r2tVar.e());
                        }
                        r2tVar.F();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f349g = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f350h = r2tVar.e();
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

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m787a() throws jy {
        if (this.f344b != null) {
            if (this.f345c != null) {
                return;
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
