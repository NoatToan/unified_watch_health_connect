package com.xmlywind.sdk.common.utils;

import java.io.Serializable;
import java.util.Calendar;
import java.util.UUID;

/* JADX INFO: loaded from: classes22.dex */
public class a implements Serializable {
    public final Calendar a;
    public final String b;
    public final String c;
    public final boolean d;

    public a(String str, String str2, boolean z, long j) {
        this.b = str;
        this.c = str2;
        this.d = z;
        Calendar calendar = Calendar.getInstance();
        this.a = calendar;
        calendar.setTimeInMillis(j);
    }

    public static a a() {
        return new a(null, b(), false, (Calendar.getInstance().getTimeInMillis() - 86400000) - 1);
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public boolean c() {
        return Calendar.getInstance().getTimeInMillis() - this.a.getTimeInMillis() >= 86400000;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.d != aVar.d || !this.b.equals(aVar.b) || !this.c.equals(aVar.c)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = this.b.hashCode();
        int iHashCode2 = this.c.hashCode();
        return (this.d ? 1 : 0) + (((iHashCode * 31) + iHashCode2) * 31);
    }

    public String toString() {
        return "AdvertisingId{mLastRotation=" + this.a + ", mAdvertisingId='" + this.b + "', mSigmobId='" + this.c + "', mDoNotTrack=" + this.d + '}';
    }
}
