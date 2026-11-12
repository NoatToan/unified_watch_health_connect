package com.huawei.updatesdk.service.bean;

import android.content.Context;
import android.os.Build;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;

/* JADX INFO: loaded from: classes20.dex */
public class c extends com.huawei.updatesdk.sdk.service.storekit.bean.c {

    @SDKNetTransmission
    private String brand;

    @SDKNetTransmission
    private String buildNumber;

    @SDKNetTransmission
    private String density;

    @SDKNetTransmission
    private int emuiApiLevel;

    @SDKNetTransmission
    public String firmwareVersion;

    @SDKNetTransmission
    private int harmonyApiLevel;

    @SDKNetTransmission
    private int magicApiLevel;

    @SDKNetTransmission
    private String magicVer;

    @SDKNetTransmission
    private String manufacturer;

    @SDKNetTransmission
    private int odm;

    @SDKNetTransmission
    private String osBrand;

    @SDKNetTransmission
    private String phoneType;

    @SDKNetTransmission
    private String resolution;

    @SDKNetTransmission
    private String sdkVersion;

    @SDKNetTransmission
    private long ts;

    public c() {
        Context contextA = com.huawei.updatesdk.sdk.service.app.a.c().a();
        this.ts = System.currentTimeMillis();
        this.firmwareVersion = Build.VERSION.RELEASE.trim();
        this.buildNumber = com.huawei.updatesdk.sdk.foundation.utils.device.c.a();
        com.huawei.updatesdk.service.device.c cVarA = com.huawei.updatesdk.service.device.b.a();
        this.phoneType = cVarA.e();
        this.density = com.huawei.updatesdk.sdk.foundation.utils.device.c.e(contextA);
        this.resolution = com.huawei.updatesdk.sdk.foundation.utils.device.c.d(contextA);
        this.emuiApiLevel = com.huawei.updatesdk.service.util.a.d().b();
        this.manufacturer = cVarA.d();
        this.brand = com.huawei.updatesdk.sdk.foundation.utils.device.c.d;
        this.odm = com.huawei.updatesdk.sdk.foundation.utils.device.c.i ? 1 : 0;
        this.sdkVersion = "6.0.2.300";
        this.harmonyApiLevel = com.huawei.updatesdk.sdk.foundation.utils.device.c.j;
        this.osBrand = com.huawei.updatesdk.sdk.foundation.utils.device.c.k;
        this.magicApiLevel = com.huawei.updatesdk.service.util.a.d().e();
        this.magicVer = com.huawei.updatesdk.service.util.a.d().f();
    }
}
