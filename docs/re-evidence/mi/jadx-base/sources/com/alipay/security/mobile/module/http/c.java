package com.alipay.security.mobile.module.http;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: loaded from: classes.dex */
class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataReportRequest f5937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f5938b;

    public c(b bVar, DataReportRequest dataReportRequest) {
        this.f5938b = bVar;
        this.f5937a = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DataReportResult unused = b.e = this.f5938b.c.reportData(this.f5937a);
        } catch (Throwable th) {
            DataReportResult unused2 = b.e = new DataReportResult();
            b.e.success = false;
            b.e.resultCode = "static data rpc upload error, " + com.alipay.security.mobile.module.a.a.b(th);
            com.alipay.security.mobile.module.a.a.b(th);
        }
    }
}
