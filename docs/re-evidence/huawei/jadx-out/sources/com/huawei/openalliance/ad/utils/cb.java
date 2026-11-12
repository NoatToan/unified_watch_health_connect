package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.Pair;
import com.huawei.hms.network.embedded.g2;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.operation.utils.Constants;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class cb {
    private static int a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 4;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 5;
            case 13:
            case 18:
                return 6;
            case 19:
            default:
                return 0;
            case 20:
                return 7;
        }
    }

    private static Context h(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    private static Pair<Integer, Pair<String, String>> g(Context context) {
        String strSubstring;
        String strSubstring2;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperator = telephonyManager.getNetworkOperator();
                int networkType = 0;
                if (networkOperator == null || Constants.NULL.equalsIgnoreCase(networkOperator) || networkOperator.length() <= 3) {
                    strSubstring = null;
                    strSubstring2 = null;
                } else {
                    strSubstring2 = networkOperator.substring(0, 3);
                    strSubstring = networkOperator.substring(3);
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    networkType = activeNetworkInfo.getSubtype();
                }
                if (networkType == 0) {
                    networkType = telephonyManager.getNetworkType();
                }
                return a(strSubstring2, strSubstring, networkType);
            }
        } catch (Throwable th) {
            hw.c("NetworkUtil", "getDefaultNetworkOperatorInfo error: %s", th.getClass().getSimpleName());
        }
        return null;
    }

    public static Pair<Integer, Pair<String, String>> f(Context context) {
        Pair<Integer, Pair<String, String>> pairA = null;
        if (!HiAd.getInstance(context).isEnableUserInfo()) {
            return null;
        }
        if (!d.d() && bw.b(context)) {
            hw.b("NetworkUtil", "multicard device");
            bv bvVarA = bw.a(context);
            pairA = bvVarA.a(bvVarA.a());
        }
        return pairA == null ? g(context) : pairA;
    }

    public static boolean e(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || h(context) == null || (connectivityManager = (ConnectivityManager) h(context).getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(connectivityManager.getActiveNetwork());
            return networkInfo != null && networkInfo.isConnected();
        } catch (Throwable unused) {
            hw.c("NetworkUtil", "fail to check network connection");
        }
    }

    public static int d(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || h(context) == null || (connectivityManager = (ConnectivityManager) h(context).getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo networkInfoA = a(connectivityManager);
            if (networkInfoA != null) {
                int type = networkInfoA.getType();
                if (type == 0) {
                    return a(networkInfoA.getSubtype());
                }
                if (9 == type) {
                    return 1;
                }
                if (1 == type) {
                    return 2;
                }
            }
        } catch (Throwable unused) {
            hw.c("NetworkUtil", "fail to get network info");
        }
        return 0;
    }

    public static boolean c(Context context) {
        return a(context) || b(context);
    }

    public static boolean b(Context context) {
        return context != null && 1 == d(context);
    }

    public static boolean b() {
        return cr.b(g2.h) || cr.c(g2.h);
    }

    public static boolean a(Context context) {
        return context != null && 2 == d(context);
    }

    public static boolean a() {
        try {
            ca.a();
            return true;
        } catch (Throwable th) {
            hw.c("NetworkUtil", "isNetWorKkitSupported Exception:" + th.getClass().getSimpleName());
            return false;
        }
    }

    public static HttpClient.Builder a(Context context, boolean z) {
        HttpClient.Builder builder = new HttpClient.Builder();
        if (!z) {
            return builder;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("smallpkt_fec", true);
            jSONObject.put("tls_zero_rtt", true);
            String str = dd.b(ab.i(context)) + File.separator + com.huawei.openalliance.ad.constant.Constants.PPS_ROOT_PATH + File.separator + g2.QUIC;
            ai.g(new File(str));
            jSONObject.put("storage_path", str);
            jSONObject.put("max_server_configs_stored_properties", 10);
        } catch (JSONException unused) {
            Log.w("NetworkUtil", "jsonObject catch a JSONException");
        }
        builder.enableQuic(true).options(jSONObject.toString());
        return builder;
    }

    private static Pair<Integer, Pair<String, String>> a(String str, String str2, int i) {
        return new Pair<>(Integer.valueOf(i), new Pair(str, str2));
    }

    public static NetworkInfo a(ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            return null;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(connectivityManager.getActiveNetwork());
        return (networkInfo == null || 17 != networkInfo.getType()) ? networkInfo : connectivityManager.getActiveNetworkInfo();
    }
}
