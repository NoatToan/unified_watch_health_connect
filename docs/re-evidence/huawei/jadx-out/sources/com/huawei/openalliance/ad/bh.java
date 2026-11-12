package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class bh extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.a("JsbReportShowEvent", "start");
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.utils.bk.a(str, AdEventReport.class, new Class[0]);
        rc rcVarD = d(context, str);
        if (rcVarD != null && adEventReport != null) {
            rcVarD.b(adEventReport.e() == null ? 0L : adEventReport.e().longValue(), adEventReport.f() != null ? adEventReport.f().longValue() : 0L, adEventReport.g() == null ? 0 : adEventReport.g().intValue(), adEventReport.h() != null ? adEventReport.h().intValue() : 0);
        }
        b(remoteCallResultCallback, true);
    }

    public bh() {
        super("pps.event.show");
    }
}
