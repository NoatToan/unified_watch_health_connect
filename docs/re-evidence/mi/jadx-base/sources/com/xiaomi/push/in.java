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
public class in implements jm<in, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f136a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public io f137a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f138a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f139a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f140a = new BitSet(4);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f141a = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f142b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f143b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public long f144c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f145c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f146d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f147e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f148f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f149g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f150h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f151i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public String f152j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public String f153k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public String f154l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f135a = new v3t("PushMessage");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14094a = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14095b = new l2t("", (byte) 11, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 10, 5);
    private static final l2t f = new l2t("", (byte) 10, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", (byte) 11, 8);
    private static final l2t i = new l2t("", (byte) 11, 9);
    private static final l2t j = new l2t("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l2t f14096k = new l2t("", (byte) 11, 11);
    private static final l2t l = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 12);
    private static final l2t m = new l2t("", (byte) 11, 13);
    private static final l2t n = new l2t("", (byte) 2, 14);
    private static final l2t o = new l2t("", (byte) 11, 15);
    private static final l2t p = new l2t("", (byte) 10, 16);
    private static final l2t q = new l2t("", (byte) 11, 20);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final l2t f14097r = new l2t("", (byte) 11, 21);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m707a() {
        return this.f138a != null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m709b() {
        return this.f139a != null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m710c() {
        return this.f143b != null;
    }

    public boolean d() {
        return this.f145c != null;
    }

    public boolean e() {
        return this.f140a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof in)) {
            return m708a((in) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f140a.get(1);
    }

    public boolean g() {
        return this.f146d != null;
    }

    public boolean h() {
        return this.f147e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f148f != null;
    }

    public boolean j() {
        return this.f149g != null;
    }

    public boolean k() {
        return this.f150h != null;
    }

    public boolean l() {
        return this.f137a != null;
    }

    public boolean m() {
        return this.f151i != null;
    }

    public boolean n() {
        return this.f140a.get(2);
    }

    public boolean o() {
        return this.f152j != null;
    }

    public boolean p() {
        return this.f140a.get(3);
    }

    public boolean q() {
        return this.f153k != null;
    }

    public boolean r() {
        return this.f154l != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (m707a()) {
            sb.append("to:");
            iq iqVar = this.f138a;
            if (iqVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(iqVar);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f139a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f143b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("payload:");
        String str3 = this.f145c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f136a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f142b);
        }
        if (g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            String str4 = this.f146d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f147e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("regId:");
            String str6 = this.f148f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f149g;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("topic:");
            String str8 = this.f150h;
            if (str8 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            io ioVar = this.f137a;
            if (ioVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(ioVar);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f151i;
            if (str9 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str9);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f141a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f152j;
            if (str10 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str10);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f144c);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f153k;
            if (str11 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str11);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f154l;
            if (str12 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str12);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m705a() {
        return this.f139a;
    }

    public String b() {
        return this.f143b;
    }

    public String c() {
        return this.f145c;
    }

    public void d(boolean z) {
        this.f140a.set(3, z);
    }

    public long a() {
        return this.f136a;
    }

    public void b(boolean z) {
        this.f140a.set(1, z);
    }

    public void c(boolean z) {
        this.f140a.set(2, z);
    }

    public void a(boolean z) {
        this.f140a.set(0, z);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m706a();
        r2tVar.v(f135a);
        if (this.f138a != null && m707a()) {
            r2tVar.s(f14094a);
            this.f138a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f139a != null) {
            r2tVar.s(f14095b);
            r2tVar.q(this.f139a);
            r2tVar.z();
        }
        if (this.f143b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f143b);
            r2tVar.z();
        }
        if (this.f145c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f145c);
            r2tVar.z();
        }
        if (e()) {
            r2tVar.s(e);
            r2tVar.p(this.f136a);
            r2tVar.z();
        }
        if (f()) {
            r2tVar.s(f);
            r2tVar.p(this.f142b);
            r2tVar.z();
        }
        if (this.f146d != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f146d);
            r2tVar.z();
        }
        if (this.f147e != null && h()) {
            r2tVar.s(h);
            r2tVar.q(this.f147e);
            r2tVar.z();
        }
        if (this.f148f != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f148f);
            r2tVar.z();
        }
        if (this.f149g != null && j()) {
            r2tVar.s(j);
            r2tVar.q(this.f149g);
            r2tVar.z();
        }
        if (this.f150h != null && k()) {
            r2tVar.s(f14096k);
            r2tVar.q(this.f150h);
            r2tVar.z();
        }
        if (this.f137a != null && l()) {
            r2tVar.s(l);
            this.f137a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f151i != null && m()) {
            r2tVar.s(m);
            r2tVar.q(this.f151i);
            r2tVar.z();
        }
        if (n()) {
            r2tVar.s(n);
            r2tVar.x(this.f141a);
            r2tVar.z();
        }
        if (this.f152j != null && o()) {
            r2tVar.s(o);
            r2tVar.q(this.f152j);
            r2tVar.z();
        }
        if (p()) {
            r2tVar.s(p);
            r2tVar.p(this.f144c);
            r2tVar.z();
        }
        if (this.f153k != null && q()) {
            r2tVar.s(q);
            r2tVar.q(this.f153k);
            r2tVar.z();
        }
        if (this.f154l != null && r()) {
            r2tVar.s(f14097r);
            r2tVar.q(this.f154l);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m708a(in inVar) {
        if (inVar == null) {
            return false;
        }
        boolean zM707a = m707a();
        boolean zM707a2 = inVar.m707a();
        if ((zM707a || zM707a2) && !(zM707a && zM707a2 && this.f138a.m725a(inVar.f138a))) {
            return false;
        }
        boolean zM709b = m709b();
        boolean zM709b2 = inVar.m709b();
        if ((zM709b || zM709b2) && !(zM709b && zM709b2 && this.f139a.equals(inVar.f139a))) {
            return false;
        }
        boolean zM710c = m710c();
        boolean zM710c2 = inVar.m710c();
        if ((zM710c || zM710c2) && !(zM710c && zM710c2 && this.f143b.equals(inVar.f143b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = inVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f145c.equals(inVar.f145c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = inVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f136a == inVar.f136a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = inVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f142b == inVar.f142b)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = inVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f146d.equals(inVar.f146d))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = inVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f147e.equals(inVar.f147e))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = inVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f148f.equals(inVar.f148f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = inVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f149g.equals(inVar.f149g))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = inVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f150h.equals(inVar.f150h))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = inVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f137a.m717a(inVar.f137a))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = inVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f151i.equals(inVar.f151i))) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = inVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f141a == inVar.f141a)) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = inVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.f152j.equals(inVar.f152j))) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = inVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.f144c == inVar.f144c)) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = inVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.f153k.equals(inVar.f153k))) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = inVar.r();
        if (zR || zR2) {
            return zR && zR2 && this.f154l.equals(inVar.f154l);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(in inVar) {
        int iE;
        int iE2;
        int iC;
        int iE3;
        int iK;
        int iE4;
        int iD;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iC2;
        int iC3;
        int iE10;
        int iE11;
        int iE12;
        int iD2;
        if (!getClass().equals(inVar.getClass())) {
            return getClass().getName().compareTo(inVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m707a()).compareTo(Boolean.valueOf(inVar.m707a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m707a() && (iD2 = c2t.d(this.f138a, inVar.f138a)) != 0) {
            return iD2;
        }
        int iCompareTo2 = Boolean.valueOf(m709b()).compareTo(Boolean.valueOf(inVar.m709b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m709b() && (iE12 = c2t.e(this.f139a, inVar.f139a)) != 0) {
            return iE12;
        }
        int iCompareTo3 = Boolean.valueOf(m710c()).compareTo(Boolean.valueOf(inVar.m710c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m710c() && (iE11 = c2t.e(this.f143b, inVar.f143b)) != 0) {
            return iE11;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(inVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE10 = c2t.e(this.f145c, inVar.f145c)) != 0) {
            return iE10;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(inVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iC3 = c2t.c(this.f136a, inVar.f136a)) != 0) {
            return iC3;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(inVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iC2 = c2t.c(this.f142b, inVar.f142b)) != 0) {
            return iC2;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(inVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE9 = c2t.e(this.f146d, inVar.f146d)) != 0) {
            return iE9;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(inVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iE8 = c2t.e(this.f147e, inVar.f147e)) != 0) {
            return iE8;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(inVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iE7 = c2t.e(this.f148f, inVar.f148f)) != 0) {
            return iE7;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(inVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iE6 = c2t.e(this.f149g, inVar.f149g)) != 0) {
            return iE6;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(inVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iE5 = c2t.e(this.f150h, inVar.f150h)) != 0) {
            return iE5;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(inVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iD = c2t.d(this.f137a, inVar.f137a)) != 0) {
            return iD;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(inVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iE4 = c2t.e(this.f151i, inVar.f151i)) != 0) {
            return iE4;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(inVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iK = c2t.k(this.f141a, inVar.f141a)) != 0) {
            return iK;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(inVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iE3 = c2t.e(this.f152j, inVar.f152j)) != 0) {
            return iE3;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(inVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iC = c2t.c(this.f144c, inVar.f144c)) != 0) {
            return iC;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(inVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iE2 = c2t.e(this.f153k, inVar.f153k)) != 0) {
            return iE2;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(inVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (!r() || (iE = c2t.e(this.f154l, inVar.f154l)) == 0) {
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
                m706a();
                return;
            }
            short s = l2tVarG.c;
            if (s != 20) {
                if (s != 21) {
                    switch (s) {
                        case 1:
                            if (b2 == 12) {
                                iq iqVar = new iq();
                                this.f138a = iqVar;
                                iqVar.a(r2tVar);
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 2:
                            if (b2 == 11) {
                                this.f139a = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 3:
                            if (b2 == 11) {
                                this.f143b = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 4:
                            if (b2 == 11) {
                                this.f145c = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 5:
                            if (b2 == 10) {
                                this.f136a = r2tVar.d();
                                a(true);
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 6:
                            if (b2 == 10) {
                                this.f142b = r2tVar.d();
                                b(true);
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 7:
                            if (b2 == 11) {
                                this.f146d = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 8:
                            if (b2 == 11) {
                                this.f147e = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 9:
                            if (b2 == 11) {
                                this.f148f = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 10:
                            if (b2 == 11) {
                                this.f149g = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 11:
                            if (b2 == 11) {
                                this.f150h = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 12:
                            if (b2 == 12) {
                                io ioVar = new io();
                                this.f137a = ioVar;
                                ioVar.a(r2tVar);
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 13:
                            if (b2 == 11) {
                                this.f151i = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 14:
                            if (b2 == 2) {
                                this.f141a = r2tVar.y();
                                c(true);
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 15:
                            if (b2 == 11) {
                                this.f152j = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 16:
                            if (b2 == 10) {
                                this.f144c = r2tVar.d();
                                d(true);
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        default:
                            m3t.a(r2tVar, b2);
                            break;
                    }
                } else if (b2 == 11) {
                    this.f154l = r2tVar.e();
                } else {
                    m3t.a(r2tVar, b2);
                }
            } else if (b2 == 11) {
                this.f153k = r2tVar.e();
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m706a() throws jy {
        if (this.f139a != null) {
            if (this.f143b != null) {
                if (this.f145c != null) {
                    return;
                }
                throw new jy("Required field 'payload' was not present! Struct: " + toString());
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
