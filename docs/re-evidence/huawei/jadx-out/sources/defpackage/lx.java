package defpackage;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.ab;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.x;
import com.alipay.sdk.m.g0.a;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class lx implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static DataReportResult f41001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static lx f41002c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f41003a;
    public BugTrackMessageService d;
    public DataReportService e;

    @Override // com.alipay.sdk.m.g0.a
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        String strLogCollect;
        if (kj.c(str) || (bugTrackMessageService = this.d) == null) {
            return false;
        }
        try {
            strLogCollect = bugTrackMessageService.logCollect(kj.h(str));
        } catch (Throwable unused) {
            strLogCollect = null;
        }
        if (kj.c(strLogCollect)) {
            return false;
        }
        return ((Boolean) new JSONObject(strLogCollect).get("success")).booleanValue();
    }

    @Override // com.alipay.sdk.m.g0.a
    public DataReportResult a(DataReportRequest dataReportRequest) throws InterruptedException {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.e != null) {
            f41001b = null;
            new Thread(new lz(this, dataReportRequest)).start();
            for (int i = 300000; f41001b == null && i >= 0; i -= 50) {
                Thread.sleep(50L);
            }
        }
        return f41001b;
    }

    public static lx c(Context context, String str) {
        lx lxVar;
        synchronized (lx.class) {
            if (f41002c == null) {
                f41002c = new lx(context, str);
            }
            lxVar = f41002c;
        }
        return lxVar;
    }

    public lx(Context context, String str) {
        this.f41003a = null;
        this.d = null;
        this.e = null;
        ab abVar = new ab();
        abVar.a(str);
        h hVar = new h(context);
        this.f41003a = hVar;
        this.d = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, abVar);
        this.e = (DataReportService) this.f41003a.a(DataReportService.class, abVar);
    }
}
