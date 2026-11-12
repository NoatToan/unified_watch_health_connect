package wt2;

import com.google.common.primitives.UnsignedBytes;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f187221a = new byte[4];

    public final String toString() {
        Locale locale = Locale.getDefault();
        byte[] bArr = this.f187221a;
        return String.format(locale, "[gps ephemeris request response] response: %1$d, data available: %2$d, total data msgs: %3$d, timeout: %4$d", Byte.valueOf((byte) (bArr[0] & 3)), Byte.valueOf((byte) (bArr[0] & UnsignedBytes.MAX_POWER_OF_TWO)), Byte.valueOf(bArr[1]), Integer.valueOf(((bArr[3] << 8) & 65280) | (bArr[2] & UnsignedBytes.MAX_VALUE)));
    }
}
