package com.alipay.security.mobile.module.http;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.aa;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.w;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.xiaomi.fitness.sync.init.SyncComponent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {
    public static b d;
    public static DataReportResult e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f5935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BugTrackMessageService f5936b;
    public DataReportService c;

    public b(Context context, String str) {
        this.f5935a = null;
        this.f5936b = null;
        this.c = null;
        aa aaVar = new aa();
        aaVar.a(str);
        h hVar = new h(context);
        this.f5935a = hVar;
        this.f5936b = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, aaVar);
        this.c = (DataReportService) this.f5935a.a(DataReportService.class, aaVar);
    }

    public static synchronized b b(Context context, String str) {
        try {
            if (d == null) {
                d = new b(context, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    @Override // com.alipay.security.mobile.module.http.a
    public DataReportResult a(DataReportRequest dataReportRequest) throws InterruptedException {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.c != null) {
            e = null;
            new Thread(new c(this, dataReportRequest)).start();
            for (int i = SyncComponent.SYNC_WIFI_TIME; e == null && i >= 0; i -= 50) {
                Thread.sleep(50L);
            }
        }
        return e;
    }

    @Override // com.alipay.security.mobile.module.http.a
    public boolean a(String str) {
        BugTrackMessageService bugTrackMessageService;
        String strLogCollect;
        if (com.alipay.security.mobile.module.a.a.d(str) || (bugTrackMessageService = this.f5936b) == null) {
            return false;
        }
        try {
            strLogCollect = bugTrackMessageService.logCollect(com.alipay.security.mobile.module.a.a.k(str));
        } catch (Throwable unused) {
            strLogCollect = null;
        }
        if (com.alipay.security.mobile.module.a.a.d(strLogCollect)) {
            return false;
        }
        return ((Boolean) new JSONObject(strLogCollect).get("success")).booleanValue();
    }
}
