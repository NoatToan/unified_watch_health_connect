package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class ax extends ai {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        com.huawei.openalliance.ad.inter.data.j jVarD = d(context, str);
        a(remoteCallResultCallback, this.f19295a, 1000, Integer.valueOf(jVarD != null ? com.huawei.hms.ads.jsb.a.a(context).a().f(context, jVarD) : 0), true);
    }

    public ax() {
        super("pps.download.progress");
    }
}
