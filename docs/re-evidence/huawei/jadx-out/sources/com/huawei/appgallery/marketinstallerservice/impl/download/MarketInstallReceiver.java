package com.huawei.appgallery.marketinstallerservice.impl.download;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.appgallery.marketinstallerservice.api.FailResultParam;
import com.huawei.appgallery.marketinstallerservice.api.InstallCallback;
import com.huawei.appgallery.marketinstallerservice.api.MarketInfo;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import defpackage.bie;
import defpackage.bir;

/* JADX INFO: loaded from: classes23.dex */
public class MarketInstallReceiver extends SafeBroadcastReceiver {
    @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
    public void onReceiveMsg(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("callback_key");
        InstallCallback installCallbackD = bie.d(stringExtra);
        MarketInfo marketInfoB = bie.b(stringExtra);
        if (installCallbackD == null) {
            bir.e("MarketInstallReceiver", "market install callback is null!");
            return;
        }
        int i = extras.getInt("android.content.pm.extra.STATUS");
        if (i == 0) {
            installCallbackD.onSuccess(marketInfoB);
        } else {
            FailResultParam failResultParam = new FailResultParam();
            failResultParam.setResult(-2);
            failResultParam.setReason(i);
            failResultParam.setMarketInfo(marketInfoB);
            installCallbackD.onFailed(failResultParam);
        }
        bie.c(stringExtra);
        bie.a(stringExtra);
    }
}
