package com.huawei.health.suggestion.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.health.courseplanservice.api.SportServiceApi;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.btt;
import health.compact.a.CommonUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes31.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("Suggestion_NetworkStateReceiver", "Receive network status change broadcast");
        if (intent == null) {
            LogUtil.j("Suggestion_NetworkStateReceiver", "intent == null");
        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && CommonUtil.ab(context)) {
            LogUtil.a("Suggestion_NetworkStateReceiver", "Network status changed, and there is network, start data synchronization service");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.receiver.NetworkStateReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    SportServiceApi sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class);
                    if (sportServiceApi == null) {
                        LogUtil.j("Suggestion_NetworkStateReceiver", "onReceive sportServiceApi is null.");
                    } else {
                        sportServiceApi.syncData();
                        LogUtil.a("Suggestion_NetworkStateReceiver", "syncData() end");
                    }
                }
            });
        }
    }
}
