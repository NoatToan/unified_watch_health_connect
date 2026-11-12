package com.huawei.maps.offlinedata.service.network;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;

/* JADX INFO: loaded from: classes12.dex */
public class a extends SafeBroadcastReceiver {
    @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
    public void onReceiveMsg(Context context, Intent intent) {
        int networkType = NetworkUtil.getNetworkType(context);
        g.c("NetTypeReceiver", "NetTypeReceiver onReceiveMsg: " + networkType);
        com.huawei.maps.offlinedata.jsbridge.b.a().a("configHolder.network", String.valueOf(networkType));
        if (networkType == 1) {
            com.huawei.maps.offlinedata.service.download.b.b().c().set(false);
        }
        if (com.huawei.maps.offlinedata.service.a.a().b()) {
            return;
        }
        if (networkType != 1) {
            com.huawei.maps.offlinedata.service.a.a().d();
        } else {
            com.huawei.maps.offlinedata.service.a.a().g();
            com.huawei.maps.offlinedata.service.a.a().f();
        }
    }
}
