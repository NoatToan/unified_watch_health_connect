package com.huawei.wallet.proxy.service.localbroadcastmgr;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes45.dex */
public interface ILocalBroadcastMgr {
    void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

    boolean sendBroadcast(Intent intent);

    void sendBroadcastSync(Intent intent);

    void unregisterReceiver(BroadcastReceiver broadcastReceiver);
}
