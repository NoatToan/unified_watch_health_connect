package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
class t extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB == null) {
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
        } else {
            a(remoteCallResultCallback, this.f19295a, 1000, Integer.valueOf(com.huawei.openalliance.ad.utils.as.a(context, contentRecordB) ? 0 : -1), true);
        }
    }

    public t() {
        super("pps.process.whythisad");
    }
}
