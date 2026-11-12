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
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class iw implements jm<iw, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f233a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f234a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f235a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f237a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f239b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f240c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f241d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f242e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f243f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f232a = new v3t("XmPushActionCommandResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14116a = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14117b = new l2t("", (byte) 11, 3);
    private static final l2t c = new l2t("", (byte) 11, 4);
    private static final l2t d = new l2t("", (byte) 11, 5);
    private static final l2t e = new l2t("", (byte) 10, 7);
    private static final l2t f = new l2t("", (byte) 11, 8);
    private static final l2t g = new l2t("", (byte) 11, 9);
    private static final l2t h = new l2t("", (byte) 15, 10);
    private static final l2t i = new l2t("", (byte) 11, 12);
    private static final l2t j = new l2t("", (byte) 2, 13);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f236a = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f238a = true;

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m743a() {
        return this.f234a != null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m745b() {
        return this.f235a != null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m746c() {
        return this.f239b != null;
    }

    public boolean d() {
        return this.f240c != null;
    }

    public boolean e() {
        return this.f236a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iw)) {
            return m744a((iw) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f241d != null;
    }

    public boolean g() {
        return this.f242e != null;
    }

    public boolean h() {
        return this.f237a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f243f != null;
    }

    public boolean j() {
        return this.f236a.get(1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m743a()) {
            sb.append("target:");
            iq iqVar = this.f234a;
            if (iqVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(iqVar);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f235a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f239b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f240c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f233a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f241d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f242e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f237a;
            if (list == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(list);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f243f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f238a);
        }
        sb.append(")");
        return sb.toString();
    }

    public String a() {
        return this.f235a;
    }

    public String b() {
        return this.f240c;
    }

    public String c() {
        return this.f243f;
    }

    public void a(boolean z) {
        this.f236a.set(0, z);
    }

    public void b(boolean z) {
        this.f236a.set(1, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public List<String> m741a() {
        return this.f237a;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m742a();
        r2tVar.v(f232a);
        if (this.f234a != null && m743a()) {
            r2tVar.s(f14116a);
            this.f234a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f235a != null) {
            r2tVar.s(f14117b);
            r2tVar.q(this.f235a);
            r2tVar.z();
        }
        if (this.f239b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f239b);
            r2tVar.z();
        }
        if (this.f240c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f240c);
            r2tVar.z();
        }
        r2tVar.s(e);
        r2tVar.p(this.f233a);
        r2tVar.z();
        if (this.f241d != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f241d);
            r2tVar.z();
        }
        if (this.f242e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f242e);
            r2tVar.z();
        }
        if (this.f237a != null && h()) {
            r2tVar.s(h);
            r2tVar.t(new n2t((byte) 11, this.f237a.size()));
            Iterator<String> it = this.f237a.iterator();
            while (it.hasNext()) {
                r2tVar.q(it.next());
            }
            r2tVar.C();
            r2tVar.z();
        }
        if (this.f243f != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f243f);
            r2tVar.z();
        }
        if (j()) {
            r2tVar.s(j);
            r2tVar.x(this.f238a);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m744a(iw iwVar) {
        if (iwVar == null) {
            return false;
        }
        boolean zM743a = m743a();
        boolean zM743a2 = iwVar.m743a();
        if ((zM743a || zM743a2) && !(zM743a && zM743a2 && this.f234a.m725a(iwVar.f234a))) {
            return false;
        }
        boolean zM745b = m745b();
        boolean zM745b2 = iwVar.m745b();
        if ((zM745b || zM745b2) && !(zM745b && zM745b2 && this.f235a.equals(iwVar.f235a))) {
            return false;
        }
        boolean zM746c = m746c();
        boolean zM746c2 = iwVar.m746c();
        if ((zM746c || zM746c2) && !(zM746c && zM746c2 && this.f239b.equals(iwVar.f239b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = iwVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f240c.equals(iwVar.f240c))) || this.f233a != iwVar.f233a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = iwVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f241d.equals(iwVar.f241d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = iwVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f242e.equals(iwVar.f242e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = iwVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f237a.equals(iwVar.f237a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = iwVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f243f.equals(iwVar.f243f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = iwVar.j();
        if (zJ || zJ2) {
            return zJ && zJ2 && this.f238a == iwVar.f238a;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iw iwVar) {
        int iK;
        int iE;
        int iG;
        int iE2;
        int iE3;
        int iC;
        int iE4;
        int iE5;
        int iE6;
        int iD;
        if (!getClass().equals(iwVar.getClass())) {
            return getClass().getName().compareTo(iwVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m743a()).compareTo(Boolean.valueOf(iwVar.m743a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m743a() && (iD = c2t.d(this.f234a, iwVar.f234a)) != 0) {
            return iD;
        }
        int iCompareTo2 = Boolean.valueOf(m745b()).compareTo(Boolean.valueOf(iwVar.m745b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m745b() && (iE6 = c2t.e(this.f235a, iwVar.f235a)) != 0) {
            return iE6;
        }
        int iCompareTo3 = Boolean.valueOf(m746c()).compareTo(Boolean.valueOf(iwVar.m746c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m746c() && (iE5 = c2t.e(this.f239b, iwVar.f239b)) != 0) {
            return iE5;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iwVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE4 = c2t.e(this.f240c, iwVar.f240c)) != 0) {
            return iE4;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iwVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iC = c2t.c(this.f233a, iwVar.f233a)) != 0) {
            return iC;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iwVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE3 = c2t.e(this.f241d, iwVar.f241d)) != 0) {
            return iE3;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iwVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE2 = c2t.e(this.f242e, iwVar.f242e)) != 0) {
            return iE2;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iwVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iG = c2t.g(this.f237a, iwVar.f237a)) != 0) {
            return iG;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iwVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iE = c2t.e(this.f243f, iwVar.f243f)) != 0) {
            return iE;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(iwVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!j() || (iK = c2t.k(this.f238a, iwVar.f238a)) == 0) {
            return 0;
        }
        return iK;
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
                    m742a();
                    return;
                }
                throw new jy("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (l2tVarG.c) {
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f234a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f235a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f239b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f240c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                case 11:
                default:
                    m3t.a(r2tVar, b2);
                    break;
                case 7:
                    if (b2 == 10) {
                        this.f233a = r2tVar.d();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f241d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f242e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 15) {
                        n2t n2tVarH = r2tVar.h();
                        this.f237a = new ArrayList(n2tVarH.f27496b);
                        for (int i2 = 0; i2 < n2tVarH.f27496b; i2++) {
                            this.f237a.add(r2tVar.e());
                        }
                        r2tVar.G();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f243f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 2) {
                        this.f238a = r2tVar.y();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m742a() throws jy {
        if (this.f235a != null) {
            if (this.f239b != null) {
                if (this.f240c != null) {
                    return;
                }
                throw new jy("Required field 'cmdName' was not present! Struct: " + toString());
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
