package com.xiaomi.ai.android.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.ai.android.core.e;
import com.xiaomi.ai.api.Network;
import defpackage.ues;
import defpackage.wpe;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public final class NetworkUtils {
    public static final String NETWORK_TYPE_2G = "2G";
    public static final String NETWORK_TYPE_3G = "3G";
    public static final String NETWORK_TYPE_4G = "4G";
    public static final String NETWORK_TYPE_5G = "5G";
    public static final String NETWORK_TYPE_GPRS = "GPRS";
    public static final String NETWORK_TYPE_WIFI = "WIFI";
    public static final String UNKNOWN = "unknown";

    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f10984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f10985b = true;

        /* JADX INFO: renamed from: com.xiaomi.ai.android.utils.NetworkUtils$a$a, reason: collision with other inner class name */
        public class RunnableC0348a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f10986a;

            public RunnableC0348a(Context context) {
                this.f10986a = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                NetworkInfo activeNetworkInfo;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f10986a.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
                if (connectivityManager == null) {
                    wpe.c("NetworkUtils", "onReceive: ConnectivityManager is null", false);
                    return;
                }
                try {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (Exception e) {
                    wpe.c("NetworkUtils", wpe.o(e), false);
                    activeNetworkInfo = null;
                }
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                    if (a.this.f10984a.t() && a.this.f10984a.s().hasMessages(4)) {
                        wpe.f("NetworkUtils", "onReceive: remove MSG_STOP_CHANNEL", false);
                        a.this.f10984a.s().removeMessages(4);
                    }
                    if (!a.this.f10985b) {
                        a.this.f10984a.f().b(!a.this.f10984a.s().hasMessages(3));
                    }
                    a.this.f10985b = true;
                    return;
                }
                wpe.c("NetworkUtils", "onReceive: activeInfo=" + activeNetworkInfo, false);
                a.this.f10985b = false;
                if (a.this.f10984a.t()) {
                    wpe.c("NetworkUtils", "onReceive: send MSG_STOP_CHANNEL", false);
                    a.this.f10984a.s().sendMessageDelayed(a.this.f10984a.s().obtainMessage(4), 1000L);
                }
            }
        }

        public a(e eVar) {
            this.f10984a = eVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                wpe.f("NetworkUtils", "onReceive: CONNECTIVITY_ACTION, type=" + intent.getIntExtra("networkType", -1), false);
                try {
                    ues.f35695a.submit(new RunnableC0348a(context));
                } catch (Exception e) {
                    wpe.c("NetworkUtils", wpe.o(e), false);
                }
            }
        }
    }

    private NetworkUtils() {
    }

    public static Network.NetworkType getBriefNetworkType(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        if (connectivityManager == null) {
            return Network.NetworkType.UNKNOWN;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            wpe.c("NetworkUtils", wpe.o(e), false);
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return Network.NetworkType.WIFI;
            }
            if (activeNetworkInfo.getType() == 0) {
                return Network.NetworkType.DATA;
            }
        }
        return Network.NetworkType.UNKNOWN;
    }

    public static String getCurrentCarrierType(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "unknown" : parseOperatorCode(telephonyManager.getSimOperator());
    }

    public static String getDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime()) + " GMT";
    }

    public static String getNetworkType(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager == null) {
            return null;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            wpe.c("NetworkUtils", wpe.o(e), false);
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected()) {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? "none-airplane" : "none";
        }
        if (activeNetworkInfo.getType() == 1) {
            return NETWORK_TYPE_WIFI;
        }
        if (activeNetworkInfo.getType() != 0) {
            return activeNetworkInfo.getTypeName();
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 20) {
            return NETWORK_TYPE_5G;
        }
        switch (subtype) {
            case 1:
                return NETWORK_TYPE_GPRS;
            case 2:
            case 4:
            case 7:
            case 11:
                return NETWORK_TYPE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return NETWORK_TYPE_3G;
            case 13:
                return NETWORK_TYPE_4G;
            default:
                String subtypeName = activeNetworkInfo.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? NETWORK_TYPE_3G : subtypeName;
        }
    }

    public static int getWifiLevel(Context context) {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
            try {
                return WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 5);
            } catch (Exception e) {
                wpe.c("NetworkUtils", wpe.o(e), false);
            }
        }
        return 0;
    }

    public static native synchronized boolean ipv6Available();

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        if (connectivityManager == null) {
            return false;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            wpe.c("NetworkUtils", wpe.o(e), false);
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
    }

    public static String parseOperatorCode(String str) {
        return (str == null || "".equals(str)) ? "unknown" : str;
    }
}
