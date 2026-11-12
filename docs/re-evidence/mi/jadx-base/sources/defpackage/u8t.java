package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class u8t {
    public static volatile u8t d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f35534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f35535b = new Handler(Looper.getMainLooper());
    public Map<String, Map<String, String>> c = new HashMap();

    public u8t(Context context) {
        this.f35534a = context;
    }

    public static u8t d(Context context) {
        if (d == null) {
            synchronized (u8t.class) {
                try {
                    if (d == null) {
                        d = new u8t(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final synchronized String b(String str, String str2) {
        if (this.c == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Map<String, String> map = this.c.get(str);
            if (map == null) {
                return "";
            }
            return map.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public synchronized String c(String str, String str2, String str3) {
        String strB = b(str, str2);
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        return this.f35534a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    public synchronized void e(String str, String str2, String str3) {
        f(str, str2, str3);
        this.f35535b.post(new rbt(this, str, str2, str3));
    }

    public final synchronized void f(String str, String str2, String str3) {
        try {
            if (this.c == null) {
                this.c = new HashMap();
            }
            Map<String, String> map = this.c.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, str3);
            this.c.put(str, map);
        } catch (Throwable th) {
            throw th;
        }
    }
}
