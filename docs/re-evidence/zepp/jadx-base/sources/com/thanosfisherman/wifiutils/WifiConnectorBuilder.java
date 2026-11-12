package com.thanosfisherman.wifiutils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.thanosfisherman.wifiutils.wifiConnect.ConnectionScanResultsListener;
import com.thanosfisherman.wifiutils.wifiConnect.ConnectionSuccessListener;
import com.thanosfisherman.wifiutils.wifiDisconnect.DisconnectionSuccessListener;
import com.thanosfisherman.wifiutils.wifiRemove.RemoveSuccessListener;
import com.thanosfisherman.wifiutils.wifiScan.ScanResultsListener;
import com.thanosfisherman.wifiutils.wifiState.WifiStateListener;
import com.thanosfisherman.wifiutils.wifiWps.ConnectionWpsListener;

/* JADX INFO: loaded from: classes18.dex */
public interface WifiConnectorBuilder {

    public interface WifiSuccessListener {
        @NonNull
        WifiConnectorBuilder onConnectionResult(@Nullable ConnectionSuccessListener connectionSuccessListener);

        @NonNull
        WifiSuccessListener setTimeout(long j);
    }

    public interface WifiUtilsBuilder {
        void cancelAutoConnect();

        @NonNull
        WifiSuccessListener connectWith(@NonNull String str, @NonNull String str2);

        @NonNull
        WifiSuccessListener connectWith(@NonNull String str, @NonNull String str2, @NonNull String str3);

        @NonNull
        WifiSuccessListener connectWithScanResult(@NonNull String str, @Nullable ConnectionScanResultsListener connectionScanResultsListener);

        @NonNull
        @RequiresApi(api = 21)
        WifiWpsSuccessListener connectWithWps(@NonNull String str, @NonNull String str2);

        void disableWifi();

        void disconnect(@NonNull DisconnectionSuccessListener disconnectionSuccessListener);

        @Deprecated
        void disconnectFrom(@NonNull String str, @NonNull DisconnectionSuccessListener disconnectionSuccessListener);

        void enableWifi();

        void enableWifi(WifiStateListener wifiStateListener);

        boolean isWifiConnected();

        boolean isWifiConnected(@NonNull String str);

        void remove(@NonNull String str, @NonNull RemoveSuccessListener removeSuccessListener);

        @NonNull
        WifiConnectorBuilder scanWifi(@Nullable ScanResultsListener scanResultsListener);
    }

    public interface WifiWpsSuccessListener {
        @NonNull
        @RequiresApi(api = 21)
        WifiConnectorBuilder onConnectionWpsResult(@Nullable ConnectionWpsListener connectionWpsListener);

        @NonNull
        WifiWpsSuccessListener setWpsTimeout(long j);
    }

    void start();
}
