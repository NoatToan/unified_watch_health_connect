package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class tfs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile tfs f34659b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34660a;

    public tfs(Context context) {
        this.f34660a = context;
    }

    public static tfs b(Context context) {
        if (f34659b == null) {
            synchronized (tfs.class) {
                try {
                    if (f34659b == null) {
                        f34659b = new tfs(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f34659b;
    }

    public synchronized long a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f34660a.getSharedPreferences(str, 4).getLong(str2, j);
    }

    public synchronized String c(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f34660a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    public synchronized void d(String str, String str2, long j) {
        SharedPreferences.Editor editorEdit = this.f34660a.getSharedPreferences(str, 4).edit();
        editorEdit.putLong(str2, j);
        editorEdit.commit();
    }

    public synchronized void e(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = this.f34660a.getSharedPreferences(str, 4).edit();
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }
}
