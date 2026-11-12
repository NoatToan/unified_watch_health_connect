package com.miui.tsmclient.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;
import com.miui.tsmclient.common.net.host.AssetsHost;
import com.miui.tsmclient.net.AuthRequest;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes6.dex */
public final class NetworkUtil {
    private static final String HTML_SERVER_ONLINE = "https://sf.pay.xiaomi.com/";
    private static final String HTML_SERVER_STAGING = "https://staging1.sf.pay.xiaomi.com/";
    private static final String HTML_SERVER_STAGING_EXTERNAL = "https://staging-external.sf.pay.xiaomi.com/";
    private static final String URL_CARD_DETAIL_HELP = "views/commonQuestion/help_%1$s/";
    private static final String URL_COMMON_HELP = "views/commonQuestion/common_help/index.html";
    private static final String URL_TRANSFER_PROTOCOL = "views/transferCardProtocol/%1$s.html";
    public static final String URL_XIAOMI_HOST = "https://cdn.fds.api.xiaomi.com/mipay.nextpay/app/";

    public static String getCommonHelpUrl() {
        return AuthRequest.AuthRequestBuilder.newBuilder(null, new AssetsHost(), URL_COMMON_HELP, null).create().getRequestFullUrl();
    }

    public static String getHtml(String str) {
        if (!EnvironmentConfig.isStaging()) {
            return HTML_SERVER_ONLINE + str;
        }
        if (EnvironmentConfig.isStagingExternal()) {
            return HTML_SERVER_STAGING_EXTERNAL + str;
        }
        return HTML_SERVER_STAGING + str;
    }

    public static String getLocalIpAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress()) {
                        return inetAddressNextElement.getHostAddress().toString();
                    }
                }
            }
            return "";
        } catch (SocketException e) {
            LogUtils.e("WifiPreference IpAddress", e);
            return "";
        }
    }

    public static int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -1;
    }

    public static String getTransCardHelpUrl(String str) {
        return AuthRequest.AuthRequestBuilder.newBuilder(null, new AssetsHost(), String.format(URL_CARD_DETAIL_HELP, str.toLowerCase()), null).create().getRequestFullUrl();
    }

    public static String getTransferProtocolUrl(String str) {
        return AuthRequest.AuthRequestBuilder.newBuilder(null, new AssetsHost(), String.format(URL_TRANSFER_PROTOCOL, str.toLowerCase()), null).create().getRequestFullUrl();
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isMobileConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
    }

    public static boolean isNetworkMetered(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.isActiveNetworkMetered();
    }

    public static boolean isWifiConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected()) && !connectivityManager.isActiveNetworkMetered();
    }
}
