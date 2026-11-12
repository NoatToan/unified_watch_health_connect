package com.xiaomi.push;

import defpackage.c2t;
import defpackage.l2t;
import defpackage.m3t;
import defpackage.r2t;
import defpackage.v3t;
import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes11.dex */
public class it implements jm<it, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f215a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private BitSet f216a = new BitSet(2);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f217b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final v3t f214a = new v3t("XmPushActionCheckClientInfo");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l2t f14111a = new l2t("", (byte) 8, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l2t f14112b = new l2t("", (byte) 8, 2);

    public void a() {
    }

    public it b(int i) {
        this.f217b = i;
        b(true);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof it)) {
            return m734a((it) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f215a + ", pluginConfigVersion:" + this.f217b + ")";
    }

    public it a(int i) {
        this.f215a = i;
        a(true);
        return this;
    }

    public boolean b() {
        return this.f216a.get(1);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m733a() {
        return this.f216a.get(0);
    }

    public void b(boolean z) {
        this.f216a.set(1, z);
    }

    public void a(boolean z) {
        this.f216a.set(0, z);
    }

    @Override // com.xiaomi.push.jm
    public void b(r2t r2tVar) {
        a();
        r2tVar.v(f214a);
        r2tVar.s(f14111a);
        r2tVar.o(this.f215a);
        r2tVar.z();
        r2tVar.s(f14112b);
        r2tVar.o(this.f217b);
        r2tVar.z();
        r2tVar.A();
        r2tVar.m();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m734a(it itVar) {
        return itVar != null && this.f215a == itVar.f215a && this.f217b == itVar.f217b;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(it itVar) {
        int iB;
        int iB2;
        if (!getClass().equals(itVar.getClass())) {
            return getClass().getName().compareTo(itVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m733a()).compareTo(Boolean.valueOf(itVar.m733a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m733a() && (iB2 = c2t.b(this.f215a, itVar.f215a)) != 0) {
            return iB2;
        }
        int iCompareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(itVar.b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (!b() || (iB = c2t.b(this.f217b, itVar.f217b)) == 0) {
            return 0;
        }
        return iB;
    }

    @Override // com.xiaomi.push.jm
    public void a(r2t r2tVar) throws jy {
        r2tVar.k();
        while (true) {
            l2t l2tVarG = r2tVar.g();
            byte b2 = l2tVarG.f24589b;
            if (b2 == 0) {
                break;
            }
            short s = l2tVarG.c;
            if (s != 1) {
                if (s != 2) {
                    m3t.a(r2tVar, b2);
                } else if (b2 == 8) {
                    this.f217b = r2tVar.c();
                    b(true);
                } else {
                    m3t.a(r2tVar, b2);
                }
            } else if (b2 == 8) {
                this.f215a = r2tVar.c();
                a(true);
            } else {
                m3t.a(r2tVar, b2);
            }
            r2tVar.E();
        }
        r2tVar.D();
        if (m733a()) {
            if (b()) {
                a();
                return;
            }
            throw new jy("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
        throw new jy("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
    }
}
