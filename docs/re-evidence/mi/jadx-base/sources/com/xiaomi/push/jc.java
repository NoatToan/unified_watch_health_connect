package com.xiaomi.push;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import defpackage.c2t;
import defpackage.gbs;
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
public class jc implements jm<jc, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f307a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f308a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f309a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f310a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public List<String> f312a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f314b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f315b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f316b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public long f317c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f318c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f319d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f320e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f321f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f322g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f323h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f324i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public String f325j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public String f326k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public String f327l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f306a = new v3t("XmPushActionRegistrationResult");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14131a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14132b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 10, 6);
    private static final l2t f = new l2t("", (byte) 11, 7);
    private static final l2t g = new l2t("", (byte) 11, 8);
    private static final l2t h = new l2t("", (byte) 11, 9);
    private static final l2t i = new l2t("", (byte) 11, 10);
    private static final l2t j = new l2t("", (byte) 10, 11);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l2t f14133k = new l2t("", (byte) 11, 12);
    private static final l2t l = new l2t("", (byte) 11, 13);
    private static final l2t m = new l2t("", (byte) 10, 14);
    private static final l2t n = new l2t("", (byte) 11, 15);
    private static final l2t o = new l2t("", (byte) 8, 16);
    private static final l2t p = new l2t("", (byte) 11, 17);
    private static final l2t q = new l2t("", (byte) 8, 18);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final l2t f14134r = new l2t("", (byte) 11, 19);
    private static final l2t s = new l2t("", (byte) 2, 20);
    private static final l2t t = new l2t("", (byte) 15, 21);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f311a = new BitSet(6);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f313a = false;

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m780a() {
        return this.f310a != null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m782b() {
        return this.f309a != null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m783c() {
        return this.f316b != null;
    }

    public boolean d() {
        return this.f318c != null;
    }

    public boolean e() {
        return this.f311a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jc)) {
            return m781a((jc) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f319d != null;
    }

    public boolean g() {
        return this.f320e != null;
    }

    public boolean h() {
        return this.f321f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f322g != null;
    }

    public boolean j() {
        return this.f311a.get(1);
    }

    public boolean k() {
        return this.f323h != null;
    }

    public boolean l() {
        return this.f324i != null;
    }

    public boolean m() {
        return this.f311a.get(2);
    }

    public boolean n() {
        return this.f325j != null;
    }

    public boolean o() {
        return this.f311a.get(3);
    }

    public boolean p() {
        return this.f326k != null;
    }

    public boolean q() {
        return this.f311a.get(4);
    }

    public boolean r() {
        return this.f327l != null;
    }

    public boolean s() {
        return this.f311a.get(5);
    }

    public boolean t() {
        return this.f312a != null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    /* JADX WARN: Code duplicated, block: B:84:0x017a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:87:0x018a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0193  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b6  */
    public String toString() {
        boolean z;
        String str;
        String str2;
        List<String> list;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        if (m780a()) {
            sb.append("debug:");
            String str11 = this.f310a;
            if (str11 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str11);
            }
            z = false;
        } else {
            z = true;
        }
        if (!m782b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f316b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(gbs.b(str));
            }
            sb.append(", ");
            sb.append("appId:");
            str2 = this.f318c;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f308a);
            if (f()) {
                sb.append(", ");
                sb.append("reason:");
                str10 = this.f319d;
                if (str10 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str10);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("regId:");
                str9 = this.f320e;
                if (str9 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str9);
                }
            }
            if (i()) {
                sb.append(", ");
                sb.append("packageName:");
                str8 = this.f322g;
                if (str8 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str8);
                }
            }
            if (j()) {
                sb.append(", ");
                sb.append("registeredAt:");
                sb.append(this.f315b);
            }
            if (k()) {
                sb.append(", ");
                sb.append("aliasName:");
                str7 = this.f323h;
                if (str7 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str7);
                }
            }
            if (l()) {
                sb.append(", ");
                sb.append("clientId:");
                str6 = this.f324i;
                if (str6 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str6);
                }
            }
            if (m()) {
                sb.append(", ");
                sb.append("costTime:");
                sb.append(this.f317c);
            }
            if (n()) {
                sb.append(", ");
                sb.append("appVersion:");
                str5 = this.f325j;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (o()) {
                sb.append(", ");
                sb.append("pushSdkVersionCode:");
                sb.append(this.f307a);
            }
            if (p()) {
                sb.append(", ");
                sb.append("hybridPushEndpoint:");
                str4 = this.f326k;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (q()) {
                sb.append(", ");
                sb.append("appVersionCode:");
                sb.append(this.f314b);
            }
            if (r()) {
                sb.append(", ");
                sb.append("region:");
                str3 = this.f327l;
                if (str3 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str3);
                }
            }
            if (s()) {
                sb.append(", ");
                sb.append("isHybridFrame:");
                sb.append(this.f313a);
            }
            if (t()) {
                sb.append(", ");
                sb.append("autoMarkPkgs:");
                list = this.f312a;
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
        iq iqVar = this.f309a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f316b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(gbs.b(str));
        }
        sb.append(", ");
        sb.append("appId:");
        str2 = this.f318c;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f308a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            str10 = this.f319d;
            if (str10 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str10);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("regId:");
            str9 = this.f320e;
            if (str9 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str9);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            str8 = this.f322g;
            if (str8 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f315b);
        }
        if (k()) {
            sb.append(", ");
            sb.append("aliasName:");
            str7 = this.f323h;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("clientId:");
            str6 = this.f324i;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f317c);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersion:");
            str5 = this.f325j;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f307a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            str4 = this.f326k;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f314b);
        }
        if (r()) {
            sb.append(", ");
            sb.append("region:");
            str3 = this.f327l;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f313a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("autoMarkPkgs:");
            list = this.f312a;
            if (list == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m777a() {
        return this.f316b;
    }

    public String b() {
        return this.f321f;
    }

    public String c() {
        return this.f322g;
    }

    public void d(boolean z) {
        this.f311a.set(3, z);
    }

    public void e(boolean z) {
        this.f311a.set(4, z);
    }

    public void f(boolean z) {
        this.f311a.set(5, z);
    }

    public long a() {
        return this.f308a;
    }

    public void b(boolean z) {
        this.f311a.set(1, z);
    }

    public void c(boolean z) {
        this.f311a.set(2, z);
    }

    public void a(boolean z) {
        this.f311a.set(0, z);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m779a();
        r2tVar.v(f306a);
        if (this.f310a != null && m780a()) {
            r2tVar.s(f14131a);
            r2tVar.q(this.f310a);
            r2tVar.z();
        }
        if (this.f309a != null && m782b()) {
            r2tVar.s(f14132b);
            this.f309a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f316b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f316b);
            r2tVar.z();
        }
        if (this.f318c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f318c);
            r2tVar.z();
        }
        r2tVar.s(e);
        r2tVar.p(this.f308a);
        r2tVar.z();
        if (this.f319d != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f319d);
            r2tVar.z();
        }
        if (this.f320e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f320e);
            r2tVar.z();
        }
        if (this.f321f != null && h()) {
            r2tVar.s(h);
            r2tVar.q(this.f321f);
            r2tVar.z();
        }
        if (this.f322g != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f322g);
            r2tVar.z();
        }
        if (j()) {
            r2tVar.s(j);
            r2tVar.p(this.f315b);
            r2tVar.z();
        }
        if (this.f323h != null && k()) {
            r2tVar.s(f14133k);
            r2tVar.q(this.f323h);
            r2tVar.z();
        }
        if (this.f324i != null && l()) {
            r2tVar.s(l);
            r2tVar.q(this.f324i);
            r2tVar.z();
        }
        if (m()) {
            r2tVar.s(m);
            r2tVar.p(this.f317c);
            r2tVar.z();
        }
        if (this.f325j != null && n()) {
            r2tVar.s(n);
            r2tVar.q(this.f325j);
            r2tVar.z();
        }
        if (o()) {
            r2tVar.s(o);
            r2tVar.o(this.f307a);
            r2tVar.z();
        }
        if (this.f326k != null && p()) {
            r2tVar.s(p);
            r2tVar.q(this.f326k);
            r2tVar.z();
        }
        if (q()) {
            r2tVar.s(q);
            r2tVar.o(this.f314b);
            r2tVar.z();
        }
        if (this.f327l != null && r()) {
            r2tVar.s(f14134r);
            r2tVar.q(this.f327l);
            r2tVar.z();
        }
        if (s()) {
            r2tVar.s(s);
            r2tVar.x(this.f313a);
            r2tVar.z();
        }
        if (this.f312a != null && t()) {
            r2tVar.s(t);
            r2tVar.t(new n2t((byte) 11, this.f312a.size()));
            Iterator<String> it = this.f312a.iterator();
            while (it.hasNext()) {
                r2tVar.q(it.next());
            }
            r2tVar.C();
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public List<String> m778a() {
        return this.f312a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m781a(jc jcVar) {
        if (jcVar == null) {
            return false;
        }
        boolean zM780a = m780a();
        boolean zM780a2 = jcVar.m780a();
        if ((zM780a || zM780a2) && !(zM780a && zM780a2 && this.f310a.equals(jcVar.f310a))) {
            return false;
        }
        boolean zM782b = m782b();
        boolean zM782b2 = jcVar.m782b();
        if ((zM782b || zM782b2) && !(zM782b && zM782b2 && this.f309a.m725a(jcVar.f309a))) {
            return false;
        }
        boolean zM783c = m783c();
        boolean zM783c2 = jcVar.m783c();
        if ((zM783c || zM783c2) && !(zM783c && zM783c2 && this.f316b.equals(jcVar.f316b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jcVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f318c.equals(jcVar.f318c))) || this.f308a != jcVar.f308a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jcVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f319d.equals(jcVar.f319d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jcVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f320e.equals(jcVar.f320e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jcVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f321f.equals(jcVar.f321f))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jcVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f322g.equals(jcVar.f322g))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jcVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f315b == jcVar.f315b)) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jcVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f323h.equals(jcVar.f323h))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jcVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f324i.equals(jcVar.f324i))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = jcVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f317c == jcVar.f317c)) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = jcVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f325j.equals(jcVar.f325j))) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = jcVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.f307a == jcVar.f307a)) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = jcVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.f326k.equals(jcVar.f326k))) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = jcVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.f314b == jcVar.f314b)) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = jcVar.r();
        if ((zR || zR2) && !(zR && zR2 && this.f327l.equals(jcVar.f327l))) {
            return false;
        }
        boolean zS = s();
        boolean zS2 = jcVar.s();
        if ((zS || zS2) && !(zS && zS2 && this.f313a == jcVar.f313a)) {
            return false;
        }
        boolean zT = t();
        boolean zT2 = jcVar.t();
        if (zT || zT2) {
            return zT && zT2 && this.f312a.equals(jcVar.f312a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jc jcVar) {
        int iG;
        int iK;
        int iE;
        int iB;
        int iE2;
        int iB2;
        int iE3;
        int iC;
        int iE4;
        int iE5;
        int iC2;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iC3;
        int iE10;
        int iE11;
        int iD;
        int iE12;
        if (!getClass().equals(jcVar.getClass())) {
            return getClass().getName().compareTo(jcVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m780a()).compareTo(Boolean.valueOf(jcVar.m780a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m780a() && (iE12 = c2t.e(this.f310a, jcVar.f310a)) != 0) {
            return iE12;
        }
        int iCompareTo2 = Boolean.valueOf(m782b()).compareTo(Boolean.valueOf(jcVar.m782b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m782b() && (iD = c2t.d(this.f309a, jcVar.f309a)) != 0) {
            return iD;
        }
        int iCompareTo3 = Boolean.valueOf(m783c()).compareTo(Boolean.valueOf(jcVar.m783c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m783c() && (iE11 = c2t.e(this.f316b, jcVar.f316b)) != 0) {
            return iE11;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jcVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE10 = c2t.e(this.f318c, jcVar.f318c)) != 0) {
            return iE10;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jcVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iC3 = c2t.c(this.f308a, jcVar.f308a)) != 0) {
            return iC3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jcVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE9 = c2t.e(this.f319d, jcVar.f319d)) != 0) {
            return iE9;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jcVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE8 = c2t.e(this.f320e, jcVar.f320e)) != 0) {
            return iE8;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jcVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iE7 = c2t.e(this.f321f, jcVar.f321f)) != 0) {
            return iE7;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jcVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iE6 = c2t.e(this.f322g, jcVar.f322g)) != 0) {
            return iE6;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jcVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iC2 = c2t.c(this.f315b, jcVar.f315b)) != 0) {
            return iC2;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jcVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iE5 = c2t.e(this.f323h, jcVar.f323h)) != 0) {
            return iE5;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jcVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iE4 = c2t.e(this.f324i, jcVar.f324i)) != 0) {
            return iE4;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jcVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iC = c2t.c(this.f317c, jcVar.f317c)) != 0) {
            return iC;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jcVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iE3 = c2t.e(this.f325j, jcVar.f325j)) != 0) {
            return iE3;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jcVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iB2 = c2t.b(this.f307a, jcVar.f307a)) != 0) {
            return iB2;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(jcVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iE2 = c2t.e(this.f326k, jcVar.f326k)) != 0) {
            return iE2;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(jcVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iB = c2t.b(this.f314b, jcVar.f314b)) != 0) {
            return iB;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(jcVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (r() && (iE = c2t.e(this.f327l, jcVar.f327l)) != 0) {
            return iE;
        }
        int iCompareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(jcVar.s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (s() && (iK = c2t.k(this.f313a, jcVar.f313a)) != 0) {
            return iK;
        }
        int iCompareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(jcVar.t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!t() || (iG = c2t.g(this.f312a, jcVar.f312a)) == 0) {
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
                if (e()) {
                    m779a();
                    return;
                }
                throw new jy("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f310a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f309a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f316b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f318c = r2tVar.e();
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
                        this.f308a = r2tVar.d();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f319d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f320e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f321f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f322g = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 10) {
                        this.f315b = r2tVar.d();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f323h = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 11) {
                        this.f324i = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 14:
                    if (b2 == 10) {
                        this.f317c = r2tVar.d();
                        c(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 15:
                    if (b2 == 11) {
                        this.f325j = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 16:
                    if (b2 == 8) {
                        this.f307a = r2tVar.c();
                        d(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 17:
                    if (b2 == 11) {
                        this.f326k = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 18:
                    if (b2 == 8) {
                        this.f314b = r2tVar.c();
                        e(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 19:
                    if (b2 == 11) {
                        this.f327l = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 20:
                    if (b2 == 2) {
                        this.f313a = r2tVar.y();
                        f(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 21:
                    if (b2 == 15) {
                        n2t n2tVarH = r2tVar.h();
                        this.f312a = new ArrayList(n2tVarH.f27496b);
                        for (int i2 = 0; i2 < n2tVarH.f27496b; i2++) {
                            this.f312a.add(r2tVar.e());
                        }
                        r2tVar.G();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m779a() throws jy {
        if (this.f316b != null) {
            if (this.f318c != null) {
                return;
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
