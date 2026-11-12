package okhttp3.internal.ws;

import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes23.dex */
public final class WebSocketProtocol {
    public static final String a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int b = 128;
    public static final int c = 64;
    public static final int d = 32;
    public static final int e = 16;
    public static final int f = 15;
    public static final int g = 8;
    public static final int h = 128;
    public static final int i = 127;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 8;
    public static final int n = 9;
    public static final int o = 10;
    public static final long p = 125;
    public static final long q = 123;
    public static final int r = 126;
    public static final long s = 65535;
    public static final int t = 127;
    public static final int u = 1001;
    public static final int v = 1005;

    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    public static String a(int i2) {
        if (i2 < 1000 || i2 >= 5000) {
            return "Code must be in range [1000,5000): " + i2;
        }
        if ((i2 < 1004 || i2 > 1006) && (i2 < 1012 || i2 > 2999)) {
            return null;
        }
        return "Code " + i2 + " is reserved and may not be used.";
    }

    public static String acceptHeader(String str) {
        return ByteString.encodeUtf8(str + a).sha1().base64();
    }

    public static void b(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i3 = unsafeCursor.start;
            int i4 = unsafeCursor.end;
            while (i3 < i4) {
                int i5 = i2 % length;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                i3++;
                i2 = i5 + 1;
            }
        } while (unsafeCursor.next() != -1);
    }

    public static void c(int i2) {
        String strA = a(i2);
        if (strA != null) {
            throw new IllegalArgumentException(strA);
        }
    }
}
