package defpackage;

import com.miui.tsmclient.util.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class cpe {
    public static final SimpleDateFormat e;
    public static final SimpleDateFormat f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14595b;
    public String c;
    public String d;

    static {
        Locale locale = Locale.CHINA;
        e = new SimpleDateFormat("yy-MM-dd HH:mm:ss", locale);
        f = new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT, locale);
    }

    public cpe(long j, int i, String str, String str2) {
        this.f14594a = j;
        this.f14595b = i;
        this.c = str;
        this.d = str2;
    }

    public String a() {
        return c() + this.d;
    }

    public final String b(long j) {
        return e.format(Long.valueOf(j));
    }

    public String c() {
        return b(this.f14594a) + ' ' + this.f14595b + ' ' + this.c + ":";
    }
}
