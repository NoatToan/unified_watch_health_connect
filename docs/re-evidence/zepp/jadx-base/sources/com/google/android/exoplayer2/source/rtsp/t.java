package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class t {
    public static final t c = new t(0, C.TIME_UNSET);
    private static final Pattern d = Pattern.compile("npt=([.\\d]+|now)\\s?-\\s?([.\\d]+)?");
    private static final String e = "npt=%.3f-";
    private static final long f = 0;
    public final long a;
    public final long b;

    private t(long startTimeMs, long stopTimeMs) {
        this.a = startTimeMs;
        this.b = stopTimeMs;
    }

    public static String b(long offsetStartTimeMs) {
        return Util.formatInvariant(e, Double.valueOf(offsetStartTimeMs / 1000.0d));
    }

    public static t d(String sdpRangeAttribute) throws ParserException {
        long j;
        Matcher matcher = d.matcher(sdpRangeAttribute);
        Assertions.checkArgument(matcher.matches());
        String str = (String) Assertions.checkNotNull(matcher.group(1));
        long j2 = str.equals("now") ? 0L : (long) (Float.parseFloat(str) * 1000.0f);
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j = (long) (Float.parseFloat(strGroup) * 1000.0f);
                Assertions.checkArgument(j > j2);
            } catch (NumberFormatException e2) {
                throw ParserException.createForMalformedManifest(strGroup, e2);
            }
        } else {
            j = C.TIME_UNSET;
        }
        return new t(j2, j);
    }

    public long a() {
        return this.b - this.a;
    }

    public boolean c() {
        return this.b == C.TIME_UNSET;
    }
}
