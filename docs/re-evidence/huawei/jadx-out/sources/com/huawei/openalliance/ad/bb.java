package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class bb extends ai {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB == null) {
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
            return;
        }
        boolean zOptBoolean = new JSONObject(str).optBoolean(JsbMapKeyNames.ALLOWED_NON_WIFI_NETWORK, false);
        if (!a(context, contentRecordB)) {
            a(remoteCallResultCallback, this.f19295a, 3004, null, true);
            return;
        }
        final int[] iArr = {-1};
        final com.huawei.openalliance.ad.inter.data.j jVarA = a(contentRecordB);
        if (jVarA == null) {
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
            return;
        }
        if (jVarA.getAppInfo() != null) {
            jVarA.getAppInfo().setAllowedNonWifiNetwork(zOptBoolean);
        }
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.bb.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    iArr[0] = bb.this.e(context, str).a(context, jVarA);
                } catch (Throwable unused) {
                }
                j.a(remoteCallResultCallback, bb.this.f19295a, 1000, Integer.valueOf(iArr[0]), true);
            }
        });
    }

    public bb() {
        super("pps.download.start");
    }
}
