package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class a {
    private static volatile a e;
    private Context a;
    private C1043a b;
    private Map<String, C1043a> c;
    public String d;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.a$a, reason: collision with other inner class name */
    public static class C1043a {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public String f33a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        private Context i;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public boolean f34a = true;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        public boolean f35b = false;
        public int a = 1;

        public C1043a(Context context) {
            this.i = context;
        }

        public static C1043a a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C1043a c1043a = new C1043a(context);
                c1043a.f33a = jSONObject.getString("appId");
                c1043a.b = jSONObject.getString("appToken");
                c1043a.c = jSONObject.getString("regId");
                c1043a.d = jSONObject.getString("regSec");
                c1043a.f = jSONObject.getString("devId");
                c1043a.e = jSONObject.getString("vName");
                c1043a.f34a = jSONObject.getBoolean("valid");
                c1043a.f35b = jSONObject.getBoolean(com.squareup.picasso.u.F);
                c1043a.a = jSONObject.getInt("envType");
                c1043a.g = jSONObject.getString("regResource");
                return c1043a;
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a(th);
                return null;
            }
        }

        public static String a(C1043a c1043a) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", c1043a.f33a);
                jSONObject.put("appToken", c1043a.b);
                jSONObject.put("regId", c1043a.c);
                jSONObject.put("regSec", c1043a.d);
                jSONObject.put("devId", c1043a.f);
                jSONObject.put("vName", c1043a.e);
                jSONObject.put("valid", c1043a.f34a);
                jSONObject.put(com.squareup.picasso.u.F, c1043a.f35b);
                jSONObject.put("envType", c1043a.a);
                jSONObject.put("regResource", c1043a.g);
                return jSONObject.toString();
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.a(th);
                return null;
            }
        }

        private String c() {
            Context context = this.i;
            return com.xiaomi.channel.commonutils.android.a.m3417a(context, context.getPackageName());
        }

        public void a() {
            a.a(this.i).edit().clear().commit();
            this.f33a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.f = null;
            this.e = null;
            this.f34a = false;
            this.f35b = false;
            this.h = null;
            this.a = 1;
        }

        public void a(int i) {
            this.a = i;
        }

        public void a(String str, String str2) {
            this.c = str;
            this.d = str2;
            this.f = com.xiaomi.channel.commonutils.android.c.e(this.i);
            this.e = c();
            this.f34a = true;
        }

        public void a(String str, String str2, String str3) {
            this.f33a = str;
            this.b = str2;
            this.g = str3;
            SharedPreferences.Editor editorEdit = a.a(this.i).edit();
            editorEdit.putString("appId", this.f33a);
            editorEdit.putString("appToken", str2);
            editorEdit.putString("regResource", str3);
            editorEdit.commit();
        }

        public void a(boolean z) {
            this.f35b = z;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3469a() {
            return m3470a(this.f33a, this.b);
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m3470a(String str, String str2) {
            boolean zEquals = TextUtils.equals(this.f33a, str);
            boolean zEquals2 = TextUtils.equals(this.b, str2);
            boolean z = !TextUtils.isEmpty(this.c);
            boolean z2 = !TextUtils.isEmpty(this.d);
            boolean z3 = TextUtils.equals(this.f, com.xiaomi.channel.commonutils.android.c.e(this.i)) || TextUtils.equals(this.f, com.xiaomi.channel.commonutils.android.c.d(this.i));
            boolean z4 = zEquals && zEquals2 && z && z2 && z3;
            if (!z4) {
                com.xiaomi.channel.commonutils.logger.b.e(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", Boolean.valueOf(zEquals), Boolean.valueOf(zEquals2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
            }
            return z4;
        }

        public void b() {
            this.f34a = false;
            a.a(this.i).edit().putBoolean("valid", this.f34a).commit();
        }

        public void b(String str, String str2, String str3) {
            this.c = str;
            this.d = str2;
            this.f = com.xiaomi.channel.commonutils.android.c.e(this.i);
            this.e = c();
            this.f34a = true;
            this.h = str3;
            SharedPreferences.Editor editorEdit = a.a(this.i).edit();
            editorEdit.putString("regId", str);
            editorEdit.putString("regSec", str2);
            editorEdit.putString("devId", this.f);
            editorEdit.putString("vName", c());
            editorEdit.putBoolean("valid", true);
            editorEdit.putString("appRegion", str3);
            editorEdit.commit();
        }

        public void c(String str, String str2, String str3) {
            this.f33a = str;
            this.b = str2;
            this.g = str3;
        }
    }

    private a(Context context) {
        this.a = context;
        g();
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static a m3457a(Context context) {
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a(context);
                }
            }
        }
        return e;
    }

    private void g() {
        this.b = new C1043a(this.a);
        this.c = new HashMap();
        SharedPreferences sharedPreferencesA = a(this.a);
        this.b.f33a = sharedPreferencesA.getString("appId", null);
        this.b.b = sharedPreferencesA.getString("appToken", null);
        this.b.c = sharedPreferencesA.getString("regId", null);
        this.b.d = sharedPreferencesA.getString("regSec", null);
        this.b.f = sharedPreferencesA.getString("devId", null);
        if (!TextUtils.isEmpty(this.b.f) && com.xiaomi.channel.commonutils.android.c.a(this.b.f)) {
            this.b.f = com.xiaomi.channel.commonutils.android.c.e(this.a);
            sharedPreferencesA.edit().putString("devId", this.b.f).commit();
        }
        this.b.e = sharedPreferencesA.getString("vName", null);
        this.b.f34a = sharedPreferencesA.getBoolean("valid", true);
        this.b.f35b = sharedPreferencesA.getBoolean(com.squareup.picasso.u.F, false);
        this.b.a = sharedPreferencesA.getInt("envType", 1);
        this.b.g = sharedPreferencesA.getString("regResource", null);
        this.b.h = sharedPreferencesA.getString("appRegion", null);
    }

    public int a() {
        return this.b.a;
    }

    public C1043a a(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences sharedPreferencesA = a(this.a);
        if (!sharedPreferencesA.contains(str2)) {
            return null;
        }
        C1043a c1043aA = C1043a.a(this.a, sharedPreferencesA.getString(str2, ""));
        this.c.put(str2, c1043aA);
        return c1043aA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3458a() {
        return this.b.f33a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3459a() {
        this.b.a();
    }

    public void a(int i) {
        this.b.a(i);
        a(this.a).edit().putInt("envType", i).commit();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3460a(String str) {
        SharedPreferences.Editor editorEdit = a(this.a).edit();
        editorEdit.putString("vName", str);
        editorEdit.commit();
        this.b.e = str;
    }

    public void a(String str, C1043a c1043a) {
        this.c.put(str, c1043a);
        a(this.a).edit().putString("hybrid_app_info_" + str, C1043a.a(c1043a)).commit();
    }

    public void a(String str, String str2, String str3) {
        this.b.a(str, str2, str3);
    }

    public void a(boolean z) {
        this.b.a(z);
        a(this.a).edit().putBoolean(com.squareup.picasso.u.F, z).commit();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3461a() {
        Context context = this.a;
        return !TextUtils.equals(com.xiaomi.channel.commonutils.android.a.m3417a(context, context.getPackageName()), this.b.e);
    }

    public boolean a(String str, String str2) {
        return this.b.m3470a(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3462a(String str, String str2, String str3) {
        C1043a c1043aA = a(str3);
        return c1043aA != null && TextUtils.equals(str, c1043aA.f33a) && TextUtils.equals(str2, c1043aA.b);
    }

    public String b() {
        return this.b.b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m3463b() {
        this.b.b();
    }

    public void b(String str) {
        this.c.remove(str);
        a(this.a).edit().remove("hybrid_app_info_" + str).commit();
    }

    public void b(String str, String str2, String str3) {
        this.b.b(str, str2, str3);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3464b() {
        if (this.b.m3469a()) {
            return true;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("Don't send message before initialization succeeded!");
        return false;
    }

    public String c() {
        return this.b.c;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3465c() {
        return this.b.m3469a();
    }

    public String d() {
        return this.b.d;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m3466d() {
        return (TextUtils.isEmpty(this.b.f33a) || TextUtils.isEmpty(this.b.b) || TextUtils.isEmpty(this.b.c) || TextUtils.isEmpty(this.b.d)) ? false : true;
    }

    public String e() {
        return this.b.g;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public boolean m3467e() {
        return this.b.f35b;
    }

    public String f() {
        return this.b.h;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public boolean m3468f() {
        return !this.b.f34a;
    }
}
