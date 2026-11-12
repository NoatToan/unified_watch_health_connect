package com.amap.api.mapcore.util;

import com.huami.watch.ota.UpdateUtils;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class lg {
    public int l;
    public boolean o;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public long e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
    public short m = 0;
    public long n = 0;
    public int p = 32767;
    public int q = Integer.MAX_VALUE;
    public int r = Integer.MAX_VALUE;

    public lg(int i, boolean z) {
        this.l = 0;
        this.o = false;
        this.l = i;
        this.o = z;
    }

    public final String a() {
        int i = this.l;
        if (i != 1) {
            if (i == 2) {
                return this.l + UpdateUtils.CMD_FILTER + this.h + UpdateUtils.CMD_FILTER + this.i + UpdateUtils.CMD_FILTER + this.j;
            }
            if (i != 3 && i != 4 && i != 5) {
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.l);
        sb.append(UpdateUtils.CMD_FILTER);
        sb.append(this.a);
        sb.append(UpdateUtils.CMD_FILTER);
        sb.append(this.b);
        sb.append(UpdateUtils.CMD_FILTER);
        sb.append(0L);
        sb.append(UpdateUtils.CMD_FILTER);
        sb.append(this.l == 5 ? this.e : this.d);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof lg)) {
            lg lgVar = (lg) obj;
            int i = lgVar.l;
            if (i != 1) {
                if (i == 2) {
                    return this.l == 2 && lgVar.j == this.j && lgVar.i == this.i && lgVar.h == this.h;
                }
                if (i == 3) {
                    return this.l == 3 && lgVar.c == this.c && lgVar.d == this.d && lgVar.b == this.b;
                }
                if (i != 4) {
                    return i == 5 && this.l == 5 && lgVar.c == this.c && lgVar.e == this.e && lgVar.r == this.r;
                }
                return this.l == 4 && lgVar.c == this.c && lgVar.d == this.d && lgVar.b == this.b;
            }
            if (this.l == 1 && lgVar.c == this.c && lgVar.d == this.d && lgVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2 = String.valueOf(this.l).hashCode();
        if (this.l == 2) {
            iHashCode = String.valueOf(this.j).hashCode() + String.valueOf(this.i).hashCode();
            i = this.h;
        } else {
            iHashCode = String.valueOf(this.c).hashCode() + String.valueOf(this.d).hashCode();
            i = this.b;
        }
        return iHashCode2 + iHashCode + String.valueOf(i).hashCode();
    }

    public final String toString() {
        int i = this.l;
        if (i == 1) {
            return String.format(Locale.CHINA, "GSM lac=%d, cid=%d, mnc=%s,  sig=%d, age=%d, reg=%b", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.b), Integer.valueOf(this.k), Short.valueOf(this.m), Boolean.valueOf(this.o));
        }
        if (i == 2) {
            return String.format(Locale.CHINA, "CDMA bid=%d, nid=%d, sid=%d,  sig=%d, age=%d, reg=%b", Integer.valueOf(this.j), Integer.valueOf(this.i), Integer.valueOf(this.h), Integer.valueOf(this.k), Short.valueOf(this.m), Boolean.valueOf(this.o));
        }
        if (i != 3) {
            return i != 4 ? "unknown" : String.format(Locale.CHINA, "WCDMA lac=%d, cid=%d, mnc=%s,  sig=%d, age=%d, reg=%b, pci=%d", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.b), Integer.valueOf(this.k), Short.valueOf(this.m), Boolean.valueOf(this.o), Integer.valueOf(this.p));
        }
        return String.format(Locale.CHINA, "LTE lac=%d, cid=%d, mnc=%s, sig=%d, age=%d, reg=%b, pci=%d", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.b), Integer.valueOf(this.k), Short.valueOf(this.m), Boolean.valueOf(this.o), Integer.valueOf(this.p));
    }
}
