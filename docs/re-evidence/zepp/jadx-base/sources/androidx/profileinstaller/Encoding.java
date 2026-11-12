package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
class Encoding {
    public static final int SIZEOF_BYTE = 8;
    public static final int UINT_16_SIZE = 2;
    public static final int UINT_32_SIZE = 4;
    public static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    public static int bitsToBytes(int numberOfBits) {
        return (((numberOfBits + 8) - 1) & (-8)) / 8;
    }

    @NonNull
    public static RuntimeException error(@Nullable String message) {
        return new IllegalStateException(message);
    }

    @NonNull
    public static byte[] read(@NonNull InputStream is, int length) throws IOException {
        byte[] bArr = new byte[length];
        int i = 0;
        while (i < length) {
            int i2 = is.read(bArr, i, length - i);
            if (i2 < 0) {
                throw error("Not enough bytes to read: " + length);
            }
            i += i2;
        }
        return bArr;
    }

    @NonNull
    public static byte[] readCompressed(@NonNull InputStream is, int compressedDataSize, int uncompressedDataSize) throws IOException {
        Inflater inflater = new Inflater();
        byte[] bArr = new byte[uncompressedDataSize];
        byte[] bArr2 = new byte[2048];
        int i = 0;
        int iInflate = 0;
        while (!inflater.finished() && !inflater.needsDictionary() && i < compressedDataSize) {
            int i2 = is.read(bArr2);
            if (i2 < 0) {
                throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + compressedDataSize + " bytes");
            }
            inflater.setInput(bArr2, 0, i2);
            try {
                iInflate += inflater.inflate(bArr, iInflate, uncompressedDataSize - iInflate);
                i += i2;
            } catch (DataFormatException e) {
                throw error(e.getMessage());
            }
        }
        if (i == compressedDataSize) {
            if (inflater.finished()) {
                return bArr;
            }
            throw error("Inflater did not finish");
        }
        throw error("Didn't read enough bytes during decompression. expected=" + compressedDataSize + " actual=" + i);
    }

    @NonNull
    public static String readString(InputStream is, int size) throws IOException {
        return new String(read(is, size), StandardCharsets.UTF_8);
    }

    public static long readUInt(@NonNull InputStream is, int numberOfBytes) throws IOException {
        byte[] bArr = read(is, numberOfBytes);
        long j = 0;
        for (int i = 0; i < numberOfBytes; i++) {
            j += ((long) (bArr[i] & 255)) << (i * 8);
        }
        return j;
    }

    public static int readUInt16(@NonNull InputStream is) throws IOException {
        return (int) readUInt(is, 2);
    }

    public static long readUInt32(@NonNull InputStream is) throws IOException {
        return readUInt(is, 4);
    }

    public static int readUInt8(@NonNull InputStream is) throws IOException {
        return (int) readUInt(is, 1);
    }

    public static int utf8Length(@NonNull String s) {
        return s.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void writeAll(@NonNull InputStream is, @NonNull OutputStream os) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i = is.read(bArr);
            if (i <= 0) {
                return;
            } else {
                os.write(bArr, 0, i);
            }
        }
    }

    public static void writeCompressed(@NonNull OutputStream os, byte[] data) throws IOException {
        writeUInt32(os, data.length);
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
        try {
            deflaterOutputStream.write(data);
            deflaterOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            writeUInt32(os, byteArray.length);
            os.write(byteArray);
        } catch (Throwable th) {
            try {
                deflaterOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void writeString(@NonNull OutputStream os, @NonNull String s) throws IOException {
        os.write(s.getBytes(StandardCharsets.UTF_8));
    }

    public static void writeUInt(@NonNull OutputStream os, long value, int numberOfBytes) throws IOException {
        byte[] bArr = new byte[numberOfBytes];
        for (int i = 0; i < numberOfBytes; i++) {
            bArr[i] = (byte) ((value >> (i * 8)) & 255);
        }
        os.write(bArr);
    }

    public static void writeUInt16(@NonNull OutputStream os, int value) throws IOException {
        writeUInt(os, value, 2);
    }

    public static void writeUInt32(@NonNull OutputStream os, long value) throws IOException {
        writeUInt(os, value, 4);
    }

    public static void writeUInt8(@NonNull OutputStream os, int value) throws IOException {
        writeUInt(os, value, 1);
    }
}
