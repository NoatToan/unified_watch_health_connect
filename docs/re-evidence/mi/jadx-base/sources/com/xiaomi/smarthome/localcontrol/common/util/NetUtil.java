package com.xiaomi.smarthome.localcontrol.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;

/* JADX INFO: loaded from: classes2.dex */
public class NetUtil {
    public static final String MIOT_API_HOST = "https://api.io.mi.com/app";

    public static boolean isWifiConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }
}
