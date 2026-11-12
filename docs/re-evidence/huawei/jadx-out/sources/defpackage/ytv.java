package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes20.dex */
public class ytv {
    private static ytv d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f53880b;

    public boolean e(String str, String str2) {
        try {
            this.f53880b.edit().putString(str, str2).apply();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String a(String str, String str2) {
        return this.f53880b.getString(str, str2);
    }

    static class e {
        private static ytv d = new ytv();
    }

    public static ytv a(Context context) {
        if (context == null) {
            return null;
        }
        if (d == null) {
            ytv ytvVar = e.d;
            d = ytvVar;
            ytvVar.f53880b = context.getSharedPreferences("com.zhangyue.iReader.sdk.scheme.SharedPreferences", 0);
        }
        return d;
    }

    private ytv() {
    }
}
