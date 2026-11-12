package defpackage;

import android.util.Log;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: loaded from: classes4.dex */
public class lz implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataReportRequest f41173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lx f41174c;

    @Override // java.lang.Runnable
    public void run() {
        try {
            DataReportResult unused = lx.f41001b = this.f41174c.e.reportData(this.f41173b);
            Log.d("APSecuritySdk", "rpc success");
        } catch (Throwable th) {
            DataReportResult unused2 = lx.f41001b = new DataReportResult();
            lx.f41001b.success = false;
            lx.f41001b.resultCode = "static data rpc upload error, " + kj.e(th);
            Log.d("APSecuritySdk", "rpc failed:" + kj.e(th));
        }
    }

    public lz(lx lxVar, DataReportRequest dataReportRequest) {
        this.f41173b = dataReportRequest;
        this.f41174c = lxVar;
    }
}
