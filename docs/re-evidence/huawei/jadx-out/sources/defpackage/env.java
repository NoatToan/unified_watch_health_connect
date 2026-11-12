package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public class env {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f33245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33246c;

    public env(Context context, String str) {
        this.f33246c = str;
        this.f33245b = context;
    }

    public String e(String str) {
        Context context = this.f33245b;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(this.f33246c, 0);
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getString(str, "0");
            }
        }
        return "0";
    }

    public boolean a(String str) {
        Context context = this.f33245b;
        if (context == null) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.f33246c, 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, false);
        }
        return false;
    }
}
