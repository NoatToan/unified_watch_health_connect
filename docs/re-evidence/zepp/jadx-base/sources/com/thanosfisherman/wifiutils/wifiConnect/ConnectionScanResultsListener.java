package com.thanosfisherman.wifiutils.wifiConnect;

import android.net.wifi.ScanResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface ConnectionScanResultsListener {
    @Nullable
    ScanResult onConnectWithScanResult(@NonNull List<ScanResult> list);
}
