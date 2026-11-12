package h03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f80717h = Pattern.compile("(\\d{1,4})-(\\d\\d)-(\\d\\d)|(\\d{1,4})-(\\d\\d)|(\\d{1,4})");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Integer f80718i = Integer.valueOf("9");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f80719j = Pattern.compile("(\\d\\d)\\:(\\d\\d)\\:(\\d\\d)\\.(\\d{1,9})|(\\d\\d)\\:(\\d\\d)\\:(\\d\\d)|(\\d\\d)\\:(\\d\\d)|(\\d\\d)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f80720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f80721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f80722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f80723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f80724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f80725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f80726g;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f80727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f80728b;

        private b(d dVar) {
        }
    }

    public static String a(Matcher matcher, int... iArr) {
        String strGroup = null;
        for (int i14 : iArr) {
            strGroup = matcher.group(i14);
            if (strGroup != null) {
                return strGroup;
            }
        }
        return strGroup;
    }

    public final void b(String str) {
        Matcher matcher = f80717h.matcher(str);
        if (!matcher.matches()) {
            throw new c(fb1.c.n("Unexpected format for date:", str));
        }
        String strA = a(matcher, 1, 4, 6);
        if (strA != null) {
            this.f80720a = Integer.valueOf(strA);
        }
        String strA2 = a(matcher, 2, 5);
        if (strA2 != null) {
            this.f80721b = Integer.valueOf(strA2);
        }
        String strA3 = a(matcher, 3);
        if (strA3 != null) {
            this.f80722c = Integer.valueOf(strA3);
        }
    }

    public final void c(String str) {
        Matcher matcher = f80719j.matcher(str);
        if (!matcher.matches()) {
            throw new c(fb1.c.n("Unexpected format for time:", str));
        }
        String strA = a(matcher, 1, 5, 8, 10);
        if (strA != null) {
            this.f80723d = Integer.valueOf(strA);
        }
        String strA2 = a(matcher, 2, 6, 9);
        if (strA2 != null) {
            this.f80724e = Integer.valueOf(strA2);
        }
        String strA3 = a(matcher, 3, 7);
        if (strA3 != null) {
            this.f80725f = Integer.valueOf(strA3);
        }
        String strA4 = a(matcher, 4);
        if (strA4 != null) {
            StringBuilder sb3 = new StringBuilder(strA4);
            while (sb3.length() < f80718i.intValue()) {
                sb3.append("0");
            }
            this.f80726g = Integer.valueOf(sb3.toString());
        }
    }

    public static final class c extends RuntimeException {
        public c(String str) {
            super(str);
        }

        public c(String str, Throwable th3) {
            super(str, th3);
        }
    }
}
