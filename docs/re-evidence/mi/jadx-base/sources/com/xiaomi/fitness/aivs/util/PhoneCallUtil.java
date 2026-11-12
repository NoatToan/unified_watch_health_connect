package com.xiaomi.fitness.aivs.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallUtil {

    public enum NetworkType {
        WIFI,
        DATA,
        NONE
    }

    public static NetworkType a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return NetworkType.NONE;
        }
        return connectivityManager.isActiveNetworkMetered() ? NetworkType.DATA : NetworkType.WIFI;
    }
}
