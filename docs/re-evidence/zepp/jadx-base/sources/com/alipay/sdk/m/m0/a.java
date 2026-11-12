package com.alipay.sdk.m.m0;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.sdk.m.l0.f;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public String a;
    public SharedPreferences b;
    public SharedPreferences.Editor c = null;
    public Context d;
    public boolean e;

    public a(Context context, String str, String str2, boolean z, boolean z2) {
        this.a = "";
        this.b = null;
        this.d = null;
        this.e = false;
        this.e = z2;
        this.a = str2;
        this.d = context;
        if (context != null) {
            this.b = context.getSharedPreferences(str2, 0);
        }
    }

    private void b() {
        SharedPreferences sharedPreferences;
        if (this.c != null || (sharedPreferences = this.b) == null) {
            return;
        }
        this.c = sharedPreferences.edit();
    }

    public void a(String str, String str2) {
        if (f.m3276a(str) || str.equals("t")) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.c;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }

    public void b(String str) {
        if (f.m3276a(str) || str.equals("t")) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.c;
        if (editor != null) {
            editor.remove(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    public boolean a() {
        boolean z;
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.c;
        if (editor == null) {
            z = true;
        } else {
            if (!this.e && this.b != null) {
                editor.putLong("t", jCurrentTimeMillis);
            }
            if (this.c.commit()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.b != null && (context = this.d) != null) {
            this.b = context.getSharedPreferences(this.a, 0);
        }
        return z;
    }

    public String a(String str) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!f.m3276a(string)) {
                return string;
            }
        }
        return "";
    }
}
