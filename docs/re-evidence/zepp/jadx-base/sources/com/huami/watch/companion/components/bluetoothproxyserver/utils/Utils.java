package com.huami.watch.companion.components.bluetoothproxyserver.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.huami.watch.companion.device.DeviceManager;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes16.dex */
public class Utils {
    private static final String a = "Utils";

    public static byte[] getBytes(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        if (i <= bArr.length && i2 <= bArr.length && i <= i2) {
            int i3 = (i2 - i) + 1;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            return bArr2;
        }
        Log.d(a, "illegal index from: " + i + " to: " + i2 + " src len: " + bArr.length);
        return null;
    }

    public static InetAddress getDNSServerAddr(Context context, int i) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (Build.VERSION.SDK_INT >= 21) {
            int i2 = 0;
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && activeNetworkInfo != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                    for (InetAddress inetAddress : connectivityManager.getLinkProperties(network).getDnsServers()) {
                        int i3 = i2 + 1;
                        if (i2 == i) {
                            return inetAddress;
                        }
                        i2 = i3;
                    }
                }
            }
        }
        try {
            return InetAddress.getByName("114.114.114.114");
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isConnectWithPhone(Context context) {
        DeviceManager manager = DeviceManager.getManager(context);
        return manager.hasBoundDevice() && manager.isBoundDeviceConnected();
    }

    public static int unsigned2ByteToInt(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            Log.w(a, "wrong bytes length return 0");
            return 0;
        }
        return ((bArr[1] & 255) << 0) | ((bArr[0] & 255) << 8);
    }

    public static int unsignedByteToInt(byte b) {
        return b & 255;
    }
}
