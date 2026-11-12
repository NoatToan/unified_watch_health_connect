package defpackage;

import android.os.Bundle;
import com.xiaomi.passport.sim.SIMInfo;

/* JADX INFO: loaded from: classes11.dex */
public class bcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4063b;
    public final String c;
    public final String d;

    public bcm(String str, String str2, String str3, String str4) {
        this.f4062a = str;
        this.f4063b = str2;
        this.c = str3;
        this.d = str4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(SIMInfo.SIM_INFO_TYPE_ICCID, this.f4062a);
        bundle.putString(SIMInfo.SIM_INFO_TYPE_IMSI, this.f4063b);
        bundle.putString(SIMInfo.SIM_INFO_TYPE_MCCMNC, this.c);
        bundle.putString(SIMInfo.SIM_INFO_TYPE_LINE_1_NUMBER, this.d);
        return bundle;
    }

    public String toString() {
        return a().toString();
    }
}
