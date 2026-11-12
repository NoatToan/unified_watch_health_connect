package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class bib {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile bib f1118c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f1120b;
    private long e;

    public long j() {
        return this.e;
    }

    public String b() {
        return this.f1119a;
    }

    public long d() {
        try {
            return this.f1120b.getLong("providerUpdateTime", 0L);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String e() {
        return this.f1120b.getString("homeCountryInProvider", null);
    }

    public void e(String str) {
        this.f1119a = str;
        this.e = str != null ? System.currentTimeMillis() : 0L;
    }

    public long a() {
        try {
            return this.f1120b.getLong("effectiveduration", 47839000L);
        } catch (Exception unused) {
            return 47839000L;
        }
    }

    public void c(String str) {
        try {
            this.f1120b.edit().putString("homeCountryInProvider", str).commit();
            this.f1120b.edit().putLong("providerUpdateTime", System.currentTimeMillis()).commit();
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "setHomeCountryInProvider, putString error");
        }
    }

    public void d(long j) {
        try {
            this.f1120b.edit().putLong("effectiveduration", j).commit();
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "setEffectiveDuration, putLong error");
        }
    }

    public void c() {
        try {
            SharedPreferences.Editor editorEdit = this.f1120b.edit();
            editorEdit.clear();
            editorEdit.commit();
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "clear error");
        }
    }

    public static bib b(Context context) {
        if (f1118c == null) {
            synchronized (d) {
                if (f1118c == null) {
                    f1118c = new bib(context);
                }
            }
        }
        return f1118c;
    }

    private bib(Context context) {
        try {
            this.f1120b = context.createDeviceProtectedStorageContext().getSharedPreferences("MarketHomeCountry.DataStorage", 0);
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "getSharedPreference error");
        }
    }
}
