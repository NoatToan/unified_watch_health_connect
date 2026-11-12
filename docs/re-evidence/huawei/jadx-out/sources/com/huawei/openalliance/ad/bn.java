package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class bn extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return "JsbReportShowStartEvent";
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.a("JsbReportShowStartEvent", "CmdReportShowStartEvent");
        rc rcVarD = d(context, str);
        if (rcVarD != null) {
            rcVarD.b();
        }
        b(remoteCallResultCallback, true);
    }

    public bn() {
        super("pps.event.showstart");
    }
}
