package com.huawei.hwcloudjs.service.auth.bean;

import android.text.TextUtils;
import com.huawei.hwcloudjs.f.d;
import com.huawei.hwcloudjs.service.http.annotation.RequestField;

/* JADX INFO: loaded from: classes37.dex */
public class a extends com.huawei.hwcloudjs.d.b.a.a<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17123b = "AuthRequestBean";

    @RequestField("appid")
    private String appId;

    @RequestField("nsp_svc")
    private String nspSvc = "nsp.scope.app.get";

    @RequestField("type")
    private String type = "9";

    public String i() {
        return this.type;
    }

    public String h() {
        return this.nspSvc;
    }

    public String g() {
        return this.appId;
    }

    @Override // com.huawei.hwcloudjs.d.b.a.b
    public String d() {
        String strC = com.huawei.hwcloudjs.d.c.a.a.b().c();
        d.c(f17123b, "genUrl url:" + strC, false);
        if (TextUtils.isEmpty(strC)) {
            d.b(f17123b, "AuthRequest url is empty!", true);
        }
        return strC;
    }

    public void c(String str) {
        this.type = str;
    }

    @Override // com.huawei.hwcloudjs.d.b.a.b
    public b c() {
        return new b();
    }

    public void b(String str) {
        this.nspSvc = str;
    }

    public void a(String str) {
        this.appId = str;
    }

    public a(String str) {
        this.appId = str;
    }

    public a() {
    }
}
