package hb2;

import java.nio.ByteBuffer;
import java.util.Formatter;

/* JADX INFO: loaded from: classes8.dex */
public class d {
    public static byte[] a(String str) {
        if (str.length() % 2 != 0) {
            kg.f.n("Unacceptable string: ".concat(str));
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length() / 2);
        for (int i14 = 0; i14 < str.length() / 2; i14++) {
            int i15 = i14 * 2;
            int i16 = i15 + 1;
            byteBufferAllocate.put((byte) (Byte.parseByte(str.substring(i16, i15 + 2), 16) | ((byte) (Byte.parseByte(str.substring(i15, i16), 16) << 4))));
        }
        return byteBufferAllocate.array();
    }

    public static String b(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b14 : bArr) {
            formatter.format("%02x", Byte.valueOf(b14));
        }
        return formatter.toString();
    }
}
