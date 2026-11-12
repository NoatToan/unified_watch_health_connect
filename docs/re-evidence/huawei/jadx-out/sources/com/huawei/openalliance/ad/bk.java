package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class bk extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.a("JsbReportPlayTimeEvent", "start");
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.utils.bk.a(str, AdEventReport.class, new Class[0]);
        rc rcVarD = d(context, str);
        if (rcVarD != null) {
            rcVarD.a(adEventReport.o() == null ? 0L : adEventReport.o().longValue());
        }
        b(remoteCallResultCallback, true);
    }

    public bk() {
        super("pps.event.show");
    }
}
