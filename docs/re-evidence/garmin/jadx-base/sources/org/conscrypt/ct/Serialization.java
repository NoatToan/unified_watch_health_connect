package org.conscrypt.ct;

import am.j;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class Serialization {
    private static final int DER_LENGTH_LONG_FORM_FLAG = 128;
    private static final int DER_TAG_MASK = 63;
    private static final int DER_TAG_OCTET_STRING = 4;

    private Serialization() {
    }

    public static byte readByte(InputStream inputStream) throws SerializationException {
        try {
            int i14 = inputStream.read();
            if (i14 != -1) {
                return (byte) i14;
            }
            throw new SerializationException("Premature end of input, could not read byte.");
        } catch (IOException e4) {
            throw new SerializationException(e4);
        }
    }

    public static byte[] readDEROctetString(InputStream inputStream) throws SerializationException {
        int i14 = readByte(inputStream) & 63;
        if (i14 != 4) {
            throw new SerializationException(j.h(i14, "Wrong DER tag, expected OCTET STRING, got "));
        }
        int number = readNumber(inputStream, 1);
        if ((number & 128) != 0) {
            number = readNumber(inputStream, number & (-129));
        }
        return readFixedBytes(inputStream, number);
    }

    public static byte[] readFixedBytes(InputStream inputStream, int i14) throws SerializationException {
        try {
            if (i14 < 0) {
                throw new SerializationException("Negative length: " + i14);
            }
            byte[] bArr = new byte[i14];
            int i15 = inputStream.read(bArr);
            if (i15 >= i14) {
                return bArr;
            }
            throw new SerializationException("Premature end of input, expected " + i14 + " bytes, only read " + i15);
        } catch (IOException e4) {
            throw new SerializationException(e4);
        }
    }

    public static byte[][] readList(InputStream inputStream, int i14, int i15) throws SerializationException {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readVariableBytes(inputStream, i14));
        while (byteArrayInputStream.available() > 0) {
            try {
                arrayList.add(readVariableBytes(byteArrayInputStream, i15));
            } catch (IOException e4) {
                throw new SerializationException(e4);
            }
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
    }

    public static long readLong(InputStream inputStream, int i14) {
        if (i14 > 8 || i14 < 0) {
            h.s(j.h(i14, "Invalid width: "));
            return 0L;
        }
        long j8 = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            j8 = (j8 << 8) | ((long) (readByte(inputStream) & UnsignedBytes.MAX_VALUE));
        }
        return j8;
    }

    public static int readNumber(InputStream inputStream, int i14) throws SerializationException {
        if (i14 > 4 || i14 < 0) {
            throw new SerializationException(j.h(i14, "Invalid width: "));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            i15 = (i15 << 8) | (readByte(inputStream) & UnsignedBytes.MAX_VALUE);
        }
        return i15;
    }

    public static byte[] readVariableBytes(InputStream inputStream, int i14) {
        return readFixedBytes(inputStream, readNumber(inputStream, i14));
    }

    public static void writeFixedBytes(OutputStream outputStream, byte[] bArr) {
        try {
            outputStream.write(bArr);
        } catch (IOException e4) {
            throw new SerializationException(e4);
        }
    }

    public static void writeNumber(OutputStream outputStream, long j8, int i14) {
        if (i14 < 0) {
            throw new SerializationException(j.h(i14, "Negative width: "));
        }
        if (i14 < 8 && j8 >= (1 << (i14 * 8))) {
            StringBuilder sbW = v.h.w(i14, "Number too large, ", " does not fit in ", j8);
            sbW.append(" bytes");
            throw new SerializationException(sbW.toString());
        }
        while (i14 > 0) {
            long j14 = ((long) (i14 - 1)) * 8;
            if (j14 < 64) {
                try {
                    outputStream.write((byte) ((j8 >> ((int) j14)) & 255));
                } catch (IOException e4) {
                    throw new SerializationException(e4);
                }
            } else {
                outputStream.write(0);
            }
            i14--;
        }
    }

    public static void writeVariableBytes(OutputStream outputStream, byte[] bArr, int i14) {
        writeNumber(outputStream, bArr.length, i14);
        writeFixedBytes(outputStream, bArr);
    }

    public static byte[] readDEROctetString(byte[] bArr) {
        return readDEROctetString(new ByteArrayInputStream(bArr));
    }

    public static byte[][] readList(byte[] bArr, int i14, int i15) {
        return readList(new ByteArrayInputStream(bArr), i14, i15);
    }
}
