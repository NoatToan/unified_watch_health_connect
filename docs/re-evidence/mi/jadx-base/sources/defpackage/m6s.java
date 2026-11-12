package defpackage;

import com.google.android.play.core.assetpacks.internal.al;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class m6s {
    public static long a(r6s r6sVar, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int i = dataInputStream.readInt();
        if (i != -771763713) {
            throw new al("Unexpected magic=".concat(String.format("%x", Integer.valueOf(i))));
        }
        int i2 = dataInputStream.read();
        if (i2 != 4) {
            throw new al("Unexpected version=" + i2);
        }
        long j2 = 0;
        while (true) {
            long j3 = j - j2;
            try {
                int unsignedShort = dataInputStream.read();
                if (unsignedShort == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort == 0) {
                    outputStream.flush();
                    return j2;
                }
                switch (unsignedShort) {
                    case 247:
                        unsignedShort = dataInputStream.readUnsignedShort();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                    case 248:
                        unsignedShort = dataInputStream.readInt();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                    case 249:
                        long unsignedShort2 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        b(bArr, r6sVar, outputStream, unsignedShort2, unsignedShort, j3);
                        break;
                        break;
                    case 250:
                        long unsignedShort3 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, r6sVar, outputStream, unsignedShort3, unsignedShort, j3);
                        break;
                    case VibrateModeSetViewModel.DEFAULT_BBJI /* 251 */:
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, r6sVar, outputStream, unsignedShort4, unsignedShort, j3);
                        break;
                    case 252:
                        long j4 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        b(bArr, r6sVar, outputStream, j4, unsignedShort, j3);
                        break;
                        break;
                    case 253:
                        long j5 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, r6sVar, outputStream, j5, unsignedShort, j3);
                        break;
                    case 254:
                        long j6 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, r6sVar, outputStream, j6, unsignedShort, j3);
                        break;
                    case 255:
                        long j7 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, r6sVar, outputStream, j7, unsignedShort, j3);
                        break;
                    default:
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                }
                j2 += (long) unsignedShort;
            } catch (Throwable th) {
                outputStream.flush();
                throw th;
            }
        }
    }

    public static void b(byte[] bArr, r6s r6sVar, OutputStream outputStream, long j, int i, long j2) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (j < 0) {
            throw new IOException("inputOffset negative");
        }
        long j3 = i;
        if (j3 > j2) {
            throw new IOException("Output length overrun");
        }
        try {
            InputStream inputStreamC = new w6s(r6sVar, j, j3, false).c();
            while (i > 0) {
                try {
                    int iMin = Math.min(i, 16384);
                    int i2 = 0;
                    while (i2 < iMin) {
                        int i3 = inputStreamC.read(bArr, i2, iMin - i2);
                        if (i3 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i2 += i3;
                        throw new IOException("patch underrun", e);
                    }
                    outputStream.write(bArr, 0, iMin);
                    i -= iMin;
                } catch (Throwable th) {
                    try {
                        inputStreamC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            inputStreamC.close();
        } catch (EOFException e) {
            throw new IOException("patch underrun", e);
        }
    }

    public static void c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (i > j) {
            throw new IOException("Output length overrun");
        }
        while (i > 0) {
            try {
                int iMin = Math.min(i, 16384);
                dataInputStream.readFully(bArr, 0, iMin);
                outputStream.write(bArr, 0, iMin);
                i -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }
}
