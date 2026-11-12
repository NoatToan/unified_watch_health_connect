package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.eu;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.na;

/* JADX INFO: loaded from: classes12.dex */
public class t {
    public static void a(final Context context, final int i) {
        hw.b("CaLocSyncUtil", "sync ca type is %d", Integer.valueOf(i));
        if (fp.b(context).c(ConfigMapKeys.QRY_CA_SNAP_INTVL, 5)) {
            hw.a("CaLocSyncUtil", "within sync location interval");
        } else if (!eu.a().b(context)) {
            hw.b("CaLocSyncUtil", "check policy false");
        } else {
            fp.b(context).s(ConfigMapKeys.QRY_CA_SNAP_INTVL);
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.t.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        na naVarA = na.a(context);
                        int i2 = i;
                        naVarA.a(RTCMethods.QUERY_CA_LOCATION, String.valueOf(i2), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.utils.t.1.1
                            @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                            public void onRemoteCallResult(String str, CallResult<String> callResult) {
                                hw.a("CaLocSyncUtil", "sync method execute call");
                                if (callResult == null || callResult.getCode() != 200) {
                                    return;
                                }
                                hw.a("CaLocSyncUtil", "sync ca code:" + callResult.getCode() + " result: " + callResult.getData());
                                if (dg.b(callResult.getData())) {
                                    return;
                                }
                                eu.a().a(callResult.getData());
                            }
                        }, String.class);
                    } catch (Throwable th) {
                        hw.c("CaLocSyncUtil", "sync ca failed: %s", th.getClass().getSimpleName());
                    }
                }
            });
        }
    }
}
