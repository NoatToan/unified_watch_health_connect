package com.huawei.wear.wallet.proxy.broadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.wallet.proxy.InitWalletProxy;
import defpackage.xnd;

/* JADX INFO: loaded from: classes46.dex */
public class ForegroundStatusChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b();
    }

    private void b() {
        try {
            xnd.d("ForegroundStatusChangeReceiver", "doReceiver");
            try {
                InitWalletProxy initWalletProxyE = InitWalletProxy.e();
                if (initWalletProxyE != null) {
                    initWalletProxyE.receiverData("101", HiAnalyticsConstant.KeyAndValue.NUMBER_01);
                }
            } catch (ClassNotFoundException unused) {
                xnd.d("ForegroundStatusChangeReceiver", "onBind, not PluginAvailable");
            }
        } catch (Exception unused2) {
            xnd.a("ForegroundStatusChangeReceiver", "onReceive exception");
        }
    }
}
