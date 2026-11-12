package com.xiaomi.push;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.c2t;
import defpackage.gbs;
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
public class io implements jm<io, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f156a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f157a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f158a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f159a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f160a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f161a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f162b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f163b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public Map<String, String> f164b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f165c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f166c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public Map<String, String> f167c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f168d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f169e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f155a = new v3t("PushMetaInfo");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14098a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14099b = new l2t("", (byte) 10, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 8, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", (byte) 8, 8);
    private static final l2t i = new l2t("", (byte) 8, 9);
    private static final l2t j = new l2t("", HMProSyncDataBaseProfile.DATA_TYPE_PAI, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l2t f14100k = new l2t("", HMProSyncDataBaseProfile.DATA_TYPE_PAI, 11);
    private static final l2t l = new l2t("", (byte) 2, 12);
    private static final l2t m = new l2t("", HMProSyncDataBaseProfile.DATA_TYPE_PAI, 13);

    public io() {
        this.f159a = new BitSet(5);
        this.f161a = false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public io m712a() {
        return new io(this);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m720b() {
        return this.f159a.get(0);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m722c() {
        return this.f163b != null;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m723d() {
        return this.f166c != null;
    }

    public boolean e() {
        return this.f168d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof io)) {
            return m717a((io) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f159a.get(1);
    }

    public boolean g() {
        return this.f169e != null;
    }

    public boolean h() {
        return this.f159a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f159a.get(3);
    }

    public boolean j() {
        return this.f160a != null;
    }

    public boolean k() {
        return this.f164b != null;
    }

    public boolean l() {
        return this.f161a;
    }

    public boolean m() {
        return this.f159a.get(4);
    }

    public boolean n() {
        return this.f167c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        String str = this.f158a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(gbs.b(str));
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f157a);
        if (m722c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f163b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        if (m723d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f166c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f168d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f156a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f169e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f162b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f165c);
        }
        if (j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f160a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f164b;
            if (map2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map2);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f161a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f167c;
            if (map3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map3);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m713a() {
        return this.f158a;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public String m718b() {
        return this.f163b;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public String m721c() {
        return this.f166c;
    }

    public String d() {
        return this.f168d;
    }

    public void e(boolean z) {
        this.f159a.set(4, z);
    }

    public io a(String str) {
        this.f158a = str;
        return this;
    }

    public io b(String str) {
        this.f163b = str;
        return this;
    }

    public io c(String str) {
        this.f166c = str;
        return this;
    }

    public io d(String str) {
        this.f168d = str;
        return this;
    }

    public io(io ioVar) {
        BitSet bitSet = new BitSet(5);
        this.f159a = bitSet;
        bitSet.clear();
        this.f159a.or(ioVar.f159a);
        if (ioVar.m716a()) {
            this.f158a = ioVar.f158a;
        }
        this.f157a = ioVar.f157a;
        if (ioVar.m722c()) {
            this.f163b = ioVar.f163b;
        }
        if (ioVar.m723d()) {
            this.f166c = ioVar.f166c;
        }
        if (ioVar.e()) {
            this.f168d = ioVar.f168d;
        }
        this.f156a = ioVar.f156a;
        if (ioVar.g()) {
            this.f169e = ioVar.f169e;
        }
        this.f162b = ioVar.f162b;
        this.f165c = ioVar.f165c;
        if (ioVar.j()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, String> entry : ioVar.f160a.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            this.f160a = map;
        }
        if (ioVar.k()) {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, String> entry2 : ioVar.f164b.entrySet()) {
                map2.put(entry2.getKey(), entry2.getValue());
            }
            this.f164b = map2;
        }
        this.f161a = ioVar.f161a;
        if (ioVar.n()) {
            HashMap map3 = new HashMap();
            for (Map.Entry<String, String> entry3 : ioVar.f167c.entrySet()) {
                map3.put(entry3.getKey(), entry3.getValue());
            }
            this.f167c = map3;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m716a() {
        return this.f158a != null;
    }

    public void b(boolean z) {
        this.f159a.set(1, z);
    }

    public void c(boolean z) {
        this.f159a.set(2, z);
    }

    public void d(boolean z) {
        this.f159a.set(3, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m711a() {
        return this.f157a;
    }

    public int b() {
        return this.f162b;
    }

    public int c() {
        return this.f165c;
    }

    public void a(boolean z) {
        this.f159a.set(0, z);
    }

    public io b(int i2) {
        this.f162b = i2;
        c(true);
        return this;
    }

    public io c(int i2) {
        this.f165c = i2;
        d(true);
        return this;
    }

    public int a() {
        return this.f156a;
    }

    public io a(int i2) {
        this.f156a = i2;
        b(true);
        return this;
    }

    public void b(String str, String str2) {
        if (this.f164b == null) {
            this.f164b = new HashMap();
        }
        this.f164b.put(str, str2);
    }

    public void a(String str, String str2) {
        if (this.f160a == null) {
            this.f160a = new HashMap();
        }
        this.f160a.put(str, str2);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public Map<String, String> m719b() {
        return this.f164b;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m715a();
        r2tVar.v(f155a);
        if (this.f158a != null) {
            r2tVar.s(f14098a);
            r2tVar.q(this.f158a);
            r2tVar.z();
        }
        r2tVar.s(f14099b);
        r2tVar.p(this.f157a);
        r2tVar.z();
        if (this.f163b != null && m722c()) {
            r2tVar.s(c);
            r2tVar.q(this.f163b);
            r2tVar.z();
        }
        if (this.f166c != null && m723d()) {
            r2tVar.s(d);
            r2tVar.q(this.f166c);
            r2tVar.z();
        }
        if (this.f168d != null && e()) {
            r2tVar.s(e);
            r2tVar.q(this.f168d);
            r2tVar.z();
        }
        if (f()) {
            r2tVar.s(f);
            r2tVar.o(this.f156a);
            r2tVar.z();
        }
        if (this.f169e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f169e);
            r2tVar.z();
        }
        if (h()) {
            r2tVar.s(h);
            r2tVar.o(this.f162b);
            r2tVar.z();
        }
        if (i()) {
            r2tVar.s(i);
            r2tVar.o(this.f165c);
            r2tVar.z();
        }
        if (this.f160a != null && j()) {
            r2tVar.s(j);
            r2tVar.u(new p2t((byte) 11, (byte) 11, this.f160a.size()));
            for (Map.Entry<String, String> entry : this.f160a.entrySet()) {
                r2tVar.q(entry.getKey());
                r2tVar.q(entry.getValue());
            }
            r2tVar.B();
            r2tVar.z();
        }
        if (this.f164b != null && k()) {
            r2tVar.s(f14100k);
            r2tVar.u(new p2t((byte) 11, (byte) 11, this.f164b.size()));
            for (Map.Entry<String, String> entry2 : this.f164b.entrySet()) {
                r2tVar.q(entry2.getKey());
                r2tVar.q(entry2.getValue());
            }
            r2tVar.B();
            r2tVar.z();
        }
        if (m()) {
            r2tVar.s(l);
            r2tVar.x(this.f161a);
            r2tVar.z();
        }
        if (this.f167c != null && n()) {
            r2tVar.s(m);
            r2tVar.u(new p2t((byte) 11, (byte) 11, this.f167c.size()));
            for (Map.Entry<String, String> entry3 : this.f167c.entrySet()) {
                r2tVar.q(entry3.getKey());
                r2tVar.q(entry3.getValue());
            }
            r2tVar.B();
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m714a() {
        return this.f160a;
    }

    public io a(Map<String, String> map) {
        this.f160a = map;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m717a(io ioVar) {
        if (ioVar == null) {
            return false;
        }
        boolean zM716a = m716a();
        boolean zM716a2 = ioVar.m716a();
        if (((zM716a || zM716a2) && !(zM716a && zM716a2 && this.f158a.equals(ioVar.f158a))) || this.f157a != ioVar.f157a) {
            return false;
        }
        boolean zM722c = m722c();
        boolean zM722c2 = ioVar.m722c();
        if ((zM722c || zM722c2) && !(zM722c && zM722c2 && this.f163b.equals(ioVar.f163b))) {
            return false;
        }
        boolean zM723d = m723d();
        boolean zM723d2 = ioVar.m723d();
        if ((zM723d || zM723d2) && !(zM723d && zM723d2 && this.f166c.equals(ioVar.f166c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = ioVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f168d.equals(ioVar.f168d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = ioVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f156a == ioVar.f156a)) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = ioVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f169e.equals(ioVar.f169e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = ioVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f162b == ioVar.f162b)) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = ioVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f165c == ioVar.f165c)) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = ioVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f160a.equals(ioVar.f160a))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = ioVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f164b.equals(ioVar.f164b))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = ioVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f161a == ioVar.f161a)) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = ioVar.n();
        if (zN || zN2) {
            return zN && zN2 && this.f167c.equals(ioVar.f167c);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(io ioVar) {
        int iH;
        int iK;
        int iH2;
        int iH3;
        int iB;
        int iB2;
        int iE;
        int iB3;
        int iE2;
        int iE3;
        int iE4;
        int iC;
        int iE5;
        if (!getClass().equals(ioVar.getClass())) {
            return getClass().getName().compareTo(ioVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m716a()).compareTo(Boolean.valueOf(ioVar.m716a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m716a() && (iE5 = c2t.e(this.f158a, ioVar.f158a)) != 0) {
            return iE5;
        }
        int iCompareTo2 = Boolean.valueOf(m720b()).compareTo(Boolean.valueOf(ioVar.m720b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m720b() && (iC = c2t.c(this.f157a, ioVar.f157a)) != 0) {
            return iC;
        }
        int iCompareTo3 = Boolean.valueOf(m722c()).compareTo(Boolean.valueOf(ioVar.m722c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m722c() && (iE4 = c2t.e(this.f163b, ioVar.f163b)) != 0) {
            return iE4;
        }
        int iCompareTo4 = Boolean.valueOf(m723d()).compareTo(Boolean.valueOf(ioVar.m723d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m723d() && (iE3 = c2t.e(this.f166c, ioVar.f166c)) != 0) {
            return iE3;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ioVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iE2 = c2t.e(this.f168d, ioVar.f168d)) != 0) {
            return iE2;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ioVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iB3 = c2t.b(this.f156a, ioVar.f156a)) != 0) {
            return iB3;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ioVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE = c2t.e(this.f169e, ioVar.f169e)) != 0) {
            return iE;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ioVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iB2 = c2t.b(this.f162b, ioVar.f162b)) != 0) {
            return iB2;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ioVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iB = c2t.b(this.f165c, ioVar.f165c)) != 0) {
            return iB;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ioVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iH3 = c2t.h(this.f160a, ioVar.f160a)) != 0) {
            return iH3;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ioVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iH2 = c2t.h(this.f164b, ioVar.f164b)) != 0) {
            return iH2;
        }
        int iCompareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ioVar.m()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m() && (iK = c2t.k(this.f161a, ioVar.f161a)) != 0) {
            return iK;
        }
        int iCompareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ioVar.n()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (!n() || (iH = c2t.h(this.f167c, ioVar.f167c)) == 0) {
            return 0;
        }
        return iH;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) throws jy {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                r2tVar.D();
                if (m720b()) {
                    m715a();
                    return;
                }
                throw new jy("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i2 = 0;
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f158a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 10) {
                        this.f157a = r2tVar.d();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f163b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f166c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f168d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 8) {
                        this.f156a = r2tVar.c();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f169e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 8) {
                        this.f162b = r2tVar.c();
                        c(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 8) {
                        this.f165c = r2tVar.c();
                        d(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 13) {
                        p2t p2tVarI = r2tVar.i();
                        this.f160a = new HashMap(p2tVarI.c * 2);
                        while (i2 < p2tVarI.c) {
                            this.f160a.put(r2tVar.e(), r2tVar.e());
                            i2++;
                        }
                        r2tVar.F();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 13) {
                        p2t p2tVarI2 = r2tVar.i();
                        this.f164b = new HashMap(p2tVarI2.c * 2);
                        while (i2 < p2tVarI2.c) {
                            this.f164b.put(r2tVar.e(), r2tVar.e());
                            i2++;
                        }
                        r2tVar.F();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 2) {
                        this.f161a = r2tVar.y();
                        e(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 13) {
                        p2t p2tVarI3 = r2tVar.i();
                        this.f167c = new HashMap(p2tVarI3.c * 2);
                        while (i2 < p2tVarI3.c) {
                            this.f167c.put(r2tVar.e(), r2tVar.e());
                            i2++;
                        }
                        r2tVar.F();
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
    public void m715a() throws jy {
        if (this.f158a != null) {
            return;
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
