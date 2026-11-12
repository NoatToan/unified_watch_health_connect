package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class bj extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.a("JsbReportPlayStartEvent", "start");
        rc rcVarD = d(context, str);
        if (rcVarD != null) {
            rcVarD.c();
        }
        b(remoteCallResultCallback, true);
    }

    public bj() {
        super("pps.event.show");
    }
}
