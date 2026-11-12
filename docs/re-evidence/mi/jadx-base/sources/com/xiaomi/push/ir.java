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
public class ir implements jm<ir, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f181a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f182a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f183a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public je f184a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f185a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f187a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public short f188a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f190b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public short f191b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f192c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f193d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f194e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f195f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f196g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f197h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f198i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public String f199j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public String f200k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public String f201l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f180a = new v3t("XmPushActionAckMessage");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14105a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14106b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 10, 5);
    private static final l2t f = new l2t("", (byte) 11, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 8);
    private static final l2t i = new l2t("", (byte) 11, 9);
    private static final l2t j = new l2t("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l2t f14107k = new l2t("", (byte) 2, 11);
    private static final l2t l = new l2t("", (byte) 11, 12);
    private static final l2t m = new l2t("", (byte) 11, 13);
    private static final l2t n = new l2t("", (byte) 11, 14);
    private static final l2t o = new l2t("", (byte) 6, 15);
    private static final l2t p = new l2t("", (byte) 6, 16);
    private static final l2t q = new l2t("", (byte) 11, 20);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final l2t f14108r = new l2t("", (byte) 11, 21);
    private static final l2t s = new l2t("", (byte) 8, 22);
    private static final l2t t = new l2t("", HMProSyncDataBaseProfile.DATA_TYPE_PAI, 23);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f186a = new BitSet(5);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f189a = false;

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m726a() {
        return this.f185a != null;
    }

    public boolean b() {
        return this.f183a != null;
    }

    public boolean c() {
        return this.f190b != null;
    }

    public boolean d() {
        return this.f192c != null;
    }

    public boolean e() {
        return this.f186a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ir)) {
            return m727a((ir) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f193d != null;
    }

    public boolean g() {
        return this.f194e != null;
    }

    public boolean h() {
        return this.f184a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f195f != null;
    }

    public boolean j() {
        return this.f196g != null;
    }

    public boolean k() {
        return this.f186a.get(1);
    }

    public boolean l() {
        return this.f197h != null;
    }

    public boolean m() {
        return this.f198i != null;
    }

    public boolean n() {
        return this.f199j != null;
    }

    public boolean o() {
        return this.f186a.get(2);
    }

    public boolean p() {
        return this.f186a.get(3);
    }

    public boolean q() {
        return this.f200k != null;
    }

    public boolean r() {
        return this.f201l != null;
    }

    public boolean s() {
        return this.f186a.get(4);
    }

    public boolean t() {
        return this.f187a != null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d1  */
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
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:72:0x0134  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0149  */
    /* JADX WARN: Code duplicated, block: B:78:0x014d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0156  */
    /* JADX WARN: Code duplicated, block: B:84:0x0169  */
    /* JADX WARN: Code duplicated, block: B:87:0x017c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:0x018c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0195  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    public String toString() {
        boolean z;
        String str;
        String str2;
        Map<String, String> map;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        je jeVar;
        String str10;
        String str11;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        if (m726a()) {
            sb.append("debug:");
            String str12 = this.f185a;
            if (str12 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str12);
            }
            z = false;
        } else {
            z = true;
        }
        if (!b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f190b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            sb.append(", ");
            sb.append("appId:");
            str2 = this.f192c;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            sb.append(", ");
            sb.append("messageTs:");
            sb.append(this.f182a);
            if (f()) {
                sb.append(", ");
                sb.append("topic:");
                str11 = this.f193d;
                if (str11 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str11);
                }
            }
            if (g()) {
                sb.append(", ");
                sb.append("aliasName:");
                str10 = this.f194e;
                if (str10 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str10);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("request:");
                jeVar = this.f184a;
                if (jeVar == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(jeVar);
                }
            }
            if (i()) {
                sb.append(", ");
                sb.append("packageName:");
                str9 = this.f195f;
                if (str9 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str9);
                }
            }
            if (j()) {
                sb.append(", ");
                sb.append("category:");
                str8 = this.f196g;
                if (str8 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str8);
                }
            }
            if (k()) {
                sb.append(", ");
                sb.append("isOnline:");
                sb.append(this.f189a);
            }
            if (l()) {
                sb.append(", ");
                sb.append("regId:");
                str7 = this.f197h;
                if (str7 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str7);
                }
            }
            if (m()) {
                sb.append(", ");
                sb.append("callbackUrl:");
                str6 = this.f198i;
                if (str6 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str6);
                }
            }
            if (n()) {
                sb.append(", ");
                sb.append("userAccount:");
                str5 = this.f199j;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (o()) {
                sb.append(", ");
                sb.append("deviceStatus:");
                sb.append((int) this.f188a);
            }
            if (p()) {
                sb.append(", ");
                sb.append("geoMsgStatus:");
                sb.append((int) this.f191b);
            }
            if (q()) {
                sb.append(", ");
                sb.append("imeiMd5:");
                str4 = this.f200k;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (r()) {
                sb.append(", ");
                sb.append("deviceId:");
                str3 = this.f201l;
                if (str3 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str3);
                }
            }
            if (s()) {
                sb.append(", ");
                sb.append("passThrough:");
                sb.append(this.f181a);
            }
            if (t()) {
                sb.append(", ");
                sb.append("extra:");
                map = this.f187a;
                if (map == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(map);
                }
            }
            sb.append(")");
            return sb.toString();
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("target:");
        iq iqVar = this.f183a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f190b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        str2 = this.f192c;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f182a);
        if (f()) {
            sb.append(", ");
            sb.append("topic:");
            str11 = this.f193d;
            if (str11 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str11);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            str10 = this.f194e;
            if (str10 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str10);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("request:");
            jeVar = this.f184a;
            if (jeVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(jeVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            str9 = this.f195f;
            if (str9 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str9);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            str8 = this.f196g;
            if (str8 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str8);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f189a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("regId:");
            str7 = this.f197h;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            str6 = this.f198i;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("userAccount:");
            str5 = this.f199j;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f188a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f191b);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            str4 = this.f200k;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            str3 = this.f201l;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f181a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("extra:");
            map = this.f187a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public ir a(String str) {
        this.f190b = str;
        return this;
    }

    public ir b(String str) {
        this.f192c = str;
        return this;
    }

    public ir c(String str) {
        this.f193d = str;
        return this;
    }

    public ir d(String str) {
        this.f194e = str;
        return this;
    }

    public void e(boolean z) {
        this.f186a.set(4, z);
    }

    public ir a(long j2) {
        this.f182a = j2;
        a(true);
        return this;
    }

    public void b(boolean z) {
        this.f186a.set(1, z);
    }

    public void c(boolean z) {
        this.f186a.set(2, z);
    }

    public void d(boolean z) {
        this.f186a.set(3, z);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        a();
        r2tVar.v(f180a);
        if (this.f185a != null && m726a()) {
            r2tVar.s(f14105a);
            r2tVar.q(this.f185a);
            r2tVar.z();
        }
        if (this.f183a != null && b()) {
            r2tVar.s(f14106b);
            this.f183a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f190b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f190b);
            r2tVar.z();
        }
        if (this.f192c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f192c);
            r2tVar.z();
        }
        r2tVar.s(e);
        r2tVar.p(this.f182a);
        r2tVar.z();
        if (this.f193d != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f193d);
            r2tVar.z();
        }
        if (this.f194e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f194e);
            r2tVar.z();
        }
        if (this.f184a != null && h()) {
            r2tVar.s(h);
            this.f184a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f195f != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f195f);
            r2tVar.z();
        }
        if (this.f196g != null && j()) {
            r2tVar.s(j);
            r2tVar.q(this.f196g);
            r2tVar.z();
        }
        if (k()) {
            r2tVar.s(f14107k);
            r2tVar.x(this.f189a);
            r2tVar.z();
        }
        if (this.f197h != null && l()) {
            r2tVar.s(l);
            r2tVar.q(this.f197h);
            r2tVar.z();
        }
        if (this.f198i != null && m()) {
            r2tVar.s(m);
            r2tVar.q(this.f198i);
            r2tVar.z();
        }
        if (this.f199j != null && n()) {
            r2tVar.s(n);
            r2tVar.q(this.f199j);
            r2tVar.z();
        }
        if (o()) {
            r2tVar.s(o);
            r2tVar.w(this.f188a);
            r2tVar.z();
        }
        if (p()) {
            r2tVar.s(p);
            r2tVar.w(this.f191b);
            r2tVar.z();
        }
        if (this.f200k != null && q()) {
            r2tVar.s(q);
            r2tVar.q(this.f200k);
            r2tVar.z();
        }
        if (this.f201l != null && r()) {
            r2tVar.s(f14108r);
            r2tVar.q(this.f201l);
            r2tVar.z();
        }
        if (s()) {
            r2tVar.s(s);
            r2tVar.o(this.f181a);
            r2tVar.z();
        }
        if (this.f187a != null && t()) {
            r2tVar.s(t);
            r2tVar.u(new p2t((byte) 11, (byte) 11, this.f187a.size()));
            for (Map.Entry<String, String> entry : this.f187a.entrySet()) {
                r2tVar.q(entry.getKey());
                r2tVar.q(entry.getValue());
            }
            r2tVar.B();
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    public void a(boolean z) {
        this.f186a.set(0, z);
    }

    public ir a(short s2) {
        this.f188a = s2;
        c(true);
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m727a(ir irVar) {
        if (irVar == null) {
            return false;
        }
        boolean zM726a = m726a();
        boolean zM726a2 = irVar.m726a();
        if ((zM726a || zM726a2) && !(zM726a && zM726a2 && this.f185a.equals(irVar.f185a))) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = irVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f183a.m725a(irVar.f183a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = irVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.f190b.equals(irVar.f190b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = irVar.d();
        if (((zD || zD2) && !(zD && zD2 && this.f192c.equals(irVar.f192c))) || this.f182a != irVar.f182a) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = irVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f193d.equals(irVar.f193d))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = irVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f194e.equals(irVar.f194e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = irVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f184a.m789a(irVar.f184a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = irVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f195f.equals(irVar.f195f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = irVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f196g.equals(irVar.f196g))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = irVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f189a == irVar.f189a)) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = irVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f197h.equals(irVar.f197h))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = irVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f198i.equals(irVar.f198i))) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = irVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f199j.equals(irVar.f199j))) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = irVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.f188a == irVar.f188a)) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = irVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.f191b == irVar.f191b)) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = irVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.f200k.equals(irVar.f200k))) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = irVar.r();
        if ((zR || zR2) && !(zR && zR2 && this.f201l.equals(irVar.f201l))) {
            return false;
        }
        boolean zS = s();
        boolean zS2 = irVar.s();
        if ((zS || zS2) && !(zS && zS2 && this.f181a == irVar.f181a)) {
            return false;
        }
        boolean zT = t();
        boolean zT2 = irVar.t();
        if (zT || zT2) {
            return zT && zT2 && this.f187a.equals(irVar.f187a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ir irVar) {
        int iH;
        int iB;
        int iE;
        int iE2;
        int iJ;
        int iJ2;
        int iE3;
        int iE4;
        int iE5;
        int iK;
        int iE6;
        int iE7;
        int iD;
        int iE8;
        int iE9;
        int iC;
        int iE10;
        int iE11;
        int iD2;
        int iE12;
        if (!getClass().equals(irVar.getClass())) {
            return getClass().getName().compareTo(irVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m726a()).compareTo(Boolean.valueOf(irVar.m726a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m726a() && (iE12 = c2t.e(this.f185a, irVar.f185a)) != 0) {
            return iE12;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(irVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iD2 = c2t.d(this.f183a, irVar.f183a)) != 0) {
            return iD2;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(irVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iE11 = c2t.e(this.f190b, irVar.f190b)) != 0) {
            return iE11;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(irVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE10 = c2t.e(this.f192c, irVar.f192c)) != 0) {
            return iE10;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(irVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iC = c2t.c(this.f182a, irVar.f182a)) != 0) {
            return iC;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(irVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE9 = c2t.e(this.f193d, irVar.f193d)) != 0) {
            return iE9;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(irVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE8 = c2t.e(this.f194e, irVar.f194e)) != 0) {
            return iE8;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(irVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iD = c2t.d(this.f184a, irVar.f184a)) != 0) {
            return iD;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(irVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iE7 = c2t.e(this.f195f, irVar.f195f)) != 0) {
            return iE7;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(irVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iE6 = c2t.e(this.f196g, irVar.f196g)) != 0) {
            return iE6;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(irVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iK = c2t.k(this.f189a, irVar.f189a)) != 0) {
            return iK;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(irVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iE5 = c2t.e(this.f197h, irVar.f197h)) != 0) {
            return iE5;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(irVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iE4 = c2t.e(this.f198i, irVar.f198i)) != 0) {
            return iE4;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(irVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iE3 = c2t.e(this.f199j, irVar.f199j)) != 0) {
            return iE3;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(irVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iJ2 = c2t.j(this.f188a, irVar.f188a)) != 0) {
            return iJ2;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(irVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iJ = c2t.j(this.f191b, irVar.f191b)) != 0) {
            return iJ;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(irVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iE2 = c2t.e(this.f200k, irVar.f200k)) != 0) {
            return iE2;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(irVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (r() && (iE = c2t.e(this.f201l, irVar.f201l)) != 0) {
            return iE;
        }
        int iCompareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(irVar.s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (s() && (iB = c2t.b(this.f181a, irVar.f181a)) != 0) {
            return iB;
        }
        int iCompareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(irVar.t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!t() || (iH = c2t.h(this.f187a, irVar.f187a)) == 0) {
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
                if (e()) {
                    a();
                    return;
                }
                throw new jy("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f185a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f183a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f190b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f192c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 10) {
                        this.f182a = r2tVar.d();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f193d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f194e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 12) {
                        je jeVar = new je();
                        this.f184a = jeVar;
                        jeVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f195f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f196g = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 2) {
                        this.f189a = r2tVar.y();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f197h = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 11) {
                        this.f198i = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 14:
                    if (b2 == 11) {
                        this.f199j = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 15:
                    if (b2 == 6) {
                        this.f188a = r2tVar.l();
                        c(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 16:
                    if (b2 == 6) {
                        this.f191b = r2tVar.l();
                        d(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 17:
                case 18:
                case 19:
                default:
                    m3t.a(r2tVar, b2);
                    break;
                case 20:
                    if (b2 == 11) {
                        this.f200k = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 21:
                    if (b2 == 11) {
                        this.f201l = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 22:
                    if (b2 == 8) {
                        this.f181a = r2tVar.c();
                        e(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 23:
                    if (b2 == 13) {
                        p2t p2tVarI = r2tVar.i();
                        this.f187a = new HashMap(p2tVarI.c * 2);
                        for (int i2 = 0; i2 < p2tVarI.c; i2++) {
                            this.f187a.put(r2tVar.e(), r2tVar.e());
                        }
                        r2tVar.F();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    public void a() throws jy {
        if (this.f190b != null) {
            if (this.f192c != null) {
                return;
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
