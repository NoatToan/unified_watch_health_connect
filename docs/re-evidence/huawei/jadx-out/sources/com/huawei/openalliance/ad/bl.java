package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* JADX INFO: loaded from: classes12.dex */
public class bl extends bc {
    @Override // com.huawei.openalliance.ad.bc
    protected String b() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.a("JsbReportPraiseEvent", "start");
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB == null) {
            hw.c("JsbReportPraiseEvent", "%s: content is null", b());
        } else {
            b(context).a(contentRecordB);
            b(remoteCallResultCallback, true);
        }
    }

    public bl() {
        super("pps.event.praise");
    }
}
