package com.loc;

import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;

/* JADX INFO: loaded from: classes18.dex */
public final class dc {
    public long a;
    public String b;
    public int d;
    public long e;
    public short g;
    public boolean h;
    public int c = RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
    public long f = 0;

    public dc(boolean z) {
        this.h = z;
    }

    public static long a(String str) {
        long j;
        if (str == null || str.length() == 0) {
            return 0L;
        }
        int i = 0;
        long j2 = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            long jCharAt = str.charAt(length);
            if (jCharAt < 48 || jCharAt > 57) {
                long j3 = 97;
                if (jCharAt < 97 || jCharAt > 102) {
                    j3 = 65;
                    if (jCharAt < 65 || jCharAt > 70) {
                        if (jCharAt != 58 && jCharAt != 124) {
                            return 0L;
                        }
                    }
                }
                j = (jCharAt - j3) + 10;
            } else {
                j = jCharAt - 48;
            }
            j2 += j << i;
            i += 4;
        }
        if (i != 48) {
            return 0L;
        }
        return j2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        dc dcVar = new dc(this.h);
        dcVar.a = this.a;
        dcVar.b = this.b;
        dcVar.c = this.c;
        dcVar.d = this.d;
        dcVar.e = this.e;
        dcVar.f = this.f;
        dcVar.g = this.g;
        dcVar.h = this.h;
        return dcVar;
    }

    public final String toString() {
        return "AmapWifi{mac=" + this.a + ", ssid='" + this.b + "', rssi=" + this.c + ", frequency=" + this.d + ", timestamp=" + this.e + ", lastUpdateUtcMills=" + this.f + ", freshness=" + ((int) this.g) + ", connected=" + this.h + '}';
    }
}
