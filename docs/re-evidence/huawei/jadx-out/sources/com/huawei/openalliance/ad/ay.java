package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class ay extends ai {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        com.huawei.openalliance.ad.inter.data.j jVarD = d(context, str);
        AppStatus appStatusE = AppStatus.DOWNLOAD;
        if (jVarD != null) {
            appStatusE = com.huawei.hms.ads.jsb.a.a(context).a().e(context, jVarD);
        }
        a(remoteCallResultCallback, this.f19295a, 1000, a(appStatusE), true);
    }

    private String a(AppStatus appStatus) {
        return appStatus == null ? AppStatus.DOWNLOAD.toString() : appStatus.toString();
    }

    public ay() {
        super("pps.download.status");
    }
}
