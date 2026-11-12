package com.xiaomi.push;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class dt implements ef<dt, Object>, Serializable, Cloneable {
    private static final eu k = new eu("XmPushActionNotification");
    private static final em l = new em("", (byte) 11, 1);
    private static final em m = new em("", (byte) 12, 2);
    private static final em n = new em("", (byte) 11, 3);
    private static final em o = new em("", (byte) 11, 4);
    private static final em p = new em("", (byte) 11, 5);
    private static final em q = new em("", (byte) 2, 6);
    private static final em r = new em("", (byte) 11, 7);
    private static final em s = new em("", (byte) 13, 8);
    private static final em t = new em("", (byte) 11, 9);
    private static final em u = new em("", (byte) 11, 10);
    private static final em v = new em("", (byte) 11, 12);
    private static final em w = new em("", (byte) 11, 13);
    private static final em x = new em("", (byte) 11, 14);
    private static final em y = new em("", (byte) 10, 15);
    private static final em z = new em("", (byte) 2, 20);
    public long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public dk f126a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f127a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ByteBuffer f128a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Map<String, String> f129a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f130a;
    public String b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f131b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    private BitSet j;

    public dt() {
        this.j = new BitSet(3);
        this.f130a = true;
        this.f131b = false;
    }

    public dt(String str, boolean z2) {
        this();
        this.b = str;
        this.f130a = z2;
        m3719a(true);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dt dtVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iA7;
        int iA8;
        int iA9;
        int iA10;
        int iA11;
        int iA12;
        int iA13;
        int iA14;
        int iA15;
        if (!getClass().equals(dtVar.getClass())) {
            return getClass().getName().compareTo(dtVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3720a()).compareTo(Boolean.valueOf(dtVar.m3720a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3720a() && (iA15 = eg.a(this.f127a, dtVar.f127a)) != 0) {
            return iA15;
        }
        int iCompareTo2 = Boolean.valueOf(m3723b()).compareTo(Boolean.valueOf(dtVar.m3723b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m3723b() && (iA14 = eg.a(this.f126a, dtVar.f126a)) != 0) {
            return iA14;
        }
        int iCompareTo3 = Boolean.valueOf(m3724c()).compareTo(Boolean.valueOf(dtVar.m3724c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m3724c() && (iA13 = eg.a(this.b, dtVar.b)) != 0) {
            return iA13;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dtVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA12 = eg.a(this.c, dtVar.c)) != 0) {
            return iA12;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dtVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA11 = eg.a(this.d, dtVar.d)) != 0) {
            return iA11;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dtVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (f() && (iA10 = eg.a(this.f130a, dtVar.f130a)) != 0) {
            return iA10;
        }
        int iCompareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(dtVar.g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (g() && (iA9 = eg.a(this.e, dtVar.e)) != 0) {
            return iA9;
        }
        int iCompareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(dtVar.h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (h() && (iA8 = eg.a(this.f129a, dtVar.f129a)) != 0) {
            return iA8;
        }
        int iCompareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(dtVar.i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (i() && (iA7 = eg.a(this.f, dtVar.f)) != 0) {
            return iA7;
        }
        int iCompareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(dtVar.j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (j() && (iA6 = eg.a(this.g, dtVar.g)) != 0) {
            return iA6;
        }
        int iCompareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(dtVar.k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (k() && (iA5 = eg.a(this.h, dtVar.h)) != 0) {
            return iA5;
        }
        int iCompareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(dtVar.l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (l() && (iA4 = eg.a(this.i, dtVar.i)) != 0) {
            return iA4;
        }
        int iCompareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(dtVar.m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m() && (iA3 = eg.a(this.f128a, dtVar.f128a)) != 0) {
            return iA3;
        }
        int iCompareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(dtVar.n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (n() && (iA2 = eg.a(this.a, dtVar.a)) != 0) {
            return iA2;
        }
        int iCompareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(dtVar.o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (!o() || (iA = eg.a(this.f131b, dtVar.f131b)) == 0) {
            return 0;
        }
        return iA;
    }

    public dk a() {
        return this.f126a;
    }

    public dt a(String str) {
        this.b = str;
        return this;
    }

    public dt a(ByteBuffer byteBuffer) {
        this.f128a = byteBuffer;
        return this;
    }

    public dt a(Map<String, String> map) {
        this.f129a = map;
        return this;
    }

    public dt a(boolean z2) {
        this.f130a = z2;
        m3719a(true);
        return this;
    }

    public dt a(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3716a() {
        return this.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<String, String> m3717a() {
        return this.f129a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3718a() throws eq {
        if (this.b != null) {
            return;
        }
        throw new eq("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                epVar.f();
                if (f()) {
                    m3718a();
                    return;
                }
                throw new eq("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (emVarMo3773a.f173a) {
                case 1:
                    if (b == 11) {
                        this.f127a = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 2:
                    if (b == 12) {
                        dk dkVar = new dk();
                        this.f126a = dkVar;
                        dkVar.a(epVar);
                    }
                    epVar.g();
                    break;
                case 3:
                    if (b == 11) {
                        this.b = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 4:
                    if (b == 11) {
                        this.c = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 5:
                    if (b == 11) {
                        this.d = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 6:
                    if (b == 2) {
                        this.f130a = epVar.mo3783a();
                        m3719a(true);
                        continue;
                    }
                    epVar.g();
                    break;
                case 7:
                    if (b == 11) {
                        this.e = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 8:
                    if (b == 13) {
                        eo eoVarMo3775a = epVar.mo3775a();
                        this.f129a = new HashMap(eoVarMo3775a.f175a * 2);
                        for (int i = 0; i < eoVarMo3775a.f175a; i++) {
                            this.f129a.put(epVar.mo3778a(), epVar.mo3778a());
                        }
                        epVar.h();
                    }
                    epVar.g();
                    break;
                case 9:
                    if (b == 11) {
                        this.f = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 10:
                    if (b == 11) {
                        this.g = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 12:
                    if (b == 11) {
                        this.h = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 13:
                    if (b == 11) {
                        this.i = epVar.mo3778a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 14:
                    if (b == 11) {
                        this.f128a = epVar.mo3779a();
                        continue;
                    }
                    epVar.g();
                    break;
                case 15:
                    if (b == 10) {
                        this.a = epVar.mo3772a();
                        b(true);
                    }
                    epVar.g();
                    break;
                case 20:
                    if (b == 2) {
                        this.f131b = epVar.mo3783a();
                        c(true);
                        continue;
                    }
                    epVar.g();
                    break;
            }
            es.a(epVar, b);
            epVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f129a == null) {
            this.f129a = new HashMap();
        }
        this.f129a.put(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3719a(boolean z2) {
        this.j.set(0, z2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3720a() {
        return this.f127a != null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3721a(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        boolean zM3720a = m3720a();
        boolean zM3720a2 = dtVar.m3720a();
        if ((zM3720a || zM3720a2) && !(zM3720a && zM3720a2 && this.f127a.equals(dtVar.f127a))) {
            return false;
        }
        boolean zM3723b = m3723b();
        boolean zM3723b2 = dtVar.m3723b();
        if ((zM3723b || zM3723b2) && !(zM3723b && zM3723b2 && this.f126a.m3682a(dtVar.f126a))) {
            return false;
        }
        boolean zM3724c = m3724c();
        boolean zM3724c2 = dtVar.m3724c();
        if ((zM3724c || zM3724c2) && !(zM3724c && zM3724c2 && this.b.equals(dtVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dtVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.c.equals(dtVar.c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = dtVar.e();
        if (((zE || zE2) && !(zE && zE2 && this.d.equals(dtVar.d))) || this.f130a != dtVar.f130a) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = dtVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.e.equals(dtVar.e))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = dtVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f129a.equals(dtVar.f129a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = dtVar.i();
        if ((zI || zI2) && !(zI && zI2 && this.f.equals(dtVar.f))) {
            return false;
        }
        boolean zJ = j();
        boolean zJ2 = dtVar.j();
        if ((zJ || zJ2) && !(zJ && zJ2 && this.g.equals(dtVar.g))) {
            return false;
        }
        boolean zK = k();
        boolean zK2 = dtVar.k();
        if ((zK || zK2) && !(zK && zK2 && this.h.equals(dtVar.h))) {
            return false;
        }
        boolean zL = l();
        boolean zL2 = dtVar.l();
        if ((zL || zL2) && !(zL && zL2 && this.i.equals(dtVar.i))) {
            return false;
        }
        boolean zM = m();
        boolean zM2 = dtVar.m();
        if ((zM || zM2) && !(zM && zM2 && this.f128a.equals(dtVar.f128a))) {
            return false;
        }
        boolean zN = n();
        boolean zN2 = dtVar.n();
        if ((zN || zN2) && !(zN && zN2 && this.a == dtVar.a)) {
            return false;
        }
        boolean zO = o();
        boolean zO2 = dtVar.o();
        if (zO || zO2) {
            return zO && zO2 && this.f131b == dtVar.f131b;
        }
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m3722a() {
        a(eg.a(this.f128a));
        return this.f128a.array();
    }

    public dt b(String str) {
        this.c = str;
        return this;
    }

    public String b() {
        return this.c;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        m3718a();
        epVar.a(k);
        if (this.f127a != null && m3720a()) {
            epVar.a(l);
            epVar.a(this.f127a);
            epVar.b();
        }
        if (this.f126a != null && m3723b()) {
            epVar.a(m);
            this.f126a.b(epVar);
            epVar.b();
        }
        if (this.b != null) {
            epVar.a(n);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.c != null && d()) {
            epVar.a(o);
            epVar.a(this.c);
            epVar.b();
        }
        if (this.d != null && e()) {
            epVar.a(p);
            epVar.a(this.d);
            epVar.b();
        }
        epVar.a(q);
        epVar.a(this.f130a);
        epVar.b();
        if (this.e != null && g()) {
            epVar.a(r);
            epVar.a(this.e);
            epVar.b();
        }
        if (this.f129a != null && h()) {
            epVar.a(s);
            epVar.a(new eo((byte) 11, (byte) 11, this.f129a.size()));
            for (Map.Entry<String, String> entry : this.f129a.entrySet()) {
                epVar.a(entry.getKey());
                epVar.a(entry.getValue());
            }
            epVar.d();
            epVar.b();
        }
        if (this.f != null && i()) {
            epVar.a(t);
            epVar.a(this.f);
            epVar.b();
        }
        if (this.g != null && j()) {
            epVar.a(u);
            epVar.a(this.g);
            epVar.b();
        }
        if (this.h != null && k()) {
            epVar.a(v);
            epVar.a(this.h);
            epVar.b();
        }
        if (this.i != null && l()) {
            epVar.a(w);
            epVar.a(this.i);
            epVar.b();
        }
        if (this.f128a != null && m()) {
            epVar.a(x);
            epVar.a(this.f128a);
            epVar.b();
        }
        if (n()) {
            epVar.a(y);
            epVar.a(this.a);
            epVar.b();
        }
        if (o()) {
            epVar.a(z);
            epVar.a(this.f131b);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z2) {
        this.j.set(1, z2);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3723b() {
        return this.f126a != null;
    }

    public dt c(String str) {
        this.d = str;
        return this;
    }

    public String c() {
        return this.f;
    }

    public void c(boolean z2) {
        this.j.set(2, z2);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3724c() {
        return this.b != null;
    }

    public dt d(String str) {
        this.f = str;
        return this;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dt)) {
            return m3721a((dt) obj);
        }
        return false;
    }

    public boolean f() {
        return this.j.get(0);
    }

    public boolean g() {
        return this.e != null;
    }

    public boolean h() {
        return this.f129a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f != null;
    }

    public boolean j() {
        return this.g != null;
    }

    public boolean k() {
        return this.h != null;
    }

    public boolean l() {
        return this.i != null;
    }

    public boolean m() {
        return this.f128a != null;
    }

    public boolean n() {
        return this.j.get(1);
    }

    public boolean o() {
        return this.j.get(2);
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z3 = false;
        if (m3720a()) {
            sb.append("debug:");
            String str = this.f127a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m3723b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            dk dkVar = this.f126a;
            if (dkVar == null) {
                sb.append("null");
            } else {
                sb.append(dkVar);
            }
        } else {
            z3 = z2;
        }
        if (!z3) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f130a);
        if (g()) {
            sb.append(", ");
            sb.append(SDKConstants.PARAM_A2U_PAYLOAD);
            String str5 = this.e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f129a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f128a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                eg.a(byteBuffer, sb);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f131b);
        }
        sb.append(")");
        return sb.toString();
    }
}
