package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.o0;

/* JADX INFO: loaded from: classes11.dex */
public class tks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f34802a;

    public static void a(String str) {
        b("Push-ConnectionQualityStatsHelper", str);
    }

    public static void b(String str, String str2) {
    }

    public static boolean c(Context context) {
        if (f34802a == null) {
            if (!y0t.j(context)) {
                f34802a = Boolean.FALSE;
            }
            String strD = o0.d(context);
            if (TextUtils.isEmpty(strD) || strD.length() < 3) {
                f34802a = Boolean.FALSE;
            } else {
                String strSubstring = strD.substring(strD.length() - 3);
                a("shouldSampling uuid suffix = " + strSubstring);
                f34802a = Boolean.valueOf(TextUtils.equals(strSubstring, "001"));
            }
            a("shouldSampling = " + f34802a);
        }
        return f34802a.booleanValue();
    }
}
