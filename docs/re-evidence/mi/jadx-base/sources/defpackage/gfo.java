package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class gfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f18931a;

    public static SharedPreferences a(Context context) {
        if (f18931a == null) {
            Objects.requireNonNull(context);
            f18931a = context.getSharedPreferences("pref:step_widget", 0);
        }
        return f18931a;
    }

    public static long b(Context context) {
        return a(context).getLong("update_time", -1L);
    }

    public static void c(Context context, long j) {
        a(context).edit().putLong("update_time", j).apply();
    }
}
