package defpackage;

import android.content.Context;
import android.provider.Settings;
import com.xiaomi.mi_connect_service.util.DeviceUtil;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class n6q {
    public static final int a(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static final String b(Context context) {
        String string = Settings.System.getString(context.getContentResolver(), DeviceUtil.TV_CN_NAME);
        return string == null ? "MiBox" : string;
    }

    public static final String c() {
        byte[] hardwareAddress;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.getName().toLowerCase().contains("eth") && (hardwareAddress = networkInterfaceNextElement.getHardwareAddress()) != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < hardwareAddress.length; i++) {
                        if (i > 0) {
                            sb.append(":");
                        }
                        sb.append(String.format("%1$02x", Byte.valueOf(hardwareAddress[i])));
                    }
                    return sb.toString();
                }
            }
            return null;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception: ");
            sb2.append(e.toString());
            return null;
        }
    }

    public static final int d(InetAddress inetAddress) {
        return a(inetAddress.getAddress());
    }

    public static final InetAddress e(int i) {
        try {
            return InetAddress.getByAddress(f(i));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
            return null;
        }
    }

    public static final byte[] f(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static final boolean g() {
        try {
            Class.forName("mitv.network.ethernet.EthernetManager");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
