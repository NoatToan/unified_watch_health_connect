package com.autonavi.aps.amapapi.restruct;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public int l;
    public boolean n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6854a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6855b = 0;
    public int c = 0;
    public int d = 0;
    public long e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6856k = -113;
    public short m = 0;
    public int o = 32767;
    public int p = Integer.MAX_VALUE;
    public int q = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6857r = true;
    public int s = 99;
    public long t = 0;

    public d(int i, boolean z) {
        this.l = i;
        this.n = z;
    }

    private String e() {
        return this.l + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + this.f6854a + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + this.f6855b + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + 0L + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + a();
    }

    private String f() {
        return this.l + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + this.h + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + this.i + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + this.j;
    }

    public final long a() {
        return this.l == 5 ? this.e : this.d;
    }

    public final String b() {
        int i = this.l;
        if (i != 1) {
            if (i == 2) {
                return f();
            }
            if (i != 3 && i != 4 && i != 5) {
                return null;
            }
        }
        return e();
    }

    public final String c() {
        String strB = b();
        if (strB == null || strB.length() <= 0) {
            return "";
        }
        return (this.f6857r ? 1 : 0) + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + strB;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final d clone() {
        d dVar = new d(this.l, this.n);
        dVar.f6854a = this.f6854a;
        dVar.f6855b = this.f6855b;
        dVar.c = this.c;
        dVar.d = this.d;
        dVar.e = this.e;
        dVar.f = this.f;
        dVar.g = this.g;
        dVar.h = this.h;
        dVar.i = this.i;
        dVar.j = this.j;
        dVar.f6856k = this.f6856k;
        dVar.m = this.m;
        dVar.o = this.o;
        dVar.p = this.p;
        dVar.q = this.q;
        dVar.f6857r = this.f6857r;
        dVar.s = this.s;
        dVar.t = this.t;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            int i = dVar.l;
            if (i != 1) {
                if (i == 2) {
                    return this.l == 2 && dVar.j == this.j && dVar.i == this.i && dVar.h == this.h;
                }
                if (i == 3) {
                    return this.l == 3 && dVar.c == this.c && dVar.d == this.d && dVar.f6855b == this.f6855b;
                }
                if (i != 4) {
                    return i == 5 && this.l == 5 && dVar.c == this.c && dVar.e == this.e && dVar.q == this.q;
                }
                return this.l == 4 && dVar.c == this.c && dVar.d == this.d && dVar.f6855b == this.f6855b;
            }
            if (this.l == 1 && dVar.c == this.c && dVar.d == this.d && dVar.f6855b == this.f6855b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = String.valueOf(this.l).hashCode();
        if (this.l == 2) {
            iHashCode = String.valueOf(this.j).hashCode() + String.valueOf(this.i).hashCode();
            iHashCode2 = String.valueOf(this.h).hashCode();
        } else {
            iHashCode = String.valueOf(this.c).hashCode() + String.valueOf(this.d).hashCode();
            iHashCode2 = String.valueOf(this.f6855b).hashCode();
        }
        return iHashCode3 + iHashCode + iHashCode2;
    }
}
