package defpackage;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.exceptions.UtilException;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class sjg {
    public static byte[] b(InetAddress inetAddress) {
        if (inetAddress == null) {
            return null;
        }
        try {
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(inetAddress);
            if (byInetAddress != null) {
                return byInetAddress.getHardwareAddress();
            }
            return null;
        } catch (SocketException e) {
            throw new UtilException(e);
        }
    }

    public static byte[] c() {
        return b(d());
    }

    public static InetAddress d() {
        LinkedHashSet<InetAddress> linkedHashSetH = h(new sm9() { // from class: rjg
            @Override // defpackage.sm9
            public final boolean accept(Object obj) {
                return sjg.g((InetAddress) obj);
            }
        });
        if (CollUtil.j(linkedHashSetH)) {
            return (InetAddress) CollUtil.e(linkedHashSetH, 0);
        }
        try {
            return InetAddress.getLocalHost();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public static boolean e(int i) {
        if (!f(i)) {
            return false;
        }
        try {
            ServerSocket serverSocket = new ServerSocket(i);
            try {
                serverSocket.setReuseAddress(true);
                serverSocket.close();
                try {
                    DatagramSocket datagramSocket = new DatagramSocket(i);
                    try {
                        datagramSocket.setReuseAddress(true);
                        datagramSocket.close();
                        return true;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                datagramSocket.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                    return false;
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        serverSocket.close();
                    } catch (Throwable th6) {
                        th4.addSuppressed(th6);
                    }
                    throw th5;
                }
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    public static boolean f(int i) {
        return i >= 0 && i <= 65535;
    }

    public static /* synthetic */ boolean g(InetAddress inetAddress) {
        return (inetAddress.isLoopbackAddress() || inetAddress.isSiteLocalAddress() || !(inetAddress instanceof Inet4Address)) ? false : true;
    }

    public static LinkedHashSet<InetAddress> h(sm9<InetAddress> sm9Var) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                throw new UtilException("Get network interface error!");
            }
            LinkedHashSet<InetAddress> linkedHashSet = new LinkedHashSet<>();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (inetAddressNextElement != null && (sm9Var == null || sm9Var.accept(inetAddressNextElement))) {
                        linkedHashSet.add(inetAddressNextElement);
                    }
                }
            }
            return linkedHashSet;
        } catch (SocketException e) {
            throw new UtilException(e);
        }
    }
}
