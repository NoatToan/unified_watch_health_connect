package wt2;

import bs2.q4;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f187222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187223b;

    public o(int i14) {
        this.f187222a = new byte[i14];
        this.f187223b = i14;
    }

    public final int a(int i14) {
        byte[] bArr = this.f187222a;
        return ((bArr[i14 + 1] << 8) & 65280) | (bArr[i14] & UnsignedBytes.MAX_VALUE);
    }

    public final int b(BufferedInputStream bufferedInputStream, int i14, int i15, int i16) throws IOException {
        do {
            long j8 = i14;
            i14 = (int) (j8 - bufferedInputStream.skip(j8));
        } while (i14 > 0);
        byte[] bArr = this.f187222a;
        int i17 = bufferedInputStream.read(bArr, 14, i16 - 14);
        if (i17 == -1) {
            vb.h.C("Encountered end of stream while trying to read data");
            return 0;
        }
        System.out.println("bytesRead=" + i17);
        int i18 = i17 + 14;
        this.f187223b = i18;
        int iA = (short) i15;
        for (int i19 = 14; i19 < i18; i19++) {
            iA = q4.a(bArr[i19], iA);
        }
        short s8 = (short) iA;
        bArr[10] = (byte) s8;
        bArr[11] = (byte) (s8 >> 8);
        return i17;
    }

    public final void c(long j8) {
        byte[] bArr = this.f187222a;
        bArr[0] = (byte) j8;
        bArr[1] = (byte) (j8 >> 8);
        bArr[2] = (byte) (j8 >> 16);
        bArr[3] = (byte) (j8 >> 24);
        bArr[4] = (byte) (j8 >> 32);
        bArr[5] = (byte) (j8 >> 40);
        bArr[6] = (byte) (j8 >> 48);
        bArr[7] = (byte) (j8 >> 56);
    }

    public final String toString() {
        int i14 = this.f187223b - 14;
        byte[] bArr = new byte[i14];
        byte[] bArr2 = this.f187222a;
        System.arraycopy(bArr2, 14, bArr, 0, i14);
        StringBuilder sb3 = new StringBuilder("[");
        for (int i15 = 0; i15 < i14; i15++) {
            sb3.append(StringUtils.SPACE);
            sb3.append(String.format("%02X", Byte.valueOf(bArr[i15])));
        }
        sb3.append(" ]");
        return String.format(Locale.ENGLISH, "[gps ephemeris epo data] msg id: %1$d, length: %2$d, gps hours: %3$d, segment size: %4$d, data crc: 0x%5$04x, data offset: %6$d, data: %7$s", 5029, Integer.valueOf(this.f187223b), Long.valueOf((((long) (bArr2[7] << 56)) & (-72057594037927936L)) | (((long) bArr2[0]) & 255) | (((long) (bArr2[1] << 8)) & 65280) | (((long) (bArr2[2] << Ascii.DLE)) & 16711680) | (((long) (bArr2[3] << Ascii.CAN)) & 4278190080L) | (((long) (bArr2[4] << 32)) & 1095216660480L) | (((long) (bArr2[5] << 40)) & 280375465082880L) | (((long) (bArr2[6] << 48)) & 71776119061217280L)), Integer.valueOf(a(8)), Integer.valueOf(a(10)), Integer.valueOf(a(12)), sb3.toString());
    }
}
