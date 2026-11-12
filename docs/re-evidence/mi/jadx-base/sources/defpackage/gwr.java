package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class gwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f19413a;

    public static String a() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
    }

    public static boolean b(Context context) {
        if (f19413a == null) {
            f19413a = Boolean.valueOf((context == null || context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true);
        }
        return f19413a.booleanValue();
    }
}
