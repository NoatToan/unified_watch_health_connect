package com.ximalaya.ting.android.opensdk.player.receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Parcelable;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.opensdk.util.NetworkType;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: loaded from: classes22.dex */
public class NetWorkChangeReceiver extends BroadcastReceiver {
    private static final String TAG = "SNetWorkChangeReceiver";
    public static boolean isMobileType = false;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Parcelable parcelableExtra;
        if (ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            if (NetworkType.isConnectMOBILE(context)) {
                if (!isMobileType) {
                    Logger.i(TAG, "startTrafficStatistic");
                }
                Logger.e(TAG, "connect to mobile");
                isMobileType = true;
            } else if (NetworkType.isConnectToWifi(context)) {
                if (isMobileType) {
                    Logger.i(TAG, "endTrafficStatistic");
                }
                Logger.e(TAG, "connect to wifi");
                isMobileType = false;
            }
        }
        if (!"android.net.wifi.STATE_CHANGE".equals(intent.getAction()) || (parcelableExtra = intent.getParcelableExtra("networkInfo")) == null) {
            return;
        }
        NetworkInfo networkInfo = (NetworkInfo) parcelableExtra;
        if ((networkInfo.getState() == NetworkInfo.State.CONNECTED) && networkInfo.getType() == 1) {
            if (isMobileType) {
                Logger.i(TAG, "endTrafficStatistic");
            }
            Logger.e(TAG, "connect to wifi");
            isMobileType = false;
        }
    }
}
