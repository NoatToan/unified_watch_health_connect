package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes46.dex */
public class ylt {
    public static int a(Exception exc) {
        if (!(exc instanceof IllegalStateException)) {
            return 12;
        }
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            return 12;
        }
        try {
            return Integer.parseInt(message);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }
}
