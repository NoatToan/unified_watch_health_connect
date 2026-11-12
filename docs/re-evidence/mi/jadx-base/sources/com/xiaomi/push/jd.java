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
public class jd implements jm<jd, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f329a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f330a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f331a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f332a = new BitSet(1);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f333b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f334c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f335d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f336e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f328a = new v3t("XmPushActionSendFeedbackResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14135a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14136b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 10, 6);
    private static final l2t f = new l2t("", (byte) 11, 7);
    private static final l2t g = new l2t("", (byte) 11, 8);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m784a() {
        return this.f331a != null;
    }

    public boolean b() {
        return this.f330a != null;
    }

    public boolean c() {
        return this.f333b != null;
    }

    public boolean d() {
        return this.f334c != null;
    }

    public boolean e() {
        return this.f332a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jd)) {
            return m785a((jd) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f335d != null;
    }

    public boolean g() {
        return this.f336e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    public String toString() {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        if (m784a()) {
            sb.append("debug:");
            String str5 = this.f331a;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
            z = false;
        } else {
            z = true;
        }
        if (!b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f333b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            sb.append(", ");
            sb.append("appId:");
            str2 = this.f334c;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f329a);
            if (f()) {
                sb.append(", ");
                sb.append("reason:");
                str4 = this.f335d;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("category:");
                str3 = this.f336e;
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
        iq iqVar = this.f330a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f333b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        str2 = this.f334c;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f329a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            str4 = this.f335d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            str3 = this.f336e;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void a(boolean z) {
        this.f332a.set(0, z);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        a();
        r2tVar.v(f328a);
        if (this.f331a != null && m784a()) {
            r2tVar.s(f14135a);
            r2tVar.q(this.f331a);
            r2tVar.z();
        }
        if (this.f330a != null && b()) {
            r2tVar.s(f14136b);
            this.f330a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f333b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f333b);
            r2tVar.z();
        }
        if (this.f334c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f334c);
            r2tVar.z();
        }
        r2tVar.s(e);
        r2tVar.p(this.f329a);
        r2tVar.z();
        if (this.f335d != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f335d);
            r2tVar.z();
        }
        if (this.f336e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f336e);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m785a(jd jdVar) {
        if (jdVar == null) {
            return false;
        }
        boolean zM784a = m784a();
        boolean zM784a2 = jdVar.m784a();
        if ((zM784a || zM784a2) && !(zM784a && zM784a2 && this.f331a.equals(jdVar.f331a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jdVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f330a.m725a(jdVar.f330a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jdVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f333b.equals(jdVar.f333b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jdVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f334c.equals(jdVar.f334c))) || this.f329a != jdVar.f329a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jdVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f335d.equals(jdVar.f335d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jdVar.g();
        if (zG || zG2) {
            return zG && zG2 && this.f336e.equals(jdVar.f336e);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jd jdVar) {
        int iE;
        int iE2;
        int iC;
        int iE3;
        int iE4;
        int iD;
        int iE5;
        if (!getClass().equals(jdVar.getClass())) {
            return getClass().getName().compareTo(jdVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m784a()).compareTo(Boolean.valueOf(jdVar.m784a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m784a() && (iE5 = c2t.e(this.f331a, jdVar.f331a)) != 0) {
            return iE5;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jdVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iD = c2t.d(this.f330a, jdVar.f330a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jdVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iE4 = c2t.e(this.f333b, jdVar.f333b)) != 0) {
            return iE4;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jdVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE3 = c2t.e(this.f334c, jdVar.f334c)) != 0) {
            return iE3;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jdVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iC = c2t.c(this.f329a, jdVar.f329a)) != 0) {
            return iC;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jdVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE2 = c2t.e(this.f335d, jdVar.f335d)) != 0) {
            return iE2;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jdVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!g() || (iE = c2t.e(this.f336e, jdVar.f336e)) == 0) {
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
                if (e()) {
                    a();
                    return;
                }
                throw new jy("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f331a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f330a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f333b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f334c = r2tVar.e();
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
                        this.f329a = r2tVar.d();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f335d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f336e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    public void a() throws jy {
        if (this.f333b != null) {
            if (this.f334c != null) {
                return;
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
