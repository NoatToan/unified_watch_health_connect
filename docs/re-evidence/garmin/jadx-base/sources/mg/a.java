package mg;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes7.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataReportRequest f118357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f118358b;

    public a(b bVar, DataReportRequest dataReportRequest) {
        this.f118358b = bVar;
        this.f118357a = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b.f118360d = this.f118358b.f118362b.reportData(this.f118357a);
        } catch (Throwable th3) {
            DataReportResult dataReportResult = new DataReportResult();
            b.f118360d = dataReportResult;
            dataReportResult.success = false;
            StringBuilder sb3 = new StringBuilder("static data rpc upload error, ");
            StringWriter stringWriter = new StringWriter();
            th3.printStackTrace(new PrintWriter(stringWriter));
            sb3.append(stringWriter.toString());
            dataReportResult.resultCode = sb3.toString();
            StringWriter stringWriter2 = new StringWriter();
            th3.printStackTrace(new PrintWriter(stringWriter2));
            stringWriter2.toString();
        }
    }
}
