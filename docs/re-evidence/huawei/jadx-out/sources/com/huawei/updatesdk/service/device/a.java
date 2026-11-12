package com.huawei.updatesdk.service.device;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class a extends c {
    @Override // com.huawei.updatesdk.service.device.c
    public List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("AF31957DA537B4791BD8F0B92B5ADCA38DBEC1743449CE90046CB05632BC02F3");
        return arrayList;
    }

    @Override // com.huawei.updatesdk.service.device.c
    String c() {
        return (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.car.bmw") == null && com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.car.landscape") == null && com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.vehicle") == null) ? com.huawei.updatesdk.sdk.foundation.utils.device.a.d() : "default";
    }

    @Override // com.huawei.updatesdk.service.device.c
    public String b() {
        if (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.car.bmw") != null) {
            return "com.huawei.appmarket.car.bmw";
        }
        if (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.vehicle") != null) {
            return "com.huawei.appmarket.vehicle";
        }
        if (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.car.landscape") != null) {
            return "com.huawei.appmarket.car.landscape";
        }
        if (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.car.volvo") != null) {
            return "com.huawei.appmarket.car.volvo";
        }
        if (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.car.svw") != null) {
            return "com.huawei.appmarket.car.svw";
        }
        if (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.car") != null) {
            return "com.huawei.appmarket.car";
        }
        return null;
    }

    @Override // com.huawei.updatesdk.service.device.c
    String a() {
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            return strG;
        }
        String strI = i();
        if (!TextUtils.isEmpty(strI)) {
            return strI;
        }
        String strJ = j();
        if (!TextUtils.isEmpty(strJ)) {
            return strJ;
        }
        String strE = com.huawei.updatesdk.sdk.foundation.utils.device.a.e();
        return TextUtils.isEmpty(strE) ? h() : strE;
    }

    private String j() {
        if (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.vehicle") == null) {
            return null;
        }
        return h();
    }

    private String i() {
        if (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.car.landscape") == null) {
            return null;
        }
        String strA = com.huawei.updatesdk.sdk.foundation.utils.device.c.a("persist.vendor.vehicle.car_type", "");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = com.huawei.updatesdk.sdk.foundation.utils.device.c.a("ro.product.ext.model", "");
        return !TextUtils.isEmpty(strA2) ? strA2 : h();
    }

    private String h() {
        String str = Build.MODEL;
        return (TextUtils.isEmpty(str) || TextUtils.equals("unknown", str)) ? "default" : str;
    }

    private String g() {
        if (com.huawei.updatesdk.service.util.b.d(com.huawei.updatesdk.sdk.service.app.a.c().a(), "com.huawei.appmarket.car.bmw") == null) {
            return null;
        }
        String strH = h();
        String strA = com.huawei.updatesdk.sdk.foundation.utils.device.c.a("ro.vendor.build.RSEappstoredistributionscope", "");
        if (TextUtils.isEmpty(strA)) {
            return strH;
        }
        return strH + "_" + strA;
    }
}
