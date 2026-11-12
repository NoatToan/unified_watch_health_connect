package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class az extends ai {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        com.huawei.openalliance.ad.inter.data.j jVarD = d(context, str);
        if (jVarD == null || jVarD.getAppInfo() == null) {
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
            return;
        }
        com.huawei.openalliance.ad.download.ag.e.a(context).a(a(context, jVarD.getAppInfo(), jVarD.a()));
        b(remoteCallResultCallback, true);
    }

    private AppDownloadTask a(Context context, AppInfo appInfo, ContentRecord contentRecord) {
        pc pcVar;
        if (contentRecord != null) {
            pcVar = new pc(context, sw.a(context, contentRecord.f()));
            pcVar.a(contentRecord);
        } else {
            pcVar = null;
        }
        AppDownloadTask appDownloadTaskA = new AppDownloadTask.a().a(pcVar).a(appInfo).a();
        appDownloadTaskA.e(contentRecord.aQ());
        appDownloadTaskA.n(contentRecord.l());
        appDownloadTaskA.k(contentRecord.n());
        appDownloadTaskA.m(contentRecord.o());
        return appDownloadTaskA;
    }

    public az() {
        super("pps.download.reserveapp");
    }
}
