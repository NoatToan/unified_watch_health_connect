package d53;

import ch.qos.logback.core.CoreConstants;
import com.garmin.device.ble.BleCommunicationException;
import com.google.android.exoplayer2.C;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class t extends s {
    public static final void h(String str) {
        throw new NumberFormatException(o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "Invalid number format: '", str));
    }

    public static Integer i(String str) {
        boolean z14;
        int i14;
        int i15;
        str.getClass();
        a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i16 = 0;
        char cCharAt = str.charAt(0);
        int iH = p005kotlin.jvm.internal.s.h(cCharAt, 48);
        int i17 = BleCommunicationException.UNSPECIFIED_FAILURE;
        if (iH < 0) {
            i14 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z14 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i17 = Integer.MIN_VALUE;
                z14 = true;
            }
        } else {
            z14 = false;
            i14 = 0;
        }
        int i18 = -59652323;
        while (i14 < length) {
            int iDigit = Character.digit((int) str.charAt(i14), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i16 < i18 && (i18 != -59652323 || i16 < (i18 = i17 / 10))) || (i15 = i16 * 10) < i17 + iDigit) {
                return null;
            }
            i16 = i15 - iDigit;
            i14++;
        }
        return z14 ? Integer.valueOf(i16) : Integer.valueOf(-i16);
    }

    public static Long j(String str) {
        boolean z14;
        str.getClass();
        a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i14 = 0;
        char cCharAt = str.charAt(0);
        int iH = p005kotlin.jvm.internal.s.h(cCharAt, 48);
        long j8 = C.TIME_UNSET;
        if (iH < 0) {
            z14 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z14 = false;
                i14 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j8 = Long.MIN_VALUE;
                i14 = 1;
            }
        } else {
            z14 = false;
        }
        long j14 = 0;
        long j15 = -256204778801521550L;
        while (i14 < length) {
            int iDigit = Character.digit((int) str.charAt(i14), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j14 < j15) {
                if (j15 != -256204778801521550L) {
                    return null;
                }
                j15 = j8 / ((long) 10);
                if (j14 < j15) {
                    return null;
                }
            }
            long j16 = j14 * ((long) 10);
            long j17 = iDigit;
            if (j16 < j8 + j17) {
                return null;
            }
            j14 = j16 - j17;
            i14++;
        }
        return z14 ? Long.valueOf(j14) : Long.valueOf(-j14);
    }
}
