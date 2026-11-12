package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class w84 {
    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("cannot be called with main thread");
        }
    }

    public static String b(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return TextUtils.isEmpty(country) ? language : String.format("%s_%s", language, country);
    }
}
