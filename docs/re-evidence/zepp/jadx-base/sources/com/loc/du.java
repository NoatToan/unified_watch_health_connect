package com.loc;

import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public final class du {
    public int k;
    public boolean n;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
    public short l = 0;
    public long m = 0;
    public int o = 32767;
    public boolean p = true;

    public du(int i, boolean z) {
        this.k = 0;
        this.n = false;
        this.k = i;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof du)) {
            du duVar = (du) obj;
            int i = duVar.k;
            if (i != 1) {
                if (i == 2) {
                    return this.k == 2 && duVar.i == this.i && duVar.h == this.h && duVar.g == this.g;
                }
                if (i != 3) {
                    return i == 4 && this.k == 4 && duVar.c == this.c && duVar.d == this.d && duVar.b == this.b;
                }
                return this.k == 3 && duVar.c == this.c && duVar.d == this.d && duVar.b == this.b;
            }
            if (this.k == 1 && duVar.c == this.c && duVar.d == this.d && duVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2 = String.valueOf(this.k).hashCode();
        if (this.k == 2) {
            iHashCode = String.valueOf(this.i).hashCode() + String.valueOf(this.h).hashCode();
            i = this.g;
        } else {
            iHashCode = String.valueOf(this.c).hashCode() + String.valueOf(this.d).hashCode();
            i = this.b;
        }
        return iHashCode2 + iHashCode + String.valueOf(i).hashCode();
    }

    public final String toString() {
        int i = this.k;
        if (i == 1) {
            return String.format(Locale.CHINA, "GSM lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.b), Boolean.valueOf(this.p), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n));
        }
        if (i == 2) {
            return String.format(Locale.CHINA, "CDMA bid=%d, nid=%d, sid=%d, valid=%b, sig=%d, age=%d, reg=%b", Integer.valueOf(this.i), Integer.valueOf(this.h), Integer.valueOf(this.g), Boolean.valueOf(this.p), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n));
        }
        if (i != 3) {
            return i != 4 ? "unknown" : String.format(Locale.CHINA, "WCDMA lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b, pci=%d", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.b), Boolean.valueOf(this.p), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n), Integer.valueOf(this.o));
        }
        return String.format(Locale.CHINA, "LTE lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b, pci=%d", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.b), Boolean.valueOf(this.p), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n), Integer.valueOf(this.o));
    }
}
