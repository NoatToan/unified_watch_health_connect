package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class aj extends ai {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        com.huawei.openalliance.ad.inter.data.j jVarD = d(context, str);
        if (jVarD == null) {
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
        } else {
            e(context, str).d(context, jVarD);
            b(remoteCallResultCallback, true);
        }
    }

    public aj() {
        super("pps.download.cancel");
    }
}
