package defpackage;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class j7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<SharedPreferences.OnSharedPreferenceChangeListener> f22500a = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SuppressLint({"StaticFieldLeak"})
        public static final j7m f22501a = new j7m();
    }

    public static j7m a() {
        return a.f22501a;
    }

    public static void registerOnSharePreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        f22500a.add(onSharedPreferenceChangeListener);
    }

    public static void unregisterOnSharePreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        f22500a.remove(onSharedPreferenceChangeListener);
    }

    public int b(String str, int i) {
        return c("app_pref", str, i);
    }

    public int c(String str, String str2, int i) {
        return d(str).getInt(str2, i);
    }

    public final SharedPreferences d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "app_pref";
        }
        MMKV mmkvG = MMKV.G(str, 2);
        if (!mmkvG.d("imported_shareprefence", false)) {
            SharedPreferences sharedPreferences = AppUtil.getApp().getSharedPreferences(str, 0);
            mmkvG.y(sharedPreferences);
            mmkvG.w("imported_shareprefence", true);
            sharedPreferences.edit().clear().apply();
        }
        return mmkvG;
    }

    public SharedPreferences.Editor e(String str) {
        return d(str).edit();
    }

    public void f(String str, int i) {
        g("app_pref", str, i);
    }

    public void g(String str, String str2, int i) {
        e(str).putInt(str2, i).apply();
    }

    public j7m() {
    }
}
