package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes20.dex */
public final class xmo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile xmo f53164b;
    private static final byte[] d = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f53165a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53166c;
    private Context e;

    private xmo(Context context) {
        this.f53165a = null;
        this.e = context;
        if (context != null) {
            this.f53166c = "swipecard_wallet_account";
            this.f53165a = context.getSharedPreferences("swipecard_wallet_account", 0);
        }
    }

    public static xmo e(Context context) {
        if (f53164b == null) {
            synchronized (d) {
                if (f53164b == null) {
                    f53164b = new xmo(context.getApplicationContext());
                }
            }
        }
        return f53164b;
    }

    public boolean e(String str, String str2) {
        if (this.f53165a == null) {
            return false;
        }
        if ("user_id".equals(str)) {
            xnd.a("AccountPref", "putString key is userid");
            return false;
        }
        if ("last_user_id".equals(str)) {
            xnd.a("AccountPref", "putString key is userid");
            return false;
        }
        xmn.e().a(this.e, this.f53166c, str, str2);
        return this.f53165a.edit().putString(str, str2).commit();
    }

    public String a(String str, String str2) {
        if (this.f53165a == null) {
            return str2;
        }
        if ("user_id".equals(str)) {
            xnd.a("AccountPref", "getString key is userid");
            return "";
        }
        if ("last_user_id".equals(str)) {
            xnd.a("AccountPref", "getString key is userid");
            return "";
        }
        return this.f53165a.getString(str, str2);
    }
}
