package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import org.cybergarage.upnp.std.av.renderer.AVTransport;

/* JADX INFO: loaded from: classes22.dex */
public class dk implements ef<dk, Object>, Serializable, Cloneable {
    private static final eu f = new eu(AVTransport.TARGET);
    private static final em g = new em("", (byte) 10, 1);
    private static final em h = new em("", (byte) 11, 2);
    private static final em i = new em("", (byte) 11, 3);
    private static final em j = new em("", (byte) 11, 4);
    private static final em k = new em("", (byte) 2, 5);
    private static final em l = new em("", (byte) 11, 7);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f98a;
    public String d;
    private BitSet e = new BitSet(2);
    public long a = 5;
    public String b = "xiaomi.com";
    public String c = "";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f99a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dk dkVar) {
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        if (!getClass().equals(dkVar.getClass())) {
            return getClass().getName().compareTo(dkVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m3681a()).compareTo(Boolean.valueOf(dkVar.m3681a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m3681a() && (iA6 = eg.a(this.a, dkVar.a)) != 0) {
            return iA6;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(dkVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (b() && (iA5 = eg.a(this.f98a, dkVar.f98a)) != 0) {
            return iA5;
        }
        int iCompareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(dkVar.c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (c() && (iA4 = eg.a(this.b, dkVar.b)) != 0) {
            return iA4;
        }
        int iCompareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(dkVar.d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (d() && (iA3 = eg.a(this.c, dkVar.c)) != 0) {
            return iA3;
        }
        int iCompareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(dkVar.e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (e() && (iA2 = eg.a(this.f99a, dkVar.f99a)) != 0) {
            return iA2;
        }
        int iCompareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(dkVar.f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (!f() || (iA = eg.a(this.d, dkVar.d)) == 0) {
            return 0;
        }
        return iA;
    }

    public void a() throws eq {
        if (this.f98a != null) {
            return;
        }
        throw new eq("Required field 'userId' was not present! Struct: " + toString());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    @Override // com.xiaomi.push.ef
    public void a(ep epVar) throws ej {
        epVar.mo3777a();
        while (true) {
            em emVarMo3773a = epVar.mo3773a();
            byte b = emVarMo3773a.a;
            if (b == 0) {
                break;
            }
            short s = emVarMo3773a.f173a;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                if (s == 7 && b == 11) {
                                    this.d = epVar.mo3778a();
                                } else {
                                    es.a(epVar, b);
                                }
                            } else if (b == 2) {
                                this.f99a = epVar.mo3783a();
                                b(true);
                            } else {
                                es.a(epVar, b);
                            }
                        } else if (b == 11) {
                            this.c = epVar.mo3778a();
                        } else {
                            es.a(epVar, b);
                        }
                    } else if (b == 11) {
                        this.b = epVar.mo3778a();
                    } else {
                        es.a(epVar, b);
                    }
                } else if (b == 11) {
                    this.f98a = epVar.mo3778a();
                } else {
                    es.a(epVar, b);
                }
            } else if (b == 10) {
                this.a = epVar.mo3772a();
                a(true);
            } else {
                es.a(epVar, b);
            }
            epVar.g();
        }
        epVar.f();
        if (m3681a()) {
            a();
            return;
        }
        throw new eq("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z) {
        this.e.set(0, z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3681a() {
        return this.e.get(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3682a(dk dkVar) {
        if (dkVar == null || this.a != dkVar.a) {
            return false;
        }
        boolean zB = b();
        boolean zB2 = dkVar.b();
        if ((zB || zB2) && !(zB && zB2 && this.f98a.equals(dkVar.f98a))) {
            return false;
        }
        boolean zC = c();
        boolean zC2 = dkVar.c();
        if ((zC || zC2) && !(zC && zC2 && this.b.equals(dkVar.b))) {
            return false;
        }
        boolean zD = d();
        boolean zD2 = dkVar.d();
        if ((zD || zD2) && !(zD && zD2 && this.c.equals(dkVar.c))) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = dkVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f99a == dkVar.f99a)) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = dkVar.f();
        if (zF || zF2) {
            return zF && zF2 && this.d.equals(dkVar.d);
        }
        return true;
    }

    @Override // com.xiaomi.push.ef
    public void b(ep epVar) throws eq {
        a();
        epVar.a(f);
        epVar.a(g);
        epVar.a(this.a);
        epVar.b();
        if (this.f98a != null) {
            epVar.a(h);
            epVar.a(this.f98a);
            epVar.b();
        }
        if (this.b != null && c()) {
            epVar.a(i);
            epVar.a(this.b);
            epVar.b();
        }
        if (this.c != null && d()) {
            epVar.a(j);
            epVar.a(this.c);
            epVar.b();
        }
        if (e()) {
            epVar.a(k);
            epVar.a(this.f99a);
            epVar.b();
        }
        if (this.d != null && f()) {
            epVar.a(l);
            epVar.a(this.d);
            epVar.b();
        }
        epVar.c();
        epVar.mo3781a();
    }

    public void b(boolean z) {
        this.e.set(1, z);
    }

    public boolean b() {
        return this.f98a != null;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.e.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dk)) {
            return m3682a((dk) obj);
        }
        return false;
    }

    public boolean f() {
        return this.d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f98a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f99a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
