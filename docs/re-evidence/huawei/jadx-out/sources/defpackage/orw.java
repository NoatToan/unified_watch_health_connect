package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class orw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<String, SharedPreferences> f44626c = new ConcurrentHashMap<>();

    private static SharedPreferences c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            ork.b("SpUtils", "getSharedPreferences sharedFile is null.");
            return null;
        }
        ConcurrentHashMap<String, SharedPreferences> concurrentHashMap = f44626c;
        SharedPreferences sharedPreferences = concurrentHashMap.get(str);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = b(context).getSharedPreferences(str, 0);
        if (sharedPreferences2 != null) {
            concurrentHashMap.put(str, sharedPreferences2);
        }
        return sharedPreferences2;
    }

    private static Context b(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    public static String c(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferencesC = c(context, str3);
        if (sharedPreferencesC == null) {
            ork.b("SpUtils", "get key:" + str + " from " + str3 + " error. SharedPreferences is null.");
            return str2;
        }
        return sharedPreferencesC.getString(str, str2);
    }

    public static void d(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferencesC = c(context, str3);
        if (sharedPreferencesC == null) {
            ork.b("SpUtils", "put key:" + str + " into " + str3 + " error. SharedPreferences is null.");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
