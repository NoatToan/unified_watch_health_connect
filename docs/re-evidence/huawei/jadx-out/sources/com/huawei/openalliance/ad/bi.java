package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class bi extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.a("JsbReportPlayResumeEvent", "start");
        rc rcVarD = d(context, str);
        if (rcVarD != null) {
            rcVarD.f();
        }
        b(remoteCallResultCallback, true);
    }

    public bi() {
        super("pps.event.show");
    }
}
