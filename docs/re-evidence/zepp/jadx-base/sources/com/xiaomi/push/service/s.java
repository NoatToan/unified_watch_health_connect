package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.ad;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class s {
    private static s e;
    private Context a;
    private List<String> b = new ArrayList();
    private final List<String> c = new ArrayList();
    private final List<String> d = new ArrayList();

    private s(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        if (applicationContext == null) {
            this.a = context;
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(",")) {
            if (TextUtils.isEmpty(str)) {
                this.b.add(str);
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

    public static s a(Context context) {
        if (e == null) {
            e = new s(context);
        }
        return e;
    }

    public void a(String str) {
        synchronized (this.b) {
            if (!this.b.contains(str)) {
                this.b.add(str);
                this.a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", ad.a(this.b, ",")).commit();
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3837a(String str) {
        boolean zContains;
        synchronized (this.b) {
            zContains = this.b.contains(str);
        }
        return zContains;
    }

    public void b(String str) {
        synchronized (this.c) {
            if (!this.c.contains(str)) {
                this.c.add(str);
                this.a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", ad.a(this.c, ",")).commit();
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3838b(String str) {
        boolean zContains;
        synchronized (this.c) {
            zContains = this.c.contains(str);
        }
        return zContains;
    }

    public void c(String str) {
        synchronized (this.d) {
            if (!this.d.contains(str)) {
                this.d.add(str);
                this.a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", ad.a(this.d, ",")).commit();
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3839c(String str) {
        boolean zContains;
        synchronized (this.d) {
            zContains = this.d.contains(str);
        }
        return zContains;
    }

    public void d(String str) {
        synchronized (this.b) {
            if (this.b.contains(str)) {
                this.b.remove(str);
                this.a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", ad.a(this.b, ",")).commit();
            }
        }
    }

    public void e(String str) {
        synchronized (this.c) {
            if (this.c.contains(str)) {
                this.c.remove(str);
                this.a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", ad.a(this.c, ",")).commit();
            }
        }
    }

    public void f(String str) {
        synchronized (this.d) {
            if (this.d.contains(str)) {
                this.d.remove(str);
                this.a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", ad.a(this.d, ",")).commit();
            }
        }
    }
}
