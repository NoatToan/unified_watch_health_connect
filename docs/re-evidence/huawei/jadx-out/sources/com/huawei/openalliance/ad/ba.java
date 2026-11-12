package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ba extends ai {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        final com.huawei.openalliance.ad.inter.data.j jVarD = d(context, str);
        final int[] iArr = {-1};
        boolean zOptBoolean = new JSONObject(str).optBoolean(JsbMapKeyNames.ALLOWED_NON_WIFI_NETWORK, false);
        if (jVarD == null) {
            a(remoteCallResultCallback, this.f19295a, 1000, Integer.valueOf(iArr[0]), true);
            return;
        }
        if (jVarD.getAppInfo() != null) {
            jVarD.getAppInfo().setAllowedNonWifiNetwork(zOptBoolean);
        }
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.ba.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    iArr[0] = ba.this.e(context, str).b(context, jVarD);
                } catch (Throwable unused) {
                }
                j.a(remoteCallResultCallback, ba.this.f19295a, 1000, Integer.valueOf(iArr[0]), true);
            }
        });
    }

    public ba() {
        super("pps.download.resume");
    }
}
