package com.xiaomi.smarthome.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.format.Formatter;
import com.example.statistics.export.OneTrackConstant;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class MiRouterUtils {
    public static ArrayList<String> getWifiBroadcastAddress(Context context) {
        InetAddress wifiBroadcastAddressInner = getWifiBroadcastAddressInner(context);
        if (wifiBroadcastAddressInner != null) {
            try {
                byte[] bytes = "What?".getBytes("UTF-8");
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, wifiBroadcastAddressInner, 988);
                DatagramSocket datagramSocket = new DatagramSocket();
                datagramSocket.setSoTimeout(5000);
                datagramSocket.send(datagramPacket);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                byte[] bArr = new byte[1024];
                ArrayList<String> arrayList = new ArrayList<>();
                do {
                    try {
                        DatagramPacket datagramPacket2 = new DatagramPacket(bArr, 1024);
                        datagramSocket.receive(datagramPacket2);
                        arrayList.add(new String(bArr, 0, datagramPacket2.getLength(), "UTF-8"));
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        SystemClock.elapsedRealtime();
                        throw th;
                    }
                } while (SystemClock.elapsedRealtime() - jElapsedRealtime < 5000);
                return arrayList;
            } catch (Exception unused2) {
            }
        }
        return new ArrayList<>();
    }

    @SuppressLint({"MissingPermission"})
    public static InetAddress getWifiBroadcastAddressInner(Context context) {
        NetworkInfo activeNetworkInfo;
        DhcpInfo dhcpInfo;
        if (context != null && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo()) != null && activeNetworkInfo.getType() == 1 && (dhcpInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getDhcpInfo()) != null) {
            int i = dhcpInfo.ipAddress;
            int i2 = dhcpInfo.netmask;
            int i3 = (~i2) | (i & i2);
            byte[] bArr = new byte[4];
            for (int i4 = 0; i4 < 4; i4++) {
                bArr[i4] = (byte) ((i3 >> (i4 * 8)) & 255);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static String getWifiGateWayIp(Context context) {
        DhcpInfo dhcpInfo;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1 || (dhcpInfo = ((WifiManager) context.getSystemService("wifi")).getDhcpInfo()) == null) {
            return null;
        }
        return Formatter.formatIpAddress(dhcpInfo.gateway);
    }
}
