package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes20.dex */
public final class xnv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile xnv f53215a;
    private static final byte[] e = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f53216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f53217c;
    private String d = "NFC_Properties";

    private xnv(Context context) {
        this.f53216b = null;
        this.f53217c = context;
        this.f53216b = context.getSharedPreferences("NFC_Properties", 0);
    }

    public static xnv e(Context context) {
        if (f53215a == null) {
            synchronized (e) {
                if (f53215a == null) {
                    f53215a = new xnv(context.getApplicationContext());
                }
            }
        }
        return f53215a;
    }

    public String b(String str, String str2) {
        return this.f53216b.getString(str, str2);
    }

    public int c(String str, int i) {
        return this.f53216b.getInt(str, i);
    }

    public Long c(String str, Long l) {
        return Long.valueOf(this.f53216b.getLong(str, l.longValue()));
    }

    public boolean a(String str, Long l) {
        xmn.e().a(this.f53217c, this.d, str, l);
        return this.f53216b.edit().putLong(str, l.longValue()).commit();
    }

    public boolean e(String str, String str2) {
        xmn.e().a(this.f53217c, this.d, str, str2);
        return this.f53216b.edit().putString(str, str2).commit();
    }

    public boolean e(String str, int i) {
        xmn.e().a(this.f53217c, this.d, str, Integer.valueOf(i));
        return this.f53216b.edit().putInt(str, i).commit();
    }

    public boolean e(String str) {
        return this.f53216b.contains(str);
    }

    public boolean c(String str) {
        xmn.e().a(this.f53217c, this.d, str);
        return this.f53216b.edit().remove(str).commit();
    }
}
