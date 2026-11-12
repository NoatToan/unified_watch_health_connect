package com.huawei.hwcloudjs.service.hms.bean;

import com.huawei.hwcloudjs.core.JsCallback;
import com.huawei.hwcloudjs.service.hms.HmsLiteCoreApi;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HmsLiteCoreApi.LoginLiteReq f17143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JsCallback f17144b;

    public HmsLiteCoreApi.LoginLiteReq b() {
        return this.f17143a;
    }

    public void a(HmsLiteCoreApi.LoginLiteReq loginLiteReq) {
        this.f17143a = loginLiteReq;
    }

    public void a(JsCallback jsCallback) {
        this.f17144b = jsCallback;
    }

    public JsCallback a() {
        return this.f17144b;
    }

    public a(HmsLiteCoreApi.LoginLiteReq loginLiteReq, JsCallback jsCallback) {
        this.f17143a = loginLiteReq;
        this.f17144b = jsCallback;
    }
}
