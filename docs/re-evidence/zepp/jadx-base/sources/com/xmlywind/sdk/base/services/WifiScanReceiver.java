package com.xmlywind.sdk.base.services;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.Base64;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntityAntiSpan;
import com.xmlywind.sdk.common.utils.DeviceUtils;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class WifiScanReceiver extends BroadcastReceiver {
    private List<ScanResult> a;
    private long b = 0;

    private void a(String str, String str2) {
        PointEntityAntiSpan pointEntityAntiSpan = new PointEntityAntiSpan();
        pointEntityAntiSpan.setCategory(PointCategory.WIFI_LIST);
        pointEntityAntiSpan.setAc_type("101");
        pointEntityAntiSpan.setWifi_id_list(str);
        pointEntityAntiSpan.setWifi_mac_list(str2);
        pointEntityAntiSpan.commit();
    }

    @SuppressLint({"MissingPermission"})
    public void a(Context context) {
        try {
            WifiManager wifiManagerF = DeviceUtils.f(context);
            if (wifiManagerF != null && wifiManagerF.getWifiState() == 3 && SDKConfig.sharedInstance().getAndroidConfig().up_wifi_list_interval.intValue() >= 60) {
                SigmobLog.d("private :use_wifi ");
                SigmobLog.i("scanResult " + wifiManagerF.startScan());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"MissingPermission"})
    public void onReceive(Context context, Intent intent) {
        try {
            WifiManager wifiManagerF = DeviceUtils.f(context);
            if (wifiManagerF == null) {
                return;
            }
            SigmobLog.d("private :use_wifi");
            String action = intent.getAction();
            byte b = -1;
            int iHashCode = action.hashCode();
            if (iHashCode != -1875733435) {
                if (iHashCode == 1878357501 && action.equals("android.net.wifi.SCAN_RESULTS")) {
                    b = 0;
                }
            } else if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                b = 1;
            }
            if (b != 0) {
                if (b != 1) {
                    return;
                }
                a(context);
                return;
            }
            List<ScanResult> scanResults = wifiManagerF.getScanResults();
            int iIntValue = SDKConfig.sharedInstance().getAndroidConfig().up_wifi_list_interval.intValue();
            if (iIntValue >= 60) {
                if (((long) (iIntValue * 1000)) + this.b >= System.currentTimeMillis() || scanResults.isEmpty()) {
                    return;
                }
                this.b = System.currentTimeMillis();
                this.a = scanResults;
                String str = "";
                String str2 = "";
                for (int i = 0; i < this.a.size(); i++) {
                    ScanResult scanResult = this.a.get(i);
                    str = str + Base64.encodeToString(scanResult.SSID.getBytes(), 2);
                    str2 = str2 + scanResult.BSSID;
                    if (i != this.a.size() - 1) {
                        str = str + ",";
                        str2 = str2 + ",";
                    }
                }
                SigmobLog.d("name List " + str);
                SigmobLog.d("mac List " + str2);
                a(str, str2);
            }
        } catch (Throwable th) {
            SigmobLog.e("WifiScanReceiver error", th);
        }
    }
}
