package com.xiaomi.push;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
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
public class jb implements jm<jb, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f276a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f277a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ip f278a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f279a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f280a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f282a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f284b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f285b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f286b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f288c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f289c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f291d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f292e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f293f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f294g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f295h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f296i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public String f297j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public String f298k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public String f299l;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    public String f300m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    public String f301n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    public String f302o;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    public String f303p;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    public String f304q;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    public String f305r;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f275a = new v3t("XmPushActionRegistration");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14127a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14128b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 11, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", (byte) 11, 8);
    private static final l2t i = new l2t("", (byte) 11, 9);
    private static final l2t j = new l2t("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l2t f14129k = new l2t("", (byte) 11, 11);
    private static final l2t l = new l2t("", (byte) 11, 12);
    private static final l2t m = new l2t("", (byte) 8, 13);
    private static final l2t n = new l2t("", (byte) 8, 14);
    private static final l2t o = new l2t("", (byte) 11, 15);
    private static final l2t p = new l2t("", (byte) 11, 16);
    private static final l2t q = new l2t("", (byte) 11, 17);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final l2t f14130r = new l2t("", (byte) 11, 18);
    private static final l2t s = new l2t("", (byte) 8, 19);
    private static final l2t t = new l2t("", (byte) 8, 20);
    private static final l2t u = new l2t("", (byte) 2, 21);
    private static final l2t v = new l2t("", (byte) 10, 22);
    private static final l2t w = new l2t("", (byte) 10, 23);
    private static final l2t x = new l2t("", (byte) 11, 24);
    private static final l2t y = new l2t("", (byte) 11, 25);
    private static final l2t z = new l2t("", (byte) 2, 26);
    private static final l2t A = new l2t("", HMProSyncDataBaseProfile.DATA_TYPE_PAI, 100);
    private static final l2t B = new l2t("", (byte) 2, 101);
    private static final l2t C = new l2t("", (byte) 11, 102);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f281a = new BitSet(8);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f283a = true;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public boolean f290c = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f287b = false;

    public boolean A() {
        return this.f282a != null;
    }

    public boolean B() {
        return this.f281a.get(7);
    }

    public boolean C() {
        return this.f305r != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m773a() {
        return this.f280a != null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m775b() {
        return this.f279a != null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m776c() {
        return this.f286b != null;
    }

    public boolean d() {
        return this.f289c != null;
    }

    public boolean e() {
        return this.f291d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jb)) {
            return m774a((jb) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f292e != null;
    }

    public boolean g() {
        return this.f293f != null;
    }

    public boolean h() {
        return this.f294g != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f295h != null;
    }

    public boolean j() {
        return this.f296i != null;
    }

    public boolean k() {
        return this.f297j != null;
    }

    public boolean l() {
        return this.f298k != null;
    }

    public boolean m() {
        return this.f281a.get(0);
    }

    public boolean n() {
        return this.f281a.get(1);
    }

    public boolean o() {
        return this.f299l != null;
    }

    public boolean p() {
        return this.f300m != null;
    }

    public boolean q() {
        return this.f301n != null;
    }

    public boolean r() {
        return this.f302o != null;
    }

    public boolean s() {
        return this.f281a.get(2);
    }

    public boolean t() {
        return this.f278a != null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01be  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:121:0x0210  */
    /* JADX WARN: Code duplicated, block: B:124:0x0223  */
    /* JADX WARN: Code duplicated, block: B:126:0x022f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0233  */
    /* JADX WARN: Code duplicated, block: B:130:0x023c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0248  */
    /* JADX WARN: Code duplicated, block: B:133:0x024c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0255  */
    /* JADX WARN: Code duplicated, block: B:139:0x0268  */
    /* JADX WARN: Code duplicated, block: B:141:0x0274  */
    /* JADX WARN: Code duplicated, block: B:142:0x0278  */
    /* JADX WARN: Code duplicated, block: B:145:0x0281  */
    /* JADX WARN: Code duplicated, block: B:148:0x0294  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:73:0x012b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    /* JADX WARN: Code duplicated, block: B:82:0x015a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0166  */
    /* JADX WARN: Code duplicated, block: B:85:0x016a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183  */
    /* JADX WARN: Code duplicated, block: B:94:0x018c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0198  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public String toString() {
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        Map<String, String> map;
        String str5;
        String str6;
        ip ipVar;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        if (m773a()) {
            sb.append("debug:");
            String str18 = this.f280a;
            if (str18 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str18);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!m775b()) {
            if (!z2) {
            }
            sb.append("id:");
            str = this.f286b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(gbs.b(str));
            }
            sb.append(", ");
            sb.append("appId:");
            str2 = this.f289c;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            if (e()) {
                sb.append(", ");
                sb.append("appVersion:");
                str17 = this.f291d;
                if (str17 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str17);
                }
            }
            if (f()) {
                sb.append(", ");
                sb.append("packageName:");
                str16 = this.f292e;
                if (str16 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str16);
                }
            }
            sb.append(", ");
            sb.append("token:");
            str3 = this.f293f;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
            if (h()) {
                sb.append(", ");
                sb.append("deviceId:");
                str15 = this.f294g;
                if (str15 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str15);
                }
            }
            if (i()) {
                sb.append(", ");
                sb.append("aliasName:");
                str14 = this.f295h;
                if (str14 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str14);
                }
            }
            if (j()) {
                sb.append(", ");
                sb.append("sdkVersion:");
                str13 = this.f296i;
                if (str13 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str13);
                }
            }
            if (k()) {
                sb.append(", ");
                sb.append("regId:");
                str12 = this.f297j;
                if (str12 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str12);
                }
            }
            if (l()) {
                sb.append(", ");
                sb.append("pushSdkVersionName:");
                str11 = this.f298k;
                if (str11 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str11);
                }
            }
            if (m()) {
                sb.append(", ");
                sb.append("pushSdkVersionCode:");
                sb.append(this.f276a);
            }
            if (n()) {
                sb.append(", ");
                sb.append("appVersionCode:");
                sb.append(this.f284b);
            }
            if (o()) {
                sb.append(", ");
                sb.append("androidId:");
                str10 = this.f299l;
                if (str10 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str10);
                }
            }
            if (p()) {
                sb.append(", ");
                sb.append("imei:");
                str9 = this.f300m;
                if (str9 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str9);
                }
            }
            if (q()) {
                sb.append(", ");
                sb.append("serial:");
                str8 = this.f301n;
                if (str8 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str8);
                }
            }
            if (r()) {
                sb.append(", ");
                sb.append("imeiMd5:");
                str7 = this.f302o;
                if (str7 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str7);
                }
            }
            if (s()) {
                sb.append(", ");
                sb.append("spaceId:");
                sb.append(this.f288c);
            }
            if (t()) {
                sb.append(", ");
                sb.append("reason:");
                ipVar = this.f278a;
                if (ipVar == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(ipVar);
                }
            }
            if (u()) {
                sb.append(", ");
                sb.append("validateToken:");
                sb.append(this.f283a);
            }
            if (v()) {
                sb.append(", ");
                sb.append("miid:");
                sb.append(this.f277a);
            }
            if (w()) {
                sb.append(", ");
                sb.append("createdTs:");
                sb.append(this.f285b);
            }
            if (x()) {
                sb.append(", ");
                sb.append("subImei:");
                str6 = this.f303p;
                if (str6 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str6);
                }
            }
            if (y()) {
                sb.append(", ");
                sb.append("subImeiMd5:");
                str5 = this.f304q;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (z()) {
                sb.append(", ");
                sb.append("isHybridFrame:");
                sb.append(this.f287b);
            }
            if (A()) {
                sb.append(", ");
                sb.append("connectionAttrs:");
                map = this.f282a;
                if (map == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(map);
                }
            }
            if (B()) {
                sb.append(", ");
                sb.append("cleanOldRegInfo:");
                sb.append(this.f290c);
            }
            if (C()) {
                sb.append(", ");
                sb.append("oldRegId:");
                str4 = this.f305r;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            sb.append(")");
            return sb.toString();
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("target:");
        iq iqVar = this.f279a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f286b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(gbs.b(str));
        }
        sb.append(", ");
        sb.append("appId:");
        str2 = this.f289c;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        if (e()) {
            sb.append(", ");
            sb.append("appVersion:");
            str17 = this.f291d;
            if (str17 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str17);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            str16 = this.f292e;
            if (str16 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str16);
            }
        }
        sb.append(", ");
        sb.append("token:");
        str3 = this.f293f;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        if (h()) {
            sb.append(", ");
            sb.append("deviceId:");
            str15 = this.f294g;
            if (str15 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str15);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("aliasName:");
            str14 = this.f295h;
            if (str14 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str14);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            str13 = this.f296i;
            if (str13 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str13);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            str12 = this.f297j;
            if (str12 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str12);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            str11 = this.f298k;
            if (str11 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str11);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f276a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f284b);
        }
        if (o()) {
            sb.append(", ");
            sb.append("androidId:");
            str10 = this.f299l;
            if (str10 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str10);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("imei:");
            str9 = this.f300m;
            if (str9 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str9);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("serial:");
            str8 = this.f301n;
            if (str8 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str8);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            str7 = this.f302o;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.f288c);
        }
        if (t()) {
            sb.append(", ");
            sb.append("reason:");
            ipVar = this.f278a;
            if (ipVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(ipVar);
            }
        }
        if (u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.f283a);
        }
        if (v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f277a);
        }
        if (w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f285b);
        }
        if (x()) {
            sb.append(", ");
            sb.append("subImei:");
            str6 = this.f303p;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            str5 = this.f304q;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (z()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f287b);
        }
        if (A()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            map = this.f282a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        }
        if (B()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f290c);
        }
        if (C()) {
            sb.append(", ");
            sb.append("oldRegId:");
            str4 = this.f305r;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public boolean u() {
        return this.f281a.get(3);
    }

    public boolean v() {
        return this.f281a.get(4);
    }

    public boolean w() {
        return this.f281a.get(5);
    }

    public boolean x() {
        return this.f303p != null;
    }

    public boolean y() {
        return this.f304q != null;
    }

    public boolean z() {
        return this.f281a.get(6);
    }

    public String a() {
        return this.f286b;
    }

    public String b() {
        return this.f289c;
    }

    public jb c(String str) {
        this.f291d = str;
        return this;
    }

    public jb d(String str) {
        this.f292e = str;
        return this;
    }

    public jb e(String str) {
        this.f293f = str;
        return this;
    }

    public jb f(String str) {
        this.f294g = str;
        return this;
    }

    public jb g(String str) {
        this.f295h = str;
        return this;
    }

    public jb h(String str) {
        this.f298k = str;
        return this;
    }

    public jb i(String str) {
        this.f302o = str;
        return this;
    }

    public jb a(String str) {
        this.f286b = str;
        return this;
    }

    public jb b(String str) {
        this.f289c = str;
        return this;
    }

    public String c() {
        return this.f293f;
    }

    public void d(boolean z2) {
        this.f281a.set(3, z2);
    }

    public void e(boolean z2) {
        this.f281a.set(4, z2);
    }

    public void f(boolean z2) {
        this.f281a.set(5, z2);
    }

    public void g(boolean z2) {
        this.f281a.set(6, z2);
    }

    public void h(boolean z2) {
        this.f281a.set(7, z2);
    }

    public jb a(int i2) {
        this.f276a = i2;
        a(true);
        return this;
    }

    public jb b(int i2) {
        this.f284b = i2;
        b(true);
        return this;
    }

    public jb c(int i2) {
        this.f288c = i2;
        c(true);
        return this;
    }

    public void a(boolean z2) {
        this.f281a.set(0, z2);
    }

    public void b(boolean z2) {
        this.f281a.set(1, z2);
    }

    public void c(boolean z2) {
        this.f281a.set(2, z2);
    }

    public jb a(ip ipVar) {
        this.f278a = ipVar;
        return this;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m772a();
        r2tVar.v(f275a);
        if (this.f280a != null && m773a()) {
            r2tVar.s(f14127a);
            r2tVar.q(this.f280a);
            r2tVar.z();
        }
        if (this.f279a != null && m775b()) {
            r2tVar.s(f14128b);
            this.f279a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f286b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f286b);
            r2tVar.z();
        }
        if (this.f289c != null) {
            r2tVar.s(d);
            r2tVar.q(this.f289c);
            r2tVar.z();
        }
        if (this.f291d != null && e()) {
            r2tVar.s(e);
            r2tVar.q(this.f291d);
            r2tVar.z();
        }
        if (this.f292e != null && f()) {
            r2tVar.s(f);
            r2tVar.q(this.f292e);
            r2tVar.z();
        }
        if (this.f293f != null) {
            r2tVar.s(g);
            r2tVar.q(this.f293f);
            r2tVar.z();
        }
        if (this.f294g != null && h()) {
            r2tVar.s(h);
            r2tVar.q(this.f294g);
            r2tVar.z();
        }
        if (this.f295h != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f295h);
            r2tVar.z();
        }
        if (this.f296i != null && j()) {
            r2tVar.s(j);
            r2tVar.q(this.f296i);
            r2tVar.z();
        }
        if (this.f297j != null && k()) {
            r2tVar.s(f14129k);
            r2tVar.q(this.f297j);
            r2tVar.z();
        }
        if (this.f298k != null && l()) {
            r2tVar.s(l);
            r2tVar.q(this.f298k);
            r2tVar.z();
        }
        if (m()) {
            r2tVar.s(m);
            r2tVar.o(this.f276a);
            r2tVar.z();
        }
        if (n()) {
            r2tVar.s(n);
            r2tVar.o(this.f284b);
            r2tVar.z();
        }
        if (this.f299l != null && o()) {
            r2tVar.s(o);
            r2tVar.q(this.f299l);
            r2tVar.z();
        }
        if (this.f300m != null && p()) {
            r2tVar.s(p);
            r2tVar.q(this.f300m);
            r2tVar.z();
        }
        if (this.f301n != null && q()) {
            r2tVar.s(q);
            r2tVar.q(this.f301n);
            r2tVar.z();
        }
        if (this.f302o != null && r()) {
            r2tVar.s(f14130r);
            r2tVar.q(this.f302o);
            r2tVar.z();
        }
        if (s()) {
            r2tVar.s(s);
            r2tVar.o(this.f288c);
            r2tVar.z();
        }
        if (this.f278a != null && t()) {
            r2tVar.s(t);
            r2tVar.o(this.f278a.a());
            r2tVar.z();
        }
        if (u()) {
            r2tVar.s(u);
            r2tVar.x(this.f283a);
            r2tVar.z();
        }
        if (v()) {
            r2tVar.s(v);
            r2tVar.p(this.f277a);
            r2tVar.z();
        }
        if (w()) {
            r2tVar.s(w);
            r2tVar.p(this.f285b);
            r2tVar.z();
        }
        if (this.f303p != null && x()) {
            r2tVar.s(x);
            r2tVar.q(this.f303p);
            r2tVar.z();
        }
        if (this.f304q != null && y()) {
            r2tVar.s(y);
            r2tVar.q(this.f304q);
            r2tVar.z();
        }
        if (z()) {
            r2tVar.s(z);
            r2tVar.x(this.f287b);
            r2tVar.z();
        }
        if (this.f282a != null && A()) {
            r2tVar.s(A);
            r2tVar.u(new p2t((byte) 11, (byte) 11, this.f282a.size()));
            for (Map.Entry<String, String> entry : this.f282a.entrySet()) {
                r2tVar.q(entry.getKey());
                r2tVar.q(entry.getValue());
            }
            r2tVar.B();
            r2tVar.z();
        }
        if (B()) {
            r2tVar.s(B);
            r2tVar.x(this.f290c);
            r2tVar.z();
        }
        if (this.f305r != null && C()) {
            r2tVar.s(C);
            r2tVar.q(this.f305r);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m774a(jb jbVar) {
        if (jbVar == null) {
            return false;
        }
        boolean zM773a = m773a();
        boolean zM773a2 = jbVar.m773a();
        if ((zM773a || zM773a2) && !(zM773a && zM773a2 && this.f280a.equals(jbVar.f280a))) {
            return false;
        }
        boolean zM775b = m775b();
        boolean zM775b2 = jbVar.m775b();
        if ((zM775b || zM775b2) && !(zM775b && zM775b2 && this.f279a.m725a(jbVar.f279a))) {
            return false;
        }
        boolean zM776c = m776c();
        boolean zM776c2 = jbVar.m776c();
        if ((zM776c || zM776c2) && !(zM776c && zM776c2 && this.f286b.equals(jbVar.f286b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = jbVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.f289c.equals(jbVar.f289c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jbVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f291d.equals(jbVar.f291d))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = jbVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f292e.equals(jbVar.f292e))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jbVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f293f.equals(jbVar.f293f))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jbVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f294g.equals(jbVar.f294g))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jbVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f295h.equals(jbVar.f295h))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jbVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f296i.equals(jbVar.f296i))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jbVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f297j.equals(jbVar.f297j))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jbVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f298k.equals(jbVar.f298k))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = jbVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f276a == jbVar.f276a)) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = jbVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f284b == jbVar.f284b)) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = jbVar.o();
        if ((zO || zO2) && !(zO && zO2 && this.f299l.equals(jbVar.f299l))) {
            return false;
        }
        boolean zP = p();
        boolean zP2 = jbVar.p();
        if ((zP || zP2) && !(zP && zP2 && this.f300m.equals(jbVar.f300m))) {
            return false;
        }
        boolean zQ = q();
        boolean zQ2 = jbVar.q();
        if ((zQ || zQ2) && !(zQ && zQ2 && this.f301n.equals(jbVar.f301n))) {
            return false;
        }
        boolean zR = r();
        boolean zR2 = jbVar.r();
        if ((zR || zR2) && !(zR && zR2 && this.f302o.equals(jbVar.f302o))) {
            return false;
        }
        boolean zS = s();
        boolean zS2 = jbVar.s();
        if ((zS || zS2) && !(zS && zS2 && this.f288c == jbVar.f288c)) {
            return false;
        }
        boolean zT = t();
        boolean zT2 = jbVar.t();
        if ((zT || zT2) && !(zT && zT2 && this.f278a.equals(jbVar.f278a))) {
            return false;
        }
        boolean zU = u();
        boolean zU2 = jbVar.u();
        if ((zU || zU2) && !(zU && zU2 && this.f283a == jbVar.f283a)) {
            return false;
        }
        boolean zV = v();
        boolean zV2 = jbVar.v();
        if ((zV || zV2) && !(zV && zV2 && this.f277a == jbVar.f277a)) {
            return false;
        }
        boolean zW = w();
        boolean zW2 = jbVar.w();
        if ((zW || zW2) && !(zW && zW2 && this.f285b == jbVar.f285b)) {
            return false;
        }
        boolean zX = x();
        boolean zX2 = jbVar.x();
        if ((zX || zX2) && !(zX && zX2 && this.f303p.equals(jbVar.f303p))) {
            return false;
        }
        boolean zY = y();
        boolean zY2 = jbVar.y();
        if ((zY || zY2) && !(zY && zY2 && this.f304q.equals(jbVar.f304q))) {
            return false;
        }
        boolean z2 = z();
        boolean z3 = jbVar.z();
        if ((z2 || z3) && !(z2 && z3 && this.f287b == jbVar.f287b)) {
            return false;
        }
        boolean zA = A();
        boolean zA2 = jbVar.A();
        if ((zA || zA2) && !(zA && zA2 && this.f282a.equals(jbVar.f282a))) {
            return false;
        }
        boolean zB = B();
        boolean zB2 = jbVar.B();
        if ((zB || zB2) && !(zB && zB2 && this.f290c == jbVar.f290c)) {
            return false;
        }
        boolean zC = C();
        boolean zC2 = jbVar.C();
        if (zC || zC2) {
            return zC && zC2 && this.f305r.equals(jbVar.f305r);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jb jbVar) {
        int iE;
        int iK;
        int iH;
        int iK2;
        int iE2;
        int iE3;
        int iC;
        int iC2;
        int iK3;
        int iD;
        int iB;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iB2;
        int iB3;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        int iE15;
        int iE16;
        int iE17;
        int iD2;
        int iE18;
        if (!getClass().equals(jbVar.getClass())) {
            return getClass().getName().compareTo(jbVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m773a()).compareTo(Boolean.valueOf(jbVar.m773a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m773a() && (iE18 = c2t.e(this.f280a, jbVar.f280a)) != 0) {
            return iE18;
        }
        int iCompareTo2 = Boolean.valueOf(m775b()).compareTo(Boolean.valueOf(jbVar.m775b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m775b() && (iD2 = c2t.d(this.f279a, jbVar.f279a)) != 0) {
            return iD2;
        }
        int iCompareTo3 = Boolean.valueOf(m776c()).compareTo(Boolean.valueOf(jbVar.m776c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m776c() && (iE17 = c2t.e(this.f286b, jbVar.f286b)) != 0) {
            return iE17;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jbVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iE16 = c2t.e(this.f289c, jbVar.f289c)) != 0) {
            return iE16;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jbVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iE15 = c2t.e(this.f291d, jbVar.f291d)) != 0) {
            return iE15;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jbVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iE14 = c2t.e(this.f292e, jbVar.f292e)) != 0) {
            return iE14;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jbVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE13 = c2t.e(this.f293f, jbVar.f293f)) != 0) {
            return iE13;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jbVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iE12 = c2t.e(this.f294g, jbVar.f294g)) != 0) {
            return iE12;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jbVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iE11 = c2t.e(this.f295h, jbVar.f295h)) != 0) {
            return iE11;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jbVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iE10 = c2t.e(this.f296i, jbVar.f296i)) != 0) {
            return iE10;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jbVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iE9 = c2t.e(this.f297j, jbVar.f297j)) != 0) {
            return iE9;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jbVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iE8 = c2t.e(this.f298k, jbVar.f298k)) != 0) {
            return iE8;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jbVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iB3 = c2t.b(this.f276a, jbVar.f276a)) != 0) {
            return iB3;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jbVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iB2 = c2t.b(this.f284b, jbVar.f284b)) != 0) {
            return iB2;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jbVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (o() && (iE7 = c2t.e(this.f299l, jbVar.f299l)) != 0) {
            return iE7;
        }
        int iCompareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(jbVar.p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (p() && (iE6 = c2t.e(this.f300m, jbVar.f300m)) != 0) {
            return iE6;
        }
        int iCompareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(jbVar.q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (q() && (iE5 = c2t.e(this.f301n, jbVar.f301n)) != 0) {
            return iE5;
        }
        int iCompareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(jbVar.r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (r() && (iE4 = c2t.e(this.f302o, jbVar.f302o)) != 0) {
            return iE4;
        }
        int iCompareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(jbVar.s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (s() && (iB = c2t.b(this.f288c, jbVar.f288c)) != 0) {
            return iB;
        }
        int iCompareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(jbVar.t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (t() && (iD = c2t.d(this.f278a, jbVar.f278a)) != 0) {
            return iD;
        }
        int iCompareTo21 = Boolean.valueOf(u()).compareTo(Boolean.valueOf(jbVar.u()));
        if (iCompareTo21 != 0) {
            return iCompareTo21;
        }
        if (u() && (iK3 = c2t.k(this.f283a, jbVar.f283a)) != 0) {
            return iK3;
        }
        int iCompareTo22 = Boolean.valueOf(v()).compareTo(Boolean.valueOf(jbVar.v()));
        if (iCompareTo22 != 0) {
            return iCompareTo22;
        }
        if (v() && (iC2 = c2t.c(this.f277a, jbVar.f277a)) != 0) {
            return iC2;
        }
        int iCompareTo23 = Boolean.valueOf(w()).compareTo(Boolean.valueOf(jbVar.w()));
        if (iCompareTo23 != 0) {
            return iCompareTo23;
        }
        if (w() && (iC = c2t.c(this.f285b, jbVar.f285b)) != 0) {
            return iC;
        }
        int iCompareTo24 = Boolean.valueOf(x()).compareTo(Boolean.valueOf(jbVar.x()));
        if (iCompareTo24 != 0) {
            return iCompareTo24;
        }
        if (x() && (iE3 = c2t.e(this.f303p, jbVar.f303p)) != 0) {
            return iE3;
        }
        int iCompareTo25 = Boolean.valueOf(y()).compareTo(Boolean.valueOf(jbVar.y()));
        if (iCompareTo25 != 0) {
            return iCompareTo25;
        }
        if (y() && (iE2 = c2t.e(this.f304q, jbVar.f304q)) != 0) {
            return iE2;
        }
        int iCompareTo26 = Boolean.valueOf(z()).compareTo(Boolean.valueOf(jbVar.z()));
        if (iCompareTo26 != 0) {
            return iCompareTo26;
        }
        if (z() && (iK2 = c2t.k(this.f287b, jbVar.f287b)) != 0) {
            return iK2;
        }
        int iCompareTo27 = Boolean.valueOf(A()).compareTo(Boolean.valueOf(jbVar.A()));
        if (iCompareTo27 != 0) {
            return iCompareTo27;
        }
        if (A() && (iH = c2t.h(this.f282a, jbVar.f282a)) != 0) {
            return iH;
        }
        int iCompareTo28 = Boolean.valueOf(B()).compareTo(Boolean.valueOf(jbVar.B()));
        if (iCompareTo28 != 0) {
            return iCompareTo28;
        }
        if (B() && (iK = c2t.k(this.f290c, jbVar.f290c)) != 0) {
            return iK;
        }
        int iCompareTo29 = Boolean.valueOf(C()).compareTo(Boolean.valueOf(jbVar.C()));
        if (iCompareTo29 != 0) {
            return iCompareTo29;
        }
        if (!C() || (iE = c2t.e(this.f305r, jbVar.f305r)) == 0) {
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
                m772a();
                return;
            }
            short s2 = l2tVarG.c;
            switch (s2) {
                case 1:
                    if (b2 == 11) {
                        this.f280a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f279a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f286b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f289c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f291d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f292e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f293f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f294g = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f295h = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f296i = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f297j = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f298k = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 8) {
                        this.f276a = r2tVar.c();
                        a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 14:
                    if (b2 == 8) {
                        this.f284b = r2tVar.c();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 15:
                    if (b2 == 11) {
                        this.f299l = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 16:
                    if (b2 == 11) {
                        this.f300m = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 17:
                    if (b2 == 11) {
                        this.f301n = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 18:
                    if (b2 == 11) {
                        this.f302o = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 19:
                    if (b2 == 8) {
                        this.f288c = r2tVar.c();
                        c(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 20:
                    if (b2 == 8) {
                        this.f278a = ip.a(r2tVar.c());
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 21:
                    if (b2 == 2) {
                        this.f283a = r2tVar.y();
                        d(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 22:
                    if (b2 == 10) {
                        this.f277a = r2tVar.d();
                        e(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 23:
                    if (b2 == 10) {
                        this.f285b = r2tVar.d();
                        f(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 24:
                    if (b2 == 11) {
                        this.f303p = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 25:
                    if (b2 == 11) {
                        this.f304q = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 26:
                    if (b2 == 2) {
                        this.f287b = r2tVar.y();
                        g(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                default:
                    switch (s2) {
                        case 100:
                            if (b2 == 13) {
                                p2t p2tVarI = r2tVar.i();
                                this.f282a = new HashMap(p2tVarI.c * 2);
                                for (int i2 = 0; i2 < p2tVarI.c; i2++) {
                                    this.f282a.put(r2tVar.e(), r2tVar.e());
                                }
                                r2tVar.F();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 101:
                            if (b2 == 2) {
                                this.f290c = r2tVar.y();
                                h(true);
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        case 102:
                            if (b2 == 11) {
                                this.f305r = r2tVar.e();
                            } else {
                                m3t.a(r2tVar, b2);
                            }
                            break;
                        default:
                            m3t.a(r2tVar, b2);
                            break;
                    }
                    break;
            }
            r2tVar.E();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m772a() throws jy {
        if (this.f286b != null) {
            if (this.f289c != null) {
                if (this.f293f != null) {
                    return;
                }
                throw new jy("Required field 'token' was not present! Struct: " + toString());
            }
            throw new jy("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
