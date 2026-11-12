package com.huawei.hms.iapfull.pay;

import com.alipay.sdk.app.PayTask;
import com.huawei.hms.iapfull.y0;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f13755b;

    @Override // java.lang.Runnable
    public void run() {
        y0.b("ThirdPayHelper", "pay alipay begin");
        PayTask payTask = new PayTask(this.f13755b.f13756a);
        y0.b("ThirdPayHelper", "pay alipay sdk version : " + payTask.getVersion());
        Map<String, String> mapPayV2 = payTask.payV2(this.f13754a, false);
        y0.b("ThirdPayHelper", "pay alipay end");
        m.a(this.f13755b, mapPayV2);
    }

    l(m mVar, String str) {
        this.f13755b = mVar;
        this.f13754a = str;
    }
}
