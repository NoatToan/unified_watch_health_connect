package defpackage;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes10.dex */
public class m7m {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SuppressLint({"StaticFieldLeak"})
        public static final m7m f25847a = new m7m();
    }

    public static m7m a() {
        return a.f25847a;
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

    public m7m() {
    }
}
