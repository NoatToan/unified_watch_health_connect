package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class be extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return "JsbReportCloseEvent";
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.a("JsbReportCloseEvent", "start");
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.utils.bk.a(str, AdEventReport.class, new Class[0]);
        List<String> listL = adEventReport != null ? adEventReport.l() : null;
        rc rcVarD = d(context, str);
        if (rcVarD != null) {
            rcVarD.a(0, 0, listL);
        }
        b(remoteCallResultCallback, true);
    }

    public be() {
        super("pps.event.close");
    }
}
