package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class bm extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.a("JsbReportShowEvent", "start");
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB == null) {
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
            return;
        }
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.utils.bk.a(str, AdEventReport.class, new Class[0]);
        rc rcVarD = d(context, str);
        if (rcVarD == null || adEventReport == null) {
            a(remoteCallResultCallback, this.f19295a, 3001, null, true);
            return;
        }
        if (adEventReport.a()) {
            rcVarD.a(adEventReport.b() == null ? 0L : adEventReport.b().longValue(), adEventReport.c() != null ? adEventReport.c().intValue() : 0);
            a(remoteCallResultCallback, this.f19295a, 200, null, true);
        } else if (!a(context, contentRecordB)) {
            hw.a("JsbReportShowEvent", "ad is not in whitelist");
            a(remoteCallResultCallback, this.f19295a, 3004, null, true);
        } else {
            com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
            c0229a.a(adEventReport.b()).a(adEventReport.c()).b(adEventReport.d()).a(h(new JSONObject(str).optString("versionCode"))).e(e(str)).a(adEventReport.n());
            rcVarD.a(c0229a.a());
            a(remoteCallResultCallback, this.f19295a, 200, null, true);
        }
    }

    public bm() {
        super("pps.event.show");
    }
}
