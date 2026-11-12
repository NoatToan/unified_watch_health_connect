package com.huawei.hwcloudjs;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class b implements com.huawei.hwcloudjs.d.a.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f17034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f17035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f17036c;
    final /* synthetic */ JSONObject d;
    final /* synthetic */ HWCloudJSBridge e;

    @Override // com.huawei.hwcloudjs.d.a.c.a
    public void a(int i) {
        if (i == 0) {
            com.huawei.hwcloudjs.f.d.c("HWCloudJSBridge", "configAuthSUC", true);
            this.e.b(this.f17034a, this.f17035b, this.f17036c, this.d);
            e.a(this.e.f17020b);
            return;
        }
        if (i == -2) {
            com.huawei.hwcloudjs.f.d.b("HWCloudJSBridge", "AUTH_FAIL_NO_NET", true);
            e.a(this.e.f17020b, 12);
            return;
        }
        if (i == -1) {
            com.huawei.hwcloudjs.f.d.b("HWCloudJSBridge", "AUTH_FAIL", true);
            e.a(this.e.f17020b, 10);
            return;
        }
        if (i == -3) {
            com.huawei.hwcloudjs.f.d.b("HWCloudJSBridge", "AUTH_FAIL_NET_ERROR", true);
            e.a(this.e.f17020b, 11);
            return;
        }
        if (i == -4) {
            com.huawei.hwcloudjs.f.d.b("HWCloudJSBridge", "AUTH_FAIL_OTHER", true);
            e.a(this.e.f17020b, 9999);
            return;
        }
        com.huawei.hwcloudjs.f.d.b("HWCloudJSBridge", "JS_CONFIG_RET_CODE_GW_ERROR" + i, true);
        e.a(this.e.f17020b, 14, i + "");
    }

    b(HWCloudJSBridge hWCloudJSBridge, String str, String str2, List list, JSONObject jSONObject) {
        this.e = hWCloudJSBridge;
        this.f17034a = str;
        this.f17035b = str2;
        this.f17036c = list;
        this.d = jSONObject;
    }
}
