package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.push.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class bas {
    public static volatile bas e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f3996b;
    public Map<String, a> c;
    public String d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3998b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public boolean i = true;
        public boolean j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f3999k = 1;
        public Context l;

        public a(Context context) {
            this.l = context;
        }

        public static String b(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(q.f13858b, aVar.f3997a);
                jSONObject.put("appToken", aVar.f3998b);
                jSONObject.put("regId", aVar.c);
                jSONObject.put("regSec", aVar.d);
                jSONObject.put(DevInfoKeys.DEVICEID, aVar.f);
                jSONObject.put("vName", aVar.e);
                jSONObject.put(TSMAuthContants.PARAM_VALID, aVar.i);
                jSONObject.put("paused", aVar.j);
                jSONObject.put("envType", aVar.f3999k);
                jSONObject.put("regResource", aVar.g);
                return jSONObject.toString();
            } catch (Throwable th) {
                x9s.s(th);
                return null;
            }
        }

        public final String a() {
            Context context = this.l;
            return g.h(context, context.getPackageName());
        }

        public void c() {
            bas.b(this.l).edit().clear().commit();
            this.f3997a = null;
            this.f3998b = null;
            this.c = null;
            this.d = null;
            this.f = null;
            this.e = null;
            this.i = false;
            this.j = false;
            this.h = null;
            this.f3999k = 1;
        }

        public void d(int i) {
            this.f3999k = i;
        }

        public void e(String str, String str2) {
            this.c = str;
            this.d = str2;
            this.f = lzs.A(this.l);
            this.e = a();
            this.i = true;
        }

        public void f(String str, String str2, String str3) {
            this.f3997a = str;
            this.f3998b = str2;
            this.g = str3;
            SharedPreferences.Editor editorEdit = bas.b(this.l).edit();
            editorEdit.putString(q.f13858b, this.f3997a);
            editorEdit.putString("appToken", str2);
            editorEdit.putString("regResource", str3);
            editorEdit.commit();
        }

        public void g(boolean z) {
            this.j = z;
        }

        public boolean h() {
            return i(this.f3997a, this.f3998b);
        }

        public boolean i(String str, String str2) {
            boolean zEquals = TextUtils.equals(this.f3997a, str);
            boolean zEquals2 = TextUtils.equals(this.f3998b, str2);
            boolean z = !TextUtils.isEmpty(this.c);
            boolean z2 = !TextUtils.isEmpty(this.d);
            boolean z3 = TextUtils.isEmpty(lzs.p(this.l)) || TextUtils.equals(this.f, lzs.A(this.l)) || TextUtils.equals(this.f, lzs.z(this.l));
            boolean z4 = zEquals && zEquals2 && z && z2 && z3;
            if (!z4) {
                x9s.E(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", Boolean.valueOf(zEquals), Boolean.valueOf(zEquals2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
            }
            return z4;
        }

        public void j() {
            this.i = false;
            bas.b(this.l).edit().putBoolean(TSMAuthContants.PARAM_VALID, this.i).commit();
        }

        public void k(String str, String str2, String str3) {
            this.c = str;
            this.d = str2;
            this.f = lzs.A(this.l);
            this.e = a();
            this.i = true;
            this.h = str3;
            SharedPreferences.Editor editorEdit = bas.b(this.l).edit();
            editorEdit.putString("regId", str);
            editorEdit.putString("regSec", str2);
            editorEdit.putString(DevInfoKeys.DEVICEID, this.f);
            editorEdit.putString("vName", a());
            editorEdit.putBoolean(TSMAuthContants.PARAM_VALID, true);
            editorEdit.putString("appRegion", str3);
            editorEdit.commit();
        }
    }

    public bas(Context context) {
        this.f3995a = context;
        r();
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    public static bas c(Context context) {
        if (e == null) {
            synchronized (bas.class) {
                try {
                    if (e == null) {
                        e = new bas(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public int a() {
        return this.f3996b.f3999k;
    }

    public String d() {
        return this.f3996b.f3997a;
    }

    public void e() {
        this.f3996b.c();
    }

    public void f(int i) {
        this.f3996b.d(i);
        b(this.f3995a).edit().putInt("envType", i).commit();
    }

    public void g(String str) {
        SharedPreferences.Editor editorEdit = b(this.f3995a).edit();
        editorEdit.putString("vName", str);
        editorEdit.commit();
        this.f3996b.e = str;
    }

    public void h(String str, a aVar) {
        this.c.put(str, aVar);
        b(this.f3995a).edit().putString("hybrid_app_info_" + str, a.b(aVar)).commit();
    }

    public void i(String str, String str2, String str3) {
        this.f3996b.f(str, str2, str3);
    }

    public void j(boolean z) {
        this.f3996b.g(z);
        b(this.f3995a).edit().putBoolean("paused", z).commit();
    }

    public boolean k() {
        Context context = this.f3995a;
        return !TextUtils.equals(g.h(context, context.getPackageName()), this.f3996b.e);
    }

    public boolean l(String str, String str2) {
        return this.f3996b.i(str, str2);
    }

    public String m() {
        return this.f3996b.f3998b;
    }

    public void n() {
        this.f3996b.j();
    }

    public void o(String str, String str2, String str3) {
        this.f3996b.k(str, str2, str3);
    }

    public boolean p() {
        if (this.f3996b.h()) {
            return true;
        }
        x9s.o("Don't send message before initialization succeeded!");
        return false;
    }

    public String q() {
        return this.f3996b.c;
    }

    public final void r() {
        this.f3996b = new a(this.f3995a);
        this.c = new HashMap();
        SharedPreferences sharedPreferencesB = b(this.f3995a);
        this.f3996b.f3997a = sharedPreferencesB.getString(q.f13858b, null);
        this.f3996b.f3998b = sharedPreferencesB.getString("appToken", null);
        this.f3996b.c = sharedPreferencesB.getString("regId", null);
        this.f3996b.d = sharedPreferencesB.getString("regSec", null);
        this.f3996b.f = sharedPreferencesB.getString(DevInfoKeys.DEVICEID, null);
        if (!TextUtils.isEmpty(this.f3996b.f) && lzs.m(this.f3996b.f)) {
            this.f3996b.f = lzs.A(this.f3995a);
            sharedPreferencesB.edit().putString(DevInfoKeys.DEVICEID, this.f3996b.f).commit();
        }
        this.f3996b.e = sharedPreferencesB.getString("vName", null);
        this.f3996b.i = sharedPreferencesB.getBoolean(TSMAuthContants.PARAM_VALID, true);
        this.f3996b.j = sharedPreferencesB.getBoolean("paused", false);
        this.f3996b.f3999k = sharedPreferencesB.getInt("envType", 1);
        this.f3996b.g = sharedPreferencesB.getString("regResource", null);
        this.f3996b.h = sharedPreferencesB.getString("appRegion", null);
    }

    public boolean s() {
        return this.f3996b.h();
    }

    public String t() {
        return this.f3996b.d;
    }

    public boolean u() {
        return (TextUtils.isEmpty(this.f3996b.f3997a) || TextUtils.isEmpty(this.f3996b.f3998b) || TextUtils.isEmpty(this.f3996b.c) || TextUtils.isEmpty(this.f3996b.d)) ? false : true;
    }

    public String v() {
        return this.f3996b.g;
    }

    public boolean w() {
        return this.f3996b.j;
    }

    public String x() {
        return this.f3996b.h;
    }

    public boolean y() {
        return !this.f3996b.i;
    }
}
