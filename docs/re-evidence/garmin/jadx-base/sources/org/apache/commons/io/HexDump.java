package org.apache.commons.io;

import b71.i;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class HexDump {
    public static final String EOL = System.getProperty("line.separator");
    private static final char[] _hexcodes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final int[] _shifts = {28, 24, 20, 16, 12, 8, 4, 0};

    public static void dump(byte[] bArr, long j8, OutputStream outputStream, int i14) throws IOException {
        if (i14 < 0 || i14 >= bArr.length) {
            StringBuilder sbI = i.i(i14, "illegal index: ", " into array of length ");
            sbI.append(bArr.length);
            throw new ArrayIndexOutOfBoundsException(sbI.toString());
        }
        if (outputStream == null) {
            h.s("cannot write to nullstream");
            return;
        }
        long j14 = j8 + ((long) i14);
        StringBuilder sb3 = new StringBuilder(74);
        while (i14 < bArr.length) {
            int length = bArr.length - i14;
            if (length > 16) {
                length = 16;
            }
            dump(sb3, j14).append(' ');
            for (int i15 = 0; i15 < 16; i15++) {
                if (i15 < length) {
                    dump(sb3, bArr[i15 + i14]);
                } else {
                    sb3.append("  ");
                }
                sb3.append(' ');
            }
            for (int i16 = 0; i16 < length; i16++) {
                byte b14 = bArr[i16 + i14];
                if (b14 < 32 || b14 >= 127) {
                    sb3.append('.');
                } else {
                    sb3.append((char) b14);
                }
            }
            sb3.append(EOL);
            outputStream.write(sb3.toString().getBytes(Charset.defaultCharset()));
            outputStream.flush();
            sb3.setLength(0);
            j14 += (long) length;
            i14 += 16;
        }
    }

    private static StringBuilder dump(StringBuilder sb3, long j8) {
        for (int i14 = 0; i14 < 8; i14++) {
            sb3.append(_hexcodes[((int) (j8 >> _shifts[i14])) & 15]);
        }
        return sb3;
    }

    private static StringBuilder dump(StringBuilder sb3, byte b14) {
        for (int i14 = 0; i14 < 2; i14++) {
            sb3.append(_hexcodes[(b14 >> _shifts[i14 + 6]) & 15]);
        }
        return sb3;
    }
}
