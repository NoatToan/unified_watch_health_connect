package wt2;

import com.google.common.primitives.UnsignedBytes;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f187225a = new byte[4];

    public final String toString() {
        Locale locale = Locale.getDefault();
        byte[] bArr = this.f187225a;
        return String.format(locale, "[gps ephemeris epo data request response] request status: 0x%1$02x, total data msgs: %2$d, timeout: %3$d", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Integer.valueOf(((bArr[3] << 8) & 65280) | (bArr[2] & UnsignedBytes.MAX_VALUE)));
    }
}
