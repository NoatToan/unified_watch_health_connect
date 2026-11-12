package com.xiaomi.push;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import defpackage.c2t;
import defpackage.l2t;
import defpackage.m3t;
import defpackage.r2t;
import defpackage.v3t;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class ix implements jm<ix, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ib f245a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public io f246a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public iq f247a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f248a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ByteBuffer f249a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f252b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f244a = new v3t("XmPushActionContainer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14118a = new l2t("", (byte) 8, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14119b = new l2t("", (byte) 2, 2);
    private static final l2t c = new l2t("", (byte) 2, 3);
    private static final l2t d = new l2t("", (byte) 11, 4);
    private static final l2t e = new l2t("", (byte) 11, 5);
    private static final l2t f = new l2t("", (byte) 11, 6);
    private static final l2t g = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 7);
    private static final l2t h = new l2t("", AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 8);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f250a = new BitSet(2);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f251a = true;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f253b = true;

    public ib a() {
        return this.f245a;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m755b() {
        return this.f251a;
    }

    public boolean c() {
        return this.f250a.get(0);
    }

    public boolean d() {
        return this.f250a.get(1);
    }

    public boolean e() {
        return this.f249a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ix)) {
            return m752a((ix) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f248a != null;
    }

    public boolean g() {
        return this.f252b != null;
    }

    public boolean h() {
        return this.f247a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f246a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        ib ibVar = this.f245a;
        if (ibVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(ibVar);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f251a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f253b);
        if (f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f248a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f252b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        iq iqVar = this.f247a;
        if (iqVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(iqVar);
        }
        if (i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            io ioVar = this.f246a;
            if (ioVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(ioVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public ix a(ib ibVar) {
        this.f245a = ibVar;
        return this;
    }

    public ix b(boolean z) {
        this.f253b = z;
        m754b(true);
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m751a() {
        return this.f245a != null;
    }

    public ix a(boolean z) {
        this.f251a = z;
        m750a(true);
        return this;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m754b(boolean z) {
        this.f250a.set(1, z);
    }

    public String b() {
        return this.f252b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m750a(boolean z) {
        this.f250a.set(0, z);
    }

    public ix b(String str) {
        this.f252b = str;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m753a() {
        a(c2t.n(this.f249a));
        return this.f249a.array();
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) throws jy {
        m749a();
        r2tVar.v(f244a);
        if (this.f245a != null) {
            r2tVar.s(f14118a);
            r2tVar.o(this.f245a.a());
            r2tVar.z();
        }
        r2tVar.s(f14119b);
        r2tVar.x(this.f251a);
        r2tVar.z();
        r2tVar.s(c);
        r2tVar.x(this.f253b);
        r2tVar.z();
        if (this.f249a != null) {
            r2tVar.s(d);
            r2tVar.r(this.f249a);
            r2tVar.z();
        }
        if (this.f248a != null && f()) {
            r2tVar.s(e);
            r2tVar.q(this.f248a);
            r2tVar.z();
        }
        if (this.f252b != null && g()) {
            r2tVar.s(f);
            r2tVar.q(this.f252b);
            r2tVar.z();
        }
        if (this.f247a != null) {
            r2tVar.s(g);
            this.f247a.b(r2tVar);
            r2tVar.z();
        }
        if (this.f246a != null && i()) {
            r2tVar.s(h);
            this.f246a.b(r2tVar);
            r2tVar.z();
        }
        r2tVar.A();
        r2tVar.m();
    }

    public ix a(ByteBuffer byteBuffer) {
        this.f249a = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m748a() {
        return this.f248a;
    }

    public ix a(String str) {
        this.f248a = str;
        return this;
    }

    public ix a(iq iqVar) {
        this.f247a = iqVar;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public io m747a() {
        return this.f246a;
    }

    public ix a(io ioVar) {
        this.f246a = ioVar;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m752a(ix ixVar) {
        if (ixVar == null) {
            return false;
        }
        boolean zM751a = m751a();
        boolean zM751a2 = ixVar.m751a();
        if (((zM751a || zM751a2) && (!zM751a || !zM751a2 || !this.f245a.equals(ixVar.f245a))) || this.f251a != ixVar.f251a || this.f253b != ixVar.f253b) {
            return false;
        }
        boolean zE = e();
        boolean zE2 = ixVar.e();
        if ((zE || zE2) && !(zE && zE2 && this.f249a.equals(ixVar.f249a))) {
            return false;
        }
        boolean zF = f();
        boolean zF2 = ixVar.f();
        if ((zF || zF2) && !(zF && zF2 && this.f248a.equals(ixVar.f248a))) {
            return false;
        }
        boolean zG = g();
        boolean zG2 = ixVar.g();
        if ((zG || zG2) && !(zG && zG2 && this.f252b.equals(ixVar.f252b))) {
            return false;
        }
        boolean zH = h();
        boolean zH2 = ixVar.h();
        if ((zH || zH2) && !(zH && zH2 && this.f247a.m725a(ixVar.f247a))) {
            return false;
        }
        boolean zI = i();
        boolean zI2 = ixVar.i();
        if (zI || zI2) {
            return zI && zI2 && this.f246a.m717a(ixVar.f246a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ix ixVar) {
        int iD;
        int iD2;
        int iE;
        int iE2;
        int iD3;
        int iK;
        int iK2;
        int iD4;
        if (!getClass().equals(ixVar.getClass())) {
            return getClass().getName().compareTo(ixVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m751a()).compareTo(Boolean.valueOf(ixVar.m751a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m751a() && (iD4 = c2t.d(this.f245a, ixVar.f245a)) != 0) {
            return iD4;
        }
        int iCompareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ixVar.c()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (c() && (iK2 = c2t.k(this.f251a, ixVar.f251a)) != 0) {
            return iK2;
        }
        int iCompareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ixVar.d()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (d() && (iK = c2t.k(this.f253b, ixVar.f253b)) != 0) {
            return iK;
        }
        int iCompareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ixVar.e()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (e() && (iD3 = c2t.d(this.f249a, ixVar.f249a)) != 0) {
            return iD3;
        }
        int iCompareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ixVar.f()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (f() && (iE2 = c2t.e(this.f248a, ixVar.f248a)) != 0) {
            return iE2;
        }
        int iCompareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ixVar.g()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (g() && (iE = c2t.e(this.f252b, ixVar.f252b)) != 0) {
            return iE;
        }
        int iCompareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ixVar.h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (h() && (iD2 = c2t.d(this.f247a, ixVar.f247a)) != 0) {
            return iD2;
        }
        int iCompareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ixVar.i()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!i() || (iD = c2t.d(this.f246a, ixVar.f246a)) == 0) {
            return 0;
        }
        return iD;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) throws jy {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                r2tVar.D();
                if (c()) {
                    if (d()) {
                        m749a();
                        return;
                    }
                    throw new jy("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
                }
                throw new jy("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
            }
            switch (l2tVarG.c) {
                case 1:
                    if (b2 == 8) {
                        this.f245a = ib.a(r2tVar.c());
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 2) {
                        this.f251a = r2tVar.y();
                        m750a(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 2) {
                        this.f253b = r2tVar.y();
                        m754b(true);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f249a = r2tVar.f();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f248a = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f252b = r2tVar.e();
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 12) {
                        iq iqVar = new iq();
                        this.f247a = iqVar;
                        iqVar.a(r2tVar);
                    } else {
                        m3t.a(r2tVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 12) {
                        io ioVar = new io();
                        this.f246a = ioVar;
                        ioVar.a(r2tVar);
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
    public void m749a() throws jy {
        if (this.f245a != null) {
            if (this.f249a != null) {
                if (this.f247a != null) {
                    return;
                }
                throw new jy("Required field 'target' was not present! Struct: " + toString());
            }
            throw new jy("Required field 'pushAction' was not present! Struct: " + toString());
        }
        throw new jy("Required field 'action' was not present! Struct: " + toString());
    }
}
