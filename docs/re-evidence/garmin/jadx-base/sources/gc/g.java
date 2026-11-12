package gc;

import androidx.media3.common.ParserException;
import fa.r;
import fa.z;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f76827a = Pattern.compile("^NOTE([ \t].*)?$");

    private g() {
    }

    public static boolean a(r rVar) {
        rVar.getClass();
        String strH = rVar.h(StandardCharsets.UTF_8);
        return strH != null && strH.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i14 = z.f70071a;
        String[] strArrSplit = str.split("\\.", 2);
        long j8 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j8 = (j8 * 60) + Long.parseLong(str2);
        }
        long j14 = j8 * 1000;
        if (strArrSplit.length == 2) {
            j14 += Long.parseLong(strArrSplit[1]);
        }
        return j14 * 1000;
    }

    public static void d(r rVar) {
        int i14 = rVar.f70055b;
        if (a(rVar)) {
            return;
        }
        rVar.G(i14);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + rVar.h(StandardCharsets.UTF_8), null);
    }
}
