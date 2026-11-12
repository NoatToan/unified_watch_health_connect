package com.unicom.online.account.kernel;

import android.content.Context;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes20.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f31196a = "j";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f31197b = Boolean.TRUE;

    private static String c(Context context, String str, String str2) {
        String strA = al.a(context);
        String strA2 = a();
        if (!an.b(strA2).booleanValue()) {
            return null;
        }
        return "accessCode" + str + str2 + strA + strA2;
    }

    public static void b(Context context, String str, String str2) {
        if (context != null) {
            m.d(context, "accessCode" + str + str2);
        }
    }

    public static boolean a(Context context, String str, String str2, String str3) {
        if (!an.b(str3).booleanValue()) {
            return false;
        }
        String strC = c(context, str, str2);
        if (an.b(strC).booleanValue()) {
            return m.a(context, strC, str3);
        }
        return false;
    }

    public static void a(Context context) {
        if (context != null) {
            m.d(context, "accessCode");
        }
    }

    public static String a(Context context, String str, String str2) {
        try {
            String strC = c(context, str, str2);
            if (an.b(strC).booleanValue()) {
                return m.a(context, strC);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }
}
