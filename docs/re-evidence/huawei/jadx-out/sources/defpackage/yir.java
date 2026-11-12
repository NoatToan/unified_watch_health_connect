package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes20.dex */
public class yir {
    public static <T> T d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        yis.c("Preconditions", String.valueOf(obj));
        throw new yib(5);
    }

    public static String c(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        yis.c("Preconditions", String.valueOf(obj));
        throw new yib(5);
    }

    public static void c(String str, int i) {
        try {
            if (TextUtils.isEmpty(str) || str.getBytes("UTF-8").length > i) {
                yis.c("Preconditions", "checkArgumentByteLimit exceeded the maximum length: " + str);
                throw new yib(5);
            }
        } catch (UnsupportedEncodingException unused) {
            yis.c("Preconditions", "checkArgumentByteLimit UnsupportedEncodingException");
            throw new yib(5);
        }
    }
}
