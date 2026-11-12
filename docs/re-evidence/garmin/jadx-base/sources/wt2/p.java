package wt2;

import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f187224a;

    public p(byte[] bArr) {
        this.f187224a = bArr;
        byte b14 = bArr[0];
        a();
    }

    public final long[] a() {
        byte[] bArr = this.f187224a;
        int i14 = bArr[0];
        if (i14 <= 0) {
            return null;
        }
        long[] jArr = new long[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i15 * 8;
            jArr[i15] = (((long) bArr[i16 + 1]) & 255) | (((long) (bArr[i16 + 2] << 8)) & 65280) | (((long) (bArr[i16 + 3] << 16)) & 16711680) | (((long) (bArr[i16 + 4] << 24)) & 4278190080L) | (((long) (bArr[i16 + 5] << 32)) & 1095216660480L) | (((long) (bArr[i16 + 6] << 40)) & 280375465082880L) | (((long) (bArr[i16 + 7] << 48)) & 71776119061217280L) | (((long) (bArr[i16 + 8] << 56)) & (-72057594037927936L));
        }
        return jArr;
    }

    public final String toString() {
        long[] jArrA = a();
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < jArrA.length; i14++) {
            if (i14 > 0) {
                sb3.append(StringUtils.SPACE);
            }
            sb3.append("[");
            sb3.append(i14);
            sb3.append("]=");
            sb3.append(jArrA[i14]);
        }
        return String.format(Locale.getDefault(), "[gps ephemeris epo data request] gps hours count: %1$d, gps hours: %2$s", Byte.valueOf(this.f187224a[0]), sb3.toString());
    }
}
