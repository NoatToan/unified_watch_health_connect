package com.thanosfisherman.wifiutils.wifiState;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public final class WifiStateReceiver extends BroadcastReceiver {

    @NonNull
    private final WifiStateCallback a;

    public WifiStateReceiver(@NonNull WifiStateCallback wifiStateCallback) {
        this.a = wifiStateCallback;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, @NonNull Intent intent) {
        if (intent.getIntExtra("wifi_state", 0) != 3) {
            return;
        }
        this.a.onWifiEnabled();
    }
}
