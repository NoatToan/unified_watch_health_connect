package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public final class np {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3232b;
    public int d;
    public long e;
    public short g;
    public boolean h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3233c = -113;
    public long f = 0;

    public np(boolean z) {
        this.h = z;
    }

    public final String a() {
        return this.h + "#" + this.f3231a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public np clone() {
        np npVar = new np(this.h);
        npVar.f3231a = this.f3231a;
        npVar.f3232b = this.f3232b;
        npVar.f3233c = this.f3233c;
        npVar.d = this.d;
        npVar.e = this.e;
        npVar.f = this.f;
        npVar.g = this.g;
        npVar.h = this.h;
        return npVar;
    }

    public final String toString() {
        return "AmapWifi{mac=" + this.f3231a + ", ssid='" + this.f3232b + "', rssi=" + this.f3233c + ", frequency=" + this.d + ", timestamp=" + this.e + ", lastUpdateUtcMills=" + this.f + ", freshness=" + ((int) this.g) + ", connected=" + this.h + '}';
    }

    public static String a(long j) {
        if (j < 0 || j > 281474976710655L) {
            return null;
        }
        return nx.a(nx.a(j), ":");
    }

    public static long a(String str) {
        if (str == null || str.length() == 0) {
            return 0L;
        }
        int i = 0;
        long j = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            long jCharAt = str.charAt(length);
            long j2 = 48;
            if (jCharAt < 48 || jCharAt > 57) {
                if (jCharAt >= 97 && jCharAt <= 102) {
                    j2 = 87;
                } else if (jCharAt >= 65 && jCharAt <= 70) {
                    j2 = 55;
                } else if (jCharAt != 58 && jCharAt != 124) {
                    return 0L;
                }
                j += (jCharAt - j2) << i;
                i += 4;
            } else {
                j += (jCharAt - j2) << i;
                i += 4;
            }
        }
        if (i != 48) {
            return 0L;
        }
        return j;
    }
}
