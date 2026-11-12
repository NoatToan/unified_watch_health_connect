package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class p0l {
    public static final p0l c = new p0l(0, -9223372036854775807L);
    public static final Pattern d = Pattern.compile("npt=([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29875b;

    public p0l(long j, long j2) {
        this.f29874a = j;
        this.f29875b = j2;
    }

    public static String b(long j) {
        return wlq.D("npt=%.3f-", Double.valueOf(j / 1000.0d));
    }

    public static p0l d(String str) throws ParserException {
        long j;
        Matcher matcher = d.matcher(str);
        rk1.a(matcher.matches());
        String str2 = (String) rk1.e(matcher.group(1));
        long j2 = str2.equals("now") ? 0L : (long) (Float.parseFloat(str2) * 1000.0f);
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j = (long) (Float.parseFloat(strGroup) * 1000.0f);
                rk1.a(j > j2);
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        } else {
            j = -9223372036854775807L;
        }
        return new p0l(j2, j);
    }

    public long a() {
        return this.f29875b - this.f29874a;
    }

    public boolean c() {
        return this.f29875b == -9223372036854775807L;
    }
}
