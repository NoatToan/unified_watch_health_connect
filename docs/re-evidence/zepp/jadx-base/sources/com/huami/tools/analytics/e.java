package com.huami.tools.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.tools.analytics.internal.utils.Crypto;
import com.huami.tools.analytics.internal.utils.DeviceConfig;

/* JADX INFO: loaded from: classes15.dex */
class e {
    private static final String e = "HmStat-ClientSupplier";
    private Context a;
    private l b;
    private boolean c;
    private volatile String d;

    public e(@NonNull Context context, @NonNull l lVar, boolean z) {
        this.a = context;
        this.b = lVar;
        this.c = z;
    }

    public d a() {
        d dVar = new d();
        dVar.c = DeviceConfig.getApplicationId(this.a);
        dVar.h = DeviceConfig.getAppVersionCode(this.a);
        dVar.i = DeviceConfig.getAppVersionName(this.a);
        dVar.n = this.b.g();
        dVar.d = DeviceConfig.getDeviceBrand();
        dVar.e = DeviceConfig.getDeviceModelName();
        dVar.j = DeviceConfig.getLanguage() + "_" + DeviceConfig.getCountry();
        dVar.f = DeviceConfig.getOsVersionCode();
        dVar.g = DeviceConfig.getOsVersionName();
        dVar.k = "2.0.2";
        dVar.l = DeviceConfig.getNetworkType(this.a);
        dVar.m = DeviceConfig.getScreenResolution(this.a);
        dVar.o = 1;
        if (this.c) {
            dVar.b = DeviceConfig.getInstallationId(this.a);
        } else {
            dVar.b = this.d;
        }
        dVar.a = Crypto.getDigestOrRandomId(dVar.a());
        return dVar;
    }

    public void b(String str) {
        if (this.c) {
            p.b().d(e, "匿名追踪器不保存用户id");
        } else {
            this.d = str;
        }
    }
}
