package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class nqg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal<SimpleDateFormat> f43449b = new ThreadLocal<>();

    private static SimpleDateFormat e() {
        SimpleDateFormat simpleDateFormat = f43449b.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        f43449b.set(simpleDateFormat2);
        return simpleDateFormat2;
    }

    public static String d(Date date) {
        return e().format(date);
    }
}
