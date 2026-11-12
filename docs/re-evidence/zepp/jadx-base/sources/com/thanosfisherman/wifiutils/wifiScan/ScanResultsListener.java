package com.thanosfisherman.wifiutils.wifiScan;

import android.net.wifi.ScanResult;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface ScanResultsListener {
    void onScanResults(@NonNull List<ScanResult> list);
}
