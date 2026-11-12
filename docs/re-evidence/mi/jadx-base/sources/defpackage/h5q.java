package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public class h5q {
    public static String a(byte[] bArr) {
        return new String(bArr);
    }

    public static int b(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int c(String str) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            jpe.a("TypeUtil", "address int: " + d(byName));
            return d(byName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int d(InetAddress inetAddress) {
        return b(inetAddress.getAddress());
    }

    public static byte[] e(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }
}
