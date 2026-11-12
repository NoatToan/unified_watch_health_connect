package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.xiaomi.onetrack.util.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class tcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f34577a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(okh okhVar) {
        String strP;
        while (true) {
            String strP2 = okhVar.p();
            if (strP2 == null) {
                return null;
            }
            if (f34577a.matcher(strP2).matches()) {
                do {
                    strP = okhVar.p();
                    if (strP == null) {
                        break;
                    }
                } while (!strP.isEmpty());
            } else {
                Matcher matcher = pcr.f30260a.matcher(strP2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(okh okhVar) {
        String strP = okhVar.p();
        return strP != null && strP.startsWith("WEBVTT");
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) throws NumberFormatException {
        String[] strArrN0 = wlq.N0(str, z.f14007a);
        long j = 0;
        for (String str2 : wlq.M0(strArrN0[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrN0.length == 2) {
            j2 += Long.parseLong(strArrN0[1]);
        }
        return j2 * 1000;
    }

    public static void e(okh okhVar) throws ParserException {
        int iE = okhVar.e();
        if (b(okhVar)) {
            return;
        }
        okhVar.P(iE);
        String strValueOf = String.valueOf(okhVar.p());
        throw new ParserException(strValueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(strValueOf) : new String("Expected WEBVTT. Got "));
    }
}
