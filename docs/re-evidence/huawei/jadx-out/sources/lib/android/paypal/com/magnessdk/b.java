package lib.android.paypal.com.magnessdk;

import android.content.Context;
import defpackage.znm;
import java.io.File;
import lib.android.paypal.com.magnessdk.log.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f40196a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f40197b = "_TIME";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f40198c = "_DATA";

    protected abstract JSONObject a();

    protected abstract void a(JSONObject jSONObject);

    protected abstract JSONObject b();

    protected abstract JSONObject c();

    protected abstract String d();

    public String b(Context context, String str) {
        a.e(getClass(), 0, "Loading loadCachedConfigTime");
        return znm.a(new File(context.getFilesDir(), str + f40197b));
    }

    public static boolean c(Context context, String str) {
        a.e((Class<?>) b.class, 0, "entering deleteCachedConfigDataFromDisk");
        File file = new File(context.getFilesDir(), str + f40198c);
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f40197b);
        return znm.c(file) && znm.c(new File(filesDir, sb.toString()));
    }

    public static boolean a(JSONObject jSONObject, long j, c.EnumC0335c enumC0335c) {
        String string;
        if (enumC0335c == c.EnumC0335c.RAMP) {
            string = c.i.CONF_REFRESH_TIME_KEY.toString();
        } else {
            string = enumC0335c == c.EnumC0335c.REMOTE ? c.j.CONF_REFRESH_TIME_KEY.toString() : "";
        }
        return System.currentTimeMillis() > j + (jSONObject.optLong(string, 0L) * 1000);
    }

    public static void a(Context context, String str, String str2) throws Throwable {
        a.e((Class<?>) b.class, 0, "entering saveConfigData");
        File file = new File(context.getFilesDir(), str2 + f40198c);
        File file2 = new File(context.getFilesDir(), str2 + f40197b);
        znm.a(file, str);
        znm.a(file2, String.valueOf(System.currentTimeMillis()));
    }

    public static JSONObject a(String str, Context context) {
        a.e((Class<?>) b.class, 0, "entering getCachedConfig");
        try {
            String strA = a(context, str);
            if (strA.isEmpty()) {
                a.e((Class<?>) b.class, 0, "leaving getCachedConfig,cached config loaded empty");
                return null;
            }
            a.e((Class<?>) b.class, 0, "leaving getCachedConfig,cached config loadsuccessfully");
            return new JSONObject(strA);
        } catch (Exception e) {
            a.e((Class<?>) b.class, 3, e);
            return null;
        }
    }

    protected static String a(Context context, String str) {
        a.e((Class<?>) b.class, 0, "Loading loadCachedConfigData");
        return znm.a(new File(context.getFilesDir(), str + f40198c));
    }
}
