package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class cbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5175b;
    public int d;
    public long e;
    public short g;
    public boolean h;
    public int c = -113;
    public long f = 0;

    public cbt(boolean z) {
        this.h = z;
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

    public static String c(long j) {
        if (j < 0 || j > 281474976710655L) {
            return null;
        }
        return kbt.a(kbt.b(j), ":");
    }

    public final String b() {
        return this.h + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + this.f5174a;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final cbt clone() {
        cbt cbtVar = new cbt(this.h);
        cbtVar.f5174a = this.f5174a;
        cbtVar.f5175b = this.f5175b;
        cbtVar.c = this.c;
        cbtVar.d = this.d;
        cbtVar.e = this.e;
        cbtVar.f = this.f;
        cbtVar.g = this.g;
        cbtVar.h = this.h;
        return cbtVar;
    }

    public final String toString() {
        return "AmapWifi{mac=" + this.f5174a + ", ssid='" + this.f5175b + "', rssi=" + this.c + ", frequency=" + this.d + ", timestamp=" + this.e + ", lastUpdateUtcMills=" + this.f + ", freshness=" + ((int) this.g) + ", connected=" + this.h + AbstractJsonLexerKt.END_OBJ;
    }
}
