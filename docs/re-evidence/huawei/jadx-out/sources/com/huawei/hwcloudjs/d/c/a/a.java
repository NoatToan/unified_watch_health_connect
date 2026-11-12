package com.huawei.hwcloudjs.d.c.a;

import android.content.SharedPreferences;
import com.huawei.hwcloudjs.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f17090a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17091b = "SharedPreferencesStorage";

    public String c() {
        return com.huawei.hwcloudjs.b.a.a() != null ? com.huawei.hwcloudjs.b.a.a().getSharedPreferences(c.t, 0).getString(c.u, "") : "";
    }

    public void b(String str) {
        if (com.huawei.hwcloudjs.b.a.a() != null) {
            SharedPreferences.Editor editorEdit = com.huawei.hwcloudjs.b.a.a().getSharedPreferences(c.t, 0).edit();
            editorEdit.putString(c.u, str);
            editorEdit.commit();
        }
    }

    public boolean a(String str) {
        if (com.huawei.hwcloudjs.b.a.a() != null) {
            return com.huawei.hwcloudjs.b.a.a().getSharedPreferences(c.t, 0).getBoolean(str, false);
        }
        return false;
    }

    public void a(String str, boolean z) {
        if (com.huawei.hwcloudjs.b.a.a() != null) {
            SharedPreferences.Editor editorEdit = com.huawei.hwcloudjs.b.a.a().getSharedPreferences(c.t, 0).edit();
            editorEdit.putBoolean(str, z);
            editorEdit.commit();
        }
    }

    public void a() {
        if (com.huawei.hwcloudjs.b.a.a() != null) {
            com.huawei.hwcloudjs.b.a.a().getSharedPreferences(c.t, 0).edit().clear().commit();
        }
    }

    public static a b() {
        a aVar;
        synchronized (a.class) {
            if (f17090a == null) {
                f17090a = new a();
            }
            aVar = f17090a;
        }
        return aVar;
    }

    private a() {
    }
}
