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
public class ji implements jm<ji, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f386a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f387a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f388a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f389a = new BitSet(3);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f390b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f391b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public long f392c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f393c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f394d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f395e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f385a = new v3t("XmPushActionUnRegistrationResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14147a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14148b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 10, 6);
    private static final l2t f = new l2t("", (byte) 11, 7);
    private static final l2t g = new l2t("", (byte) 11, 8);
    private static final l2t h = new l2t("", (byte) 10, 9);
    private static final l2t i = new l2t("", (byte) 10, 10);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m805a() {
        return this.f388a != null;
    }

    public boolean b() {
        return this.f387a != null;
    }

    public boolean c() {
        return this.f391b != null;
    }

    public boolean d() {
        return this.f393c != null;
    }

    public boolean e() {
        return this.f389a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ji)) {
            return m806a((ji) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f394d != null;
    }

    public boolean g() {
        return this.f395e != null;
    }

    public boolean h() {
        return this.f389a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f389a.get(2);
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
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    public String toString() {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        if (m805a()) {
            sb.append("debug:");
            String str5 = this.f388a;
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
            str = this.f391b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            sb.append(", ");
            sb.append("appId:");
            str2 = this.f393c;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f386a);
            if (f()) {
                sb.append(", ");
                sb.append("reason:");
                str4 = this.f394d;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("packageName:");
                str3 = this.f395e;
                if (str3 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str3);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("unRegisteredAt:");
                sb.append(this.f390b);
            }
            if (i()) {
                sb.append(", ");
                sb.append("costTime:");
                sb.append(this.f392c);
            }
            sb.append(")");
            return sb.toString();
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("target:");
        iq iqVar = this.f387a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f391b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        str2 = this.f393c;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f386a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            str4 = this.f394d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            str3 = this.f395e;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f390b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f392c);
        }
        sb.append(")");
        return sb.toString();
    }

    public void a(boolean z) {
        this.f389a.set(0, z);
    }

    public void b(boolean z) {
        this.f389a.set(1, z);
    }

    public void c(boolean z) {
        this.f389a.set(2, z);
    }

    public String a() {
        return this.f395e;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m804a();
        r2tVar.v(f385a);
        if (this.f388a != null && m805a()) {
            r2tVar.s(f14147a);
            r2tVar.q(this.f388a);
            r2tVar.z();
        }
        if (this.f387a != null && b()) {
            r2tVar.s(f14148b);
            this.f387a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f391b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f391b);
            r2tVar.z();
        }
        if (this.f393c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f393c);
            r2tVar.z();
        }
        r2tVar.s(e);
        r2tVar.p(this.f386a);
        r2tVar.z();
        if (this.f394d != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f394d);
            r2tVar.z();
        }
        if (this.f395e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f395e);
            r2tVar.z();
        }
        if (h()) {
            r2tVar.s(h);
            r2tVar.p(this.f390b);
            r2tVar.z();
        }
        if (i()) {
            r2tVar.s(i);
            r2tVar.p(this.f392c);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m806a(ji jiVar) {
        if (jiVar == null) {
            return false;
        }
        boolean zM805a = m805a();
        boolean zM805a2 = jiVar.m805a();
        if ((zM805a || zM805a2) && !(zM805a && zM805a2 && this.f388a.equals(jiVar.f388a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = jiVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f387a.m725a(jiVar.f387a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = jiVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f391b.equals(jiVar.f391b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jiVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f393c.equals(jiVar.f393c))) || this.f386a != jiVar.f386a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jiVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f394d.equals(jiVar.f394d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jiVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f395e.equals(jiVar.f395e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jiVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f390b == jiVar.f390b)) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jiVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.f392c == jiVar.f392c;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ji jiVar) {
        int iC;
        int iC2;
        int iE;
        int iE2;
        int iC3;
        int iE3;
        int iE4;
        int iD;
        int iE5;
        if (!getClass().equals(jiVar.getClass())) {
            return getClass().getName().compareTo(jiVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m805a()).compareTo(Boolean.valueOf(jiVar.m805a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m805a() && (iE5 = c2t.e(this.f388a, jiVar.f388a)) != 0) {
            return iE5;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jiVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iD = c2t.d(this.f387a, jiVar.f387a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jiVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iE4 = c2t.e(this.f391b, jiVar.f391b)) != 0) {
            return iE4;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jiVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE3 = c2t.e(this.f393c, jiVar.f393c)) != 0) {
            return iE3;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jiVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iC3 = c2t.c(this.f386a, jiVar.f386a)) != 0) {
            return iC3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jiVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE2 = c2t.e(this.f394d, jiVar.f394d)) != 0) {
            return iE2;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jiVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE = c2t.e(this.f395e, jiVar.f395e)) != 0) {
            return iE;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jiVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iC2 = c2t.c(this.f390b, jiVar.f390b)) != 0) {
            return iC2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jiVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!i() || (iC = c2t.c(this.f392c, jiVar.f392c)) == 0) {
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
                if (e()) {
                    m804a();
                    return;
                }
                throw new jy("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f388a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f387a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f391b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f393c = r2tVar.e();
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
                        this.f386a = r2tVar.d();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f394d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f395e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 10) {
                        this.f390b = r2tVar.d();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 10) {
                        this.f392c = r2tVar.d();
                        c(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m804a() throws jy {
        if (this.f391b != null) {
            if (this.f393c != null) {
                return;
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
