package com.huawei.openalliance.ad.beans.server;

import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.annotations.g;
import com.huawei.openalliance.ad.beans.base.ReqBean;
import com.huawei.openalliance.ad.beans.metadata.App;
import com.huawei.openalliance.ad.beans.metadata.Device;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes12.dex */
public class AppConfigReq extends ReqBean {
    private App app;
    private Device device;

    @a
    private String gaid;

    @a
    private String oaid;
    private String routerCountry;
    private String sdkVerCode;

    @a
    private String serverStore;

    @g
    private String sha256;
    private String slotid;

    @a
    private String udid;
    private boolean ignoreTemplate = true;
    private String version = Constants.INTER_VERSION;
    private String sdkversion = "3.4.84.300";

    public void g(String str) {
        this.sha256 = str;
    }

    public void f(String str) {
        this.gaid = str;
    }

    public void e(String str) {
        this.sdkVerCode = str;
    }

    public void d(String str) {
        this.routerCountry = str;
    }

    public void c(String str) {
        this.udid = str;
    }

    public void b(String str) {
        this.oaid = str;
    }

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String b() {
        return Constants.SDK_SERVER_REQ_URI;
    }

    public void a(String str) {
        this.serverStore = str;
    }

    public void a(Device device) {
        this.device = device;
    }

    public void a(App app) {
        this.app = app;
    }

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String a() {
        return "query";
    }

    public AppConfigReq(String str) {
        this.slotid = str;
    }

    public AppConfigReq() {
    }
}
