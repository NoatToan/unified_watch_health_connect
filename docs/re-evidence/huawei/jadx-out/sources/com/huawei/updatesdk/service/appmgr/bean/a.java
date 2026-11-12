package com.huawei.updatesdk.service.appmgr.bean;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes20.dex */
public class a extends com.huawei.updatesdk.service.bean.c {
    public static final String APIMETHOD = "client.getMarketInfo";

    @SDKNetTransmission
    private int deviceType;

    @SDKNetTransmission
    private int international;

    @SDKNetTransmission
    private String lang;

    @SDKNetTransmission
    private String marketPkg;

    /* JADX INFO: renamed from: net, reason: collision with root package name */
    @SDKNetTransmission
    private int f29927net;

    @SDKNetTransmission
    private int sysBits;

    @SDKNetTransmission
    private String version;

    @SDKNetTransmission
    private String subsystem = "updatesdk";

    @SDKNetTransmission
    private String code = "0200";

    public a(String str) {
        a("client.getMarketInfo");
        this.marketPkg = str;
        this.sysBits = com.huawei.updatesdk.sdk.foundation.utils.device.c.l();
        this.lang = com.huawei.updatesdk.sdk.foundation.utils.device.c.d();
        c("8.0");
        Context contextA = com.huawei.updatesdk.sdk.service.app.a.c().a();
        this.version = com.huawei.updatesdk.sdk.foundation.utils.device.c.g(contextA);
        this.deviceType = com.huawei.updatesdk.sdk.foundation.utils.device.c.b();
        this.international = com.huawei.updatesdk.sdk.foundation.utils.device.d.a();
        this.f29927net = com.huawei.updatesdk.sdk.foundation.utils.network.a.c(contextA);
        this.firmwareVersion = String.valueOf(Build.VERSION.SDK_INT);
    }
}
