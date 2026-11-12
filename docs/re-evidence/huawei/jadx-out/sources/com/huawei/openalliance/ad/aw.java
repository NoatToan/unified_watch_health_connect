package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class aw extends ai {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        com.huawei.openalliance.ad.inter.data.j jVarD = d(context, str);
        int[] iArr = {-1};
        if (jVarD == null) {
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
        } else {
            iArr[0] = e(context, str).c(context, jVarD);
            a(remoteCallResultCallback, this.f19295a, 1000, Integer.valueOf(iArr[0]), true);
        }
    }

    public aw() {
        super("pps.download.pause");
    }
}
