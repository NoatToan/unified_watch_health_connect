package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class wh {
    public static String c() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
    }

    public static String e(long j) {
        return e(j, "yyyy-MM-dd HH:mm:ss");
    }

    public static String e(long j, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }
}
