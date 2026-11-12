package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes21.dex */
class sw {
    private static volatile sw e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f48754c;

    static sw c(Context context) {
        if (e == null) {
            synchronized (sw.class) {
                if (e == null) {
                    e = new sw(d(context));
                }
            }
        }
        return e;
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences("com.braintreepayments.api.SHARED_PREFERENCES", 0);
    }

    sw(SharedPreferences sharedPreferences) {
        this.f48754c = sharedPreferences;
    }

    String b(String str, String str2) {
        return this.f48754c.getString(str, str2);
    }

    void a(String str, String str2) {
        this.f48754c.edit().putString(str, str2).apply();
    }

    boolean e(String str) {
        return this.f48754c.contains(str);
    }

    long a(String str) {
        return this.f48754c.getLong(str, 0L);
    }

    void e(String str, String str2, String str3, long j) {
        this.f48754c.edit().putString(str, str2).putLong(str3, j).apply();
    }
}
