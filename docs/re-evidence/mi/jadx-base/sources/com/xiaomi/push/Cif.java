package com.xiaomi.push;

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

/* JADX INFO: renamed from: com.xiaomi.push.if, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class Cif implements jm<Cif, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f96a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f97a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f98a = new BitSet(3);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f99a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f100a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f101b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f102b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f103c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f104d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f105e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f106f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f107g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f95a = new v3t("ClientUploadDataItem");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14073a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14074b = new l2t("", (byte) 11, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 10, 4);
    private static final l2t e = new l2t("", (byte) 10, 5);
    private static final l2t f = new l2t("", (byte) 2, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", (byte) 11, 8);
    private static final l2t i = new l2t("", (byte) 11, 9);
    private static final l2t j = new l2t("", HMProSyncDataBaseProfile.DATA_TYPE_PAI, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l2t f14075k = new l2t("", (byte) 11, 11);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m683a() {
    }

    public Cif b(String str) {
        this.f102b = str;
        return this;
    }

    public Cif c(String str) {
        this.f103c = str;
        return this;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m689d() {
        return this.f98a.get(0);
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public boolean m690e() {
        return this.f98a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Cif)) {
            return m686a((Cif) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f98a.get(2);
    }

    public boolean g() {
        return this.f104d != null;
    }

    public boolean h() {
        return this.f105e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f106f != null;
    }

    public boolean j() {
        return this.f99a != null;
    }

    public boolean k() {
        return this.f107g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (m685a()) {
            sb.append("channel:");
            String str = this.f97a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m687b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f102b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (m688c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f103c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (m689d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f96a);
            z = false;
        }
        if (m690e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f101b);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f100a);
            z = false;
        }
        if (g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f104d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f105e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f106f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f99a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        } else {
            z2 = z;
        }
        if (k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f107g;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m681a() {
        return this.f97a;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m687b() {
        return this.f102b != null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m688c() {
        return this.f103c != null;
    }

    public Cif d(String str) {
        this.f104d = str;
        return this;
    }

    public Cif e(String str) {
        this.f105e = str;
        return this;
    }

    public Cif f(String str) {
        this.f106f = str;
        return this;
    }

    public Cif g(String str) {
        this.f107g = str;
        return this;
    }

    public Cif a(String str) {
        this.f97a = str;
        return this;
    }

    public String b() {
        return this.f103c;
    }

    public void c(boolean z) {
        this.f98a.set(2, z);
    }

    public String d() {
        return this.f106f;
    }

    public String e() {
        return this.f107g;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m685a() {
        return this.f97a != null;
    }

    public Cif b(long j2) {
        this.f101b = j2;
        b(true);
        return this;
    }

    public String c() {
        return this.f105e;
    }

    public Cif a(long j2) {
        this.f96a = j2;
        m684a(true);
        return this;
    }

    public void b(boolean z) {
        this.f98a.set(1, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m684a(boolean z) {
        this.f98a.set(0, z);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) {
        m683a();
        r2tVar.v(f95a);
        if (this.f97a != null && m685a()) {
            r2tVar.s(f14073a);
            r2tVar.q(this.f97a);
            r2tVar.z();
        }
        if (this.f102b != null && m687b()) {
            r2tVar.s(f14074b);
            r2tVar.q(this.f102b);
            r2tVar.z();
        }
        if (this.f103c != null && m688c()) {
            r2tVar.s(c);
            r2tVar.q(this.f103c);
            r2tVar.z();
        }
        if (m689d()) {
            r2tVar.s(d);
            r2tVar.p(this.f96a);
            r2tVar.z();
        }
        if (m690e()) {
            r2tVar.s(e);
            r2tVar.p(this.f101b);
            r2tVar.z();
        }
        if (f()) {
            r2tVar.s(f);
            r2tVar.x(this.f100a);
            r2tVar.z();
        }
        if (this.f104d != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f104d);
            r2tVar.z();
        }
        if (this.f105e != null && h()) {
            r2tVar.s(h);
            r2tVar.q(this.f105e);
            r2tVar.z();
        }
        if (this.f106f != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f106f);
            r2tVar.z();
        }
        if (this.f99a != null && j()) {
            r2tVar.s(j);
            r2tVar.u(new p2t((byte) 11, (byte) 11, this.f99a.size()));
            for (Map.Entry<String, String> entry : this.f99a.entrySet()) {
                r2tVar.q(entry.getKey());
                r2tVar.q(entry.getValue());
            }
            r2tVar.B();
            r2tVar.z();
        }
        if (this.f107g != null && k()) {
            r2tVar.s(f14075k);
            r2tVar.q(this.f107g);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    public long a() {
        return this.f101b;
    }

    public Cif a(boolean z) {
        this.f100a = z;
        c(true);
        return this;
    }

    public void a(String str, String str2) {
        if (this.f99a == null) {
            this.f99a = new HashMap();
        }
        this.f99a.put(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m682a() {
        return this.f99a;
    }

    public Cif a(Map<String, String> map) {
        this.f99a = map;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m686a(Cif cif) {
        if (cif == null) {
            return false;
        }
        boolean zM685a = m685a();
        boolean zM685a2 = cif.m685a();
        if ((zM685a || zM685a2) && !(zM685a && zM685a2 && this.f97a.equals(cif.f97a))) {
            return false;
        }
        boolean zM687b = m687b();
        boolean zM687b2 = cif.m687b();
        if ((zM687b || zM687b2) && !(zM687b && zM687b2 && this.f102b.equals(cif.f102b))) {
            return false;
        }
        boolean zM688c = m688c();
        boolean zM688c2 = cif.m688c();
        if ((zM688c || zM688c2) && !(zM688c && zM688c2 && this.f103c.equals(cif.f103c))) {
            return false;
        }
        boolean zM689d = m689d();
        boolean zM689d2 = cif.m689d();
        if ((zM689d || zM689d2) && !(zM689d && zM689d2 && this.f96a == cif.f96a)) {
            return false;
        }
        boolean zM690e = m690e();
        boolean zM690e2 = cif.m690e();
        if ((zM690e || zM690e2) && !(zM690e && zM690e2 && this.f101b == cif.f101b)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = cif.f();
        if ((zF || zF2) && !(zF && zF2 && this.f100a == cif.f100a)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = cif.g();
        if ((zG || zG2) && !(zG && zG2 && this.f104d.equals(cif.f104d))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = cif.h();
        if ((zH || zH2) && !(zH && zH2 && this.f105e.equals(cif.f105e))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = cif.i();
        if ((zI || zI2) && !(zI && zI2 && this.f106f.equals(cif.f106f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = cif.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f99a.equals(cif.f99a))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = cif.k();
        if (zK || zK2) {
            return zK && zK2 && this.f107g.equals(cif.f107g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Cif cif) {
        int iE;
        int iH;
        int iE2;
        int iE3;
        int iE4;
        int iK;
        int iC;
        int iC2;
        int iE5;
        int iE6;
        int iE7;
        if (!getClass().equals(cif.getClass())) {
            return getClass().getName().compareTo(cif.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m685a()).compareTo(Boolean.valueOf(cif.m685a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m685a() && (iE7 = c2t.e(this.f97a, cif.f97a)) != 0) {
            return iE7;
        }
        int iCompareTo2 = Boolean.valueOf(m687b()).compareTo(Boolean.valueOf(cif.m687b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m687b() && (iE6 = c2t.e(this.f102b, cif.f102b)) != 0) {
            return iE6;
        }
        int iCompareTo3 = Boolean.valueOf(m688c()).compareTo(Boolean.valueOf(cif.m688c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m688c() && (iE5 = c2t.e(this.f103c, cif.f103c)) != 0) {
            return iE5;
        }
        int iCompareTo4 = Boolean.valueOf(m689d()).compareTo(Boolean.valueOf(cif.m689d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m689d() && (iC2 = c2t.c(this.f96a, cif.f96a)) != 0) {
            return iC2;
        }
        int iCompareTo5 = Boolean.valueOf(m690e()).compareTo(Boolean.valueOf(cif.m690e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m690e() && (iC = c2t.c(this.f101b, cif.f101b)) != 0) {
            return iC;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(cif.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iK = c2t.k(this.f100a, cif.f100a)) != 0) {
            return iK;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(cif.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE4 = c2t.e(this.f104d, cif.f104d)) != 0) {
            return iE4;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(cif.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iE3 = c2t.e(this.f105e, cif.f105e)) != 0) {
            return iE3;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(cif.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iE2 = c2t.e(this.f106f, cif.f106f)) != 0) {
            return iE2;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(cif.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iH = c2t.h(this.f99a, cif.f99a)) != 0) {
            return iH;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(cif.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (!k() || (iE = c2t.e(this.f107g, cif.f107g)) == 0) {
            return 0;
        }
        return iE;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                r2tVar.D();
                m683a();
                return;
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f97a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 11) {
                        this.f102b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f103c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 10) {
                        this.f96a = r2tVar.d();
                        m684a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 10) {
                        this.f101b = r2tVar.d();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 2) {
                        this.f100a = r2tVar.y();
                        c(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f104d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f105e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f106f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 13) {
                        p2t p2tVarI = r2tVar.i();
                        this.f99a = new HashMap(p2tVarI.c * 2);
                        for (int i2 = 0; i2 < p2tVarI.c; i2++) {
                            this.f99a.put(r2tVar.e(), r2tVar.e());
                        }
                        r2tVar.F();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f107g = r2tVar.e();
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
}
