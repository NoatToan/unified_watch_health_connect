package k7;

import java.io.PrintWriter;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f103267a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f103268b = new char[24];

    private j() {
    }

    public static void a(long j8, PrintWriter printWriter) {
        synchronized (f103267a) {
            printWriter.print(new String(f103268b, 0, b(j8)));
        }
    }

    public static int b(long j8) {
        char c14;
        int i14;
        int i15;
        int i16;
        if (f103268b.length < 0) {
            f103268b = new char[0];
        }
        char[] cArr = f103268b;
        if (j8 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j8 > 0) {
            c14 = '+';
        } else {
            j8 = -j8;
            c14 = '-';
        }
        int i17 = (int) (j8 % 1000);
        int iFloor = (int) Math.floor(j8 / 1000);
        if (iFloor > 86400) {
            i14 = iFloor / DateTimeConstants.SECONDS_PER_DAY;
            iFloor -= DateTimeConstants.SECONDS_PER_DAY * i14;
        } else {
            i14 = 0;
        }
        if (iFloor > 3600) {
            i15 = iFloor / DateTimeConstants.SECONDS_PER_HOUR;
            iFloor -= i15 * DateTimeConstants.SECONDS_PER_HOUR;
        } else {
            i15 = 0;
        }
        if (iFloor > 60) {
            int i18 = iFloor / 60;
            iFloor -= i18 * 60;
            i16 = i18;
        } else {
            i16 = 0;
        }
        cArr[0] = c14;
        int iC = c(cArr, i14, 'd', 1, false, 0);
        int iC2 = c(cArr, i15, 'h', iC, iC != 1, 0);
        int iC3 = c(cArr, i16, 'm', iC2, iC2 != 1, 0);
        int iC4 = c(cArr, i17, 'm', c(cArr, iFloor, 's', iC3, iC3 != 1, 0), true, 0);
        cArr[iC4] = 's';
        return iC4 + 1;
    }

    public static int c(char[] cArr, int i14, char c14, int i15, boolean z14, int i16) {
        int i17;
        if (!z14 && i14 <= 0) {
            return i15;
        }
        if ((!z14 || i16 < 3) && i14 <= 99) {
            i17 = i15;
        } else {
            int i18 = i14 / 100;
            cArr[i15] = (char) (i18 + 48);
            i17 = i15 + 1;
            i14 -= i18 * 100;
        }
        if ((z14 && i16 >= 2) || i14 > 9 || i15 != i17) {
            int i19 = i14 / 10;
            cArr[i17] = (char) (i19 + 48);
            i17++;
            i14 -= i19 * 10;
        }
        cArr[i17] = (char) (i14 + 48);
        cArr[i17 + 1] = c14;
        return i17 + 2;
    }
}
