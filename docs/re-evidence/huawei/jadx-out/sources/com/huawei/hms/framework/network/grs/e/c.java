package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13289b = "c";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, PLSharedPreferences> f13290c = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PLSharedPreferences f13291a;

    public void b(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f13291a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f13291a.putString(str, str2);
        }
    }

    public void b() {
        PLSharedPreferences pLSharedPreferences = this.f13291a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f13291a.clear();
        }
    }

    public void a(String str) {
        PLSharedPreferences pLSharedPreferences = this.f13291a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f13291a.remove(str);
        }
    }

    public Map<String, ?> a() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f13291a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f13291a.getAll();
        }
        return all;
    }

    public String a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f13291a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f13291a.getString(str, str2);
        }
        return string;
    }

    private void a(Context context) {
        String str = f13289b;
        Logger.i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String string = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String strA = a("version", "");
            if (string.equals(strA)) {
                return;
            }
            Logger.i(str, "app version changed! old version{%s} and new version{%s}", strA, string);
            b();
            b("version", string);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w(f13289b, "get app version failed and catch NameNotFoundException");
        }
    }

    public c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.d(f13289b, "get pkgname from context is{%s}", packageName);
        Map<String, PLSharedPreferences> map = f13290c;
        if (map.containsKey(str + packageName)) {
            this.f13291a = map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, str + packageName);
            this.f13291a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        a(context);
    }
}
