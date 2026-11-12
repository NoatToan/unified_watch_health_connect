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
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class ja implements jm<ja, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f259a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f260a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f261a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ByteBuffer f262a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f263a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f264a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f265a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f266b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f267b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public String f268c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public String f269d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public String f270e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public String f271f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public String f272g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public String f273h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public String f274i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f258a = new v3t("XmPushActionNotification");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14124a = new l2t("", (byte) 11, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14125b = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2);
    private static final l2t c = new l2t("", (byte) 11, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 2, 6);
    private static final l2t g = new l2t("", (byte) 11, 7);
    private static final l2t h = new l2t("", HMProSyncDataBaseProfile.DATA_TYPE_PAI, 8);
    private static final l2t i = new l2t("", (byte) 11, 9);
    private static final l2t j = new l2t("", (byte) 11, 10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l2t f14126k = new l2t("", (byte) 11, 12);
    private static final l2t l = new l2t("", (byte) 11, 13);
    private static final l2t m = new l2t("", (byte) 11, 14);
    private static final l2t n = new l2t("", (byte) 10, 15);
    private static final l2t o = new l2t("", (byte) 2, 20);

    public ja() {
        this.f263a = new BitSet(3);
        this.f265a = true;
        this.f267b = false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m766a() {
        return this.f261a != null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m769b() {
        return this.f260a != null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m770c() {
        return this.f266b != null;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m771d() {
        return this.f268c != null;
    }

    public boolean e() {
        return this.f269d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ja)) {
            return m767a((ja) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f263a.get(0);
    }

    public boolean g() {
        return this.f270e != null;
    }

    public boolean h() {
        return this.f264a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f271f != null;
    }

    public boolean j() {
        return this.f272g != null;
    }

    public boolean k() {
        return this.f273h != null;
    }

    public boolean l() {
        return this.f274i != null;
    }

    public boolean m() {
        return this.f262a != null;
    }

    public boolean n() {
        return this.f263a.get(1);
    }

    public boolean o() {
        return this.f263a.get(2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:71:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x013c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0140  */
    /* JADX WARN: Code duplicated, block: B:80:0x0149  */
    /* JADX WARN: Code duplicated, block: B:83:0x015c  */
    public String toString() {
        boolean z;
        String str;
        ByteBuffer byteBuffer;
        String str2;
        String str3;
        String str4;
        String str5;
        Map<String, String> map;
        String str6;
        String str7;
        String str8;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        if (m766a()) {
            sb.append("debug:");
            String str9 = this.f261a;
            if (str9 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str9);
            }
            z = false;
        } else {
            z = true;
        }
        if (!m769b()) {
            if (!z) {
            }
            sb.append("id:");
            str = this.f266b;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            if (m771d()) {
                sb.append(", ");
                sb.append("appId:");
                str8 = this.f268c;
                if (str8 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str8);
                }
            }
            if (e()) {
                sb.append(", ");
                sb.append("type:");
                str7 = this.f269d;
                if (str7 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str7);
                }
            }
            sb.append(", ");
            sb.append("requireAck:");
            sb.append(this.f265a);
            if (g()) {
                sb.append(", ");
                sb.append("payload:");
                str6 = this.f270e;
                if (str6 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str6);
                }
            }
            if (h()) {
                sb.append(", ");
                sb.append("extra:");
                map = this.f264a;
                if (map == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(map);
                }
            }
            if (i()) {
                sb.append(", ");
                sb.append("packageName:");
                str5 = this.f271f;
                if (str5 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str5);
                }
            }
            if (j()) {
                sb.append(", ");
                sb.append("category:");
                str4 = this.f272g;
                if (str4 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str4);
                }
            }
            if (k()) {
                sb.append(", ");
                sb.append("regId:");
                str3 = this.f273h;
                if (str3 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str3);
                }
            }
            if (l()) {
                sb.append(", ");
                sb.append("aliasName:");
                str2 = this.f274i;
                if (str2 == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    sb.append(str2);
                }
            }
            if (m()) {
                sb.append(", ");
                sb.append("binaryExtra:");
                byteBuffer = this.f262a;
                if (byteBuffer == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    c2t.o(byteBuffer, sb);
                }
            }
            if (n()) {
                sb.append(", ");
                sb.append("createdTs:");
                sb.append(this.f259a);
            }
            if (o()) {
                sb.append(", ");
                sb.append("alreadyLogClickInXmq:");
                sb.append(this.f267b);
            }
            sb.append(")");
            return sb.toString();
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("target:");
        iq iqVar = this.f260a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        sb.append(", ");
        sb.append("id:");
        str = this.f266b;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (m771d()) {
            sb.append(", ");
            sb.append("appId:");
            str8 = this.f268c;
            if (str8 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str8);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            str7 = this.f269d;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f265a);
        if (g()) {
            sb.append(", ");
            sb.append("payload:");
            str6 = this.f270e;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            map = this.f264a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            str5 = this.f271f;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            str4 = this.f272g;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            str3 = this.f273h;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("aliasName:");
            str2 = this.f274i;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            byteBuffer = this.f262a;
            if (byteBuffer == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                c2t.o(byteBuffer, sb);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f259a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f267b);
        }
        sb.append(")");
        return sb.toString();
    }

    public iq a() {
        return this.f260a;
    }

    public String b() {
        return this.f268c;
    }

    public String c() {
        return this.f269d;
    }

    public String d() {
        return this.f271f;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m762a() {
        return this.f266b;
    }

    public ja b(String str) {
        this.f268c = str;
        return this;
    }

    public ja c(String str) {
        this.f269d = str;
        return this;
    }

    public ja d(String str) {
        this.f271f = str;
        return this;
    }

    public ja a(String str) {
        this.f266b = str;
        return this;
    }

    public void b(boolean z) {
        this.f263a.set(1, z);
    }

    public void c(boolean z) {
        this.f263a.set(2, z);
    }

    public ja(String str, boolean z) {
        this();
        this.f266b = str;
        this.f265a = z;
        m765a(true);
    }

    public ja a(boolean z) {
        this.f265a = z;
        m765a(true);
        return this;
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m764a();
        r2tVar.v(f258a);
        if (this.f261a != null && m766a()) {
            r2tVar.s(f14124a);
            r2tVar.q(this.f261a);
            r2tVar.z();
        }
        if (this.f260a != null && m769b()) {
            r2tVar.s(f14125b);
            this.f260a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f266b != null) {
            r2tVar.s(c);
            r2tVar.q(this.f266b);
            r2tVar.z();
        }
        if (this.f268c != null && m771d()) {
            r2tVar.s(d);
            r2tVar.q(this.f268c);
            r2tVar.z();
        }
        if (this.f269d != null && e()) {
            r2tVar.s(e);
            r2tVar.q(this.f269d);
            r2tVar.z();
        }
        r2tVar.s(f);
        r2tVar.x(this.f265a);
        r2tVar.z();
        if (this.f270e != null && g()) {
            r2tVar.s(g);
            r2tVar.q(this.f270e);
            r2tVar.z();
        }
        if (this.f264a != null && h()) {
            r2tVar.s(h);
            r2tVar.u(new p2t((byte) 11, (byte) 11, this.f264a.size()));
            for (Map.Entry<String, String> entry : this.f264a.entrySet()) {
                r2tVar.q(entry.getKey());
                r2tVar.q(entry.getValue());
            }
            r2tVar.B();
            r2tVar.z();
        }
        if (this.f271f != null && i()) {
            r2tVar.s(i);
            r2tVar.q(this.f271f);
            r2tVar.z();
        }
        if (this.f272g != null && j()) {
            r2tVar.s(j);
            r2tVar.q(this.f272g);
            r2tVar.z();
        }
        if (this.f273h != null && k()) {
            r2tVar.s(f14126k);
            r2tVar.q(this.f273h);
            r2tVar.z();
        }
        if (this.f274i != null && l()) {
            r2tVar.s(l);
            r2tVar.q(this.f274i);
            r2tVar.z();
        }
        if (this.f262a != null && m()) {
            r2tVar.s(m);
            r2tVar.r(this.f262a);
            r2tVar.z();
        }
        if (n()) {
            r2tVar.s(n);
            r2tVar.p(this.f259a);
            r2tVar.z();
        }
        if (o()) {
            r2tVar.s(o);
            r2tVar.x(this.f267b);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m765a(boolean z) {
        this.f263a.set(0, z);
    }

    public void a(String str, String str2) {
        if (this.f264a == null) {
            this.f264a = new HashMap();
        }
        this.f264a.put(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m763a() {
        return this.f264a;
    }

    public ja a(Map<String, String> map) {
        this.f264a = map;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m768a() {
        a(c2t.n(this.f262a));
        return this.f262a.array();
    }

    public ja a(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
        return this;
    }

    public ja a(ByteBuffer byteBuffer) {
        this.f262a = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m767a(ja jaVar) {
        if (jaVar == null) {
            return false;
        }
        boolean zM766a = m766a();
        boolean zM766a2 = jaVar.m766a();
        if ((zM766a || zM766a2) && !(zM766a && zM766a2 && this.f261a.equals(jaVar.f261a))) {
            return false;
        }
        boolean zM769b = m769b();
        boolean zM769b2 = jaVar.m769b();
        if ((zM769b || zM769b2) && !(zM769b && zM769b2 && this.f260a.m725a(jaVar.f260a))) {
            return false;
        }
        boolean zM770c = m770c();
        boolean zM770c2 = jaVar.m770c();
        if ((zM770c || zM770c2) && !(zM770c && zM770c2 && this.f266b.equals(jaVar.f266b))) {
            return false;
        }
        boolean zM771d = m771d();
        boolean zM771d2 = jaVar.m771d();
        if ((zM771d || zM771d2) && !(zM771d && zM771d2 && this.f268c.equals(jaVar.f268c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = jaVar.e();
        if (((zE || zE2) && !(zE && zE2 && this.f269d.equals(jaVar.f269d))) || this.f265a != jaVar.f265a) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = jaVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f270e.equals(jaVar.f270e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = jaVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f264a.equals(jaVar.f264a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = jaVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f271f.equals(jaVar.f271f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = jaVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.f272g.equals(jaVar.f272g))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = jaVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.f273h.equals(jaVar.f273h))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = jaVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.f274i.equals(jaVar.f274i))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = jaVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f262a.equals(jaVar.f262a))) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = jaVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.f259a == jaVar.f259a)) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = jaVar.o();
        if (zO || zO2) {
            return zO && zO2 && this.f267b == jaVar.f267b;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ja jaVar) {
        int iK;
        int iC;
        int iD;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iH;
        int iE5;
        int iK2;
        int iE6;
        int iE7;
        int iE8;
        int iD2;
        int iE9;
        if (!getClass().equals(jaVar.getClass())) {
            return getClass().getName().compareTo(jaVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m766a()).compareTo(Boolean.valueOf(jaVar.m766a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m766a() && (iE9 = c2t.e(this.f261a, jaVar.f261a)) != 0) {
            return iE9;
        }
        int iCompareTo2 = Boolean.valueOf(m769b()).compareTo(Boolean.valueOf(jaVar.m769b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m769b() && (iD2 = c2t.d(this.f260a, jaVar.f260a)) != 0) {
            return iD2;
        }
        int iCompareTo3 = Boolean.valueOf(m770c()).compareTo(Boolean.valueOf(jaVar.m770c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m770c() && (iE8 = c2t.e(this.f266b, jaVar.f266b)) != 0) {
            return iE8;
        }
        int iCompareTo4 = Boolean.valueOf(m771d()).compareTo(Boolean.valueOf(jaVar.m771d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m771d() && (iE7 = c2t.e(this.f268c, jaVar.f268c)) != 0) {
            return iE7;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jaVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iE6 = c2t.e(this.f269d, jaVar.f269d)) != 0) {
            return iE6;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jaVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iK2 = c2t.k(this.f265a, jaVar.f265a)) != 0) {
            return iK2;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jaVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iE5 = c2t.e(this.f270e, jaVar.f270e)) != 0) {
            return iE5;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jaVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iH = c2t.h(this.f264a, jaVar.f264a)) != 0) {
            return iH;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jaVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iE4 = c2t.e(this.f271f, jaVar.f271f)) != 0) {
            return iE4;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jaVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iE3 = c2t.e(this.f272g, jaVar.f272g)) != 0) {
            return iE3;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jaVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iE2 = c2t.e(this.f273h, jaVar.f273h)) != 0) {
            return iE2;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jaVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iE = c2t.e(this.f274i, jaVar.f274i)) != 0) {
            return iE;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jaVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iD = c2t.d(this.f262a, jaVar.f262a)) != 0) {
            return iD;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jaVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iC = c2t.c(this.f259a, jaVar.f259a)) != 0) {
            return iC;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jaVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (!o() || (iK = c2t.k(this.f267b, jaVar.f267b)) == 0) {
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
                if (f()) {
                    m764a();
                    return;
                }
                throw new jy("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 11) {
                        this.f261a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f260a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f266b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f268c = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f269d = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 2) {
                        this.f265a = r2tVar.y();
                        m765a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f270e = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 13) {
                        p2t p2tVarI = r2tVar.i();
                        this.f264a = new HashMap(p2tVarI.c * 2);
                        for (int i2 = 0; i2 < p2tVarI.c; i2++) {
                            this.f264a.put(r2tVar.e(), r2tVar.e());
                        }
                        r2tVar.F();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f271f = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f272g = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 11:
                case 16:
                case 17:
                case 18:
                case 19:
                default:
                    m3t.a(r2tVar, b2);
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f273h = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 11) {
                        this.f274i = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 14:
                    if (b2 == 11) {
                        this.f262a = r2tVar.f();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 15:
                    if (b2 == 10) {
                        this.f259a = r2tVar.d();
                        b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 20:
                    if (b2 == 2) {
                        this.f267b = r2tVar.y();
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
    public void m764a() throws jy {
        if (this.f266b != null) {
            return;
        }
        throw new jy("Required field 'id' was not present! Struct: " + toString());
    }
}
