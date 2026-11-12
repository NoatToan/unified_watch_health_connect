package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ngt {
    public static ngt e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f27920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f27921b = new ArrayList();
    public final List<String> c = new ArrayList();
    public final List<String> d = new ArrayList();

    public ngt(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f27920a = applicationContext;
        if (applicationContext == null) {
            this.f27920a = context;
        }
        SharedPreferences sharedPreferences = this.f27920a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(",")) {
            if (TextUtils.isEmpty(str)) {
                this.f27921b.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                this.c.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(",")) {
            if (!TextUtils.isEmpty(str3)) {
                this.d.add(str3);
            }
        }
    }

    public static ngt a(Context context) {
        if (e == null) {
            e = new ngt(context);
        }
        return e;
    }

    public void b(String str) {
        synchronized (this.f27921b) {
            try {
                if (!this.f27921b.contains(str)) {
                    this.f27921b.add(str);
                    this.f27920a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", qcs.d(this.f27921b, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        boolean zContains;
        synchronized (this.f27921b) {
            zContains = this.f27921b.contains(str);
        }
        return zContains;
    }

    public void d(String str) {
        synchronized (this.c) {
            try {
                if (!this.c.contains(str)) {
                    this.c.add(str);
                    this.f27920a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", qcs.d(this.c, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(String str) {
        boolean zContains;
        synchronized (this.c) {
            zContains = this.c.contains(str);
        }
        return zContains;
    }

    public void f(String str) {
        synchronized (this.d) {
            try {
                if (!this.d.contains(str)) {
                    this.d.add(str);
                    this.f27920a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", qcs.d(this.d, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g(String str) {
        boolean zContains;
        synchronized (this.d) {
            zContains = this.d.contains(str);
        }
        return zContains;
    }

    public void h(String str) {
        synchronized (this.f27921b) {
            try {
                if (this.f27921b.contains(str)) {
                    this.f27921b.remove(str);
                    this.f27920a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", qcs.d(this.f27921b, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(String str) {
        synchronized (this.c) {
            try {
                if (this.c.contains(str)) {
                    this.c.remove(str);
                    this.f27920a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", qcs.d(this.c, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(String str) {
        synchronized (this.d) {
            try {
                if (this.d.contains(str)) {
                    this.d.remove(str);
                    this.f27920a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", qcs.d(this.d, ",")).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
