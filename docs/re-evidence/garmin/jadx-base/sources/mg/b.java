package mg;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.aa;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f118359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static DataReportResult f118360d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BugTrackMessageService f118361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataReportService f118362b;

    public b(Context context, String str) {
        this.f118361a = null;
        this.f118362b = null;
        aa aaVar = new aa();
        aaVar.a(str);
        h hVar = new h(context);
        this.f118361a = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, aaVar);
        this.f118362b = (DataReportService) hVar.a(DataReportService.class, aaVar);
    }
}
