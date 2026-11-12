package com.thanosfisherman.wifiutils.wifiScan;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public class WifiScanReceiver extends BroadcastReceiver {

    @NonNull
    private final WifiScanCallback a;

    public WifiScanReceiver(@NonNull WifiScanCallback wifiScanCallback) {
        this.a = wifiScanCallback;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.onScanResultsReady();
    }
}
